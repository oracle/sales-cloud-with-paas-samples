package com.oracle.ptsdemo.healthcare.business.wsclient;


import java.util.ResourceBundle;


/**
 */
public class ObjectClient {

    private int DEFAULT_ROW_SIZE = 200;

    private String DEFAULT_OWSS_SECURITY_POLICY =
        "oracle/wss_username_token_over_ssl_client_policy";

    /**
     */
    protected int rowSize;

    /**
     */
    protected String securityPolicy =
        "oracle/wss_username_token_over_ssl_client_policy";

    /**
     */
    protected String securityPolicySrc =
        "oracle/wss_username_token_over_ssl_client_policy";

    /**
     */
    protected String securityPolicyTgr =
        "oracle/wss_username_token_over_ssl_client_policy";

    /**
     */
    protected String jwtToken;

    /**
     */
    public ObjectClient() {
        super();
        setSecurityPolicy();
    }

    /**
     * @param name
     * @return
     */
    public String getValue(String name) {
        ResourceBundle resouceBoundle = ResourceBundle.getBundle("load");
        String value = resouceBoundle.getString(name).trim();
        return value;
    }

    /**
     * @param name
     * @return
     */
    public String getCRMValue(String name) {
        ResourceBundle resouceBoundle = ResourceBundle.getBundle("crm");
        String value = resouceBoundle.getString(name).trim();
        return value;
    }

    /**
     */
    public void setRowSize() {
        try {
            rowSize = Integer.parseInt(getValue("ROW_SIZE"));
        } catch (Exception e) {
            rowSize = DEFAULT_ROW_SIZE;
        }
    }

    /**
     */
    public void setSecurityPolicy() {
        try {
            securityPolicy = getCRMValue("SECURITY_POLICY");
        } catch (Exception e) {
            securityPolicy = DEFAULT_OWSS_SECURITY_POLICY;
        }
        try {
            securityPolicySrc = getCRMValue("SECURITY_POLICY_SRC");
        } catch (Exception e) {
            securityPolicySrc = DEFAULT_OWSS_SECURITY_POLICY;
        }
        try {
            securityPolicyTgr = getCRMValue("SECURITY_POLICY_TGR");
        } catch (Exception e) {
            securityPolicyTgr = DEFAULT_OWSS_SECURITY_POLICY;
        }
    }

    /**
     * @param pValue
     * @return
     */
    protected boolean convertStringToBoolean(String pValue) {
        boolean returnValue = false;
        if ("T".equals(pValue)) {
            returnValue = true;
        }
        return returnValue;

    }

    /**
     * @param pValue
     * @return
     */
    protected String convertBooleanToString(boolean pValue) {
        String returnValue = "F";
        if (pValue) {
            returnValue = "T";
        }
        return returnValue;

    }

    /**
     * @param jwtToken
     */
    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    /**
     * @return
     */
    public String getJwtToken() {
        return jwtToken;
    }
}
