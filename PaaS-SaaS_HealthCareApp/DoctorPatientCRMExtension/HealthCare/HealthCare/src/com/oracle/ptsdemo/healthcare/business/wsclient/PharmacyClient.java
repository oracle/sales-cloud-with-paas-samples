package com.oracle.ptsdemo.healthcare.business.wsclient;


import com.oracle.ptsdemo.healthcare.business.datasync.custom.Medication;
import com.oracle.ptsdemo.healthcare.business.util.HttpUtil;
import com.oracle.ptsdemo.healthcare.config.FusionConfig;
import com.oracle.ptsdemo.healthcare.wsclient.pharmacy.PharmacyWS;
import com.oracle.ptsdemo.healthcare.wsclient.pharmacy.PharmacyWSService;
import com.oracle.ptsdemo.healthcare.wsclient.pharmacy.types.Doctor;
import com.oracle.ptsdemo.healthcare.wsclient.pharmacy.types.ObjectFactory;
import com.oracle.ptsdemo.healthcare.wsclient.pharmacy.types.Patient;
import com.oracle.ptsdemo.healthcare.wsclient.pharmacy.types.Prescription;

import com.sun.xml.ws.api.addressing.AddressingVersion;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.GregorianCalendar;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;


/**
 */
public class PharmacyClient extends ObjectClient {

    static org.apache.log4j.Logger logger =
        org.apache.log4j.Logger.getLogger(PharmacyClient.class);

    private static PharmacyWSService pharmacyWSService;
    private static final AddressingVersion WS_ADDR_VER = AddressingVersion.W3C;
    private PharmacyWS pharmacyWS;
    private ObjectFactory objectFactory;


    /**
     */
    public PharmacyClient() {
        super();

        if (logger.isDebugEnabled()) {
            logger.debug(PharmacyClient.class.getName() + " : constructor");
        }

        HttpUtil.removeProxy();
        init();
    }


