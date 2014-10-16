package com.oracle.ptsdemo.healthcare.business.wsclient;


import com.oracle.ptsdemo.healthcare.business.HealthCareException;
import com.oracle.ptsdemo.healthcare.business.datasync.dynamic.CustomFieldHolder;
import com.oracle.ptsdemo.healthcare.business.util.HttpUtil;
import com.oracle.ptsdemo.healthcare.config.FusionConfig;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.SalesPartyService;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.SalesPartyService_Service;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.ServiceException;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.Conjunction;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.CreateSalesParty;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.FindControl;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.FindCriteria;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.FindSalesParty;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.GetSalesParty;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.GetSalesPartyResponse;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.ObjectFactory;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.SalesParty;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.ViewCriteria;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.ViewCriteriaItem;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.ViewCriteriaRow;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;


/**
 */
public class SalesPartyClient extends ObjectClient {

    /**
     */
    protected static SalesPartyService_Service salesPartyService_Service;

    /**
     */
    protected SalesPartyService salesPartyService;

    /**
     */
    protected ObjectFactory objectFactory;

    static org.apache.log4j.Logger logger =
        org.apache.log4j.Logger.getLogger(SalesPartyClient.class);


    /**
     */
    public SalesPartyClient() {
        super();
        HttpUtil.removeProxy();
        init();
    }

    /**
     * @param jwtToken
     */
    public SalesPartyClient(String jwtToken) {
        super();
        this.jwtToken=jwtToken;
        HttpUtil.removeProxy();
        init();
    }


    /**
     */
    protected void init() {
        String username =
            FusionConfig.getInstance().getProperty("FUSION_USER");
        String password =
            FusionConfig.getInstance().getProperty("FUSION_PASSWORD");

        QName SERVICE_NAME =
            new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/",
                      "SalesPartyService");
        URL wsdlURL = null;
        try {
            wsdlURL =
                    new URL(FusionConfig.getInstance().getProperty("SALESPARTY_SERVICE") +
                            "?WSDL");
        } catch (MalformedURLException e) {
            logger.error("Error configuring SalesParty URL", e);
        }

        //      System.out.println("securityPolicy " + securityPolicy);
        if (jwtToken != null) {
            logger.info("Use jwtToken*******************");
            securityPolicy = "";
        }
        salesPartyService_Service =
                new SalesPartyService_Service(wsdlURL, SERVICE_NAME);
         SecurityPoliciesFeature securityFeatures =
            new SecurityPoliciesFeature(new String[] { securityPolicy });


        salesPartyService =
                salesPartyService_Service.getSalesPartyServiceSoapHttpPort(securityFeatures);
      Map<String, Object> reqContext =
            ((BindingProvider)salesPartyService).getRequestContext();
        if (jwtToken != null) {
        
            String authZParameterValue = "Bearer " + jwtToken;


            reqContext.put(MessageContext.HTTP_REQUEST_HEADERS,
                           Collections.singletonMap("Authorization",
                                                    Collections.singletonList(authZParameterValue)));
        } else {
            reqContext.put(BindingProvider.USERNAME_PROPERTY, username);
            reqContext.put(BindingProvider.PASSWORD_PROPERTY, password);

        }

