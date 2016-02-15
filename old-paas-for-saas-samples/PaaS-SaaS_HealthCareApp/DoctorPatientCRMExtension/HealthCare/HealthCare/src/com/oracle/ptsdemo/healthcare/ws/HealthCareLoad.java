package com.oracle.ptsdemo.healthcare.ws;


import com.oracle.ptsdemo.healthcare.business.datasync.custom.Medication;
import com.oracle.ptsdemo.healthcare.business.datasync.custom.Prescription;
import com.oracle.ptsdemo.healthcare.ws.db.HealthCareDB;

import java.util.List;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;


/**
 */
@WebService
public class HealthCareLoad {

    /**
     */
    public HealthCareLoad() {
        super();
    }


    /**
     * @param name
     * @param ndcCode
     */
    @Oneway
    @WebMethod
    public void createMedication(String name, String ndcCode) {
        HealthCareDB healthCareDB = new HealthCareDB();
        healthCareDB.createMedication(name, ndcCode);
    }

    /**
     * @param prescription
     * @return
     */
    @WebMethod
    public String createPrescription(Prescription prescription) {
        HealthCareDB healthCareDB = new HealthCareDB();
        String prescriptionId = healthCareDB.createPrescription(prescription);
        return prescriptionId;
    }

    /**
     * @return
     */
    @WebMethod
    public List<String> getMedicationList(){
        HealthCareDB healthCareDB = new HealthCareDB();
        List<String> medicationList = healthCareDB.getMedicationList();
        return medicationList;
    }

    /**
     * @return
     */
    @WebMethod
    public List<Medication> getMedicationDetailList(){
        HealthCareDB healthCareDB = new HealthCareDB();
        List<Medication> medicationDetailList = healthCareDB.getMedicationDetailList();
        
        return medicationDetailList;
    }

}