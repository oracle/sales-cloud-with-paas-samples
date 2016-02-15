
package com.oracle.xmlns.apps.hcm.people.roles.userdetailsservicev2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserWorkRelationshipDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserWorkRelationshipDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BusinessUnitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BusinessUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SystemPersonType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserPersonType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PeriodOfServiceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HireDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="WorkerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignmentStatusTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UserStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AssignmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignmentStatusType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AssignmentSupervisorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ManagerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="JobName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DepartmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DepartmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartmentSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PositionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PositionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GradeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GradeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GradeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GradeSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LocationBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationFloorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationAddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationAddressLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationRegion1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationRegion2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationRegion3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationTownOrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationLongPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationTimezoneCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserWorkRelationshipDetails", propOrder = {
    "personId",
    "businessUnitId",
    "businessUnitName",
    "legalEntityName",
    "personTypeId",
    "systemPersonType",
    "userPersonType",
    "periodOfServiceId",
    "hireDate",
    "workerNumber",
    "assignmentStatusTypeId",
    "userStatus",
    "assignmentId",
    "assignmentName",
    "assignmentNumber",
    "assignmentStatusType",
    "assignmentType",
    "primaryFlag",
    "assignmentSupervisorId",
    "managerId",
    "managerName",
    "managerUsername",
    "jobId",
    "jobName",
    "jobCode",
    "jobSetId",
    "departmentId",
    "departmentName",
    "departmentSetId",
    "positionId",
    "positionName",
    "positionCode",
    "gradeId",
    "gradeName",
    "gradeCode",
    "gradeSetId",
    "locationId",
    "locationName",
    "locationCode",
    "locationSetId",
    "locationBuilding",
    "locationFloorNumber",
    "locationAddressLine1",
    "locationAddressLine2",
    "locationAddressLine3",
    "locationAddressLine4",
    "locationRegion1",
    "locationRegion2",
    "locationRegion3",
    "locationTownOrCity",
    "locationPostalCode",
    "locationCountry",
    "locationLongPostalCode",
    "locationTimezoneCode",
    "locationAddress"
})
public class UserWorkRelationshipDetails {

