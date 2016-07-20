package com.oracle.pts.custom.load;

import com.oracle.pts.custom.client.HealthCareClient;
import com.oracle.pts.custom.client.HealthCareLoadClient;
import com.oracle.pts.db.HealthCareDB;
import com.oracle.pts.util.FusionUtil;

import com.oracle.pts.util.HttpUtil;

import com.oracle.pts.vo.Medication;
import com.oracle.pts.vo.Prescription;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class DataLoadHealthCareLoad {
    private static final Logger logger =
        Logger.getLogger("CRM");
    public static void main(String args[]){
        HttpUtil.removeMyProxy();
        DataLoadHealthCareLoad dataLoad = new DataLoadHealthCareLoad();
    //    dataLoad.createMedication();
  //  String prescriptionId = dataLoad.createPrescription();
    //   logger.info("prescriptionId: " + prescriptionId);
       dataLoad.loadPrescription("1400874168551");
       
       
    }
    public String loadPrescription(String prescriptionId){
        HealthCareClient healthCareClient = new HealthCareClient();
        healthCareClient.loadPrescription(prescriptionId);
        
        return null;
    }   
    
    public DataLoadHealthCareLoad() {
        super();
    }
    private void createMedication() {
        HealthCareLoadClient healthCareLoadClient = new HealthCareLoadClient();
        List<String> drugList = new ArrayList<String>();
        try {

            FileInputStream fis =
                new FileInputStream("D:\\software\\fusion_app\\jcslab\\drugList.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                drugList.add(line.trim());
            }
            br.close();
            br = null;
            fis = null;
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        for(String drug:drugList){
            System.out.println("drug: " + drug);
            String ndcCode = String.valueOf(FusionUtil.getRandomNumberFixLength());
            logger.info("ndcCode " + ndcCode);
            healthCareLoadClient.createMedication(drug, ndcCode);
        }
       

    }
    public String  createPrescription() {

        
        logger.info("Create a prescription is called");
        
        String prescriptionId = null;
        
        HealthCareLoadClient healthCareLoadClient = new HealthCareLoadClient();
        
        
        HealthCareDB healthCareDB = new HealthCareDB();
        
        Prescription prescription = new Prescription();
        
         prescription.setDoctorId("300000044119259");

        prescription.setPatientid("300000075186283");
        
        
        
        
        
        prescription.setVisitId(FusionUtil.getSystemGeneratedNumber());

        Date prescriptionDate = new Date();
        Date expireDate =
            new Date(prescriptionDate.getTime() + 1000 * 60 * 60 * 24 * 30);
        prescription.setPrescriptionDate(expireDate);
        prescription.setExpireDate(expireDate);




        List<String> drugList = healthCareLoadClient.getMedicationList();

        for (int i = 0; i < 5; i++) {

            Medication medication = new Medication();
            prescription.getMedicationList().add(medication);

            String medicationId  = drugList.get(FusionUtil.getRandomNumber(183));
            medication.setMedicationId(medicationId);
            medication.setQuantity((short)FusionUtil.getRandomNumber(30));
            medication.setRefills((short)FusionUtil.getRandomNumber(5));
            medication.setPharmacyId("1000");
            medication.setDirectionsForUse("DirectionsForUse");
            medication.setReadyToPickup(false);
            medication.setExpireDate(expireDate);
            medication.setSendToPharmacy(false);
            

        }
        
        prescriptionId = healthCareLoadClient.createPrescription(prescription);
        logger.info("prescriptionId " + prescriptionId);
        return prescriptionId;
        

    }

}
