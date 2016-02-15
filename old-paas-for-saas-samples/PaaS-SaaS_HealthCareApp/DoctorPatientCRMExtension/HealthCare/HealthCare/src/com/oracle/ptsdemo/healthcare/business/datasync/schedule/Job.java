package com.oracle.ptsdemo.healthcare.business.datasync.schedule;

import java.util.Date;

/**
 */
public class Job {
    private String name;
    private Date startTime;
    private Date endTime;
    private String status;
    private short interval;
    private String intervalUnit;

    /**
     */
    public static final String Pharmacy = "Pharmacy";

    /**
     */
    public static final String BIReport = "BIReport";


    /**
     */
    public Job() {
        super();
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     */
    public String getStatus() {
        return status;
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
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return
     */
    public Date getEndTime() {
        return endTime;
    }


    /**
     * @param interval
     */
    public void setInterval(short interval) {
        this.interval = interval;
    }

    /**
     * @return
     */
    public short getInterval() {
        return interval;
    }

    /**
     * @param intervalUnit
     */
    public void setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * @return
     */
    public String getIntervalUnit() {
        return intervalUnit;
    }
}
