package com.oracle.ptsdemo.healthcare.view.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrescriptionReport {
    
    private List<MedicationReport> medications;
    private Date startDate;
    private Date endDate;
    private String id;
    private String description;
    
    
    public PrescriptionReport() {
        medications = new ArrayList<MedicationReport>();
    }

    public void setMedications(List<MedicationReport> medications) {
        this.medications = medications;
    }

    public List<MedicationReport> getMedications() {
        return medications;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
