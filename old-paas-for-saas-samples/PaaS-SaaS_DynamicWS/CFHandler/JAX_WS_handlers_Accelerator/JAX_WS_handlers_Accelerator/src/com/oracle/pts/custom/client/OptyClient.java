package com.oracle.pts.custom.client;

import com.oracle.pts.config.FusionConfig;
import com.oracle.pts.custom.AttributeEntry;
import com.oracle.pts.custom.CustomFieldHolder;
import com.oracle.pts.custom.DataSet;



import com.oracle.pts.handle.EntityHandler;
import com.oracle.pts.opp.wsclient.OpportunityService;
import com.oracle.pts.opp.wsclient.OpportunityService_Service;
import com.oracle.pts.opp.wsclient.ServiceException;
import com.oracle.pts.opp.wsclient.generated.AmountType;
import com.oracle.pts.opp.wsclient.generated.FindControl;
import com.oracle.pts.opp.wsclient.generated.FindCriteria;

import com.oracle.pts.opp.wsclient.generated.MeasureType;
import com.oracle.pts.opp.wsclient.generated.ObjectFactory;

import com.oracle.pts.opp.wsclient.generated.Opportunity;

import com.oracle.pts.opp.wsclient.generated.Revenue;

import com.oracle.pts.opp.wsclient.generated.RevenueLineSet;

import com.oracle.pts.opp.wsclient.generated.ViewCriteria;

import com.oracle.pts.opp.wsclient.generated.ViewCriteriaItem;
import com.oracle.pts.opp.wsclient.generated.ViewCriteriaRow;

import com.oracle.pts.opp.wsclient.generated.ChildFindCriteria;
import com.oracle.pts.opp.wsclient.generated.Conjunction;

import com.oracle.pts.opp.wsclient.generated.SortAttribute;
import com.oracle.pts.opp.wsclient.generated.SortOrder;

import com.oracle.pts.util.HttpUtil;

import com.sun.xml.ws.api.addressing.AddressingVersion;

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

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;


public class OptyClient extends ObjectClient{
    private static OpportunityService_Service opportunityService_Service;
     private OpportunityService opportunityService;
    Logger logger = Logger.getLogger("CRM");
    private static final String objectName= "Opportunity";
    
    public OptyClient() {
        super();
        HttpUtil.removeProxy();
        init();
    }
    private void init() {
        System.setProperty("javax.xml.transform.TransformerFactory","com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl");
        String username = FusionConfig.getInstance().getPropertyFromDB("FUSION_USER");
          QName SERVICE_NAME = 
         new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/",
                  "OpportunityService");
       URL wsdlURL = null;
           try {
                                 wsdlURL = new URL(FusionConfig.getInstance().getPropertyFromDB("OPPORTUNITY_SERVICE") + "?WSDL");
                             } catch (MalformedURLException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
             }

        opportunityService_Service = new OpportunityService_Service(wsdlURL,SERVICE_NAME);
        SecurityPoliciesFeature securityFeatures =
            new SecurityPoliciesFeature(new String[] { securityPolicy });




        opportunityService =
                opportunityService_Service.getOpportunityServiceSoapHttpPort(securityFeatures);
        Map<String, Object> reqContext =
            ((BindingProvider)opportunityService).getRequestContext();



