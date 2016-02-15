
package oracle.demo.pts.fusionservices.utils;

/**
 * @author      Angelo Santagata <angelos.santagata.com>
 * @version     1.5
 * @since       2014-03-28
 *
 */


import com.sun.xml.ws.api.addressing.AddressingVersion;
import com.sun.xml.ws.developer.WSBindingProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import weblogic.wsee.jws.jaxws.owsm.SecurityPolicyFeature;


public abstract class FusionService {
    // Objects for the various endpoints

    protected String fusionEndpointURL;
    protected String fusionUsername;
    protected String fusionPassword;
    protected String fusionJWTToken;
    protected int fusionFetchSize=10;
    int fusionFetchStart=0;
    public Logger logger = Logger.getLogger(this.getClass().getName());
    Properties prop;
    boolean initialised=false;  // Default is false
    WSBindingProvider wbprovider;
    
    final AddressingVersion m_WS_ADDR_VER = AddressingVersion.W3C;
    // 
    final String SSLSecurityPolicy="oracle/wss_username_token_over_ssl_client_policy";
    final String nonSSLSecurityPolicy="oracle/wss_username_token_client_policy";
    
    
     
    SecurityPolicyFeature[] m_securityFeature =
        new SecurityPolicyFeature[] { new SecurityPolicyFeature(SSLSecurityPolicy) };
                
   
      
   
    public FusionService() {      
              System.setProperty("javax.xml.transform.TransformerFactory",
                      "com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl");
          }
    /**
     * @param pJWTToken
     * @param pUsername
     * @param pPassword
     */
    public abstract void initialiseConnection(String pJWTToken, String pUsername, String pPassword, String pFusionEndpointURL, int pFetchSize, int pFetchStart);
    
       


    protected void initFusionEndpoint(String pJWTToken, String pUsername, String pPassword, WSBindingProvider wbprovider, String pFusionEndpointURL, int pFetchSize, int pFetchStart)  {
        // Set credentials
        // Empty constructor, gets username/password from config.properties
        this.fusionUsername=pUsername;
        this.fusionPassword=pPassword;
        this.fusionJWTToken = pJWTToken;
        this.fusionEndpointURL=pFusionEndpointURL;
        this.fusionFetchSize=pFetchSize;
        this.fusionFetchStart=0;
        this.wbprovider=wbprovider;
        
        
        Map<String, Object> requestContext = this.wbprovider.getRequestContext();
       
        if (fusionJWTToken != null) {
            initJWTTokenHeader(requestContext);
        }
        else {
            initUsernameTokenHeader(requestContext);
        }


        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,this.fusionEndpointURL);   
        
        
        this.initialised=true;
    }
     
    private void initUsernameTokenHeader(Map<String, Object> requestContext)    {                
        logger.log(Level.ALL, "SecurityFeature being used "+m_securityFeature);
        
        requestContext.put(WSBindingProvider.USERNAME_PROPERTY,
                           fusionUsername);
        requestContext.put(WSBindingProvider.PASSWORD_PROPERTY,
                           fusionPassword);
    }
    
    private void initJWTTokenHeader(Map<String, Object> requestContext)    {
        logger.log(Level.ALL, "No SecurityFeature should be used for JWTToken authN/authZ");   
    
        String authZParameterValue = "Bearer " + this.fusionJWTToken;
        
        Map<String, List<String>> authMap = new HashMap<String, List<String>>();
        List<String> authZList = new ArrayList<String>();
        authZList.add(authZParameterValue);
        
        authMap.put("Authorization", authZList);
        
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, authMap);                
    }
    
    
    // Getters and Setters follow
    
    public int getFetchSize() {
        return this.fusionFetchSize;
    }
    public int getFetchStart() {
        return this.fusionFetchStart;
    }
    
    // Log Message in warning mode. Dev Mode only
    public void logMessage(String message)
    {   
        logger.info(message);
    }
   

    public void setFusionFetchSize(int fusionFetchSize) {
        this.fusionFetchSize = fusionFetchSize;
    }

    public int getFusionFetchSize() {
        return fusionFetchSize;
    }

    public boolean isInitialised() {
        return initialised;
    }
    public void checkIfInitialised() throws fusionServiceNotInitialised {
        if (!this.initialised) throw new fusionServiceNotInitialised();        
    }
    
    public SecurityPolicyFeature[] getSecurityFeature(String pFusionEndpointURL,
        String pJWTToken) {
        if (pJWTToken != null) {
            //no compatible security policy available in OSC when JWT token is used. We should create SecurityPolictyFeature array with one object, passing an empty string (no security)
            m_securityFeature = new SecurityPolicyFeature[] { new SecurityPolicyFeature("") };
        }        
        else if (pFusionEndpointURL.toUpperCase().startsWith("HTTPS")) {
            // ss then make SecurityPolicyFeature=SSL , else not ssl
             m_securityFeature = new SecurityPolicyFeature[] { new SecurityPolicyFeature(SSLSecurityPolicy) };
             
        }
        else {
            m_securityFeature = new SecurityPolicyFeature[] { new SecurityPolicyFeature(this.nonSSLSecurityPolicy) };
        }
        
        
        return m_securityFeature;
    }
    
    public void setCredentials(String pUsername,String pPassword) {
        this.fusionUsername=pUsername;
        this.fusionPassword=pPassword;
        this.fusionJWTToken = null;
    }
    
    public void setCredentials(String pJWTToken) {
        this.fusionUsername=null;
        this.fusionPassword=null;
        this.fusionJWTToken = pJWTToken;
    }
    
    public static String getDefaultMajorQuerySeperator() {
        return FusionHelper.getDefaultMajorQuerySeperator();
    }
    
    public static String getDefaultMinorQuerySeperator() {
        return FusionHelper.getDefaultMinorQuerySeperator();
    }
    
}
