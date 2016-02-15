// Copyright © 2015, Oracle and/or its affiliates. All rights reserved

package oracle.cloud.sampleapps.salesmerchtracker.model.proxy.facade;

public class SimplifiedSalesParty {
    protected long partyId;
    protected String partyName;
    
    public SimplifiedSalesParty() {
        super();
    }

    public SimplifiedSalesParty(long partyId, String partyName) {
        setPartyId(partyId);
        setPartyName(partyName);
    }
    
    public void setPartyId(long partyId) {
        this.partyId = partyId;
    }

    public long getPartyId() {
        return partyId;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getPartyName() {
        return partyName;
    }
}
