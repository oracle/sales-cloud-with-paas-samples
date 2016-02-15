
package com.oracle.xmlns.apps.cdm.foundation.parties.flex.partysite;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cdm.foundation.parties.flex.partysite package. 
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

    private final static QName _PartySiteInformation_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/partySite/", "partySiteInformation");
    private final static QName _PartySiteInformationFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/partySite/", "_FLEX_NumOfSegments");
    private final static QName _PartySiteInformationFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/partySite/", "__FLEX_Context");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cdm.foundation.parties.flex.partysite
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PartySiteInformation }
     * 
     */
    public PartySiteInformation createPartySiteInformation() {
        return new PartySiteInformation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartySiteInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/partySite/", name = "partySiteInformation")
    public JAXBElement<PartySiteInformation> createPartySiteInformation(PartySiteInformation value) {
        return new JAXBElement<PartySiteInformation>(_PartySiteInformation_QNAME, PartySiteInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/partySite/", name = "_FLEX_NumOfSegments", scope = PartySiteInformation.class)
    public JAXBElement<Integer> createPartySiteInformationFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_PartySiteInformationFLEXNumOfSegments_QNAME, Integer.class, PartySiteInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/partySite/", name = "__FLEX_Context", scope = PartySiteInformation.class)
    public JAXBElement<String> createPartySiteInformationFLEXContext(String value) {
        return new JAXBElement<String>(_PartySiteInformationFLEXContext_QNAME, String.class, PartySiteInformation.class, value);
    }

}