    private void init() {
        if (logger.isDebugEnabled()) {
            logger.debug(PharmacyClient.class.getName() + ".init()");
        }

      QName SERVICE_NAME =
            new QName("http://pharmacy.webservice.pts.oracle.com/",
                      "PharmacyWSService");

        String httpString = "https";
        String ssl = FusionConfig.getInstance().getProperty("PHARMACY_SSL");
        if (ssl != null && ssl.equalsIgnoreCase("false")) {
            httpString = "http";
        } else {
            httpString = "https";
        }


        try {

            logger.info(httpString + "://" + FusionConfig.getInstance().getPropertyFromDB("PHARMACY_URL") +
                        "/Pharmacy/PharmacyWSPort?WSDL");
            URL wsdlURL =
                new URL(httpString + "://" + FusionConfig.getInstance().getPropertyFromDB("PHARMACY_URL") +
                        "/Pharmacy/PharmacyWSPort?WSDL");


            if (logger.isDebugEnabled()) {
                logger.debug(".init() --> pharmacyWSService = new PharmacyWSService(wsdlURL, SERVICE_NAME) = (" +
                             wsdlURL + " , " + SERVICE_NAME + ")");
            }

            pharmacyWSService = new PharmacyWSService(wsdlURL, SERVICE_NAME);


            if (logger.isDebugEnabled()) {
                logger.debug(".init() --> pharmacyWSService.getPharmacyWSPort()");
            }

            pharmacyWS = pharmacyWSService.getPharmacyWSPort();

            if (logger.isDebugEnabled()) {
                logger.debug(".init() -->  Map<String, Object> reqContext =((BindingProvider)pharmacyWS).getRequestContext();");
            }

            Map<String, Object> reqContext =
                ((BindingProvider)pharmacyWS).getRequestContext();


            reqContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                           httpString + "://" + FusionConfig.getInstance().getPropertyFromDB("PHARMACY_URL") +
                           "/Pharmacy/PharmacyWSPort");

            if (logger.isDebugEnabled()) {
                logger.debug(PharmacyClient.class.getName() +
                             ".init() --> reqContext.put() (reqContext = " +
                             reqContext + ")");
            }

            objectFactory = new ObjectFactory();

            if (logger.isDebugEnabled()) {
                logger.debug(PharmacyClient.class.getName() +
                             ".init() --> Finished!");
            }
        } catch (MalformedURLException e) {
            logger.error("Error parsing Pharmacy Endpoint URL", e);
        }
    }

    /**
     */
    public void createPrescription() {
        if (logger.isDebugEnabled()) {
            logger.debug(PharmacyClient.class.getName() +
                         ".createPrescription()");
        }

        Prescription prescription = objectFactory.createPrescription();
        pharmacyWS.createPrescription(prescription);
    }

    /**
     * Convert objects and create an order to request a medication for a Pharmacy.
     * @param medication
     * @return order id
     */
    public String sendOrderForMedicationToPharmacy(Medication medication) {
        if (logger.isDebugEnabled()) {
            logger.debug(PharmacyClient.class.getName() +
                         ".createMedication(Medication medication)");
        }

        com.oracle.ptsdemo.healthcare.wsclient.pharmacy.types.Medication mMedication =
            convertMedication(medication);

        if (logger.isDebugEnabled()) {
            logger.debug(PharmacyClient.class.getName() +
                         ".createMedication(Medication medication) --> Medication Converted. Calling pharmacyWS.createMedication...");
        }

        String orderId = null;
        try {
            // logger.info("DirectionsForUse " + mMedication.getDirectionsForUse());
            orderId = pharmacyWS.createMedication(mMedication);
            logger.info("orderId **************************** " + orderId);
        } catch (Exception e) {
            logger.error(PharmacyClient.class.getName() +
                         ".createMedication(Medication medication) -> Error calling pharmacyWS.createMedication(mMedication)",
                         e);
        }
        return orderId;
    }

    /**
     * @param orderNumber
     */
    public void setMedicationReadyToPickup(String orderNumber) {
        if (logger.isDebugEnabled()) {
            logger.debug(PharmacyClient.class.getName() +
                         ".setMedicationReadyToPickup(String orderNumber)");
        }
        pharmacyWS.setMedicationReadyToPickup(orderNumber);
    }

    /**
     */
    public void loadMedicationListFromHealthCare() {
        if (logger.isDebugEnabled()) {
            logger.debug(PharmacyClient.class.getName() +
                         ".loadMedicationListFromHealthCare()");
        }
        pharmacyWS.loadMedicationListFromHealthCare();
    }


    /**
     */
    public void loadMedicationListForHealthCare() {
        if (logger.isDebugEnabled()) {
            logger.debug(PharmacyClient.class.getName() +
                         ".loadMedicationListForHealthCare()");
        }
        pharmacyWS.loadMedicationListForHealthCare();
    }


    /**
     */
    public void loadHealthCareProviderList() {
        if (logger.isDebugEnabled()) {
            logger.debug(PharmacyClient.class.getName() +
                         ".loadHealthCareProviderList()");
        }
        pharmacyWS.loadHealthCareProviderList();
    }


    private com.oracle.ptsdemo.healthcare.wsclient.pharmacy.types.Medication convertMedication(Medication medication) {
        if (logger.isDebugEnabled()) {
            logger.debug(PharmacyClient.class.getName() +
                         ".convertMedication(Medication medication)");
        }

        com.oracle.ptsdemo.healthcare.wsclient.pharmacy.types.Medication mMedication =
            objectFactory.createMedication();

        mMedication.setDirectionsForUse(medication.getDirectionsForUse());

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(medication.getExpireDate());
        XMLGregorianCalendar xmlCalendar = null;
        try {
            xmlCalendar =
                    DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
        } catch (DatatypeConfigurationException e) {
            logger.error("Error converting Medication Expire Date to XML.", e);
        }

        mMedication.setExpireDate(xmlCalendar);
        mMedication.setNdcCode(medication.getNdcCode());
        mMedication.setQuantity(medication.getQuantity());
        mMedication.setRefills(medication.getRefills());

        Doctor mDoctor = objectFactory.createDoctor();
        Patient mPatient = objectFactory.createPatient();


        mMedication.setDoctor(mDoctor);
        mDoctor.setName(medication.getDoctor().getName());

        mMedication.setPatient(mPatient);
        mPatient.setName(medication.getPatient().getName());
        mPatient.setExistingPatient(medication.getPatient().isExistingPatient());
        mPatient.setInsuranceStatus(medication.getPatient().getInsuranceStatus());
        return mMedication;
    }

}
