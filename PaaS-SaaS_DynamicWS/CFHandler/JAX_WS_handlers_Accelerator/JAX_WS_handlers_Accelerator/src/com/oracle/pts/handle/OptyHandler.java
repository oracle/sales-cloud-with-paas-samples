package com.oracle.pts.handle;

import com.oracle.pts.ws.CRMProcessor;

import javax.xml.ws.handler.soap.SOAPMessageContext;

public class OptyHandler extends EntityHandler {
    public OptyHandler() {
        super();
    }
    public boolean handleMessage(SOAPMessageContext ctx) {
        objectName = CRMProcessor.OPPORTUNITY;
        System.out.println("OptyHandler is called");
        return super.handleMessage(ctx);
    }
}
