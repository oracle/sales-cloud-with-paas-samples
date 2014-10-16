package com.oracle.pts.custom.client;


import com.oracle.pts.config.FusionConfig;
import com.oracle.pts.custom.AttributeEntry;
import com.oracle.pts.custom.CustomFieldHolder;
import com.oracle.pts.custom.DataSet;



import com.oracle.pts.salesparty.wsclient.generated.ChildFindCriteria;
import com.oracle.pts.salesparty.wsclient.generated.Conjunction;
import com.oracle.pts.salesparty.wsclient.generated.FindControl;
import com.oracle.pts.salesparty.wsclient.generated.FindCriteria;
import com.oracle.pts.salesparty.wsclient.generated.ObjectFactory;
import com.oracle.pts.salesparty.wsclient.generated.OrganizationParty;
import com.oracle.pts.salesparty.wsclient.generated.OrganizationProfile;
import com.oracle.pts.salesparty.wsclient.generated.PartySite;
import com.oracle.pts.salesparty.wsclient.generated.PartySiteUse;
import com.oracle.pts.salesparty.wsclient.generated.SalesAccount;
import com.oracle.pts.salesparty.wsclient.generated.SalesAccountResource;
import com.oracle.pts.salesparty.wsclient.generated.SalesParty;
import com.oracle.pts.salesparty.wsclient.SalesPartyService;
import com.oracle.pts.salesparty.wsclient.SalesPartyService_Service;
import com.oracle.pts.salesparty.wsclient.generated.ViewCriteria;
import com.oracle.pts.salesparty.wsclient.generated.ViewCriteriaItem;
import com.oracle.pts.salesparty.wsclient.generated.ViewCriteriaRow;

import com.oracle.pts.salesparty.wsclient.ServiceException;

import com.oracle.pts.salesparty.wsclient.generated.CreateSalesParty;
import com.oracle.pts.salesparty.wsclient.generated.Email;
import com.oracle.pts.salesparty.wsclient.generated.FindSalesParty;
import com.oracle.pts.salesparty.wsclient.generated.GetSalesParty;
import com.oracle.pts.salesparty.wsclient.generated.OrganizationPartyResult;
import com.oracle.pts.salesparty.wsclient.generated.Person;

import com.oracle.pts.salesparty.wsclient.generated.PersonPartySite;

import com.oracle.pts.salesparty.wsclient.generated.PersonProfile;

import com.oracle.pts.salesparty.wsclient.generated.PersonResult;
import com.oracle.pts.salesparty.wsclient.generated.Phone;
import com.oracle.pts.salesparty.wsclient.generated.Relationship;

import com.oracle.pts.salesparty.wsclient.generated.UpdateSalesParty;
import com.oracle.pts.salesparty.wsclient.generated.Web;

import com.oracle.pts.util.HttpUtil;

import com.oracle.pts.ws.CRMProcessor;

import com.sun.xml.ws.api.addressing.AddressingVersion;

import java.io.FileInputStream;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.math.BigDecimal;

import java.net.Authenticator;

import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;

import java.text.DecimalFormat;

import java.text.ParseException;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import weblogic.jws.WSDL;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;


public class SalesPartyClient extends ObjectClient {
    protected static SalesPartyService_Service salesPartyService_Service;
    protected SalesPartyService salesPartyService;
    protected ObjectFactory objectFactory;
    Logger logger = Logger.getLogger("CRM");
    protected String objectName = "SalesParty"; 

    public SalesPartyClient() {
        super();
        HttpUtil.removeProxy();
        init();
    }


    protected void init() {
        
        // as a bug
        System.setProperty("javax.xml.transform.TransformerFactory","com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl");
        
        String username =
            FusionConfig.getInstance().getPropertyFromDB("FUSION_USER");
        QName SERVICE_NAME =
            new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/",
                      "SalesPartyService");
        URL wsdlURL = null;
        try {
            wsdlURL =
                    new URL(FusionConfig.getInstance().getPropertyFromDB("SALESPARTY_SERVICE") +
                            "?WSDL");
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        logger.info("wsdlURL " + FusionConfig.getInstance().getPropertyFromDB("SALESPARTY_SERVICE") +
                            "?WSDL");
       
        

        salesPartyService_Service =
                new SalesPartyService_Service(wsdlURL, SERVICE_NAME);
      
        SecurityPoliciesFeature securityFeatures =
            new SecurityPoliciesFeature(new String[] { securityPolicy });
        System.out.println("securityPolicy : " + securityPolicy);

        salesPartyService =
                salesPartyService_Service.getSalesPartyServiceSoapHttpPort(securityFeatures);
        Map<String, Object> reqContext =
            ((BindingProvider)salesPartyService).getRequestContext();

        reqContext.put("csf-key",username);       
       
        

        objectFactory = new ObjectFactory();


    }

