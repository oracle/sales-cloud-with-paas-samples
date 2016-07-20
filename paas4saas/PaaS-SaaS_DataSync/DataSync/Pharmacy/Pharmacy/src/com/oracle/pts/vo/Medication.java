package com.oracle.pts.vo;

import java.util.Date;
import java.util.logging.Logger;

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

    private static final Logger logger = Logger.getLogger("CRM");

    public Medication() {
        super();
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setMedicationId(String medicationId) {
        this.medicationId = medicationId;
    }

    public String getMedicationId() {
        return medicationId;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setRefills(short refills) {
        this.refills = refills;
    }

    public short getRefills() {
        return refills;
    }

    public void setPharmacyId(String pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    public String getPharmacyId() {
        return pharmacyId;
    }

    public void setDirectionsForUse(String directionsForUse) {
        this.directionsForUse = directionsForUse;
    }

    public String getDirectionsForUse() {
        return directionsForUse;
    }

    public void setReadyToPickup(boolean readyToPickup) {
        this.readyToPickup = readyToPickup;
    }

    public boolean isReadyToPickup() {
        return readyToPickup;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setSendToPharmacy(boolean sendToPharmacy) {
        this.sendToPharmacy = sendToPharmacy;
    }

    public boolean isSendToPharmacy() {
        return sendToPharmacy;
    }

    public void setSendToPharmacyDate(Date sendToPharmacyDate) {
        this.sendToPharmacyDate = sendToPharmacyDate;
    }

    public Date getSendToPharmacyDate() {
        return sendToPharmacyDate;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setNdcCode(String ndcCode) {
        this.ndcCode = ndcCode;
    }

    public String getNdcCode() {
        return ndcCode;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

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

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugName() {
        return drugName;
    }
}
