package com.oracle.ptsdemo.healthcare.business.datasync.custom;

import java.util.Date;

/**
 */
public class Patient {
    String patientId;
    String firstName;
    String lastName;
    String name;
    Date birth;
    
    
    boolean existingPatient; 
    String insuranceStatus;


    /**
     */
    public Patient() {
        super();
    }

    /**
     * @param patientId
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * @return
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param birth
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * @return
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param existingPatient
     */
    public void setExistingPatient(boolean existingPatient) {
        this.existingPatient = existingPatient;
    }

    /**
     * @return
     */
    public boolean isExistingPatient() {
        return existingPatient;
    }

    /**
     * @param insuranceStatus
     */
    public void setInsuranceStatus(String insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
    }

    /**
     * @return
     */
    public String getInsuranceStatus() {
        return insuranceStatus;
    }
}
