/* Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved */
package oracle.cloud.sampleapps.nearmejwt.model.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;

import javax.xml.ws.handler.MessageContext;

import javax.naming.Context;

import javax.naming.NamingException;

import javax.xml.bind.JAXBElement;

import oracle.adf.model.connection.webservice.api.WebServiceConnection;
import oracle.adf.share.ADFContext;

import oracle.cloud.sampleapps.nearmejwt.proxy.AccountService;

import oracle.cloud.sampleapps.nearmejwt.proxy.AccountServiceSoapHttpPortClient;
import oracle.cloud.sampleapps.nearmejwt.proxy.AccountService_Service;

import oracle.cloud.sampleapps.nearmejwt.types.ChildFindCriteria;
import oracle.cloud.sampleapps.nearmejwt.types.Conjunction;
import oracle.cloud.sampleapps.nearmejwt.types.FindCriteria;

import oracle.cloud.sampleapps.nearmejwt.types.ViewCriteria;
import oracle.cloud.sampleapps.nearmejwt.types.ViewCriteriaItem;

import oracle.cloud.sampleapps.nearmejwt.types.ViewCriteriaRow;

import weblogic.wsee.jws.jaxws.owsm.SecurityPolicyFeature;

public class AccountServiceUtil {
    public AccountServiceUtil() {
        super();
    }
    
    // static util method
    
    public static AccountService createAccountSoapService() {
        
        AccountService_Service service_Service;
        AccountService service = null;

        // JWT requires no client policy (with this unpatched version of JDev)
        // TODO:  research patch that adds JWT client policy to OWSM on client side

        
        SecurityPolicyFeature[] secFeatures = new SecurityPolicyFeature[]
            {new SecurityPolicyFeature("")}; 
            //{ new SecurityPolicyFeature("oracle/wss_username_token_over_ssl_client_policy") };
        
        // get connection detail from connections.xml
        /* relying on connections.xml is not consistent with sample apps approach
        WebServiceConnection connection = null;
        try {
            Context adfContext = ADFContext.getCurrent().getConnectionsContext();
            connection = (WebServiceConnection) adfContext.lookup("AccountService");
        } catch (NamingException ne) {
            ne.printStackTrace();
        }
        service = connection.getJaxWSPort(AccountService.class);
        */
        service_Service = new AccountService_Service();
        service =
            service_Service.getAccountServiceSoapHttpPort(secFeatures);
        if (service == null) {
            System.out.println("NearMeJWT: AccountService is null");
        } else {
            System.out.println("NearMeJWT:  AccountService created.");
        }
        
        // trust keystore pointer for SSL
        
        // System.setProperty("javax.net.ssl.trustStore", "C:/JDev/security/default-keystore.jks");
        // System.setProperty("javax.net.ssl.keyStorePassword", "Welcome1");

        // instantiate service from web proxy
        /*
        service_Service = new AccountService_Service();
        service =
            service_Service.getAccountServiceSoapHttpPort(secFeatures);
        */
        // add credentials and keystore details

        String jwt = JSFUtils.resolveExpressionAsString("#{pageFlowScope.jwt}");
        System.out.println("NearMeJWT: jwt=" + jwt);
        
        // add JWT auth map to HTTP header
        
        /*
        BindingProvider bindprov = (BindingProvider)service;
        Map<String, Object> reqContext = bindprov.getRequestContext();
        reqContext.put("Authorization", new StringBuilder().append("Bearer ").append(jwt).toString());
        */
        BindingProvider bp = (BindingProvider)service;
        Map<String,List<String>> authMap=new HashMap<String,List<String>>();
        List<String> authZlist=new ArrayList<String>();
        authZlist.add(new StringBuilder().append("Bearer ").append(jwt).toString());
        authMap.put("Authorization",authZlist) ;

        bp.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS,authMap);

