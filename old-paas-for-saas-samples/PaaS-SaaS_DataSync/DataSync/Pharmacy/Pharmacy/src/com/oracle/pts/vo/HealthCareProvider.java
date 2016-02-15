package com.oracle.pts.vo;

public class HealthCareProvider {
    private String name;
    private String tel;
    private String id;
    private String fax;
    private String loc;
    public HealthCareProvider() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return tel;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getFax() {
        return fax;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getLoc() {
        return loc;
    }
}