    public static void main(String[] args) {
      //  CRMProcessor.disable=true;
        HttpUtil.removeMyProxy();
        SalesPartyClient salesPartyClient = new SalesPartyClient();
        salesPartyClient.work();


    }

    public void work() {

     //   SalesParty salesParty = getSalesParty(300000044086516L);
        SalesParty salesParty = findSalesPartyByName("MyTestCustomer");
       
        System.out.println("name " + salesParty.getPartyName().getValue());
    }

    
    public SalesParty getSalesParty(long id){
        CustomFieldHolder customFieldHolder = new CustomFieldHolder();
        customFieldHolder.setObjectName(objectName);
        SalesParty salesParty = null;
        GetSalesParty getSalesParty = objectFactory.createGetSalesParty();
        getSalesParty.setPartyId(id);
        try {
            salesParty = salesPartyService.getSalesParty(getSalesParty).getResult();
        } catch (ServiceException e) {
        }
        return salesParty;
    }
    public SalesParty findSalesPartyByName(String name) {
        SalesParty rSalesParty = null;
        objectName = "SalesParty";
        CustomFieldHolder customFieldHolder = new CustomFieldHolder();
        customFieldHolder.setObjectName(objectName);
        List<SalesParty> returnList = new ArrayList<SalesParty>();

        try {
            


            FindCriteria findCriteria = objectFactory.createFindCriteria();


            findCriteria.setExcludeAttribute(false);


            ViewCriteria viewCriteria = objectFactory.createViewCriteria();


            ViewCriteriaRow viewCriteriaRow = objectFactory.createViewCriteriaRow();
            viewCriteriaRow.setUpperCaseCompare(true);
            viewCriteriaRow.setConjunction(Conjunction.AND);


            ViewCriteriaItem viewCriteriaItem =
                objectFactory.createViewCriteriaItem();
            viewCriteriaItem.setUpperCaseCompare(true);
            viewCriteriaItem.setAttribute("PartyName");
            viewCriteriaItem.setOperator("=");
            viewCriteriaItem.getValue().add(name);
            viewCriteriaRow.getItem().add(viewCriteriaItem);


            viewCriteria.getGroup().add(viewCriteriaRow);
            findCriteria.setFilter(viewCriteria);
            findCriteria.setFetchSize(rowSize);
            FindControl findControl = objectFactory.createFindControl();
            findControl.setRetrieveAllTranslations(true);

            FindSalesParty findSalesParty = objectFactory.createFindSalesParty();
            findSalesParty.setFindControl(findControl);
            findSalesParty.setFindCriteria(findCriteria);

            int start = 0;


           
                findCriteria.setFetchStart(start);
                start += rowSize;
                List<SalesParty> resultList =
                    salesPartyService.findSalesParty(findSalesParty).getResult();
                
                for (SalesParty salesParty : resultList) {
                    System.out.println("partyName " +
                                       salesParty.getPartyName().getValue());
                    System.out.println("Id " +
                                       salesParty.getPartyId());
                    if (salesParty.getPartyName().getValue().equals(name)) {
                      
                        rSalesParty = salesParty;

                    }
                    // returnList.add(salesParty);
                }
               


        } catch (Exception e) {
            e.printStackTrace();
            logger.info(e.getMessage());
        }

        customFieldHolder.printCustomFieldHolder();
        CustomFieldHolder mCustomFieldHolder = new CustomFieldHolder();
        String mObjectName = "SalesAccount";
        DataSet dataSet = mCustomFieldHolder.getDecendentDataSet(mObjectName);
        if(dataSet!=null){
            for(AttributeEntry attributeEntry:dataSet.getAttributeList()){
                System.out.println( "name: " + attributeEntry.getName());
                System.out.println("value: " + attributeEntry.getValue());
            }
        }

        return rSalesParty;
    }

}

