package com.oracle.ptsdemo.healthcare.business.datasync.load.target;

import com.oracle.ptsdemo.healthcare.business.HealthCareException;
import com.oracle.ptsdemo.healthcare.business.datasync.custom.Medication;
import com.oracle.ptsdemo.healthcare.business.datasync.custom.Prescription;
import com.oracle.ptsdemo.healthcare.business.wsclient.SalesPartyClient;

import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.GetSalesParty;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.PrescriptionMedC;

import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.SalesAccount;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.SalesParty;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.UpdateSalesAccount;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.UpdateSalesParty;

import java.math.BigDecimal;

import java.util.GregorianCalendar;

import java.util.logging.Logger;

import javax.xml.datatype.DatatypeFactory;


/**
 */
public class SalesPartyLoadTgr extends SalesPartyClient {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    /**
     */
    public SalesPartyLoadTgr() {
        super();
    }

    /**
     * @param prescription
     */
    public void loadPrescriptionMed(Prescription prescription) throws HealthCareException {


        //   List<String> oscOrderIdList = getOrderIdList();

        // for (String orderId : oscOrderIdList) {
        //   logger.info("orderId in OSC-------------------- " + orderId);
        // }


        String doctorId = prescription.getDoctorId();
        String patientId = prescription.getPatientid();
        String prescriptionId = prescription.getPrescriptionId();


        try {
            GetSalesParty getSalesParty = objectFactory.createGetSalesParty();
            getSalesParty.setPartyId(Long.parseLong(patientId));
            SalesParty existingSalesParty =
                existingSalesParty = salesPartyService.getSalesParty(getSalesParty).getResult();
            logger.info("prescriptionId from DB****************** " +
                        prescriptionId);

            if (existingSalesParty != null) {
                logger.info("found existing salesParty*******************");

                existingSalesParty.getSalesAccount().get(0).getPrescriptionMedCollectionC();
                for (Medication medication :
                     prescription.getMedicationList()) {


                    //   if (oscOrderIdList.contains(medication.getOrderNumber())==false) {
                         PrescriptionMedC prescriptionMedC =
                            objectFactory.createPrescriptionMedC();
                        prescriptionMedC.setDocIdC(objectFactory.createPrescriptionMedCDocIdC(doctorId));
                        prescriptionMedC.setPatIDC(objectFactory.createPrescriptionMedCPatIDC(patientId));
                        prescriptionMedC.setPreIDC(objectFactory.createPrescriptionMedCPreIDC(prescriptionId));

                        String orderNumber = medication.getOrderNumber();
                        prescriptionMedC.setOrderNumberC(objectFactory.createPrescriptionMedCOrderNumberC(orderNumber));

                        String sentToPharmacy =
                            convertBooleanToString(medication.isSendToPharmacy());
                        prescriptionMedC.setSentToPharmacyC(objectFactory.createPrescriptionMedCSentToPharmacyC(sentToPharmacy));

                        if (medication.getSendToPharmacyDate() != null) {
                            GregorianCalendar gTimeStamp =
                                new GregorianCalendar();
                            gTimeStamp.setTimeInMillis(medication.getSendToPharmacyDate().getTime());
                            prescriptionMedC.setSentToPharmacyDateC(objectFactory.createPrescriptionMedCSentToPharmacyDateC(DatatypeFactory.newInstance().newXMLGregorianCalendar(gTimeStamp)));
                        }
                        if (medication.getExpireDate() != null) {
                            GregorianCalendar gTimeStamp =
                                new GregorianCalendar();
                            gTimeStamp.setTimeInMillis(medication.getExpireDate().getTime());
                            prescriptionMedC.setExpireDateC(objectFactory.createPrescriptionMedCExpireDateC(DatatypeFactory.newInstance().newXMLGregorianCalendar(gTimeStamp)));
                        }
                        String readyToPickup =
                            convertBooleanToString(medication.isReadyToPickup());
                        prescriptionMedC.setReadyToPickupC(objectFactory.createPrescriptionMedCReadyToPickupC(readyToPickup));

                        String directionForUse =
                            medication.getDirectionsForUse();
                        prescriptionMedC.setDirectionForUseC(objectFactory.createPrescriptionMedCDirectionForUseC(directionForUse));

                        prescriptionMedC.setQUANTITYC(objectFactory.createPrescriptionMedCQUANTITYC(new BigDecimal(medication.getQuantity())));
                        prescriptionMedC.setREFILLSC(objectFactory.createPrescriptionMedCREFILLSC(new BigDecimal(medication.getRefills())));

                        String ndcCode = medication.getNdcCode();
                        prescriptionMedC.setNDCCodeC(objectFactory.createPrescriptionMedCNDCCodeC(ndcCode));
                        String drugName = medication.getDrugName();
                        prescriptionMedC.setDrugNameC(objectFactory.createPrescriptionMedCDrugNameC(drugName));


                }
                UpdateSalesParty updateSalesParty =
                    objectFactory.createUpdateSalesParty();
                
                
                SalesParty salesParty = objectFactory.createSalesParty();
                
                
                updateSalesParty.setSalesParty(salesParty);


                UpdateSalesAccount updateSalesAccount = objectFactory.createUpdateSalesAccount();
                
                SalesAccount salesAccount = objectFactory.createSalesAccount();
                logger.info("existingSalesParty.getSalesAccount().get(0).getPartyId() " + existingSalesParty.getSalesAccount().get(0).getPartyId());
                salesAccount.setPartyId(existingSalesParty.getSalesAccount().get(0).getPartyId());
                
//                updateSalesAccount.setSalesAccount(salesAccount);
                updateSalesAccount.setSalesAccount(existingSalesParty.getSalesAccount().get(0));
                salesPartyService.updateSalesAccount(updateSalesAccount);
            //    salesPartyService.updateSalesParty(updateSalesParty);
            }
        } catch (Exception e) {
             throw new HealthCareException(e);
        }
    }

}
