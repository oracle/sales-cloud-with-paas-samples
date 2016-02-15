// Copyright � 2015, Oracle and/or its affiliates. All rights reserved

package oracle.cloud.sampleapps.salesmerchtracker.model.proxy.facade;

import com.sun.xml.ws.developer.WSBindingProvider;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.SalesPartyService;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.SalesPartyService_Service;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.ServiceException;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.ChildFindCriteria;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.Conjunction;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindCriteria;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindSalesParty;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.SalesParty;

import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.ViewCriteria;

import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.ViewCriteriaItem;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.ViewCriteriaRow;

import weblogic.wsee.jws.jaxws.owsm.SecurityPolicyFeature;

public class SalesPartyServiceFacade {
    private SalesPartyService_Service salesPartyService_Service;
    private List<SimplifiedSalesParty> SimplifiedSalesParties =
        new ArrayList<SimplifiedSalesParty>();
    private long partyId;
    private String partyName;

    public List<SimplifiedSalesParty> getSalesPartyList(String startsWith) throws ServiceException {
        List<SalesParty> SalesParties;
        FindCriteria findCriteria = createFindCriteria(startsWith);

        // You can change your security policy here
        SecurityPolicyFeature[] securityFeatures =
        //    new SecurityPolicyFeature[] { new SecurityPolicyFeature("oracle/wss_username_token_over_ssl_client_policy") };
            new SecurityPolicyFeature[] { new SecurityPolicyFeature("oracle/wss_saml_token_bearer_over_ssl_client_policy") };

        //salesPartyService_Service = new SalesPartyService_Service();
        //to accomodate for new URL everytime, you will chanage the URL here
        salesPartyService_Service = new SalesPartyService_Service();

        SalesPartyService salesPartyService =
            salesPartyService_Service.getSalesPartyServiceSoapHttpPort(securityFeatures);
        //  SalesPartyService salesPartyService = salesPartyService_Service.getSalesPartyServiceSoapHttpPort();

        // If using wss_username_token_over_ssl_client_policy uncomment the three lines below to provide the username/password
        // WSBindingProvider wsbp = (WSBindingProvider)salesPartyService;
        // wsbp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY,"your_sales_cloud_user_name");
        //   wsbp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,"your_sales_cloud_password");

        FindSalesParty fSalesParty = new FindSalesParty();
        fSalesParty.setFindCriteria(findCriteria);
        try {
            SalesParties =
                    salesPartyService.findSalesParty(fSalesParty).getResult();
            if (!SalesParties.isEmpty()) {
                for (SalesParty sp : SalesParties)

                {
                    partyName = sp.getPartyName().getValue();
                    partyId = sp.getPartyId();
                    SimplifiedSalesParty s1 =
                        new SimplifiedSalesParty(partyId, partyName);
                    SimplifiedSalesParties.add(s1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SimplifiedSalesParties;
    }

    private static FindCriteria createFindCriteria(String startsWith) {
        FindCriteria findCriteria = new FindCriteria();
        ChildFindCriteria childFindCriteria = new ChildFindCriteria();
        findCriteria.setFetchStart(0);
        findCriteria.setFetchSize(10);

        ViewCriteria filter = new ViewCriteria();
        ViewCriteriaRow group1 = new ViewCriteriaRow();
        ViewCriteriaItem item1 = new ViewCriteriaItem();
        item1.setUpperCaseCompare(true);
        item1.setAttribute("PartyName");
        item1.setOperator("STARTSWITH");
        item1.getValue().add(startsWith);

        ViewCriteriaItem item2 = new ViewCriteriaItem();
        item2.setAttribute("PartyType");
        item2.setOperator("=");
        item2.getValue().add("ORGANIZATION");

		ViewCriteriaItem item3 = new ViewCriteriaItem();
        item3.setAttribute("Status");
        item3.setOperator("=");
        item3.getValue().add("A");

        group1.getItem().add(item1);
        group1.getItem().add(item2);
		group1.getItem().add(item3);
        group1.setConjunction(Conjunction.AND);

        filter.getGroup().add(group1);
        findCriteria.setFilter(filter);

        findCriteria.getFindAttribute().add("PartyId");
        findCriteria.getFindAttribute().add("PartyName");
        //    findCriteria.getFindAttribute().add("OrganizationParty");

        /*    childFindCriteria.setChildAttrName("OrganizationParty");
      childFindCriteria.getFindAttribute().add("Address1");
      childFindCriteria.getFindAttribute().add("City");
      childFindCriteria.getFindAttribute().add("Country");
      findCriteria.getChildFindCriteria().add(childFindCriteria);
*/
        return findCriteria;
    }

}
