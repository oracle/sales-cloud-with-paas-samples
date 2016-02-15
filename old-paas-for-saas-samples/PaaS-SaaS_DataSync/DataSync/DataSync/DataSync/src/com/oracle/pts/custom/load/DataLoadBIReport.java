package com.oracle.pts.custom.load;

import com.oracle.pts.util.HttpUtil;
import com.oracle.pts.vo.Medication;
import com.oracle.pts.vo.Prescription;

import com.oracle.pts.ws.CRMProcessor;

import java.util.List;
import java.util.logging.Logger;

public class DataLoadBIReport {
    private static final Logger logger =
        Logger.getLogger("CRM");
    public DataLoadBIReport() {
        super();
    }
    public static void main(String args[]){
        CRMProcessor.disable=true;
        HttpUtil.removeMyProxy();
        DataLoadBIReport dataLoad = new DataLoadBIReport();
        dataLoad.loadBIReport();
    }
    public void loadBIReport(){
        BIReportLoadSrc biReportLoadSrc = new BIReportLoadSrc();
        List<Prescription> prescriptionList = biReportLoadSrc.loadPrescription();
        List<Medication> medicationList = biReportLoadSrc.loadAllMedication();
        
        
        BIReportLoadTgr biReportLoadTgr = new BIReportLoadTgr();
        
        biReportLoadTgr.loadAllMedication(medicationList);
        
      
        for(Prescription prescription:prescriptionList){
                biReportLoadTgr.loadPrescription(prescription);
         }
      
        for(Prescription prescription:prescriptionList){
                biReportLoadTgr.loadPrescriptionMed(prescription);
         }


        biReportLoadTgr.loadAllPrescription(prescriptionList);        
        

    }
}
