
package com.oracle.xmlns.apps.cdm.foundation.parties.flex.contactpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cdm.foundation.parties.flex.contactpoint package. 
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

    private final static QName _ContactPointInformation_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/contactPoint/", "contactPointInformation");
    private final static QName _ContactPointInformationFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/contactPoint/", "__FLEX_Context");
    private final static QName _ContactPointInformationFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/contactPoint/", "_FLEX_NumOfSegments");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cdm.foundation.parties.flex.contactpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContactPointInformation }
     * 
     */
    public ContactPointInformation createContactPointInformation() {
        return new ContactPointInformation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactPointInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/contactPoint/", name = "contactPointInformation")
    public JAXBElement<ContactPointInformation> createContactPointInformation(ContactPointInformation value) {
        return new JAXBElement<ContactPointInformation>(_ContactPointInformation_QNAME, ContactPointInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/contactPoint/", name = "__FLEX_Context", scope = ContactPointInformation.class)
    public JAXBElement<String> createContactPointInformationFLEXContext(String value) {
        return new JAXBElement<String>(_ContactPointInformationFLEXContext_QNAME, String.class, ContactPointInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/contactPoint/", name = "_FLEX_NumOfSegments", scope = ContactPointInformation.class)
    public JAXBElement<Integer> createContactPointInformationFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_ContactPointInformationFLEXNumOfSegments_QNAME, Integer.class, ContactPointInformation.class, value);
    }

}
