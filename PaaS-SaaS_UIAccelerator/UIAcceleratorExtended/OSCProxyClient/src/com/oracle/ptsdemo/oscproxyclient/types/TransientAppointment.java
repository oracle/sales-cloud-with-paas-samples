
package com.oracle.ptsdemo.oscproxyclient.types;

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
 * <p>Java class for TransientAppointment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransientAppointment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ActivityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AsgnDenormFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AsgnManualFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AsgnSystemFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LockAsgnFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DoNotRouteFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OwnerRsrcOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceObjectCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceObjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TemplateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TemplateFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PlannedStartDt" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="PlannedEndDt" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="PlannedDurationNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PlannedDurationUOMCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApptAlarmTmMinimumNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AlarmFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReferenceCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VisibilityCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurDay" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RecurMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurExceptionFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RecurWeekDayCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurWedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RecurTueFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RecurThuFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RecurSunFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RecurSatFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RecurReplaceCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurMonFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RecurFriFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RecurFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RecurOrigInstDt" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="RecurOccursNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RecurFreqNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RecurEndDt" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="RecurApptId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Response" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShowTimeAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryCodeTransient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllDayFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ActivityLocationTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyId1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EditMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceCustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppointmentAssignee" type="{http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/}TransientAssignee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AppointmentContact" type="{http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/}TransientContact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AppointmentNote" type="{http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/}TransientNote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransientCategory" type="{http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/}TransientCategory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransientAppointment", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", propOrder = {
    "activityId",
    "activityName",
    "activityDescription",
    "asgnDenormFlag",
    "asgnManualFlag",
    "asgnSystemFlag",
    "lockAsgnFlag",
    "doNotRouteFlag",
    "ownerId",
    "ownerRsrcOrgId",
    "sourceObjectCd",
    "sourceObjectId",
    "templateId",
    "templateFlag",
    "plannedStartDt",
    "plannedEndDt",
    "plannedDurationNumber",
    "plannedDurationUOMCd",
    "apptAlarmTmMinimumNumber",
    "alarmFlag",
    "customerId",
    "referenceCustomerId",
    "visibilityCd",
    "recurTypeCd",
    "recurDay",
    "recurMonth",
    "recurPattern",
    "recurExceptionFlag",
    "recurWeekDayCd",
    "recurWedFlag",
    "recurTueFlag",
    "recurThuFlag",
    "recurSunFlag",
    "recurSatFlag",
    "recurReplaceCd",
    "recurMonFlag",
    "recurFriFlag",
    "recurFlag",
    "recurOrigInstDt",
    "recurOccursNumber",
    "recurFreqNumber",
    "recurEndDt",
    "recurApptId",
    "response",
    "showTimeAs",
    "categoryCodeTransient",
    "allDayFlag",
    "activityLocationTxt",
    "partyName",
    "partyId",
    "partyName1",
    "partyId1",
    "customerName",
    "owner",
    "conflictId",
    "createdBy",
    "creationDate",
    "lastUpdateDate",
    "lastUpdateLogin",
    "lastUpdatedBy",
    "objectVersionNumber",
    "editMode",
    "referenceCustomerName",
    "categoryCd",
    "appointmentAssignee",
    "appointmentContact",
    "appointmentNote",
    "transientCategory"
})
public class TransientAppointment {

