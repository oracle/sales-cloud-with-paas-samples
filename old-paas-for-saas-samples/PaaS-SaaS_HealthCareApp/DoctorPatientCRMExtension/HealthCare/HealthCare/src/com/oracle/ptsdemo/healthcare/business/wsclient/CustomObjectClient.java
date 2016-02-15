package com.oracle.ptsdemo.healthcare.business.wsclient;


//import com.oracle.pts.custom.wsclient.generated.ActivitySubscriberC;


//import com.oracle.pts.custom.wsclient.generated.ProductPriceC;


import com.oracle.ptsdemo.healthcare.business.HealthCareException;
import com.oracle.ptsdemo.healthcare.config.FusionConfig;
import com.oracle.ptsdemo.healthcare.business.datasync.dynamic.CRMProcessor;
import com.oracle.ptsdemo.healthcare.business.util.HttpUtil;
import com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.CustomerCenterCustomObjectService;
import com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.CustomerCenterCustomObjectService_Service;
import com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.ServiceException;
import com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.generated.FindControl;
import com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.generated.FindCriteria;
import com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.generated.MedC;
import com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.generated.ObjectFactory;
import com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.generated.PresC;
import com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.generated.PresMedC;
import com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.generated.PrescriptionC;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.SalesPartyService_Service;


import java.net.MalformedURLException;
import java.net.URL;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;


/**
 */
public class CustomObjectClient extends ObjectClient {
    
    @WebServiceRef
    private static CustomerCenterCustomObjectService_Service customerCenterCustomObjectService_Service;


    /**
     */
    protected CustomerCenterCustomObjectService customerCenterCustomObjectService;

    /**
     */
    protected ObjectFactory objectFactory = new ObjectFactory();
    Logger logger = Logger.getLogger(this.getClass().getName());
    /**
     * Injectable field for service WebServiceClient
     **/
    @WebServiceRef
    SalesPartyService_Service salesPartyService_Service;

    /**
     */
    public CustomObjectClient() throws HealthCareException {
        super();
        HttpUtil.removeProxy();
        init();
    }

    private void init() throws HealthCareException {
        String username = FusionConfig.getInstance().getProperty("FUSION_USER");
        String password = FusionConfig.getInstance().getProperty("FUSION_PASSWORD");


        //  Gabrielle.lee/welcome

        QName SERVICE_NAME =
            new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/",
                      "CustomerCenterCustomObjectService");
        URL wsdlURL = null;
        try {
            wsdlURL =
                    new URL(FusionConfig.getInstance().getProperty("CUSTOMOBJECT_SERVICE") +
                            "?wsdl");
        } catch (MalformedURLException e) {
            throw new HealthCareException(e);
             
        }


        customerCenterCustomObjectService_Service =
                new CustomerCenterCustomObjectService_Service(wsdlURL,
                                                              SERVICE_NAME);
        //    SecurityPoliciesFeature securityFeatures =
        //        new SecurityPoliciesFeature(new String[] { "oracle/wss_username_token_client_policy" });
        SecurityPoliciesFeature securityFeatures =
            new SecurityPoliciesFeature(new String[] { securityPolicy });


        customerCenterCustomObjectService =
                customerCenterCustomObjectService_Service.getCustomerCenterCustomObjectServiceSoapHttpPort(securityFeatures);

        Map<String, Object> reqContext =
            ((BindingProvider)customerCenterCustomObjectService).getRequestContext();

        reqContext.put(BindingProvider.USERNAME_PROPERTY, username);
        reqContext.put(BindingProvider.PASSWORD_PROPERTY, password);

    }



    /**
     */
    public void work() throws HealthCareException {
        CRMProcessor.disable();
     findPres();
    }



    /**
     */
    public void findPres() throws HealthCareException {
        int presMedSize = 0;
        List<Object> objectList = find("Pres_c");
        System.out.println("pres size " + objectList.size());
       for (Object object : objectList) {
            PresC presC = (PresC)object;
            System.out.println("prescriptionId: " + presC.getPRESCRIPTIONIDC().getValue());
            String doctorId = presC.getDocIdC().getValue().toString();
           System.out.println("doctorId: " + doctorId);
            String patientId = presC.getPatIdC().getValue().toString();
            System.out.println("patientId: " + patientId);
           
            List<PresMedC> medicationList = presC.getPresMedCollectionC();
           for(PresMedC presMedC:medicationList){
               presMedSize++;
               System.out.println("medicationId " + presMedC.getMEDICATIONIDC().getValue());
           }
           
        }
       System.out.println("presMedSize: " + presMedSize);
    }

    /**
     */
    public void findPresMed() throws HealthCareException {
        List<Object> objectList = find("Pres_med_c");
        System.out.println("size " + objectList.size());
       for (Object object : objectList) {
            PresMedC presMedC = (PresMedC)object;
            System.out.println("medicationId " + presMedC.getMEDICATIONIDC().getValue());
            
           
           
        }
    }

    /**
     */
    public void findMed() throws HealthCareException {
        List<Object> objectList = find("Med_c");
        System.out.println("med size " + objectList.size());
        for (Object object : objectList) {
            
            MedC medC = (MedC)object;
            
            
            logger.info("drugName " +
                        medC.getNAMEC().getValue());
            logger.info("ndcCode " +
                        medC.getNDCCODEC().getValue());
            logger.info("medicationId " +
                        medC.getMEDICATIONIDC().getValue());

            System.out.println("medicationId " + medC.getMEDICATIONIDC().getValue());
        }
    }

    /**
     * @param objectName
     */
    public void deleteAll(String objectName) throws HealthCareException {


        List<Object> objectList = find(objectName);
        System.out.println("objectName " + objectName);
        deleteAll(objectList, objectName);
    }

    /**
     * @param objectList
     * @param objectName
     */
    public void deleteAll(List<Object> objectList, String objectName) throws HealthCareException {

        try {
            for (Object object : objectList) {
                customerCenterCustomObjectService.deleteEntity(object,
                                                               objectName);

            }
        } catch (ServiceException e) {
             throw new HealthCareException(e);
        }

    }


    /**
     * @param objectName
     * @return
     */
    public List<Object> find(String objectName) throws HealthCareException {

        List<Object> returnList = new ArrayList<Object>();

        try {

            FindCriteria findCriteria = objectFactory.createFindCriteria();
            findCriteria.setFetchSize(100);
            FindControl findControl = objectFactory.createFindControl();
            findControl.setRetrieveAllTranslations(true);
            int start = 0;

            while (true) {
                findCriteria.setFetchStart(start);
                start += 100;
                List<Object> resultList =
                    customerCenterCustomObjectService.findEntity(findCriteria,
                                                                 findControl,
                                                                 objectName);
                for (Object object : resultList) {
                    returnList.add(object);

                }
                if (resultList.size() == 0) {
                    break;
                }
            }


        } catch (Exception e) {
             throw new HealthCareException(e);
        }
        return returnList;
    }


}
