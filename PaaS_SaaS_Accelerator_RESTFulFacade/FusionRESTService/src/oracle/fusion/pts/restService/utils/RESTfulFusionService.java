/**
 * @author      Angelo Santagata <angelos.santagata.com>
 * @version     1.6                
 * @since       2014-03-28          
 * 
 */
package oracle.fusion.pts.restService.utils;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

import javax.ws.rs.core.HttpHeaders;

import oracle.fusion.pts.restService.exceptions.FusionGenericException;

public abstract class RESTfulFusionService {

    private String fusionUsername;
    private String fusionPassword;
    private String fusionJWTToken;
    
    private int fusionFetchSize = 50;
    private int fusionFetchStart = 0;
    protected Logger logger;
    private String fusionEndpointURL=null;
    private String fusionHCMEndpointURL=null;
    private Properties prop = new Properties();

    public static String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }
    
    
    
        
    public RESTfulFusionService() {
        
        // initialise by setting the default username/password/fetchstart/fetchsize
        logger=Logger.getLogger(this.getClass().getName());
        try {
            //load a properties file from class path, inside static method
            prop.load(RESTfulFusionService.class.getClassLoader().getResourceAsStream("fusionconfig.properties"));
            //get the property value and print it out
            this.fusionUsername = prop.getProperty("username");
            this.fusionPassword = prop.getProperty("password");
            
            try {
                this.fusionFetchSize =
                        Integer.parseInt(prop.getProperty("fusionFetchSize"));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                throw new FusionGenericException("config.properties fusionFetchSize invalid");
            }
            // Set start to zero for defaulting
            this.fusionFetchStart=0;
            
            //there is no way to setup a initial jwt token
            this.fusionJWTToken = null;
            
            logMessage("Class initialized");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    protected void processRESTServiceHeaders(Map<String, String> pHeaders) {
        // Get Username/Password/FetchStart/FetchSize
                
        if (pHeaders == null) {
            throw new FusionGenericException("Header cannot be null");
        }
        
        String fusionJWTTokenHeader = pHeaders.get("fusionJWTToken");
        String fusionUsernameHeader = pHeaders.get("fusionUsername");
        String fusionPasswordHeader = pHeaders.get("fusionPassword");
        String fusionFetchStartHeader = pHeaders.get("fusionFetchStart");
        String fusionFetchSizeHeader = pHeaders.get("fusionFetchSize");
        String fusionFetchEndpointURLHeader = pHeaders.get("fusionEndpointURL");
        
        
        if (fusionJWTTokenHeader != null) {
            logMessage("fusionJWTToken="+fusionJWTTokenHeader);
            this.fusionJWTToken=fusionJWTTokenHeader;          
        }
        
        
        if (fusionUsernameHeader != null  ) {
                logMessage("fusionUsername="+fusionUsernameHeader);
                this.fusionUsername=fusionUsernameHeader;
        }
        if (fusionPasswordHeader != null ) {

                logMessage("fusionPassword="+fusionPasswordHeader);
                this.fusionPassword=fusionPasswordHeader;
        }
        
        if (fusionFetchStartHeader != null) {
                logMessage("fusionFetchSize="+fusionFetchStartHeader);
                try {
                    this.fusionFetchStart =
                            Integer.parseInt(fusionFetchStartHeader);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    throw new FusionGenericException("Header fusionFetchStart not a number");
                }    
        }
        
        if (fusionFetchSizeHeader != null ) {
                logMessage("fusionFetchSize="+fusionFetchSizeHeader);
                try {
                    this.fusionFetchSize =
                            Integer.parseInt(fusionFetchSizeHeader);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    throw new FusionGenericException("Header fusionFetchSize not a number");
                }
        }
        //fusionEndpointURL=null;
        if (fusionFetchEndpointURLHeader != null  ) {
                this.fusionEndpointURL=fusionFetchEndpointURLHeader;
                logMessage("fusionEndpointURL ["+fusionEndpointURL+"]");
        }
        
        
        
    }
    
    protected void processRESTServiceHeaders(HttpHeaders pHeaders) {
        // Get Username/Password/FetchStart/FetchSize from Headers, if its been passed in
        // and set in class variable
        if (pHeaders != null) {
            
            List<String> fusionJWTTokenHeader = pHeaders.getRequestHeader("fusionJWTToken");
            List<String> fusionUsernameHeader = pHeaders.getRequestHeader("fusionUsername");
            List<String> fusionPasswordHeader = pHeaders.getRequestHeader("fusionPassword");
            List<String> fusionFetchStartHeader = pHeaders.getRequestHeader("fusionFetchStart");
            List<String> fusionFetchSizeHeader = pHeaders.getRequestHeader("fusionFetchSize");
            List<String> fusionFetchEndpointURLHeader = pHeaders.getRequestHeader("fusionEndpointURL");
            
            
            if (fusionJWTTokenHeader != null  ) {
                for (String fusionJWTToken : fusionJWTTokenHeader) {
                    logMessage("fusionJWTToken="+fusionJWTToken);
                    this.fusionJWTToken=fusionJWTToken;
                }
            }
            
            if (fusionUsernameHeader != null  ) {
                for (String fusionUsername : fusionUsernameHeader) {
                    logMessage("fusionUsername="+fusionUsername);
                    this.fusionUsername=fusionUsername;
                }
            }
            if (fusionPasswordHeader != null ) {
                for (String fusionPassword : fusionPasswordHeader) {
                    logMessage("fusionPassword="+fusionPassword);
                    this.fusionPassword=fusionPassword;
                }
            }
            
            if (fusionFetchStartHeader != null) {
                for (String fusionFetchStart : fusionFetchStartHeader) {
                    logMessage("fusionFetchSize="+fusionFetchStart);
                    try {
                        this.fusionFetchStart =
                                Integer.parseInt(fusionFetchStart);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                        throw new FusionGenericException("Header fusionFetchStart not a number");
                    }
                }
            }
            if (fusionFetchSizeHeader != null ) {
                for (String fusionFetchSize : fusionFetchSizeHeader) {
                    logMessage("fusionFetchSize="+fusionFetchSize);
                    try {
                        this.fusionFetchSize =
                                Integer.parseInt(fusionFetchSize);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                        throw new FusionGenericException("Header fusionFetchSize not a number");
                    }
                }
            }
            //fusionEndpointURL=null;
            if (fusionFetchEndpointURLHeader != null  ) {
                for (String fusionEndpointURL : fusionFetchEndpointURLHeader) {
                   
                    this.fusionEndpointURL=fusionEndpointURL;
                    logMessage("fusionEndpointURL ["+fusionEndpointURL+"]");
                }
            }
            
            
            
        }
       
        
    }
    
    protected void logMessage(String message)
    {      
        logger.warning(message);
    }
        
    protected void setLogger(Logger logger) {
        this.logger = logger;
    }

    protected Logger getLogger() {
        return logger;
    }

    public String getFusionEndpointURL(String pFusionEndpointName) {
        if (this.fusionEndpointURL==null) {
            // Use default endpointURL
            return prop.getProperty("fusionCRMDefaultEndpointURL")+prop.getProperty(pFusionEndpointName);
        }
        else return (this.fusionEndpointURL+prop.getProperty(pFusionEndpointName));
        
    }

    public String getFusionHCMEndpointURL(String pFusionEndpointName) {
           if (this.fusionHCMEndpointURL==null) {
               // Use default endpointURL
               return prop.getProperty("fusionHCMDefaultEndpointURL")+prop.getProperty(pFusionEndpointName);
           }
           else return (this.fusionHCMEndpointURL+prop.getProperty(pFusionEndpointName));
           
       }
 
    public int getFetchSize() {
        logMessage("fusionFetchSize="+this.fusionFetchSize);
        return this.fusionFetchSize;
    }
    public int getFetchStart() {
        logMessage("fusionFetchStart="+this.fusionFetchStart);
        return this.fusionFetchStart;
    }
    


    public void setFusionFetchSize(int fusionFetchSize) {
        this.fusionFetchSize = fusionFetchSize;
    }

    public int getFusionFetchSize() {
        return fusionFetchSize;
    }

    public void setFusionFetchStart(int fusionFetchStart) {
        this.fusionFetchStart = fusionFetchStart;
    }

    public int getFusionFetchStart() {
        return fusionFetchStart;
    }



    public void setFusionEndpointURL(String fusionEndpointURL) {
        this.fusionEndpointURL = fusionEndpointURL;
    }


    public void setFusionUsername(String fusionUsername) {
        this.fusionUsername = fusionUsername;
    }

    public String getFusionUsername() {
        return fusionUsername;
    }

    public void setFusionPassword(String fusionPassword) {
        this.fusionPassword = fusionPassword;
    }

    public String getFusionPassword() {
        return fusionPassword;
    }


    public void setFusionJWTToken(String fusionJWTToken) {
        this.fusionJWTToken = fusionJWTToken;
    }

    public String getFusionJWTToken() {
        return fusionJWTToken;
    }
}