        objectFactory = new ObjectFactory();


    }



    /**
     * @param salesParty
     * @return
     */
    public SalesParty createSalesParty(SalesParty salesParty) {

        if (logger.isDebugEnabled()) {
            logger.debug("SalesParty createSalesParty(SalesParty salesParty) -> partyName: " +
                         salesParty.getPartyName());
        }

        SalesParty rSalesParty = null;
        try {
            CreateSalesParty createSalesParty =
                objectFactory.createCreateSalesParty();
            createSalesParty.setSalesParty(salesParty);
            rSalesParty =
                    salesPartyService.createSalesParty(createSalesParty).getResult();

        } catch (ServiceException e) {
            logger.error("Error creating SalesParty object", e);
        }
        return rSalesParty;
    }


    /**
     * @return
     */
    public List<SalesParty> findSalesParty() {
        if (logger.isDebugEnabled()) {
            logger.debug("List<SalesParty> findSalesParty() --> retrievev all sales party objects");
        }


        String objectName = "SalesParty";
        CustomFieldHolder customFieldHolder = new CustomFieldHolder();
        customFieldHolder.setObjectName(objectName);
        List<SalesParty> returnList = new ArrayList<SalesParty>();

        try {
            com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.ObjectFactory factory =
                new com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.ObjectFactory();


            FindCriteria findCriteria = factory.createFindCriteria();
            findCriteria.setExcludeAttribute(false);
            findCriteria.setFetchStart(0);
            findCriteria.setFetchSize(rowSize);
            FindControl findControl = factory.createFindControl();
            findControl.setRetrieveAllTranslations(false);
            int start = 0;

            FindSalesParty findSalesParty =
                objectFactory.createFindSalesParty();
            findSalesParty.setFindControl(findControl);
            findSalesParty.setFindCriteria(findCriteria);

            while (true) {
                findCriteria.setFetchStart(start);
                start += rowSize;
                List<SalesParty> resultList =
                    salesPartyService.findSalesParty(findSalesParty).getResult();
                for (SalesParty salesParty : resultList) {
                    returnList.add(salesParty);

                }
                if (resultList.size() == 0) {
                    break;
                }
                //   break;
            }


        } catch (Exception e) {
            logger.error("Error retrieving all SalesParty", e);
        }

      
        return returnList;
    }

    /**
     * @param id
     * @return
     */
    public SalesParty findSalesPartyById(String id) {
        if (logger.isDebugEnabled()) {
            logger.debug("SalesParty findSalesPartyById(String id) --> id=" +
                         id);
        }

        SalesParty rSalesParty = null;
        String objectName = "SalesParty";
        CustomFieldHolder customFieldHolder = new CustomFieldHolder();
        customFieldHolder.setObjectName(objectName);

        try {
            com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.ObjectFactory factory =
                new com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.ObjectFactory();


            FindCriteria findCriteria = factory.createFindCriteria();


            findCriteria.setExcludeAttribute(false);


            ViewCriteria viewCriteria = factory.createViewCriteria();


            ViewCriteriaRow viewCriteriaRow = factory.createViewCriteriaRow();
            viewCriteriaRow.setUpperCaseCompare(true);
            viewCriteriaRow.setConjunction(Conjunction.AND);


            ViewCriteriaItem viewCriteriaItem =
                factory.createViewCriteriaItem();
            viewCriteriaItem.setUpperCaseCompare(true);
            viewCriteriaItem.setAttribute("PartyId");
            viewCriteriaItem.setOperator("=");
            viewCriteriaItem.getValue().add(id);
            viewCriteriaRow.getItem().add(viewCriteriaItem);


            viewCriteria.getGroup().add(viewCriteriaRow);
            findCriteria.setFilter(viewCriteria);
            findCriteria.setFetchSize(rowSize);
            FindControl findControl = factory.createFindControl();
            findControl.setRetrieveAllTranslations(true);

            FindSalesParty findSalesParty =
                objectFactory.createFindSalesParty();
            findSalesParty.setFindControl(findControl);
            findSalesParty.setFindCriteria(findCriteria);

            int start = 0;


            while (true) {
                findCriteria.setFetchStart(start);
                start += rowSize;
                List<SalesParty> resultList =
                    salesPartyService.findSalesParty(findSalesParty).getResult();
                for (SalesParty salesParty : resultList) {
                    System.out.println("partyName " +
                                       salesParty.getPartyName());
                    rSalesParty = salesParty;
                }
                if (resultList.size() == 0) {
                    break;
                }
                break;
            }


        } catch (Exception e) {
            logger.error("Error finding SalesParty by id", e);
        }


        return rSalesParty;
    }

    /**
     * @param name
     * @return
     */
    public SalesParty findSalesPartyByName(String name) {
        if (logger.isDebugEnabled()) {
            logger.debug("SalesParty findSalesPartyByName(String name) --> name=" +
                         name);
        }

        SalesParty rSalesParty = null;
        String objectName = "SalesParty";
        CustomFieldHolder customFieldHolder = new CustomFieldHolder();
        customFieldHolder.setObjectName(objectName);

        try {
            FindCriteria findCriteria = objectFactory.createFindCriteria();
            findCriteria.setExcludeAttribute(false);
            ViewCriteria viewCriteria = objectFactory.createViewCriteria();
            ViewCriteriaRow viewCriteriaRow =
                objectFactory.createViewCriteriaRow();
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

            FindSalesParty findSalesParty =
                objectFactory.createFindSalesParty();
            findSalesParty.setFindControl(findControl);
            findSalesParty.setFindCriteria(findCriteria);

            int start = 0;


            while (true) {
                findCriteria.setFetchStart(start);
                start += rowSize;
                List<SalesParty> resultList =
                    salesPartyService.findSalesParty(findSalesParty).getResult();

                for (SalesParty salesParty : resultList) {
                    System.out.println("partyName " +
                                       salesParty.getPartyName().getValue());
                    System.out.println("Id " + salesParty.getPartyId());
                    if (salesParty.getPartyName().equals(name)) {
                        rSalesParty = salesParty;

                    }
                    // returnList.add(salesParty);
                }
                if (resultList.size() == 0) {
                    break;
                }
                break;
            }


        } catch (Exception e) {
            logger.error("Error finding SalesParty by name", e);
        }

    
        return rSalesParty;
    }

    /**
     * @param id
     * @return
     * @throws Exception
     */
    public SalesParty getSalesParty(Long id) throws HealthCareException {
        if (logger.isDebugEnabled()) {
            logger.debug("SalesParty getSalesParty(Long id) --> id=" + id);
        }

        SalesParty salesParty = null;
        GetSalesParty salesPartyObj = objectFactory.createGetSalesParty();
        salesPartyObj.setPartyId(id);
        try {

            CustomFieldHolder customFieldHolder = new CustomFieldHolder();
            customFieldHolder.setObjectName("SalesParty");

            GetSalesPartyResponse salesPartyResponse =
                salesPartyService.getSalesParty(salesPartyObj);
            if (salesPartyResponse != null) {
                salesParty = salesPartyResponse.getResult();
                if (salesParty == null) {
                    throw new Exception("Could not return SalesPartyResponse with id = " +
                                        id);
                }
            }

        } catch (Exception e) {
            logger.error("Error getting SalesParty", e);
            throw new HealthCareException(e);
        }
        return salesParty;
    }


}