    @XmlElementRef(name = "ActivityId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> activityId;
    @XmlElementRef(name = "ActivityName", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> activityName;
    @XmlElementRef(name = "ActivityDescription", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> activityDescription;
    @XmlElementRef(name = "AsgnDenormFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> asgnDenormFlag;
    @XmlElementRef(name = "AsgnManualFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> asgnManualFlag;
    @XmlElementRef(name = "AsgnSystemFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> asgnSystemFlag;
    @XmlElementRef(name = "LockAsgnFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> lockAsgnFlag;
    @XmlElementRef(name = "DoNotRouteFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> doNotRouteFlag;
    @XmlElementRef(name = "OwnerId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> ownerId;
    @XmlElementRef(name = "OwnerRsrcOrgId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> ownerRsrcOrgId;
    @XmlElementRef(name = "SourceObjectCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> sourceObjectCd;
    @XmlElementRef(name = "SourceObjectId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> sourceObjectId;
    @XmlElementRef(name = "TemplateId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> templateId;
    @XmlElementRef(name = "TemplateFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> templateFlag;
    @XmlElementRef(name = "PlannedStartDt", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> plannedStartDt;
    @XmlElementRef(name = "PlannedEndDt", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> plannedEndDt;
    @XmlElementRef(name = "PlannedDurationNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> plannedDurationNumber;
    @XmlElementRef(name = "PlannedDurationUOMCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> plannedDurationUOMCd;
    @XmlElementRef(name = "ApptAlarmTmMinimumNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> apptAlarmTmMinimumNumber;
    @XmlElementRef(name = "AlarmFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> alarmFlag;
    @XmlElementRef(name = "CustomerId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> customerId;
    @XmlElementRef(name = "ReferenceCustomerId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> referenceCustomerId;
    @XmlElementRef(name = "VisibilityCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> visibilityCd;
    @XmlElementRef(name = "RecurTypeCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurTypeCd;
    @XmlElementRef(name = "RecurDay", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> recurDay;
    @XmlElementRef(name = "RecurMonth", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurMonth;
    @XmlElementRef(name = "RecurPattern", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurPattern;
    @XmlElementRef(name = "RecurExceptionFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> recurExceptionFlag;
    @XmlElementRef(name = "RecurWeekDayCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurWeekDayCd;
    @XmlElementRef(name = "RecurWedFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> recurWedFlag;
    @XmlElementRef(name = "RecurTueFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> recurTueFlag;
    @XmlElementRef(name = "RecurThuFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> recurThuFlag;
    @XmlElementRef(name = "RecurSunFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> recurSunFlag;
    @XmlElementRef(name = "RecurSatFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> recurSatFlag;
    @XmlElementRef(name = "RecurReplaceCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurReplaceCd;
    @XmlElementRef(name = "RecurMonFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> recurMonFlag;
    @XmlElementRef(name = "RecurFriFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> recurFriFlag;
    @XmlElementRef(name = "RecurFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> recurFlag;
    @XmlElementRef(name = "RecurOrigInstDt", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> recurOrigInstDt;
    @XmlElementRef(name = "RecurOccursNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> recurOccursNumber;
    @XmlElementRef(name = "RecurFreqNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> recurFreqNumber;
    @XmlElementRef(name = "RecurEndDt", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> recurEndDt;
    @XmlElementRef(name = "RecurApptId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> recurApptId;
    @XmlElementRef(name = "Response", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> response;
    @XmlElementRef(name = "ShowTimeAs", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> showTimeAs;
    @XmlElementRef(name = "CategoryCodeTransient", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> categoryCodeTransient;
    @XmlElementRef(name = "AllDayFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> allDayFlag;
    @XmlElementRef(name = "ActivityLocationTxt", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> activityLocationTxt;
    @XmlElementRef(name = "PartyName", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> partyName;
    @XmlElementRef(name = "PartyId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> partyId;
    @XmlElementRef(name = "PartyName1", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> partyName1;
    @XmlElementRef(name = "PartyId1", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> partyId1;
    @XmlElementRef(name = "CustomerName", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> customerName;
    @XmlElementRef(name = "Owner", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> owner;
    @XmlElementRef(name = "ConflictId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> conflictId;
    @XmlElementRef(name = "CreatedBy", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> createdBy;
    @XmlElementRef(name = "CreationDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> creationDate;
    @XmlElementRef(name = "LastUpdateDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastUpdateDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElementRef(name = "LastUpdatedBy", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdatedBy;
    @XmlElementRef(name = "ObjectVersionNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Integer> objectVersionNumber;
    @XmlElementRef(name = "EditMode", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> editMode;
    @XmlElementRef(name = "ReferenceCustomerName", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> referenceCustomerName;
    @XmlElementRef(name = "CategoryCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> categoryCd;
    @XmlElement(name = "AppointmentAssignee")
    protected List<TransientAssignee> appointmentAssignee;
    @XmlElement(name = "AppointmentContact")
    protected List<TransientContact> appointmentContact;
    @XmlElement(name = "AppointmentNote")
    protected List<TransientNote> appointmentNote;
    @XmlElement(name = "TransientCategory")
    protected List<TransientCategory> transientCategory;

    /**
     * Gets the value of the activityId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setActivityId(JAXBElement<Long> value) {
        this.activityId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the activityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActivityName() {
        return activityName;
    }

    /**
     * Sets the value of the activityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActivityName(JAXBElement<String> value) {
        this.activityName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the activityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActivityDescription() {
        return activityDescription;
    }

    /**
     * Sets the value of the activityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActivityDescription(JAXBElement<String> value) {
        this.activityDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the asgnDenormFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAsgnDenormFlag() {
        return asgnDenormFlag;
    }

    /**
     * Sets the value of the asgnDenormFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAsgnDenormFlag(JAXBElement<Boolean> value) {
        this.asgnDenormFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the asgnManualFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAsgnManualFlag() {
        return asgnManualFlag;
    }

    /**
     * Sets the value of the asgnManualFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAsgnManualFlag(JAXBElement<Boolean> value) {
        this.asgnManualFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the asgnSystemFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAsgnSystemFlag() {
        return asgnSystemFlag;
    }

    /**
     * Sets the value of the asgnSystemFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAsgnSystemFlag(JAXBElement<Boolean> value) {
        this.asgnSystemFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the lockAsgnFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLockAsgnFlag() {
        return lockAsgnFlag;
    }

    /**
     * Sets the value of the lockAsgnFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLockAsgnFlag(JAXBElement<Boolean> value) {
        this.lockAsgnFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the doNotRouteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDoNotRouteFlag() {
        return doNotRouteFlag;
    }

    /**
     * Sets the value of the doNotRouteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDoNotRouteFlag(JAXBElement<Boolean> value) {
        this.doNotRouteFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOwnerId(JAXBElement<Long> value) {
        this.ownerId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the ownerRsrcOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOwnerRsrcOrgId() {
        return ownerRsrcOrgId;
    }

    /**
     * Sets the value of the ownerRsrcOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOwnerRsrcOrgId(JAXBElement<Long> value) {
        this.ownerRsrcOrgId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the sourceObjectCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceObjectCd() {
        return sourceObjectCd;
    }

    /**
     * Sets the value of the sourceObjectCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceObjectCd(JAXBElement<String> value) {
        this.sourceObjectCd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sourceObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSourceObjectId() {
        return sourceObjectId;
    }

    /**
     * Sets the value of the sourceObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSourceObjectId(JAXBElement<Long> value) {
        this.sourceObjectId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTemplateId(JAXBElement<Long> value) {
        this.templateId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the templateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTemplateFlag() {
        return templateFlag;
    }

    /**
     * Sets the value of the templateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTemplateFlag(JAXBElement<Boolean> value) {
        this.templateFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the plannedStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedStartDt() {
        return plannedStartDt;
    }

    /**
     * Sets the value of the plannedStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedStartDt(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedStartDt = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the plannedEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedEndDt() {
        return plannedEndDt;
    }

    /**
     * Sets the value of the plannedEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedEndDt(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedEndDt = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the plannedDurationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPlannedDurationNumber() {
        return plannedDurationNumber;
    }

    /**
     * Sets the value of the plannedDurationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPlannedDurationNumber(JAXBElement<BigDecimal> value) {
        this.plannedDurationNumber = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the plannedDurationUOMCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlannedDurationUOMCd() {
        return plannedDurationUOMCd;
    }

    /**
     * Sets the value of the plannedDurationUOMCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlannedDurationUOMCd(JAXBElement<String> value) {
        this.plannedDurationUOMCd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the apptAlarmTmMinimumNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getApptAlarmTmMinimumNumber() {
        return apptAlarmTmMinimumNumber;
    }

    /**
     * Sets the value of the apptAlarmTmMinimumNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setApptAlarmTmMinimumNumber(JAXBElement<Long> value) {
        this.apptAlarmTmMinimumNumber = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the alarmFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAlarmFlag() {
        return alarmFlag;
    }

    /**
     * Sets the value of the alarmFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAlarmFlag(JAXBElement<Boolean> value) {
        this.alarmFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCustomerId(JAXBElement<Long> value) {
        this.customerId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the referenceCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getReferenceCustomerId() {
        return referenceCustomerId;
    }

    /**
     * Sets the value of the referenceCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setReferenceCustomerId(JAXBElement<Long> value) {
        this.referenceCustomerId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the visibilityCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisibilityCd() {
        return visibilityCd;
    }

    /**
     * Sets the value of the visibilityCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisibilityCd(JAXBElement<String> value) {
        this.visibilityCd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the recurTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurTypeCd() {
        return recurTypeCd;
    }

    /**
     * Sets the value of the recurTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurTypeCd(JAXBElement<String> value) {
        this.recurTypeCd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the recurDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRecurDay() {
        return recurDay;
    }

    /**
     * Sets the value of the recurDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRecurDay(JAXBElement<Long> value) {
        this.recurDay = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the recurMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurMonth() {
        return recurMonth;
    }

    /**
     * Sets the value of the recurMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurMonth(JAXBElement<String> value) {
        this.recurMonth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the recurPattern property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurPattern() {
        return recurPattern;
    }

    /**
     * Sets the value of the recurPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurPattern(JAXBElement<String> value) {
        this.recurPattern = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the recurExceptionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRecurExceptionFlag() {
        return recurExceptionFlag;
    }

    /**
     * Sets the value of the recurExceptionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRecurExceptionFlag(JAXBElement<Boolean> value) {
        this.recurExceptionFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the recurWeekDayCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurWeekDayCd() {
        return recurWeekDayCd;
    }

    /**
     * Sets the value of the recurWeekDayCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurWeekDayCd(JAXBElement<String> value) {
        this.recurWeekDayCd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the recurWedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRecurWedFlag() {
        return recurWedFlag;
    }

    /**
     * Sets the value of the recurWedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRecurWedFlag(JAXBElement<Boolean> value) {
        this.recurWedFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the recurTueFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRecurTueFlag() {
        return recurTueFlag;
    }

    /**
     * Sets the value of the recurTueFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRecurTueFlag(JAXBElement<Boolean> value) {
        this.recurTueFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the recurThuFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRecurThuFlag() {
        return recurThuFlag;
    }

    /**
     * Sets the value of the recurThuFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRecurThuFlag(JAXBElement<Boolean> value) {
        this.recurThuFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the recurSunFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRecurSunFlag() {
        return recurSunFlag;
    }

    /**
     * Sets the value of the recurSunFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRecurSunFlag(JAXBElement<Boolean> value) {
        this.recurSunFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the recurSatFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRecurSatFlag() {
        return recurSatFlag;
    }

    /**
     * Sets the value of the recurSatFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRecurSatFlag(JAXBElement<Boolean> value) {
        this.recurSatFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the recurReplaceCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurReplaceCd() {
        return recurReplaceCd;
    }

    /**
     * Sets the value of the recurReplaceCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurReplaceCd(JAXBElement<String> value) {
        this.recurReplaceCd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the recurMonFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRecurMonFlag() {
        return recurMonFlag;
    }

    /**
     * Sets the value of the recurMonFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRecurMonFlag(JAXBElement<Boolean> value) {
        this.recurMonFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the recurFriFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRecurFriFlag() {
        return recurFriFlag;
    }

    /**
     * Sets the value of the recurFriFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRecurFriFlag(JAXBElement<Boolean> value) {
        this.recurFriFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the recurFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRecurFlag() {
        return recurFlag;
    }

    /**
     * Sets the value of the recurFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRecurFlag(JAXBElement<Boolean> value) {
        this.recurFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the recurOrigInstDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRecurOrigInstDt() {
        return recurOrigInstDt;
    }

    /**
     * Sets the value of the recurOrigInstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRecurOrigInstDt(JAXBElement<XMLGregorianCalendar> value) {
        this.recurOrigInstDt = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the recurOccursNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRecurOccursNumber() {
        return recurOccursNumber;
    }

    /**
     * Sets the value of the recurOccursNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRecurOccursNumber(JAXBElement<Long> value) {
        this.recurOccursNumber = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the recurFreqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRecurFreqNumber() {
        return recurFreqNumber;
    }

    /**
     * Sets the value of the recurFreqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRecurFreqNumber(JAXBElement<Long> value) {
        this.recurFreqNumber = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the recurEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRecurEndDt() {
        return recurEndDt;
    }

    /**
     * Sets the value of the recurEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRecurEndDt(JAXBElement<XMLGregorianCalendar> value) {
        this.recurEndDt = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the recurApptId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRecurApptId() {
        return recurApptId;
    }

    /**
     * Sets the value of the recurApptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRecurApptId(JAXBElement<Long> value) {
        this.recurApptId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponse(JAXBElement<String> value) {
        this.response = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the showTimeAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShowTimeAs() {
        return showTimeAs;
    }

    /**
     * Sets the value of the showTimeAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShowTimeAs(JAXBElement<String> value) {
        this.showTimeAs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the categoryCodeTransient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategoryCodeTransient() {
        return categoryCodeTransient;
    }

    /**
     * Sets the value of the categoryCodeTransient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategoryCodeTransient(JAXBElement<String> value) {
        this.categoryCodeTransient = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the allDayFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAllDayFlag() {
        return allDayFlag;
    }

    /**
     * Sets the value of the allDayFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAllDayFlag(JAXBElement<Boolean> value) {
        this.allDayFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the activityLocationTxt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActivityLocationTxt() {
        return activityLocationTxt;
    }

    /**
     * Sets the value of the activityLocationTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActivityLocationTxt(JAXBElement<String> value) {
        this.activityLocationTxt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyName(JAXBElement<String> value) {
        this.partyName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPartyId(JAXBElement<Long> value) {
        this.partyId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the partyName1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyName1() {
        return partyName1;
    }

    /**
     * Sets the value of the partyName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyName1(JAXBElement<String> value) {
        this.partyName1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyId1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPartyId1() {
        return partyId1;
    }

    /**
     * Sets the value of the partyId1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPartyId1(JAXBElement<Long> value) {
        this.partyId1 = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerName(JAXBElement<String> value) {
        this.customerName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwner(JAXBElement<String> value) {
        this.owner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conflictId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getConflictId() {
        return conflictId;
    }

    /**
     * Sets the value of the conflictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setConflictId(JAXBElement<Long> value) {
        this.conflictId = ((JAXBElement<Long> ) value);
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
     * Gets the value of the objectVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getObjectVersionNumber() {
        return objectVersionNumber;
    }

    /**
     * Sets the value of the objectVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setObjectVersionNumber(JAXBElement<Integer> value) {
        this.objectVersionNumber = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the editMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEditMode() {
        return editMode;
    }

    /**
     * Sets the value of the editMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEditMode(JAXBElement<String> value) {
        this.editMode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the referenceCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceCustomerName() {
        return referenceCustomerName;
    }

    /**
     * Sets the value of the referenceCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceCustomerName(JAXBElement<String> value) {
        this.referenceCustomerName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the categoryCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategoryCd() {
        return categoryCd;
    }

    /**
     * Sets the value of the categoryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategoryCd(JAXBElement<String> value) {
        this.categoryCd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the appointmentAssignee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointmentAssignee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointmentAssignee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransientAssignee }
     * 
     * 
     */
    public List<TransientAssignee> getAppointmentAssignee() {
        if (appointmentAssignee == null) {
            appointmentAssignee = new ArrayList<TransientAssignee>();
        }
        return this.appointmentAssignee;
    }

    /**
     * Gets the value of the appointmentContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointmentContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointmentContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransientContact }
     * 
     * 
     */
    public List<TransientContact> getAppointmentContact() {
        if (appointmentContact == null) {
            appointmentContact = new ArrayList<TransientContact>();
        }
        return this.appointmentContact;
    }

    /**
     * Gets the value of the appointmentNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointmentNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointmentNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransientNote }
     * 
     * 
     */
    public List<TransientNote> getAppointmentNote() {
        if (appointmentNote == null) {
            appointmentNote = new ArrayList<TransientNote>();
        }
        return this.appointmentNote;
    }

    /**
     * Gets the value of the transientCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transientCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransientCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransientCategory }
     * 
     * 
     */
    public List<TransientCategory> getTransientCategory() {
        if (transientCategory == null) {
            transientCategory = new ArrayList<TransientCategory>();
        }
        return this.transientCategory;
    }

}
