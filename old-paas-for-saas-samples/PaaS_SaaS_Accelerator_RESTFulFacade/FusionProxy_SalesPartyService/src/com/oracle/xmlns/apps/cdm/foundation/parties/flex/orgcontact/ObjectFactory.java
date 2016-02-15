
package com.oracle.xmlns.apps.cdm.foundation.parties.flex.orgcontact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cdm.foundation.parties.flex.orgcontact package. 
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

    private final static QName _OrganizationContactInformation_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/orgContact/", "organizationContactInformation");
    private final static QName _OrganizationContactInformationFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/orgContact/", "_FLEX_NumOfSegments");
    private final static QName _OrganizationContactInformationFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/orgContact/", "__FLEX_Context");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cdm.foundation.parties.flex.orgcontact
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrganizationContactInformation }
     * 
     */
    public OrganizationContactInformation createOrganizationContactInformation() {
        return new OrganizationContactInformation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationContactInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/orgContact/", name = "organizationContactInformation")
    public JAXBElement<OrganizationContactInformation> createOrganizationContactInformation(OrganizationContactInformation value) {
        return new JAXBElement<OrganizationContactInformation>(_OrganizationContactInformation_QNAME, OrganizationContactInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/orgContact/", name = "_FLEX_NumOfSegments", scope = OrganizationContactInformation.class)
    public JAXBElement<Integer> createOrganizationContactInformationFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_OrganizationContactInformationFLEXNumOfSegments_QNAME, Integer.class, OrganizationContactInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/orgContact/", name = "__FLEX_Context", scope = OrganizationContactInformation.class)
    public JAXBElement<String> createOrganizationContactInformationFLEXContext(String value) {
        return new JAXBElement<String>(_OrganizationContactInformationFLEXContext_QNAME, String.class, OrganizationContactInformation.class, value);
    }

}
