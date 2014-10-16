
package com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Prescription_Med_c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prescription_Med_c">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RecordName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesAccountVO_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpdrfVerSor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CpdrfLastUpd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpdrfVerPillar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="JobDefinitionPackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="JobDefinitionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurcyConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirectionForUse_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DrugName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpireDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="NDCCode_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrescriptionID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QUANTITY_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReadyToPickup_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFILLS_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SentToPharmacy_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SentToPharmacyDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prescription_Med_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", propOrder = {
    "id",
    "recordName",
    "createdBy",
    "creationDate",
    "lastUpdatedBy",
    "lastUpdateDate",
    "objectVersionNumber",
    "salesAccountVOIdC",
    "lastUpdateLogin",
    "cpdrfVerSor",
    "conflictId",
    "userLastUpdateDate",
    "cpdrfLastUpd",
    "cpdrfVerPillar",
    "jobDefinitionPackage",
    "requestId",
    "jobDefinitionName",
    "currencyCode",
    "curcyConvRateType",
    "corpCurrencyCode",
    "isOwner",
    "directionForUseC",
    "docIdC",
    "drugNameC",
    "expireDateC",
    "ndcCodeC",
    "orderNumberC",
    "patIDC",
    "preIDC",
    "prescriptionIDC",
    "quantityc",
    "readyToPickupC",
    "refillsc",
    "sentToPharmacyC",
    "sentToPharmacyDateC"
})
public class PrescriptionMedC {

