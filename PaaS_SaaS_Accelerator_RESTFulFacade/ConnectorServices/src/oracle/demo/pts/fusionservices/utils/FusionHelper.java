

package oracle.demo.pts.fusionservices.utils;


import com.oracle.xmlns.adf.svc.types.Conjunction;
import com.oracle.xmlns.adf.svc.types.FindControl;
import com.oracle.xmlns.adf.svc.types.FindCriteria;
import com.oracle.xmlns.adf.svc.types.ViewCriteria;
import com.oracle.xmlns.adf.svc.types.ViewCriteriaItem;
import com.oracle.xmlns.adf.svc.types.ViewCriteriaRow;

import java.io.ByteArrayInputStream;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import java.util.logging.Logger;



import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;

import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.dom.DOMSource;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


// Collection of helper functions

public class FusionHelper {
    
    private static String defaultMajorQuerySeperator = "\\|";
    private static String defaultMinorQuerySeperator = "---";
    
    /**
     * @param pFc1  : An object of type FindCriter       
     * @param pSOAPMessageString
     * @param pAttributes
     * @param pQuery
     * @param pConjunction
     * @param pFetchSize
     * @param pFetchStart
     * @return
     * @throws SOAPException
     * @throws UnsupportedEncodingException
     * @throws IOException
     * @throws JAXBException
     */
    public static FindCriteria createCustomFindCriteria(FindCriteria pFc,
                                          String pSOAPMessageString,
                                          String pAttributes,
                                          String pQuery,
                                          String pConjunction,
                                          int pFetchSize,
                                          int pFetchStart) throws SOAPException,
                                                                      UnsupportedEncodingException,
                                                                      IOException,
                                                                      JAXBException,Exception {
       
        if ((pSOAPMessageString!=null) && pSOAPMessageString.length()>1)
            pFc = FusionHelper.createFindCriteriaFromSOAPMessage(pSOAPMessageString);
        else 
            pFc = new FindCriteria();
        
        // Futher refine if required
        pFc=FusionHelper.addFindAttributes(pFc, pAttributes);
        pFc=FusionHelper.addQueryParameter(pFc, pQuery,pConjunction);
        pFc.setFetchSize(pFetchSize); // Retrieve the maximum amount of rows
        pFc.setFetchStart(pFetchStart); // Start from 0, ie the beginning
        return pFc;
    }
    
    /**
     * Adds FindAttribute to the FindCriteria, the idea here is to reduce the amount of data being returned back
     * @param pFc
     * @param pAttributes
     * @return
     */
    public static FindCriteria addFindAttributes(FindCriteria pFc,
                                                 String pAttributes) {
        Logger logger = Logger.getLogger("FusionRESTHelper.addQueryParameter");
        // Collection of helper methods, if null then ignore
        if ((pAttributes != null) && (pAttributes.length() > 0)) {
            String[] attributeTokens = pAttributes.split(",");
            for (int i = 0; i < attributeTokens.length; i++) {
                pFc.getFindAttribute().add(attributeTokens[i]);
                logger.info("Attribute Restriction : " + attributeTokens[i]);
            }
        }
        return pFc;
    }

    // Helper Method which adds queryParameters to findCriteria
    // This only works for "top level" attributes, not for nested ones, ie level1 parameters
    // query would look something like   Name =

    /**
     * Overloaded to provide default seperator of | for major and . for minor
     * e.g    Field1%=%10,Field2%=%40,Field3%=%40    is the default
     * but if you need to use % in your payloads then this can be changed.
     * @param pFc
     * @param pQueryParams
     * @param pQueryConjunction
     * @return
     */
    public static FindCriteria addQueryParameter(FindCriteria pFc,
                                                  String pQueryParams,
                                                  String pQueryConjunction) {
        return (addQueryParameter(pFc, pQueryParams, pQueryConjunction, defaultMajorQuerySeperator,
                                  defaultMinorQuerySeperator));
    }


