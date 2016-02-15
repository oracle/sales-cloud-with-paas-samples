package com.oracle.ptsdemo.healthcare.business.wsclient;


import com.oracle.ptsdemo.healthcare.business.util.HttpUtil;
import com.oracle.ptsdemo.healthcare.wsclient.healthcare.HealthCare;


import com.sun.xml.ws.api.addressing.AddressingVersion;


import java.util.logging.Logger;


/**
 */
public class HealthCareClient extends ObjectClient {
    private HealthCare healthCare;
    private static final AddressingVersion WS_ADDR_VER = AddressingVersion.W3C;
    Logger logger = Logger.getLogger("CRM");

    /**
     */
    public HealthCareClient() {
        super();
        HttpUtil.removeProxy();
    }


    /**
     * @param orderNumber
     */
    public void setMedicationReadyToPickup(String orderNumber) {
        healthCare.setMedicationReadyToPickup(orderNumber);
    }

    /**
     * @param prescriptionId
     * @return
     */
    public String loadPrescription(String prescriptionId) {
        String orderId = healthCare.loadPrescription(prescriptionId);
        return orderId;
    }


}
