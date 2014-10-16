
package com.oracle.xmlns.apps.crmcommon.interactions.interactionservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.crmcommon.interactions.interactionservice package. 
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

    private final static QName _InteractionParticipant_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", "interactionParticipant");
    private final static QName _InteractionAssociation_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", "interactionAssociation");
    private final static QName _Interaction_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", "interaction");
    private final static QName _InteractionParticipantConflictId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", "ConflictId");
    private final static QName _InteractionParticipantRelationshipId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", "RelationshipId");
    private final static QName _InteractionParticipantResourceOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", "ResourceOrgId");
    private final static QName _InteractionParticipantUserGUID_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", "UserGUID");
    private final static QName _InteractionParticipantLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", "LastUpdateLogin");
    private final static QName _InteractionAssociationAssociationSequenceNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", "AssociationSequenceNumber");
    private final static QName _InteractionCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", "CurrencyCode");
    private final static QName _InteractionCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", "CorpCurrencyCode");
    private final static QName _InteractionCurcyConvRateType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", "CurcyConvRateType");
    private final static QName _InteractionInteractionEndDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", "InteractionEndDate");
    private final static QName _InteractionMediaTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", "MediaTypeCode");
    private final static QName _InteractionOutcomeCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", "OutcomeCode");
    private final static QName _InteractionInteractionDescription_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", "InteractionDescription");
    private final static QName _InteractionSwitchCallId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", "SwitchCallId");
    private final static QName _InteractionOtherPartyPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", "OtherPartyPhoneNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.crmcommon.interactions.interactionservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InteractionParticipant }
     * 
     */
    public InteractionParticipant createInteractionParticipant() {
        return new InteractionParticipant();
    }

    /**
     * Create an instance of {@link Interaction }
     * 
     */
    public Interaction createInteraction() {
        return new Interaction();
    }

    /**
     * Create an instance of {@link InteractionAssociation }
     * 
     */
    public InteractionAssociation createInteractionAssociation() {
        return new InteractionAssociation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InteractionParticipant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "interactionParticipant")
    public JAXBElement<InteractionParticipant> createInteractionParticipant(InteractionParticipant value) {
        return new JAXBElement<InteractionParticipant>(_InteractionParticipant_QNAME, InteractionParticipant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InteractionAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "interactionAssociation")
    public JAXBElement<InteractionAssociation> createInteractionAssociation(InteractionAssociation value) {
        return new JAXBElement<InteractionAssociation>(_InteractionAssociation_QNAME, InteractionAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Interaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "interaction")
    public JAXBElement<Interaction> createInteraction(Interaction value) {
        return new JAXBElement<Interaction>(_Interaction_QNAME, Interaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "ConflictId", scope = InteractionParticipant.class)
    public JAXBElement<BigDecimal> createInteractionParticipantConflictId(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InteractionParticipantConflictId_QNAME, BigDecimal.class, InteractionParticipant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "RelationshipId", scope = InteractionParticipant.class)
    public JAXBElement<Long> createInteractionParticipantRelationshipId(Long value) {
        return new JAXBElement<Long>(_InteractionParticipantRelationshipId_QNAME, Long.class, InteractionParticipant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "ResourceOrgId", scope = InteractionParticipant.class)
    public JAXBElement<Long> createInteractionParticipantResourceOrgId(Long value) {
        return new JAXBElement<Long>(_InteractionParticipantResourceOrgId_QNAME, Long.class, InteractionParticipant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "UserGUID", scope = InteractionParticipant.class)
    public JAXBElement<String> createInteractionParticipantUserGUID(String value) {
        return new JAXBElement<String>(_InteractionParticipantUserGUID_QNAME, String.class, InteractionParticipant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "LastUpdateLogin", scope = InteractionParticipant.class)
    public JAXBElement<String> createInteractionParticipantLastUpdateLogin(String value) {
        return new JAXBElement<String>(_InteractionParticipantLastUpdateLogin_QNAME, String.class, InteractionParticipant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "ConflictId", scope = InteractionAssociation.class)
    public JAXBElement<BigDecimal> createInteractionAssociationConflictId(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InteractionParticipantConflictId_QNAME, BigDecimal.class, InteractionAssociation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "AssociationSequenceNumber", scope = InteractionAssociation.class)
    public JAXBElement<Long> createInteractionAssociationAssociationSequenceNumber(Long value) {
        return new JAXBElement<Long>(_InteractionAssociationAssociationSequenceNumber_QNAME, Long.class, InteractionAssociation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "LastUpdateLogin", scope = InteractionAssociation.class)
    public JAXBElement<String> createInteractionAssociationLastUpdateLogin(String value) {
        return new JAXBElement<String>(_InteractionParticipantLastUpdateLogin_QNAME, String.class, InteractionAssociation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "CurrencyCode", scope = Interaction.class)
    public JAXBElement<String> createInteractionCurrencyCode(String value) {
        return new JAXBElement<String>(_InteractionCurrencyCode_QNAME, String.class, Interaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "CorpCurrencyCode", scope = Interaction.class)
    public JAXBElement<String> createInteractionCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_InteractionCorpCurrencyCode_QNAME, String.class, Interaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "CurcyConvRateType", scope = Interaction.class)
    public JAXBElement<String> createInteractionCurcyConvRateType(String value) {
        return new JAXBElement<String>(_InteractionCurcyConvRateType_QNAME, String.class, Interaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "InteractionEndDate", scope = Interaction.class)
    public JAXBElement<XMLGregorianCalendar> createInteractionInteractionEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InteractionInteractionEndDate_QNAME, XMLGregorianCalendar.class, Interaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "LastUpdateLogin", scope = Interaction.class)
    public JAXBElement<String> createInteractionLastUpdateLogin(String value) {
        return new JAXBElement<String>(_InteractionParticipantLastUpdateLogin_QNAME, String.class, Interaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "MediaTypeCode", scope = Interaction.class)
    public JAXBElement<String> createInteractionMediaTypeCode(String value) {
        return new JAXBElement<String>(_InteractionMediaTypeCode_QNAME, String.class, Interaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "OutcomeCode", scope = Interaction.class)
    public JAXBElement<String> createInteractionOutcomeCode(String value) {
        return new JAXBElement<String>(_InteractionOutcomeCode_QNAME, String.class, Interaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "InteractionDescription", scope = Interaction.class)
    public JAXBElement<String> createInteractionInteractionDescription(String value) {
        return new JAXBElement<String>(_InteractionInteractionDescription_QNAME, String.class, Interaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "SwitchCallId", scope = Interaction.class)
    public JAXBElement<String> createInteractionSwitchCallId(String value) {
        return new JAXBElement<String>(_InteractionSwitchCallId_QNAME, String.class, Interaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/", name = "OtherPartyPhoneNumber", scope = Interaction.class)
    public JAXBElement<String> createInteractionOtherPartyPhoneNumber(String value) {
        return new JAXBElement<String>(_InteractionOtherPartyPhoneNumber_QNAME, String.class, Interaction.class, value);
    }

}
