package com.oracle.pts.session;

import com.oracle.pts.custom.client.HealthCareClient;
import com.oracle.pts.custom.client.HealthCareLoadClient;
import com.oracle.pts.db.PharmacyDB;
import com.oracle.pts.util.HttpUtil;
import com.oracle.pts.vo.HealthCareProvider;
import com.oracle.pts.vo.Medication;

import java.util.ArrayList;
import java.util.List;

public class PharmacyFacade {
    public PharmacyFacade() {
        super();
    }
    public static void main(String args[]){
        HttpUtil.removeMyProxy();
        PharmacyFacade pharmacyFacade = new PharmacyFacade();
     //   pharmacyFacade.setMedicationReadyToPickup("1389642042308");
     //  pharmacyFacade.loadMedicationListFromHealthCare();
        // use DataLoadPharmacy instead
    }
    public String createOrder(Medication medication){
        
        PharmacyDB pharmacyDB = new PharmacyDB();
        String orderID = pharmacyDB.createOrder(medication);
        
        return orderID;
    }
    public void setMedicationReadyToPickup(String orderNumber){
        PharmacyDB pharmacyDB = new PharmacyDB();
        pharmacyDB.setMedicationReadyToPickup(orderNumber);
        
        
        HealthCareClient healthCareClient = new HealthCareClient();
        healthCareClient.setMedicationReadyToPickup(orderNumber);
    }
    public void loadMedicationListFromHealthCare(){
        HealthCareLoadClient healthCareLoadClient = new HealthCareLoadClient();
        List<Medication> medicationList = healthCareLoadClient.getMedicationDetailList();
        PharmacyDB pharmacyDB = new PharmacyDB();
        pharmacyDB.createMedication(medicationList);
        
    }
    public void loadMedicationListForHealthCare(){
        System.out.println("PharmacyFacade.loadMedicationListForHealthCare is called");
        HealthCareLoadClient healthCareLoadClient = new HealthCareLoadClient();
        System.out.println("calling healthCareLoadClient.getMedicationDetailList()");
        List<Medication> medicationList = healthCareLoadClient.getMedicationDetailList();
        System.out.println("medicationList.size()**** " + medicationList.size());
        PharmacyDB pharmacyDB = new PharmacyDB();
        System.out.println("pharmacyDB.createMedicationForHealthCare");
        pharmacyDB.createMedicationForHealthCare(medicationList);
        
    }
    public void loadHealthCareProviderList(){
        PharmacyDB pharmacyDB = new PharmacyDB();
        List<HealthCareProvider> healthCareProviderList = new ArrayList<HealthCareProvider>();
        healthCareProviderList.add(createHealthCareProvider("Fusion","212.234.2345","212.343.1232","193 Zhong Hua Zhong Lu,New York,NY, 10017"));
        healthCareProviderList.add(createHealthCareProvider("Dixon","917.234.2224","917.111.3252","2355 Broadway,NV, 21223"));
        healthCareProviderList.add(createHealthCareProvider("Oracle","650.320.2321","650.320.2332","600 Oracle Parkway,Redwood City, CA 94065"));
        healthCareProviderList.add(createHealthCareProvider("Easy Health","212.234.2345","212.343.1232","3600 Sansom St,MA, 10017"));
        healthCareProviderList.add(createHealthCareProvider("Orion","212.234.2345","212.343.1232","Langstone Technology Park,VA, 32451"));
        pharmacyDB.loadHealthCareProviderList(healthCareProviderList);
        
    }
    public HealthCareProvider createHealthCareProvider(String name,String tel,String fax,String loc){
        HealthCareProvider healthCareProvider = new HealthCareProvider();
        healthCareProvider.setName(name);
        healthCareProvider.setTel(tel);
        healthCareProvider.setFax(fax);
        healthCareProvider.setLoc(loc);
        return healthCareProvider;
    }
}
