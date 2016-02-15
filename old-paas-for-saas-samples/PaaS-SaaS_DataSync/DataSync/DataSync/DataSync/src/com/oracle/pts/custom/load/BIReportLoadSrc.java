package com.oracle.pts.custom.load;

import com.oracle.pts.db.HealthCareDB;

import com.oracle.pts.vo.Medication;
import com.oracle.pts.vo.Prescription;

import java.util.List;

public class BIReportLoadSrc {
    public BIReportLoadSrc() {
        super();
    }
    public List<Prescription> loadPrescription(){
        HealthCareDB healthCareDB = new HealthCareDB();
        List<Prescription> prescriptionList = healthCareDB.loadPrescription();
        return prescriptionList;
    }
    public List<Medication> loadAllMedication(){
        HealthCareDB healthCareDB = new HealthCareDB();
        List<Medication> medicationList = healthCareDB.getMedicationDetailList();
        return medicationList;
    }
}
