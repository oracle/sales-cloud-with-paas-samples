
package com.oracle.xmlns.apps.cdm.foundation.parties.partyservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.apps.cdm.foundation.parties.contactpointservice.ContactPreference;
import com.oracle.xmlns.apps.cdm.foundation.parties.contactpointservice.Phone;
import com.oracle.xmlns.apps.cdm.foundation.parties.flex.partysite.PartySiteInformation;


/**
 * <p>Java class for PersonPartySite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonPartySite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartySiteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="PartySiteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OrigSystemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDateActive" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EndDateActive" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Mailstop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdentifyingAddressFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartySiteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Addressee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreatedByModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalLocationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSNumberC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartySiteType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyNameDba" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyNameDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyNameLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelationshipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyUsageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverallPrimaryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartySiteUse" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}PartySiteUse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}Phone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OriginalSystemReference" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}OriginalSystemReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactPreference" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}ContactPreference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonPartySiteInformation" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/partySite/}PartySiteInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonPartySite", propOrder = {
    "partySiteId",
    "partyId",
    "locationId",
    "lastUpdateDate",
    "partySiteNumber",
    "lastUpdatedBy",
    "creationDate",
    "createdBy",
    "lastUpdateLogin",
    "requestId",
    "origSystemReference",
    "startDateActive",
    "endDateActive",
    "mailstop",
    "identifyingAddressFlag",
    "language",
    "status",
    "partySiteName",
    "addressee",
    "objectVersionNumber",
    "createdByModule",
    "globalLocationNumber",
    "dunsNumberC",
    "comments",
    "partySiteType",
    "partyNameDba",
    "partyNameDivision",
    "partyNameLegal",
    "relationshipId",
    "partyUsageCode",
    "overallPrimaryFlag",
    "partySiteUse",
    "phone",
    "originalSystemReference",
    "contactPreference",
    "personPartySiteInformation"
})
public class PersonPartySite {

    @XmlElement(name = "PartySiteId")
    protected Long partySiteId;
    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElement(name = "LocationId")
    protected Long locationId;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "PartySiteNumber")
    protected String partySiteNumber;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElementRef(name = "RequestId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<Long> requestId;
    @XmlElement(name = "OrigSystemReference")
    protected String origSystemReference;
    @XmlElement(name = "StartDateActive")
    protected XMLGregorianCalendar startDateActive;
    @XmlElementRef(name = "EndDateActive", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> endDateActive;
    @XmlElementRef(name = "Mailstop", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> mailstop;
    @XmlElement(name = "IdentifyingAddressFlag")
    protected Boolean identifyingAddressFlag;
    @XmlElementRef(name = "Language", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> language;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElementRef(name = "PartySiteName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> partySiteName;
    @XmlElementRef(name = "Addressee", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> addressee;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "CreatedByModule", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> createdByModule;
    @XmlElementRef(name = "GlobalLocationNumber", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> globalLocationNumber;
    @XmlElementRef(name = "DUNSNumberC", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> dunsNumberC;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "PartySiteType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> partySiteType;
    @XmlElementRef(name = "PartyNameDba", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> partyNameDba;
    @XmlElementRef(name = "PartyNameDivision", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> partyNameDivision;
    @XmlElementRef(name = "PartyNameLegal", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> partyNameLegal;
    @XmlElementRef(name = "RelationshipId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<Long> relationshipId;
    @XmlElementRef(name = "PartyUsageCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> partyUsageCode;
    @XmlElement(name = "OverallPrimaryFlag")
    protected Boolean overallPrimaryFlag;
    @XmlElement(name = "PartySiteUse")
    protected List<PartySiteUse> partySiteUse;
    @XmlElement(name = "Phone")
    protected List<Phone> phone;
    @XmlElement(name = "OriginalSystemReference")
    protected List<OriginalSystemReference> originalSystemReference;
    @XmlElement(name = "ContactPreference")
    protected List<ContactPreference> contactPreference;
    @XmlElement(name = "PersonPartySiteInformation")
    protected PartySiteInformation personPartySiteInformation;

    /**
     * Gets the value of the partySiteId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartySiteId() {
        return partySiteId;
    }

    /**
     * Sets the value of the partySiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartySiteId(Long value) {
        this.partySiteId = value;
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartyId(Long value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocationId(Long value) {
        this.locationId = value;
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
     * Gets the value of the partySiteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartySiteNumber() {
        return partySiteNumber;
    }

    /**
     * Sets the value of the partySiteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartySiteNumber(String value) {
        this.partySiteNumber = value;
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
     * Gets the value of the origSystemReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigSystemReference() {
        return origSystemReference;
    }

    /**
     * Sets the value of the origSystemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigSystemReference(String value) {
        this.origSystemReference = value;
    }

    /**
     * Gets the value of the startDateActive property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateActive() {
        return startDateActive;
    }

    /**
     * Sets the value of the startDateActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateActive(XMLGregorianCalendar value) {
        this.startDateActive = value;
    }

    /**
     * Gets the value of the endDateActive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDateActive() {
        return endDateActive;
    }

    /**
     * Sets the value of the endDateActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDateActive(JAXBElement<XMLGregorianCalendar> value) {
        this.endDateActive = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the mailstop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailstop() {
        return mailstop;
    }

    /**
     * Sets the value of the mailstop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailstop(JAXBElement<String> value) {
        this.mailstop = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the identifyingAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifyingAddressFlag() {
        return identifyingAddressFlag;
    }

    /**
     * Sets the value of the identifyingAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifyingAddressFlag(Boolean value) {
        this.identifyingAddressFlag = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguage(JAXBElement<String> value) {
        this.language = ((JAXBElement<String> ) value);
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
     * Gets the value of the partySiteName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartySiteName() {
        return partySiteName;
    }

    /**
     * Sets the value of the partySiteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartySiteName(JAXBElement<String> value) {
        this.partySiteName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the addressee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressee() {
        return addressee;
    }

    /**
     * Sets the value of the addressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressee(JAXBElement<String> value) {
        this.addressee = ((JAXBElement<String> ) value);
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
     * Gets the value of the globalLocationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalLocationNumber() {
        return globalLocationNumber;
    }

    /**
     * Sets the value of the globalLocationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalLocationNumber(JAXBElement<String> value) {
        this.globalLocationNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dunsNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUNSNumberC() {
        return dunsNumberC;
    }

    /**
     * Sets the value of the dunsNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUNSNumberC(JAXBElement<String> value) {
        this.dunsNumberC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComments(JAXBElement<String> value) {
        this.comments = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partySiteType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartySiteType() {
        return partySiteType;
    }

    /**
     * Sets the value of the partySiteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartySiteType(JAXBElement<String> value) {
        this.partySiteType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyNameDba property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyNameDba() {
        return partyNameDba;
    }

    /**
     * Sets the value of the partyNameDba property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyNameDba(JAXBElement<String> value) {
        this.partyNameDba = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyNameDivision property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyNameDivision() {
        return partyNameDivision;
    }

    /**
     * Sets the value of the partyNameDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyNameDivision(JAXBElement<String> value) {
        this.partyNameDivision = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyNameLegal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyNameLegal() {
        return partyNameLegal;
    }

    /**
     * Sets the value of the partyNameLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyNameLegal(JAXBElement<String> value) {
        this.partyNameLegal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the relationshipId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRelationshipId() {
        return relationshipId;
    }

    /**
     * Sets the value of the relationshipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRelationshipId(JAXBElement<Long> value) {
        this.relationshipId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the partyUsageCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyUsageCode() {
        return partyUsageCode;
    }

    /**
     * Sets the value of the partyUsageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyUsageCode(JAXBElement<String> value) {
        this.partyUsageCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the overallPrimaryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverallPrimaryFlag() {
        return overallPrimaryFlag;
    }

    /**
     * Sets the value of the overallPrimaryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverallPrimaryFlag(Boolean value) {
        this.overallPrimaryFlag = value;
    }

    /**
     * Gets the value of the partySiteUse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partySiteUse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartySiteUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartySiteUse }
     * 
     * 
     */
    public List<PartySiteUse> getPartySiteUse() {
        if (partySiteUse == null) {
            partySiteUse = new ArrayList<PartySiteUse>();
        }
        return this.partySiteUse;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Phone }
     * 
     * 
     */
    public List<Phone> getPhone() {
        if (phone == null) {
            phone = new ArrayList<Phone>();
        }
        return this.phone;
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

    /**
     * Gets the value of the contactPreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPreference }
     * 
     * 
     */
    public List<ContactPreference> getContactPreference() {
        if (contactPreference == null) {
            contactPreference = new ArrayList<ContactPreference>();
        }
        return this.contactPreference;
    }

    /**
     * Gets the value of the personPartySiteInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PartySiteInformation }
     *     
     */
    public PartySiteInformation getPersonPartySiteInformation() {
        return personPartySiteInformation;
    }

    /**
     * Sets the value of the personPartySiteInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartySiteInformation }
     *     
     */
    public void setPersonPartySiteInformation(PartySiteInformation value) {
        this.personPartySiteInformation = value;
    }

}
