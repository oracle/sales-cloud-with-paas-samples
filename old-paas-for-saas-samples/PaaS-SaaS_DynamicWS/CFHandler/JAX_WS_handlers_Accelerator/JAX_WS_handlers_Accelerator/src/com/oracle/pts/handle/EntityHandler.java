package com.oracle.pts.handle;


import com.oracle.pts.custom.AttributeEntry;
import com.oracle.pts.custom.CustomFieldHolder;
import com.oracle.pts.custom.DataSet;
import com.oracle.pts.util.XMLUtil;

import com.oracle.pts.ws.CRMProcessor;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.soap.SOAPBody;

import javax.xml.soap.SOAPElement;

import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.soap.SOAPMessageContext;


public class EntityHandler implements SOAPHandler<SOAPMessageContext> {
    protected String objectName;
    public Set<QName> getHeaders() {
        return null;
        
    }

    public void close(MessageContext ctx) {
    }

    public boolean handleFault(SOAPMessageContext ctx) {
        return true;
    }

    public boolean handleMessage(SOAPMessageContext ctx) {
        System.out.println("handleMessage is called");
        if(CRMProcessor.disable==false){
            CRMProcessor crmProcessor = new CRMProcessor(objectName);
            boolean returnValue = crmProcessor.handleMessage(ctx);
            
            
            return returnValue;
        }
        else{

        boolean returnValue = true;
                   try {
                SOAPBody soapBody;
                SOAPHeader soapHeader;
                SOAPPart soapPart;
                soapBody = ctx.getMessage().getSOAPBody();
                soapHeader = ctx.getMessage().getSOAPHeader();
                soapPart = ctx.getMessage().getSOAPPart();
                XMLUtil xmlUtil = new XMLUtil();
                String xmlString = xmlUtil.getXMLString(soapBody);
                System.out.println("xmlString " + xmlString);
                       
            } catch (Exception e) {
                e.printStackTrace();
            }
    
            return returnValue;
        }
    }

}

