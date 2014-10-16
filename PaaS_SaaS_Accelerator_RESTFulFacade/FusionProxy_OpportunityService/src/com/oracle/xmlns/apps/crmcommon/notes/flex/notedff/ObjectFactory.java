
package com.oracle.xmlns.apps.crmcommon.notes.flex.notedff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.crmcommon.notes.flex.notedff package. 
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

    private final static QName _NoteDFF_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", "noteDFF");
    private final static QName _NoteDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", "_FLEX_NumOfSegments");
    private final static QName _NoteDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", "__FLEX_Context");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.crmcommon.notes.flex.notedff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NoteDFF }
     * 
     */
    public NoteDFF createNoteDFF() {
        return new NoteDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", name = "noteDFF")
    public JAXBElement<NoteDFF> createNoteDFF(NoteDFF value) {
        return new JAXBElement<NoteDFF>(_NoteDFF_QNAME, NoteDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", name = "_FLEX_NumOfSegments", scope = NoteDFF.class)
    public JAXBElement<Integer> createNoteDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_NoteDFFFLEXNumOfSegments_QNAME, Integer.class, NoteDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", name = "__FLEX_Context", scope = NoteDFF.class)
    public JAXBElement<String> createNoteDFFFLEXContext(String value) {
        return new JAXBElement<String>(_NoteDFFFLEXContext_QNAME, String.class, NoteDFF.class, value);
    }

}
