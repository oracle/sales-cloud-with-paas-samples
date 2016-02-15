
package com.oracle.xmlns.apps.crmcommon.activities.activitiesservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.crmcommon.activities.activitiesservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Appointment_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "appointment");
    private final static QName _TransientAppointment_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "transientAppointment");
    private final static QName _AppointmentDeleteException_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "appointmentDeleteException");
    private final static QName _TransientCategory_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "transientCategory");
    private final static QName _TransientContact_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "transientContact");
    private final static QName _ActivityCategory_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "activityCategory");
    private final static QName _TransientAssignee_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "transientAssignee");
    private final static QName _ActivityContact_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "activityContact");
    private final static QName _ActivityAssignee_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "activityAssignee");
    private final static QName _TransientNote_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "transientNote");
    private final static QName _TransientAssigneeAssigneeId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AssigneeId");
    private final static QName _TransientAssigneeActivityAssigneeId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityAssigneeId");
    private final static QName _TransientAssigneePartyName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PartyName");
    private final static QName _TransientAssigneeShowTimeAsCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ShowTimeAsCd");
    private final static QName _TransientAssigneeOwnerFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "OwnerFlag");
    private final static QName _TransientAssigneePartyId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PartyId");
    private final static QName _TransientAssigneeActivityId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityId");
    private final static QName _TransientAssigneeAppointmentResponseCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AppointmentResponseCd");
    private final static QName _TransientAssigneeAssigneeRsrcOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AssigneeRsrcOrgId");
    private final static QName _TransientAppointmentPartyName1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PartyName1");
    private final static QName _TransientAppointmentRecurExceptionFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurExceptionFlag");
    private final static QName _TransientAppointmentPlannedDurationUOMCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PlannedDurationUOMCd");
    private final static QName _TransientAppointmentOwnerId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "OwnerId");
    private final static QName _TransientAppointmentActivityLocationTxt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityLocationTxt");
    private final static QName _TransientAppointmentRecurOrigInstDt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurOrigInstDt");
    private final static QName _TransientAppointmentRecurFreqNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurFreqNumber");
    private final static QName _TransientAppointmentAllDayFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AllDayFlag");
    private final static QName _TransientAppointmentAsgnDenormFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AsgnDenormFlag");
    private final static QName _TransientAppointmentSourceObjectId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "SourceObjectId");
    private final static QName _TransientAppointmentRecurSunFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurSunFlag");
    private final static QName _TransientAppointmentRecurMonth_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurMonth");
    private final static QName _TransientAppointmentRecurApptId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurApptId");
    private final static QName _TransientAppointmentAsgnSystemFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AsgnSystemFlag");
    private final static QName _TransientAppointmentPlannedEndDt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PlannedEndDt");
    private final static QName _TransientAppointmentRecurSatFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurSatFlag");
    private final static QName _TransientAppointmentConflictId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ConflictId");
    private final static QName _TransientAppointmentCreationDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "CreationDate");
    private final static QName _TransientAppointmentResponse_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "Response");
    private final static QName _TransientAppointmentLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "LastUpdateLogin");
    private final static QName _TransientAppointmentActivityDescription_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityDescription");
    private final static QName _TransientAppointmentShowTimeAs_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ShowTimeAs");
    private final static QName _TransientAppointmentOwner_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "Owner");
    private final static QName _TransientAppointmentRecurWeekDayCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurWeekDayCd");
    private final static QName _TransientAppointmentRecurPattern_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurPattern");
    private final static QName _TransientAppointmentVisibilityCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "VisibilityCd");
    private final static QName _TransientAppointmentCreatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "CreatedBy");
    private final static QName _TransientAppointmentRecurTueFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurTueFlag");
    private final static QName _TransientAppointmentRecurThuFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurThuFlag");
    private final static QName _TransientAppointmentRecurEndDt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurEndDt");
    private final static QName _TransientAppointmentAlarmFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AlarmFlag");
    private final static QName _TransientAppointmentRecurTypeCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurTypeCd");
    private final static QName _TransientAppointmentAsgnManualFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AsgnManualFlag");
    private final static QName _TransientAppointmentRecurFriFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurFriFlag");
    private final static QName _TransientAppointmentRecurWedFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurWedFlag");
    private final static QName _TransientAppointmentRecurReplaceCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurReplaceCd");
    private final static QName _TransientAppointmentRecurMonFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurMonFlag");
    private final static QName _TransientAppointmentCategoryCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "CategoryCd");
    private final static QName _TransientAppointmentLockAsgnFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "LockAsgnFlag");
    private final static QName _TransientAppointmentLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "LastUpdateDate");
    private final static QName _TransientAppointmentCustomerId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "CustomerId");
    private final static QName _TransientAppointmentApptAlarmTmMinimumNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ApptAlarmTmMinimumNumber");
    private final static QName _TransientAppointmentTemplateFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "TemplateFlag");
    private final static QName _TransientAppointmentPlannedDurationNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PlannedDurationNumber");
    private final static QName _TransientAppointmentRecurOccursNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurOccursNumber");
    private final static QName _TransientAppointmentRecurFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurFlag");
    private final static QName _TransientAppointmentObjectVersionNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ObjectVersionNumber");
    private final static QName _TransientAppointmentDoNotRouteFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "DoNotRouteFlag");
    private final static QName _TransientAppointmentTemplateId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "TemplateId");
    private final static QName _TransientAppointmentCustomerName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "CustomerName");
    private final static QName _TransientAppointmentPlannedStartDt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PlannedStartDt");
    private final static QName _TransientAppointmentLastUpdatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "LastUpdatedBy");
    private final static QName _TransientAppointmentReferenceCustomerName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ReferenceCustomerName");
    private final static QName _TransientAppointmentPartyId1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PartyId1");
    private final static QName _TransientAppointmentActivityName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityName");
    private final static QName _TransientAppointmentSourceObjectCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "SourceObjectCd");
    private final static QName _TransientAppointmentReferenceCustomerId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ReferenceCustomerId");
    private final static QName _TransientAppointmentRecurDay_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurDay");
    private final static QName _TransientAppointmentEditMode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "EditMode");
    private final static QName _TransientAppointmentCategoryCodeTransient_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "CategoryCodeTransient");
    private final static QName _TransientAppointmentOwnerRsrcOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "OwnerRsrcOrgId");
    private final static QName _ActivityAssigneeReminderPeriod_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ReminderPeriod");
    private final static QName _TransientNoteNoteTxt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "NoteTxt");
    private final static QName _TransientNoteNoteTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "NoteTypeCode");
    private final static QName _TransientNoteNoteId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "NoteId");
    private final static QName _TransientNoteSourceObjectCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "SourceObjectCode");
    private final static QName _TransientNoteVisibilityCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "VisibilityCode");
    private final static QName _TransientCategoryActivityCategoryId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityCategoryId");
    private final static QName _TransientContactActivityContactId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityContactId");
    private final static QName _TransientContactPersonTitle_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PersonTitle");
    private final static QName _TransientContactPersonLastName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PersonLastName");
    private final static QName _TransientContactContactId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ContactId");
    private final static QName _TransientContactPersonFirstName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PersonFirstName");
    private final static QName _TransientContactContactRelationshipId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ContactRelationshipId");
    private final static QName _TransientContactPartyType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PartyType");
    private final static QName _TransientContactPersonMiddleName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PersonMiddleName");
    private final static QName _AppointmentDeleteExceptionUserLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "UserLastUpdateDate");
    private final static QName _AppointmentSourceCodeTransient_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "SourceCodeTransient");
    private final static QName _AppointmentActivityPriorityCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityPriorityCd");
    private final static QName _AppointmentRecurOccursNum_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurOccursNum");
    private final static QName _AppointmentActivityStatusCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityStatusCd");
    private final static QName _AppointmentRecurEveryOptionCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurEveryOptionCd");
    private final static QName _AppointmentRecurWeekdayFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurWeekdayFlag");
    private final static QName _AppointmentUpdatedCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "UpdatedCd");
    private final static QName _AppointmentMobileActivityId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "MobileActivityId");
    private final static QName _AppointmentRecurFreqNum_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurFreqNum");
    private final static QName _AppointmentAsgnDt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AsgnDt");
    private final static QName _AppointmentApptAlarmTmMinNum_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ApptAlarmTmMinNum");
    private final static QName _AppointmentOutlookGuid_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "OutlookGuid");
    private final static QName _AppointmentPlannedDurationNum_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PlannedDurationNum");
    private final static QName _AppointmentPlannedDurationUomCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PlannedDurationUomCd");
    private final static QName _AppointmentActivityDesc_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityDesc");
    private final static QName _AppointmentOutlookApptFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "OutlookApptFlag");
    private final static QName _AppointmentAsgnSysFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AsgnSysFlag");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.crmcommon.activities.activitiesservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransientAppointment }
     * 
     */
    public TransientAppointment createTransientAppointment() {
        return new TransientAppointment();
    }

    /**
     * Create an instance of {@link ActivityCategory }
     * 
     */
    public ActivityCategory createActivityCategory() {
        return new ActivityCategory();
    }

    /**
     * Create an instance of {@link ActivityContact }
     * 
     */
    public ActivityContact createActivityContact() {
        return new ActivityContact();
    }

    /**
     * Create an instance of {@link ActivityAssignee }
     * 
     */
    public ActivityAssignee createActivityAssignee() {
        return new ActivityAssignee();
    }

    /**
     * Create an instance of {@link AppointmentDeleteException }
     * 
     */
    public AppointmentDeleteException createAppointmentDeleteException() {
        return new AppointmentDeleteException();
    }

    /**
     * Create an instance of {@link TransientCategory }
     * 
     */
    public TransientCategory createTransientCategory() {
        return new TransientCategory();
    }

    /**
     * Create an instance of {@link TransientNote }
     * 
     */
    public TransientNote createTransientNote() {
        return new TransientNote();
    }

    /**
     * Create an instance of {@link TransientAssignee }
     * 
     */
    public TransientAssignee createTransientAssignee() {
        return new TransientAssignee();
    }

    /**
     * Create an instance of {@link Appointment }
     * 
     */
    public Appointment createAppointment() {
        return new Appointment();
    }

    /**
     * Create an instance of {@link TransientContact }
     * 
     */
    public TransientContact createTransientContact() {
        return new TransientContact();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Appointment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "appointment")
    public JAXBElement<Appointment> createAppointment(Appointment value) {
        return new JAXBElement<Appointment>(_Appointment_QNAME, Appointment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransientAppointment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "transientAppointment")
    public JAXBElement<TransientAppointment> createTransientAppointment(TransientAppointment value) {
        return new JAXBElement<TransientAppointment>(_TransientAppointment_QNAME, TransientAppointment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppointmentDeleteException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "appointmentDeleteException")
    public JAXBElement<AppointmentDeleteException> createAppointmentDeleteException(AppointmentDeleteException value) {
        return new JAXBElement<AppointmentDeleteException>(_AppointmentDeleteException_QNAME, AppointmentDeleteException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransientCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "transientCategory")
    public JAXBElement<TransientCategory> createTransientCategory(TransientCategory value) {
        return new JAXBElement<TransientCategory>(_TransientCategory_QNAME, TransientCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransientContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "transientContact")
    public JAXBElement<TransientContact> createTransientContact(TransientContact value) {
        return new JAXBElement<TransientContact>(_TransientContact_QNAME, TransientContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "activityCategory")
    public JAXBElement<ActivityCategory> createActivityCategory(ActivityCategory value) {
        return new JAXBElement<ActivityCategory>(_ActivityCategory_QNAME, ActivityCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransientAssignee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "transientAssignee")
    public JAXBElement<TransientAssignee> createTransientAssignee(TransientAssignee value) {
        return new JAXBElement<TransientAssignee>(_TransientAssignee_QNAME, TransientAssignee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "activityContact")
    public JAXBElement<ActivityContact> createActivityContact(ActivityContact value) {
        return new JAXBElement<ActivityContact>(_ActivityContact_QNAME, ActivityContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityAssignee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "activityAssignee")
    public JAXBElement<ActivityAssignee> createActivityAssignee(ActivityAssignee value) {
        return new JAXBElement<ActivityAssignee>(_ActivityAssignee_QNAME, ActivityAssignee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransientNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "transientNote")
    public JAXBElement<TransientNote> createTransientNote(TransientNote value) {
        return new JAXBElement<TransientNote>(_TransientNote_QNAME, TransientNote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AssigneeId", scope = TransientAssignee.class)
    public JAXBElement<Long> createTransientAssigneeAssigneeId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneeAssigneeId_QNAME, Long.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityAssigneeId", scope = TransientAssignee.class)
    public JAXBElement<Long> createTransientAssigneeActivityAssigneeId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneeActivityAssigneeId_QNAME, Long.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyName", scope = TransientAssignee.class)
    public JAXBElement<String> createTransientAssigneePartyName(String value) {
        return new JAXBElement<String>(_TransientAssigneePartyName_QNAME, String.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ShowTimeAsCd", scope = TransientAssignee.class)
    public JAXBElement<String> createTransientAssigneeShowTimeAsCd(String value) {
        return new JAXBElement<String>(_TransientAssigneeShowTimeAsCd_QNAME, String.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "OwnerFlag", scope = TransientAssignee.class)
    public JAXBElement<Boolean> createTransientAssigneeOwnerFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAssigneeOwnerFlag_QNAME, Boolean.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyId", scope = TransientAssignee.class)
    public JAXBElement<Long> createTransientAssigneePartyId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneePartyId_QNAME, Long.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityId", scope = TransientAssignee.class)
    public JAXBElement<Long> createTransientAssigneeActivityId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneeActivityId_QNAME, Long.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AppointmentResponseCd", scope = TransientAssignee.class, defaultValue = "NOT_RESPONDED")
    public JAXBElement<String> createTransientAssigneeAppointmentResponseCd(String value) {
        return new JAXBElement<String>(_TransientAssigneeAppointmentResponseCd_QNAME, String.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AssigneeRsrcOrgId", scope = TransientAssignee.class)
    public JAXBElement<Long> createTransientAssigneeAssigneeRsrcOrgId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneeAssigneeRsrcOrgId_QNAME, Long.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyName1", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentPartyName1(String value) {
        return new JAXBElement<String>(_TransientAppointmentPartyName1_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurExceptionFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurExceptionFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurExceptionFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PlannedDurationUOMCd", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentPlannedDurationUOMCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentPlannedDurationUOMCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "OwnerId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentOwnerId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentOwnerId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentPartyId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneePartyId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentActivityId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneeActivityId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityLocationTxt", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentActivityLocationTxt(String value) {
        return new JAXBElement<String>(_TransientAppointmentActivityLocationTxt_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurOrigInstDt", scope = TransientAppointment.class)
    public JAXBElement<XMLGregorianCalendar> createTransientAppointmentRecurOrigInstDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentRecurOrigInstDt_QNAME, XMLGregorianCalendar.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurFreqNumber", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentRecurFreqNumber(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentRecurFreqNumber_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AllDayFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentAllDayFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentAllDayFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AsgnDenormFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentAsgnDenormFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentAsgnDenormFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "SourceObjectId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentSourceObjectId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentSourceObjectId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurSunFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurSunFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurSunFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurMonth", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentRecurMonth(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurMonth_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurApptId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentRecurApptId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentRecurApptId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AsgnSystemFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentAsgnSystemFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentAsgnSystemFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PlannedEndDt", scope = TransientAppointment.class)
    public JAXBElement<XMLGregorianCalendar> createTransientAppointmentPlannedEndDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentPlannedEndDt_QNAME, XMLGregorianCalendar.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurSatFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurSatFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurSatFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ConflictId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentConflictId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentConflictId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CreationDate", scope = TransientAppointment.class)
    public JAXBElement<XMLGregorianCalendar> createTransientAppointmentCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentCreationDate_QNAME, XMLGregorianCalendar.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "Response", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentResponse(String value) {
        return new JAXBElement<String>(_TransientAppointmentResponse_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "LastUpdateLogin", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentLastUpdateLogin(String value) {
        return new JAXBElement<String>(_TransientAppointmentLastUpdateLogin_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityDescription", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentActivityDescription(String value) {
        return new JAXBElement<String>(_TransientAppointmentActivityDescription_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ShowTimeAs", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentShowTimeAs(String value) {
        return new JAXBElement<String>(_TransientAppointmentShowTimeAs_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "Owner", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentOwner(String value) {
        return new JAXBElement<String>(_TransientAppointmentOwner_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurWeekDayCd", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentRecurWeekDayCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurWeekDayCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurPattern", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentRecurPattern(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurPattern_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "VisibilityCd", scope = TransientAppointment.class, defaultValue = "INTERNAL PARTICIPANT ONLY")
    public JAXBElement<String> createTransientAppointmentVisibilityCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentVisibilityCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CreatedBy", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentCreatedBy(String value) {
        return new JAXBElement<String>(_TransientAppointmentCreatedBy_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurTueFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurTueFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurTueFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurThuFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurThuFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurThuFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurEndDt", scope = TransientAppointment.class)
    public JAXBElement<XMLGregorianCalendar> createTransientAppointmentRecurEndDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentRecurEndDt_QNAME, XMLGregorianCalendar.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AlarmFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentAlarmFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentAlarmFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurTypeCd", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentRecurTypeCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurTypeCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AsgnManualFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentAsgnManualFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentAsgnManualFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyName", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentPartyName(String value) {
        return new JAXBElement<String>(_TransientAssigneePartyName_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurFriFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurFriFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurFriFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurWedFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurWedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurWedFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurReplaceCd", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentRecurReplaceCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurReplaceCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurMonFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurMonFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurMonFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CategoryCd", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentCategoryCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentCategoryCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "LockAsgnFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentLockAsgnFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentLockAsgnFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "LastUpdateDate", scope = TransientAppointment.class)
    public JAXBElement<XMLGregorianCalendar> createTransientAppointmentLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentLastUpdateDate_QNAME, XMLGregorianCalendar.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CustomerId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentCustomerId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentCustomerId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ApptAlarmTmMinimumNumber", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentApptAlarmTmMinimumNumber(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentApptAlarmTmMinimumNumber_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "TemplateFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentTemplateFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentTemplateFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PlannedDurationNumber", scope = TransientAppointment.class)
    public JAXBElement<BigDecimal> createTransientAppointmentPlannedDurationNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TransientAppointmentPlannedDurationNumber_QNAME, BigDecimal.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurOccursNumber", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentRecurOccursNumber(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentRecurOccursNumber_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ObjectVersionNumber", scope = TransientAppointment.class)
    public JAXBElement<Integer> createTransientAppointmentObjectVersionNumber(Integer value) {
        return new JAXBElement<Integer>(_TransientAppointmentObjectVersionNumber_QNAME, Integer.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "DoNotRouteFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentDoNotRouteFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentDoNotRouteFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "TemplateId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentTemplateId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentTemplateId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CustomerName", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentCustomerName(String value) {
        return new JAXBElement<String>(_TransientAppointmentCustomerName_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PlannedStartDt", scope = TransientAppointment.class)
    public JAXBElement<XMLGregorianCalendar> createTransientAppointmentPlannedStartDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentPlannedStartDt_QNAME, XMLGregorianCalendar.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "LastUpdatedBy", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentLastUpdatedBy(String value) {
        return new JAXBElement<String>(_TransientAppointmentLastUpdatedBy_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ReferenceCustomerName", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentReferenceCustomerName(String value) {
        return new JAXBElement<String>(_TransientAppointmentReferenceCustomerName_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyId1", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentPartyId1(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentPartyId1_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityName", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentActivityName(String value) {
        return new JAXBElement<String>(_TransientAppointmentActivityName_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "SourceObjectCd", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentSourceObjectCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentSourceObjectCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ReferenceCustomerId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentReferenceCustomerId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentReferenceCustomerId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurDay", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentRecurDay(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentRecurDay_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "EditMode", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentEditMode(String value) {
        return new JAXBElement<String>(_TransientAppointmentEditMode_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CategoryCodeTransient", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentCategoryCodeTransient(String value) {
        return new JAXBElement<String>(_TransientAppointmentCategoryCodeTransient_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "OwnerRsrcOrgId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentOwnerRsrcOrgId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentOwnerRsrcOrgId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ReminderPeriod", scope = ActivityAssignee.class)
    public JAXBElement<Integer> createActivityAssigneeReminderPeriod(Integer value) {
        return new JAXBElement<Integer>(_ActivityAssigneeReminderPeriod_QNAME, Integer.class, ActivityAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ShowTimeAsCd", scope = ActivityAssignee.class)
    public JAXBElement<String> createActivityAssigneeShowTimeAsCd(String value) {
        return new JAXBElement<String>(_TransientAssigneeShowTimeAsCd_QNAME, String.class, ActivityAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AppointmentResponseCd", scope = ActivityAssignee.class)
    public JAXBElement<String> createActivityAssigneeAppointmentResponseCd(String value) {
        return new JAXBElement<String>(_TransientAssigneeAppointmentResponseCd_QNAME, String.class, ActivityAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AssigneeRsrcOrgId", scope = ActivityAssignee.class)
    public JAXBElement<Long> createActivityAssigneeAssigneeRsrcOrgId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneeAssigneeRsrcOrgId_QNAME, Long.class, ActivityAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "NoteTxt", scope = TransientNote.class)
    public JAXBElement<byte[]> createTransientNoteNoteTxt(byte[] value) {
        return new JAXBElement<byte[]>(_TransientNoteNoteTxt_QNAME, byte[].class, TransientNote.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "NoteTypeCode", scope = TransientNote.class)
    public JAXBElement<String> createTransientNoteNoteTypeCode(String value) {
        return new JAXBElement<String>(_TransientNoteNoteTypeCode_QNAME, String.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "NoteId", scope = TransientNote.class)
    public JAXBElement<Long> createTransientNoteNoteId(Long value) {
        return new JAXBElement<Long>(_TransientNoteNoteId_QNAME, Long.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyName", scope = TransientNote.class)
    public JAXBElement<String> createTransientNotePartyName(String value) {
        return new JAXBElement<String>(_TransientAssigneePartyName_QNAME, String.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyId", scope = TransientNote.class)
    public JAXBElement<String> createTransientNotePartyId(String value) {
        return new JAXBElement<String>(_TransientAssigneePartyId_QNAME, String.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "SourceObjectCode", scope = TransientNote.class)
    public JAXBElement<String> createTransientNoteSourceObjectCode(String value) {
        return new JAXBElement<String>(_TransientNoteSourceObjectCode_QNAME, String.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "VisibilityCode", scope = TransientNote.class)
    public JAXBElement<String> createTransientNoteVisibilityCode(String value) {
        return new JAXBElement<String>(_TransientNoteVisibilityCode_QNAME, String.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "SourceObjectId", scope = TransientNote.class)
    public JAXBElement<Long> createTransientNoteSourceObjectId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentSourceObjectId_QNAME, Long.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityCategoryId", scope = TransientCategory.class)
    public JAXBElement<Long> createTransientCategoryActivityCategoryId(Long value) {
        return new JAXBElement<Long>(_TransientCategoryActivityCategoryId_QNAME, Long.class, TransientCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CategoryCd", scope = TransientCategory.class)
    public JAXBElement<String> createTransientCategoryCategoryCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentCategoryCd_QNAME, String.class, TransientCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityId", scope = TransientCategory.class)
    public JAXBElement<Long> createTransientCategoryActivityId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneeActivityId_QNAME, Long.class, TransientCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityContactId", scope = TransientContact.class)
    public JAXBElement<Long> createTransientContactActivityContactId(Long value) {
        return new JAXBElement<Long>(_TransientContactActivityContactId_QNAME, Long.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PersonTitle", scope = TransientContact.class)
    public JAXBElement<String> createTransientContactPersonTitle(String value) {
        return new JAXBElement<String>(_TransientContactPersonTitle_QNAME, String.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PersonLastName", scope = TransientContact.class)
    public JAXBElement<String> createTransientContactPersonLastName(String value) {
        return new JAXBElement<String>(_TransientContactPersonLastName_QNAME, String.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ContactId", scope = TransientContact.class)
    public JAXBElement<Long> createTransientContactContactId(Long value) {
        return new JAXBElement<Long>(_TransientContactContactId_QNAME, Long.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyName", scope = TransientContact.class)
    public JAXBElement<String> createTransientContactPartyName(String value) {
        return new JAXBElement<String>(_TransientAssigneePartyName_QNAME, String.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyId", scope = TransientContact.class)
    public JAXBElement<Long> createTransientContactPartyId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneePartyId_QNAME, Long.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityId", scope = TransientContact.class)
    public JAXBElement<Long> createTransientContactActivityId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneeActivityId_QNAME, Long.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PersonFirstName", scope = TransientContact.class)
    public JAXBElement<String> createTransientContactPersonFirstName(String value) {
        return new JAXBElement<String>(_TransientContactPersonFirstName_QNAME, String.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ContactRelationshipId", scope = TransientContact.class)
    public JAXBElement<Long> createTransientContactContactRelationshipId(Long value) {
        return new JAXBElement<Long>(_TransientContactContactRelationshipId_QNAME, Long.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyType", scope = TransientContact.class)
    public JAXBElement<String> createTransientContactPartyType(String value) {
        return new JAXBElement<String>(_TransientContactPartyType_QNAME, String.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PersonMiddleName", scope = TransientContact.class)
    public JAXBElement<String> createTransientContactPersonMiddleName(String value) {
        return new JAXBElement<String>(_TransientContactPersonMiddleName_QNAME, String.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "LastUpdateLogin", scope = AppointmentDeleteException.class)
    public JAXBElement<String> createAppointmentDeleteExceptionLastUpdateLogin(String value) {
        return new JAXBElement<String>(_TransientAppointmentLastUpdateLogin_QNAME, String.class, AppointmentDeleteException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "UserLastUpdateDate", scope = AppointmentDeleteException.class)
    public JAXBElement<XMLGregorianCalendar> createAppointmentDeleteExceptionUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AppointmentDeleteExceptionUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, AppointmentDeleteException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurExceptionFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentRecurExceptionFlag(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurExceptionFlag_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "OwnerId", scope = Appointment.class)
    public JAXBElement<Long> createAppointmentOwnerId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentOwnerId_QNAME, Long.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityLocationTxt", scope = Appointment.class)
    public JAXBElement<String> createAppointmentActivityLocationTxt(String value) {
        return new JAXBElement<String>(_TransientAppointmentActivityLocationTxt_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurOrigInstDt", scope = Appointment.class)
    public JAXBElement<XMLGregorianCalendar> createAppointmentRecurOrigInstDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentRecurOrigInstDt_QNAME, XMLGregorianCalendar.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AllDayFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentAllDayFlag(String value) {
        return new JAXBElement<String>(_TransientAppointmentAllDayFlag_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AsgnDenormFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentAsgnDenormFlag(String value) {
        return new JAXBElement<String>(_TransientAppointmentAsgnDenormFlag_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "SourceObjectId", scope = Appointment.class)
    public JAXBElement<Long> createAppointmentSourceObjectId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentSourceObjectId_QNAME, Long.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "SourceCodeTransient", scope = Appointment.class)
    public JAXBElement<String> createAppointmentSourceCodeTransient(String value) {
        return new JAXBElement<String>(_AppointmentSourceCodeTransient_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurSunFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentRecurSunFlag(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurSunFlag_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurMonth", scope = Appointment.class)
    public JAXBElement<String> createAppointmentRecurMonth(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurMonth_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurApptId", scope = Appointment.class)
    public JAXBElement<Long> createAppointmentRecurApptId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentRecurApptId_QNAME, Long.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurSatFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentRecurSatFlag(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurSatFlag_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityPriorityCd", scope = Appointment.class)
    public JAXBElement<String> createAppointmentActivityPriorityCd(String value) {
        return new JAXBElement<String>(_AppointmentActivityPriorityCd_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "Response", scope = Appointment.class)
    public JAXBElement<String> createAppointmentResponse(String value) {
        return new JAXBElement<String>(_TransientAppointmentResponse_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "LastUpdateLogin", scope = Appointment.class)
    public JAXBElement<String> createAppointmentLastUpdateLogin(String value) {
        return new JAXBElement<String>(_TransientAppointmentLastUpdateLogin_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ShowTimeAs", scope = Appointment.class)
    public JAXBElement<String> createAppointmentShowTimeAs(String value) {
        return new JAXBElement<String>(_TransientAppointmentShowTimeAs_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurOccursNum", scope = Appointment.class)
    public JAXBElement<Long> createAppointmentRecurOccursNum(Long value) {
        return new JAXBElement<Long>(_AppointmentRecurOccursNum_QNAME, Long.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityStatusCd", scope = Appointment.class)
    public JAXBElement<String> createAppointmentActivityStatusCd(String value) {
        return new JAXBElement<String>(_AppointmentActivityStatusCd_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurEveryOptionCd", scope = Appointment.class)
    public JAXBElement<String> createAppointmentRecurEveryOptionCd(String value) {
        return new JAXBElement<String>(_AppointmentRecurEveryOptionCd_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurPattern", scope = Appointment.class)
    public JAXBElement<String> createAppointmentRecurPattern(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurPattern_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "VisibilityCd", scope = Appointment.class)
    public JAXBElement<String> createAppointmentVisibilityCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentVisibilityCd_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurTueFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentRecurTueFlag(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurTueFlag_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "UserLastUpdateDate", scope = Appointment.class)
    public JAXBElement<XMLGregorianCalendar> createAppointmentUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AppointmentDeleteExceptionUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurThuFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentRecurThuFlag(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurThuFlag_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurEndDt", scope = Appointment.class)
    public JAXBElement<XMLGregorianCalendar> createAppointmentRecurEndDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentRecurEndDt_QNAME, XMLGregorianCalendar.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AlarmFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentAlarmFlag(String value) {
        return new JAXBElement<String>(_TransientAppointmentAlarmFlag_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurTypeCd", scope = Appointment.class)
    public JAXBElement<String> createAppointmentRecurTypeCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurTypeCd_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AsgnManualFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentAsgnManualFlag(String value) {
        return new JAXBElement<String>(_TransientAppointmentAsgnManualFlag_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurWeekdayFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentRecurWeekdayFlag(String value) {
        return new JAXBElement<String>(_AppointmentRecurWeekdayFlag_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurFriFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentRecurFriFlag(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurFriFlag_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurWedFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentRecurWedFlag(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurWedFlag_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurReplaceCd", scope = Appointment.class)
    public JAXBElement<String> createAppointmentRecurReplaceCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurReplaceCd_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurMonFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentRecurMonFlag(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurMonFlag_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CategoryCd", scope = Appointment.class)
    public JAXBElement<String> createAppointmentCategoryCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentCategoryCd_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "LockAsgnFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentLockAsgnFlag(String value) {
        return new JAXBElement<String>(_TransientAppointmentLockAsgnFlag_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "UpdatedCd", scope = Appointment.class)
    public JAXBElement<byte[]> createAppointmentUpdatedCd(byte[] value) {
        return new JAXBElement<byte[]>(_AppointmentUpdatedCd_QNAME, byte[].class, Appointment.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CustomerId", scope = Appointment.class)
    public JAXBElement<Long> createAppointmentCustomerId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentCustomerId_QNAME, Long.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "TemplateFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentTemplateFlag(String value) {
        return new JAXBElement<String>(_TransientAppointmentTemplateFlag_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "MobileActivityId", scope = Appointment.class)
    public JAXBElement<String> createAppointmentMobileActivityId(String value) {
        return new JAXBElement<String>(_AppointmentMobileActivityId_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurFreqNum", scope = Appointment.class)
    public JAXBElement<Long> createAppointmentRecurFreqNum(Long value) {
        return new JAXBElement<Long>(_AppointmentRecurFreqNum_QNAME, Long.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentRecurFlag(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurFlag_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "DoNotRouteFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentDoNotRouteFlag(String value) {
        return new JAXBElement<String>(_TransientAppointmentDoNotRouteFlag_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "TemplateId", scope = Appointment.class)
    public JAXBElement<Long> createAppointmentTemplateId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentTemplateId_QNAME, Long.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AsgnDt", scope = Appointment.class)
    public JAXBElement<XMLGregorianCalendar> createAppointmentAsgnDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AppointmentAsgnDt_QNAME, XMLGregorianCalendar.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ApptAlarmTmMinNum", scope = Appointment.class)
    public JAXBElement<Long> createAppointmentApptAlarmTmMinNum(Long value) {
        return new JAXBElement<Long>(_AppointmentApptAlarmTmMinNum_QNAME, Long.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "OutlookGuid", scope = Appointment.class)
    public JAXBElement<String> createAppointmentOutlookGuid(String value) {
        return new JAXBElement<String>(_AppointmentOutlookGuid_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PlannedDurationNum", scope = Appointment.class)
    public JAXBElement<BigDecimal> createAppointmentPlannedDurationNum(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AppointmentPlannedDurationNum_QNAME, BigDecimal.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PlannedDurationUomCd", scope = Appointment.class)
    public JAXBElement<String> createAppointmentPlannedDurationUomCd(String value) {
        return new JAXBElement<String>(_AppointmentPlannedDurationUomCd_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityDesc", scope = Appointment.class)
    public JAXBElement<String> createAppointmentActivityDesc(String value) {
        return new JAXBElement<String>(_AppointmentActivityDesc_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityName", scope = Appointment.class)
    public JAXBElement<String> createAppointmentActivityName(String value) {
        return new JAXBElement<String>(_TransientAppointmentActivityName_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "SourceObjectCd", scope = Appointment.class)
    public JAXBElement<String> createAppointmentSourceObjectCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentSourceObjectCd_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ReferenceCustomerId", scope = Appointment.class)
    public JAXBElement<Long> createAppointmentReferenceCustomerId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentReferenceCustomerId_QNAME, Long.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "OutlookApptFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentOutlookApptFlag(String value) {
        return new JAXBElement<String>(_AppointmentOutlookApptFlag_QNAME, String.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurDay", scope = Appointment.class)
    public JAXBElement<Long> createAppointmentRecurDay(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentRecurDay_QNAME, Long.class, Appointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AsgnSysFlag", scope = Appointment.class)
    public JAXBElement<String> createAppointmentAsgnSysFlag(String value) {
        return new JAXBElement<String>(_AppointmentAsgnSysFlag_QNAME, String.class, Appointment.class, value);
    }

}
