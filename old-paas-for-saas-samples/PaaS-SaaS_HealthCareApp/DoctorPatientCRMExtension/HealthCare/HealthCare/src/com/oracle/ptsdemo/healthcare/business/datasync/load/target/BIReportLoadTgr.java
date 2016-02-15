package com.oracle.ptsdemo.healthcare.business.datasync.load.target;


import com.oracle.ptsdemo.healthcare.business.HealthCareException;
import com.oracle.ptsdemo.healthcare.business.datasync.custom.Medication;
import com.oracle.ptsdemo.healthcare.business.datasync.custom.Prescription;
import com.oracle.ptsdemo.healthcare.business.wsclient.CustomObjectClient;
import com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.generated.FindControl;
import com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.generated.FindCriteria;
import com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.generated.MedC;
import com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.generated.PresC;
import com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.generated.PresMedC;
import com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.generated.PrescriptionC;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeFactory;


/**
 */
public class BIReportLoadTgr extends CustomObjectClient {
    private  final Logger logger = Logger.getLogger(this.getClass().getName());

    

    /**
     */
    public BIReportLoadTgr() throws HealthCareException {
        super();
    }

    /**
     * @param medicationList
     */
    public void loadAllMedication(List<Medication> medicationList){
        logger.info("loadAllMedication to OSC***************");
        List<String> oscMedicationIdList = getMedicationIdList();

        for (String medicationId : oscMedicationIdList) {
            logger.info("medicationId in OSC-------------------- " + medicationId);
        }



        logger.info("loadAllMedication to OSC***************loop medicationLid");

        for (Medication medication : medicationList) {

          //  logger.info("durgName " + medication.getDrugName());

            if (oscMedicationIdList.contains(medication.getMedicationId())==false) {
             //   logger.info("begin to call osc to create a medication");
                try {

                    com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.generated.MedC medC = objectFactory.createMedC();
                    
                    String name = medication.getDrugName();
                    String ndcCodeC = medication.getNdcCode();
                    String medicationId = medication.getMedicationId();
                    
                    
                //    logger.info("name " + name);
                  //  logger.info("ndcCode " + ndcCodeC);
                    //logger.info("medicationId " + medicationId);
                    
                    medC.setMEDICATIONIDC(objectFactory.createMedCMEDICATIONIDC(new BigDecimal(medicationId)));
                    medC.setNAMEC(objectFactory.createMedCNAMEC(name));
                    medC.setNDCCODEC(objectFactory.createMedCNDCCODEC(new BigDecimal(ndcCodeC)));

                    customerCenterCustomObjectService.createEntity(medC,
                                                                   "Med_c");


                } catch (Exception e) {
                    logger.info(e.getMessage());
                     
                }
            }
        }
        
    }

