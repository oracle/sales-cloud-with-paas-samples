
package com.oracle.xmlns.apps.cdm.foundation.parties.flex.person;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cdm.foundation.parties.flex.person package. 
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

    private final static QName _PersonInformation_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/person/", "personInformation");
    private final static QName _PersonInformationFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/person/", "__FLEX_Context");
    private final static QName _PersonInformationFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/person/", "_FLEX_NumOfSegments");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cdm.foundation.parties.flex.person
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonInformation }
     * 
     */
    public PersonInformation createPersonInformation() {
        return new PersonInformation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/person/", name = "personInformation")
    public JAXBElement<PersonInformation> createPersonInformation(PersonInformation value) {
        return new JAXBElement<PersonInformation>(_PersonInformation_QNAME, PersonInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/person/", name = "__FLEX_Context", scope = PersonInformation.class)
    public JAXBElement<String> createPersonInformationFLEXContext(String value) {
        return new JAXBElement<String>(_PersonInformationFLEXContext_QNAME, String.class, PersonInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/person/", name = "_FLEX_NumOfSegments", scope = PersonInformation.class)
    public JAXBElement<Integer> createPersonInformationFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_PersonInformationFLEXNumOfSegments_QNAME, Integer.class, PersonInformation.class, value);
    }

}
