package com.oracle.ptsdemo.healthcare.business.datasync.load.source;

import com.oracle.ptsdemo.healthcare.business.wsclient.SalesPartyClient;


/**
 */
public class SalesPartyLoadSrc extends SalesPartyClient {
    /**
     */
    public SalesPartyLoadSrc() {
        super();
    }

    /**
     * @param jwtToken
     */
    public SalesPartyLoadSrc(String jwtToken) {

        super(jwtToken);
    }

}
