package com.oracle.ptsdemo.healthcare.business.datasync.schedule;

import java.text.SimpleDateFormat;

import java.util.Date;


/**
 */
public class OracleJob {
    String logId;
    Date logDate;
    String operation;
    String status;


    /**
     */
    public OracleJob() {
        super();
    }

    /**
     * @param logId
     */
    public void setLogId(String logId) {
        this.logId = logId;
    }

    /**
     * @return
     */
    public String getLogId() {
        return logId;
    }

    /**
     * @param operation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * @return
     */
    public String getOperation() {
        return operation;
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
     * @param logDate
     */
    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    /**
     * @return
     */
    public Date getLogDate() {
        return logDate;
    }

    /**
     * @return
     */
    public String getFormatLogDate(){
        String returnString = "";
        if(logDate!=null){
            returnString = format(logDate);
        }
        return returnString;
    }


    private String format(Date date){
        String returnString = "";
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        returnString = dateFormat.format(date);
        return returnString;
        
    }    
}
