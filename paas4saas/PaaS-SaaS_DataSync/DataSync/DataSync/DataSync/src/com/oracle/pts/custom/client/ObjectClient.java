package com.oracle.pts.custom.client;

import com.oracle.pts.util.HttpUtil;

import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class ObjectClient {
    protected int rowSize  = 200;
    protected String securityPolicy = "oracle/wss_username_token_over_ssl_client_policy";
    protected String securityPolicySrc = "oracle/wss_username_token_over_ssl_client_policy";
    protected String securityPolicyTgr = "oracle/wss_username_token_over_ssl_client_policy";
    
    public ObjectClient() {
        super();
      //  setRowSize();
        setSecurityPolicy();
    }

    public String getValue(String name){
        ResourceBundle resouceBoundle =ResourceBundle.getBundle("load");      
        String value = resouceBoundle.getString(name).trim();
        return value;
    }    
    public String getCRMValue(String name){
        ResourceBundle resouceBoundle =ResourceBundle.getBundle("crm");      
        String value = resouceBoundle.getString(name).trim();
        return value;
    }    
    public void setRowSize(){
        try{
        rowSize = Integer.parseInt(getValue("ROW_SIZE"));
        }
        catch(Exception e){
            
        }
    }
    public void setSecurityPolicy(){
        try{
         securityPolicy = getCRMValue("SECURITY_POLICY");
         }
         catch(Exception e){
             
         }
       try{
        securityPolicySrc = getCRMValue("SECURITY_POLICY_SRC");
        }
        catch(Exception e){
            
        }
        try{
        securityPolicyTgr = getCRMValue("SECURITY_POLICY_TGR");
        }
        catch(Exception e){
            
        }
    }
    protected boolean convertStringToBoolean(String pValue){
        boolean returnValue = false;
        if(pValue.equals("T")){
            returnValue = true;
        }
        return returnValue;
        
    }
    protected  String convertBooleanToString(boolean pValue){
        String returnValue = "F";
        if(pValue==true){
            returnValue = "T";
        }
        return returnValue;
        
    }    
}
