package com.oracle.pts.vo;

import java.util.Date;

public class Patient {
    String patientId;
    String firstName;
    String lastName;
    String name;
    Date birth;
    
    
    boolean existingPatient; 
    String insuranceStatus;


    public Patient() {
        super();
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getBirth() {
        return birth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setExistingPatient(boolean existingPatient) {
        this.existingPatient = existingPatient;
    }

    public boolean isExistingPatient() {
        return existingPatient;
    }

    public void setInsuranceStatus(String insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
    }

    public String getInsuranceStatus() {
        return insuranceStatus;
    }
}
