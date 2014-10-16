package com.oracle.ptsdemo.healthcare.business.datasync.custom;

import java.util.Date;
import java.util.logging.Logger;

/**
 */
public class Medication {

    private String prescriptionId;
    private String medicationId;
    private short quantity;
    private short refills;
    private String pharmacyId;
    private String directionsForUse;
    private boolean readyToPickup;
    private Date expireDate;
    private boolean sendToPharmacy;
    private Date sendToPharmacyDate;
    private String orderNumber;

    private String ndcCode;
    private String drugName;

    private Doctor doctor;
    private Patient patient;

    private  final Logger logger = Logger.getLogger(this.getClass().getName());

    /**
     */
    public Medication() {
        super();
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
     * @param medicationId
     */
    public void setMedicationId(String medicationId) {
        this.medicationId = medicationId;
    }

    /**
     * @return
     */
    public String getMedicationId() {
        return medicationId;
    }

    /**
     * @param quantity
     */
    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    /**
     * @return
     */
    public short getQuantity() {
        return quantity;
    }

    /**
     * @param refills
     */
    public void setRefills(short refills) {
        this.refills = refills;
    }

    /**
     * @return
     */
    public short getRefills() {
        return refills;
    }

    /**
     * @param pharmacyId
     */
    public void setPharmacyId(String pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    /**
     * @return
     */
    public String getPharmacyId() {
        return pharmacyId;
    }

    /**
     * @param directionsForUse
     */
    public void setDirectionsForUse(String directionsForUse) {
        this.directionsForUse = directionsForUse;
    }

    /**
     * @return
     */
    public String getDirectionsForUse() {
        return directionsForUse;
    }

    /**
     * @param readyToPickup
     */
    public void setReadyToPickup(boolean readyToPickup) {
        this.readyToPickup = readyToPickup;
    }

    /**
     * @return
     */
    public boolean isReadyToPickup() {
        return readyToPickup;
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
     * @param sendToPharmacy
     */
    public void setSendToPharmacy(boolean sendToPharmacy) {
        this.sendToPharmacy = sendToPharmacy;
    }

    /**
     * @return
     */
    public boolean isSendToPharmacy() {
        return sendToPharmacy;
    }

    /**
     * @param sendToPharmacyDate
     */
    public void setSendToPharmacyDate(Date sendToPharmacyDate) {
        this.sendToPharmacyDate = sendToPharmacyDate;
    }

    /**
     * @return
     */
    public Date getSendToPharmacyDate() {
        return sendToPharmacyDate;
    }

    /**
     * @param orderNumber
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * @return
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * @param ndcCode
     */
    public void setNdcCode(String ndcCode) {
        this.ndcCode = ndcCode;
    }

    /**
     * @return
     */
    public String getNdcCode() {
        return ndcCode;
    }

    /**
     * @param doctor
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     * @return
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * @param patient
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * @return
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     */
    public void print() {
        logger.info("print prescription is called");


        logger.info("prescriptionId " + prescriptionId);
        logger.info("docmedicationIdtorId " + medicationId);
        logger.info("quantity " + quantity);
        logger.info("refills " + refills);
        logger.info("pharmacyId " + pharmacyId);
        logger.info("directionsForUse " + directionsForUse);
        logger.info("readyToPickup " + readyToPickup);
        logger.info("expireDate " + expireDate);
        logger.info("sendToPharmacy " + sendToPharmacy);
        logger.info("orderNumber " + orderNumber);
        logger.info("ndcCode " + ndcCode);


    }

    /**
     * @param drugName
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    /**
     * @return
     */
    public String getDrugName() {
        return drugName;
    }
}