    /**
     * @param prescriptionList
     */
    public void loadAllPrescription(List<Prescription> prescriptionList) throws HealthCareException {
        List<String> oscPrescriptionIdList = getPresIdList();
//        List<String> oscMedicationIdList = getMedicationIdList();
//        for (String prescriptionId : oscPrescriptionIdList) {
//            logger.info("prescriptionId in OSC-------------------- " + prescriptionId);
//        }
        for(Prescription prescription:prescriptionList){
            if(!oscPrescriptionIdList.contains(prescription.getPrescriptionId())){
                loadPrescriptionCustomObject(prescription);
            }
        }
    }       
    private void loadPrescriptionCustomObject(Prescription prescription) throws HealthCareException {

        String prescriptionId = prescription.getPrescriptionId();

        logger.info("prescriptionId from DB****************** " +
                    prescriptionId);


        try {
                        
            com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.generated.PresC presC =
                objectFactory.createPresC();
            
            presC.setPRESCRIPTIONIDC(objectFactory.createPresCPRESCRIPTIONIDC(new BigDecimal(prescription.getPrescriptionId())));
            
            
            if(prescription.getDoctorId()!=null){
                presC.setDocIdC(objectFactory.createPresCDocIdC(new BigDecimal(prescription.getDoctorId())));
            }
            if(prescription.getPatientid()!=null){
                presC.setPatIdC(objectFactory.createPresCPatIdC(new BigDecimal(prescription.getPatientid())));
            }
            if(prescription.getVisitId()!=null){
                presC.setVitIdC(objectFactory.createPresCPatIdC(new BigDecimal(prescription.getVisitId())));
            }
            if(prescription.getPrescriptionDate()!=null){
                GregorianCalendar gTimeStamp = new GregorianCalendar();
                gTimeStamp.setTimeInMillis(prescription.getPrescriptionDate().getTime());
                presC.setPRESCRIPTIONDATEC(objectFactory.createPresCPRESCRIPTIONDATEC(DatatypeFactory.newInstance().newXMLGregorianCalendar(gTimeStamp)));
                
            }
            if(prescription.getExpireDate()!=null){
                GregorianCalendar gTimeStamp = new GregorianCalendar();
                gTimeStamp.setTimeInMillis(prescription.getExpireDate().getTime());
                presC.setPRESCRIPTIONDATEC(objectFactory.createPresCEXPIREDATEC(DatatypeFactory.newInstance().newXMLGregorianCalendar(gTimeStamp)));
                
            }
            for (Medication medication : prescription.getMedicationList()) {

                        PresMedC presMedC =
                            objectFactory.createPresMedC();
 
                presC.getPresMedCollectionC().add(presMedC);
                
               
             //   presMedC.setPresIdC(objectFactory.createPresMedCPresIdC(new BigDecimal(medication.getPrescriptionId())));
                presMedC.setMEDICATIONIDC(objectFactory.createPresMedCMEDICATIONIDC(medication.getMedicationId()));
             //   presMedC.setMEDICATIONIDC(objectFactory.createPresMedCMEDICATIONIDC("1387642115564"));
                
                String orderNumber = medication.getOrderNumber();
                if(orderNumber!=null){
                presMedC.setORDERNUMBERC(objectFactory.createPresMedCORDERNUMBERC(new BigDecimal(orderNumber)));
                }
                
                boolean sentToPharmacy =
                   medication.isSendToPharmacy();
                presMedC.setSENTTOPHARMACYFLC(objectFactory.createPresMedCSENTTOPHARMACYFLC(sentToPharmacy));
                


                if (medication.getSendToPharmacyDate() != null) {
                    GregorianCalendar gTimeStamp = new GregorianCalendar();
                    gTimeStamp.setTimeInMillis(medication.getSendToPharmacyDate().getTime());
                    presMedC.setSENTTOPHARMACYDATEC(objectFactory.createPresMedCSENTTOPHARMACYDATEC(DatatypeFactory.newInstance().newXMLGregorianCalendar(gTimeStamp)));
                   
                }
                
                
                
                if (medication.getExpireDate() != null) {
                    GregorianCalendar gTimeStamp = new GregorianCalendar();
                    gTimeStamp.setTimeInMillis(medication.getExpireDate().getTime());
                    presMedC.setEXPIREDATEC(objectFactory.createPresMedCEXPIREDATEC(DatatypeFactory.newInstance().newXMLGregorianCalendar(gTimeStamp)));
                }
                
                boolean readyToPickup =
                    medication.isReadyToPickup();
                presMedC.setISREADYTOPICKUPFLC(objectFactory.createPresMedCISREADYTOPICKUPFLC(readyToPickup));


                String directionForUse = medication.getDirectionsForUse();
                presMedC.setDIRECTIONSFORUSEC(objectFactory.createPresMedCDIRECTIONSFORUSEC(directionForUse));
                

                presMedC.setQUANTITYC(objectFactory.createPresMedCQUANTITYC(new BigDecimal(medication.getQuantity())));
                presMedC.setREFILLSC(objectFactory.createPresMedCREFILLSC(new BigDecimal(medication.getRefills())));
                

                
                

            }
                     //   logger.info("presctiptionId ******************* " +
                                  //  prescriptionC.getPreIDC().getValue());


            customerCenterCustomObjectService.createEntity(presC,
                                                           "Pres_c");
           



        } catch (Exception e) {
             throw new HealthCareException(e);
        }



        
        
    }

