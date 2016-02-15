package com.oracle.fuse.model;

public class ContactModel {
    
    Boolean favorite;
    String name;
    String account;
    String jobTitle;
    String phoneNumber;
    String email;
    
    public ContactModel(Boolean favorite, String name, String account, String jobTitle, String phoneNumber, String email) {
        this.favorite = favorite;
        this.name = name;
        this.account = account;
        this.jobTitle = jobTitle;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
