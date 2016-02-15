package com.oracle.pts.webservice.healthcare;

import com.oracle.pts.custom.load.DataLoad;
import com.oracle.pts.custom.load.DataLoadPharmacy;
import com.oracle.pts.custom.load.PharmacyLoadSrc;
import com.oracle.pts.custom.load.PharmacyLoadTgr;
import com.oracle.pts.custom.load.SalesPartyLoadSrc;

import com.oracle.pts.db.HealthCareDB;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HealthCare {
    public HealthCare() {
        super();
    }

    @WebMethod(exclude = true)
    public static void main(String args[]){
        HealthCare healthCare = new HealthCare();
        healthCare.loadPrescription("1388804904281");
    }

    @WebMethod
    public String loadPrescription(String prescriptionId){


        DataLoad dataLoad = new DataLoad();
        System.out.println("HealthCare.loadPrescription is called");
        String orderId = dataLoad.loadPrescription(prescriptionId);
        return orderId;
    }

    @WebMethod
    public boolean isMedicationReadyToPickup(String orderNumber){
        return true;
    }

    @WebMethod
    @Oneway
    public void setMedicationReadyToPickup(String orderNumber){
        System.out.println("HealthCare.setMedicationReadyToPickup.DB is called");
        HealthCareDB healthCareDB = new HealthCareDB();
        healthCareDB.setMedicationReadyToPickup(orderNumber);

    }

    @WebMethod
    public String requestOrderStatus(String orderNumber){
     //   -->  returns status: Requested, Ready, In Progress, etc **not mandatory**    
        return null;
    }    
    
}
