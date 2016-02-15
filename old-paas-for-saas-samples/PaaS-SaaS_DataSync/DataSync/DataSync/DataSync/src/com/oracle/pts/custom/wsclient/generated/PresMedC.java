
package com.oracle.pts.custom.wsclient.generated;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Pres_med_c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pres_med_c">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RecordName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Pres_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
 *         &lt;element name="MEDICATION_ID_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MEDICATION_ID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QUANTITY_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="REFILLS_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DIRECTIONS_FOR_USE_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IS_READY_TO_PICKUP_FL_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EXPIRE_DATE_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="SENT_TO_PHARMACY_FL_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SENT_TO_PHARMACY_DATE_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ORDER_NUMBER_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pres_med_c", namespace = "/extensibility/app/customer/views/common/", propOrder = {
    "id",
    "recordName",
    "createdBy",
    "creationDate",
    "lastUpdatedBy",
    "lastUpdateDate",
    "objectVersionNumber",
    "presIdC",
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
    "medicationidIdC",
    "medicationidc",
    "quantityc",
    "refillsc",
    "directionsforusec",
    "isreadytopickupflc",
    "expiredatec",
    "senttopharmacyflc",
    "senttopharmacydatec",
    "ordernumberc"
})
public class PresMedC {

    @XmlElement(name = "Id")
    protected BigDecimal id;
    @XmlElement(name = "RecordName")
    protected String recordName;
    @XmlElementRef(name = "CreatedBy", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<String> createdBy;
    @XmlElementRef(name = "CreationDate", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> creationDate;
    @XmlElementRef(name = "LastUpdatedBy", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdatedBy;
    @XmlElementRef(name = "LastUpdateDate", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastUpdateDate;
    @XmlElementRef(name = "ObjectVersionNumber", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> objectVersionNumber;
    @XmlElementRef(name = "Pres_Id_c", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> presIdC;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElementRef(name = "CpdrfVerSor", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<Integer> cpdrfVerSor;
    @XmlElement(name = "ConflictId")
    protected Long conflictId;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElementRef(name = "CpdrfLastUpd", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<String> cpdrfLastUpd;
    @XmlElementRef(name = "CpdrfVerPillar", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<Integer> cpdrfVerPillar;
    @XmlElementRef(name = "JobDefinitionPackage", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<String> jobDefinitionPackage;
    @XmlElementRef(name = "RequestId", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<Long> requestId;
    @XmlElementRef(name = "JobDefinitionName", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<String> jobDefinitionName;
    @XmlElementRef(name = "CurrencyCode", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "IsOwner", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<String> isOwner;
    @XmlElementRef(name = "MEDICATION_ID_Id_c", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> medicationidIdC;
    @XmlElementRef(name = "MEDICATION_ID_c", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<String> medicationidc;
    @XmlElementRef(name = "QUANTITY_c", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> quantityc;
    @XmlElementRef(name = "REFILLS_c", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> refillsc;
    @XmlElementRef(name = "DIRECTIONS_FOR_USE_c", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<String> directionsforusec;
    @XmlElementRef(name = "IS_READY_TO_PICKUP_FL_c", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<Boolean> isreadytopickupflc;
    @XmlElementRef(name = "EXPIRE_DATE_c", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> expiredatec;
    @XmlElementRef(name = "SENT_TO_PHARMACY_FL_c", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<Boolean> senttopharmacyflc;
    @XmlElementRef(name = "SENT_TO_PHARMACY_DATE_c", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> senttopharmacydatec;
    @XmlElementRef(name = "ORDER_NUMBER_c", namespace = "/extensibility/app/customer/views/common/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ordernumberc;

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
     * Gets the value of the presIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPresIdC() {
        return presIdC;
    }

    /**
     * Sets the value of the presIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPresIdC(JAXBElement<BigDecimal> value) {
        this.presIdC = ((JAXBElement<BigDecimal> ) value);
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
     * Gets the value of the medicationidIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMEDICATIONIDIdC() {
        return medicationidIdC;
    }

    /**
     * Sets the value of the medicationidIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMEDICATIONIDIdC(JAXBElement<BigDecimal> value) {
        this.medicationidIdC = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the medicationidc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMEDICATIONIDC() {
        return medicationidc;
    }

    /**
     * Sets the value of the medicationidc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMEDICATIONIDC(JAXBElement<String> value) {
        this.medicationidc = ((JAXBElement<String> ) value);
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
     * Gets the value of the directionsforusec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDIRECTIONSFORUSEC() {
        return directionsforusec;
    }

    /**
     * Sets the value of the directionsforusec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDIRECTIONSFORUSEC(JAXBElement<String> value) {
        this.directionsforusec = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the isreadytopickupflc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getISREADYTOPICKUPFLC() {
        return isreadytopickupflc;
    }

    /**
     * Sets the value of the isreadytopickupflc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setISREADYTOPICKUPFLC(JAXBElement<Boolean> value) {
        this.isreadytopickupflc = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the expiredatec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEXPIREDATEC() {
        return expiredatec;
    }

    /**
     * Sets the value of the expiredatec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEXPIREDATEC(JAXBElement<XMLGregorianCalendar> value) {
        this.expiredatec = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the senttopharmacyflc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSENTTOPHARMACYFLC() {
        return senttopharmacyflc;
    }

    /**
     * Sets the value of the senttopharmacyflc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSENTTOPHARMACYFLC(JAXBElement<Boolean> value) {
        this.senttopharmacyflc = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the senttopharmacydatec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSENTTOPHARMACYDATEC() {
        return senttopharmacydatec;
    }

    /**
     * Sets the value of the senttopharmacydatec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSENTTOPHARMACYDATEC(JAXBElement<XMLGregorianCalendar> value) {
        this.senttopharmacydatec = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the ordernumberc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getORDERNUMBERC() {
        return ordernumberc;
    }

    /**
     * Sets the value of the ordernumberc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setORDERNUMBERC(JAXBElement<BigDecimal> value) {
        this.ordernumberc = ((JAXBElement<BigDecimal> ) value);
    }

}
