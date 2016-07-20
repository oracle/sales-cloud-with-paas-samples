package com.oracle.pts.custom.load;

import com.oracle.pts.custom.AttributeEntry;
import com.oracle.pts.custom.CustomFieldHolder;
import com.oracle.pts.custom.DataSet;
import com.oracle.pts.db.HealthCareDB;
import com.oracle.pts.db.MappingObjDB;
import com.oracle.pts.salesparty.wsclient.generated.SalesParty;
import com.oracle.pts.vo.Doctor;
import com.oracle.pts.vo.MappingAttr;
import com.oracle.pts.vo.MappingObj;
import com.oracle.pts.vo.Medication;
import com.oracle.pts.vo.Patient;
import com.oracle.pts.vo.Prescription;

import com.oracle.pts.ws.CRMProcessor;

import java.util.List;
import java.util.logging.Logger;

public class DataLoadPharmacy {
    Logger logger = Logger.getLogger("CRM");
    public DataLoadPharmacy() {
        super();
    }
    public void loadPrescription(){
        
        PharmacyLoadSrc pharmacyLoadSrc = new PharmacyLoadSrc();
        pharmacyLoadSrc.loadPrescription();
       
        
        
        
        PharmacyLoadTgr pharmacyLoadTgr = new PharmacyLoadTgr();
      //  pharmacyLoadTgr.loadPrescription();

    }
    public String loadPrescription(String prescriptionId){
        String orderId = null;

        logger.info("Calling JCS Pharmacy DB************************* prescriptionId " + prescriptionId);
        PharmacyLoadSrc pharmacyLoadSrc = new PharmacyLoadSrc();
       // pharmacyLoadSrc.loadPrescription();
        Prescription prescription  = pharmacyLoadSrc.loadPrescription(prescriptionId);
        
        if(prescription!=null){
        
            
            logger.info("Calling OSC salesParty*****************************");

           // CRMProcessor.disable=true;
            String objectName = "SalesParty";
            CustomFieldHolder customFieldHolder = new CustomFieldHolder();
            customFieldHolder.setObjectName(objectName);

            SalesPartyLoadSrc salesPartyLoadSrc  = new SalesPartyLoadSrc();
            SalesParty doctorSalesParty = salesPartyLoadSrc.getSalesParty(Long.valueOf(prescription.getDoctorId()));
   
            customFieldHolder.printCustomFieldHolder();

            Doctor doctor = new Doctor();
            doctor.setName(doctorSalesParty.getPartyName().getValue());
            
            logger.info("doctorName************ " + doctor.getName());
            
            objectName = "SalesParty";
            customFieldHolder = new CustomFieldHolder();
            customFieldHolder.setObjectName(objectName);
            SalesParty patientSalesParty = salesPartyLoadSrc.getSalesParty(Long.valueOf(prescription.getPatientid()));
             Patient patient = generatePatient(patientSalesParty,customFieldHolder);
 
            for(Medication medicatoin: prescription.getMedicationList()){
                medicatoin.setDoctor(doctor);
                medicatoin.setPatient(patient);
            }
            
            logger.info("Calling Pharmacy*****************************");
            
            PharmacyLoadTgr pharmacyLoadTgr = new PharmacyLoadTgr();
            pharmacyLoadTgr.loadPrescription(prescription);
    
        }
        return orderId;
    }
    public boolean isMedicationReadyToPickup(String orderNumber){
        return true;
    }
     
    public String requestOrderStatus(String orderNumber){
     //   -->  returns status: Requested, Ready, In Progress, etc **not mandatory**    
        return null;
    }

    public void setMedicationReadyToPickup(String orderNumber){
        HealthCareDB healthCareDB = new HealthCareDB();
        healthCareDB.setMedicationReadyToPickup(orderNumber);
    }
    public Patient generatePatient(SalesParty patientSalesParty,CustomFieldHolder customFieldHolder){
        Patient patient = new Patient();
        patient.setName(patientSalesParty.getPartyName().getValue());
        
        
        customFieldHolder.printCustomFieldHolder();


        DataSet dataSet = null;
        List<DataSet> dataSetList = customFieldHolder.getDataSetList().get(0).getChildDataSet();
        for(DataSet cDataSet:dataSetList){
            if(cDataSet.getName().equals("SalesAccount")){
                dataSet = cDataSet;
                break;
            }
        }
        if(dataSet!=null){
            for(AttributeEntry attr:dataSet.getAttributeList()){
                String name = attr.getName();
                String value = attr.getValue();
                System.out.println("name " + name + " value " + value);
            }
        }


        
        MappingObjDB mappingObjDB = new MappingObjDB();
        MappingObj mappingObj = mappingObjDB.getMappingObj("PharmacyPatient");
        
        for(MappingAttr mappingAttr:mappingObj.getMappingAttrList()){
            String targetObj = mappingAttr.getTargetObj();
            String targetAttr = mappingAttr.getTargetAttr();
            String sourceObj = mappingAttr.getSourceObj();
            String SourcetAttr = mappingAttr.getSourceAttr();
            String defaultValue = mappingAttr.getDefaultValue();
            
            boolean existingPatient = false;
            if(dataSet.getAttributeEntry(SourcetAttr)!=null){
                if(targetAttr.equals("ExistingPatient")){
                    String value = dataSet.getAttributeEntry(SourcetAttr).getValue();
                    if(value!=null){
                        if(value.equals("1")){
                            existingPatient = true;   
                        }
                    }
                    else{
                        if(defaultValue!=null && defaultValue.equals("true")){
                            existingPatient = true;
                        }
                    }
                    patient.setExistingPatient(existingPatient);
                }
                else if(targetAttr.equals("InsuranceStatus")){
                    String insuranceStatus = null;
                    String value = dataSet.getAttributeEntry(SourcetAttr).getValue();
                    if(value!=null){
                        insuranceStatus = value;
                    }
                    else{
                        insuranceStatus = defaultValue;
                    }
                    patient.setInsuranceStatus(insuranceStatus);
                }
            
            }
        }
        
        

        
        
        return patient;
    }
    
}
