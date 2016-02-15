package com.oracle.ptsdemo.healthcare.view.bean;


import com.oracle.ptsdemo.healthcare.business.datasync.schedule.Job;
import com.oracle.ptsdemo.healthcare.business.datasync.schedule.OracleJob;
import com.oracle.ptsdemo.healthcare.business.datasync.schedule.db.OracleSchedulerDB;
import com.oracle.ptsdemo.healthcare.business.datasync.schedule.db.SchedulerDB;
import com.oracle.ptsdemo.healthcare.config.ConfigDB;
import com.oracle.ptsdemo.healthcare.config.ConfigVO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;


public class ConnectorSync {
    
    static org.apache.log4j.Logger logger =
        org.apache.log4j.Logger.getLogger(ConnectorSync.class);
    
    
    
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
    
    
    private String configURL;
    private String configUserName;
    private String configPassword;
    
    public ConnectorSync() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(ConnectorSync.class.getName() + " : constructor");
        }
        
        init();
    }
    private void init(){
        
        if (logger.isDebugEnabled()) {
            logger.debug("init()");
        }
        
        targetObjectSelectList = new ArrayList<String>();
        targetObjectList = new ArrayList<SelectItem>();
        
       
     //   MetaInfoFactory metaInfoFactory = new TransMetaInfoFactory();
    
    
       
      //  for (String name : metaInfoFactory.getPartnerObjectNameList()) {
           // SelectItem item = new SelectItem(name, name);
           SelectItem item = new SelectItem("name","value");
            targetObjectList.add(item);
        //}
        
        SelectItem itemT = new SelectItem("Participant", "Participant");
        targetObjectList.add(itemT);
        itemT = new SelectItem("Position Hierarchy", "Position Hierarchy");
        targetObjectList.add(itemT);

      //  for (String name : metaInfoFactory.getPartnerObjectNameList()) {
          //  targetObjectSelectList.add(name);
          targetObjectSelectList.add("nameTargetObjectSelect");
       // }

      

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
       
        ConfigDB configDB = new ConfigDB();
        ConfigVO configVO = configDB.getConfigVO();
        
       configURL  = configVO.getNameValueList().get("configURL");
        configUserName = configVO.getNameValueList().get("configUserName");
      configPassword = configVO.getNameValueList().get("configPassword");
     
        
        
    //  oracleJobList = new ArrayList<OracleJob>();
        
    }
    public void refresh(){
        if (logger.isDebugEnabled()) {
            logger.debug("refresh()");
        }
        OracleSchedulerDB oracleScheduleDB = new OracleSchedulerDB();   
        oracleJobList = oracleScheduleDB.getBIReportJob();
       
    }
    public void topPartnerObjectChangeListener(ValueChangeEvent valueChangeEvent) {
        if (logger.isDebugEnabled()) {
            logger.debug("topPartnerObjectChangeListener()");
        }

 //       selectTopObject = valueChangeEvent.getNewValue().toString();
   //     AdfFacesContext adfFacesCtx = AdfFacesContext.getCurrentInstance();
     //   adfFacesCtx.addPartialTarget(form);

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
        if (logger.isDebugEnabled()) {
            logger.debug("runNow()");
        }        
        System.out.println("run is called**************** ");
        System.out.println("selectAll " + selectAll);
        System.out.println("selectBetween " + selectBetween);
        System.out.println("startDate " + startDate);
        System.out.println("endDate " + endDate);


        OracleSchedulerDB oracleSchedulerDB = new OracleSchedulerDB();
        oracleSchedulerDB.runBIReportJob();
        return "success";
    }
    public String disableJob() {
        if (logger.isDebugEnabled()) {
            logger.debug("disableJob()");
        }
        
        OracleSchedulerDB oracleSchedulerDB = new OracleSchedulerDB();
        oracleSchedulerDB.disableBIReportJob();
        return "success";
    }
    public String enableJob() {
        if (logger.isDebugEnabled()) {
            logger.debug("enableJob()");
        }
        
        OracleSchedulerDB oracleSchedulerDB = new OracleSchedulerDB();
        oracleSchedulerDB.enableBIReportJob();
        return "success";
    }
   public String apply() {
        if (logger.isDebugEnabled()) {
            logger.debug("apply()");
        }
        
        System.out.println("selectAll " + selectAll);
        System.out.println("selectBetween " + selectBetween);
        System.out.println("startDate " + startDate);
        System.out.println("endDate " + endDate);
        System.out.println("interval " + interval);
        System.out.println("intervalUnit " + intervalUnit);
        
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
    public String saveConfig(){
        if (logger.isDebugEnabled()) {
            logger.debug("saveConfig()");
        }
        
        ConfigVO configVO = new ConfigVO();
        
        
        configVO.getNameValueList().put("PHARMACY_URL",configURL);
        configVO.getNameValueList().put("PHARMACY_USER",configUserName);
        configVO.getNameValueList().put("PHARMACY_PASSWORD",configPassword);

        ConfigDB configDB = new ConfigDB();
        configDB.save(configVO);
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

    public void setConfigURL(String configURL) {
        this.configURL = configURL;
    }

    public String getConfigURL() {
        return configURL;
    }

    public void setConfigUserName(String configUserName) {
        this.configUserName = configUserName;
    }

    public String getConfigUserName() {
        return configUserName;
    }

    public void setConfigPassword(String configPassword) {
        this.configPassword = configPassword;
    }

    public String getConfigPassword() {
        return configPassword;
    }
}
