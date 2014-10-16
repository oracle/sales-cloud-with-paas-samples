
package com.oracle.xmlns.apps.cdm.foundation.parties.contactpointservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cdm.foundation.parties.contactpointservice package. 
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

    private final static QName _Email_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "email");
    private final static QName _Eft_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "eft");
    private final static QName _Phone_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "phone");
    private final static QName _Web_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "web");
    private final static QName _InstantMessaging_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "instantMessaging");
    private final static QName _ContactPreference_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "contactPreference");
    private final static QName _Telex_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "telex");
    private final static QName _EftRequestId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "RequestId");
    private final static QName _EftOrigSystemReference_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "OrigSystemReference");
    private final static QName _EftPartyUsageCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "PartyUsageCode");
    private final static QName _EftEFTUserNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "EFTUserNumber");
    private final static QName _EftEFTSWIFTCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "EFTSWIFTCode");
    private final static QName _EftLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "LastUpdateLogin");
    private final static QName _EftCreatedByModule_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "CreatedByModule");
    private final static QName _EftContactPointPurpose_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "ContactPointPurpose");
    private final static QName _EftEFTTransmissionProgramId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "EFTTransmissionProgramId");
    private final static QName _EftOrigSystem_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "OrigSystem");
    private final static QName _EftPrimaryByPurpose_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "PrimaryByPurpose");
    private final static QName _EftEFTPrintingProgramId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "EFTPrintingProgramId");
    private final static QName _EftRelationshipId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "RelationshipId");
    private final static QName _WebPartyName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "PartyName");
    private final static QName _PhonePhoneCountryCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "PhoneCountryCode");
    private final static QName _PhonePagerTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "PagerTypeCode");
    private final static QName _PhonePhoneAreaCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "PhoneAreaCode");
    private final static QName _PhoneTransposedPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "TransposedPhoneNumber");
    private final static QName _PhoneTimezoneCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "TimezoneCode");
    private final static QName _PhonePhoneCallingCalendar_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "PhoneCallingCalendar");
    private final static QName _PhonePhoneExtension_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "PhoneExtension");
    private final static QName _PhonePhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "PhoneNumber");
    private final static QName _PhoneLastContactDtTime_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "LastContactDtTime");
    private final static QName _PhoneFormattedPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "FormattedPhoneNumber");
    private final static QName _PhoneRawPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "RawPhoneNumber");
    private final static QName _ContactPreferencePreferenceTopicTypeId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "PreferenceTopicTypeId");
    private final static QName _ContactPreferenceMaximumNoOfInteractions_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "MaximumNoOfInteractions");
    private final static QName _ContactPreferencePreferenceTopicTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "PreferenceTopicTypeCode");
    private final static QName _ContactPreferencePreferenceTopicType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "PreferenceTopicType");
    private final static QName _ContactPreferencePreferenceStartTimeHR_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "PreferenceStartTimeHR");
    private final static QName _ContactPreferencePreferenceStartTimeMi_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "PreferenceStartTimeMi");
    private final static QName _ContactPreferencePreferenceEndDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "PreferenceEndDate");
    private final static QName _ContactPreferenceReasonCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "ReasonCode");
    private final static QName _ContactPreferencePreferenceEndTimeHR_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "PreferenceEndTimeHR");
    private final static QName _ContactPreferencePreferenceEndTimeMi_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "PreferenceEndTimeMi");
    private final static QName _ContactPreferenceMaximumNoOfInteractUOMCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", "MaximumNoOfInteractUOMCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cdm.foundation.parties.contactpointservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Phone }
     * 
     */
    public Phone createPhone() {
        return new Phone();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link Telex }
     * 
     */
    public Telex createTelex() {
        return new Telex();
    }

    /**
     * Create an instance of {@link Eft }
     * 
     */
    public Eft createEft() {
        return new Eft();
    }

    /**
     * Create an instance of {@link Web }
     * 
     */
    public Web createWeb() {
        return new Web();
    }

    /**
     * Create an instance of {@link InstantMessaging }
     * 
     */
    public InstantMessaging createInstantMessaging() {
        return new InstantMessaging();
    }

    /**
     * Create an instance of {@link ContactPreference }
     * 
     */
    public ContactPreference createContactPreference() {
        return new ContactPreference();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Email }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "email")
    public JAXBElement<Email> createEmail(Email value) {
        return new JAXBElement<Email>(_Email_QNAME, Email.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eft }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "eft")
    public JAXBElement<Eft> createEft(Eft value) {
        return new JAXBElement<Eft>(_Eft_QNAME, Eft.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Phone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "phone")
    public JAXBElement<Phone> createPhone(Phone value) {
        return new JAXBElement<Phone>(_Phone_QNAME, Phone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Web }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "web")
    public JAXBElement<Web> createWeb(Web value) {
        return new JAXBElement<Web>(_Web_QNAME, Web.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstantMessaging }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "instantMessaging")
    public JAXBElement<InstantMessaging> createInstantMessaging(InstantMessaging value) {
        return new JAXBElement<InstantMessaging>(_InstantMessaging_QNAME, InstantMessaging.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactPreference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "contactPreference")
    public JAXBElement<ContactPreference> createContactPreference(ContactPreference value) {
        return new JAXBElement<ContactPreference>(_ContactPreference_QNAME, ContactPreference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Telex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "telex")
    public JAXBElement<Telex> createTelex(Telex value) {
        return new JAXBElement<Telex>(_Telex_QNAME, Telex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "RequestId", scope = Eft.class)
    public JAXBElement<Long> createEftRequestId(Long value) {
        return new JAXBElement<Long>(_EftRequestId_QNAME, Long.class, Eft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "OrigSystemReference", scope = Eft.class)
    public JAXBElement<String> createEftOrigSystemReference(String value) {
        return new JAXBElement<String>(_EftOrigSystemReference_QNAME, String.class, Eft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PartyUsageCode", scope = Eft.class)
    public JAXBElement<String> createEftPartyUsageCode(String value) {
        return new JAXBElement<String>(_EftPartyUsageCode_QNAME, String.class, Eft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "EFTUserNumber", scope = Eft.class)
    public JAXBElement<String> createEftEFTUserNumber(String value) {
        return new JAXBElement<String>(_EftEFTUserNumber_QNAME, String.class, Eft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "EFTSWIFTCode", scope = Eft.class)
    public JAXBElement<String> createEftEFTSWIFTCode(String value) {
        return new JAXBElement<String>(_EftEFTSWIFTCode_QNAME, String.class, Eft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "LastUpdateLogin", scope = Eft.class)
    public JAXBElement<String> createEftLastUpdateLogin(String value) {
        return new JAXBElement<String>(_EftLastUpdateLogin_QNAME, String.class, Eft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "CreatedByModule", scope = Eft.class)
    public JAXBElement<String> createEftCreatedByModule(String value) {
        return new JAXBElement<String>(_EftCreatedByModule_QNAME, String.class, Eft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "ContactPointPurpose", scope = Eft.class)
    public JAXBElement<String> createEftContactPointPurpose(String value) {
        return new JAXBElement<String>(_EftContactPointPurpose_QNAME, String.class, Eft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "EFTTransmissionProgramId", scope = Eft.class)
    public JAXBElement<Long> createEftEFTTransmissionProgramId(Long value) {
        return new JAXBElement<Long>(_EftEFTTransmissionProgramId_QNAME, Long.class, Eft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "OrigSystem", scope = Eft.class)
    public JAXBElement<String> createEftOrigSystem(String value) {
        return new JAXBElement<String>(_EftOrigSystem_QNAME, String.class, Eft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PrimaryByPurpose", scope = Eft.class)
    public JAXBElement<String> createEftPrimaryByPurpose(String value) {
        return new JAXBElement<String>(_EftPrimaryByPurpose_QNAME, String.class, Eft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "EFTPrintingProgramId", scope = Eft.class)
    public JAXBElement<Long> createEftEFTPrintingProgramId(Long value) {
        return new JAXBElement<Long>(_EftEFTPrintingProgramId_QNAME, Long.class, Eft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "RelationshipId", scope = Eft.class)
    public JAXBElement<Long> createEftRelationshipId(Long value) {
        return new JAXBElement<Long>(_EftRelationshipId_QNAME, Long.class, Eft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "LastUpdateLogin", scope = Web.class)
    public JAXBElement<String> createWebLastUpdateLogin(String value) {
        return new JAXBElement<String>(_EftLastUpdateLogin_QNAME, String.class, Web.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "RequestId", scope = Web.class)
    public JAXBElement<Long> createWebRequestId(Long value) {
        return new JAXBElement<Long>(_EftRequestId_QNAME, Long.class, Web.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "ContactPointPurpose", scope = Web.class)
    public JAXBElement<String> createWebContactPointPurpose(String value) {
        return new JAXBElement<String>(_EftContactPointPurpose_QNAME, String.class, Web.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "CreatedByModule", scope = Web.class)
    public JAXBElement<String> createWebCreatedByModule(String value) {
        return new JAXBElement<String>(_EftCreatedByModule_QNAME, String.class, Web.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "OrigSystem", scope = Web.class)
    public JAXBElement<String> createWebOrigSystem(String value) {
        return new JAXBElement<String>(_EftOrigSystem_QNAME, String.class, Web.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "OrigSystemReference", scope = Web.class)
    public JAXBElement<String> createWebOrigSystemReference(String value) {
        return new JAXBElement<String>(_EftOrigSystemReference_QNAME, String.class, Web.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PartyUsageCode", scope = Web.class)
    public JAXBElement<String> createWebPartyUsageCode(String value) {
        return new JAXBElement<String>(_EftPartyUsageCode_QNAME, String.class, Web.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PrimaryByPurpose", scope = Web.class)
    public JAXBElement<String> createWebPrimaryByPurpose(String value) {
        return new JAXBElement<String>(_EftPrimaryByPurpose_QNAME, String.class, Web.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PartyName", scope = Web.class)
    public JAXBElement<String> createWebPartyName(String value) {
        return new JAXBElement<String>(_WebPartyName_QNAME, String.class, Web.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "RelationshipId", scope = Web.class)
    public JAXBElement<Long> createWebRelationshipId(Long value) {
        return new JAXBElement<Long>(_EftRelationshipId_QNAME, Long.class, Web.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "RequestId", scope = Phone.class)
    public JAXBElement<Long> createPhoneRequestId(Long value) {
        return new JAXBElement<Long>(_EftRequestId_QNAME, Long.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "OrigSystemReference", scope = Phone.class)
    public JAXBElement<String> createPhoneOrigSystemReference(String value) {
        return new JAXBElement<String>(_EftOrigSystemReference_QNAME, String.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PhoneCountryCode", scope = Phone.class)
    public JAXBElement<String> createPhonePhoneCountryCode(String value) {
        return new JAXBElement<String>(_PhonePhoneCountryCode_QNAME, String.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PagerTypeCode", scope = Phone.class)
    public JAXBElement<String> createPhonePagerTypeCode(String value) {
        return new JAXBElement<String>(_PhonePagerTypeCode_QNAME, String.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PartyUsageCode", scope = Phone.class)
    public JAXBElement<String> createPhonePartyUsageCode(String value) {
        return new JAXBElement<String>(_EftPartyUsageCode_QNAME, String.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PhoneAreaCode", scope = Phone.class)
    public JAXBElement<String> createPhonePhoneAreaCode(String value) {
        return new JAXBElement<String>(_PhonePhoneAreaCode_QNAME, String.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "TransposedPhoneNumber", scope = Phone.class)
    public JAXBElement<String> createPhoneTransposedPhoneNumber(String value) {
        return new JAXBElement<String>(_PhoneTransposedPhoneNumber_QNAME, String.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "TimezoneCode", scope = Phone.class)
    public JAXBElement<String> createPhoneTimezoneCode(String value) {
        return new JAXBElement<String>(_PhoneTimezoneCode_QNAME, String.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PhoneCallingCalendar", scope = Phone.class)
    public JAXBElement<String> createPhonePhoneCallingCalendar(String value) {
        return new JAXBElement<String>(_PhonePhoneCallingCalendar_QNAME, String.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PhoneExtension", scope = Phone.class)
    public JAXBElement<String> createPhonePhoneExtension(String value) {
        return new JAXBElement<String>(_PhonePhoneExtension_QNAME, String.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "LastUpdateLogin", scope = Phone.class)
    public JAXBElement<String> createPhoneLastUpdateLogin(String value) {
        return new JAXBElement<String>(_EftLastUpdateLogin_QNAME, String.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "CreatedByModule", scope = Phone.class)
    public JAXBElement<String> createPhoneCreatedByModule(String value) {
        return new JAXBElement<String>(_EftCreatedByModule_QNAME, String.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "ContactPointPurpose", scope = Phone.class)
    public JAXBElement<String> createPhoneContactPointPurpose(String value) {
        return new JAXBElement<String>(_EftContactPointPurpose_QNAME, String.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "OrigSystem", scope = Phone.class)
    public JAXBElement<String> createPhoneOrigSystem(String value) {
        return new JAXBElement<String>(_EftOrigSystem_QNAME, String.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PhoneNumber", scope = Phone.class)
    public JAXBElement<String> createPhonePhoneNumber(String value) {
        return new JAXBElement<String>(_PhonePhoneNumber_QNAME, String.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PrimaryByPurpose", scope = Phone.class)
    public JAXBElement<String> createPhonePrimaryByPurpose(String value) {
        return new JAXBElement<String>(_EftPrimaryByPurpose_QNAME, String.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PartyName", scope = Phone.class)
    public JAXBElement<String> createPhonePartyName(String value) {
        return new JAXBElement<String>(_WebPartyName_QNAME, String.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "LastContactDtTime", scope = Phone.class)
    public JAXBElement<XMLGregorianCalendar> createPhoneLastContactDtTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PhoneLastContactDtTime_QNAME, XMLGregorianCalendar.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "FormattedPhoneNumber", scope = Phone.class)
    public JAXBElement<String> createPhoneFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_PhoneFormattedPhoneNumber_QNAME, String.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "RawPhoneNumber", scope = Phone.class)
    public JAXBElement<String> createPhoneRawPhoneNumber(String value) {
        return new JAXBElement<String>(_PhoneRawPhoneNumber_QNAME, String.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "RelationshipId", scope = Phone.class)
    public JAXBElement<Long> createPhoneRelationshipId(Long value) {
        return new JAXBElement<Long>(_EftRelationshipId_QNAME, Long.class, Phone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "LastUpdateLogin", scope = Telex.class)
    public JAXBElement<String> createTelexLastUpdateLogin(String value) {
        return new JAXBElement<String>(_EftLastUpdateLogin_QNAME, String.class, Telex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "RequestId", scope = Telex.class)
    public JAXBElement<Long> createTelexRequestId(Long value) {
        return new JAXBElement<Long>(_EftRequestId_QNAME, Long.class, Telex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "ContactPointPurpose", scope = Telex.class)
    public JAXBElement<String> createTelexContactPointPurpose(String value) {
        return new JAXBElement<String>(_EftContactPointPurpose_QNAME, String.class, Telex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "CreatedByModule", scope = Telex.class)
    public JAXBElement<String> createTelexCreatedByModule(String value) {
        return new JAXBElement<String>(_EftCreatedByModule_QNAME, String.class, Telex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "OrigSystem", scope = Telex.class)
    public JAXBElement<String> createTelexOrigSystem(String value) {
        return new JAXBElement<String>(_EftOrigSystem_QNAME, String.class, Telex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "OrigSystemReference", scope = Telex.class)
    public JAXBElement<String> createTelexOrigSystemReference(String value) {
        return new JAXBElement<String>(_EftOrigSystemReference_QNAME, String.class, Telex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PartyUsageCode", scope = Telex.class)
    public JAXBElement<String> createTelexPartyUsageCode(String value) {
        return new JAXBElement<String>(_EftPartyUsageCode_QNAME, String.class, Telex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PrimaryByPurpose", scope = Telex.class)
    public JAXBElement<String> createTelexPrimaryByPurpose(String value) {
        return new JAXBElement<String>(_EftPrimaryByPurpose_QNAME, String.class, Telex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "RelationshipId", scope = Telex.class)
    public JAXBElement<Long> createTelexRelationshipId(Long value) {
        return new JAXBElement<Long>(_EftRelationshipId_QNAME, Long.class, Telex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "LastUpdateLogin", scope = InstantMessaging.class)
    public JAXBElement<String> createInstantMessagingLastUpdateLogin(String value) {
        return new JAXBElement<String>(_EftLastUpdateLogin_QNAME, String.class, InstantMessaging.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "RequestId", scope = InstantMessaging.class)
    public JAXBElement<Long> createInstantMessagingRequestId(Long value) {
        return new JAXBElement<Long>(_EftRequestId_QNAME, Long.class, InstantMessaging.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "ContactPointPurpose", scope = InstantMessaging.class)
    public JAXBElement<String> createInstantMessagingContactPointPurpose(String value) {
        return new JAXBElement<String>(_EftContactPointPurpose_QNAME, String.class, InstantMessaging.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "CreatedByModule", scope = InstantMessaging.class)
    public JAXBElement<String> createInstantMessagingCreatedByModule(String value) {
        return new JAXBElement<String>(_EftCreatedByModule_QNAME, String.class, InstantMessaging.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "OrigSystem", scope = InstantMessaging.class)
    public JAXBElement<String> createInstantMessagingOrigSystem(String value) {
        return new JAXBElement<String>(_EftOrigSystem_QNAME, String.class, InstantMessaging.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "OrigSystemReference", scope = InstantMessaging.class)
    public JAXBElement<String> createInstantMessagingOrigSystemReference(String value) {
        return new JAXBElement<String>(_EftOrigSystemReference_QNAME, String.class, InstantMessaging.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PartyUsageCode", scope = InstantMessaging.class)
    public JAXBElement<String> createInstantMessagingPartyUsageCode(String value) {
        return new JAXBElement<String>(_EftPartyUsageCode_QNAME, String.class, InstantMessaging.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PrimaryByPurpose", scope = InstantMessaging.class)
    public JAXBElement<String> createInstantMessagingPrimaryByPurpose(String value) {
        return new JAXBElement<String>(_EftPrimaryByPurpose_QNAME, String.class, InstantMessaging.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PartyName", scope = InstantMessaging.class)
    public JAXBElement<String> createInstantMessagingPartyName(String value) {
        return new JAXBElement<String>(_WebPartyName_QNAME, String.class, InstantMessaging.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "RelationshipId", scope = InstantMessaging.class)
    public JAXBElement<Long> createInstantMessagingRelationshipId(Long value) {
        return new JAXBElement<Long>(_EftRelationshipId_QNAME, Long.class, InstantMessaging.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PreferenceTopicTypeId", scope = ContactPreference.class)
    public JAXBElement<Long> createContactPreferencePreferenceTopicTypeId(Long value) {
        return new JAXBElement<Long>(_ContactPreferencePreferenceTopicTypeId_QNAME, Long.class, ContactPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "MaximumNoOfInteractions", scope = ContactPreference.class)
    public JAXBElement<BigDecimal> createContactPreferenceMaximumNoOfInteractions(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ContactPreferenceMaximumNoOfInteractions_QNAME, BigDecimal.class, ContactPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "RequestId", scope = ContactPreference.class)
    public JAXBElement<Long> createContactPreferenceRequestId(Long value) {
        return new JAXBElement<Long>(_EftRequestId_QNAME, Long.class, ContactPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PreferenceTopicTypeCode", scope = ContactPreference.class)
    public JAXBElement<String> createContactPreferencePreferenceTopicTypeCode(String value) {
        return new JAXBElement<String>(_ContactPreferencePreferenceTopicTypeCode_QNAME, String.class, ContactPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PreferenceTopicType", scope = ContactPreference.class)
    public JAXBElement<String> createContactPreferencePreferenceTopicType(String value) {
        return new JAXBElement<String>(_ContactPreferencePreferenceTopicType_QNAME, String.class, ContactPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "LastUpdateLogin", scope = ContactPreference.class)
    public JAXBElement<String> createContactPreferenceLastUpdateLogin(String value) {
        return new JAXBElement<String>(_EftLastUpdateLogin_QNAME, String.class, ContactPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PreferenceStartTimeHR", scope = ContactPreference.class)
    public JAXBElement<Integer> createContactPreferencePreferenceStartTimeHR(Integer value) {
        return new JAXBElement<Integer>(_ContactPreferencePreferenceStartTimeHR_QNAME, Integer.class, ContactPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "CreatedByModule", scope = ContactPreference.class)
    public JAXBElement<String> createContactPreferenceCreatedByModule(String value) {
        return new JAXBElement<String>(_EftCreatedByModule_QNAME, String.class, ContactPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PreferenceStartTimeMi", scope = ContactPreference.class)
    public JAXBElement<Integer> createContactPreferencePreferenceStartTimeMi(Integer value) {
        return new JAXBElement<Integer>(_ContactPreferencePreferenceStartTimeMi_QNAME, Integer.class, ContactPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PreferenceEndDate", scope = ContactPreference.class)
    public JAXBElement<XMLGregorianCalendar> createContactPreferencePreferenceEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactPreferencePreferenceEndDate_QNAME, XMLGregorianCalendar.class, ContactPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "ReasonCode", scope = ContactPreference.class)
    public JAXBElement<String> createContactPreferenceReasonCode(String value) {
        return new JAXBElement<String>(_ContactPreferenceReasonCode_QNAME, String.class, ContactPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PreferenceEndTimeHR", scope = ContactPreference.class)
    public JAXBElement<Integer> createContactPreferencePreferenceEndTimeHR(Integer value) {
        return new JAXBElement<Integer>(_ContactPreferencePreferenceEndTimeHR_QNAME, Integer.class, ContactPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PreferenceEndTimeMi", scope = ContactPreference.class)
    public JAXBElement<Integer> createContactPreferencePreferenceEndTimeMi(Integer value) {
        return new JAXBElement<Integer>(_ContactPreferencePreferenceEndTimeMi_QNAME, Integer.class, ContactPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "MaximumNoOfInteractUOMCode", scope = ContactPreference.class)
    public JAXBElement<String> createContactPreferenceMaximumNoOfInteractUOMCode(String value) {
        return new JAXBElement<String>(_ContactPreferenceMaximumNoOfInteractUOMCode_QNAME, String.class, ContactPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "LastUpdateLogin", scope = Email.class)
    public JAXBElement<String> createEmailLastUpdateLogin(String value) {
        return new JAXBElement<String>(_EftLastUpdateLogin_QNAME, String.class, Email.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "RequestId", scope = Email.class)
    public JAXBElement<Long> createEmailRequestId(Long value) {
        return new JAXBElement<Long>(_EftRequestId_QNAME, Long.class, Email.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "ContactPointPurpose", scope = Email.class)
    public JAXBElement<String> createEmailContactPointPurpose(String value) {
        return new JAXBElement<String>(_EftContactPointPurpose_QNAME, String.class, Email.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "CreatedByModule", scope = Email.class)
    public JAXBElement<String> createEmailCreatedByModule(String value) {
        return new JAXBElement<String>(_EftCreatedByModule_QNAME, String.class, Email.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "OrigSystem", scope = Email.class)
    public JAXBElement<String> createEmailOrigSystem(String value) {
        return new JAXBElement<String>(_EftOrigSystem_QNAME, String.class, Email.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "OrigSystemReference", scope = Email.class)
    public JAXBElement<String> createEmailOrigSystemReference(String value) {
        return new JAXBElement<String>(_EftOrigSystemReference_QNAME, String.class, Email.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PartyUsageCode", scope = Email.class)
    public JAXBElement<String> createEmailPartyUsageCode(String value) {
        return new JAXBElement<String>(_EftPartyUsageCode_QNAME, String.class, Email.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PrimaryByPurpose", scope = Email.class)
    public JAXBElement<String> createEmailPrimaryByPurpose(String value) {
        return new JAXBElement<String>(_EftPrimaryByPurpose_QNAME, String.class, Email.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "PartyName", scope = Email.class)
    public JAXBElement<String> createEmailPartyName(String value) {
        return new JAXBElement<String>(_WebPartyName_QNAME, String.class, Email.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", name = "RelationshipId", scope = Email.class)
    public JAXBElement<Long> createEmailRelationshipId(Long value) {
        return new JAXBElement<Long>(_EftRelationshipId_QNAME, Long.class, Email.class, value);
    }

}
