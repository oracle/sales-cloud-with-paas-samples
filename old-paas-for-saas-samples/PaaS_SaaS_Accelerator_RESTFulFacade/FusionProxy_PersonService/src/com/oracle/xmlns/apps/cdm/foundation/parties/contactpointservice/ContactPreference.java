
package com.oracle.xmlns.apps.cdm.foundation.parties.contactpointservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.apps.cdm.foundation.parties.partyservice.OriginalSystemReference;


/**
 * <p>Java class for ContactPreference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactPreference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactPreferenceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContactLevelTable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactLevelTableId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferenceTopicType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferenceTopicTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PreferenceTopicTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferenceStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PreferenceEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PreferenceStartTimeHR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PreferenceEndTimeHR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PreferenceStartTimeMi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PreferenceEndTimeMi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaximumNoOfInteractions" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumNoOfInteractUOMCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedByModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalSystemReference" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}OriginalSystemReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactPreference", propOrder = {
    "contactPreferenceId",
    "contactLevelTable",
    "contactLevelTableId",
    "contactType",
    "preferenceCode",
    "preferenceTopicType",
    "preferenceTopicTypeId",
    "preferenceTopicTypeCode",
    "preferenceStartDate",
    "preferenceEndDate",
    "preferenceStartTimeHR",
    "preferenceEndTimeHR",
    "preferenceStartTimeMi",
    "preferenceEndTimeMi",
    "maximumNoOfInteractions",
    "maximumNoOfInteractUOMCode",
    "requestedBy",
    "reasonCode",
    "createdBy",
    "creationDate",
    "lastUpdateLogin",
    "lastUpdateDate",
    "lastUpdatedBy",
    "requestId",
    "objectVersionNumber",
    "status",
    "createdByModule",
    "originalSystemReference"
})
public class ContactPreference {

    @XmlElement(name = "ContactPreferenceId")
    protected Long contactPreferenceId;
    @XmlElement(name = "ContactLevelTable")
    protected String contactLevelTable;
    @XmlElement(name = "ContactLevelTableId")
    protected Long contactLevelTableId;
    @XmlElement(name = "ContactType")
    protected String contactType;
    @XmlElement(name = "PreferenceCode")
    protected String preferenceCode;
    @XmlElementRef(name = "PreferenceTopicType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<String> preferenceTopicType;
    @XmlElementRef(name = "PreferenceTopicTypeId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<Long> preferenceTopicTypeId;
    @XmlElementRef(name = "PreferenceTopicTypeCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<String> preferenceTopicTypeCode;
    @XmlElement(name = "PreferenceStartDate")
    protected XMLGregorianCalendar preferenceStartDate;
    @XmlElementRef(name = "PreferenceEndDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> preferenceEndDate;
    @XmlElementRef(name = "PreferenceStartTimeHR", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<Integer> preferenceStartTimeHR;
    @XmlElementRef(name = "PreferenceEndTimeHR", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<Integer> preferenceEndTimeHR;
    @XmlElementRef(name = "PreferenceStartTimeMi", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<Integer> preferenceStartTimeMi;
    @XmlElementRef(name = "PreferenceEndTimeMi", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<Integer> preferenceEndTimeMi;
    @XmlElementRef(name = "MaximumNoOfInteractions", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> maximumNoOfInteractions;
    @XmlElementRef(name = "MaximumNoOfInteractUOMCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<String> maximumNoOfInteractUOMCode;
    @XmlElement(name = "RequestedBy")
    protected String requestedBy;
    @XmlElementRef(name = "ReasonCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<String> reasonCode;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "RequestId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<Long> requestId;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElementRef(name = "CreatedByModule", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<String> createdByModule;
    @XmlElement(name = "OriginalSystemReference")
    protected List<OriginalSystemReference> originalSystemReference;

    /**
     * Gets the value of the contactPreferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactPreferenceId() {
        return contactPreferenceId;
    }

    /**
     * Sets the value of the contactPreferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactPreferenceId(Long value) {
        this.contactPreferenceId = value;
    }

    /**
     * Gets the value of the contactLevelTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactLevelTable() {
        return contactLevelTable;
    }

    /**
     * Sets the value of the contactLevelTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactLevelTable(String value) {
        this.contactLevelTable = value;
    }

    /**
     * Gets the value of the contactLevelTableId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactLevelTableId() {
        return contactLevelTableId;
    }

    /**
     * Sets the value of the contactLevelTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactLevelTableId(Long value) {
        this.contactLevelTableId = value;
    }

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactType(String value) {
        this.contactType = value;
    }

    /**
     * Gets the value of the preferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferenceCode() {
        return preferenceCode;
    }

    /**
     * Sets the value of the preferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferenceCode(String value) {
        this.preferenceCode = value;
    }

    /**
     * Gets the value of the preferenceTopicType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferenceTopicType() {
        return preferenceTopicType;
    }

    /**
     * Sets the value of the preferenceTopicType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferenceTopicType(JAXBElement<String> value) {
        this.preferenceTopicType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the preferenceTopicTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPreferenceTopicTypeId() {
        return preferenceTopicTypeId;
    }

    /**
     * Sets the value of the preferenceTopicTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPreferenceTopicTypeId(JAXBElement<Long> value) {
        this.preferenceTopicTypeId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the preferenceTopicTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferenceTopicTypeCode() {
        return preferenceTopicTypeCode;
    }

    /**
     * Sets the value of the preferenceTopicTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferenceTopicTypeCode(JAXBElement<String> value) {
        this.preferenceTopicTypeCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the preferenceStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreferenceStartDate() {
        return preferenceStartDate;
    }

    /**
     * Sets the value of the preferenceStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreferenceStartDate(XMLGregorianCalendar value) {
        this.preferenceStartDate = value;
    }

    /**
     * Gets the value of the preferenceEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPreferenceEndDate() {
        return preferenceEndDate;
    }

    /**
     * Sets the value of the preferenceEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPreferenceEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.preferenceEndDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the preferenceStartTimeHR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPreferenceStartTimeHR() {
        return preferenceStartTimeHR;
    }

    /**
     * Sets the value of the preferenceStartTimeHR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPreferenceStartTimeHR(JAXBElement<Integer> value) {
        this.preferenceStartTimeHR = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the preferenceEndTimeHR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPreferenceEndTimeHR() {
        return preferenceEndTimeHR;
    }

    /**
     * Sets the value of the preferenceEndTimeHR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPreferenceEndTimeHR(JAXBElement<Integer> value) {
        this.preferenceEndTimeHR = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the preferenceStartTimeMi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPreferenceStartTimeMi() {
        return preferenceStartTimeMi;
    }

    /**
     * Sets the value of the preferenceStartTimeMi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPreferenceStartTimeMi(JAXBElement<Integer> value) {
        this.preferenceStartTimeMi = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the preferenceEndTimeMi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPreferenceEndTimeMi() {
        return preferenceEndTimeMi;
    }

    /**
     * Sets the value of the preferenceEndTimeMi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPreferenceEndTimeMi(JAXBElement<Integer> value) {
        this.preferenceEndTimeMi = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the maximumNoOfInteractions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMaximumNoOfInteractions() {
        return maximumNoOfInteractions;
    }

    /**
     * Sets the value of the maximumNoOfInteractions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMaximumNoOfInteractions(JAXBElement<BigDecimal> value) {
        this.maximumNoOfInteractions = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the maximumNoOfInteractUOMCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaximumNoOfInteractUOMCode() {
        return maximumNoOfInteractUOMCode;
    }

    /**
     * Sets the value of the maximumNoOfInteractUOMCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaximumNoOfInteractUOMCode(JAXBElement<String> value) {
        this.maximumNoOfInteractUOMCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the requestedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedBy() {
        return requestedBy;
    }

    /**
     * Sets the value of the requestedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedBy(String value) {
        this.requestedBy = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReasonCode(JAXBElement<String> value) {
        this.reasonCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
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
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the lastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the value of the lastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedBy(String value) {
        this.lastUpdatedBy = value;
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
     * Gets the value of the objectVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectVersionNumber() {
        return objectVersionNumber;
    }

    /**
     * Sets the value of the objectVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectVersionNumber(Integer value) {
        this.objectVersionNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the createdByModule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedByModule() {
        return createdByModule;
    }

    /**
     * Sets the value of the createdByModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedByModule(JAXBElement<String> value) {
        this.createdByModule = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the originalSystemReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originalSystemReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginalSystemReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalSystemReference }
     * 
     * 
     */
    public List<OriginalSystemReference> getOriginalSystemReference() {
        if (originalSystemReference == null) {
            originalSystemReference = new ArrayList<OriginalSystemReference>();
        }
        return this.originalSystemReference;
    }

}
