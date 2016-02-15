package com.oracle.ptsdemo.healthcare.business.wsclient;


import com.oracle.ptsdemo.healthcare.business.HealthCareException;
import com.oracle.ptsdemo.healthcare.business.datasync.custom.Medication;
import com.oracle.ptsdemo.healthcare.business.datasync.custom.Prescription;
import com.oracle.ptsdemo.healthcare.business.util.FusionUtil;
import com.oracle.ptsdemo.healthcare.business.util.HttpUtil;
import com.oracle.ptsdemo.healthcare.wsclient.pharmacyload.wsclient.HealthCareLoad;
import com.oracle.ptsdemo.healthcare.wsclient.pharmacyload.wsclient.generated.ObjectFactory;

import com.sun.xml.ws.api.addressing.AddressingVersion;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 */
public class HealthCareLoadClient extends ObjectClient {
    private HealthCareLoad healthCareLoad;
    private static final AddressingVersion WS_ADDR_VER = AddressingVersion.W3C;
    private ObjectFactory objectFactory;
    Logger logger = Logger.getLogger(this.getClass().getName());

    /**
     */
    public HealthCareLoadClient() {
        super();
        HttpUtil.removeProxy();

    }


    /**
     * @param name
     * @param ndcCode
     */
    public void createMedication(String name, String ndcCode) {
        healthCareLoad.createMedication(name, ndcCode);
    }

    /**
     * @param prescription
     * @return
     */
    public String createPrescription(Prescription prescription) throws HealthCareException {
        com.oracle.ptsdemo.healthcare.wsclient.pharmacyload.wsclient.generated.Prescription mPrescription = convertPrescription(prescription);
        String prescriptionId = healthCareLoad.createPrescription(mPrescription);
        return prescriptionId;
    }    
    private com.oracle.ptsdemo.healthcare.wsclient.pharmacyload.wsclient.generated.Prescription convertPrescription(Prescription prescription) throws HealthCareException {
        
        com.oracle.ptsdemo.healthcare.wsclient.pharmacyload.wsclient.generated.Prescription mPrescription =
            objectFactory.createPrescription();
        
        
        
             mPrescription.setDoctorId(prescription.getDoctorId());
             mPrescription.setPatientid(prescription.getPatientid());
             
             
             prescription.setVisitId(FusionUtil.getSystemGeneratedNumber());
             mPrescription.setVisitId(prescription.getVisitId());


        mPrescription.setPrescriptionDate(getXMLGregorianCalendar(prescription.getPrescriptionDate()));
            mPrescription.setExpireDate(getXMLGregorianCalendar(prescription.getPrescriptionDate()));
             
            for(Medication medication:prescription.getMedicationList()){

                com.oracle.ptsdemo.healthcare.wsclient.pharmacyload.wsclient.generated.Medication mMedication = objectFactory.createMedication();
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

    /**
     * @return
     */
    public List<String> getMedicationList(){
        List<String>  medicationList =  healthCareLoad.getMedicationList();
        return medicationList;
    }

    /**
     * @param date
     * @return
     */
    public XMLGregorianCalendar getXMLGregorianCalendar(Date date) throws HealthCareException {
        XMLGregorianCalendar xmlCalendar = null;
        if(date!=null){
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            try {
                xmlCalendar =
                        DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
            } catch (DatatypeConfigurationException e) {
                 throw new HealthCareException(e);
            }
        }
        return xmlCalendar;
    }

    /**
     * @return
     */
    public List<Medication> getMedicationDetailList(){
        List<Medication> rMedicatinoList = new ArrayList<Medication>();
        
        List<com.oracle.ptsdemo.healthcare.wsclient.pharmacyload.wsclient.generated.Medication>  medicationDetailList =  healthCareLoad.getMedicationDetailList();
        for(com.oracle.ptsdemo.healthcare.wsclient.pharmacyload.wsclient.generated.Medication medication:medicationDetailList){
            Medication rMedication = convertMeidcation(medication);
            rMedicatinoList.add(rMedication);
        }

        return rMedicatinoList;
    }
    private Medication convertMeidcation(com.oracle.ptsdemo.healthcare.wsclient.pharmacyload.wsclient.generated.Medication medication) {
        
        Medication rMedication = new Medication();

            rMedication.setNdcCode(medication.getNdcCode());
        rMedication.setDrugName(medication.getDrugName());
        rMedication.setMedicationId(medication.getMedicationId());
            return rMedication;
    }    

}
