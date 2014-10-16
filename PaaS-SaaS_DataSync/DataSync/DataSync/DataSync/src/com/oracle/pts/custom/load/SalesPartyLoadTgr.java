package com.oracle.pts.custom.load;

import com.oracle.pts.config.FusionConfig;
import com.oracle.pts.custom.client.SalesPartyClient;
import com.oracle.pts.salesparty.wsclient.SalesPartyService_Service;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;

public class SalesPartyLoadTgr extends SalesPartyClient {
    public SalesPartyLoadTgr() {
        super();
    }

}
