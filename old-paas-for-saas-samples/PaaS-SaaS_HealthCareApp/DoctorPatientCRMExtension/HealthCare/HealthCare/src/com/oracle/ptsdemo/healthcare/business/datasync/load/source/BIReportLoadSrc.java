package com.oracle.ptsdemo.healthcare.business.datasync.load.source;


import com.oracle.ptsdemo.healthcare.business.datasync.custom.Medication;
import com.oracle.ptsdemo.healthcare.business.datasync.custom.Prescription;
import com.oracle.ptsdemo.healthcare.ws.db.HealthCareDB;

import java.util.List;

/**
 */
public class BIReportLoadSrc {
    /**
     */
    public BIReportLoadSrc() {
        super();
    }

    /**
     * @return
     */
    public List<Prescription> loadPrescription(){
        
        HealthCareDB healthCareDB = new HealthCareDB();
        List<Prescription> prescriptionList = healthCareDB.loadPrescription();
        
        
        return prescriptionList;
    }

    /**
     * @return
     */
    public List<Medication> loadAllMedication(){
        HealthCareDB healthCareDB = new HealthCareDB();
        List<Medication> medicationList = healthCareDB.getMedicationDetailList();
        return medicationList;
    }
}
