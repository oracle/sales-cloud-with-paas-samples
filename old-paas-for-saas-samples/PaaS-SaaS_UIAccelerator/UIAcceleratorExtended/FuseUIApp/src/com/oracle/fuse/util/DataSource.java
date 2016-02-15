package com.oracle.fuse.util;

import com.oracle.fuse.model.ContactModel;
import com.oracle.fuse.model.OpportunitiesModel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.faces.event.ActionEvent;

public class DataSource {
    
    List<OpportunitiesModel> opportunitiesList = new ArrayList<OpportunitiesModel>();
    List<String> revenueItems= new ArrayList<String>();
    List<ContactModel> contactList = new ArrayList<ContactModel>();
    public DataSource() {
        
        opportunitiesList.add(new OpportunitiesModel(100, "Mithuu", "HDF Bank India", 0, new GregorianCalendar(2013,1,31), "Qualification"));
        opportunitiesList.add(new OpportunitiesModel((int)(Math.random()*100), "Opportunity 1", "Customer 1", 0, new GregorianCalendar(2013,20,13), "Qualificatoin"));
        opportunitiesList.add(new OpportunitiesModel((int)(Math.random()*100), "Opportunity 2", "Customer 2", 0, new GregorianCalendar(2013,20,13), "Qualificatoin"));
        opportunitiesList.add(new OpportunitiesModel((int)(Math.random()*100), "Opportunity 3", "Customer 3", 0, new GregorianCalendar(2013,20,13), "Qualificatoin"));
        opportunitiesList.add(new OpportunitiesModel((int)(Math.random()*100), "Opportunity 4", "Customer 4", 0, new GregorianCalendar(2013,20,13), "Qualificatoin"));
        opportunitiesList.add(new OpportunitiesModel((int)(Math.random()*100), "Opportunity 5", "Customer 5", 0, new GregorianCalendar(2013,20,13), "Qualificatoin"));
        opportunitiesList.add(new OpportunitiesModel((int)(Math.random()*100), "Opportunity 6", "Customer 6", 0, new GregorianCalendar(2013,20,13), "Qualificatoin"));
        opportunitiesList.add(new OpportunitiesModel((int)(Math.random()*100), "Opportunity 6", "Customer 6", 0, new GregorianCalendar(2013,20,13), "Qualificatoin"));
        opportunitiesList.add(new OpportunitiesModel((int)(Math.random()*100), "Opportunity 6", "Customer 6", 0, new GregorianCalendar(2013,20,13), "Qualificatoin"));
        opportunitiesList.add(new OpportunitiesModel((int)(Math.random()*100), "Opportunity 6", "Customer 6", 0, new GregorianCalendar(2013,20,13), "Qualificatoin"));
        opportunitiesList.add(new OpportunitiesModel((int)(Math.random()*100), "Opportunity 6", "Customer 6", 0, new GregorianCalendar(2013,20,13), "Qualificatoin"));
        opportunitiesList.add(new OpportunitiesModel((int)(Math.random()*100), "Opportunity 6", "Customer 6", 0, new GregorianCalendar(2013,20,13), "Qualificatoin"));
        opportunitiesList.add(new OpportunitiesModel((int)(Math.random()*100), "Opportunity 6", "Customer 6", 0, new GregorianCalendar(2013,20,13), "Qualificatoin"));
               
        revenueItems.add("");
        
        contactList.add(new ContactModel(true, "Alan Adams", "", "", "+1 (800) 555-8355", "firstname_lastname@domain.com"));
        
    }


    public void setOpportunitiesList(List<OpportunitiesModel> opportunitiesList) {
        this.opportunitiesList = opportunitiesList;
    }

    public List<OpportunitiesModel> getOpportunitiesList() {
        return opportunitiesList;
    }

    public void setRevenueItems(List<String> revenueItems) {
        this.revenueItems = revenueItems;
    }

    public List<String> getRevenueItems() {
        return revenueItems;
    }

    public void setContactList(List<ContactModel> contactList) {
        this.contactList = contactList;
    }

    public List<ContactModel> getContactList() {
        return contactList;
    }
}
