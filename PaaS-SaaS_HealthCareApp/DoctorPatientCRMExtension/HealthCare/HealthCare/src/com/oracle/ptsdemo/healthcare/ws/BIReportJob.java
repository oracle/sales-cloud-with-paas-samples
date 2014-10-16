package com.oracle.ptsdemo.healthcare.ws;


import com.oracle.ptsdemo.healthcare.business.HealthCareException;
import com.oracle.ptsdemo.healthcare.business.datasync.load.DataLoadBIReport;

import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


/**
 */
@Path("/BISchedulerJob")
public class BIReportJob {
    private  final Logger logger = Logger.getLogger(this.getClass().getName());

    /**
     */
    public BIReportJob() {
        super();
    }

    /**
     * @return
     */
    @GET
    @Produces("plain/text")
    public String work() throws HealthCareException {
        logger.info("BIReportJob rest service is called****************");
        DataLoadBIReport dataLoad = new DataLoadBIReport();
        dataLoad.loadBIReport();        
        return "BIReportJob";
    }
}
