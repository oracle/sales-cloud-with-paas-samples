package com.oracle.pts.vo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class Prescription {
    private String prescriptionId;
    private String doctorId;
    private String patientid;
    private String visitId;
    private Date prescriptionDate;
    private Date expireDate;

    private List<Medication> medicationList;
    
    
    private static final Logger logger = Logger.getLogger("CRM");
    public Prescription() {
        super();
        init();
    }
    private void init(){
        medicationList = new ArrayList<Medication>();
    }

    public void setMedicationList(List<Medication> medicationList) {
        this.medicationList = medicationList;
    }

    public List<Medication> getMedicationList() {
        return medicationList;
    }


    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setPrescriptionDate(Date prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }

    public Date getPrescriptionDate() {
        return prescriptionDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void print() {
        logger.info("print prescription is called");

        logger.info("prescriptionId " + prescriptionId);
        logger.info("doctorId " + doctorId);
        logger.info("patientid " + patientid);
        logger.info("visitId " + visitId);
        logger.info("prescriptionDate " + prescriptionDate);
        logger.info("expireDate " + expireDate);

        for (Medication medication : medicationList) {
            medication.print();


        }

    }
}
