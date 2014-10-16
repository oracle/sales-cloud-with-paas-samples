package com.oracle.ptsdemo.healthcare.business.wsclient;


import com.oracle.ptsdemo.healthcare.business.datasync.dynamic.CRMProcessor;


import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;


/**
 */
public class EntityHandler implements SOAPHandler<SOAPMessageContext> {

    static org.apache.log4j.Logger logger =
        org.apache.log4j.Logger.getLogger(EntityHandler.class);


    /**
     * @return
     */
    public Set<QName> getHeaders() {
        if (logger.isDebugEnabled()) {
            logger.debug("Set<QName> getHeaders()--> return null");
        }        
        Set<QName> headers = null;
        
        return headers;
    }

    /**
     * @param ctx
     */
    public void close(MessageContext ctx) {
        if (logger.isDebugEnabled()) {
            logger.debug("void close(MessageContext ctx)--> do nothing");
        }

    }

    /**
     * @param ctx
     * @return
     */
    public boolean handleFault(SOAPMessageContext ctx) {
        if (logger.isDebugEnabled()) {
            logger.debug("boolean handleFault(SOAPMessageContext ctx) --> return true");
        }

        return true;
    }

    /**
     * @param ctx
     * @return
     */
    public boolean handleMessage(SOAPMessageContext ctx) {

        boolean returnValue = false;


        try {
            if (!CRMProcessor.isDisabled()) {
                CRMProcessor crmProcessor = new CRMProcessor();
                crmProcessor.handleMessage(ctx);
                returnValue = true;
            } else {


                SOAPBody soapBody;
                SOAPHeader soapHeader;
                SOAPPart soapPart;
                soapBody = ctx.getMessage().getSOAPBody();
                soapHeader = ctx.getMessage().getSOAPHeader();
                soapPart = ctx.getMessage().getSOAPPart();
                returnValue = true;

            }
        } catch (Exception e) {
            logger.error("boolean handleMessage(SOAPMessageContext ctx): Error handling SoapMessage",
                         e);
        }
        return returnValue;

    }

}

