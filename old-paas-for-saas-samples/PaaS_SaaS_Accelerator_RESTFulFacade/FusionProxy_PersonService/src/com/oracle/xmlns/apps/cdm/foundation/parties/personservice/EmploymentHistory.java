
package com.oracle.xmlns.apps.cdm.foundation.parties.personservice;

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


/**
 * <p>Java class for EmploymentHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmploymentHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmploymentHistoryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BeginDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EmployedAsTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployedByDivisionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployedByNameCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="SupervisorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Branch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MilitaryRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="Served" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Responsibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployedByPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReasonForLeaving" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacultyPositionFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TenureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FractionOfTenure" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EmploymentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployedAsTitleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeeklyWorkHours" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedByModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkClass" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/}WorkClass" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmploymentHistory", propOrder = {
    "employmentHistoryId",
    "beginDate",
    "partyId",
    "employedAsTitle",
    "employedByDivisionName",
    "employedByNameCompany",
    "endDate",
    "supervisorName",
    "branch",
    "militaryRank",
    "createdBy",
    "creationDate",
    "served",
    "lastUpdateLogin",
    "station",
    "lastUpdateDate",
    "lastUpdatedBy",
    "requestId",
    "responsibility",
    "status",
    "employedByPartyId",
    "reasonForLeaving",
    "facultyPositionFlag",
    "tenureCode",
    "fractionOfTenure",
    "employmentTypeCode",
    "employedAsTitleCode",
    "weeklyWorkHours",
    "comments",
    "createdByModule",
    "workClass"
})
public class EmploymentHistory {

    @XmlElement(name = "EmploymentHistoryId")
    protected Long employmentHistoryId;
    @XmlElementRef(name = "BeginDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> beginDate;
    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElementRef(name = "EmployedAsTitle", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<String> employedAsTitle;
    @XmlElementRef(name = "EmployedByDivisionName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<String> employedByDivisionName;
    @XmlElementRef(name = "EmployedByNameCompany", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<String> employedByNameCompany;
    @XmlElementRef(name = "EndDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    @XmlElementRef(name = "SupervisorName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<String> supervisorName;
    @XmlElementRef(name = "Branch", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<String> branch;
    @XmlElementRef(name = "MilitaryRank", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<String> militaryRank;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElementRef(name = "Served", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<String> served;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElementRef(name = "Station", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<String> station;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "RequestId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<Long> requestId;
    @XmlElementRef(name = "Responsibility", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<String> responsibility;
    @XmlElementRef(name = "Status", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "EmployedByPartyId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<Long> employedByPartyId;
    @XmlElementRef(name = "ReasonForLeaving", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<String> reasonForLeaving;
    @XmlElementRef(name = "FacultyPositionFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> facultyPositionFlag;
    @XmlElementRef(name = "TenureCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<String> tenureCode;
    @XmlElementRef(name = "FractionOfTenure", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> fractionOfTenure;
    @XmlElementRef(name = "EmploymentTypeCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<String> employmentTypeCode;
    @XmlElementRef(name = "EmployedAsTitleCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<String> employedAsTitleCode;
    @XmlElementRef(name = "WeeklyWorkHours", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> weeklyWorkHours;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "CreatedByModule", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class)
    protected JAXBElement<String> createdByModule;
    @XmlElement(name = "WorkClass")
    protected List<WorkClass> workClass;

    /**
     * Gets the value of the employmentHistoryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEmploymentHistoryId() {
        return employmentHistoryId;
    }

    /**
     * Sets the value of the employmentHistoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEmploymentHistoryId(Long value) {
        this.employmentHistoryId = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBeginDate(JAXBElement<XMLGregorianCalendar> value) {
        this.beginDate = ((JAXBElement<XMLGregorianCalendar> ) value);
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
     * Gets the value of the employedAsTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployedAsTitle() {
        return employedAsTitle;
    }

    /**
     * Sets the value of the employedAsTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployedAsTitle(JAXBElement<String> value) {
        this.employedAsTitle = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the employedByDivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployedByDivisionName() {
        return employedByDivisionName;
    }

    /**
     * Sets the value of the employedByDivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployedByDivisionName(JAXBElement<String> value) {
        this.employedByDivisionName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the employedByNameCompany property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployedByNameCompany() {
        return employedByNameCompany;
    }

    /**
     * Sets the value of the employedByNameCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployedByNameCompany(JAXBElement<String> value) {
        this.employedByNameCompany = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.endDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the supervisorName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupervisorName() {
        return supervisorName;
    }

    /**
     * Sets the value of the supervisorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupervisorName(JAXBElement<String> value) {
        this.supervisorName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBranch(JAXBElement<String> value) {
        this.branch = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the militaryRank property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMilitaryRank() {
        return militaryRank;
    }

    /**
     * Sets the value of the militaryRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMilitaryRank(JAXBElement<String> value) {
        this.militaryRank = ((JAXBElement<String> ) value);
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
     * Gets the value of the served property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServed() {
        return served;
    }

    /**
     * Sets the value of the served property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServed(JAXBElement<String> value) {
        this.served = ((JAXBElement<String> ) value);
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
     * Gets the value of the station property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStation() {
        return station;
    }

    /**
     * Sets the value of the station property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStation(JAXBElement<String> value) {
        this.station = ((JAXBElement<String> ) value);
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
     * Gets the value of the responsibility property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponsibility() {
        return responsibility;
    }

    /**
     * Sets the value of the responsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponsibility(JAXBElement<String> value) {
        this.responsibility = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the employedByPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEmployedByPartyId() {
        return employedByPartyId;
    }

    /**
     * Sets the value of the employedByPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEmployedByPartyId(JAXBElement<Long> value) {
        this.employedByPartyId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the reasonForLeaving property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReasonForLeaving() {
        return reasonForLeaving;
    }

    /**
     * Sets the value of the reasonForLeaving property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReasonForLeaving(JAXBElement<String> value) {
        this.reasonForLeaving = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the facultyPositionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFacultyPositionFlag() {
        return facultyPositionFlag;
    }

    /**
     * Sets the value of the facultyPositionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFacultyPositionFlag(JAXBElement<Boolean> value) {
        this.facultyPositionFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the tenureCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTenureCode() {
        return tenureCode;
    }

    /**
     * Sets the value of the tenureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTenureCode(JAXBElement<String> value) {
        this.tenureCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fractionOfTenure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFractionOfTenure() {
        return fractionOfTenure;
    }

    /**
     * Sets the value of the fractionOfTenure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFractionOfTenure(JAXBElement<BigDecimal> value) {
        this.fractionOfTenure = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the employmentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmploymentTypeCode() {
        return employmentTypeCode;
    }

    /**
     * Sets the value of the employmentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmploymentTypeCode(JAXBElement<String> value) {
        this.employmentTypeCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the employedAsTitleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployedAsTitleCode() {
        return employedAsTitleCode;
    }

    /**
     * Sets the value of the employedAsTitleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployedAsTitleCode(JAXBElement<String> value) {
        this.employedAsTitleCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the weeklyWorkHours property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWeeklyWorkHours() {
        return weeklyWorkHours;
    }

    /**
     * Sets the value of the weeklyWorkHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWeeklyWorkHours(JAXBElement<BigDecimal> value) {
        this.weeklyWorkHours = ((JAXBElement<BigDecimal> ) value);
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
     * Gets the value of the workClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkClass }
     * 
     * 
     */
    public List<WorkClass> getWorkClass() {
        if (workClass == null) {
            workClass = new ArrayList<WorkClass>();
        }
        return this.workClass;
    }

}
