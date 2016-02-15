package com.oracle.ptsdemo.healthcare.business.datasync.schedule;


import com.oracle.ptsdemo.healthcare.business.HealthCareException;
import com.oracle.ptsdemo.healthcare.business.datasync.load.DataLoad;
import com.oracle.ptsdemo.healthcare.business.datasync.schedule.db.SchedulerDB;

import java.util.logging.Logger;

/**
 */
public class Scheduler extends Thread {
    private  final Logger logger = Logger.getLogger(this.getClass().getName());
    private SchedulerDB schedulerDB;

    /**
     */
    public Scheduler() {
        super();
        init();
    }

    private void init() {
        schedulerDB = new SchedulerDB();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        scheduler.start();
    }

    /**
     */
    public void run() {
        logger.info("Scheduler.work");
        logger.info("running thread");
        int counter = 0;
        while (true) {
            try {
                counter++;
                logger.info("counter " + counter);
                System.out.println("counter " + counter);
                doPharmacyJob();
                doBIReportJob();
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                 
            } catch (HealthCareException e) {
            }
        }


    }
    private void doBIReportJob() throws HealthCareException {
        getPharmacyJob();
        DataLoad dataLoad = new DataLoad();
        dataLoad.loadPharmacy();
    }

    private void doPharmacyJob() throws HealthCareException {
        getPharmacyJob();
        DataLoad dataLoad = new DataLoad();
        dataLoad.loadPharmacy();
    }
    private Job getPharmacyJob(){
        Job job = schedulerDB.getJob(Job.Pharmacy);
        return job;
    }
}
