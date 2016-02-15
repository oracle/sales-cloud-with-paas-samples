package com.oracle.pts.db;


import com.oracle.pts.util.FusionUtil;
import com.oracle.pts.vo.Doctor;
import com.oracle.pts.vo.HealthCareProvider;
import com.oracle.pts.vo.Medication;
import com.oracle.pts.vo.Patient;
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

public class PharmacyDB extends DBBase {
    private static final Logger logger = Logger.getLogger("CRM");

    public PharmacyDB() {
        super();
    }

    public static void main(String[] args) {
        PharmacyDB healthCareDB = new PharmacyDB();
        healthCareDB.work();
    }
    public void work(){
        PharmacyDB pharmacyDB = new PharmacyDB();

      //  pharmacyDB.createOrder();
    }
    public String createOrder(Medication medication){
        System.out.println("createMedication is called**************");
        logger.info("PharmacyDB.createMedication is called**************");
        medication.print();
  
        String orderId =   getSystemGeneratedNumber();        
                  
        String doctorId = storeDoctor(medication.getDoctor());                     
        String patientId = storePatient(medication.getPatient());    
        
        System.out.println("doctorId " + doctorId);
        
        String sql =
            "INSERT INTO P_PRESCRIPTION (ORDER_NUMBER,NDC_CODE,PATIENT_ID,DOCTOR_ID,QUANTITY,REFILLS,PHARMACY_ID,DIRECTIONS_FOR_USE,EXPIRE_DATE,ORDER_DATE,HEALTHCARE_PROVIDER_ID) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            System.out.println("ndcCode: " + medication.getNdcCode());
            
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, orderId);
            pstmt.setString(2, medication.getNdcCode());
            pstmt.setString(3, patientId);
            pstmt.setString(4,doctorId);
            pstmt.setShort(5,medication.getQuantity());
            pstmt.setShort(6,medication.getRefills());
            pstmt.setString(7,medication.getPharmacyId());
            pstmt.setString(8,medication.getDirectionsForUse());
            pstmt.setDate(9,new java.sql.Date(medication.getExpireDate().getTime()));
            pstmt.setDate(10,new java.sql.Date((new Date()).getTime()));
            pstmt.setString(11,getHealthCareProviderId("Oracle"));
            pstmt.executeUpdate();


            // pstmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            logger.info("Error SQL exception: " + e.getMessage());
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }  
       logger.info("PharmacyDB.createMedication is called**************");
  
        return orderId;
    }
    public String storeDoctor(Doctor doctor){
        System.out.println("storeDoctor is called**************");
        String doctorId = null;
        Doctor dbDoctor = getDBDoctor(doctor);
        if(dbDoctor!=null){
            doctorId = dbDoctor.getDoctorId();
        }
        else{
            String sql =
                "INSERT INTO P_DOCTOR (DOCTOR_ID,FIRST_NAME,LAST_NAME,NAME) VALUES(?,?,?,?)";

            Connection connection = getConnection();
            PreparedStatement pstmt = null;
            try {
                pstmt = connection.prepareStatement(sql);
                doctorId = getSystemGeneratedNumber();
                pstmt.setString(1, doctorId);
                pstmt.setString(2, doctor.getFirstName());
                pstmt.setString(3, doctor.getLastName());
                pstmt.setString(4,doctor.getName());
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
        return doctorId;
    }
    public Doctor getDBDoctor(Doctor doctor){
        Doctor dbDoctor = null;
        String sql =
            "select DOCTOR_ID from P_DOCTOR where name = ?    ";

        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, doctor.getName());
 
            resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                dbDoctor = new Doctor();
                dbDoctor.setDoctorId(resultSet.getString("DOCTOR_ID"));

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
        return dbDoctor;
    }
    public String storePatient(Patient patient){
        System.out.println("storePatient is called**************");
        String patientId = null;
        Patient dbPatient = getDBPatient(patient);
        if(dbPatient!=null){
            patientId = dbPatient.getPatientId();
        }
        else{
            String sql =
                "INSERT INTO P_PATIENT (PATIENT_ID,FIRST_NAME,LAST_NAME,NAME,EXISTING_PATIENT,INSURANCE_STATUS) VALUES(?,?,?,?,?,?)";

            Connection connection = getConnection();
            PreparedStatement pstmt = null;
            try {
                pstmt = connection.prepareStatement(sql);
                patientId = getSystemGeneratedNumber();
                pstmt.setString(1, patientId);
                pstmt.setString(2, patient.getFirstName());
                pstmt.setString(3, patient.getLastName());
                pstmt.setString(4,patient.getName());
                pstmt.setBoolean(5,patient.isExistingPatient());
                pstmt.setString(6,patient.getInsuranceStatus());
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
        return patientId;
    }
    public Patient getDBPatient(Patient patient){
        Patient dbPatient = null;
        String sql =
            "select PATIENT_ID from P_PATIENT where name = ?    ";

        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, patient.getName());
    
            resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                dbPatient = new Patient();
                dbPatient.setPatientId(resultSet.getString("PATIENT_ID"));

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
        return dbPatient;
    }
    public void setMedicationReadyToPickup(String orderNumber){
        logger.info("setMedicationReadyToPickup " + orderNumber);
        String sql =
        "UPDATE P_PRESCRIPTION SET IS_READY_TO_PICKUP_FL=?  where ORDER_NUMBER = ?  ";


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
    public void createMedication(List<Medication> medicationList) {
        
        List<String> existingMedicationList = getMedicationList();
        
        
        String sql =
            "INSERT INTO P_DRUG (NAME,NDC_CODE) VALUES(?,?)";

        Connection connection = getConnection();
        
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            
            for(Medication medication:medicationList){
                if(existingMedicationList.contains(medication.getDrugName())==false){
                    pstmt.setString(1,medication.getDrugName());
                    pstmt.setString(2, medication.getNdcCode());
        
                    pstmt.executeUpdate();
                }
            }

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
    public void createMedicationForHealthCare(List<Medication> medicationList) {
        System.out.println("createMedicationForHealthCare is called");
        System.out.println("medicationList.size() " + medicationList.size());
        List<String> existingMedicationList = getHealthCareMedicationList();
        
        logger.info("createMedicationForHealthCare is called");
        String sql =
            "INSERT INTO MEDICATION (MEDICATION_ID,NAME,NDC_CODE) VALUES(?,?,?)";

        Connection connection = getConnection();
        
        long id = Long.parseLong(getSystemGeneratedNumber());
        
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            
            for(Medication medication:medicationList){
                logger.info("medication.getDrugName(): " + medication.getDrugName());
                System.out.println("medication.getDrugName()****: " + medication.getDrugName());
                id++;
                if(existingMedicationList.contains(medication.getDrugName())==false){
                    System.out.println("Insert medication****");
                    pstmt.setString(1,String.valueOf(id++));
                    pstmt.setString(2,medication.getDrugName());
                    pstmt.setString(3, medication.getNdcCode());
        
                    pstmt.executeUpdate();
                }
            }

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
   
    public List<String> getMedicationList(){
            logger.info("getMedicationList from database is called");
            List<String> medicationList = new ArrayList<String>();

            String sql =
                "select NAME,NDC_CODE from P_DRUG   ";

            Connection connection = getConnection();
            PreparedStatement pstmt = null;
            ResultSet resultSet = null;

            try {
                pstmt = connection.prepareStatement(sql);

                resultSet = pstmt.executeQuery();
                while (resultSet.next()) {


                    String ndcCode = resultSet.getString("NAME");
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
    public List<String> getHealthCareMedicationList(){
            logger.info("getHealthCareMedicationList from database is called");
            List<String> medicationList = new ArrayList<String>();

            String sql =
                "select NAME,NDC_CODE from MEDICATION   ";

            Connection connection = getConnection();
            PreparedStatement pstmt = null;
            ResultSet resultSet = null;

            try {
                pstmt = connection.prepareStatement(sql);

                resultSet = pstmt.executeQuery();
                while (resultSet.next()) {


                    String ndcCode = resultSet.getString("NAME");
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
    public void loadHealthCareProviderList(List<HealthCareProvider> healthCareProviderList) {
        
        List<String> existingHealthCareProviderList = getHealthCareProviderList();
        
        
        String sql =
            "INSERT INTO P_HEALTHCARE_PROVIDER (HEALTHCARE_PROVIDER_ID,NAME, LOCATION,TEL,FAX) VALUES(?,?,?,?,?)";

        Connection connection = getConnection();
        
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            
            for(HealthCareProvider healthCareProvider:healthCareProviderList){
                if(existingHealthCareProviderList.contains(healthCareProvider.getName())==false){
                    pstmt.setString(1,getSystemGeneratedNumber());
                    pstmt.setString(2,healthCareProvider.getName());
                    pstmt.setString(3,healthCareProvider.getLoc());
                    pstmt.setString(4,healthCareProvider.getTel());
                    pstmt.setString(5,healthCareProvider.getFax());
                    pstmt.executeUpdate();
                }
            }

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
    public List<String> getHealthCareProviderList(){
            logger.info("getHealthCareProviderList from database is called");
            List<String> healthCareProviderList = new ArrayList<String>();

            String sql =
                "select NAME from P_HEALTHCARE_PROVIDER   ";

            Connection connection = getConnection();
            PreparedStatement pstmt = null;
            ResultSet resultSet = null;

            try {
                pstmt = connection.prepareStatement(sql);

                resultSet = pstmt.executeQuery();
                while (resultSet.next()) {


                    String name = resultSet.getString("NAME");
                    healthCareProviderList.add(name);

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
            return healthCareProviderList;

                
    }
    
    public String getHealthCareProviderId(String name){
            logger.info("getHealthCareProviderId from database is called");
            String id = null;

            String sql =
                "select HEALTHCARE_PROVIDER_ID from P_HEALTHCARE_PROVIDER  where name = ? ";

            Connection connection = getConnection();
            PreparedStatement pstmt = null;
            ResultSet resultSet = null;

            try {
                pstmt = connection.prepareStatement(sql);
                pstmt.setString(1,name);
                resultSet = pstmt.executeQuery();
                while (resultSet.next()) {


                    id= resultSet.getString("HEALTHCARE_PROVIDER_ID");
                   

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
            return id;

                
    }

    
}