    /**
     * @param prescription
     */
    public void loadPrescription(Prescription prescription) throws HealthCareException {

        List<String> oscOrderIdList = getOrderIdList();

        for (String orderId : oscOrderIdList) {
            logger.info("orderId in OSC-------------------- " + orderId);
        }


        String doctorId = prescription.getDoctorId();
        String patientId = prescription.getPatientid();
        String prescriptionId = prescription.getPrescriptionId();

        logger.info("prescriptionId from DB****************** " +
                    prescriptionId);

        for (Medication medication : prescription.getMedicationList()) {


            if (oscOrderIdList.contains(medication.getOrderNumber())==false) {
                try {

                    com.oracle.ptsdemo.healthcare.wsclient.osc.customsvc.generated.PrescriptionC prescriptionC =
                        objectFactory.createPrescriptionC();
                    prescriptionC.setDocIdTC(objectFactory.createPrescriptionCDocIdTC(doctorId));
                    prescriptionC.setPatIdTC(objectFactory.createPrescriptionCPatIdTC(patientId));
                    prescriptionC.setPreIDC(objectFactory.createPrescriptionCPrescriptionIdC(prescriptionId));

                    String orderNumber = medication.getOrderNumber();
                    prescriptionC.setOrderNumberC(objectFactory.createPrescriptionCOrderNumberC(orderNumber));

                    String sentToPharmacy =
                        convertBooleanToString(medication.isSendToPharmacy());
                    prescriptionC.setSentToPharmacyC(objectFactory.createPrescriptionCSentToPharmacyC(sentToPharmacy));

                    if (medication.getSendToPharmacyDate() != null) {
                        GregorianCalendar gTimeStamp = new GregorianCalendar();
                        gTimeStamp.setTimeInMillis(medication.getSendToPharmacyDate().getTime());
                        prescriptionC.setSentToPharmacyDateC(objectFactory.createPrescriptionCSentToPharmacyDateC(DatatypeFactory.newInstance().newXMLGregorianCalendar(gTimeStamp)));
                    }
                    if (medication.getExpireDate() != null) {
                        GregorianCalendar gTimeStamp = new GregorianCalendar();
                        gTimeStamp.setTimeInMillis(medication.getExpireDate().getTime());
                        prescriptionC.setSentToPharmacyDateC(objectFactory.createPrescriptionCExpireDateC(DatatypeFactory.newInstance().newXMLGregorianCalendar(gTimeStamp)));
                    }
                    String readyToPickup =
                        convertBooleanToString(medication.isReadyToPickup());
                    prescriptionC.setReadyToPickupC(objectFactory.createPrescriptionCReadyToPickupC(readyToPickup));

                    String directionForUse = medication.getDirectionsForUse();
                    prescriptionC.setDirectionForUseC(objectFactory.createPrescriptionCDirectionForUseC(directionForUse));

                    prescriptionC.setQUANTITYC(objectFactory.createPrescriptionCQUANTITYC(new BigDecimal(medication.getQuantity())));
                    prescriptionC.setREFILLSC(objectFactory.createPrescriptionCREFILLSC(new BigDecimal(medication.getRefills())));

                    String ndcCode = medication.getNdcCode();
                    prescriptionC.setNDCCodeC(objectFactory.createPrescriptionCNDCCodeC(ndcCode));
                    String drugName = medication.getDrugName();
                    prescriptionC.setDrugNameC(objectFactory.createPrescriptionCDrugNameC(drugName));


                 //   logger.info("presctiptionId ******************* " +
                              //  prescriptionC.getPreIDC().getValue());


                    customerCenterCustomObjectService.createEntity(prescriptionC,
                                                                   "Prescription_c");


                } catch (Exception e) {
                    throw new HealthCareException(e);
                }
            }
        }
    }


