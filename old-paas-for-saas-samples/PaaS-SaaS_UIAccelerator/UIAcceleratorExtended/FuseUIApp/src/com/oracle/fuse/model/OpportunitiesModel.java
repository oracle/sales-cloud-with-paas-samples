package com.oracle.fuse.model;

import java.util.Calendar;

public class OpportunitiesModel {
    
    int win;
    String name;
    String customer;
    int revenue;
    Calendar closeDate;
    String salesStage;
    String winProbabilityStyle;
    
    public OpportunitiesModel(int win, String name, String customer, int revenue, Calendar closeDate, String salesStage) {
        this.win = win;
        this.name = name;
        this.customer = customer;
        this.revenue = revenue;
        this.closeDate = closeDate;
        this.salesStage = salesStage;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getWin() {
        return win;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setCloseDate(Calendar closeDate) {
        this.closeDate = closeDate;
    }

    public Calendar getCloseDate() {
        return closeDate;
    }

    public void setSalesStage(String salesStage) {
        this.salesStage = salesStage;
    }

    public String getSalesStage() {
        return salesStage;
    }

    public void setWinProbabilityStyle(String winProbabilityStyle) {
        this.winProbabilityStyle = winProbabilityStyle;
    }

    public String getWinProbabilityStyle() {
        if(win <= 20)
            return "percent-20";
        else if(win <= 60)
            return "percent-60";
        else if(win <= 100)
            return "percent-100";
        return "percent-100";
    }
}
