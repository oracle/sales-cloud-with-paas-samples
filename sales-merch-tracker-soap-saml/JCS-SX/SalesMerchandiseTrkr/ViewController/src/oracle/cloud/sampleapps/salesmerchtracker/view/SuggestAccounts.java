// Copyright © 2015, Oracle and/or its affiliates. All rights reserved

package oracle.cloud.sampleapps.salesmerchtracker.view;

import java.util.ArrayList;
import java.util.List;


import javax.faces.model.SelectItem;

import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.ServiceException;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.facade.SalesPartyServiceFacade;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.facade.SimplifiedSalesParty;

public class SuggestAccounts {
    public SuggestAccounts() {
    }

    public List<SelectItem> getAccounts(String string) {
        List<SelectItem> accounts = null;
        List<SimplifiedSalesParty> simplifiedSalesParty = null;
        SalesPartyServiceFacade af = null;
        long partyId;
        String partyName = null;
        SelectItem selectItem = null;
        
        
        accounts = new ArrayList<SelectItem>();
        af = new SalesPartyServiceFacade();        
        try {
            simplifiedSalesParty = af.getSalesPartyList(string);
            if (simplifiedSalesParty != null)
            {
              for (SimplifiedSalesParty res: simplifiedSalesParty)
                  {
                    //Get the partyName and partyId from the response message
                    partyId = res.getPartyId();
                    partyName = res.getPartyName();

                    selectItem = new SelectItem();
                    selectItem.setValue(partyName);
                    selectItem.setLabel(partyName);
                    accounts.add(selectItem);
                  }
                  }
            
        } 
                catch (ServiceException e) {

              e.printStackTrace();
        }
      return accounts;
    }
}

