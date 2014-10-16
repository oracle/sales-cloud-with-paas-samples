
package com.oracle.xmlns.apps.crmcommon.activities.activitiesservice;

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
import com.oracle.xmlns.apps.crmcommon.notes.noteservice.Note;


/**
 * <p>Java class for Appointment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Appointment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ActivityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlannedStartDt" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="PlannedEndDt" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="PlannedDurationNum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PlannedDurationUomCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurWeekdayFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurWedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurTueFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TemplateFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurThuFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompletedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurSunFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurSatFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurReplaceCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurMonFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurFriFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlarmFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurOrigInstDt" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ApptAlarmTmMinNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RecurOccursNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RecurDay" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RecurFreqNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RecurMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurEndDt" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="RecurPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurApptId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RecurExceptionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllDayFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyId1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ActivityLocationTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityPriorityCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityStatusCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AsgnDenormFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AsgnDt" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="AsgnManualFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AsgnSysFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoNotRouteFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LockAsgnFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TemplateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ReferenceCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceObjectCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceObjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VisibilityCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceCodeTransient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Response" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShowTimeAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurEveryOptionCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdatedCd" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="MobileActivityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutlookGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutlookApptFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityAssignee" type="{http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/}ActivityAssignee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ActivityCategory" type="{http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/}ActivityCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ActivityContact" type="{http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/}ActivityContact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://xmlns.oracle.com/apps/crmCommon/notes/noteService}Note" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Appointment", propOrder = {
    "activityId",
    "ownerId",
    "customerId",
    "activityName",
    "plannedStartDt",
    "plannedEndDt",
    "plannedDurationNum",
    "plannedDurationUomCd",
    "recurFlag",
    "recurTypeCd",
    "recurWeekdayFlag",
    "recurWedFlag",
    "recurTueFlag",
    "templateFlag",
    "recurThuFlag",
    "completedFlag",
    "recurSunFlag",
    "recurSatFlag",
    "recurReplaceCd",
    "recurMonFlag",
    "recurFriFlag",
    "alarmFlag",
    "recurOrigInstDt",
    "apptAlarmTmMinNum",
    "recurOccursNum",
    "recurDay",
    "recurFreqNum",
    "recurMonth",
    "recurEndDt",
    "recurPattern",
    "recurApptId",
    "recurExceptionFlag",
    "allDayFlag",
    "partyName",
    "partyId",
    "partyName1",
    "partyId1",
    "activityLocationTxt",
    "activityDesc",
    "activityNumber",
    "activityPriorityCd",
    "activityStatusCd",
    "activityTypeCd",
    "conflictId",
    "createdBy",
    "creationDate",
    "lastUpdateDate",
    "lastUpdateLogin",
    "lastUpdatedBy",
    "objectVersionNumber",
    "asgnDenormFlag",
    "asgnDt",
    "asgnManualFlag",
    "asgnSysFlag",
    "doNotRouteFlag",
    "lockAsgnFlag",
    "templateId",
    "userLastUpdateDate",
    "referenceCustomerId",
    "sourceObjectCd",
    "sourceObjectId",
    "visibilityCd",
    "sourceCodeTransient",
    "response",
    "showTimeAs",
    "recurEveryOptionCd",
    "updatedCd",
    "mobileActivityId",
    "outlookGuid",
    "outlookApptFlag",
    "categoryCd",
    "activityAssignee",
    "activityCategory",
    "activityContact",
    "note"
})
public class Appointment {

    @XmlElement(name = "ActivityId")
    protected Long activityId;
    @XmlElementRef(name = "OwnerId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> ownerId;
    @XmlElementRef(name = "CustomerId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> customerId;
    @XmlElementRef(name = "ActivityName", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> activityName;
    @XmlElement(name = "PlannedStartDt")
    protected XMLGregorianCalendar plannedStartDt;
    @XmlElement(name = "PlannedEndDt")
    protected XMLGregorianCalendar plannedEndDt;
    @XmlElementRef(name = "PlannedDurationNum", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> plannedDurationNum;
    @XmlElementRef(name = "PlannedDurationUomCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> plannedDurationUomCd;
    @XmlElementRef(name = "RecurFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurFlag;
    @XmlElementRef(name = "RecurTypeCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurTypeCd;
    @XmlElementRef(name = "RecurWeekdayFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurWeekdayFlag;
    @XmlElementRef(name = "RecurWedFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurWedFlag;
    @XmlElementRef(name = "RecurTueFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurTueFlag;
    @XmlElementRef(name = "TemplateFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> templateFlag;
    @XmlElementRef(name = "RecurThuFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurThuFlag;
    @XmlElement(name = "CompletedFlag")
    protected String completedFlag;
    @XmlElementRef(name = "RecurSunFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurSunFlag;
    @XmlElementRef(name = "RecurSatFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurSatFlag;
    @XmlElementRef(name = "RecurReplaceCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurReplaceCd;
    @XmlElementRef(name = "RecurMonFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurMonFlag;
    @XmlElementRef(name = "RecurFriFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurFriFlag;
    @XmlElementRef(name = "AlarmFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> alarmFlag;
    @XmlElementRef(name = "RecurOrigInstDt", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> recurOrigInstDt;
    @XmlElementRef(name = "ApptAlarmTmMinNum", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> apptAlarmTmMinNum;
    @XmlElementRef(name = "RecurOccursNum", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> recurOccursNum;
    @XmlElementRef(name = "RecurDay", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> recurDay;
    @XmlElementRef(name = "RecurFreqNum", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> recurFreqNum;
    @XmlElementRef(name = "RecurMonth", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurMonth;
    @XmlElementRef(name = "RecurEndDt", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> recurEndDt;
    @XmlElementRef(name = "RecurPattern", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurPattern;
    @XmlElementRef(name = "RecurApptId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> recurApptId;
    @XmlElementRef(name = "RecurExceptionFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurExceptionFlag;
    @XmlElementRef(name = "AllDayFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> allDayFlag;
    @XmlElement(name = "PartyName")
    protected String partyName;
    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElement(name = "PartyName1")
    protected String partyName1;
    @XmlElement(name = "PartyId1")
    protected Long partyId1;
    @XmlElementRef(name = "ActivityLocationTxt", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> activityLocationTxt;
    @XmlElementRef(name = "ActivityDesc", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> activityDesc;
    @XmlElement(name = "ActivityNumber")
    protected String activityNumber;
    @XmlElementRef(name = "ActivityPriorityCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> activityPriorityCd;
    @XmlElementRef(name = "ActivityStatusCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> activityStatusCd;
    @XmlElement(name = "ActivityTypeCd")
    protected String activityTypeCd;
    @XmlElement(name = "ConflictId")
    protected Long conflictId;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "AsgnDenormFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> asgnDenormFlag;
    @XmlElementRef(name = "AsgnDt", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> asgnDt;
    @XmlElementRef(name = "AsgnManualFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> asgnManualFlag;
    @XmlElementRef(name = "AsgnSysFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> asgnSysFlag;
    @XmlElementRef(name = "DoNotRouteFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> doNotRouteFlag;
    @XmlElementRef(name = "LockAsgnFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> lockAsgnFlag;
    @XmlElementRef(name = "TemplateId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> templateId;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElementRef(name = "ReferenceCustomerId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> referenceCustomerId;
    @XmlElementRef(name = "SourceObjectCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> sourceObjectCd;
    @XmlElementRef(name = "SourceObjectId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> sourceObjectId;
    @XmlElementRef(name = "VisibilityCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> visibilityCd;
    @XmlElementRef(name = "SourceCodeTransient", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> sourceCodeTransient;
    @XmlElementRef(name = "Response", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> response;
    @XmlElementRef(name = "ShowTimeAs", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> showTimeAs;
    @XmlElementRef(name = "RecurEveryOptionCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> recurEveryOptionCd;
    @XmlElementRef(name = "UpdatedCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<byte[]> updatedCd;
    @XmlElementRef(name = "MobileActivityId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> mobileActivityId;
    @XmlElementRef(name = "OutlookGuid", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> outlookGuid;
    @XmlElementRef(name = "OutlookApptFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> outlookApptFlag;
    @XmlElementRef(name = "CategoryCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> categoryCd;
    @XmlElement(name = "ActivityAssignee")
    protected List<ActivityAssignee> activityAssignee;
    @XmlElement(name = "ActivityCategory")
    protected List<ActivityCategory> activityCategory;
    @XmlElement(name = "ActivityContact")
    protected List<ActivityContact> activityContact;
    @XmlElement(name = "Note")
    protected List<Note> note;

    /**
     * Gets the value of the activityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActivityId(Long value) {
        this.activityId = value;
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
     * Gets the value of the plannedStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedStartDt() {
        return plannedStartDt;
    }

    /**
     * Sets the value of the plannedStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedStartDt(XMLGregorianCalendar value) {
        this.plannedStartDt = value;
    }

    /**
     * Gets the value of the plannedEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedEndDt() {
        return plannedEndDt;
    }

    /**
     * Sets the value of the plannedEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedEndDt(XMLGregorianCalendar value) {
        this.plannedEndDt = value;
    }

    /**
     * Gets the value of the plannedDurationNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPlannedDurationNum() {
        return plannedDurationNum;
    }

    /**
     * Sets the value of the plannedDurationNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPlannedDurationNum(JAXBElement<BigDecimal> value) {
        this.plannedDurationNum = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the plannedDurationUomCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlannedDurationUomCd() {
        return plannedDurationUomCd;
    }

    /**
     * Sets the value of the plannedDurationUomCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlannedDurationUomCd(JAXBElement<String> value) {
        this.plannedDurationUomCd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the recurFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurFlag() {
        return recurFlag;
    }

    /**
     * Sets the value of the recurFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurFlag(JAXBElement<String> value) {
        this.recurFlag = ((JAXBElement<String> ) value);
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
     * Gets the value of the recurWeekdayFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurWeekdayFlag() {
        return recurWeekdayFlag;
    }

    /**
     * Sets the value of the recurWeekdayFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurWeekdayFlag(JAXBElement<String> value) {
        this.recurWeekdayFlag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the recurWedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurWedFlag() {
        return recurWedFlag;
    }

    /**
     * Sets the value of the recurWedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurWedFlag(JAXBElement<String> value) {
        this.recurWedFlag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the recurTueFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurTueFlag() {
        return recurTueFlag;
    }

    /**
     * Sets the value of the recurTueFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurTueFlag(JAXBElement<String> value) {
        this.recurTueFlag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the templateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTemplateFlag() {
        return templateFlag;
    }

    /**
     * Sets the value of the templateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTemplateFlag(JAXBElement<String> value) {
        this.templateFlag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the recurThuFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurThuFlag() {
        return recurThuFlag;
    }

    /**
     * Sets the value of the recurThuFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurThuFlag(JAXBElement<String> value) {
        this.recurThuFlag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the completedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletedFlag() {
        return completedFlag;
    }

    /**
     * Sets the value of the completedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletedFlag(String value) {
        this.completedFlag = value;
    }

    /**
     * Gets the value of the recurSunFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurSunFlag() {
        return recurSunFlag;
    }

    /**
     * Sets the value of the recurSunFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurSunFlag(JAXBElement<String> value) {
        this.recurSunFlag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the recurSatFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurSatFlag() {
        return recurSatFlag;
    }

    /**
     * Sets the value of the recurSatFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurSatFlag(JAXBElement<String> value) {
        this.recurSatFlag = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurMonFlag() {
        return recurMonFlag;
    }

    /**
     * Sets the value of the recurMonFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurMonFlag(JAXBElement<String> value) {
        this.recurMonFlag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the recurFriFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurFriFlag() {
        return recurFriFlag;
    }

    /**
     * Sets the value of the recurFriFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurFriFlag(JAXBElement<String> value) {
        this.recurFriFlag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the alarmFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlarmFlag() {
        return alarmFlag;
    }

    /**
     * Sets the value of the alarmFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlarmFlag(JAXBElement<String> value) {
        this.alarmFlag = ((JAXBElement<String> ) value);
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
     * Gets the value of the apptAlarmTmMinNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getApptAlarmTmMinNum() {
        return apptAlarmTmMinNum;
    }

    /**
     * Sets the value of the apptAlarmTmMinNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setApptAlarmTmMinNum(JAXBElement<Long> value) {
        this.apptAlarmTmMinNum = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the recurOccursNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRecurOccursNum() {
        return recurOccursNum;
    }

    /**
     * Sets the value of the recurOccursNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRecurOccursNum(JAXBElement<Long> value) {
        this.recurOccursNum = ((JAXBElement<Long> ) value);
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
     * Gets the value of the recurFreqNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRecurFreqNum() {
        return recurFreqNum;
    }

    /**
     * Sets the value of the recurFreqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRecurFreqNum(JAXBElement<Long> value) {
        this.recurFreqNum = ((JAXBElement<Long> ) value);
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
     * Gets the value of the recurExceptionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurExceptionFlag() {
        return recurExceptionFlag;
    }

    /**
     * Sets the value of the recurExceptionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurExceptionFlag(JAXBElement<String> value) {
        this.recurExceptionFlag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the allDayFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAllDayFlag() {
        return allDayFlag;
    }

    /**
     * Sets the value of the allDayFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAllDayFlag(JAXBElement<String> value) {
        this.allDayFlag = ((JAXBElement<String> ) value);
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
     * Gets the value of the partyName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName1() {
        return partyName1;
    }

    /**
     * Sets the value of the partyName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName1(String value) {
        this.partyName1 = value;
    }

    /**
     * Gets the value of the partyId1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartyId1() {
        return partyId1;
    }

    /**
     * Sets the value of the partyId1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartyId1(Long value) {
        this.partyId1 = value;
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
     * Gets the value of the activityDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActivityDesc() {
        return activityDesc;
    }

    /**
     * Sets the value of the activityDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActivityDesc(JAXBElement<String> value) {
        this.activityDesc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the activityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityNumber() {
        return activityNumber;
    }

    /**
     * Sets the value of the activityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityNumber(String value) {
        this.activityNumber = value;
    }

    /**
     * Gets the value of the activityPriorityCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActivityPriorityCd() {
        return activityPriorityCd;
    }

    /**
     * Sets the value of the activityPriorityCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActivityPriorityCd(JAXBElement<String> value) {
        this.activityPriorityCd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the activityStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActivityStatusCd() {
        return activityStatusCd;
    }

    /**
     * Sets the value of the activityStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActivityStatusCd(JAXBElement<String> value) {
        this.activityStatusCd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the activityTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityTypeCd() {
        return activityTypeCd;
    }

    /**
     * Sets the value of the activityTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityTypeCd(String value) {
        this.activityTypeCd = value;
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
     * Gets the value of the asgnDenormFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAsgnDenormFlag() {
        return asgnDenormFlag;
    }

    /**
     * Sets the value of the asgnDenormFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAsgnDenormFlag(JAXBElement<String> value) {
        this.asgnDenormFlag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the asgnDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAsgnDt() {
        return asgnDt;
    }

    /**
     * Sets the value of the asgnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAsgnDt(JAXBElement<XMLGregorianCalendar> value) {
        this.asgnDt = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the asgnManualFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAsgnManualFlag() {
        return asgnManualFlag;
    }

    /**
     * Sets the value of the asgnManualFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAsgnManualFlag(JAXBElement<String> value) {
        this.asgnManualFlag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the asgnSysFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAsgnSysFlag() {
        return asgnSysFlag;
    }

    /**
     * Sets the value of the asgnSysFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAsgnSysFlag(JAXBElement<String> value) {
        this.asgnSysFlag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the doNotRouteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoNotRouteFlag() {
        return doNotRouteFlag;
    }

    /**
     * Sets the value of the doNotRouteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoNotRouteFlag(JAXBElement<String> value) {
        this.doNotRouteFlag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lockAsgnFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLockAsgnFlag() {
        return lockAsgnFlag;
    }

    /**
     * Sets the value of the lockAsgnFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLockAsgnFlag(JAXBElement<String> value) {
        this.lockAsgnFlag = ((JAXBElement<String> ) value);
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
     * Gets the value of the sourceCodeTransient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceCodeTransient() {
        return sourceCodeTransient;
    }

    /**
     * Sets the value of the sourceCodeTransient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceCodeTransient(JAXBElement<String> value) {
        this.sourceCodeTransient = ((JAXBElement<String> ) value);
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
     * Gets the value of the recurEveryOptionCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurEveryOptionCd() {
        return recurEveryOptionCd;
    }

    /**
     * Sets the value of the recurEveryOptionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurEveryOptionCd(JAXBElement<String> value) {
        this.recurEveryOptionCd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the updatedCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getUpdatedCd() {
        return updatedCd;
    }

    /**
     * Sets the value of the updatedCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setUpdatedCd(JAXBElement<byte[]> value) {
        this.updatedCd = ((JAXBElement<byte[]> ) value);
    }

    /**
     * Gets the value of the mobileActivityId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileActivityId() {
        return mobileActivityId;
    }

    /**
     * Sets the value of the mobileActivityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileActivityId(JAXBElement<String> value) {
        this.mobileActivityId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the outlookGuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutlookGuid() {
        return outlookGuid;
    }

    /**
     * Sets the value of the outlookGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutlookGuid(JAXBElement<String> value) {
        this.outlookGuid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the outlookApptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutlookApptFlag() {
        return outlookApptFlag;
    }

    /**
     * Sets the value of the outlookApptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutlookApptFlag(JAXBElement<String> value) {
        this.outlookApptFlag = ((JAXBElement<String> ) value);
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
     * Gets the value of the activityAssignee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityAssignee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityAssignee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityAssignee }
     * 
     * 
     */
    public List<ActivityAssignee> getActivityAssignee() {
        if (activityAssignee == null) {
            activityAssignee = new ArrayList<ActivityAssignee>();
        }
        return this.activityAssignee;
    }

    /**
     * Gets the value of the activityCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityCategory }
     * 
     * 
     */
    public List<ActivityCategory> getActivityCategory() {
        if (activityCategory == null) {
            activityCategory = new ArrayList<ActivityCategory>();
        }
        return this.activityCategory;
    }

    /**
     * Gets the value of the activityContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityContact }
     * 
     * 
     */
    public List<ActivityContact> getActivityContact() {
        if (activityContact == null) {
            activityContact = new ArrayList<ActivityContact>();
        }
        return this.activityContact;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNote() {
        if (note == null) {
            note = new ArrayList<Note>();
        }
        return this.note;
    }

}
