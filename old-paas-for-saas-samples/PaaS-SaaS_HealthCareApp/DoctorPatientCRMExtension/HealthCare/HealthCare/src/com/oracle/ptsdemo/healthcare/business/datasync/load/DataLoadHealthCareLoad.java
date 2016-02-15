package com.oracle.ptsdemo.healthcare.business.datasync.load;


import com.oracle.ptsdemo.healthcare.ws.HealthCare;


/**
 */
public class DataLoadHealthCareLoad {
    
    static org.apache.log4j.Logger logger =
        org.apache.log4j.Logger.getLogger(DataLoadHealthCareLoad.class);

    /**
     */
    public DataLoadHealthCareLoad() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : constructor");
        }
    }




    /**
     * @param prescriptionId
     * @return
     */
    public String loadPrescriptionLocal(String prescriptionId){
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + ".loadPrescription(String prescriptionId)");
        }
        
        HealthCare healthCareClient = new HealthCare();
        String orderId = healthCareClient.loadPrescription(prescriptionId);
      //  logger.info("orderId " + orderId);
        return orderId;
    }


  

}
