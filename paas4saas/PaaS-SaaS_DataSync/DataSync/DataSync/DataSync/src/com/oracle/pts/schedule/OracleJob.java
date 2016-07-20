package com.oracle.pts.schedule;

import java.text.SimpleDateFormat;

import java.util.Date;

public class OracleJob {
    String logId;
    Date logDate;
    String operation;
    String status;
    
    
    
    
    public OracleJob() {
        super();
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getLogId() {
        return logId;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    public Date getLogDate() {
        return logDate;
    }
    public String getFormatLogDate(){
        String returnString = "";
        if(logDate!=null){
            returnString = format(logDate);
        }
        return returnString;
    }
    public void setFormatLogDate(String formatLogDate){
        
    }
    private String format(Date date){
        String returnString = "";
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        returnString = dateFormat.format(date);
        return returnString;
        
    }    
}
