package com.oracle.ptsdemo.healthcare.business.datasync.schedule.db;


import com.oracle.ptsdemo.healthcare.config.DBBase;
import com.oracle.ptsdemo.healthcare.business.datasync.schedule.Job;
import com.oracle.ptsdemo.healthcare.business.datasync.schedule.OracleJob;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 */
public class OracleSchedulerDB  extends DBBase {
    
    static org.apache.log4j.Logger logger =
        org.apache.log4j.Logger.getLogger(OracleSchedulerDB.class);


    /**
     */
    public OracleSchedulerDB() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(OracleSchedulerDB.class.getName() + " : constructor");
        }   
        
    }


    /**
     */
    public void enableBIReportJob(){
        if (logger.isDebugEnabled()) {
            logger.debug("void enableBIReportJob()");
        }   
        
        String sql =
            "BEGIN CLOUD_SCHEDULER.enable('HealthCareBISchedulerJob'); END;";
        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.executeUpdate();


            // pstmt.close();

        } catch (SQLException e) {
            logger.error("void enableBIReportJob() - error calling CLOUD_SCHEDULER.enable procedure", e);
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                logger.error("void enableBIReportJob() - error closing statement", e);
            }
            releaseConnection(connection);
        }        
        
    }

    /**
     */
    public void disableBIReportJob(){
        if (logger.isDebugEnabled()) {
            logger.debug("void disableBIReportJob()");
        }  
        

        String sql =
            "BEGIN CLOUD_SCHEDULER.disable('HealthCareBISchedulerJob'); END;";
        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.executeUpdate();


            // pstmt.close();

        } catch (SQLException e) {
            logger.error("void disableBIReportJob() - Error calling CLOUD_SCHEDULER.disable procedure", e);
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                logger.error("void disableBIReportJob() - Error closing statement", e);
            }
            releaseConnection(connection);
        }        
        
    }

    /**
     */
    public void runBIReportJob(){
        if (logger.isDebugEnabled()) {
            logger.debug("void runBIReportJob()");
        }  
        logger.info("runBIReportJob is called********************");
        String sql =
            "BEGIN CLOUD_SCHEDULER.RUN_JOB('HealthCareBISchedulerJob'); END;";
        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.executeUpdate();


            // pstmt.close();

        } catch (SQLException e) {
            logger.error(" void runBIReportJob() - error calling CLOUD_SCHEDULER.RUN_JOB procedure", e);
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                logger.error(" void runBIReportJob() - error closing statement", e);
            }
            releaseConnection(connection);
        }        
        
    }

    /**
     */
    public void stopBIReportJob(){
        if (logger.isDebugEnabled()) {
            logger.debug("void stopBIReportJob()");
        }  
        logger.info("stopBIReportJob is called********************");
        String sql =
            "BEGIN CLOUD_SCHEDULER.STOP_JOB('HealthCareBISchedulerJob'); END;";
        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.executeUpdate();


            // pstmt.close();

        } catch (SQLException e) {
            logger.error("void stopBIReportJob() - error calling CLOUD_SCHEDULER.STOP_JOB procedure",e);

        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                logger.error("void stopBIReportJob() - error closing statement",e);
            }
            releaseConnection(connection);
        }        
        
    }

    /**
     * @param job
     */
    public void updateBIReportJob(Job job){
        if (logger.isDebugEnabled()) {
            logger.debug("void updateBIReportJob(Job job)");
        }  
        String intervalUnit = job.getIntervalUnit();
        short interval = job.getInterval();
        
        if(intervalUnit!=null && interval > 0){
    

            logger.info("updateBIReportJob is called********************");
            String sql =
      //          "BEGIN CLOUD_SCHEDULER.SET_ATTRIBUTE (name => 'HealthCareBISchedulerJob', attribute => 'repeat_interval', value => 'FREQ=MINUTELY;INTERVAL=5'); END; ";
            "BEGIN CLOUD_SCHEDULER.SET_ATTRIBUTE (name => 'HealthCareBISchedulerJob', attribute => 'repeat_interval', value => 'FREQ=" + intervalUnit  + ";INTERVAL= " + interval + "'); END; ";
                  
            logger.info("command**** " + sql);                                                                                                                                                         
            Connection connection = getConnection();
            PreparedStatement pstmt = null;
            try {
                pstmt = connection.prepareStatement(sql);
                pstmt.executeUpdate();
    
    
                // pstmt.close();
    
            } catch (SQLException e) {
                logger.error("void updateBIReportJob(Job job) - error calling CLOUD_SCHEDULER.SET_ATTRIBUTE w/ interval procedure", e);
            } finally {
                try {
                    pstmt.close();
                } catch (Exception e) {
                    logger.error("void updateBIReportJob(Job job) - error closing statement", e);
                }
                releaseConnection(connection);
            }        
        }
        
        Date startTime = job.getStartTime();
        
        if(startTime!=null){
             
             
            String date = format(startTime);
            
            
            String dateString = "to_date('" + date + "', 'dd-mm-yyyy hh24:mi:ss')";
            logger.info("updateBIReportJob is called********************");
            String sql =
            "BEGIN CLOUD_SCHEDULER.SET_ATTRIBUTE (name => 'HealthCareBISchedulerJob', attribute => 'start_date', value => " + dateString  + "); END; ";
                                                                                                                                                                     
            Connection connection = getConnection();
            PreparedStatement pstmt = null;
            try {
                pstmt = connection.prepareStatement(sql);
                pstmt.executeUpdate();
        
        
                // pstmt.close();
        
            } catch (SQLException e) {
                logger.error("void updateBIReportJob(Job job) - error calling CLOUD_SCHEDULER.SET_ATTRIBUTE procedure w/ start date", e);
            } finally {
                try {
                    pstmt.close();
                } catch (Exception e) {
                    logger.error("void updateBIReportJob(Job job) - error closing statement", e);
                }
                releaseConnection(connection);
            }        
        }
        
    }


    /**
     * @return
     */
    public List<OracleJob> getBIReportJob(){
        if (logger.isDebugEnabled()) {
            logger.debug("List<OracleJob> getBIReportJob()");
        }  
        
        List<OracleJob> jobList = new ArrayList<OracleJob>();
        
        String sql =
    //        "select * from USER_SCHEDULER_JOB_RUN_DETAILS where job_name = UPPER('HealthCareBISchedulerJob')  and  rownum <= 10 order by log_date desc ";
        "select * from USER_SCHEDULER_JOB_RUN_DETAILS where job_name = UPPER('HealthCareBISchedulerJob')   order by log_id desc ";
                         
        int counter = 0;                                                                                                                                        
        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            ResultSet resultSet = pstmt.executeQuery();

            while(resultSet.next()) {
                counter ++;
                if(counter>30){
                    break;
                }
                OracleJob job = new OracleJob();
                
                
                 String logId = resultSet.getString("log_id");
                Date logDate = resultSet.getTimestamp("log_date");
            //    logger.info("log_date************** " + logDate);
             //   logger.info("log_date format ************** " + format(logDate));
           //    String operation = resultSet.getString("operation");
                String status = resultSet.getString("status");
               
                job.setLogId(logId);
                job.setLogDate(logDate);
               // job.setOperation(operation);
                job.setStatus(status);
                
                jobList.add(job);


            }
            
        } catch (SQLException e) {
            logger.error("List<OracleJob> getBIReportJob() - error selecting user_scheduler_job_run_details", e);
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                logger.error("List<OracleJob> getBIReportJob() - error closing statement", e);
            }
            releaseConnection(connection);
        }        
     return jobList;   
    }


    /**
     * @param date
     * @return
     */
    public String format(Date date){
        if (logger.isDebugEnabled()) {
            logger.debug("String format(Date date)");
        }  
        
        String returnString = "";
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        returnString = dateFormat.format(date);
        return returnString;
        
    }


    /**
     * @param args
     */
    public static void main(String args[]){
        OracleSchedulerDB test = new OracleSchedulerDB();
        Date myDate = new Date();
        
        
        String dateString = "to_date('" + test.format(myDate) + "', 'dd-mm-yyyy hh24:mi:ss')"; 
        System.out.println(dateString);                                               
                                                                
    }
}