        reqContext.put("csf-key",username);       
        
    }

    public static void main(String[] args) {
        OptyClient optyClient = new OptyClient();
        optyClient.work();


    }

    public void work() {
       // find();
        //    testCreate();
     
        
       
         //   update("300000000739701");
         
         getOpportunity(300000075261977L);
    }

    public void testCreate() {
        ObjectFactory objectFactory = new ObjectFactory();
        Opportunity opportunity = objectFactory.createOpportunity();
        
        String optName = "optName" + String.valueOf(System.currentTimeMillis());
                                                                     
        opportunity.setName(optName);
        
           logger.info("Creatinging " + optName );

        try {
            DataSet dataSet = new DataSet();
            dataSet.setName(objectName);
            AttributeEntry attr = new AttributeEntry();
            attr.setName("customfield1_c");
            attr.setValue("customfield1Value");
            dataSet.getAttributeList().add(attr);
            attr = new AttributeEntry();
            attr.setName("customfield2_c");
            attr.setValue("customfield2Value");
            dataSet.getAttributeList().add(attr);


            CustomFieldHolder customFieldHolder = new CustomFieldHolder();
            customFieldHolder.setObjectName(objectName);
            customFieldHolder.setDataSet(dataSet);
           
            opportunityService.createOpportunity(opportunity);


        } catch (ServiceException e) {
            e.printStackTrace();
            logger.info(e.getMessage());
            
        }
    }



    public void update(String optyId) {

        long optyIdLong = Long.parseLong(optyId);


        try {
            ObjectFactory objectFactory = new ObjectFactory();
             Opportunity opportunity = objectFactory.createOpportunity();
            opportunity.setOptyId(optyIdLong);


            DataSet dataSet = new DataSet();
            dataSet.setName(objectName);
            AttributeEntry attr = new AttributeEntry();
            attr.setName("customfield1_c");
            attr.setValue("customfield3Value");
            dataSet.getAttributeList().add(attr);
            attr = new AttributeEntry();
            attr.setName("customfield2_c");
            attr.setValue("customfield4Value");
            dataSet.getAttributeList().add(attr);

            CustomFieldHolder customFieldHolder = new CustomFieldHolder();
             customFieldHolder.setObjectName(objectName);
             customFieldHolder.setDataSet(dataSet);
                                 

            opportunityService.updateOpportunity(opportunity);


        } catch (ServiceException e) {
            e.printStackTrace();
            logger.info(e.getMessage());
        }

    }

    public Opportunity getOpportunity(long optyId) {
        CustomFieldHolder customFieldHolder = new CustomFieldHolder();
        customFieldHolder.setObjectName(objectName);
        Opportunity opportunity = null;
        logger.info("calling getOpporutnity");
        try {
            logger.info("calling getOpporutnity****");
            opportunity = opportunityService.getOpportunity(optyId);
            
        } catch (Exception e) {
            logger.info("There is an errorE: " + e.getMessage());
           e.printStackTrace();
        }
        customFieldHolder.printCustomFieldHolder();
        
        return opportunity;
    }

    public List<Opportunity> find() {
        CustomFieldHolder customFieldHolder = new CustomFieldHolder();
        customFieldHolder.setObjectName(objectName);

        List<Opportunity> returnList = new ArrayList<Opportunity>();

        try {
            ObjectFactory factory = new ObjectFactory();



            FindCriteria findCriteria = factory.createFindCriteria();
            findCriteria.setExcludeAttribute(false);
            findCriteria.getFindAttribute().add("OptyId");
            findCriteria.getFindAttribute().add("TargetPartyName");
            findCriteria.getFindAttribute().add("TargetPartyId");
            findCriteria.getFindAttribute().add("Name");
            findCriteria.getFindAttribute().add("PartyName1");
            findCriteria.getFindAttribute().add("WinProb");
            findCriteria.getFindAttribute().add("EffectiveDate");
            findCriteria.getFindAttribute().add("Revenue");
           
            SortOrder sortOrdersortOrder = factory.createSortOrder();
            SortAttribute sortAttribute = factory.createSortAttribute();
            sortAttribute.setName("Revenue");
            sortAttribute.setDescending(true);
            sortOrdersortOrder.getSortAttribute().add(sortAttribute);
            findCriteria.setSortOrder(sortOrdersortOrder);
            
            
            ViewCriteria viewCriteria= factory.createViewCriteria();
            

            
            ViewCriteriaRow viewCriteriaRow = factory.createViewCriteriaRow();
            viewCriteriaRow.setUpperCaseCompare(true);
            viewCriteriaRow.setConjunction(Conjunction.AND);
            
            
            ViewCriteriaItem viewCriteriaItem  = factory.createViewCriteriaItem();
            viewCriteriaItem.setUpperCaseCompare(true);
            viewCriteriaItem.setAttribute("TargetPartyId");
            viewCriteriaItem.setOperator("=");
            viewCriteriaItem.getValue().add("300000000616599");
            viewCriteriaRow.getItem().add(viewCriteriaItem);


            viewCriteriaItem  = factory.createViewCriteriaItem();
            viewCriteriaItem.setUpperCaseCompare(true);
            viewCriteriaItem.setAttribute("StatusCode");
            viewCriteriaItem.setOperator("=");
            viewCriteriaItem.getValue().add("OPEN");
            viewCriteriaRow.getItem().add(viewCriteriaItem);

            viewCriteria.getGroup().add(viewCriteriaRow);
            findCriteria.setFilter(viewCriteria);


            findCriteria.setFetchSize(-1);
            FindControl findControl = factory.createFindControl();
            findControl.setRetrieveAllTranslations(false);

            int start = 0;


            while (true) {
                findCriteria.setFetchStart(start);
                start += 100;
                List<Opportunity> resultList =
                    
                    opportunityService.findOpportunity(findCriteria,
                                                       findControl);
                for (Opportunity opportunity : resultList) {
                        returnList.add(opportunity);
                    
                    }

             
                if (resultList.size() == 0) {
                    break;
                }
                break;
            }


        } catch (Exception e) {
            e.printStackTrace();
            logger.info(e.getMessage());
        }
        
        customFieldHolder.printCustomFieldHolder();
        
        return returnList;
    }
    
}

