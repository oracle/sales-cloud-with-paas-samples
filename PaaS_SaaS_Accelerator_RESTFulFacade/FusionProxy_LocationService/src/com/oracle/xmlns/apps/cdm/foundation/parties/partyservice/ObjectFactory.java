
package com.oracle.xmlns.apps.cdm.foundation.parties.partyservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cdm.foundation.parties.partyservice package. 
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

    private final static QName _OriginalSystemReference_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "originalSystemReference");
    private final static QName _OriginalSystemReferenceRequestId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "RequestId");
    private final static QName _OriginalSystemReferenceLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "LastUpdateLogin");
    private final static QName _OriginalSystemReferencePartyId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PartyId");
    private final static QName _OriginalSystemReferenceCreatedByModule_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreatedByModule");
    private final static QName _OriginalSystemReferenceEndDateActive_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "EndDateActive");
    private final static QName _OriginalSystemReferenceOldOrigSystemReference_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "OldOrigSystemReference");
    private final static QName _OriginalSystemReferenceReasonCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "ReasonCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cdm.foundation.parties.partyservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OriginalSystemReference }
     * 
     */
    public OriginalSystemReference createOriginalSystemReference() {
        return new OriginalSystemReference();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginalSystemReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "originalSystemReference")
    public JAXBElement<OriginalSystemReference> createOriginalSystemReference(OriginalSystemReference value) {
        return new JAXBElement<OriginalSystemReference>(_OriginalSystemReference_QNAME, OriginalSystemReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "RequestId", scope = OriginalSystemReference.class)
    public JAXBElement<Long> createOriginalSystemReferenceRequestId(Long value) {
        return new JAXBElement<Long>(_OriginalSystemReferenceRequestId_QNAME, Long.class, OriginalSystemReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "LastUpdateLogin", scope = OriginalSystemReference.class)
    public JAXBElement<String> createOriginalSystemReferenceLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OriginalSystemReferenceLastUpdateLogin_QNAME, String.class, OriginalSystemReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PartyId", scope = OriginalSystemReference.class)
    public JAXBElement<Long> createOriginalSystemReferencePartyId(Long value) {
        return new JAXBElement<Long>(_OriginalSystemReferencePartyId_QNAME, Long.class, OriginalSystemReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreatedByModule", scope = OriginalSystemReference.class)
    public JAXBElement<String> createOriginalSystemReferenceCreatedByModule(String value) {
        return new JAXBElement<String>(_OriginalSystemReferenceCreatedByModule_QNAME, String.class, OriginalSystemReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "EndDateActive", scope = OriginalSystemReference.class)
    public JAXBElement<XMLGregorianCalendar> createOriginalSystemReferenceEndDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OriginalSystemReferenceEndDateActive_QNAME, XMLGregorianCalendar.class, OriginalSystemReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "OldOrigSystemReference", scope = OriginalSystemReference.class)
    public JAXBElement<String> createOriginalSystemReferenceOldOrigSystemReference(String value) {
        return new JAXBElement<String>(_OriginalSystemReferenceOldOrigSystemReference_QNAME, String.class, OriginalSystemReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "ReasonCode", scope = OriginalSystemReference.class)
    public JAXBElement<String> createOriginalSystemReferenceReasonCode(String value) {
        return new JAXBElement<String>(_OriginalSystemReferenceReasonCode_QNAME, String.class, OriginalSystemReference.class, value);
    }

}