    /**
     * @return
     */
    public List<String> getPresIdList() throws HealthCareException {
        List<String> returnList = new ArrayList<String>();

        try {

            FindCriteria findCriteria = objectFactory.createFindCriteria();
            findCriteria.setFetchSize(100);
            FindControl findControl = objectFactory.createFindControl();
            findControl.setRetrieveAllTranslations(true);
            int start = 0;

            while (true) {
                findCriteria.setFetchStart(start);
                start += 100;
                List<Object> resultList =
                    customerCenterCustomObjectService.findEntity(findCriteria,
                                                                 findControl,
                                                                 "Pres_c");
                for (Object object : resultList) {
                    PresC preC = (PresC)object;

                   // logger.info("drugName " +
                            //    prescriptionC.getDrugNameC().getValue());
                  //  logger.info("getDoctorIdC " +
                         //       prescriptionC.getDocIdTC().getValue());
                    // logger.info("getPrescriptionIdC " + prescriptionC.getPreIDC().getValue());
                    logger.info("preC.getPRESCRIPTIONIDC() " + preC.getPRESCRIPTIONIDC().getValue().toPlainString());
                    returnList.add(preC.getPRESCRIPTIONIDC().getValue().toPlainString());
                }
                if (resultList.size() == 0) {
                    break;
                }
            }


        } catch (Exception e) {
             throw new HealthCareException(e);
        }
        return returnList;
    }

    /**
     * @return
     */
    public List<String> getOrderIdList() {
        List<String> returnList = new ArrayList<String>();

        try {

            FindCriteria findCriteria = objectFactory.createFindCriteria();
            findCriteria.setFetchSize(100);
            FindControl findControl = objectFactory.createFindControl();
            findControl.setRetrieveAllTranslations(true);
            int start = 0;

            while (true) {
                findCriteria.setFetchStart(start);
                start += 100;
                List<Object> resultList =
                    customerCenterCustomObjectService.findEntity(findCriteria,
                                                                 findControl,
                                                                 "Prescription_c");
                for (Object object : resultList) {
                    PrescriptionC prescriptionC = (PrescriptionC)object;

                    logger.info("drugName " +
                                prescriptionC.getDrugNameC().getValue());
                    logger.info("getDoctorIdC " +
                                prescriptionC.getDocIdTC().getValue());
                    // logger.info("getPrescriptionIdC " + prescriptionC.getPreIDC().getValue());

                    returnList.add(prescriptionC.getOrderNumberC().getValue());
                }
                if (resultList.size() == 0) {
                    break;
                }
            }


        } catch (Exception e) {
             
        }
        return returnList;
    }

    /**
     * @return
     */
    public List<String> getMedicationIdList() {
        List<String> returnList = new ArrayList<String>();

        try {
            FindCriteria findCriteria = objectFactory.createFindCriteria();
            findCriteria.setFetchSize(100);
            FindControl findControl = objectFactory.createFindControl();
            findControl.setRetrieveAllTranslations(true);
            int start = 0;
            while (true) {
                 findCriteria.setFetchStart(start);
                start += 100;
                if(customerCenterCustomObjectService==null){
                    logger.info("customerCenterCustomObjectService is null");
                }
            //    try{
                List<Object> resultList =
                    customerCenterCustomObjectService.findEntity(findCriteria,
                                                                 findControl,
                                                                 "Med_c");
             //   }
             //   catch(Exception e){
             //        
                                       
             //   }
                if(resultList==null){
                    logger.info("resultList is null");
                }
                for (Object object : resultList) {
                    MedC medC = (MedC)object;
 
                    logger.info("drugName " +
                                medC.getNAMEC().getValue());
                    logger.info("ndcCode " +
                                medC.getNDCCODEC().getValue());
                    logger.info("medicationId " +
                                medC.getMEDICATIONIDC().getValue());
                    // logger.info("getPrescriptionIdC " + prescriptionC.getPreIDC().getValue());

                    returnList.add(medC.getMEDICATIONIDC().getValue().toPlainString());
                }
                if (resultList.size() == 0) {
                    break;
                }
            }


        } catch (Exception e) {
             
            logger.info("Error: BIReportLoadTgr.getMedicationIdList" + e.getMessage());
            logger.info("Error calling  customerCenterCustomObjectService.findEntity " + e.getMessage());
            for(StackTraceElement error:e.getStackTrace()){
                logger.info("className " + error.getClassName());
                logger.info("FileName " + error.getFileName());
                logger.info("LineNumber " + error.getLineNumber());
                logger.info("MethodName " + error.getMethodName());
            }
            logger.info("Error calling  customerCenterCustomObjectService.findEntity " + e.getMessage());
            logger.info("Error calling  customerCenterCustomObjectService.findEntity " + e.getMessage());
        }
        return returnList;
    }



}
