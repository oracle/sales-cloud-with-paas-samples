/* Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved */
package oracle.cloud.sampleapps.nearmejwt.model.facade;

public class AccountDisplay {
    private Long partyId;
    private String organizationName;
    private String formattedMultiLineAddress;
    private String contactInfo;
    private Double milesFromAcct;
    
    public AccountDisplay() {
        super();
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    public Long getPartyId() {
        return partyId;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setFormattedMultiLineAddress(String formattedMultiLineAddress) {
        this.formattedMultiLineAddress = formattedMultiLineAddress;
    }

    public String getFormattedMultiLineAddress() {
        return formattedMultiLineAddress;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getContactInfo() {
        return this.contactInfo;
    }

    public void setMilesFromAcct(Double milesFromAcct) {
        this.milesFromAcct = milesFromAcct;
    }

    public Double getMilesFromAcct() {
        return milesFromAcct;
    }
}
