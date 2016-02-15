package com.oracle.pts.util;

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


public class XMLUtil {
    private DocumentBuilderFactory factory;
    private DocumentBuilder builder;
    private Document document;
    

    public static void main(String[] args) {
        XMLUtil xmlUtil = new XMLUtil();
    }

    public XMLUtil() {
        super();
        init();
    }
    public Node createNode(String value) {

        Node node = document.createElement(value);
        return node;
    }

    private void createChildNode(Node parentNode, String value) {
        int indexOfDot = value.indexOf('.');
        if (indexOfDot > 0) {
            String parent = value.substring(0, indexOfDot);
            String child = value.substring(indexOfDot, value.length());
            Node childNode = document.createElement(parent);
            createChildNode(childNode, child);
        } else {
            Node childNode = document.createElement(value);
            parentNode.appendChild(childNode);

        }
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

    public String format(String unformattedXml) {
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
            throw new RuntimeException(e);
        }
    }

    public Document parseXmlFile(String in) {
        
        Document doc = null;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(in));
            doc = db.parse(is);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

    public void print(Node node) {
        
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
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
    public  String getXMLString(Node node) {
        String xmlString = null;
        Transformer transformer;
        try {
            transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            StreamResult result = new StreamResult(new StringWriter());
            DOMSource source = new DOMSource(node);
            transformer.transform(source, result);

             xmlString = result.getWriter().toString();
            System.out.println(xmlString);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        return xmlString;
    }

    public void formatXML(String xmlString) {
        InputSource is = new InputSource(new StringReader(xmlString));
        Document doc;
        try {
            doc = builder.parse(is);
            print(doc);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
