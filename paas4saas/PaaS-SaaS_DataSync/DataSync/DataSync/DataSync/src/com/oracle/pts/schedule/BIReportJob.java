package com.oracle.pts.schedule;

import com.oracle.pts.custom.load.DataLoadBIReport;

import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;



@Path("/BISchedulerJob")
public class BIReportJob {
    private static final Logger logger = Logger.getLogger("CRM");
    public BIReportJob() {
        super();
    }
    public static void main(String args){
        BIReportJob job = new BIReportJob();
        job.work();
    }
    @GET
    @Produces("plain/text")
    public String work(){
        logger.info("BIReportJob rest service is called****************");
        DataLoadBIReport dataLoad = new DataLoadBIReport();
        dataLoad.loadBIReport();        
        return "BIReportJob";
    }
}
