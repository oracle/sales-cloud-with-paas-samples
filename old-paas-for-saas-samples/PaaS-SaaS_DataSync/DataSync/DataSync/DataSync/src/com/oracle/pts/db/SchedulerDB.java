package com.oracle.pts.db;

import com.oracle.pts.schedule.Job;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Timestamp;

import java.util.Date;

public class SchedulerDB extends DBBase{
    public SchedulerDB() {
        super();
    }
    public void createJob(Job job){
        

        String sql =
            "INSERT INTO fusion_scheduler_job (job_name,job_status,job_starttime,job_interval,job_interval_unit) VALUES(?,?,?,?,?)";
        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, job.getName());
            pstmt.setString(2, job.getStatus());
            if(job.getStartTime()!=null){
                pstmt.setTimestamp(3,new Timestamp(job.getStartTime().getTime()));
            }
            else{
                pstmt.setTimestamp(3,null);
            }
            pstmt.setShort(4, job.getInterval());
            pstmt.setString(5, job.getIntervalUnit());

            pstmt.executeUpdate();


            // pstmt.close();

        } catch (SQLException e) {
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
    public boolean recordExist(String name) {
        boolean recordExist = false;
 

        String sql =
            "select job_name from fusion_scheduler_job where job_name = ?  ";

        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, name);
 

            resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                recordExist = true;

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }
        return recordExist;
    }
    public void updateJob(Job job) {

        boolean recordExist = recordExist(job.getName());
        if(recordExist==false){
            
            createJob(job);
            
        }

        String sql =
        "UPDATE fusion_scheduler_job SET job_status=?,job_starttime=? ,job_interval=?,job_interval_unit=? where job_name =?  ";


        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, job.getStatus());
            if(job.getStartTime()!=null){
                pstmt.setTimestamp(2,new Timestamp(job.getStartTime().getTime()));
            }
            else{
                pstmt.setTimestamp(2,null);
            }
            pstmt.setShort(3, job.getInterval());
            pstmt.setString(4, job.getIntervalUnit());
            pstmt.setString(5, job.getName());

            pstmt.executeUpdate();


            //pstmt.close();

        } catch (SQLException e) {
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
    
    
    public Job getJob(String name){
        Job job = null;
        
            String sql =
                "select * from  fusion_scheduler_job  where job_name =  ?  ";

            Connection connection = getConnection();
            PreparedStatement pstmt = null;
            ResultSet resultSet = null;

            try {
                pstmt = connection.prepareStatement(sql);
                pstmt.setString(1, name);
    
                resultSet = pstmt.executeQuery();
                if (resultSet.next()) {
                    job = new Job();
                    
                    
                    String status = resultSet.getString("job_status");
                    Date startTime = resultSet.getTimestamp("job_starttime");
                    short interval = resultSet.getShort("job_interval");
                    String intervalUnit = resultSet.getString("job_interval_unit");
                    
                    job.setName(name);
                    job.setStartTime(startTime);
                    job.setInterval(interval);
                    job.setIntervalUnit(intervalUnit);
                    

                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                try {
                    resultSet.close();
                    pstmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                releaseConnection(connection);
            }
      
            if(job==null){
                job = new Job();
                job.setName(name);
                createJob(job);
            }
            return job;
    }
}