    /**
     * @param pFc
     * @param pQueryParams
     * @param pQueryConjunction
     * @param queryMajorSeperator
     * @param queryMinorSeperator
     * @return
     */
    public static FindCriteria addQueryParameter(FindCriteria pFc,
                                                 String pQueryParams,
                                                 String pQueryConjunction,
                                                 String queryMajorSeperator,
                                                 String queryMinorSeperator) {
        Logger logger = Logger.getLogger("FusionRESTHelper.addQueryParameter");
        Conjunction conjunction = Conjunction.AND; // Default is and
        if (pQueryConjunction != null) {
            if (pQueryConjunction.equalsIgnoreCase("AND"))
                conjunction = Conjunction.AND;
            else if (pQueryConjunction.equalsIgnoreCase("AND_NOT"))
                conjunction = Conjunction.AND_NOT;
            else if (pQueryConjunction.equalsIgnoreCase("OR"))
                conjunction = Conjunction.OR;
            else if (pQueryConjunction.equalsIgnoreCase("OR_NOT"))
                conjunction = Conjunction.OR_NOT;
        }


        // Split multiple predicates by , and each attribute,operator,value by +
        if (pQueryParams != null && pQueryParams.length() > 0) {
            String[] qpairs = pQueryParams.split(queryMajorSeperator);
            // This gives us array where clauses predicates

            // Add New VC
            ViewCriteria vc1 = new ViewCriteria();
            vc1.setConjunction(conjunction);
            pFc.setFilter(vc1);
            ViewCriteriaRow vcr1 = new ViewCriteriaRow();
            vc1.getGroup().add(vcr1);
            vcr1.setUpperCaseCompare(true);
            vcr1.setConjunction(conjunction);

            // Now Add each Predicate
            for (String qpair : qpairs) {
                // Extract Predicate
                // Split multiple by ' '
                String singlePredicate[] = qpair.split(queryMinorSeperator);
                String attribute = singlePredicate[0];
                String operation = singlePredicate[1];
                String value = singlePredicate[2];
                //
                ViewCriteriaItem vci1 = new ViewCriteriaItem();
                vcr1.getItem().add(vci1);
                vci1.setConjunction(conjunction);
                vci1.setUpperCaseCompare(true);
                vci1.setAttribute(attribute);
                
                vci1.setOperator(operation);
                vci1.getValue().add(value);
                logger.info("Added predicate " + attribute + " " + operation +
                            " " + value);
            }
        }
        return pFc;
    }
    
    public static FindCriteria createFindCriteriaFromSOAPMessage(String soapMessageString) throws SOAPException,
                                                                            UnsupportedEncodingException,
                                                                            IOException,
                                                                            JAXBException, Exception {
        
      
        // Check soapMessageString contains at least one findCriteria
        if (!soapMessageString.toUpperCase().contains("FINDCRITERIA")) {
            // No findCriteria found in string, therefore throw error, 
            // Need proper exception class simple error not elegant, fix later
            throw new Exception("No <FindCriteria> element found");
            
        }
        MimeHeaders mh=new MimeHeaders();
        mh.addHeader("content-type","text/xml");
        MessageFactory mf=MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL);
        SOAPMessage message =mf.createMessage(mh,new ByteArrayInputStream(soapMessageString.getBytes("UTF-8")));
        
        Element method =
                    getNthElement(message.getSOAPBody(),0);

                FindCriteria fc =
                    fetchParameter(method, 0, FindCriteria.class);
                

        return fc;
    }
    
    private static Element getNthElement(Element element, int index) throws javax.xml.soap.SOAPException {
            
            
            NodeList list = element.getChildNodes();
            int i = list.getLength();
            for (int j = 0; j < i; j++) {
                Node next = list.item(j);
                if (next instanceof Element) {
                    // Count down index until we find the right match
                    if (--index < 0) {
                        return (Element)next;
                    }
                }
            }
            
            return null;
        }

    
    
    private static <T> T fetchParameter(
            Element method,
            int index,
            Class<T> type) throws javax.xml.bind.JAXBException, SOAPException {
        
        Element e = getNthElement(method,index);


        Class objectFactory = null;
        try {
            objectFactory = type.getClassLoader().loadClass(type.getPackage().getName() + ".ObjectFactory");
        } catch (ClassNotFoundException f) {
            throw new IllegalStateException("Cannot find object factory for class", f);
        }


        return type.cast(JAXBContext.newInstance(objectFactory).createUnmarshaller().unmarshal(
                new DOMSource(e), type).getValue());
    }

    public static void setDefaultMajorQuerySeperator(String defaultMajorQuerySeperator) {
        FusionHelper.defaultMajorQuerySeperator = defaultMajorQuerySeperator;
    }

    public static String getDefaultMajorQuerySeperator() {
        return defaultMajorQuerySeperator;
    }

    public static void setDefaultMinorQuerySeperator(String defaultMinorQuerySeperator) {
        FusionHelper.defaultMinorQuerySeperator = defaultMinorQuerySeperator;
    }

    public static String getDefaultMinorQuerySeperator() {
        return defaultMinorQuerySeperator;
    }
}
