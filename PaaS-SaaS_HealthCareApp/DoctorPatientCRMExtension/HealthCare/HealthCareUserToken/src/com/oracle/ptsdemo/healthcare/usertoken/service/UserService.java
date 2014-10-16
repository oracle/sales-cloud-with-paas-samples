package com.oracle.ptsdemo.healthcare.usertoken.service;


import com.oracle.ptsdemo.healthcare.usertoken.exception.GeneralException;
import com.oracle.ptsdemo.healthcare.usertoken.exception.UserTokenAuthenticationException;
import com.oracle.ptsdemo.healthcare.usertoken.vo.UserInfo;


import java.io.ByteArrayOutputStream;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.SOAPBinding;

import org.apache.log4j.Logger;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @param args
 */
public class UserService {

    static Logger logger = Logger.getLogger(UserService.class);

    private String username;
    private String password;
    private String jwtUserToken;
    private String userServiceEndPoint;

    /**
     *
     * @param userServiceEndPoint
     * @param username
     * @param password
     */
    public UserService(String userServiceEndPoint, String username,
                       String password) {

        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() +
                         " : constructor - username/password");
        }

        this.username = username;
        this.password = password;
        this.userServiceEndPoint = userServiceEndPoint;
    }

    /**
     *
     * @param userServiceEndPoint
     * @param jwtUserToken
     */
    public UserService(String userServiceEndPoint, String jwtUserToken) {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() +
                         " : constructor - jwtUserToken");
            
            logger.debug("endpoint: "+ userServiceEndPoint + " - jwtUserToken: "+jwtUserToken);
        }

        this.userServiceEndPoint = userServiceEndPoint;
        this.jwtUserToken = jwtUserToken;
    }


    /**
     *
     * @return
     * @throws UserTokenAuthenticationException
     * @throws Exception
     */
    public UserInfo findSelfUserDetails() throws UserTokenAuthenticationException,
                                                 GeneralException {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + ".findSelfUserDetails()");
        }

        UserInfo currentUser = new UserInfo();

        try {
            //          QNames for service as defined in wsdl.
            QName serviceName =
                new QName("http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                          "UserDetailsService");

            //          QName for Port As defined in wsdl.
            QName portName =
                new QName("http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                          "UserDetailsServiceSoapHttpPort");


            //           Create a dynamic Service instance
            Service service = Service.create(serviceName);

            //           Add a port to the Service

            service.addPort(portName, SOAPBinding.SOAP11HTTP_BINDING,
                            this.userServiceEndPoint);


            //          Create a dispatch instance
            Dispatch<SOAPMessage> dispatch =
                service.createDispatch(portName, SOAPMessage.class,
                                       Service.Mode.MESSAGE);

            //          Use Dispatch as BindingProvider
            BindingProvider bp = dispatch;


            //           Optionally Configure RequestContext to send SOAPAction HTTP Header
            Map<String, Object> rc = bp.getRequestContext();
            rc.put(BindingProvider.SOAPACTION_USE_PROPERTY, Boolean.TRUE);
            rc.put(BindingProvider.SOAPACTION_URI_PROPERTY,
                   "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/findSelfUserDetails");


            if (jwtUserToken != null && jwtUserToken.length() > 0) {

                String authZParameterValue = "Bearer " + this.jwtUserToken;
                
                
                Map<String, List<String>> authMap = new HashMap<String, List<String>>();
                List<String> authZList = new ArrayList<String>();
                authZList.add(authZParameterValue);
                
                authMap.put("Authorization", authZList);
                rc.put(MessageContext.HTTP_REQUEST_HEADERS, authMap);
                
                if (logger.isDebugEnabled()) {
                    logger.debug("AuthHeader: "+authMap);
                }

                
            } else {
                // Use the username and password for authentication
                rc.put(BindingProvider.USERNAME_PROPERTY, this.username);
                rc.put(BindingProvider.PASSWORD_PROPERTY, this.password);

            }


            //           Obtain a preconfigured SAAJ MessageFactory
            MessageFactory factory =
                ((SOAPBinding)bp.getBinding()).getMessageFactory();

            //           Create SOAPMessage Request
            SOAPMessage request1 = factory.createMessage();

            //           Request Header
            SOAPHeader header = request1.getSOAPHeader();

            //           Request Body
            SOAPBody body = request1.getSOAPBody();

            //           Compose the soap:Body payload
            QName payloadName =
                new QName("http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/",
                          "findSelfUserDetails", "typ");


            SOAPBodyElement payload = body.addBodyElement(payloadName);

            //           Invoke the endpoint synchronously
            SOAPMessage reply = null;
            
            if (logger.isDebugEnabled()) {
                ByteArrayOutputStream ba = new ByteArrayOutputStream();
                request1.writeTo(ba);
                logger.debug("XML Content:");
                logger.debug(ba.toString());
                
                Map<String, Object> req = bp.getRequestContext();
                for (String key : req.keySet()) {
                    
                    logger.debug("Key: "+key + " = "+req.get(key));
                }
                
            }

            try {
                //Invoke Endpoint Operation and read response
                reply = dispatch.invoke(request1);
            } 
            
            catch (WebServiceException wse) {
                wse.printStackTrace();
                if (wse.getMessage() != null && 
                    wse.getMessage().contains("401") && 
                    wse.getMessage().contains("Unauthorized")) {
                        throw new UserTokenAuthenticationException("Invalid User Token");
                    }
                
                throw (wse);

            }

            //           process the reply
            //get document
            Document doc = reply.getSOAPBody().extractContentAsDocument();


            currentUser.setPersonId(getFirstChildNodeValue(doc,
                                                           "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                           "PersonId"));

            currentUser.setPersonNumber(getFirstChildNodeValue(doc,
                                                               "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                               "PersonNumber"));


            currentUser.setUserId(getFirstChildNodeValue(doc,
                                                         "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                         "UserId"));
            currentUser.setUsername(getFirstChildNodeValue(doc,
                                                           "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                           "Username"));

            currentUser.setUserGUID(getFirstChildNodeValue(doc,
                                                           "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                           "UserGUID"));

            currentUser.setActiveFlag(getFirstChildNodeValue(doc,
                                                             "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                             "ActiveFlag"));


            currentUser.setUserDistinguishedName(getFirstChildNodeValue(doc,
                                                                        "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                                        "UserDistinguishedName"));

            //User attributes
            currentUser.setTitle(getFirstChildNodeValue(doc,
                                                        "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                        "Title"));

            currentUser.setLastName(getFirstChildNodeValue(doc,
                                                           "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                           "LastName"));

            currentUser.setFirstName(getFirstChildNodeValue(doc,
                                                            "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                            "FirstName"));

            currentUser.setMiddleNames(getFirstChildNodeValue(doc,
                                                              "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                              "MiddleNames"));

            currentUser.setDisplayName(getFirstChildNodeValue(doc,
                                                              "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                              "DisplayName"));

            currentUser.setSuffix(getFirstChildNodeValue(doc,
                                                         "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                         "Suffix"));

            currentUser.setHonors(getFirstChildNodeValue(doc,
                                                         "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                         "Honors"));

            currentUser.setPreNameAdjunct(getFirstChildNodeValue(doc,
                                                                 "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                                 "PreNameAdjunct"));

            currentUser.setKnownAs(getFirstChildNodeValue(doc,
                                                          "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                          "KnownAs"));

            currentUser.setEmailAddress(getFirstChildNodeValue(doc,
                                                               "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                               "EmailAddress"));

            currentUser.setPhoneId(getFirstChildNodeValue(doc,
                                                          "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                          "PhoneId"));

            currentUser.setPhoneAreaCode(getFirstChildNodeValue(doc,
                                                                "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                                "PhoneAreaCode"));

            currentUser.setPhoneCountryCodeNumber(getFirstChildNodeValue(doc,
                                                                         "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                                         "PhoneCountryCodeNumber"));

            currentUser.setPhoneNumber(getFirstChildNodeValue(doc,
                                                              "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                              "PhoneNumber"));

            currentUser.setLanguage(getFirstChildNodeValue(doc,
                                                           "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                           "Language"));

            currentUser.setDateFormat(getFirstChildNodeValue(doc,
                                                             "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                             "DateFormat"));

            currentUser.setTimeFormat(getFirstChildNodeValue(doc,
                                                             "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                             "TimeFormat"));

            currentUser.setCurrency(getFirstChildNodeValue(doc,
                                                           "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                           "Currency"));

            currentUser.setGroupingSeparator(getFirstChildNodeValue(doc,
                                                                    "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                                    "GroupingSeparator"));

            currentUser.setDecimalSeparator(getFirstChildNodeValue(doc,
                                                                   "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                                   "DecimalSeparator"));

            currentUser.setTimeZone(getFirstChildNodeValue(doc,
                                                           "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                           "TimeZone"));

            currentUser.setClientEncoding(getFirstChildNodeValue(doc,
                                                                 "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                                 "ClientEncoding"));

            currentUser.setTerritory(getFirstChildNodeValue(doc,
                                                            "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                            "Territory"));

            currentUser.setFontSize(getFirstChildNodeValue(doc,
                                                           "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                           "FontSize"));

            //TODO evaluate if AccessibilityMode is parsed from the right node
            NodeList nlist =
                doc.getElementsByTagNameNS("http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                           "AccessibilityMode");
            if (nlist != null && nlist.getLength() > 0 &&
                nlist.item(0).getChildNodes().getLength() > 0) {

                Node n = nlist.item(0).getFirstChild();
                if (n.getNodeValue() != null)
                    currentUser.setAccessibilityMode(n.getNodeValue());
            }

            currentUser.setColorContrast(getFirstChildNodeValue(doc,
                                                                "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                                "ColorContrast"));

            currentUser.setServerTime(getFirstChildNodeValue(doc,
                                                             "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                             "ServerTime"));

            currentUser.setServerTimeForUserInfo(getFirstChildNodeValue(doc,
                                                                        "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                                        "ServerTimeForUserInfo"));

            currentUser.setBusinessUnitId(getFirstChildNodeValue(doc,
                                                                 "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                                 "BusinessUnitId"));

            currentUser.setBusinessUnitName(getFirstChildNodeValue(doc,
                                                                   "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                                   "BusinessUnitName"));

            currentUser.setLegalEntityName(getFirstChildNodeValue(doc,
                                                                  "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                                  "LegalEntityName"));

            currentUser.setPersonTypeId(getFirstChildNodeValue(doc,
                                                               "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                               "PersonTypeId"));

            currentUser.setSystemPersonType(getFirstChildNodeValue(doc,
                                                                   "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                                   "SystemPersonType"));

            currentUser.setUserPersonType(getFirstChildNodeValue(doc,
                                                                 "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                                 "UserPersonType"));

            currentUser.setJobName(getFirstChildNodeValue(doc,
                                                          "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                          "JobName"));

            currentUser.setDepartmentName(getFirstChildNodeValue(doc,
                                                                 "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                                 "DepartmentName"));

            currentUser.setLocationTownOrCity(getFirstChildNodeValue(doc,
                                                                     "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                                     "LocationTownOrCity"));

            currentUser.setLocationPostalCode(getFirstChildNodeValue(doc,
                                                                     "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                                     "LocationPostalCode"));

            currentUser.setLocationCountry(getFirstChildNodeValue(doc,
                                                                  "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                                                                  "LocationCountry"));

            return (currentUser);

        } catch (UserTokenAuthenticationException ue) {
            throw ue;
        }
        catch (Exception e) {            
            throw new GeneralException("Could not retrieve user information and validate.",
                                                       e);
        }

    }

    /**
     *
     * @param doc
     * @param namespaceURI
     * @param namespaceLocalName
     * @return
     */
    private String getFirstChildNodeValue(Document doc, String namespaceURI,
                                          String namespaceLocalName) {

        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() +
                         " : getFirstChildNodeValue (namespaceURI: '" +
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

}
