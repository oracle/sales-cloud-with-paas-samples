package com.oracle.ptsdemo.healthcare.business.util;


import com.oracle.ptsdemo.healthcare.business.HealthCareException;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


/**
 */
public class XMLUtil {
    private DocumentBuilderFactory factory;
    private DocumentBuilder builder;
    private Document document;



    /**
     */
    public XMLUtil() {
        super();
        init();
    }
    /*
    public Node createChildNode(Node parentNode,String value){
        Node node = document.createElement(value);
        goChild(node,value);
        return node;
    }
*/

    /**
     * @param value
     * @return
     */
    public Node createNode(String value) {

        Node node = document.createElement(value);
        return node;
    }


    private void init() {
        factory = DocumentBuilderFactory.newInstance();
        try {
            builder = factory.newDocumentBuilder();
            document = builder.newDocument();
        } catch (ParserConfigurationException parserException) {
            parserException.printStackTrace();
        }

    }

    /**
     * @param unformattedXml
     * @return
     */
    public String format(String unformattedXml) throws HealthCareException {
        try {
            final Document document = parseXmlFile(unformattedXml);

            OutputFormat format = new OutputFormat(document);
            format.setLineWidth(65);
            format.setIndenting(true);
            format.setIndent(2);
            Writer out = new StringWriter();
            XMLSerializer serializer = new XMLSerializer(out, format);
            serializer.serialize(document);

            return out.toString();
        } catch (IOException e) {
            throw new HealthCareException(e);
        }
    }

    /**
     * @param in
     * @return
     */
    public Document parseXmlFile(String in) throws HealthCareException {
        
        Document doc = null;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(in));
            doc = db.parse(is);
        } catch (Exception e) {
          throw new HealthCareException(e);   
        } 
        return doc;
    }

    /**
     * @param node
     */
    public void print(Node node) throws HealthCareException {
        
        System.out.println("xmlUtil.print is called*************** ");
        Transformer transformer;
        try {
            transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            StreamResult result = new StreamResult(new StringWriter());
            DOMSource source = new DOMSource(node);
            transformer.transform(source, result);

            String xmlString = result.getWriter().toString();
            System.out.println(xmlString);
        } catch (TransformerConfigurationException e) {
            throw new HealthCareException(e);
        } catch (TransformerException e) {
            throw new HealthCareException(e);
        }
    }

    /**
     * @param xmlString
     */
    public void formatXML(String xmlString) throws HealthCareException {
        InputSource is = new InputSource(new StringReader(xmlString));
        Document doc;
        try {
            doc = builder.parse(is);
            print(doc);
        } catch (SAXException e) {
            throw new HealthCareException(e);
        } catch (IOException e) {
            throw new HealthCareException(e); 
        }
    }

}
