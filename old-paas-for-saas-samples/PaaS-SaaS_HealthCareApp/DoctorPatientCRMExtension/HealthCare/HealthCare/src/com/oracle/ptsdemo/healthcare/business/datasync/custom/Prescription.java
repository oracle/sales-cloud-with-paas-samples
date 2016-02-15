package com.oracle.ptsdemo.healthcare.business.datasync.custom;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;


/**
 */
public class Prescription {
    private String prescriptionId;
    private String doctorId;
    private String patientid;
    private String visitId;
    private Date prescriptionDate;
    private Date expireDate;

    private List<Medication> medicationList;
    
    
    private  final Logger logger = Logger.getLogger(this.getClass().getName());

    /**
     */
    public Prescription() {
        super();
        init();
    }
    private void init(){
        medicationList = new ArrayList<Medication>();
    }

    /**
     * @param medicationList
     */
    public void setMedicationList(List<Medication> medicationList) {
        this.medicationList = medicationList;
    }

    /**
     * @return
     */
    public List<Medication> getMedicationList() {
        return medicationList;
    }


    /**
     * @param doctorId
     */
    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    /**
     * @return
     */
    public String getDoctorId() {
        return doctorId;
    }

    /**
     * @param patientid
     */
    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    /**
     * @return
     */
    public String getPatientid() {
        return patientid;
    }

    /**
     * @param visitId
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * @return
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * @param prescriptionDate
     */
    public void setPrescriptionDate(Date prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }

    /**
     * @return
     */
    public Date getPrescriptionDate() {
        return prescriptionDate;
    }

    /**
     * @param expireDate
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * @return
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * @param prescriptionId
     */
    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    /**
     * @return
     */
    public String getPrescriptionId() {
        return prescriptionId;
    }

    /**
     */
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
