package com.oracle.ptsdemo.healthcare.ws;


import com.oracle.ptsdemo.healthcare.business.datasync.load.DataLoad;
import com.oracle.ptsdemo.healthcare.ws.db.HealthCareDB;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 */
@WebService
public class HealthCare {
    static org.apache.log4j.Logger logger =
        org.apache.log4j.Logger.getLogger(HealthCare.class);

    /**
     */
    public HealthCare() {
        super();
    }

    /**
     * @param args
     */
    @WebMethod(exclude = true)
    public static void main(String args[]){
        HealthCare healthCare = new HealthCare();
        healthCare.loadPrescription("671");
    }

    /**
     * @param prescriptionId
     * @return
     */
    @WebMethod
    public String loadPrescription(String prescriptionId){
        logger.info("HealthCare WS - String loadPrescription(String prescriptionId) - "+prescriptionId);
        
        DataLoad dataLoad = new DataLoad();
        
        String orderId = null;
        try {
            orderId = dataLoad.loadPrescriptionAndSendToPharmacy(prescriptionId, "MyDoctor1");
        } catch (Exception e) {
            logger.error("HealthCare WS error on loadPrescription", e);
        }
        return orderId;
    }


    /**
     * @param prescriptionId
     * @param doctorName
     * @param jwtToken
     * @return
     */
    public String loadPrescription(String prescriptionId, String doctorName,String jwtToken){
        logger.info("HealthCare WS - String loadPrescription(String prescriptionId) - "+prescriptionId);
        
        DataLoad dataLoad = new DataLoad();
        dataLoad.setJwtToken(jwtToken);
        String orderId = null;
        try {
            orderId = dataLoad.loadPrescriptionAndSendToPharmacy(prescriptionId, doctorName);
        } catch (Exception e) {
            logger.error("HealthCare WS error on loadPrescription", e);
        }
        return orderId;
    }

    /**
     * @param orderNumber
     * @return
     */
    @WebMethod
    public boolean isMedicationReadyToPickup(String orderNumber){
        logger.info("HealthCare WS - boolean isMedicationReadyToPickup(String orderNumber) - "+orderNumber);
        return true;
    }

    /**
     * @param orderNumber
     */
    @Oneway
    @WebMethod
    public void setMedicationReadyToPickup(String orderNumber){
        logger.info("HealthCare WS - void setMedicationReadyToPickup(String orderNumber) - "+orderNumber);
        /*
        DataLoadPharmacy dataLoadPharmacy = new DataLoadPharmacy();
        dataLoadPharmacy.setMedicationReadyToPickup(orderNumber);
        */
        
        HealthCareDB healthCareDB = new HealthCareDB();
        healthCareDB.setMedicationReadyToPickup(orderNumber);

    }

    /**
     * @param orderNumber
     * @return
     */
    @WebMethod
    public String requestOrderStatus(String orderNumber){
        logger.info("HealthCare WS - String requestOrderStatus(String orderNumber)- "+orderNumber);
     //   -->  returns status: Requested, Ready, In Progress, etc **not mandatory**    
        return null;
    }    
    
}
