package com.oracle.fuse.model;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.share.ADFContext;

public class OpportunitiesBean {
    public OpportunitiesBean() {
    }

    public void selectQuaterListener(ValueChangeEvent valueChangeEvent) {
        String newValue = valueChangeEvent.getNewValue().toString();
        ADFContext.getCurrent().getPageFlowScope().put("selectedItem", newValue);
        
    }
}
