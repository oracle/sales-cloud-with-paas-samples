package com.oracle.pts.ui.bean;

import com.oracle.pts.custom.MetaInfoFactory;

import com.oracle.pts.custom.load.DataLoad;

import com.oracle.pts.db.OracleSchedulerDB;
import com.oracle.pts.db.SchedulerDB;
import com.oracle.pts.schedule.Job;

import com.oracle.pts.schedule.OracleJob;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.logging.Logger;

import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import oracle.adf.view.rich.context.AdfFacesContext;

public class ConnectorSync {
    private List<String> targetObjectSelectList;
    private List<SelectItem> targetObjectList;
    
    private boolean selectAll;
    private boolean selectBetween;
    
    
    private Date startDate;
    private Date endDate;
    
    private short interval;
    
    private String intervalUnit;
    private List<SelectItem> intervalUnitList;
    
    
    private List<OracleJob> oracleJobList;
    private static final Logger logger = Logger.getLogger("CRM");   
    public ConnectorSync() {
        super();
        init();
    }
    private void init(){
        
        
        
        targetObjectSelectList = new ArrayList<String>();
        targetObjectList = new ArrayList<SelectItem>();
        
       
           SelectItem item = new SelectItem("name","value");
            targetObjectList.add(item);
       
        
        SelectItem itemT = new SelectItem("Participant", "Participant");
        targetObjectList.add(itemT);
        itemT = new SelectItem("Position Hierarchy", "Position Hierarchy");
        targetObjectList.add(itemT);

          targetObjectSelectList.add("nameTargetObjectSelect");
     

      

       selectAll = true;
       
       
       
        SchedulerDB schedulerDB = new SchedulerDB();
        Job job = schedulerDB.getJob(Job.BIReport);
       
       
       
    
       startDate = job.getStartTime();
       interval = job.getInterval();
        intervalUnit = job.getIntervalUnit();
        intervalUnitList = new ArrayList<SelectItem>();
        intervalUnitList.add(new SelectItem("Minutely", "Minutely"));
        intervalUnitList.add(new SelectItem("Hourly", "Hourly"));
        intervalUnitList.add(new SelectItem("Daily", "Daily"));
        intervalUnitList.add(new SelectItem("Weekly", "Weekly"));
        intervalUnitList.add(new SelectItem("Monthly", "Monthly"));
        

    
        OracleSchedulerDB oracleScheduleDB = new OracleSchedulerDB();   
       oracleJobList = oracleScheduleDB.getBIReportJob();
        
        
   
        
    }
    public void refresh(){
        OracleSchedulerDB oracleScheduleDB = new OracleSchedulerDB();   
        oracleJobList = oracleScheduleDB.getBIReportJob();
       
    }
    public void topPartnerObjectChangeListener(ValueChangeEvent valueChangeEvent) {
        logger.info("topPartnerObjectChangeListener is called");
    }

    public void setTargetObjectList(List<SelectItem> targetObjectList) {
        this.targetObjectList = targetObjectList;
    }

    public List<SelectItem> getTargetObjectList() {
        return targetObjectList;
    }

    public void setTargetObjectSelectList(List<String> targetObjectSelectList) {
        this.targetObjectSelectList = targetObjectSelectList;
    }

    public List<String> getTargetObjectSelectList() {
        return targetObjectSelectList;
    }
    public String runNow() {
        logger.info("run is called**************** ");
        logger.info("selectAll " + selectAll);
        logger.info("selectBetween " + selectBetween);
        logger.info("startDate " + startDate);
        logger.info("endDate " + endDate);
        OracleSchedulerDB oracleSchedulerDB = new OracleSchedulerDB();
        oracleSchedulerDB.runBIReportJob();
        return "success";
    }
    public String disableJob() {
        logger.info("disableJob is called**************** ");
        OracleSchedulerDB oracleSchedulerDB = new OracleSchedulerDB();
        oracleSchedulerDB.disableBIReportJob();
        return "success";
    }
    public String enableJob() {
        logger.info("enableJob is called**************** ");
        OracleSchedulerDB oracleSchedulerDB = new OracleSchedulerDB();
        oracleSchedulerDB.enableBIReportJob();
        return "success";
    }
   public String apply() {
        logger.info("run is called**************** ");
        logger.info("selectAll " + selectAll);
        logger.info("selectBetween " + selectBetween);
        logger.info("startDate " + startDate);
        logger.info("endDate " + endDate);
        logger.info("interval " + interval);
        logger.info("intervalUnit " + intervalUnit);


        
        Job job = new Job();
        job.setName(Job.BIReport);
        job.setStartTime(startDate);
        job.setInterval(interval);
        job.setIntervalUnit(intervalUnit);
        SchedulerDB schedulerDB = new SchedulerDB();
        schedulerDB.updateJob(job);
       
        OracleSchedulerDB oracleSchedulerDB = new OracleSchedulerDB();
        oracleSchedulerDB.updateBIReportJob(job);
        
       
        
        return "success";
    }

    public void setSelectAll(boolean selectAll) {
        this.selectAll = selectAll;
    }

    public boolean isSelectAll() {
        return selectAll;
    }

    public void setSelectBetween(boolean selectBetween) {
        this.selectBetween = selectBetween;
    }

    public boolean isSelectBetween() {
        return selectBetween;
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

    public void setIntervalUnitList(List<SelectItem> intervalUnitList) {
        this.intervalUnitList = intervalUnitList;
    }

    public List<SelectItem> getIntervalUnitList() {
        return intervalUnitList;
    }

    public void setOracleJobList(List<OracleJob> oracleJobList) {
        this.oracleJobList = oracleJobList;
    }

    public List<OracleJob> getOracleJobList() {
        return oracleJobList;
    }
    
}
