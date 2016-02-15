package com.oracle.ptsdemo.healthcare.view.bean;

import java.util.Date;

public class MedicationReport {
    
    private String id;
    private Date startDate;
    private Date endDate;
    private String name;
    
    public MedicationReport(String id, Date startDate, Date endDate, String name) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.name = name;
    }
    
    public MedicationReport(Long id, Date startDate, Date endDate, String name) {
        this(String.valueOf(id), startDate, endDate, name);
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
