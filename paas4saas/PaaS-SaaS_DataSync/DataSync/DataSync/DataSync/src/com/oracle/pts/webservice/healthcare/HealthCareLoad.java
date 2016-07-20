package com.oracle.pts.webservice.healthcare;

import com.oracle.pts.db.HealthCareDB;

import com.oracle.pts.util.FusionUtil;

import com.oracle.pts.vo.Medication;
import com.oracle.pts.vo.Prescription;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HealthCareLoad {
    private static final Logger logger = Logger.getLogger("CRM");

    public HealthCareLoad() {
        super();
    }


    @Oneway
    @WebMethod
    public void createMedication(String name, String ndcCode) {
        HealthCareDB healthCareDB = new HealthCareDB();
        healthCareDB.createMedication(name, ndcCode);
    }

    @WebMethod
    public String createPrescription(Prescription prescription) {
        HealthCareDB healthCareDB = new HealthCareDB();
        String prescriptionId = healthCareDB.createPrescription(prescription);
        return prescriptionId;
    }

    @WebMethod
    public List<String> getMedicationList(){
        HealthCareDB healthCareDB = new HealthCareDB();
        List<String> medicationList = healthCareDB.getMedicationList();
        return medicationList;
    }

    @WebMethod
    public List<Medication> getMedicationDetailList(){
        HealthCareDB healthCareDB = new HealthCareDB();
        List<Medication> medicationDetailList = healthCareDB.getMedicationDetailList();
        
        return medicationDetailList;
    }

}