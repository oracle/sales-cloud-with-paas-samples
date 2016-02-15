package com.oracle.pts.db;

import com.oracle.pts.schedule.Job;

import com.oracle.pts.util.FusionUtil;
import com.oracle.pts.vo.Medication;
import com.oracle.pts.vo.Prescription;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class HealthCareDB extends DBBase {
    private static final Logger logger = Logger.getLogger("CRM");

    public HealthCareDB() {
        super();
    }

    public static void main(String[] args) {
        HealthCareDB healthCareDB = new HealthCareDB();
        healthCareDB.work();
    }
    public void work(){
        HealthCareDB healthCareDB = new HealthCareDB();
        healthCareDB.createPrescription();
    }
    public List<String> getMedicationList(){
            logger.info("getMedicationList from database is called");
            List<String> medicationList = new ArrayList<String>();

            String sql =
                "select MEDICATION_ID from medication   ";

            Connection connection = getConnection();
            PreparedStatement pstmt = null;
            ResultSet resultSet = null;

            try {
                pstmt = connection.prepareStatement(sql);

                resultSet = pstmt.executeQuery();
                while (resultSet.next()) {


                    String ndcCode = resultSet.getString("MEDICATION_ID");
                    medicationList.add(ndcCode);

                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                try {
                    resultSet.close();
                    pstmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                releaseConnection(connection);
            }
            return medicationList;

                
    }
    public List<Medication> getMedicationDetailList(){
            logger.info("getMedicationDetailList from database is called");
            List<Medication> medicationList = new ArrayList<Medication>();

            String sql =
                "select * from medication   ";

            Connection connection = getConnection();
            PreparedStatement pstmt = null;
            ResultSet resultSet = null;

            try {
                pstmt = connection.prepareStatement(sql);

                resultSet = pstmt.executeQuery();
                while (resultSet.next()) {
                    Medication medication = new Medication();
                    medicationList.add(medication);

                    String medicationId = resultSet.getString("MEDICATION_ID");
                    String ndcCode = resultSet.getString("NDC_CODE");
                    String drugName = resultSet.getString("NAME");
                   
                    medication.setMedicationId(medicationId);
                    medication.setNdcCode(ndcCode);
                    medication.setDrugName(drugName);

                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                try {
                    resultSet.close();
                    pstmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                releaseConnection(connection);
            }
            return medicationList;

                
    }
        private void createMedication() {

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
            createMedication(drug, ndcCode);
        }
       

    }

    public void createMedication(String name, String ndcCode) {
        String sql =
            "INSERT INTO MEDICATION (MEDICATION_ID,NAME,NDC_CODE) VALUES(?,?,?)";

        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, FusionUtil.getSystemGeneratedNumber());
            pstmt.setString(2, name);
            pstmt.setString(3, ndcCode);

            pstmt.executeUpdate();


            // pstmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }
    }

    private void createPrescription() {


        logger.info("Create a prescription is called");
        
        
        
        Prescription prescription = new Prescription();
        String prescriptionId = FusionUtil.getSystemGeneratedNumber();
        prescription.setPrescriptionId(prescriptionId);
        prescription.setDoctorId("300000001093092");
        prescription.setPatientid("300000001225570");
        
        
        prescription.setVisitId(FusionUtil.getSystemGeneratedNumber());

        Date prescriptionDate = new Date();
        Date expireDate =
            new Date(prescriptionDate.getTime() + 1000 * 60 * 60 * 24 * 30);
        prescription.setPrescriptionDate(expireDate);
        prescription.setExpireDate(expireDate);

        createPrescription(prescription);

        List<String> drugList = getMedicationList();

        for (int i = 0; i < 5; i++) {

            Medication medication = new Medication();
            prescription.getMedicationList().add(medication);
            medication.setPrescriptionId(prescriptionId);

            String medicationId  = drugList.get(FusionUtil.getRandomNumber(183));
            medication.setMedicationId(medicationId);
            medication.setQuantity((short)FusionUtil.getRandomNumber(30));
            medication.setRefills((short)FusionUtil.getRandomNumber(5));
            medication.setPharmacyId("1000");
            medication.setDirectionsForUse("DirectionsForUse");
            medication.setReadyToPickup(false);
            medication.setExpireDate(expireDate);
            medication.setSendToPharmacy(false);
            
            createPrescriptionMedication(medication);

        }

    }

    public String createPrescription(Prescription prescription) {

        String prescriptionId = FusionUtil.getSystemGeneratedNumber();
        String sql =
            "INSERT INTO prescription (PRESCRIPTION_ID,DOCTOR_ID,PATIENT_ID,VISIT_ID,PRESCRIPTION_DATE,EXPIRE_DATE) VALUES(?,?,?,?,?,?)";



        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, prescriptionId);
            pstmt.setString(2, prescription.getDoctorId());
            pstmt.setString(3, prescription.getPatientid());
            pstmt.setString(4,prescription.getVisitId());
            
            pstmt.setDate(5,new java.sql.Date(prescription.getPrescriptionDate().getTime()));
            pstmt.setDate(6,new java.sql.Date(prescription.getExpireDate().getTime()));

            pstmt.executeUpdate();


            // pstmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }
        for(Medication medication:prescription.getMedicationList()){
            medication.setPrescriptionId(prescriptionId);
            createPrescriptionMedication(medication);
        }
        return prescriptionId;
    }

    private void createPrescriptionMedication(Medication medication) {
        String sql =
            "INSERT INTO prescription_medication (PRESCRIPTION_MEDICATION_ID ,PRESCRIPTION_ID,MEDICATION_ID,QUANTITY,REFILLS,PHARMACY_ID,DIRECTIONS_FOR_USE,EXPIRE_DATE) VALUES(?,?,?,?,?,?,?,?)";

        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            
            String myId = FusionUtil.getSystemGeneratedNumber();
            
            pstmt.setString(1,myId);
            pstmt.setString(2, medication.getPrescriptionId());
            pstmt.setString(3, medication.getMedicationId());
            pstmt.setShort(4, medication.getQuantity());
            pstmt.setShort(5,medication.getRefills());
            pstmt.setString(6,medication.getPharmacyId());
            
            pstmt.setString(7,medication.getDirectionsForUse());
            pstmt.setDate(8,new java.sql.Date(medication.getExpireDate().getTime()));

            pstmt.executeUpdate();


            // pstmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            logger.info("error:HealthCareDB.createPrescriptionMedication");
            logger.info(e.getMessage());
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }
    }
    public List<Prescription> loadPrescription() {
        logger.info("load prescription from database is called");
        List<Prescription> prescriptionList = new ArrayList<Prescription>();
        List<String> prescriptionIdList = loadPrescriptionId();
        for(String prescriptionId:prescriptionIdList){
            Prescription prescription = loadPrescription(prescriptionId);
            prescriptionList.add(prescription);
        }
        return prescriptionList;
    }
    public List<String> loadPrescriptionId() {
        logger.info("load prescriptionId from database is called");
        List<String> prescriptionIdList = new ArrayList<String>();
 
        String sql =
            "select PRESCRIPTION_ID from PRESCRIPTION   ";

        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        try {
            pstmt = connection.prepareStatement(sql);

            resultSet = pstmt.executeQuery();
            while (resultSet.next()) {


                String prescriptionId = resultSet.getString("PRESCRIPTION_ID");
                prescriptionIdList.add(prescriptionId);

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }

        return prescriptionIdList;
    }

    public Prescription loadPrescription(String prescriptionId) {
        logger.info("load prescription from database is called");
        Prescription prescription = null;

        String sql =
            "select * from  PRESCRIPTION, PRESCRIPTION_MEDICATION, MEDICATION where prescription.PRESCRIPTION_ID = ? and prescription.prescription_id =  prescription_medication.prescription_id  and prescription_medication.medication_id = medication.medication_id ";

        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, prescriptionId);

            resultSet = pstmt.executeQuery();
            while (resultSet.next()) {

                if (prescription == null) {
                    prescription = new Prescription();
                    prescription.setPrescriptionId(prescriptionId);
                    prescription.setDoctorId(resultSet.getString("DOCTOR_ID"));
                    prescription.setPatientid(resultSet.getString("PATIENT_ID"));
                    prescription.setVisitId(resultSet.getString("VISIT_ID"));
                    prescription.setPrescriptionDate(resultSet.getDate("PRESCRIPTION_DATE"));
                    prescription.setExpireDate(resultSet.getDate("EXPIRE_DATE"));
                }

                Medication medication = new Medication();
                prescription.getMedicationList().add(medication);
                medication.setPrescriptionId(prescriptionId);

                medication.setMedicationId(resultSet.getString("MEDICATION_ID"));
                medication.setQuantity(resultSet.getShort("QUANTITY"));
                medication.setRefills(resultSet.getShort("REFILLS"));
                medication.setPharmacyId(resultSet.getString("PHARMACY_ID"));
                medication.setDirectionsForUse(resultSet.getString("DIRECTIONS_FOR_USE"));
                medication.setReadyToPickup(FusionUtil.convertStringToBoolean(resultSet.getString("IS_READY_TO_PICKUP_FL")));
                medication.setExpireDate(resultSet.getDate("EXPIRE_DATE"));
                medication.setSendToPharmacy(FusionUtil.convertStringToBoolean(resultSet.getString("SENT_TO_PHARMACY_FL")));
                medication.setSendToPharmacyDate(resultSet.getDate("SENT_TO_PHARMACY_DATE"));
                medication.setOrderNumber(resultSet.getString("ORDER_NUMBER"));
                medication.setNdcCode(resultSet.getString("NDC_CODE"));
                medication.setDrugName(resultSet.getString("NAME"));
               
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }
        return prescription;

    }
    public void setMedicationReadyToPickup(String orderNumber){
        logger.info("setMedicationReadyToPickup " + orderNumber);
        System.out.println("setMedicationReadyToPickup " + orderNumber);
        String sql =
        "UPDATE PRESCRIPTION_MEDICATION SET IS_READY_TO_PICKUP_FL=?  where ORDER_NUMBER = ?  ";


        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, "T");
            pstmt.setString(2, orderNumber);

            pstmt.executeUpdate();
            //pstmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }
    }
    public void updatePrescriptionMedicationOrderId(Medication medication){
        String orderId = medication.getOrderNumber();
        logger.info("updatePrescriptionMedicationOrderId " + orderId);
        
        String sql =
        "UPDATE PRESCRIPTION_MEDICATION SET ORDER_NUMBER=?  where PRESCRIPTION_ID = ?  and MEDICATION_ID = ?";


        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, orderId);
            pstmt.setString(2, medication.getPrescriptionId());
            pstmt.setString(3, medication.getMedicationId());

            pstmt.executeUpdate();
            //pstmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }
        
    }
    
}
