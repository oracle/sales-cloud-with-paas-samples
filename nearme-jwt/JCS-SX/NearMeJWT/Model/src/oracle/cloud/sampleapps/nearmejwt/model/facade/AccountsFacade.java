/* Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved */
package oracle.cloud.sampleapps.nearmejwt.model.facade;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import oracle.cloud.sampleapps.nearmejwt.model.util.AccountServiceUtil;
import oracle.cloud.sampleapps.nearmejwt.model.util.JSFUtils;
import oracle.cloud.sampleapps.nearmejwt.proxy.AccountService;
import oracle.cloud.sampleapps.nearmejwt.types.Account;
import oracle.cloud.sampleapps.nearmejwt.types.DataObjectResult;
import oracle.cloud.sampleapps.nearmejwt.types.FindControl;
import oracle.cloud.sampleapps.nearmejwt.types.FindCriteria;
import oracle.cloud.sampleapps.nearmejwt.types.PrimaryAddress;


public class AccountsFacade {
    
    private BigDecimal latitude;
    private BigDecimal longitude;
    private BigDecimal minLatitude;
    private BigDecimal maxLatitude;
    private BigDecimal minLongitude;
    private BigDecimal maxLongitude;
    private String acctId;
    private DataObjectResult resp;
    private List<AccountDisplay> accountDisps = new ArrayList<AccountDisplay>();
    private static double MILESRADIUS = 10.000;
    
    public AccountsFacade() {
        super();
        // get parameters for building FindCriteria
        acctId = JSFUtils.resolveExpressionAsString("#{pageFlowScope.acctid}");
        String latStr =
            JSFUtils.resolveExpressionAsString("#{pageFlowScope.lat}");
        String longStr =
            JSFUtils.resolveExpressionAsString("#{pageFlowScope.long}");
        // check for number format in latitude and longitude
        if (AccountServiceUtil.isNumber(latStr) &&
            AccountServiceUtil.isNumber(longStr)) {
            latitude = new BigDecimal(latStr);
            longitude = new BigDecimal(longStr);
            // call service and populate values in Constructor
            AccountService svc = null;
            try {
                svc = AccountServiceUtil.createAccountSoapService();
                if (svc != null) {
                    System.out.println("Service created");
                }
                // calculate min & max latitude and longitude
                // 1 degree latitude == 69 miles
                double latConvert = MILESRADIUS / 69.000;
                this.minLatitude =
                        latitude.subtract(new BigDecimal(latConvert));
                this.maxLatitude = latitude.add(new BigDecimal(latConvert));
                // longitude is not as easy
                // calculate multiplier for 1 degree longitude at this latitude
                double longConvert = java.lang.Math.abs(
                    java.lang.Math.cos(latitude.doubleValue()) * latConvert);
                this.minLongitude =
                    longitude.subtract(new BigDecimal(longConvert));
                this.maxLongitude =
                    longitude.add(new BigDecimal(longConvert));
                System.out.println("Lat Convert value is " + latConvert);
                System.out.println("Long convert value is " + longConvert);
                System.out.println("Account ID input is " + acctId);
                System.out.println("Latitude input is " + latitude);
                System.out.println("Longitude input is " + longitude);
                System.out.println("Min Latitude is " + minLatitude);
                System.out.println("Max Latitude is " + maxLatitude);
                System.out.println("Min Longitude is " + minLongitude);
                System.out.println("Max Longitude is " + maxLongitude);

                FindCriteria findCriteria =
                    AccountServiceUtil.buildFindCriteria(acctId, 
                                                         minLatitude,
                                                         maxLatitude,
                                                         minLongitude,
                                                         maxLongitude);
                FindControl findControl = new FindControl();
                findControl.setRetrieveAllTranslations(false);
                resp = svc.findAccount(findCriteria, findControl);
                List resps = resp.getValue();
                System.out.println("NearMeJWT: # accts returned: " +
                                   resps.size());
                for (Object obj : resps) {
                    Account acct = (Account)obj;
                    AccountDisplay acctDisp = new AccountDisplay();
                    acctDisp.setPartyId(acct.getPartyId());
                    acctDisp.setOrganizationName(acct.getOrganizationName());
                    acctDisp.setContactInfo(acct.getPrimaryContactName().getValue() +
                                            "<br>" +
                                            acct.getPrimaryContactPhone().getValue() +
                                            "<br>" +
                                            acct.getPrimaryContactEmail().getValue());
                    PrimaryAddress addr = acct.getPrimaryAddress();
                    if (addr != null) {
                        acctDisp.setFormattedMultiLineAddress(addr.getFormattedMultiLineAddress().getValue());
                        double latDeltaDegs =
                            java.lang.Math.abs((addr.getLatitude().getValue().subtract(latitude).doubleValue()));
                        double longDeltaDegs =
                            java.lang.Math.abs((addr.getLongitude().getValue().subtract(longitude).doubleValue()));
                        double latMiles = latDeltaDegs * 69.000;
                        double longMiles =
                            java.lang.Math.abs(longDeltaDegs / java.lang.Math.cos(latitude.doubleValue()) *
                                               69.000);
                        System.out.println("latDeltaDegs is " + latDeltaDegs);
                        System.out.println("longDeltaDegs is " +
                                           longDeltaDegs);
                        System.out.println("latMiles is " + latMiles);
                        System.out.println("longMiles is " + longMiles);
                        acctDisp.setMilesFromAcct(new Double(latMiles +
                                                             longMiles));
                    }
                    accountDisps.add(acctDisp);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Number format errors with latitude and/or longitude");
        }
    }

    public void setAccountDisps(List<AccountDisplay> accountDisps) {
        this.accountDisps = accountDisps;
    }

    public List<AccountDisplay> getAccountDisps() {
        return accountDisps;
    }
    
}
