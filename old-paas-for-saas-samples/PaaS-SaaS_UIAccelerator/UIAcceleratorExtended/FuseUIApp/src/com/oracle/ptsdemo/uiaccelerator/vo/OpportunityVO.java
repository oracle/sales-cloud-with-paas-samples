package com.oracle.ptsdemo.uiaccelerator.vo;

import java.math.BigDecimal;

import java.util.Calendar;

/**
 * All sample code is provided by Oracle for illustrative purposes only.
 * These sample code examples have not been thoroughly tested under all conditions. 
 * Oracle, therefore, cannot guarantee or imply security, reliability, serviceability, or function of the sample code.
 * All sample code contained herein are provided to you "AS IS" without any warranties of any kind. 
 * The implied warranties of non-infringement, merchantability and fitness for a particular purpose are expressly disclaimed.
 */
public class OpportunityVO {
    
    
    private Long optyId;
    private String optyName;
    private String partyUniqueName;
    private BigDecimal revenueValue;
    private Calendar optyCreationDate;
    private Calendar optyLastUpdateDate;
            
    
    public OpportunityVO() {
        super();
    }

    public void setOptyId(Long optyId) {
        this.optyId = optyId;
    }

    public Long getOptyId() {
        return optyId;
    }

    public void setOptyName(String optyName) {
        this.optyName = optyName;
    }

    public String getOptyName() {
        return optyName;
    }

    public void setPartyUniqueName(String partyUniqueName) {
        this.partyUniqueName = partyUniqueName;
    }

    public String getPartyUniqueName() {
        return partyUniqueName;
    }

    public void setRevenueValue(BigDecimal revenueValue) {
        this.revenueValue = revenueValue;
    }

    public BigDecimal getRevenueValue() {
        return revenueValue;
    }

    public void setOptyCreationDate(Calendar optyCreationDate) {
        this.optyCreationDate = optyCreationDate;
    }

    public Calendar getOptyCreationDate() {
        return optyCreationDate;
    }

    public void setOptyLastUpdateDate(Calendar optyLastUpdateDate) {
        this.optyLastUpdateDate = optyLastUpdateDate;
    }

    public Calendar getOptyLastUpdateDate() {
        return optyLastUpdateDate;
    }


}
