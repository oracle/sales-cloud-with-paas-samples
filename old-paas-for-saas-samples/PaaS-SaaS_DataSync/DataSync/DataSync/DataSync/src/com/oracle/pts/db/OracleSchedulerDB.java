package com.oracle.pts.db;

import com.oracle.pts.schedule.Job;
import com.oracle.pts.schedule.OracleJob;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.faces.model.SelectItem;

public class OracleSchedulerDB  extends DBBase{
    private static final Logger logger = Logger.getLogger("CRM");
    public OracleSchedulerDB() {
        super();
    }
    public static void main(String args[]){
        OracleSchedulerDB test = new OracleSchedulerDB();
        Date myDate = new Date();
        
        
        String dateString = "to_date('" + test.format(myDate) + "', 'dd-mm-yyyy hh24:mi:ss')"; 
        System.out.println(dateString);                                               
                                                                
    }

    public void enableBIReportJob(){
        logger.info("enableBIReportJob is called********************");
        String sql =
            "BEGIN CLOUD_SCHEDULER.enable('HealthCareBISchedulerJob'); END;";
        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.executeUpdate();


            // pstmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            logger.info("error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }        
        
    }
    public void disableBIReportJob(){

        logger.info("disableBIReportJob is called********************");
        String sql =
            "BEGIN CLOUD_SCHEDULER.disable('HealthCareBISchedulerJob'); END;";
        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.executeUpdate();


            // pstmt.close();

        } catch (SQLException e) {
            logger.info("error: " + e.getMessage());
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }        
        
    }
    public void runBIReportJob(){

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
            logger.info("error: " + e.getMessage());
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }        
        
    }
    public void stopBIReportJob(){

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
            logger.info("error: " + e.getMessage());
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }        
        
    }
    public void updateBIReportJob(Job job){
        
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
                logger.info("error: " + e.getMessage());
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                try {
                    pstmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
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
                logger.info("error: " + e.getMessage());
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                try {
                    pstmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                releaseConnection(connection);
            }        
        }
        
    }
    public List<OracleJob> getBIReportJob(){
        List<OracleJob> jobList = new ArrayList<OracleJob>();
        logger.info("getBIReportJob is called********************");
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
               String status = resultSet.getString("status");
               
                job.setLogId(logId);
                job.setLogDate(logDate);
              
                job.setStatus(status);
                
                jobList.add(job);


            }
            
        } catch (SQLException e) {
            logger.info("error: " + e.getMessage());
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }        
     return jobList;   
    }
    public String format(Date date){
        String returnString = "";
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        returnString = dateFormat.format(date);
        return returnString;
        
    }
}
