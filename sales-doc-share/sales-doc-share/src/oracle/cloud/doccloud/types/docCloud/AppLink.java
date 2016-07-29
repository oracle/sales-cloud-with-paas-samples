package oracle.cloud.doccloud.types.docCloud;

/* Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved.*/

/**
 * POJO Object representing AppLink resource of the Document Cloud Service.
 * This object will be used to map the JSON object received as response to 
 * AppLink creation request to Document Cloud Service.
 */

public class AppLink {
    
    private String accessToken;
    private String appLinkID;
    private String appLinkUrl;
    private String errorCode;
    private String id;
    private String refreshToken;
    private String role;
    private String type;
    
    public AppLink() {
        super();
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAppLinkID(String appLinkID) {
        this.appLinkID = appLinkID;
    }

    public String getAppLinkID() {
        return appLinkID;
    }

    public void setAppLinkUrl(String appLinkUrl) {
        this.appLinkUrl = appLinkUrl;
    }

    public String getAppLinkUrl() {
        return appLinkUrl;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

