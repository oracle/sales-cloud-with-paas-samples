
package com.oracle.xmlns.apps.cdm.foundation.parties.flex.sourcesystemref;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cdm.foundation.parties.flex.sourcesystemref package. 
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

    private final static QName _SourceSystemRefInformation_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/sourceSystemRef/", "sourceSystemRefInformation");
    private final static QName _SourceSystemRefInformationFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/sourceSystemRef/", "_FLEX_NumOfSegments");
    private final static QName _SourceSystemRefInformationFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/sourceSystemRef/", "__FLEX_Context");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cdm.foundation.parties.flex.sourcesystemref
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SourceSystemRefInformation }
     * 
     */
    public SourceSystemRefInformation createSourceSystemRefInformation() {
        return new SourceSystemRefInformation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceSystemRefInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/sourceSystemRef/", name = "sourceSystemRefInformation")
    public JAXBElement<SourceSystemRefInformation> createSourceSystemRefInformation(SourceSystemRefInformation value) {
        return new JAXBElement<SourceSystemRefInformation>(_SourceSystemRefInformation_QNAME, SourceSystemRefInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/sourceSystemRef/", name = "_FLEX_NumOfSegments", scope = SourceSystemRefInformation.class)
    public JAXBElement<Integer> createSourceSystemRefInformationFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_SourceSystemRefInformationFLEXNumOfSegments_QNAME, Integer.class, SourceSystemRefInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/sourceSystemRef/", name = "__FLEX_Context", scope = SourceSystemRefInformation.class)
    public JAXBElement<String> createSourceSystemRefInformationFLEXContext(String value) {
        return new JAXBElement<String>(_SourceSystemRefInformationFLEXContext_QNAME, String.class, SourceSystemRefInformation.class, value);
    }

}
