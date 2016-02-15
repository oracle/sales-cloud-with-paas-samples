
package com.oracle.xmlns.apps.sales.opptymgmt.opportunities.opportunityservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OpportunityLead complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpportunityLead">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OptyLeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OptyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LeadNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DealEstimatedCloseDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="DealType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrDealPartOrgPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrDealPartResourcePartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DealPartProgramId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartnerTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DealExpirationDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunityLead", propOrder = {
    "optyLeadId",
    "optyId",
    "leadNumber",
    "conflictId",
    "creationDate",
    "createdBy",
    "lastUpdateDate",
    "lastUpdatedBy",
    "lastUpdateLogin",
    "objectVersionNumber",
    "userLastUpdateDate",
    "registrationNumber",
    "dealEstimatedCloseDate",
    "dealType",
    "prDealPartOrgPartyId",
    "prDealPartResourcePartyId",
    "dealPartProgramId",
    "partnerTypeCd",
    "dealExpirationDate"
})
public class OpportunityLead {

    @XmlElement(name = "OptyLeadId")
    protected Long optyLeadId;
    @XmlElement(name = "OptyId")
    protected Long optyId;
    @XmlElement(name = "LeadNumber")
    protected String leadNumber;
    @XmlElement(name = "ConflictId")
    protected Long conflictId;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElementRef(name = "RegistrationNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> registrationNumber;
    @XmlElementRef(name = "DealEstimatedCloseDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dealEstimatedCloseDate;
    @XmlElementRef(name = "DealType", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> dealType;
    @XmlElementRef(name = "PrDealPartOrgPartyId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Long> prDealPartOrgPartyId;
    @XmlElementRef(name = "PrDealPartResourcePartyId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Long> prDealPartResourcePartyId;
    @XmlElementRef(name = "DealPartProgramId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Long> dealPartProgramId;
    @XmlElementRef(name = "PartnerTypeCd", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> partnerTypeCd;
    @XmlElementRef(name = "DealExpirationDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dealExpirationDate;

    /**
     * Gets the value of the optyLeadId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOptyLeadId() {
        return optyLeadId;
    }

    /**
     * Sets the value of the optyLeadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOptyLeadId(Long value) {
        this.optyLeadId = value;
    }

    /**
     * Gets the value of the optyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOptyId() {
        return optyId;
    }

    /**
     * Sets the value of the optyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOptyId(Long value) {
        this.optyId = value;
    }

    /**
     * Gets the value of the leadNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadNumber() {
        return leadNumber;
    }

    /**
     * Sets the value of the leadNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadNumber(String value) {
        this.leadNumber = value;
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
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationNumber(JAXBElement<String> value) {
        this.registrationNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dealEstimatedCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDealEstimatedCloseDate() {
        return dealEstimatedCloseDate;
    }

    /**
     * Sets the value of the dealEstimatedCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDealEstimatedCloseDate(JAXBElement<XMLGregorianCalendar> value) {
        this.dealEstimatedCloseDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the dealType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDealType() {
        return dealType;
    }

    /**
     * Sets the value of the dealType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDealType(JAXBElement<String> value) {
        this.dealType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prDealPartOrgPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrDealPartOrgPartyId() {
        return prDealPartOrgPartyId;
    }

    /**
     * Sets the value of the prDealPartOrgPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrDealPartOrgPartyId(JAXBElement<Long> value) {
        this.prDealPartOrgPartyId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the prDealPartResourcePartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrDealPartResourcePartyId() {
        return prDealPartResourcePartyId;
    }

    /**
     * Sets the value of the prDealPartResourcePartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrDealPartResourcePartyId(JAXBElement<Long> value) {
        this.prDealPartResourcePartyId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the dealPartProgramId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDealPartProgramId() {
        return dealPartProgramId;
    }

    /**
     * Sets the value of the dealPartProgramId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDealPartProgramId(JAXBElement<Long> value) {
        this.dealPartProgramId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the partnerTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartnerTypeCd() {
        return partnerTypeCd;
    }

    /**
     * Sets the value of the partnerTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartnerTypeCd(JAXBElement<String> value) {
        this.partnerTypeCd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dealExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDealExpirationDate() {
        return dealExpirationDate;
    }

    /**
     * Sets the value of the dealExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDealExpirationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.dealExpirationDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
