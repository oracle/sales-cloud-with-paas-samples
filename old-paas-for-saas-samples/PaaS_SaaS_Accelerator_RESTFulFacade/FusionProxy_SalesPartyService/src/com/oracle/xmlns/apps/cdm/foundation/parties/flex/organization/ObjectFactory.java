
package com.oracle.xmlns.apps.cdm.foundation.parties.flex.organization;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cdm.foundation.parties.flex.organization package. 
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

    private final static QName _OrganizationInformation_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/organization/", "organizationInformation");
    private final static QName _OrganizationInformationFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/organization/", "_FLEX_NumOfSegments");
    private final static QName _OrganizationInformationFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/organization/", "__FLEX_Context");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cdm.foundation.parties.flex.organization
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrganizationInformation }
     * 
     */
    public OrganizationInformation createOrganizationInformation() {
        return new OrganizationInformation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/organization/", name = "organizationInformation")
    public JAXBElement<OrganizationInformation> createOrganizationInformation(OrganizationInformation value) {
        return new JAXBElement<OrganizationInformation>(_OrganizationInformation_QNAME, OrganizationInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/organization/", name = "_FLEX_NumOfSegments", scope = OrganizationInformation.class)
    public JAXBElement<Integer> createOrganizationInformationFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_OrganizationInformationFLEXNumOfSegments_QNAME, Integer.class, OrganizationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/organization/", name = "__FLEX_Context", scope = OrganizationInformation.class)
    public JAXBElement<String> createOrganizationInformationFLEXContext(String value) {
        return new JAXBElement<String>(_OrganizationInformationFLEXContext_QNAME, String.class, OrganizationInformation.class, value);
    }

}
