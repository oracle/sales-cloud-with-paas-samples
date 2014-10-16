package com.oracle.pts.custom.load;

import com.oracle.pts.salesparty.wsclient.generated.ObjectFactory;
import com.oracle.pts.salesparty.wsclient.generated.OrganizationParty;
import com.oracle.pts.salesparty.wsclient.generated.PartySite;
import com.oracle.pts.salesparty.wsclient.generated.Person;
import com.oracle.pts.salesparty.wsclient.generated.Relationship;
import com.oracle.pts.salesparty.wsclient.generated.SalesParty;

import java.util.ArrayList;
import java.util.List;

public class DataLoadSalesParty {
    int counter = 0;
    SalesPartyLoadSrc salesPartySrc = new SalesPartyLoadSrc();
    SalesPartyLoadTgr salesPartyTgr = new SalesPartyLoadTgr();
    //DataLoadLocation dataLoadLocation = new DataLoadLocation();
 
    public DataLoadSalesParty() {
        super();
    }


   
}
