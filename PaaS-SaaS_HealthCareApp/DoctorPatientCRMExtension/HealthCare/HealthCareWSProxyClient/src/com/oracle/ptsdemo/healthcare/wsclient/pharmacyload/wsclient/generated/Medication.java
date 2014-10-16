
package com.oracle.ptsdemo.healthcare.wsclient.pharmacyload.wsclient.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for medication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="directionsForUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doctor" type="{http://ws.healthcare.ptsdemo.oracle.com/}doctor" minOccurs="0"/>
 *         &lt;element name="drugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="medicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ndcCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://ws.healthcare.ptsdemo.oracle.com/}patient" minOccurs="0"/>
 *         &lt;element name="pharmacyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prescriptionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="readyToPickup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="refills" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="sendToPharmacy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sendToPharmacyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medication", propOrder = {
    "directionsForUse",
    "doctor",
    "drugName",
    "expireDate",
    "medicationId",
    "ndcCode",
    "orderNumber",
    "patient",
    "pharmacyId",
    "prescriptionId",
    "quantity",
    "readyToPickup",
    "refills",
    "sendToPharmacy",
    "sendToPharmacyDate"
})
public class Medication {

    protected String directionsForUse;
    protected Doctor doctor;
    protected String drugName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expireDate;
    protected String medicationId;
    protected String ndcCode;
    protected String orderNumber;
    protected Patient patient;
    protected String pharmacyId;
    protected String prescriptionId;
    protected short quantity;
    protected boolean readyToPickup;
    protected short refills;
    protected boolean sendToPharmacy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendToPharmacyDate;

    /**
     * Gets the value of the directionsForUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectionsForUse() {
        return directionsForUse;
    }

    /**
     * Sets the value of the directionsForUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectionsForUse(String value) {
        this.directionsForUse = value;
    }

    /**
     * Gets the value of the doctor property.
     * 
     * @return
     *     possible object is
     *     {@link Doctor }
     *     
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * Sets the value of the doctor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Doctor }
     *     
     */
    public void setDoctor(Doctor value) {
        this.doctor = value;
    }

    /**
     * Gets the value of the drugName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * Sets the value of the drugName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugName(String value) {
        this.drugName = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the medicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicationId() {
        return medicationId;
    }

    /**
     * Sets the value of the medicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicationId(String value) {
        this.medicationId = value;
    }

    /**
     * Gets the value of the ndcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNdcCode() {
        return ndcCode;
    }

    /**
     * Sets the value of the ndcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNdcCode(String value) {
        this.ndcCode = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link Patient }
     *     
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Patient }
     *     
     */
    public void setPatient(Patient value) {
        this.patient = value;
    }

    /**
     * Gets the value of the pharmacyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacyId() {
        return pharmacyId;
    }

    /**
     * Sets the value of the pharmacyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacyId(String value) {
        this.pharmacyId = value;
    }

    /**
     * Gets the value of the prescriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriptionId() {
        return prescriptionId;
    }

    /**
     * Sets the value of the prescriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriptionId(String value) {
        this.prescriptionId = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public short getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(short value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the readyToPickup property.
     * 
     */
    public boolean isReadyToPickup() {
        return readyToPickup;
    }

    /**
     * Sets the value of the readyToPickup property.
     * 
     */
    public void setReadyToPickup(boolean value) {
        this.readyToPickup = value;
    }

    /**
     * Gets the value of the refills property.
     * 
     */
    public short getRefills() {
        return refills;
    }

    /**
     * Sets the value of the refills property.
     * 
     */
    public void setRefills(short value) {
        this.refills = value;
    }

    /**
     * Gets the value of the sendToPharmacy property.
     * 
     */
    public boolean isSendToPharmacy() {
        return sendToPharmacy;
    }

    /**
     * Sets the value of the sendToPharmacy property.
     * 
     */
    public void setSendToPharmacy(boolean value) {
        this.sendToPharmacy = value;
    }

    /**
     * Gets the value of the sendToPharmacyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendToPharmacyDate() {
        return sendToPharmacyDate;
    }

    /**
     * Sets the value of the sendToPharmacyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendToPharmacyDate(XMLGregorianCalendar value) {
        this.sendToPharmacyDate = value;
    }

}
