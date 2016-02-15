package com.oracle.pts.custom.client;

import com.oracle.pts.config.FusionConfig;


import com.oracle.pts.pharmacy.wsclient.PharmacyWS;
import com.oracle.pts.pharmacy.wsclient.PharmacyWSService;

import com.oracle.pts.pharmacy.wsclient.generated.ObjectFactory;
import com.oracle.pts.pharmacy.wsclient.generated.Prescription;

import com.oracle.pts.util.HttpUtil;
import com.oracle.pts.vo.Medication;

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

public class PharmacyClient extends ObjectClient {
    private static PharmacyWSService pharmacyWSService;
    private static final AddressingVersion WS_ADDR_VER = AddressingVersion.W3C;
    private PharmacyWS pharmacyWS;
    private ObjectFactory objectFactory;
    Logger logger = Logger.getLogger("CRM");
    public PharmacyClient() {
        super();
        HttpUtil.removeProxy();
        init();
    }

    private void init() {
        // as a bug
        System.setProperty("javax.xml.transform.TransformerFactory","com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl");
        String username =
            FusionConfig.getInstance().getProperty("PHARMACY_USER");
        String password =
            FusionConfig.getInstance().getProperty("PHARMACY_PASSWORD");



        QName SERVICE_NAME =
            new QName("http://pharmacy.webservice.pts.oracle.com/",
                      "PharmacyWSService");
        URL wsdlURL = null;
        try {
            wsdlURL =
        
            new URL("https://" + FusionConfig.getInstance().getProperty("PHARMACY_URL") +
                    "/Pharmacy/PharmacyWSPort?WSDL");
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        pharmacyWSService = new PharmacyWSService(wsdlURL, SERVICE_NAME);
        SecurityPoliciesFeature securityFeatures =
            new SecurityPoliciesFeature(new String[] { "oracle/wss_username_token_over_ssl_client_policy" });


        pharmacyWS = pharmacyWSService.getPharmacyWSPort();

        Map<String, Object> reqContext =
            ((BindingProvider)pharmacyWS).getRequestContext();
             reqContext.put(BindingProvider.USERNAME_PROPERTY, username);
            reqContext.put(BindingProvider.PASSWORD_PROPERTY, password);
        objectFactory = new ObjectFactory();
    }

    public void createPrescription() {
        Prescription prescription = objectFactory.createPrescription();
        pharmacyWS.createPrescription(prescription);
    }

    public String createMedication(Medication medication) {
        com.oracle.pts.pharmacy.wsclient.generated.Medication mMedication =
            convertMedication(medication);
        String orderId = pharmacyWS.createMedication(mMedication);
        
        logger.info("orderId **************************** " + orderId);
        return orderId;
    }
    public void setMedicationReadyToPickup(String orderNumber){
        pharmacyWS.setMedicationReadyToPickup(orderNumber);
    }
    public void loadMedicationListFromHealthCare(){
        pharmacyWS.loadMedicationListFromHealthCare();
    }
    public void loadMedicationListForHealthCare(){
        pharmacyWS.loadMedicationListForHealthCare();
    }
    public void loadHealthCareProviderList(){
        pharmacyWS.loadHealthCareProviderList();
    }
    private com.oracle.pts.pharmacy.wsclient.generated.Medication convertMedication(Medication medication) {
        
        
        com.oracle.pts.pharmacy.wsclient.generated.Medication mMedication =
            objectFactory.createMedication();

        mMedication.setDirectionsForUse(medication.getDirectionsForUse());

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(medication.getExpireDate());
        XMLGregorianCalendar xmlCalendar = null;
        try {
            xmlCalendar =
                    DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        mMedication.setExpireDate(xmlCalendar);
        mMedication.setNdcCode(medication.getNdcCode());
        mMedication.setQuantity(medication.getQuantity());
        mMedication.setRefills(medication.getRefills());
        
        com.oracle.pts.pharmacy.wsclient.generated.Doctor mDoctor =
            objectFactory.createDoctor();
        com.oracle.pts.pharmacy.wsclient.generated.Patient mPatient =
            objectFactory.createPatient();
        
        
        mMedication.setDoctor(mDoctor);
        mDoctor.setName(medication.getDoctor().getName());
        
        mMedication.setPatient(mPatient);
        mPatient.setName(medication.getPatient().getName());
        mPatient.setExistingPatient(medication.getPatient().isExistingPatient());
        mPatient.setInsuranceStatus(medication.getPatient().getInsuranceStatus());
        return mMedication;
    }

}
