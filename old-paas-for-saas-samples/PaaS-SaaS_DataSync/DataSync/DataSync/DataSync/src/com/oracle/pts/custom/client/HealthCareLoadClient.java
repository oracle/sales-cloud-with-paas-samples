package com.oracle.pts.custom.client;

import com.oracle.pts.config.FusionConfig;



import com.oracle.pts.healthcare.load.wsclient.HealthCareLoad;
import com.oracle.pts.healthcare.load.wsclient.HealthCareLoadService;
import com.oracle.pts.healthcare.load.wsclient.generated.ObjectFactory;
import com.oracle.pts.util.FusionUtil;
import com.oracle.pts.util.HttpUtil;
import com.oracle.pts.vo.Medication;


import com.oracle.pts.vo.Prescription;


import com.sun.xml.ws.api.addressing.AddressingVersion;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import java.util.logging.Logger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;

public class HealthCareLoadClient extends ObjectClient {
    private static HealthCareLoadService healthCareLoadService;
    private HealthCareLoad healthCareLoad;
    private static final AddressingVersion WS_ADDR_VER = AddressingVersion.W3C;
    private ObjectFactory objectFactory;
    Logger logger = Logger.getLogger("CRM");
    public HealthCareLoadClient() {
        super();
        HttpUtil.removeProxy();
        init();
    }

    private void init() {
        // as a bug
        System.setProperty("javax.xml.transform.TransformerFactory","com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl");
        String username =
            FusionConfig.getInstance().getProperty("HEALTHCARE_USER");
        String password =
            FusionConfig.getInstance().getProperty("HEALTHCARE_PASSWORD");


        //  Gabrielle.lee/welcome

        QName SERVICE_NAME =
            new QName("http://healthcare.webservice.pts.oracle.com/",
                      "HealthCareLoadService");
        URL wsdlURL = null;
        try {
            wsdlURL =
            new URL("https://" + FusionConfig.getInstance().getProperty("HEALTHCARE_URL") +
                    "/DataSync/HealthCareLoadPort?WSDL");
                   } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        healthCareLoadService = new HealthCareLoadService(wsdlURL, SERVICE_NAME);
        SecurityPoliciesFeature securityFeatures =
            new SecurityPoliciesFeature(new String[] { "oracle/wss_username_token_over_ssl_client_policy" });

        healthCareLoad = healthCareLoadService.getHealthCareLoadPort();

        Map<String, Object> reqContext =
            ((BindingProvider)healthCareLoad).getRequestContext();

            reqContext.put(BindingProvider.USERNAME_PROPERTY, username);
            reqContext.put(BindingProvider.PASSWORD_PROPERTY, password);
        objectFactory = new ObjectFactory();
    }

    public void createMedication(String name, String ndcCode) {
        healthCareLoad.createMedication(name, ndcCode);
    }    
    public String createPrescription(Prescription prescription) {
        com.oracle.pts.healthcare.load.wsclient.generated.Prescription mPrescription = convertPrescription(prescription);
        String prescriptionId = healthCareLoad.createPrescription(mPrescription);
        return prescriptionId;
    }    
    private com.oracle.pts.healthcare.load.wsclient.generated.Prescription convertPrescription(Prescription prescription) {
        
        
        com.oracle.pts.healthcare.load.wsclient.generated.Prescription mPrescription =
            objectFactory.createPrescription();
        
        
        
             mPrescription.setDoctorId(prescription.getDoctorId());
             mPrescription.setPatientid(prescription.getPatientid());
             
             
             prescription.setVisitId(FusionUtil.getSystemGeneratedNumber());
             mPrescription.setVisitId(prescription.getVisitId());

             Date prescriptionDate = new Date();
             Date expireDate =
                 new Date(prescriptionDate.getTime() + 1000 * 60 * 60 * 24 * 30);
             
             
            mPrescription.setPrescriptionDate(getXMLGregorianCalendar(prescription.getPrescriptionDate()));
            mPrescription.setExpireDate(getXMLGregorianCalendar(prescription.getPrescriptionDate()));
             
            for(Medication medication:prescription.getMedicationList()){

                com.oracle.pts.healthcare.load.wsclient.generated.Medication mMedication = objectFactory.createMedication();
                mMedication.setMedicationId(medication.getMedicationId());
                mMedication.setQuantity(medication.getQuantity());
                mMedication.setRefills(medication.getRefills());
                mMedication.setPharmacyId(medication.getPharmacyId());
                mMedication.setDirectionsForUse(medication.getDirectionsForUse());
                mMedication.setReadyToPickup(medication.isReadyToPickup());
                
                mMedication.setExpireDate(getXMLGregorianCalendar(medication.getExpireDate()));
                
                
                
                mMedication.setSendToPharmacy(medication.isSendToPharmacy());
                mPrescription.getMedicationList().add(mMedication);

                
            }

            return mPrescription;
    }    
    public List<String> getMedicationList(){
        List<String>  medicationList =  healthCareLoad.getMedicationList();
        return medicationList;
    }
    public XMLGregorianCalendar getXMLGregorianCalendar(Date date){
        XMLGregorianCalendar xmlCalendar = null;
        if(date!=null){
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            try {
                xmlCalendar =
                        DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
            } catch (DatatypeConfigurationException e) {
                e.printStackTrace();
            }
        }
        return xmlCalendar;
    }
    public List<Medication> getMedicationDetailList(){
        List<Medication> rMedicatinoList = new ArrayList<Medication>();
        
        List<com.oracle.pts.healthcare.load.wsclient.generated.Medication>  medicationDetailList =  healthCareLoad.getMedicationDetailList();
        for(com.oracle.pts.healthcare.load.wsclient.generated.Medication medication:medicationDetailList){
            Medication rMedication = convertMeidcation(medication);
            rMedicatinoList.add(rMedication);
        }

        return rMedicatinoList;
    }
    private Medication convertMeidcation(com.oracle.pts.healthcare.load.wsclient.generated.Medication medication) {
        
        Medication rMedication = new Medication();

            rMedication.setNdcCode(medication.getNdcCode());
        rMedication.setDrugName(medication.getDrugName());
        rMedication.setMedicationId(medication.getMedicationId());
            return rMedication;
    }    

}
