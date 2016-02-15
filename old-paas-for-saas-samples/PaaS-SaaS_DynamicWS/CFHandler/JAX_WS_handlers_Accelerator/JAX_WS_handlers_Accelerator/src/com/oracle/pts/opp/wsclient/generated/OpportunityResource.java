
package com.oracle.pts.opp.wsclient.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OpportunityResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpportunityResource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OptyResourceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OptyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ResourceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DealProtectedDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="DealExpirationDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="DealProtected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgTreeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgTreeStructureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResourceOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MemberFunctionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LockAssignmentFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AssignmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="PersonFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AsgnTerritoryVersionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TerritoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartnerPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MgrResourceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OptyResourceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunityResource", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", propOrder = {
    "optyResourceId",
    "optyId",
    "resourceId",
    "partyName",
    "accessLevelCode",
    "dealProtectedDate",
    "dealExpirationDate",
    "dealProtected",
    "orgTreeCode",
    "orgTreeStructureCode",
    "resourceOrgId",
    "memberFunctionCode",
    "ownerFlag",
    "lockAssignmentFlag",
    "assignmentType",
    "conflictId",
    "createdBy",
    "creationDate",
    "lastUpdatedBy",
    "lastUpdateDate",
    "lastUpdateLogin",
    "objectVersionNumber",
    "userLastUpdateDate",
    "personFirstName",
    "personLastName",
    "organizationName",
    "organizationId",
    "asgnTerritoryVersionId",
    "territoryName",
    "emailAddress",
    "formattedPhoneNumber",
    "partnerOrgId",
    "partnerPartyName",
    "roleName",
    "mgrResourceId",
    "optyResourceNumber"
})
public class OpportunityResource {

