package com.oracle.fuse.model;

import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.context.AdfFacesContext;

public class OpportunitiesContactBean {
    private RichTable contactTable;

    public OpportunitiesContactBean() {
    }

    public void addContact() {
        AdfFacesContext.getCurrentInstance().addPartialTarget(contactTable);
    }

    public void setContactTable(RichTable contactTable) {
        this.contactTable = contactTable;
    }

    public RichTable getContactTable() {
        return contactTable;
    }
}
