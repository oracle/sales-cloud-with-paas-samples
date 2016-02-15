package com.oracle.pts.schedule;

import java.util.Date;

public class Job {
    String name;
    Date startTime;
    Date endTime;
    String status;
    short interval;
    String intervalUnit;
    
    public static final String Pharmacy = "Pharmacy";
    public static final String BIReport = "BIReport";
    public Job() {
        super();
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return endTime;
    }


    public void setInterval(short interval) {
        this.interval = interval;
    }

    public short getInterval() {
        return interval;
    }

    public void setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    public String getIntervalUnit() {
        return intervalUnit;
    }
}
