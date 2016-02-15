
package com.oracle.xmlns.apps.cdm.foundation.parties.flex.relationship;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cdm.foundation.parties.flex.relationship package. 
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

    private final static QName _RelationshipInformation_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/relationship/", "relationshipInformation");
    private final static QName _RelationshipInformationFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/relationship/", "__FLEX_Context");
    private final static QName _RelationshipInformationFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/relationship/", "_FLEX_NumOfSegments");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cdm.foundation.parties.flex.relationship
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RelationshipInformation }
     * 
     */
    public RelationshipInformation createRelationshipInformation() {
        return new RelationshipInformation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationshipInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/relationship/", name = "relationshipInformation")
    public JAXBElement<RelationshipInformation> createRelationshipInformation(RelationshipInformation value) {
        return new JAXBElement<RelationshipInformation>(_RelationshipInformation_QNAME, RelationshipInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/relationship/", name = "__FLEX_Context", scope = RelationshipInformation.class)
    public JAXBElement<String> createRelationshipInformationFLEXContext(String value) {
        return new JAXBElement<String>(_RelationshipInformationFLEXContext_QNAME, String.class, RelationshipInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/relationship/", name = "_FLEX_NumOfSegments", scope = RelationshipInformation.class)
    public JAXBElement<Integer> createRelationshipInformationFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_RelationshipInformationFLEXNumOfSegments_QNAME, Integer.class, RelationshipInformation.class, value);
    }

}
