package com.oracle.ptsdemo.healthcare.business.datasync.load;


import com.oracle.ptsdemo.healthcare.business.HealthCareException;
import com.oracle.ptsdemo.healthcare.business.datasync.custom.Doctor;
import com.oracle.ptsdemo.healthcare.business.datasync.custom.Medication;
import com.oracle.ptsdemo.healthcare.business.datasync.custom.Patient;
import com.oracle.ptsdemo.healthcare.business.datasync.custom.Prescription;
import com.oracle.ptsdemo.healthcare.business.datasync.dynamic.CustomFieldHolder;
import com.oracle.ptsdemo.healthcare.business.datasync.dynamic.DataSet;
import com.oracle.ptsdemo.healthcare.business.datasync.load.db.MappingObjDB;
import com.oracle.ptsdemo.healthcare.business.datasync.load.source.PharmacyLoadSrc;
import com.oracle.ptsdemo.healthcare.business.datasync.load.source.SalesPartyLoadSrc;
import com.oracle.ptsdemo.healthcare.business.datasync.load.target.PharmacyLoadTgr;
import com.oracle.ptsdemo.healthcare.ws.db.HealthCareDB;
import com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated.SalesParty;

import java.io.IOException;

import java.util.List;

import javax.xml.soap.SOAPException;


/**
 */
public class DataLoadPharmacy {

    static org.apache.log4j.Logger logger =
        org.apache.log4j.Logger.getLogger(DataLoadPharmacy.class);

    private String jwtToken;

    /**
     */
    public DataLoadPharmacy() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : constructor");
        }
    }

    /**
     */
    public void loadPrescription() throws HealthCareException {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + ".loadPrescription()");
        }

        PharmacyLoadSrc pharmacyLoadSrc = new PharmacyLoadSrc();
        pharmacyLoadSrc.loadPrescription();


    }

    /**
     * @param prescriptionId
     * @param doctorName
     * @return
     * @throws Exception
     */
    public String loadPrescriptionAndSendToPharmacy(String prescriptionId,
                                                    String doctorName) throws HealthCareException {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() +
                         ".loadPrescription(String prescriptionId)");
        }

        String orderId = null;

        logger.info("Calling JCS Pharmacy DB************************* prescriptionId " +
                    prescriptionId);
        PharmacyLoadSrc pharmacyLoadSrc = new PharmacyLoadSrc();

        //read prescription from DBCS table
        Prescription prescription =
            pharmacyLoadSrc.loadPrescriptionFromDBCS(prescriptionId);

        if (prescription != null) {
            logger.info("Calling OSC salesParty*****************************");

            try {


                Doctor doctor = new Doctor();
                doctor.setName(doctorName);

                long patientId = Long.valueOf(prescription.getPatientid());

                Patient patient = generatePatient(patientId);

                for (Medication medicatoin :
                     prescription.getMedicationList()) {
                    medicatoin.setDoctor(doctor);
                    medicatoin.setPatient(patient);
                }
            } catch (Exception e) {
                logger.error("Failure parsing SalesParty object on loadPrescription",
                             e);
                throw new HealthCareException(e);
            }

            logger.info("Calling Pharmacy*****************************");

            try {
                PharmacyLoadTgr pharmacyLoadTgr = new PharmacyLoadTgr();
                pharmacyLoadTgr.sendPrescriptionToPharmacy(prescription);
            } catch (Exception e) {
                logger.error("Failure while calling PharmacyWS(PharmacyLoadTgr)",
                             e);
            } finally {
                logger.info("Finished calling Pharmacy");
            }


        }
        return orderId;
    }


    /**
     * @param orderNumber
     * @return
     */
    public boolean isMedicationReadyToPickup(String orderNumber) {
        if (orderNumber != null) {
            return true;
        }
        return false;
    }


    /**
     * @param orderNumber
     */
    public void setMedicationReadyToPickup(String orderNumber) {
        HealthCareDB healthCareDB = new HealthCareDB();
        healthCareDB.setMedicationReadyToPickup(orderNumber);
    }


    private Patient generatePatient(Long patientId) throws SOAPException,
                                                           IOException {
        CustomFieldHolder customFieldHolder = new CustomFieldHolder();
        customFieldHolder.setObjectName("SalesParty");


        SalesPartyLoadSrc salesPartyLoadSrc = new SalesPartyLoadSrc(jwtToken);
        SalesParty patientSalesParty = null;

        try {

            patientSalesParty = salesPartyLoadSrc.getSalesParty(patientId);
        } catch (Exception e) {
            logger.error(e);
        }


        String patientName = patientSalesParty.getPartyName().getValue();

        Patient patient = new Patient();
        patient.setName(patientName);
        patient.setPatientId(String.valueOf(patientId));


        DataSet dataSet = null;


        if (customFieldHolder != null) {
            List<DataSet> listDataSet = customFieldHolder.getDataSetList();

            if (listDataSet != null && !listDataSet.isEmpty()) {

                List<DataSet> dataSetList =
                    listDataSet.get(0).getChildDataSet();

                for (DataSet cDataSet : dataSetList) {
                    if ("SalesAccount".equals(cDataSet.getName())) {
                        dataSet = cDataSet;
                        break;
                    }
                }

            }
        }

        if (dataSet != null) {
            MappingObjDB mappingObjDB = new MappingObjDB();
            MappingObj mappingObj =
                mappingObjDB.getMappingObj("PharmacyPatient");

            readCustomFields(patient, dataSet, mappingObj);
        }

        return patient;
    }

    /**
     *
     * @param patient
     * @param dataSet
     * @param mappingObj
     */
    private void readCustomFields(Patient patient, DataSet dataSet,
                                  MappingObj mappingObj) {
        for (MappingAttr mappingAttr : mappingObj.getMappingAttrList()) {
            String targetAttr = mappingAttr.getTargetAttr();
            String sourcetAttr = mappingAttr.getSourceAttr();
            String defaultValue = mappingAttr.getDefaultValue();

            boolean existingPatient = false;

            if ("ExistingPatient".equals(targetAttr)) {
                String value =
                    dataSet.getAttributeEntry(sourcetAttr).getValue();
                if (value != null && "1".equals(value)) {
                    existingPatient = true;
                } else if (defaultValue != null &&
                           "true".equals(defaultValue)) {
                    existingPatient = true;
                }
                patient.setExistingPatient(existingPatient);
            } else if ("InsuranceStatus".equals(targetAttr)) {
                String insuranceStatus = null;
                String value =
                    dataSet.getAttributeEntry(sourcetAttr).getValue();
                if (value != null) {
                    insuranceStatus = value;
                } else {
                    insuranceStatus = defaultValue;
                }
                patient.setInsuranceStatus(insuranceStatus);
            }
        }
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
