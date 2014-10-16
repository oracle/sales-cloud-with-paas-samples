package com.oracle.ptsdemo.healthcare.business.datasync.load;


import com.oracle.ptsdemo.healthcare.business.HealthCareException;
import com.oracle.ptsdemo.healthcare.business.datasync.custom.Medication;
import com.oracle.ptsdemo.healthcare.business.datasync.custom.Prescription;
import com.oracle.ptsdemo.healthcare.business.datasync.dynamic.CRMProcessor;
import com.oracle.ptsdemo.healthcare.business.datasync.load.source.BIReportLoadSrc;
import com.oracle.ptsdemo.healthcare.business.datasync.load.target.BIReportLoadTgr;
import com.oracle.ptsdemo.healthcare.business.util.HttpUtil;

import java.util.List;
import java.util.logging.Logger;

/**
 */
public class DataLoadBIReport {
    private  final Logger logger =
        Logger.getLogger(this.getClass().getName());

    /**
     */
    public DataLoadBIReport() {
        super();
    }


    /**
     */
    public void loadBIReport() throws HealthCareException {
        BIReportLoadSrc biReportLoadSrc = new BIReportLoadSrc();
        List<Prescription> prescriptionList = biReportLoadSrc.loadPrescription();
        List<Medication> medicationList = biReportLoadSrc.loadAllMedication();


        BIReportLoadTgr biReportLoadTgr = new BIReportLoadTgr();
        
        biReportLoadTgr.loadAllMedication(medicationList);
        
        logger.info("prescriptionSize: " + prescriptionList.size());
        for(Prescription prescription:prescriptionList){
                biReportLoadTgr.loadPrescription(prescription);
         }

        biReportLoadTgr.loadAllPrescription(prescriptionList);        
        

    }
}
