package com.oracle.pts.custom.load;
import com.oracle.pts.custom.client.CustomObjectClient;
import com.oracle.pts.db.HealthCareDB;
import com.oracle.pts.vo.Prescription;

public class PharmacyLoadSrc extends CustomObjectClient{
    public PharmacyLoadSrc() {
        super();
    }
    public void loadPrescription(){
        HealthCareDB healthCareDB = new HealthCareDB();
        healthCareDB.loadPrescription();
    }
    public Prescription loadPrescription(String prescriptionId){
        HealthCareDB healthCareDB  = new HealthCareDB();
        Prescription prescription = healthCareDB.loadPrescription(prescriptionId);
        return prescription;

    }
}
