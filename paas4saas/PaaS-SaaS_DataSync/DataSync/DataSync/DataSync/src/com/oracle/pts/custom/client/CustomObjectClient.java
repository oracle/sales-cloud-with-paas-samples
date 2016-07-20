package com.oracle.pts.custom.client;

import com.oracle.pts.config.FusionConfig;


import com.oracle.pts.custom.CustomFieldHolder;
import com.oracle.pts.custom.DataSet;
import com.oracle.pts.custom.client.ObjectClient;
import com.oracle.pts.custom.wsclient.CustomerCenterCustomObjectService;
import com.oracle.pts.custom.wsclient.CustomerCenterCustomObjectService_Service;

import com.oracle.pts.custom.wsclient.ServiceException;
//import com.oracle.pts.custom.wsclient.generated.ActivitySubscriberC;
import com.oracle.pts.custom.wsclient.generated.FindControl;
import com.oracle.pts.custom.wsclient.generated.FindCriteria;
import com.oracle.pts.custom.wsclient.generated.MedC;
import com.oracle.pts.custom.wsclient.generated.ObjectFactory;


//import com.oracle.pts.custom.wsclient.generated.ProductPriceC;

import com.oracle.pts.custom.wsclient.generated.PresC;
import com.oracle.pts.custom.wsclient.generated.PresMedC;
import com.oracle.pts.custom.wsclient.generated.PrescriptionC;
import com.oracle.pts.salesparty.wsclient.SalesPartyService_Service;
import com.oracle.pts.util.HttpUtil;

import com.oracle.pts.ws.CRMProcessor;

import com.sun.xml.ws.api.addressing.AddressingVersion;

import java.math.BigDecimal;

import java.net.Authenticator;

import java.net.MalformedURLException;
import java.net.URL;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import java.util.Properties;

import java.util.logging.Logger;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import javax.xml.ws.WebServiceRef;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;


public class CustomObjectClient extends ObjectClient {
    private static CustomerCenterCustomObjectService_Service customerCenterCustomObjectService_Service;
    private static final AddressingVersion WS_ADDR_VER = AddressingVersion.W3C;
    protected CustomerCenterCustomObjectService customerCenterCustomObjectService;
    protected ObjectFactory objectFactory = new ObjectFactory();
    private HashMap<String,String> medicationMap = new HashMap();
    Logger logger = Logger.getLogger("CRM");
    /**
     * Injectable field for service WebServiceClient
     **/
    @WebServiceRef
    SalesPartyService_Service salesPartyService_Service;

    public CustomObjectClient() {
        super();
        HttpUtil.removeProxy();
        init();
    }

    private void init() {
        // as a bug
        System.setProperty("javax.xml.transform.TransformerFactory","com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl");
        String username =
            FusionConfig.getInstance().getPropertyFromDB("FUSION_USER");


        //  Gabrielle.lee/welcome

        QName SERVICE_NAME =
            new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/",
                      "CustomerCenterCustomObjectService");
        URL wsdlURL = null;
        try {
            wsdlURL =
                    new URL(FusionConfig.getInstance().getPropertyFromDB("CUSTOMOBJECT_SERVICE") +
                            "?WSDL");
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        customerCenterCustomObjectService_Service =
                new CustomerCenterCustomObjectService_Service(wsdlURL,
                                                              SERVICE_NAME);
        SecurityPoliciesFeature securityFeatures =
            new SecurityPoliciesFeature(new String[] { securityPolicy });


        customerCenterCustomObjectService =
                customerCenterCustomObjectService_Service.getCustomerCenterCustomObjectServiceSoapHttpPort(securityFeatures);

        Map<String, Object> reqContext =
            ((BindingProvider)customerCenterCustomObjectService).getRequestContext();

        reqContext.put("csf-key",username);       

    }

    public static void main(String[] args) {


        CustomObjectClient util = new CustomObjectClient();
        HttpUtil.removeMyProxy();
        util.work();
        //   util.find("Transaction_c");
        //  util.setTransAutoBillVID();

    }


    public void work() {
        CRMProcessor.disable=true;
       // deleteAll("Prescription_c");
      //  deleteAll("Med_c");
     // deleteAll("Pres_c");
     //   findPrescription();
        
        findMed();
     findPres();
        findPresMed();
    }
    public void findPrescription(){
        List<Object> objectList = find("Prescription_c");
        System.out.println("size " + objectList.size());
        
       for (Object object : objectList) {
           
            PrescriptionC prescriptionC = (PrescriptionC)object;
            System.out.println("prescriptionId " + prescriptionC.getPrescriptionIdC().getValue());
        }
       
    }
    public void findPres(){
        List<Object> objectList = find("Pres_c");
        System.out.println("size " + objectList.size());
       for (Object object : objectList) {
           System.out.println();
            PresC presC = (PresC)object;
            System.out.println("prescriptionId: " + presC.getPRESCRIPTIONIDC().getValue());
            String doctorId = presC.getDocIdC().getValue().toString();
           System.out.println("doctorId: " + doctorId);
            String patientId = presC.getPatIdC().getValue().toString();
            System.out.println("patientId: " + patientId);
           
            List<PresMedC> medicationList = presC.getPresMedCollectionC();
           for(PresMedC presMedC:medicationList){
               System.out.println("     medicationId " + presMedC.getMEDICATIONIDC().getValue());
           }
           
        }
    }
    public void findPresMed(){
        List<Object> objectList = find("Pres_med_c");
        System.out.println("size " + objectList.size());
       for (Object object : objectList) {
            PresMedC presMedC = (PresMedC)object;
            System.out.println("medicationId " + presMedC.getMEDICATIONIDC().getValue());
            
           
           
        }
    }
    public void findMed(){
        List<Object> objectList = find("Med_c");
        System.out.println("size " + objectList.size());
        for (Object object : objectList) {
            
            MedC medC = (MedC)object;
            
            
            logger.info("drugName " +
                        medC.getNAMEC().getValue());
            logger.info("ndcCode " +
                        medC.getNDCCODEC().getValue());
            logger.info("medicationId " +
                        medC.getMEDICATIONIDC().getValue());
            // logger.info("getPrescriptionIdC " + prescriptionC.getPreIDC().getValue());

            System.out.println("medicationId " + medC.getMEDICATIONIDC().getValue());
            String id = medC.getMEDICATIONIDC().getValue().toString();
            String name = medC.getNAMEC().getValue();
        }
    }

    public void deleteAll(String objectName) {


        List<Object> objectList = find(objectName);
        System.out.println("objectName " + objectName);
        deleteAll(objectList, objectName);
    }

    public void deleteAll(List<Object> objectList, String objectName) {

        try {
            for (Object object : objectList) {
                customerCenterCustomObjectService.deleteEntity(object,
                                                               objectName);

            }
        } catch (ServiceException e) {
            e.printStackTrace();
        }

    }

    public void testUpdate() {
    }

    public List<Object> find(String objectName) {



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
            e.printStackTrace();
        }
        return returnList;
    }

}