        return service;
        
    }
    
    public static FindCriteria buildFindCriteria(String acctId, Number minLatitude, Number maxLatitude, 
                                                 Number minLongitude, Number maxLongitude ) {
        
        //top level
        FindCriteria fc = new FindCriteria();
        ViewCriteria vc = new ViewCriteria();  // ViewCriteria = filter
        ViewCriteriaRow vcrPartyId = new ViewCriteriaRow();  // ViewCriteriaRow = group
        ViewCriteriaRow vcrLocation = new ViewCriteriaRow();
        
        //intermediate containers
        ViewCriteria vcNested = new ViewCriteria();
        ViewCriteriaItem vcItemPartyId = new ViewCriteriaItem();  // ViewCriteriaItem = item
        ViewCriteriaItem vcItemAddress = new ViewCriteriaItem();
        
        //lowest level -- nested filter elements
        ViewCriteriaItem vcItemLat = new ViewCriteriaItem();
        ViewCriteriaItem vcItemLong = new ViewCriteriaItem();
        ViewCriteriaRow vcrLat = new ViewCriteriaRow();
        ViewCriteriaRow vcrLong = new ViewCriteriaRow();

        // build the SOAP payload

        fc.setFetchSize(-1); // Get all records that meet criteria
        fc.setFetchStart(0); // Start at index 0
        // return only the attributes we need
        fc.getFindAttribute().add("PartyId");
        fc.getFindAttribute().add("OrganizationName");
        fc.getFindAttribute().add("PrimaryContactName");
        fc.getFindAttribute().add("PrimaryContactEmail");
        fc.getFindAttribute().add("PrimaryContactPhone");
        fc.getFindAttribute().add("PrimaryAddress");
        fc.setExcludeAttribute(false);
        
        vc.setConjunction(Conjunction.AND);
        
        // filter out existing account from list of returned accounts
        vcItemPartyId.setAttribute("PartyId");
        vcItemPartyId.setOperator("<>");
        vcItemPartyId.getValue().add(acctId);
        vcItemPartyId.setConjunction(Conjunction.AND);
        vcrPartyId.getItem().add(vcItemPartyId);
        vcrPartyId.setConjunction(Conjunction.AND);
        vc.getGroup().add(vcrPartyId);
                                           
        //filter for latitudes and longitudes within range
        
        // start at lowest nested container levels and work up to FindCriteria
        vcItemLat.setAttribute("Latitude");
        vcItemLat.setOperator("BETWEEN");
        vcItemLat.getValue().add(minLatitude);
        vcItemLat.getValue().add(maxLatitude);
        vcItemLong.setAttribute("Longitude");
        vcItemLong.setOperator("BETWEEN");
        vcItemLong.getValue().add(minLongitude);
        vcItemLong.getValue().add(maxLongitude);
        vcrLat.getItem().add(vcItemLat);
        vcrLong.getItem().add(vcItemLong);
        vcrLat.setConjunction(Conjunction.AND);
        vcrLong.setConjunction(Conjunction.AND);
        vcNested.getGroup().add(vcrLat);
        vcNested.getGroup().add(vcrLong);
        
        // set up ViewCriteriaItem, add exists check, add nested ViewCriteria
        vcItemAddress.setConjunction(Conjunction.AND);
        vcItemAddress.setAttribute("PrimaryAddress");
        vcItemAddress.setOperator("EXISTS");
        vcItemAddress.setNested(vcNested);
        
        // add to group, and then add group to filter
        vcrLocation.getItem().add(vcItemAddress);
        vcrLocation.setConjunction(Conjunction.AND);
        vc.getGroup().add(vcrLocation);
 
        fc.setFilter(vc);
 
        // to limit what is returned in child object, set up ChildFindCriteria and add it to FindCriteria 
        ChildFindCriteria primaryAddressCriteria = new ChildFindCriteria();
        primaryAddressCriteria.setChildAttrName("PrimaryAddress");
        primaryAddressCriteria.setFetchStart(0);
        primaryAddressCriteria.setFetchSize(-1);
        primaryAddressCriteria.getFindAttribute().add("FormattedMultiLineAddress");
        primaryAddressCriteria.getFindAttribute().add("Latitude");
        primaryAddressCriteria.getFindAttribute().add("Longitude");
        primaryAddressCriteria.setExcludeAttribute(false);
        fc.getChildFindCriteria().add(primaryAddressCriteria);

        return fc;
    }
    
    public static boolean isNumber(String s) {
        try {
            double n = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    
}
