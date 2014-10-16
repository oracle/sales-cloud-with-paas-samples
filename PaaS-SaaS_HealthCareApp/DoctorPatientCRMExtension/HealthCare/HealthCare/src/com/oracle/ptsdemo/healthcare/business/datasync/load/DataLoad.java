package com.oracle.ptsdemo.healthcare.business.datasync.load;


import com.oracle.ptsdemo.healthcare.business.HealthCareException;

import java.util.logging.Logger;


/**
 */
public class DataLoad {
    private  final Logger logger =
        Logger.getLogger(this.getClass().getName());
    private String jwtToken ;

    /**
     */
    public DataLoad() {
        super();
    }


    /**
     */
    public void loadPharmacy() throws HealthCareException {
        DataLoadPharmacy dataLoad = new DataLoadPharmacy();
        dataLoad.loadPrescription();
    }

    /**
     */
    public void loadBIReport() throws HealthCareException {
        DataLoadBIReport dataLoad = new DataLoadBIReport();
        dataLoad.loadBIReport();
    }

    /**
     * @param prescriptionId
     * @param doctorName
     * @return
     * @throws Exception
     */
    public String loadPrescriptionAndSendToPharmacy(String prescriptionId, String doctorName) throws HealthCareException {
        logger.info("DataLoad.loadPrescription is called:  prescriptionId: " + prescriptionId);

        DataLoadPharmacy dataLoad = new DataLoadPharmacy();
        dataLoad.setJwtToken(jwtToken);
        String orderId = dataLoad.loadPrescriptionAndSendToPharmacy(prescriptionId, doctorName);
        logger.info("orderId " + orderId);
        return orderId;
    }


    /**
     * @param jwtToken
     */
    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    /**
     * @return
     */
    public String getJwtToken() {
        return jwtToken;
    }
}