    @XmlElement(name = "PersonId")
    protected Long personId;
    @XmlElement(name = "BusinessUnitId")
    protected Long businessUnitId;
    @XmlElementRef(name = "BusinessUnitName", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> businessUnitName;
    @XmlElement(name = "LegalEntityName")
    protected String legalEntityName;
    @XmlElement(name = "PersonTypeId")
    protected Long personTypeId;
    @XmlElement(name = "SystemPersonType")
    protected String systemPersonType;
    @XmlElement(name = "UserPersonType")
    protected String userPersonType;
    @XmlElement(name = "PeriodOfServiceId")
    protected Long periodOfServiceId;
    @XmlElement(name = "HireDate")
    protected XMLGregorianCalendar hireDate;
    @XmlElement(name = "WorkerNumber")
    protected String workerNumber;
    @XmlElement(name = "AssignmentStatusTypeId")
    protected Long assignmentStatusTypeId;
    @XmlElement(name = "UserStatus")
    protected String userStatus;
    @XmlElement(name = "AssignmentId")
    protected Long assignmentId;
    @XmlElementRef(name = "AssignmentName", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> assignmentName;
    @XmlElementRef(name = "AssignmentNumber", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> assignmentNumber;
    @XmlElement(name = "AssignmentStatusType")
    protected String assignmentStatusType;
    @XmlElement(name = "AssignmentType")
    protected String assignmentType;
    @XmlElement(name = "PrimaryFlag")
    protected Boolean primaryFlag;
    @XmlElement(name = "AssignmentSupervisorId")
    protected Long assignmentSupervisorId;
    @XmlElement(name = "ManagerId")
    protected Long managerId;
    @XmlElementRef(name = "ManagerName", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> managerName;
    @XmlElementRef(name = "ManagerUsername", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> managerUsername;
    @XmlElementRef(name = "JobId", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> jobId;
    @XmlElementRef(name = "JobName", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> jobName;
    @XmlElementRef(name = "JobCode", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> jobCode;
    @XmlElement(name = "JobSetId")
    protected Long jobSetId;
    @XmlElement(name = "DepartmentId")
    protected Long departmentId;
    @XmlElement(name = "DepartmentName")
    protected String departmentName;
    @XmlElement(name = "DepartmentSetId")
    protected Long departmentSetId;
    @XmlElement(name = "PositionId")
    protected Long positionId;
    @XmlElement(name = "PositionName")
    protected String positionName;
    @XmlElement(name = "PositionCode")
    protected String positionCode;
    @XmlElement(name = "GradeId")
    protected Long gradeId;
    @XmlElement(name = "GradeName")
    protected String gradeName;
    @XmlElement(name = "GradeCode")
    protected String gradeCode;
    @XmlElement(name = "GradeSetId")
    protected Long gradeSetId;
    @XmlElement(name = "LocationId")
    protected Long locationId;
    @XmlElement(name = "LocationName")
    protected String locationName;
    @XmlElement(name = "LocationCode")
    protected String locationCode;
    @XmlElement(name = "LocationSetId")
    protected Long locationSetId;
    @XmlElementRef(name = "LocationBuilding", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> locationBuilding;
    @XmlElementRef(name = "LocationFloorNumber", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> locationFloorNumber;
    @XmlElementRef(name = "LocationAddressLine1", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> locationAddressLine1;
    @XmlElementRef(name = "LocationAddressLine2", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> locationAddressLine2;
    @XmlElementRef(name = "LocationAddressLine3", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> locationAddressLine3;
    @XmlElementRef(name = "LocationAddressLine4", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> locationAddressLine4;
    @XmlElementRef(name = "LocationRegion1", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> locationRegion1;
    @XmlElementRef(name = "LocationRegion2", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> locationRegion2;
    @XmlElementRef(name = "LocationRegion3", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> locationRegion3;
    @XmlElementRef(name = "LocationTownOrCity", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> locationTownOrCity;
    @XmlElementRef(name = "LocationPostalCode", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> locationPostalCode;
    @XmlElementRef(name = "LocationCountry", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> locationCountry;
    @XmlElementRef(name = "LocationLongPostalCode", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> locationLongPostalCode;
    @XmlElementRef(name = "LocationTimezoneCode", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> locationTimezoneCode;
    @XmlElementRef(name = "LocationAddress", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> locationAddress;

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonId(Long value) {
        this.personId = value;
    }

    /**
     * Gets the value of the businessUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBusinessUnitId() {
        return businessUnitId;
    }

    /**
     * Sets the value of the businessUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBusinessUnitId(Long value) {
        this.businessUnitId = value;
    }

    /**
     * Gets the value of the businessUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessUnitName() {
        return businessUnitName;
    }

    /**
     * Sets the value of the businessUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessUnitName(JAXBElement<String> value) {
        this.businessUnitName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the legalEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalEntityName() {
        return legalEntityName;
    }

    /**
     * Sets the value of the legalEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalEntityName(String value) {
        this.legalEntityName = value;
    }

    /**
     * Gets the value of the personTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonTypeId() {
        return personTypeId;
    }

    /**
     * Sets the value of the personTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonTypeId(Long value) {
        this.personTypeId = value;
    }

    /**
     * Gets the value of the systemPersonType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemPersonType() {
        return systemPersonType;
    }

    /**
     * Sets the value of the systemPersonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemPersonType(String value) {
        this.systemPersonType = value;
    }

    /**
     * Gets the value of the userPersonType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPersonType() {
        return userPersonType;
    }

    /**
     * Sets the value of the userPersonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPersonType(String value) {
        this.userPersonType = value;
    }

    /**
     * Gets the value of the periodOfServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodOfServiceId() {
        return periodOfServiceId;
    }

    /**
     * Sets the value of the periodOfServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodOfServiceId(Long value) {
        this.periodOfServiceId = value;
    }

    /**
     * Gets the value of the hireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHireDate() {
        return hireDate;
    }

    /**
     * Sets the value of the hireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHireDate(XMLGregorianCalendar value) {
        this.hireDate = value;
    }

    /**
     * Gets the value of the workerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkerNumber() {
        return workerNumber;
    }

    /**
     * Sets the value of the workerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkerNumber(String value) {
        this.workerNumber = value;
    }

    /**
     * Gets the value of the assignmentStatusTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssignmentStatusTypeId() {
        return assignmentStatusTypeId;
    }

    /**
     * Sets the value of the assignmentStatusTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssignmentStatusTypeId(Long value) {
        this.assignmentStatusTypeId = value;
    }

    /**
     * Gets the value of the userStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * Sets the value of the userStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserStatus(String value) {
        this.userStatus = value;
    }

    /**
     * Gets the value of the assignmentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssignmentId() {
        return assignmentId;
    }

    /**
     * Sets the value of the assignmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssignmentId(Long value) {
        this.assignmentId = value;
    }

    /**
     * Gets the value of the assignmentName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssignmentName() {
        return assignmentName;
    }

    /**
     * Sets the value of the assignmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssignmentName(JAXBElement<String> value) {
        this.assignmentName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the assignmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssignmentNumber() {
        return assignmentNumber;
    }

    /**
     * Sets the value of the assignmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssignmentNumber(JAXBElement<String> value) {
        this.assignmentNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the assignmentStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignmentStatusType() {
        return assignmentStatusType;
    }

    /**
     * Sets the value of the assignmentStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignmentStatusType(String value) {
        this.assignmentStatusType = value;
    }

    /**
     * Gets the value of the assignmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignmentType() {
        return assignmentType;
    }

    /**
     * Sets the value of the assignmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignmentType(String value) {
        this.assignmentType = value;
    }

    /**
     * Gets the value of the primaryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryFlag() {
        return primaryFlag;
    }

    /**
     * Sets the value of the primaryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryFlag(Boolean value) {
        this.primaryFlag = value;
    }

    /**
     * Gets the value of the assignmentSupervisorId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssignmentSupervisorId() {
        return assignmentSupervisorId;
    }

    /**
     * Sets the value of the assignmentSupervisorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssignmentSupervisorId(Long value) {
        this.assignmentSupervisorId = value;
    }

    /**
     * Gets the value of the managerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManagerId() {
        return managerId;
    }

    /**
     * Sets the value of the managerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManagerId(Long value) {
        this.managerId = value;
    }

    /**
     * Gets the value of the managerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManagerName() {
        return managerName;
    }

    /**
     * Sets the value of the managerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManagerName(JAXBElement<String> value) {
        this.managerName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the managerUsername property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManagerUsername() {
        return managerUsername;
    }

    /**
     * Sets the value of the managerUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManagerUsername(JAXBElement<String> value) {
        this.managerUsername = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setJobId(JAXBElement<Long> value) {
        this.jobId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the jobName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobName() {
        return jobName;
    }

    /**
     * Sets the value of the jobName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobName(JAXBElement<String> value) {
        this.jobName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the jobCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobCode() {
        return jobCode;
    }

    /**
     * Sets the value of the jobCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobCode(JAXBElement<String> value) {
        this.jobCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the jobSetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getJobSetId() {
        return jobSetId;
    }

    /**
     * Sets the value of the jobSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setJobSetId(Long value) {
        this.jobSetId = value;
    }

    /**
     * Gets the value of the departmentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * Sets the value of the departmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDepartmentId(Long value) {
        this.departmentId = value;
    }

    /**
     * Gets the value of the departmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets the value of the departmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentName(String value) {
        this.departmentName = value;
    }

    /**
     * Gets the value of the departmentSetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDepartmentSetId() {
        return departmentSetId;
    }

    /**
     * Sets the value of the departmentSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDepartmentSetId(Long value) {
        this.departmentSetId = value;
    }

    /**
     * Gets the value of the positionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPositionId() {
        return positionId;
    }

    /**
     * Sets the value of the positionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPositionId(Long value) {
        this.positionId = value;
    }

    /**
     * Gets the value of the positionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionName() {
        return positionName;
    }

    /**
     * Sets the value of the positionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionName(String value) {
        this.positionName = value;
    }

    /**
     * Gets the value of the positionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionCode() {
        return positionCode;
    }

    /**
     * Sets the value of the positionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionCode(String value) {
        this.positionCode = value;
    }

    /**
     * Gets the value of the gradeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGradeId() {
        return gradeId;
    }

    /**
     * Sets the value of the gradeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGradeId(Long value) {
        this.gradeId = value;
    }

    /**
     * Gets the value of the gradeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradeName() {
        return gradeName;
    }

    /**
     * Sets the value of the gradeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradeName(String value) {
        this.gradeName = value;
    }

    /**
     * Gets the value of the gradeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradeCode() {
        return gradeCode;
    }

    /**
     * Sets the value of the gradeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradeCode(String value) {
        this.gradeCode = value;
    }

    /**
     * Gets the value of the gradeSetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGradeSetId() {
        return gradeSetId;
    }

    /**
     * Sets the value of the gradeSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGradeSetId(Long value) {
        this.gradeSetId = value;
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
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the locationSetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocationSetId() {
        return locationSetId;
    }

    /**
     * Sets the value of the locationSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocationSetId(Long value) {
        this.locationSetId = value;
    }

    /**
     * Gets the value of the locationBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationBuilding() {
        return locationBuilding;
    }

    /**
     * Sets the value of the locationBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationBuilding(JAXBElement<String> value) {
        this.locationBuilding = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locationFloorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationFloorNumber() {
        return locationFloorNumber;
    }

    /**
     * Sets the value of the locationFloorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationFloorNumber(JAXBElement<String> value) {
        this.locationFloorNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locationAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationAddressLine1() {
        return locationAddressLine1;
    }

    /**
     * Sets the value of the locationAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationAddressLine1(JAXBElement<String> value) {
        this.locationAddressLine1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locationAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationAddressLine2() {
        return locationAddressLine2;
    }

    /**
     * Sets the value of the locationAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationAddressLine2(JAXBElement<String> value) {
        this.locationAddressLine2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locationAddressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationAddressLine3() {
        return locationAddressLine3;
    }

    /**
     * Sets the value of the locationAddressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationAddressLine3(JAXBElement<String> value) {
        this.locationAddressLine3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locationAddressLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationAddressLine4() {
        return locationAddressLine4;
    }

    /**
     * Sets the value of the locationAddressLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationAddressLine4(JAXBElement<String> value) {
        this.locationAddressLine4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locationRegion1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationRegion1() {
        return locationRegion1;
    }

    /**
     * Sets the value of the locationRegion1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationRegion1(JAXBElement<String> value) {
        this.locationRegion1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locationRegion2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationRegion2() {
        return locationRegion2;
    }

    /**
     * Sets the value of the locationRegion2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationRegion2(JAXBElement<String> value) {
        this.locationRegion2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locationRegion3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationRegion3() {
        return locationRegion3;
    }

    /**
     * Sets the value of the locationRegion3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationRegion3(JAXBElement<String> value) {
        this.locationRegion3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locationTownOrCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationTownOrCity() {
        return locationTownOrCity;
    }

    /**
     * Sets the value of the locationTownOrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationTownOrCity(JAXBElement<String> value) {
        this.locationTownOrCity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locationPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationPostalCode() {
        return locationPostalCode;
    }

    /**
     * Sets the value of the locationPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationPostalCode(JAXBElement<String> value) {
        this.locationPostalCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationCountry() {
        return locationCountry;
    }

    /**
     * Sets the value of the locationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationCountry(JAXBElement<String> value) {
        this.locationCountry = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locationLongPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationLongPostalCode() {
        return locationLongPostalCode;
    }

    /**
     * Sets the value of the locationLongPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationLongPostalCode(JAXBElement<String> value) {
        this.locationLongPostalCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locationTimezoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationTimezoneCode() {
        return locationTimezoneCode;
    }

    /**
     * Sets the value of the locationTimezoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationTimezoneCode(JAXBElement<String> value) {
        this.locationTimezoneCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationAddress() {
        return locationAddress;
    }

    /**
     * Sets the value of the locationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationAddress(JAXBElement<String> value) {
        this.locationAddress = ((JAXBElement<String> ) value);
    }

}
