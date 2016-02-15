package com.oracle.ptsdemo.healthcare.ws.db;


import com.oracle.ptsdemo.healthcare.config.DBBase;
import com.oracle.ptsdemo.healthcare.business.datasync.custom.Medication;
import com.oracle.ptsdemo.healthcare.business.datasync.custom.Prescription;
import com.oracle.ptsdemo.healthcare.business.util.FusionUtil;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 */
public class HealthCareDB extends DBBase {
    
    
    static org.apache.log4j.Logger logger =
        org.apache.log4j.Logger.getLogger(HealthCareDB.class);


    /**
     */
    public HealthCareDB() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : constructor");
        }        
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        HealthCareDB healthCareDB = new HealthCareDB();
        healthCareDB.work();
    }

    /**
     */
    public void work(){
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : work()");
        }
        
        HealthCareDB healthCareDB = new HealthCareDB();
     //   healthCareDB.createMedication();
//        List<String> ndcCodeList = getMedicationList();
  //      for(String ndcCode:ndcCodeList){
    //        logger.info("medicationId: " + ndcCode);
      //  }
        healthCareDB.createPrescription();
    }

    /**
     * @return
     */
    public List<String> getMedicationList(){
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : getMedicationList");
        }
            
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
                logger.error("List<String> getMedicationList() - Error retrieving medication list", e);
                
            } finally {
                try {
                    resultSet.close();
                    pstmt.close();
                } catch (Exception e) {
                    logger.error("List<String> getMedicationList() - Error closing statement", e);
                }
                releaseConnection(connection);
            }
            return medicationList;

                
    }

    /**
     * @return
     */
    public List<Medication> getMedicationDetailList(){
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : getMEdicationDetailList()");
        }
            
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
                logger.error("List<Medication> getMedicationDetailList() - Error retrieving medication detail list", e);
            } finally {
                try {
                    resultSet.close();
                    pstmt.close();
                } catch (Exception e) {
                    logger.error("List<Medication> getMedicationDetailList() - Error closing statement", e);
                }
                releaseConnection(connection);
            }
            return medicationList;

                
    }

    /**
     * @param name
     * @param ndcCode
     */
    public void createMedication(String name, String ndcCode) {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : createMedication(String name, String ndcCode)");
        }
        
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
            logger.error("createMedication(String name, String ndcCode) - Error creating medication ", e);
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                logger.error("createMedication(String name, String ndcCode) - Error closing statement ", e);
            }
            releaseConnection(connection);
        }
    }

    private void createPrescription() {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : createPrescription()");
        }


      
        
        Prescription prescription = new Prescription();
        String prescriptionId = FusionUtil.getSystemGeneratedNumber();
        prescription.setPrescriptionId(prescriptionId);
        prescription.setDoctorId("300000001093092");
       // prescription.setPatientid("300000001038674");
//        prescription.setPatientid("300000001064466");
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

    /**
     * @param prescription
     * @return
     */
    public String createPrescription(Prescription prescription) {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : createPrescription(Prescription prescription)");
        }



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
            logger.error(" String createPrescription(Prescription prescription) - Error creating Prescription ", e);
            
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                logger.error(" String createPrescription(Prescription prescription) - Error closing statement ", e);
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
        
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : createPrescriptionMedication(Medication medication)");
        }
       
        
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
            logger.error("void createPrescriptionMedication(Medication medication) - Error creating PrescriptionMedication ", e);

        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                logger.error("void createPrescriptionMedication(Medication medication) - Error closing statement", e);
            }
            releaseConnection(connection);
        }
    }

    /**
     * @return
     */
    public List<Prescription> loadPrescription() {
        
        
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : List<Prescription> loadPrescription() ");
        }

        
        
        List<Prescription> prescriptionList = new ArrayList<Prescription>();
        List<String> prescriptionIdList = loadPrescriptionId();
        for(String prescriptionId:prescriptionIdList){
            System.out.println("prescriptionId " + prescriptionId);
            Prescription prescription = loadPrescription(prescriptionId);
            prescriptionList.add(prescription);
        }
        return prescriptionList;
    }

    /**
     * @return
     */
    public List<String> loadPrescriptionId() {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : List<String> loadPrescriptionId()");
        }

        
        
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
            logger.error("List<String> loadPrescriptionId() - Error loading PrescriptionID", e);
        } finally {
            try {
                resultSet.close();
                pstmt.close();
            } catch (Exception e) {
                logger.error("List<String> loadPrescriptionId() - Error closing statement", e);
            }
            releaseConnection(connection);
        }

        return prescriptionIdList;
    }

    /**
     * @param prescriptionId
     * @return
     */
    public Prescription loadPrescription(String prescriptionId) {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : loadPrescription(String prescriptionId)");
        }

        
        
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
             
            logger.error("Prescription loadPrescription(String prescriptionId) - Error loading prescription", e);
        } finally {
            try {
                resultSet.close();
                pstmt.close();
            } catch (Exception e) {
                logger.error("Prescription loadPrescription(String prescriptionId) - Error closing statement", e);
            }
            releaseConnection(connection);
        }
        return prescription;

    }

    /**
     * @param orderNumber
     */
    public void setMedicationReadyToPickup(String orderNumber){
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : setMedicationReadyToPickup(String orderNumber)");
        }

        
        
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
            logger.error("setMedicationReadyToPickup(String orderNumber) - Error setting medication is ready to pickup", e);
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                logger.error("setMedicationReadyToPickup(String orderNumber) - Error closing statement", e);
            }
            releaseConnection(connection);
        }
    }

    /**
     * @param medication
     */
    public void updatePrescriptionMedicationOrderId(Medication medication){
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : updatePrescriptionMedicationOrderId(Medication medication)");
        }

        
        
        String orderId = medication.getOrderNumber();
        logger.info("updatePrescriptionMedicationOrderId " + orderId);
        
        String sql =
        "UPDATE PRESCRIPTION_MEDICATION SET ORDER_NUMBER=?, " +
            "SENT_TO_PHARMACY_FL = ?, " +
            "SENT_TO_PHARMACY_DATE = ? " +
            "where PRESCRIPTION_ID = ?  and MEDICATION_ID = ?";


        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, orderId);
            String sentToPharmacyFL = "F";
            if (medication.isSendToPharmacy()) {
                sentToPharmacyFL = "T";
            }
            pstmt.setString(2, sentToPharmacyFL);            
            pstmt.setDate(3, new java.sql.Date(medication.getSendToPharmacyDate().getTime()));
            pstmt.setString(4, medication.getPrescriptionId());
            pstmt.setString(5, medication.getMedicationId());

            pstmt.executeUpdate();
            //pstmt.close();

        } catch (SQLException e) {
            logger.error(" void updatePrescriptionMedicationOrderId(Medication medication) - Error updating order number", e);
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                logger.error(" void updatePrescriptionMedicationOrderId(Medication medication) - Error closing statement", e);
            }
            releaseConnection(connection);
        }
        
    }
    
}
