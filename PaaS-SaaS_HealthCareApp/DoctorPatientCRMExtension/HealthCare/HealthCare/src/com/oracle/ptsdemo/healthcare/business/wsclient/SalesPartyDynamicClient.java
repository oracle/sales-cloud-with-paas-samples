package com.oracle.ptsdemo.healthcare.business.wsclient;


import com.oracle.ptsdemo.healthcare.config.FusionConfig;

import com.oracle.ptsdemo.healthcare.wsclient.osc.OSCWSUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;


import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 */
public class SalesPartyDynamicClient extends ObjectClient {


    private static org.apache.log4j.Logger logger =
        org.apache.log4j.Logger.getLogger(SalesPartyDynamicClient.class);


    private static String SERVICE_NAMESPACE =
        "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/";
    private static String SERVICE_NAME = "SalesPartyService";
    private static String SERVICE_PORT = "SalesPartyServiceSoapHttpPort";
    private static String SALES_PARTY_TYPES_NAMESPACE_URI =
        "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/";


    private final String salesPartyWSDL;
    private final String salesPartyPort;
    private final String username;
    private final String password;
    private final String jwtUserToken;


    /**
     */
    public SalesPartyDynamicClient() {
        super();

        salesPartyPort = FusionConfig.getInstance().getProperty("SALESPARTY_SERVICE");

        salesPartyWSDL = salesPartyPort + "?WSDL";
        this.username = FusionConfig.getInstance().getProperty("FUSION_USER");
        this.password = FusionConfig.getInstance().getProperty("FUSION_PASSWORD");

        this.jwtUserToken = null;

    }


    /**
     * @param jwtUserToken
     */
    public SalesPartyDynamicClient(String jwtUserToken) {
        super();

        salesPartyPort = FusionConfig.getInstance().getProperty("SALESPARTY_SERVICE");

        salesPartyWSDL = salesPartyPort + "?WSDL";

        this.jwtUserToken = jwtUserToken;

        this.username = null;
        this.password = null;

    }

    /**
     * Searches the SalesParty object with the partyId and returns its name (partyName).
     * @param partyId
     * @return
     * @throws SOAPException
     * @throws IOException
     */
    public String getPartyName(Long partyId) throws SOAPException,
                                                    IOException {
        //Schema defined properties
        String operation = "getSalesParty";
        String parameter = "partyId";

        BindingProvider bp = setupServiceProvider();
        
        OSCWSUtil.setSOAPHeader(bp, username, password, jwtUserToken, salesPartyPort);
//        setupSOAPAuthenticationHeader(GET_SALES_PARTY_SOAP_ACTION, bp);

        //           Obtain a preconfigured SAAJ MessageFactory
        MessageFactory factory =
            ((SOAPBinding)bp.getBinding()).getMessageFactory();

        //           Create SOAPMessage Request
        SOAPMessage requestMsg = factory.createMessage();

        //           Request Header

        //           Request Body
        SOAPBody body = requestMsg.getSOAPBody();

        //           Compose the soap:Body payload
        QName payloadName =
            new QName(SALES_PARTY_TYPES_NAMESPACE_URI, operation, "typ");


        SOAPBodyElement payload = body.addBodyElement(payloadName);
        QName childElement =
            new QName(SALES_PARTY_TYPES_NAMESPACE_URI, parameter, "typ");

        //add parameter
        payload.addChildElement(childElement).addTextNode(String.valueOf(partyId));


        //           Invoke the endpoint synchronously
        SOAPMessage reply = null;
        if (logger.isDebugEnabled()) {
            ByteArrayOutputStream ba = new ByteArrayOutputStream();
            requestMsg.writeTo(ba);
            logger.debug("XML Payload: \n" +
                    ba.toString());
        }

        //downcast to Dispatch object
        Dispatch<SOAPMessage> dispatch = (Dispatch<SOAPMessage>)bp;

        //Invoke Endpoint Operation and read response
        reply = dispatch.invoke(requestMsg);

        //           process the reply
        //get document
        Document doc = reply.getSOAPBody().extractContentAsDocument();

        //parse SOAP response/XML content
        String partyName =
            getFirstChildNodeValue(doc, SERVICE_NAMESPACE, "PartyName");

        return partyName;

    }

    /**
     * Parse XML document and retrieve node value of the first node associated with the namespace.
     * @param doc
     * @param namespaceURI
     * @param namespaceLocalName
     * @return
     */
    private String getFirstChildNodeValue(Document doc, String namespaceURI,
                                          String namespaceLocalName) {

        if (logger.isDebugEnabled()) {
            logger.debug("getFirstChildNodeValue (namespaceURI: '" +
                         namespaceURI + "' - namespaceLocalName: '" +
                         namespaceLocalName + "')");
        }


        String nodeValue = null;
        if (doc != null) {

            NodeList nlist =
                doc.getElementsByTagNameNS(namespaceURI, namespaceLocalName);

            if (nlist != null && nlist.getLength() > 0 &&
                nlist.item(0).getChildNodes().getLength() > 0) {

                Node n = nlist.item(0).getFirstChild();
                if (n.getNodeValue() != null)
                    nodeValue = nlist.item(0).getFirstChild().getNodeValue();
            }
        }

        return nodeValue;
    }

    
    /**
     *Setup service provider 
     * @return
     */
    private BindingProvider setupServiceProvider() {

        //          QNames for service as defined in wsdl.
        QName serviceName = new QName(SERVICE_NAMESPACE, SERVICE_NAME);

        //          QName for Port As defined in wsdl.
        QName portName = new QName(SERVICE_NAMESPACE, SERVICE_PORT);


        //           Create a dynamic Service instance
        Service service = Service.create(serviceName);

        //           Add a port to the Service
        service.addPort(portName, SOAPBinding.SOAP11HTTP_BINDING,
                        this.salesPartyPort);

        //          Create a dispatch instance
        Dispatch<SOAPMessage> dispatch =
            service.createDispatch(portName, SOAPMessage.class,
                                   Service.Mode.MESSAGE);

        //          Use Dispatch as BindingProvider
        BindingProvider bp = dispatch;

        return bp;

    }

}
