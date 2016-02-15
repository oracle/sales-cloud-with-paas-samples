package com.oracle.pts.custom.load;

import com.oracle.pts.ui.bean.CrmMapping;

import java.util.logging.Logger;

import javax.jws.Oneway;
import javax.jws.WebMethod;


public class DataLoad {
    private static final Logger logger =
        Logger.getLogger("CRM");
    public DataLoad() {
        super();
    }
    public static void main(String args[]){
        DataLoad dataLoad = new DataLoad();
        dataLoad.work();
    }
    public void work(){

//        loadPharmacy();   
  //      loadBIReport();
        loadPrescription("1234567");
    }
    public void loadPharmacy(){
        DataLoadPharmacy dataLoad = new DataLoadPharmacy();
        dataLoad.loadPrescription();
    }
    public void loadBIReport(){
        DataLoadBIReport dataLoad = new DataLoadBIReport();
        dataLoad.loadBIReport();
    }
    public String loadPrescription(String prescriptionId){
        logger.info("DataLoad.loadPrescription is called:  prescriptionId: " + prescriptionId);
        DataLoadPharmacy dataLoad = new DataLoadPharmacy();
        String orderId = dataLoad.loadPrescription(prescriptionId);
        logger.info("orderId " + orderId);
        return orderId;
    }   

    
    
}
