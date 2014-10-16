package com.oracle.ptsdemo.healthcare.business.datasync.dynamic;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class PharmacyMetaInfoFactory {
    /**
     */
    protected static Map<String, MetaInfo> targetObjectList;

    /**
     */
    protected static Map<String, MetaInfo> sourceObjectList;

    /**
     */
    protected static List<String> targetObjectNameList;

    /**
     */
    protected static MetaInfoFactory salesPartyMetaInfoFactory;

    /**
     */
    public PharmacyMetaInfoFactory() {
        super();
        init();
    }

    private void init() {
     //   CRMProcessor.disable=true;
        if(salesPartyMetaInfoFactory==null && !CRMProcessor.isDisabled()){
            salesPartyMetaInfoFactory = new SalesPartyMetaInfoFactory();
        }
        if (targetObjectList == null) {
            targetObjectList = new HashMap<String, MetaInfo>();
            targetObjectNameList = new ArrayList<String>();
            createPharmacyDoctor();
            createPharmacyPatient();
            createPharmacyPrescription();
        }
        if (sourceObjectList == null) {
            sourceObjectList = new HashMap<String, MetaInfo>();
            createCRMDoctor();
            createCRMPatient();
            createCRMPrescription();
        }
    }

    /**
     * @param objectName
     * @return
     */
    public MetaInfo getSourceObjectMetaInfo(String objectName) {
        return sourceObjectList.get(objectName);
    }

    /**
     * @param objectName
     * @return
     */
    public MetaInfo getTargetObjectMetaInfo(String objectName) {
        return targetObjectList.get(objectName);
    }

    /**
     * @param targetObjectList
     */
    public static void setTargetObjectList(Map<String, MetaInfo> targetObjectList) {
        PharmacyMetaInfoFactory.targetObjectList = targetObjectList;
    }

    /**
     * @return
     */
    public static Map<String, MetaInfo> getTargetObjectList() {
        return targetObjectList;
    }

    /**
     * @param sourceObjectList
     */
    public static void setSourceObjectList(HashMap<String, MetaInfo> sourceObjectList) {
        PharmacyMetaInfoFactory.sourceObjectList = sourceObjectList;
    }

    /**
     * @return
     */
    public static Map<String, MetaInfo> getSourceObjectList() {
        return sourceObjectList;
    }

    /**
     * @param targetObjectNameList
     */
    public static void setTargetObjectNameList(List<String> targetObjectNameList) {
        PharmacyMetaInfoFactory.targetObjectNameList = targetObjectNameList;
    }

    /**
     * @return
     */
    public static List<String> getTargetObjectNameList() {
        return targetObjectNameList;
    }
    private void createCRMDoctor(){
        MetaInfo metaInfo = new MetaInfo();

        String objectName = "CRMDoctor";
        metaInfo.setObjectName(objectName);
       


        List<AttributeEntry> attributeEntryList =
            new ArrayList<AttributeEntry>();
        metaInfo.setAttributeList(attributeEntryList);



        AttributeEntry attributeEntry = getAttributeEntry("PartyName", "PartyName");
        attributeEntryList.add(attributeEntry);


        attributeEntry = getAttributeEntry("firstName", "firstName");
        attributeEntryList.add(attributeEntry);

        attributeEntry = getAttributeEntry("lastName", "lastName");
        attributeEntryList.add(attributeEntry);


        sourceObjectList.put(objectName, metaInfo);
    }
    private void createPharmacyDoctor(){
        MetaInfo metaInfo = new MetaInfo();

        String objectName = "PharmacyDoctor";
        metaInfo.setObjectName(objectName);
        


        List<AttributeEntry> attributeEntryList =
            new ArrayList<AttributeEntry>();
        metaInfo.setAttributeList(attributeEntryList);

        AttributeEntry attributeEntry = getAttributeEntry("Name", "Name");
        attributeEntryList.add(attributeEntry);

        attributeEntry = getAttributeEntry("First Name", "First Name");
        attributeEntryList.add(attributeEntry);

        attributeEntry = getAttributeEntry("Last Name", "Last Name");
        attributeEntryList.add(attributeEntry);

        targetObjectList.put(objectName, metaInfo);
        
    }
    private void createCRMPatient(){
        MetaInfo metaInfo = new MetaInfo();

        String objectName = "CRMPatient";
        metaInfo.setObjectName(objectName);
       


        List<AttributeEntry> attributeEntryList =
            new ArrayList<AttributeEntry>();
        metaInfo.setAttributeList(attributeEntryList);



        if(CRMProcessor.disable==true){
            AttributeEntry attributeEntry = getAttributeEntry("CRMPatientName", "CRMPatientName");
            attributeEntryList.add(attributeEntry);
    
            attributeEntry = getAttributeEntry("CRMPatientID", "CRMPatientID");
            attributeEntryList.add(attributeEntry);
        }
        else{
    
            for(AttributeEntry attrEntry:salesPartyMetaInfoFactory.getMetaInfo().getChildMetaInfo("SalesAccount").getAttributeList()){
                if(attrEntry.getName().contains("_c")){
                    AttributeEntry attributeEntry = getAttributeEntry(attrEntry.getName(), attrEntry.getName());
                    attributeEntryList.add(attributeEntry);
                }
            }
        }
        AttributeEntry attributeEntry =
            getAttributeEntry("partyName","partyName");
        attributeEntryList.add(attributeEntry);
        
        attributeEntry =
            getAttributeEntry("birth","birth");
        attributeEntryList.add(attributeEntry);
        
        attributeEntry =
            getAttributeEntry("date","date");
        attributeEntryList.add(attributeEntry);
        
        attributeEntry =
            getAttributeEntry("expiredate","expiredate");
        attributeEntryList.add(attributeEntry);


        sourceObjectList.put(objectName, metaInfo);
    }
    private void createPharmacyPatient(){
        MetaInfo metaInfo = new MetaInfo();

        String objectName = "PharmacyPatient";
        metaInfo.setObjectName(objectName);
        


        List<AttributeEntry> attributeEntryList =
            new ArrayList<AttributeEntry>();
        metaInfo.setAttributeList(attributeEntryList);

        AttributeEntry attributeEntry = getAttributeEntry("ExistingPatient", "ExistingPatient");
        attributeEntryList.add(attributeEntry);

 //       attributeEntry = getAttributeEntry("PharmacyPatientID", "PharmacyPatientID");
   //     attributeEntryList.add(attributeEntry);


        attributeEntry = getAttributeEntry("InsuranceStatus", "InsuranceStatus");
        attributeEntryList.add(attributeEntry);



        attributeEntry =
                getAttributeEntry("Patient Name", "Patient Name");
        attributeEntryList.add(attributeEntry);


        attributeEntry =
                getAttributeEntry("Birthday", "Birthday");
        attributeEntryList.add(attributeEntry);

        attributeEntry =
                getAttributeEntry("Date", "Date");
        attributeEntryList.add(attributeEntry);

        attributeEntry =
                getAttributeEntry("Expire Date", "Expire Date");
        attributeEntryList.add(attributeEntry);

        targetObjectList.put(objectName, metaInfo);
        
    }
    private void createCRMPrescription(){
        MetaInfo metaInfo = new MetaInfo();

        String objectName = "CRMPresctiption";
        metaInfo.setObjectName(objectName);
       


        List<AttributeEntry> attributeEntryList =
            new ArrayList<AttributeEntry>();
        metaInfo.setAttributeList(attributeEntryList);



         AttributeEntry attributeEntry =
            getAttributeEntry("medicationName","medicationName");
        attributeEntryList.add(attributeEntry);


        attributeEntry =
            getAttributeEntry("quantity","quantity");
        attributeEntryList.add(attributeEntry);

        attributeEntry =
            getAttributeEntry("refills","refills");
        attributeEntryList.add(attributeEntry);

        attributeEntry =
            getAttributeEntry("directionForUse","directionForUse");
        attributeEntryList.add(attributeEntry);

        attributeEntry =
            getAttributeEntry("expireDate","expireDate");
        attributeEntryList.add(attributeEntry);

        attributeEntry =
            getAttributeEntry("orderNumber","orderNumber");
        attributeEntryList.add(attributeEntry);

        sourceObjectList.put(objectName, metaInfo);
    }
    private void createPharmacyPrescription(){
        MetaInfo metaInfo = new MetaInfo();

        String objectName = "PharmacyPresctiption";
        metaInfo.setObjectName(objectName);
        


        List<AttributeEntry> attributeEntryList =
            new ArrayList<AttributeEntry>();
        metaInfo.setAttributeList(attributeEntryList);


        AttributeEntry attributeEntry =
                getAttributeEntry("Medication Name", "Medication Name");
        attributeEntryList.add(attributeEntry);
        
        
        attributeEntry =
                getAttributeEntry("Quantity", "Quantity");
        attributeEntryList.add(attributeEntry);
        

        attributeEntry =
                getAttributeEntry("Refill", "Refill");
        attributeEntryList.add(attributeEntry);
        

        attributeEntry =
                getAttributeEntry("Direction For Use", "Direction For Use");
        attributeEntryList.add(attributeEntry);
        
        
        attributeEntry =
                getAttributeEntry("Order Number", "Order Number");
        attributeEntryList.add(attributeEntry);


        targetObjectList.put(objectName, metaInfo);
        
    }

    /**
     * @param label
     * @param name
     * @return
     */
    protected AttributeEntry getAttributeEntry(String label, String name) {
        AttributeEntry attributeEntry = new AttributeEntry();
        attributeEntry.setLabel(label);
        attributeEntry.setName(name);
        return attributeEntry;
    }


}
