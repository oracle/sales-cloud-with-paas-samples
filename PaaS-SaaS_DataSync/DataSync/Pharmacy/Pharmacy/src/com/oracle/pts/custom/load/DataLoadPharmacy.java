package com.oracle.pts.custom.load;


import com.oracle.pts.custom.client.PharmacyClient;
import com.oracle.pts.util.HttpUtil;
import com.oracle.pts.vo.Medication;
import com.oracle.pts.vo.Patient;
import com.oracle.pts.vo.Prescription;

import java.util.List;
import java.util.logging.Logger;

public class DataLoadPharmacy {
    
    Logger logger = Logger.getLogger("CRM");
    public DataLoadPharmacy() {
        super();
    }
    public static void main(String args[]){
        HttpUtil.removeMyProxy();
        DataLoadPharmacy dataLoadPharmacy = new DataLoadPharmacy();
     //   dataLoadPharmacy.setMedicationReadyToPickup("1389988314702");
 //  dataLoadPharmacy.loadMedicationListForHealthCare();
        dataLoadPharmacy.loadMedicationListFromHealthCare();
   // dataLoadPharmacy.loadHealthCareProviderList();
    }
    public void setMedicationReadyToPickup(String orderNumber){
        
        PharmacyClient dataLoad = new PharmacyClient();
       
        dataLoad.setMedicationReadyToPickup(orderNumber);

    }
    public void loadMedicationListFromHealthCare(){
        PharmacyClient dataLoad = new PharmacyClient();
        dataLoad.loadMedicationListFromHealthCare();
    }
    public void loadMedicationListForHealthCare(){
        PharmacyClient dataLoad = new PharmacyClient();
        dataLoad.loadMedicationListForHealthCare();
    }
    public void loadHealthCareProviderList(){
        PharmacyClient dataLoad = new PharmacyClient();
        dataLoad.loadHealthCareProviderList();
    }
}
