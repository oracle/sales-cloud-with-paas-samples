package com.oracle.ptsdemo.healthcare.business.datasync.load.source;

import com.oracle.ptsdemo.healthcare.business.HealthCareException;
import com.oracle.ptsdemo.healthcare.business.datasync.custom.Prescription;
import com.oracle.ptsdemo.healthcare.business.wsclient.CustomObjectClient;
import com.oracle.ptsdemo.healthcare.ws.db.HealthCareDB;

/**
 */
public class PharmacyLoadSrc extends CustomObjectClient{
    /**
     */
    public PharmacyLoadSrc() throws HealthCareException {
        super();
    }

    /**
     */
    public void loadPrescription(){
        HealthCareDB healthCareDB = new HealthCareDB();
        healthCareDB.loadPrescription();
    }

    /**
     * @param prescriptionId
     * @return
     */
    public Prescription loadPrescriptionFromDBCS(String prescriptionId){
        HealthCareDB healthCareDB  = new HealthCareDB();
        Prescription prescription = healthCareDB.loadPrescription(prescriptionId);
        return prescription;

    }
}