    @XmlElement(name = "OptyResourceId")
    protected Long optyResourceId;
    @XmlElement(name = "OptyId")
    protected Long optyId;
    @XmlElement(name = "ResourceId")
    protected Long resourceId;
    @XmlElement(name = "PartyName")
    protected String partyName;
    @XmlElementRef(name = "AccessLevelCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> accessLevelCode;
    @XmlElementRef(name = "DealProtectedDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dealProtectedDate;
    @XmlElementRef(name = "DealExpirationDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dealExpirationDate;
    @XmlElementRef(name = "DealProtected", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> dealProtected;
    @XmlElementRef(name = "OrgTreeCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> orgTreeCode;
    @XmlElementRef(name = "OrgTreeStructureCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> orgTreeStructureCode;
    @XmlElementRef(name = "ResourceOrgId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Long> resourceOrgId;
    @XmlElementRef(name = "MemberFunctionCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> memberFunctionCode;
    @XmlElementRef(name = "OwnerFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> ownerFlag;
    @XmlElementRef(name = "LockAssignmentFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> lockAssignmentFlag;
    @XmlElementRef(name = "AssignmentType", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> assignmentType;
    @XmlElement(name = "ConflictId")
    protected Long conflictId;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElementRef(name = "PersonFirstName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> personFirstName;
    @XmlElementRef(name = "PersonLastName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> personLastName;
    @XmlElement(name = "OrganizationName")
    protected String organizationName;
    @XmlElement(name = "OrganizationId")
    protected Long organizationId;
    @XmlElementRef(name = "AsgnTerritoryVersionId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Long> asgnTerritoryVersionId;
    @XmlElement(name = "TerritoryName")
    protected String territoryName;
    @XmlElementRef(name = "EmailAddress", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> emailAddress;
    @XmlElementRef(name = "FormattedPhoneNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> formattedPhoneNumber;
    @XmlElementRef(name = "PartnerOrgId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Long> partnerOrgId;
    @XmlElement(name = "PartnerPartyName")
    protected String partnerPartyName;
    @XmlElementRef(name = "RoleName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> roleName;
    @XmlElementRef(name = "MgrResourceId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Long> mgrResourceId;
    @XmlElement(name = "OptyResourceNumber")
    protected String optyResourceNumber;

    /**
     * Gets the value of the optyResourceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOptyResourceId() {
        return optyResourceId;
    }

    /**
     * Sets the value of the optyResourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOptyResourceId(Long value) {
        this.optyResourceId = value;
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
     * Gets the value of the resourceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResourceId(Long value) {
        this.resourceId = value;
    }

    /**
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName(String value) {
        this.partyName = value;
    }

    /**
     * Gets the value of the accessLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccessLevelCode() {
        return accessLevelCode;
    }

    /**
     * Sets the value of the accessLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccessLevelCode(JAXBElement<String> value) {
        this.accessLevelCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dealProtectedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDealProtectedDate() {
        return dealProtectedDate;
    }

    /**
     * Sets the value of the dealProtectedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDealProtectedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.dealProtectedDate = ((JAXBElement<XMLGregorianCalendar> ) value);
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

    /**
     * Gets the value of the dealProtected property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDealProtected() {
        return dealProtected;
    }

    /**
     * Sets the value of the dealProtected property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDealProtected(JAXBElement<String> value) {
        this.dealProtected = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgTreeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgTreeCode() {
        return orgTreeCode;
    }

    /**
     * Sets the value of the orgTreeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgTreeCode(JAXBElement<String> value) {
        this.orgTreeCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgTreeStructureCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgTreeStructureCode() {
        return orgTreeStructureCode;
    }

    /**
     * Sets the value of the orgTreeStructureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgTreeStructureCode(JAXBElement<String> value) {
        this.orgTreeStructureCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the resourceOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getResourceOrgId() {
        return resourceOrgId;
    }

    /**
     * Sets the value of the resourceOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setResourceOrgId(JAXBElement<Long> value) {
        this.resourceOrgId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the memberFunctionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemberFunctionCode() {
        return memberFunctionCode;
    }

    /**
     * Sets the value of the memberFunctionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemberFunctionCode(JAXBElement<String> value) {
        this.memberFunctionCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ownerFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOwnerFlag() {
        return ownerFlag;
    }

    /**
     * Sets the value of the ownerFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOwnerFlag(JAXBElement<Boolean> value) {
        this.ownerFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the lockAssignmentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLockAssignmentFlag() {
        return lockAssignmentFlag;
    }

    /**
     * Sets the value of the lockAssignmentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLockAssignmentFlag(JAXBElement<Boolean> value) {
        this.lockAssignmentFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the assignmentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssignmentType() {
        return assignmentType;
    }

    /**
     * Sets the value of the assignmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssignmentType(JAXBElement<String> value) {
        this.assignmentType = ((JAXBElement<String> ) value);
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
     * Gets the value of the personFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonFirstName() {
        return personFirstName;
    }

    /**
     * Sets the value of the personFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonFirstName(JAXBElement<String> value) {
        this.personFirstName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the personLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonLastName() {
        return personLastName;
    }

    /**
     * Sets the value of the personLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonLastName(JAXBElement<String> value) {
        this.personLastName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrganizationId(Long value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the asgnTerritoryVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAsgnTerritoryVersionId() {
        return asgnTerritoryVersionId;
    }

    /**
     * Sets the value of the asgnTerritoryVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAsgnTerritoryVersionId(JAXBElement<Long> value) {
        this.asgnTerritoryVersionId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the territoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritoryName() {
        return territoryName;
    }

    /**
     * Sets the value of the territoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritoryName(String value) {
        this.territoryName = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailAddress(JAXBElement<String> value) {
        this.emailAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the formattedPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedPhoneNumber() {
        return formattedPhoneNumber;
    }

    /**
     * Sets the value of the formattedPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedPhoneNumber(JAXBElement<String> value) {
        this.formattedPhoneNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partnerOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPartnerOrgId() {
        return partnerOrgId;
    }

    /**
     * Sets the value of the partnerOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPartnerOrgId(JAXBElement<Long> value) {
        this.partnerOrgId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the partnerPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerPartyName() {
        return partnerPartyName;
    }

    /**
     * Sets the value of the partnerPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerPartyName(String value) {
        this.partnerPartyName = value;
    }

    /**
     * Gets the value of the roleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoleName(JAXBElement<String> value) {
        this.roleName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mgrResourceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMgrResourceId() {
        return mgrResourceId;
    }

    /**
     * Sets the value of the mgrResourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMgrResourceId(JAXBElement<Long> value) {
        this.mgrResourceId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the optyResourceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptyResourceNumber() {
        return optyResourceNumber;
    }

    /**
     * Sets the value of the optyResourceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptyResourceNumber(String value) {
        this.optyResourceNumber = value;
    }

}
