package com.oracle.pts.webservice.pharmacy;

import com.oracle.pts.custom.client.HealthCareLoadClient;
import com.oracle.pts.db.PharmacyDB;
import com.oracle.pts.session.PharmacyFacade;
import com.oracle.pts.vo.Medication;
import com.oracle.pts.vo.Prescription;

import java.util.List;
import java.util.logging.Logger;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;

import weblogic.wsee.jws.jaxws.owsm.SecurityPolicies;
import weblogic.wsee.jws.jaxws.owsm.SecurityPolicy;

@WebService
public class PharmacyWS {
    PharmacyFacade pharmacyFacade;
    private static final Logger logger = Logger.getLogger("CRM");
    public PharmacyWS() {
        super();
        init();
    }
    private void init(){
        pharmacyFacade = new PharmacyFacade();
    }

    @Oneway
    @WebMethod
    public void createPrescription(Prescription prescription){
        System.out.println("createPrescription is called");
    }

    @WebMethod
    public String createMedication(Medication medication){
        logger.info("createMedication is called");
        String orderId = pharmacyFacade.createOrder(medication);
        return orderId;
    }

    @WebMethod
    public boolean isMedicationReadyToPickup(String orderNumber){
        
        return true;
    }

    @WebMethod
    public String requestOrderStatus(String orderNumber){
     //   -->  returns status: Requested, Ready, In Progress, etc **not mandatory**    

     String status = "In Progress";
     return status;

    }

    @Oneway
    @WebMethod
    public void setMedicationReadyToPickup(String orderNumber){
        logger.info("setMedicationReadyToPickup in Pharmacy is called");
        pharmacyFacade.setMedicationReadyToPickup(orderNumber);
        
    }

    @Oneway
    @WebMethod
    public void loadMedicationListFromHealthCare(){
        pharmacyFacade.loadMedicationListFromHealthCare();
       
    }

    @Oneway
    @WebMethod
    public void loadMedicationListForHealthCare(){
        System.out.println("PharmacyWS.loadMedicationListForHealthCare is called");
        pharmacyFacade.loadMedicationListForHealthCare();
    }

    @Oneway
    @WebMethod
    public void loadHealthCareProviderList(){
        pharmacyFacade.loadHealthCareProviderList();
    }
}