    @XmlElement(name = "Id")
    protected BigDecimal id;
    @XmlElement(name = "RecordName")
    protected String recordName;
    @XmlElementRef(name = "CreatedBy", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> createdBy;
    @XmlElementRef(name = "CreationDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> creationDate;
    @XmlElementRef(name = "LastUpdatedBy", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdatedBy;
    @XmlElementRef(name = "LastUpdateDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastUpdateDate;
    @XmlElementRef(name = "ObjectVersionNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> objectVersionNumber;
    @XmlElementRef(name = "SalesAccountVO_Id_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> salesAccountVOIdC;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElementRef(name = "CpdrfVerSor", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Integer> cpdrfVerSor;
    @XmlElement(name = "ConflictId")
    protected Long conflictId;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElementRef(name = "CpdrfLastUpd", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> cpdrfLastUpd;
    @XmlElementRef(name = "CpdrfVerPillar", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Integer> cpdrfVerPillar;
    @XmlElementRef(name = "JobDefinitionPackage", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> jobDefinitionPackage;
    @XmlElementRef(name = "RequestId", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> requestId;
    @XmlElementRef(name = "JobDefinitionName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> jobDefinitionName;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "IsOwner", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> isOwner;
    @XmlElementRef(name = "DirectionForUse_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> directionForUseC;
    @XmlElementRef(name = "DocId_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> docIdC;
    @XmlElementRef(name = "DrugName_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> drugNameC;
    @XmlElementRef(name = "ExpireDate_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> expireDateC;
    @XmlElementRef(name = "NDCCode_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> ndcCodeC;
    @XmlElementRef(name = "OrderNumber_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> orderNumberC;
    @XmlElementRef(name = "PatID_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> patIDC;
    @XmlElementRef(name = "PreID_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> preIDC;
    @XmlElementRef(name = "PrescriptionID_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> prescriptionIDC;
    @XmlElementRef(name = "QUANTITY_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> quantityc;
    @XmlElementRef(name = "ReadyToPickup_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> readyToPickupC;
    @XmlElementRef(name = "REFILLS_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> refillsc;
    @XmlElementRef(name = "SentToPharmacy_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> sentToPharmacyC;
    @XmlElementRef(name = "SentToPharmacyDate_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> sentToPharmacyDateC;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setId(BigDecimal value) {
        this.id = value;
    }

    /**
     * Gets the value of the recordName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * Sets the value of the recordName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordName(String value) {
        this.recordName = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedBy(JAXBElement<String> value) {
        this.createdBy = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.creationDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the lastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the value of the lastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdatedBy(JAXBElement<String> value) {
        this.lastUpdatedBy = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastUpdateDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the objectVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getObjectVersionNumber() {
        return objectVersionNumber;
    }

    /**
     * Sets the value of the objectVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setObjectVersionNumber(JAXBElement<BigDecimal> value) {
        this.objectVersionNumber = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the salesAccountVOIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSalesAccountVOIdC() {
        return salesAccountVOIdC;
    }

    /**
     * Sets the value of the salesAccountVOIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSalesAccountVOIdC(JAXBElement<BigDecimal> value) {
        this.salesAccountVOIdC = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the lastUpdateLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    /**
     * Sets the value of the lastUpdateLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdateLogin(JAXBElement<String> value) {
        this.lastUpdateLogin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cpdrfVerSor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCpdrfVerSor() {
        return cpdrfVerSor;
    }

    /**
     * Sets the value of the cpdrfVerSor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCpdrfVerSor(JAXBElement<Integer> value) {
        this.cpdrfVerSor = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the conflictId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConflictId() {
        return conflictId;
    }

    /**
     * Sets the value of the conflictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConflictId(Long value) {
        this.conflictId = value;
    }

    /**
     * Gets the value of the userLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getUserLastUpdateDate() {
        return userLastUpdateDate;
    }

    /**
     * Sets the value of the userLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setUserLastUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.userLastUpdateDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the cpdrfLastUpd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpdrfLastUpd() {
        return cpdrfLastUpd;
    }

    /**
     * Sets the value of the cpdrfLastUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpdrfLastUpd(JAXBElement<String> value) {
        this.cpdrfLastUpd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cpdrfVerPillar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCpdrfVerPillar() {
        return cpdrfVerPillar;
    }

    /**
     * Sets the value of the cpdrfVerPillar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCpdrfVerPillar(JAXBElement<Integer> value) {
        this.cpdrfVerPillar = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the jobDefinitionPackage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobDefinitionPackage() {
        return jobDefinitionPackage;
    }

    /**
     * Sets the value of the jobDefinitionPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobDefinitionPackage(JAXBElement<String> value) {
        this.jobDefinitionPackage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRequestId(JAXBElement<Long> value) {
        this.requestId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the jobDefinitionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobDefinitionName() {
        return jobDefinitionName;
    }

    /**
     * Sets the value of the jobDefinitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobDefinitionName(JAXBElement<String> value) {
        this.jobDefinitionName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curcyConvRateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurcyConvRateType() {
        return curcyConvRateType;
    }

    /**
     * Sets the value of the curcyConvRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurcyConvRateType(JAXBElement<String> value) {
        this.curcyConvRateType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corpCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpCurrencyCode() {
        return corpCurrencyCode;
    }

    /**
     * Sets the value of the corpCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpCurrencyCode(JAXBElement<String> value) {
        this.corpCurrencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the isOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsOwner() {
        return isOwner;
    }

    /**
     * Sets the value of the isOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsOwner(JAXBElement<String> value) {
        this.isOwner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the directionForUseC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirectionForUseC() {
        return directionForUseC;
    }

    /**
     * Sets the value of the directionForUseC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirectionForUseC(JAXBElement<String> value) {
        this.directionForUseC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocIdC() {
        return docIdC;
    }

    /**
     * Sets the value of the docIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocIdC(JAXBElement<String> value) {
        this.docIdC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the drugNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDrugNameC() {
        return drugNameC;
    }

    /**
     * Sets the value of the drugNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDrugNameC(JAXBElement<String> value) {
        this.drugNameC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the expireDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpireDateC() {
        return expireDateC;
    }

    /**
     * Sets the value of the expireDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpireDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.expireDateC = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the ndcCodeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNDCCodeC() {
        return ndcCodeC;
    }

    /**
     * Sets the value of the ndcCodeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNDCCodeC(JAXBElement<String> value) {
        this.ndcCodeC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orderNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderNumberC() {
        return orderNumberC;
    }

    /**
     * Sets the value of the orderNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderNumberC(JAXBElement<String> value) {
        this.orderNumberC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the patIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPatIDC() {
        return patIDC;
    }

    /**
     * Sets the value of the patIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPatIDC(JAXBElement<String> value) {
        this.patIDC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the preIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreIDC() {
        return preIDC;
    }

    /**
     * Sets the value of the preIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreIDC(JAXBElement<String> value) {
        this.preIDC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prescriptionIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrescriptionIDC() {
        return prescriptionIDC;
    }

    /**
     * Sets the value of the prescriptionIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrescriptionIDC(JAXBElement<String> value) {
        this.prescriptionIDC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the quantityc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQUANTITYC() {
        return quantityc;
    }

    /**
     * Sets the value of the quantityc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQUANTITYC(JAXBElement<BigDecimal> value) {
        this.quantityc = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the readyToPickupC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReadyToPickupC() {
        return readyToPickupC;
    }

    /**
     * Sets the value of the readyToPickupC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReadyToPickupC(JAXBElement<String> value) {
        this.readyToPickupC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the refillsc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getREFILLSC() {
        return refillsc;
    }

    /**
     * Sets the value of the refillsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setREFILLSC(JAXBElement<BigDecimal> value) {
        this.refillsc = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the sentToPharmacyC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSentToPharmacyC() {
        return sentToPharmacyC;
    }

    /**
     * Sets the value of the sentToPharmacyC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSentToPharmacyC(JAXBElement<String> value) {
        this.sentToPharmacyC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sentToPharmacyDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSentToPharmacyDateC() {
        return sentToPharmacyDateC;
    }

    /**
     * Sets the value of the sentToPharmacyDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSentToPharmacyDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.sentToPharmacyDateC = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
