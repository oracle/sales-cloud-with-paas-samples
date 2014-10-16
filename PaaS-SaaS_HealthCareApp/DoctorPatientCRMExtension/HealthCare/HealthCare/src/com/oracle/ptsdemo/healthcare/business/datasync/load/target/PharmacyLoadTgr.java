package com.oracle.ptsdemo.healthcare.business.datasync.load.target;

import com.oracle.ptsdemo.healthcare.business.datasync.custom.Medication;
import com.oracle.ptsdemo.healthcare.business.datasync.custom.Prescription;
import com.oracle.ptsdemo.healthcare.business.wsclient.PharmacyClient;
import com.oracle.ptsdemo.healthcare.ws.db.HealthCareDB;

import java.util.Calendar;

/**
 */
public class PharmacyLoadTgr extends PharmacyClient{
    
    static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(PharmacyLoadTgr.class);

    /**
     */
    public PharmacyLoadTgr() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : constructor");
        }
    }


    /**
     * @param prescription
     */
    public void sendPrescriptionToPharmacy(Prescription prescription){
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + ".loadPrescription(Prescription prescription))");
        }
        
        if(prescription!=null){
            if (logger.isDebugEnabled()) {            
                logger.debug("Size of list of medications: "+ prescription.getMedicationList() != null ? prescription.getMedicationList().size() : "null");
            }
            
            for(Medication medication : prescription.getMedicationList()){
                String orderId = this.sendOrderForMedicationToPharmacy(medication);
                medication.setSendToPharmacy(true);
                medication.setSendToPharmacyDate(Calendar.getInstance().getTime());
                
                medication.setOrderNumber(orderId);
                HealthCareDB healthCareDB = new HealthCareDB();
                healthCareDB.updatePrescriptionMedicationOrderId(medication);
            }
        }
        
    }
}
