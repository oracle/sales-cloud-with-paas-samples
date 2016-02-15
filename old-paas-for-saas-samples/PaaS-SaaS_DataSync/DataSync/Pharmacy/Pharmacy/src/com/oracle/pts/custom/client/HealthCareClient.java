package com.oracle.pts.custom.client;

import com.oracle.pts.config.FusionConfig;


import com.oracle.pts.db.PharmacyDB;
import com.oracle.pts.healthcare.wsclient.HealthCare;
import com.oracle.pts.healthcare.wsclient.HealthCareService;
import com.oracle.pts.healthcare.wsclient.generated.ObjectFactory;

import com.oracle.pts.util.HttpUtil;
import com.oracle.pts.vo.Medication;


import com.oracle.pts.vo.Prescription;
import com.oracle.pts.webservice.pharmacy.PharmacyWS;

import com.sun.xml.ws.api.addressing.AddressingVersion;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.GregorianCalendar;
import java.util.Map;

import java.util.logging.Logger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;

public class HealthCareClient extends ObjectClient {
    private static HealthCareService healthCareService;
    private HealthCare healthCare;
    private static final AddressingVersion WS_ADDR_VER = AddressingVersion.W3C;
    private ObjectFactory objectFactory;
    Logger logger = Logger.getLogger("CRM");
    public HealthCareClient() {
        super();
        HttpUtil.removeProxy();
        init();
    }

    private void init() {
        String username =
            FusionConfig.getInstance().getProperty("HEALTHCARE_USER");
        String password =
            FusionConfig.getInstance().getProperty("HEALTHCARE_PASSWORD");


        //  Gabrielle.lee/welcome

        QName SERVICE_NAME =
            new QName("http://healthcare.webservice.pts.oracle.com/",
                      "HealthCareService");
        URL wsdlURL = null;
        try {
                       String httpString = "http";
                                  String ssl = FusionConfig.getInstance().getProperty("HEALTHCARE_SSL");
                       if(ssl!=null && ssl.equalsIgnoreCase("true")){
                           httpString+="s";
                       }
                       
            wsdlURL =
           //         new URL("http://localhost:7101/HealthCare-HealthCare-context-root/HealthCarePort?WSDL");
            new URL(httpString + "://" + FusionConfig.getInstance().getProperty("HEALTHCARE_URL") +
                    "/HealthCare/HealthCarePort?WSDL");
                   } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        healthCareService = new HealthCareService(wsdlURL, SERVICE_NAME);
        SecurityPoliciesFeature securityFeatures =
            new SecurityPoliciesFeature(new String[] { "oracle/wss_username_token_over_ssl_client_policy" });


        healthCare = healthCareService.getHealthCarePort();

        Map<String, Object> reqContext =
            ((BindingProvider)healthCare).getRequestContext();

            reqContext.put(BindingProvider.USERNAME_PROPERTY, username);
            reqContext.put(BindingProvider.PASSWORD_PROPERTY, password);
        objectFactory = new ObjectFactory();
    }

    public void setMedicationReadyToPickup(String orderNumber){
         healthCare.setMedicationReadyToPickup(orderNumber);
    }
    public String loadPrescription(String prescriptionId){
        String orderId = healthCare.loadPrescription(prescriptionId);
        return orderId;
    }


}
