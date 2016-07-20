package com.oracle.pts.custom.load;

import com.oracle.pts.custom.client.PharmacyClient;
import com.oracle.pts.db.HealthCareDB;
import com.oracle.pts.db.MappingObjDB;
import com.oracle.pts.vo.Medication;
import com.oracle.pts.vo.Prescription;

import java.util.logging.Logger;

public class PharmacyLoadTgr extends PharmacyClient{
    Logger logger = Logger.getLogger("CRM");
    public PharmacyLoadTgr() {
        super();
    }
    public void loadPrescriptionX(){
        
        MappingObjDB mappingObjDB  = new MappingObjDB();
        mappingObjDB.load();
        createPrescription();
    }
    public void loadPrescription(Prescription prescription){
        logger.info("PharmacyLoadTgr.loadPrescription is called************");
        if(prescription!=null){
            logger.info("prescription.getMedicationList().size ******** " + prescription.getMedicationList().size());
            for(Medication medication:prescription.getMedicationList()){
                String orderId = createMedication(medication);
                medication.setOrderNumber(orderId);
                HealthCareDB healthCareDB = new HealthCareDB();
                healthCareDB.updatePrescriptionMedicationOrderId(medication);
            }
        }
        
    }
}
