
package com.oracle.xmlns.apps.cdm.foundation.parties.relationshipservice;

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
import com.oracle.xmlns.apps.cdm.foundation.parties.contactpointservice.Email;
import com.oracle.xmlns.apps.cdm.foundation.parties.contactpointservice.InstantMessaging;
import com.oracle.xmlns.apps.cdm.foundation.parties.contactpointservice.Phone;
import com.oracle.xmlns.apps.cdm.foundation.parties.contactpointservice.Web;
import com.oracle.xmlns.apps.cdm.foundation.parties.flex.relationship.RelationshipInformation;
import com.oracle.xmlns.apps.cdm.foundation.parties.partyservice.OriginalSystemReference;
import com.oracle.xmlns.apps.cdm.foundation.parties.partyservice.PartySite;
import com.oracle.xmlns.apps.cdm.foundation.parties.partyservice.PartyUsageAssignment;


/**
 * <p>Java class for Relationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Relationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelationshipRecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RelationshipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SubjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SubjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubjectTableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectTableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelationshipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreatedByModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PercentageOwnership" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ObjectUsageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubjectUsageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ObjectPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurcyConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubjectEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationContact" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/}OrganizationContact" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}Phone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartySite" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}PartySite" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RelationshipInformation" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/relationship/}RelationshipInformation" minOccurs="0"/>
 *         &lt;element name="OriginalSystemReference" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}OriginalSystemReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}Email" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartyUsageAssignment" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}PartyUsageAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubjectPartyUsageAssignment" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}PartyUsageAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InstantMessaging" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}InstantMessaging" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Web" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}Web" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relationship", propOrder = {
    "relationshipRecId",
    "relationshipId",
    "subjectId",
    "subjectType",
    "subjectTableName",
    "objectId",
    "objectType",
    "objectTableName",
    "relationshipCode",
    "relationshipType",
    "role",
    "comments",
    "startDate",
    "endDate",
    "status",
    "createdBy",
    "creationDate",
    "lastUpdatedBy",
    "lastUpdateDate",
    "lastUpdateLogin",
    "requestId",
    "objectVersionNumber",
    "createdByModule",
    "additionalInformation1",
    "additionalInformation2",
    "additionalInformation3",
    "additionalInformation4",
    "additionalInformation5",
    "additionalInformation6",
    "additionalInformation7",
    "additionalInformation8",
    "additionalInformation9",
    "additionalInformation10",
    "additionalInformation11",
    "additionalInformation12",
    "additionalInformation13",
    "additionalInformation14",
    "additionalInformation15",
    "additionalInformation16",
    "additionalInformation17",
    "additionalInformation18",
    "additionalInformation19",
    "additionalInformation20",
    "additionalInformation21",
    "additionalInformation22",
    "additionalInformation23",
    "additionalInformation24",
    "additionalInformation25",
    "additionalInformation26",
    "additionalInformation27",
    "additionalInformation28",
    "additionalInformation29",
    "additionalInformation30",
    "directionCode",
    "percentageOwnership",
    "objectUsageCode",
    "subjectUsageCode",
    "preferredContactFlag",
    "objectPartyName",
    "partyName",
    "currencyCode",
    "curcyConvRateType",
    "corpCurrencyCode",
    "subjectEmailAddress",
    "objectEmailAddress",
    "organizationContact",
    "phone",
    "partySite",
    "relationshipInformation",
    "originalSystemReference",
    "email",
    "partyUsageAssignment",
    "subjectPartyUsageAssignment",
    "instantMessaging",
    "web"
})
public class Relationship {

    @XmlElement(name = "RelationshipRecId")
    protected Long relationshipRecId;
    @XmlElement(name = "RelationshipId")
    protected Long relationshipId;
    @XmlElement(name = "SubjectId")
    protected Long subjectId;
    @XmlElement(name = "SubjectType")
    protected String subjectType;
    @XmlElement(name = "SubjectTableName")
    protected String subjectTableName;
    @XmlElement(name = "ObjectId")
    protected Long objectId;
    @XmlElement(name = "ObjectType")
    protected String objectType;
    @XmlElement(name = "ObjectTableName")
    protected String objectTableName;
    @XmlElement(name = "RelationshipCode")
    protected String relationshipCode;
    @XmlElement(name = "RelationshipType")
    protected String relationshipType;
    @XmlElementRef(name = "Role", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> role;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> comments;
    @XmlElement(name = "StartDate")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElementRef(name = "RequestId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<Long> requestId;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "CreatedByModule", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> createdByModule;
    @XmlElementRef(name = "AdditionalInformation1", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation1;
    @XmlElementRef(name = "AdditionalInformation2", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation2;
    @XmlElementRef(name = "AdditionalInformation3", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation3;
    @XmlElementRef(name = "AdditionalInformation4", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation4;
    @XmlElementRef(name = "AdditionalInformation5", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation5;
    @XmlElementRef(name = "AdditionalInformation6", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation6;
    @XmlElementRef(name = "AdditionalInformation7", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation7;
    @XmlElementRef(name = "AdditionalInformation8", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation8;
    @XmlElementRef(name = "AdditionalInformation9", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation9;
    @XmlElementRef(name = "AdditionalInformation10", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation10;
    @XmlElementRef(name = "AdditionalInformation11", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation11;
    @XmlElementRef(name = "AdditionalInformation12", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation12;
    @XmlElementRef(name = "AdditionalInformation13", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation13;
    @XmlElementRef(name = "AdditionalInformation14", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation14;
    @XmlElementRef(name = "AdditionalInformation15", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation15;
    @XmlElementRef(name = "AdditionalInformation16", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation16;
    @XmlElementRef(name = "AdditionalInformation17", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation17;
    @XmlElementRef(name = "AdditionalInformation18", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation18;
    @XmlElementRef(name = "AdditionalInformation19", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation19;
    @XmlElementRef(name = "AdditionalInformation20", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation20;
    @XmlElementRef(name = "AdditionalInformation21", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation21;
    @XmlElementRef(name = "AdditionalInformation22", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation22;
    @XmlElementRef(name = "AdditionalInformation23", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation23;
    @XmlElementRef(name = "AdditionalInformation24", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation24;
    @XmlElementRef(name = "AdditionalInformation25", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation25;
    @XmlElementRef(name = "AdditionalInformation26", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation26;
    @XmlElementRef(name = "AdditionalInformation27", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation27;
    @XmlElementRef(name = "AdditionalInformation28", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation28;
    @XmlElementRef(name = "AdditionalInformation29", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation29;
    @XmlElementRef(name = "AdditionalInformation30", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> additionalInformation30;
    @XmlElementRef(name = "DirectionCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> directionCode;
    @XmlElementRef(name = "PercentageOwnership", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> percentageOwnership;
    @XmlElementRef(name = "ObjectUsageCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> objectUsageCode;
    @XmlElementRef(name = "SubjectUsageCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> subjectUsageCode;
    @XmlElementRef(name = "PreferredContactFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> preferredContactFlag;
    @XmlElementRef(name = "ObjectPartyName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> objectPartyName;
    @XmlElement(name = "PartyName")
    protected String partyName;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "SubjectEmailAddress", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> subjectEmailAddress;
    @XmlElementRef(name = "ObjectEmailAddress", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> objectEmailAddress;
    @XmlElement(name = "OrganizationContact")
    protected OrganizationContact organizationContact;
    @XmlElement(name = "Phone")
    protected List<Phone> phone;
    @XmlElement(name = "PartySite")
    protected List<PartySite> partySite;
    @XmlElement(name = "RelationshipInformation")
    protected RelationshipInformation relationshipInformation;
    @XmlElement(name = "OriginalSystemReference")
    protected List<OriginalSystemReference> originalSystemReference;
    @XmlElement(name = "Email")
    protected List<Email> email;
    @XmlElement(name = "PartyUsageAssignment")
    protected List<PartyUsageAssignment> partyUsageAssignment;
    @XmlElement(name = "SubjectPartyUsageAssignment")
    protected List<PartyUsageAssignment> subjectPartyUsageAssignment;
    @XmlElement(name = "InstantMessaging")
    protected List<InstantMessaging> instantMessaging;
    @XmlElement(name = "Web")
    protected List<Web> web;

    /**
     * Gets the value of the relationshipRecId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRelationshipRecId() {
        return relationshipRecId;
    }

    /**
     * Sets the value of the relationshipRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRelationshipRecId(Long value) {
        this.relationshipRecId = value;
    }

    /**
     * Gets the value of the relationshipId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRelationshipId() {
        return relationshipId;
    }

    /**
     * Sets the value of the relationshipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRelationshipId(Long value) {
        this.relationshipId = value;
    }

    /**
     * Gets the value of the subjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * Sets the value of the subjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubjectId(Long value) {
        this.subjectId = value;
    }

    /**
     * Gets the value of the subjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectType() {
        return subjectType;
    }

    /**
     * Sets the value of the subjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectType(String value) {
        this.subjectType = value;
    }

    /**
     * Gets the value of the subjectTableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectTableName() {
        return subjectTableName;
    }

    /**
     * Sets the value of the subjectTableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectTableName(String value) {
        this.subjectTableName = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setObjectId(Long value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the objectTableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectTableName() {
        return objectTableName;
    }

    /**
     * Sets the value of the objectTableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectTableName(String value) {
        this.objectTableName = value;
    }

    /**
     * Gets the value of the relationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipCode() {
        return relationshipCode;
    }

    /**
     * Sets the value of the relationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipCode(String value) {
        this.relationshipCode = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipType(String value) {
        this.relationshipType = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRole(JAXBElement<String> value) {
        this.role = ((JAXBElement<String> ) value);
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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
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
     * Gets the value of the additionalInformation1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation1() {
        return additionalInformation1;
    }

    /**
     * Sets the value of the additionalInformation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation1(JAXBElement<String> value) {
        this.additionalInformation1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation2() {
        return additionalInformation2;
    }

    /**
     * Sets the value of the additionalInformation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation2(JAXBElement<String> value) {
        this.additionalInformation2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation3() {
        return additionalInformation3;
    }

    /**
     * Sets the value of the additionalInformation3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation3(JAXBElement<String> value) {
        this.additionalInformation3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation4() {
        return additionalInformation4;
    }

    /**
     * Sets the value of the additionalInformation4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation4(JAXBElement<String> value) {
        this.additionalInformation4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation5() {
        return additionalInformation5;
    }

    /**
     * Sets the value of the additionalInformation5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation5(JAXBElement<String> value) {
        this.additionalInformation5 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation6() {
        return additionalInformation6;
    }

    /**
     * Sets the value of the additionalInformation6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation6(JAXBElement<String> value) {
        this.additionalInformation6 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation7() {
        return additionalInformation7;
    }

    /**
     * Sets the value of the additionalInformation7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation7(JAXBElement<String> value) {
        this.additionalInformation7 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation8() {
        return additionalInformation8;
    }

    /**
     * Sets the value of the additionalInformation8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation8(JAXBElement<String> value) {
        this.additionalInformation8 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation9() {
        return additionalInformation9;
    }

    /**
     * Sets the value of the additionalInformation9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation9(JAXBElement<String> value) {
        this.additionalInformation9 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation10() {
        return additionalInformation10;
    }

    /**
     * Sets the value of the additionalInformation10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation10(JAXBElement<String> value) {
        this.additionalInformation10 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation11() {
        return additionalInformation11;
    }

    /**
     * Sets the value of the additionalInformation11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation11(JAXBElement<String> value) {
        this.additionalInformation11 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation12() {
        return additionalInformation12;
    }

    /**
     * Sets the value of the additionalInformation12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation12(JAXBElement<String> value) {
        this.additionalInformation12 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation13() {
        return additionalInformation13;
    }

    /**
     * Sets the value of the additionalInformation13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation13(JAXBElement<String> value) {
        this.additionalInformation13 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation14() {
        return additionalInformation14;
    }

    /**
     * Sets the value of the additionalInformation14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation14(JAXBElement<String> value) {
        this.additionalInformation14 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation15() {
        return additionalInformation15;
    }

    /**
     * Sets the value of the additionalInformation15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation15(JAXBElement<String> value) {
        this.additionalInformation15 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation16 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation16() {
        return additionalInformation16;
    }

    /**
     * Sets the value of the additionalInformation16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation16(JAXBElement<String> value) {
        this.additionalInformation16 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation17 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation17() {
        return additionalInformation17;
    }

    /**
     * Sets the value of the additionalInformation17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation17(JAXBElement<String> value) {
        this.additionalInformation17 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation18 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation18() {
        return additionalInformation18;
    }

    /**
     * Sets the value of the additionalInformation18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation18(JAXBElement<String> value) {
        this.additionalInformation18 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation19 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation19() {
        return additionalInformation19;
    }

    /**
     * Sets the value of the additionalInformation19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation19(JAXBElement<String> value) {
        this.additionalInformation19 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation20 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation20() {
        return additionalInformation20;
    }

    /**
     * Sets the value of the additionalInformation20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation20(JAXBElement<String> value) {
        this.additionalInformation20 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation21 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation21() {
        return additionalInformation21;
    }

    /**
     * Sets the value of the additionalInformation21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation21(JAXBElement<String> value) {
        this.additionalInformation21 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation22 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation22() {
        return additionalInformation22;
    }

    /**
     * Sets the value of the additionalInformation22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation22(JAXBElement<String> value) {
        this.additionalInformation22 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation23 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation23() {
        return additionalInformation23;
    }

    /**
     * Sets the value of the additionalInformation23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation23(JAXBElement<String> value) {
        this.additionalInformation23 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation24 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation24() {
        return additionalInformation24;
    }

    /**
     * Sets the value of the additionalInformation24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation24(JAXBElement<String> value) {
        this.additionalInformation24 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation25 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation25() {
        return additionalInformation25;
    }

    /**
     * Sets the value of the additionalInformation25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation25(JAXBElement<String> value) {
        this.additionalInformation25 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation26 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation26() {
        return additionalInformation26;
    }

    /**
     * Sets the value of the additionalInformation26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation26(JAXBElement<String> value) {
        this.additionalInformation26 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation27 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation27() {
        return additionalInformation27;
    }

    /**
     * Sets the value of the additionalInformation27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation27(JAXBElement<String> value) {
        this.additionalInformation27 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation28 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation28() {
        return additionalInformation28;
    }

    /**
     * Sets the value of the additionalInformation28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation28(JAXBElement<String> value) {
        this.additionalInformation28 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation29 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation29() {
        return additionalInformation29;
    }

    /**
     * Sets the value of the additionalInformation29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation29(JAXBElement<String> value) {
        this.additionalInformation29 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInformation30 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation30() {
        return additionalInformation30;
    }

    /**
     * Sets the value of the additionalInformation30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation30(JAXBElement<String> value) {
        this.additionalInformation30 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the directionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirectionCode() {
        return directionCode;
    }

    /**
     * Sets the value of the directionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirectionCode(JAXBElement<String> value) {
        this.directionCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the percentageOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPercentageOwnership() {
        return percentageOwnership;
    }

    /**
     * Sets the value of the percentageOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPercentageOwnership(JAXBElement<BigDecimal> value) {
        this.percentageOwnership = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the objectUsageCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObjectUsageCode() {
        return objectUsageCode;
    }

    /**
     * Sets the value of the objectUsageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObjectUsageCode(JAXBElement<String> value) {
        this.objectUsageCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the subjectUsageCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubjectUsageCode() {
        return subjectUsageCode;
    }

    /**
     * Sets the value of the subjectUsageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubjectUsageCode(JAXBElement<String> value) {
        this.subjectUsageCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the preferredContactFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreferredContactFlag() {
        return preferredContactFlag;
    }

    /**
     * Sets the value of the preferredContactFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreferredContactFlag(JAXBElement<Boolean> value) {
        this.preferredContactFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the objectPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObjectPartyName() {
        return objectPartyName;
    }

    /**
     * Sets the value of the objectPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObjectPartyName(JAXBElement<String> value) {
        this.objectPartyName = ((JAXBElement<String> ) value);
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
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curcyConvRateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurcyConvRateType() {
        return curcyConvRateType;
    }

    /**
     * Sets the value of the curcyConvRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurcyConvRateType(JAXBElement<String> value) {
        this.curcyConvRateType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corpCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpCurrencyCode() {
        return corpCurrencyCode;
    }

    /**
     * Sets the value of the corpCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpCurrencyCode(JAXBElement<String> value) {
        this.corpCurrencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the subjectEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubjectEmailAddress() {
        return subjectEmailAddress;
    }

    /**
     * Sets the value of the subjectEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubjectEmailAddress(JAXBElement<String> value) {
        this.subjectEmailAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the objectEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObjectEmailAddress() {
        return objectEmailAddress;
    }

    /**
     * Sets the value of the objectEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObjectEmailAddress(JAXBElement<String> value) {
        this.objectEmailAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the organizationContact property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationContact }
     *     
     */
    public OrganizationContact getOrganizationContact() {
        return organizationContact;
    }

    /**
     * Sets the value of the organizationContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationContact }
     *     
     */
    public void setOrganizationContact(OrganizationContact value) {
        this.organizationContact = value;
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
     * Gets the value of the partySite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partySite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartySite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartySite }
     * 
     * 
     */
    public List<PartySite> getPartySite() {
        if (partySite == null) {
            partySite = new ArrayList<PartySite>();
        }
        return this.partySite;
    }

    /**
     * Gets the value of the relationshipInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipInformation }
     *     
     */
    public RelationshipInformation getRelationshipInformation() {
        return relationshipInformation;
    }

    /**
     * Sets the value of the relationshipInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipInformation }
     *     
     */
    public void setRelationshipInformation(RelationshipInformation value) {
        this.relationshipInformation = value;
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
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Email }
     * 
     * 
     */
    public List<Email> getEmail() {
        if (email == null) {
            email = new ArrayList<Email>();
        }
        return this.email;
    }

    /**
     * Gets the value of the partyUsageAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyUsageAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyUsageAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyUsageAssignment }
     * 
     * 
     */
    public List<PartyUsageAssignment> getPartyUsageAssignment() {
        if (partyUsageAssignment == null) {
            partyUsageAssignment = new ArrayList<PartyUsageAssignment>();
        }
        return this.partyUsageAssignment;
    }

    /**
     * Gets the value of the subjectPartyUsageAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectPartyUsageAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectPartyUsageAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyUsageAssignment }
     * 
     * 
     */
    public List<PartyUsageAssignment> getSubjectPartyUsageAssignment() {
        if (subjectPartyUsageAssignment == null) {
            subjectPartyUsageAssignment = new ArrayList<PartyUsageAssignment>();
        }
        return this.subjectPartyUsageAssignment;
    }

    /**
     * Gets the value of the instantMessaging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instantMessaging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstantMessaging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstantMessaging }
     * 
     * 
     */
    public List<InstantMessaging> getInstantMessaging() {
        if (instantMessaging == null) {
            instantMessaging = new ArrayList<InstantMessaging>();
        }
        return this.instantMessaging;
    }

    /**
     * Gets the value of the web property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the web property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Web }
     * 
     * 
     */
    public List<Web> getWeb() {
        if (web == null) {
            web = new ArrayList<Web>();
        }
        return this.web;
    }

}
