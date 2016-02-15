package com.oracle.ptsdemo.healthcare.business.datasync.schedule.db;


import com.oracle.ptsdemo.healthcare.config.DBBase;
import com.oracle.ptsdemo.healthcare.business.datasync.schedule.Job;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import java.util.Date;


/**
 */
public class SchedulerDB extends DBBase {
    static org.apache.log4j.Logger logger =
        org.apache.log4j.Logger.getLogger(SchedulerDB.class);


    /**
     */
    public SchedulerDB() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(SchedulerDB.class.getName() + " : constructor");
        }
    }

    /**
     * @param job
     */
    public void createJob(Job job) {
        if (logger.isDebugEnabled()) {
            logger.debug("void createJob(Job job)");
        }

        String sql =
            "INSERT INTO fusion_scheduler_job (job_name,job_status,job_starttime,job_interval,job_interval_unit) VALUES(?,?,?,?,?)";
        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, job.getName());
            pstmt.setString(2, job.getStatus());
            if (job.getStartTime() != null) {
                pstmt.setTimestamp(3,
                                   new Timestamp(job.getStartTime().getTime()));
            } else {
                pstmt.setTimestamp(3, null);
            }
            pstmt.setShort(4, job.getInterval());
            pstmt.setString(5, job.getIntervalUnit());

            pstmt.executeUpdate();


            // pstmt.close();

        } catch (SQLException e) {
            logger.error("void createJob(Job job) - error inserting into fusion_scheduler_job",
                         e);
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                logger.error("void createJob(Job job) - error closing statement",
                             e);
            }
            releaseConnection(connection);
        }

    }

    /**
     * @param name
     * @return
     */
    public boolean recordExist(String name) {
        if (logger.isDebugEnabled()) {
            logger.debug("boolean recordExist(String name)");
        }

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
            logger.error("boolean recordExist(String name) - error selecting from fusion_scheduler_job",
                         e);
        } finally {
            try {
                resultSet.close();
                pstmt.close();
            } catch (Exception e) {
                logger.error("boolean recordExist(String name) - error closing statemennt or resultset",
                             e);
            }
            releaseConnection(connection);
        }
        return recordExist;
    }


    /**
     * @param job
     */
    public void updateJob(Job job) {
        if (logger.isDebugEnabled()) {
            logger.debug("void updateJob(Job job)");
        }


        boolean recordExist = recordExist(job.getName());
        if (!recordExist) {

            createJob(job);
        }

        String sql =
            "UPDATE fusion_scheduler_job SET job_status=?,job_starttime=? ,job_interval=?,job_interval_unit=? where job_name =?  ";


        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, job.getStatus());
            if (job.getStartTime() != null) {
                pstmt.setTimestamp(2,
                                   new Timestamp(job.getStartTime().getTime()));
            } else {
                pstmt.setTimestamp(2, null);
            }
            pstmt.setShort(3, job.getInterval());
            pstmt.setString(4, job.getIntervalUnit());
            pstmt.setString(5, job.getName());

            pstmt.executeUpdate();


            //pstmt.close();

        } catch (SQLException e) {
            logger.error("void updateJob(Job job) - error updating fusion_scheduler_job",
                         e);
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                logger.error("void updateJob(Job job) - error closing statement",
                             e);
            }
            releaseConnection(connection);
        }


    }


    /**
     * @param name
     * @return
     */
    public Job getJob(String name) {
        if (logger.isDebugEnabled()) {
            logger.debug("Job getJob(String name)");
        }

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


                Date startTime = resultSet.getTimestamp("job_starttime");
                short interval = resultSet.getShort("job_interval");
                String intervalUnit = resultSet.getString("job_interval_unit");

                job.setName(name);
                job.setStartTime(startTime);
                job.setInterval(interval);
                job.setIntervalUnit(intervalUnit);


            }
        } catch (SQLException e) {
            logger.error("Job getJob(String name) - error selecting from fusion_scheduler_job",
                         e);
        } finally {
            try {
                resultSet.close();
                pstmt.close();
            } catch (Exception e) {
                logger.error("Job getJob(String name) - error closing statement or resultset",
                             e);
            }
            releaseConnection(connection);
        }

        if (job == null) {
            job = new Job();
            job.setName(name);
            createJob(job);
        }
        return job;
    }
}
