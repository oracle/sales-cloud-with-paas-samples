package oracle.cloud.doccloud.servlet;

/* Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved.*/


import java.io.IOException;
import java.io.PrintWriter;

import java.text.Normalizer;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.regex.Pattern;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.adf.share.ADFContext;

import oracle.cloud.doccloud.exception.RESTException;
import oracle.cloud.doccloud.rest.DocCloudRESTClient;
import oracle.cloud.doccloud.rest.SalesCloudRESTClient;

import oracle.cloud.doccloud.types.docCloud.AppLink;
import oracle.cloud.doccloud.types.docCloud.Folder;
import oracle.cloud.doccloud.types.docCloud.FolderContent;
import oracle.cloud.doccloud.utils.AppConstants;
import oracle.cloud.doccloud.utils.CSFUtils;


/**
 * This servlet will get embedded into Sales Cloud and will be called as
 * https://<HOST>?objectnumber=[OptyNumber]&objecttype=OPPORTUNITY
 * &jwt=[jwt], where
 *
 * objectNumber - Sales Cloud ObjectID for the given object
 * objectType - one of "OPPORTUNITY"/"ACCOUNT/CONTACT"
 * jwt - JWT token for the user who is logged into sales cloud
 * username - Sales Cloud logged in user (for Oracle Internal Env)

 * Call to the servlet results into
 *  - check if objectType is correct and user identified by JWT token has
 *  permission on the object. Else Exception
 *
 *  - Check if folder for object exist and create a AppLink to
 *  this folder and create response with iframe pointing to AppLink.
 *  Exception if folder as given by docFolderguid does not exist
 *
 *  - If folder for the object does not exist, create a new folder 
 *  for the objectType. Create the AppLink to this folder
 *  and create response with iframe pointing to AppLink.
 *
 *  - Throw Exception incase of any error
 *
 */

public class DocCloudServlet extends HttpServlet
{
    @SuppressWarnings("compatibility:7006594585846001792")
    private static final long serialVersionUID = -4714316509694149648L;
    
    //Content type for the servlet response
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    //variables required by AppLink
    private String refreshToken;
    private String accessToken;
    private String frameUrl;
    private String appLinkRole;

    //ID of folder in document cloud
    private String docCloudFolderGUID;

    // Servlet Parameters from request
    private String paramFusionCloudObjectType;
    private String paramFusionCloudObjectNumber;
    private String paramSalesCloudJWTToken;
    
    // Configuration Property File Parameters
    private String docCloudUsername = "";
    private String docCloudPassword = "";
    private String docCloudServerHostname = "";
    private String docCloudServerRole = "";
    private String salesCloudServerHostname = "";
    private String docCloudIntegrationRootFolder;
    private String fusionObjectName = "";
    private String docCloudFolderName = ""; // The DocCloud Folder name, hardcoded to be "ObjectNumber-ObjectName"
    private String paramSalesCloudUser   = "";
    
    
    //Logger
    private final static Logger LOGGER = Logger.getLogger(SalesCloudRESTClient.class.getName());

    /**
     * Servlet initization. Load property file config.properties at init 
     * @param config
     * @throws ServletException
     */
    public void init(ServletConfig config) throws ServletException{
        super.init(config);
        try{
            initConfig();
        }catch(Exception e){
            throw new ServletException("Configuration Details not found");
        }
    }

    /**
     * doPost is just a pass-through to doGet.
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doGet(request, response);
    }

   /**
     * Load the property file and initialize parameters
     * @throws IOException
     */
    private void initConfig() throws IOException{
       
       
        // Load Document CLoud Service App username and password from CSF
       try{           
            docCloudUsername = CSFUtils.getCredentialUsername(AppConstants.CSF_MAP_NAME, AppConstants.DOCCS_USER_KEY);
            docCloudPassword = CSFUtils.getCredentialPassword(AppConstants.CSF_MAP_NAME, AppConstants.DOCCS_USER_KEY);
            
       } catch(Exception e){
           LOGGER.fine("Exception while access CSF store, please check permission for the user if using CSF for configuration");
       }
                   
        //IF CSF is not available, fall-back on config.properties file for all configuration
        // else load configuration other than username/password from properties file
        if (docCloudUsername == null || docCloudUsername.length() == 0 || 
           docCloudPassword == null || docCloudPassword.length() == 0 ){
                   
            // Load properties from properties file
                Properties props = new Properties();
                props.load(getServletContext().getResourceAsStream("/WEB-INF/properties/config.properties"));
                
                docCloudUsername = props.getProperty("docCloudUsername");
                docCloudPassword = props.getProperty("docCloudPassword");
                docCloudServerHostname = props.getProperty("docCloudServerHostname");
                docCloudServerRole = props.getProperty("docCloudServerRole");
                docCloudIntegrationRootFolder = props.getProperty("salesCloudIntegrationFolder");
                salesCloudServerHostname = props.getProperty("salesCloudServerHostname");
        }else {
            
            // Load configuration other than username/password
            Properties props = new Properties();
            props.load(getServletContext().getResourceAsStream("/WEB-INF/properties/config.properties"));
            
            docCloudServerHostname = props.getProperty("docCloudServerHostname");
            docCloudServerRole = props.getProperty("docCloudServerRole");
            docCloudIntegrationRootFolder = props.getProperty("salesCloudIntegrationFolder");
            salesCloudServerHostname = props.getProperty("salesCloudServerHostname");
            
        }
         
        
        
    }


    /**
     * Respond with iFrame with AppLink to the Document Cloud Service Folder 
     * for the given object
     * @param request - HttpServletRequest
     * @param response - HttpServletResponse
     * @throws ServletException
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        PrintWriter out = response.getWriter();
        response.setContentType(CONTENT_TYPE);
        
        LOGGER.setLevel(Level.ALL);
        
           
        // Get Servlet Request Parameters
        paramFusionCloudObjectType      = request.getParameter("objecttype");
        paramFusionCloudObjectNumber    = request.getParameter("objectnumber");
        paramSalesCloudJWTToken         = request.getParameter("jwt");
        
        // Get the logged in username
        paramSalesCloudUser = ADFContext.getCurrent().getSecurityContext().getUserName();
        
        if(paramSalesCloudUser.equals("anonymous")){
            paramSalesCloudUser = request.getParameter("username");
        }
        
        
        LOGGER.fine("Servlet GET called with " + "type=[" 
                    + paramFusionCloudObjectType + "]," 
                    + "objectNumber=[" + paramFusionCloudObjectNumber + "]," 
                    + "jwt=[" + paramSalesCloudJWTToken + "]," 
                    + "salesCloudUser=[" + paramSalesCloudUser + "]," 
                    + "Fusion SalesCloud URL=" + this.salesCloudServerHostname);
        
        
        
        
        //Check if any of the configuration parameter is not available
        //throw exception if missing
        if (docCloudUsername == null || docCloudUsername.length() == 0 || 
            docCloudPassword == null || docCloudPassword.length() == 0 || 
            docCloudServerHostname == null ||docCloudServerHostname.length() == 0 || 
            docCloudServerHostname == null || docCloudServerRole.length() == 0){
            
                throw new ServletException("Missing config values   ");
        }
        
        // Check if request parameter are as required, else throw exception
        if (paramFusionCloudObjectType == null || 
            paramFusionCloudObjectType.length() == 0 || 
            paramFusionCloudObjectNumber == null ||
            paramFusionCloudObjectNumber.length() == 0 || 
            this.salesCloudServerHostname ==null || 
            salesCloudServerHostname.length() == 0 || 
            this.paramSalesCloudJWTToken ==null || 
            this.paramSalesCloudJWTToken.length() == 0 ||
            this.paramSalesCloudUser == null ||
            this.paramSalesCloudUser.length()==0 ){
            
                throw new ServletException("objectnumber, objecttype, username or jwt is null in URL Parameters");
        }
        
        //Validate Inputs
        
        if ( validate(paramFusionCloudObjectType) || 
            validate( paramFusionCloudObjectNumber) || 
            validate(this.paramSalesCloudJWTToken) ||
            validate(this.paramSalesCloudUser) ){
            
                throw new ServletException("objectnumber, objecttype, username or jwt is/are not valid" +
                    "ojectNumber=" + paramFusionCloudObjectNumber + ",objecttype=" + paramFusionCloudObjectType
                                           +",paramSalesCloudUser=" + paramSalesCloudUser
                                           +",paramSalesCloudJWTToken=" + paramSalesCloudJWTToken);
        }
        


        // Check Object is accessible from Sales Cloud using credentials passed in via JWT Token
        
        // Initialise SalesCloudREST Client
        SalesCloudRESTClient SCRC = new SalesCloudRESTClient(salesCloudServerHostname);
        //attach jwtToken to the client
        SCRC.jwtAuth(this.paramSalesCloudJWTToken);

        try{
            if (paramFusionCloudObjectType.equalsIgnoreCase("OPPORTUNITY")){
                //check if Opportunity is accessible
                fusionObjectName = SCRC.checkOpportunityIsAccessible(paramFusionCloudObjectNumber).getName();
                
            } else if (paramFusionCloudObjectType.equalsIgnoreCase("CONTACT")){
                //check if Contact is accessible
                fusionObjectName = SCRC.checkContactIsAccessible(paramFusionCloudObjectNumber).getContactName();
                
            } else if (paramFusionCloudObjectType.equalsIgnoreCase("ACCOUNT")){
                //check if Opportunity is accessible
                fusionObjectName = SCRC.checkAccountIsAccessible(paramFusionCloudObjectNumber).getPartyUniqueName();
                
            } else
                //if objectType is not recognized, throw exception
                throw new ServletException("objecttype passed in URL is not " +
                    "supported, only supported values are OPPORTUNITY,CONTACT," +
                    "ACCOUNT not" + this.paramFusionCloudObjectType);
            
                LOGGER.fine("paramFusionCloudObjectType - " + paramFusionCloudObjectType + ", fusionObjectName - " + fusionObjectName);

        } catch (RESTException e){
            //If object is not accessible then throw exception
            // REST Exception, check its 404 (NOT FOUND), if it is then it means user does not have access to object
            if (e.getStatusCode() == 404){
                throw new ServletException("Error : Invalid SalesCloud URL or User does not have access to " 
                                           + paramFusionCloudObjectType + " " + paramFusionCloudObjectNumber);
            }
            // REST Exception, check its 401 (Auth err), means user JWT token is invalid (shouldnt happen)
            if (e.getStatusCode() == 401){
                throw new ServletException("Error :  Unauthorized access to Fusion Applications - did u enter a valid JWT token?");
            }
            // Catch all error an throw exception
            else
                throw new ServletException(e.getLocalizedMessage());
        }

    
        // Construct DocCloudFolderName, namely objectNumber-ObjectName
         docCloudFolderName = paramFusionCloudObjectNumber + "-" + fusionObjectName;


        // Initialise Connection to DocServer
        DocCloudRESTClient docCloudRESTService = new DocCloudRESTClient(docCloudServerHostname + "/documents");
        //add basicAuth header
        docCloudRESTService.basicAuth(docCloudUsername, docCloudPassword);

       
            //check if folder for object exist in DOCS via 
            //search for it by name in document cloud service
            Folder existingFolder = docCloudRESTService.locateFolder("self", 
                                        docCloudIntegrationRootFolder + "/" 
                                        + paramFusionCloudObjectType + "/" 
                                        + docCloudFolderName);
            
            //if exist, get the ID into docCloudFolderGUID
            if (existingFolder != null){
                // Folder Found
                docCloudFolderGUID = existingFolder.getId();
            } else{
                // Folder not found, need to create it
                // 1st Find the root folder containing object instances for that object type
                //
                LOGGER.info("Warning : Folder Doesnt already exist, need to create it");
                Folder rootObjectTypeFolder = docCloudRESTService.locateFolder("self", 
                                                docCloudIntegrationRootFolder + 
                                                "/" + paramFusionCloudObjectType);
                
                //If root folder does not exist, throw exception.
                if (rootObjectTypeFolder == null){
                
                    String errorMsg = "Error : unable to find integration folder" 
                                      + "for object " 
                                      + docCloudIntegrationRootFolder + "/" 
                                      + paramFusionCloudObjectType;
                    LOGGER.info(errorMsg);
                    throw new ServletException(errorMsg);

                } else{
                    //Create the folder for the object instance
                    Folder newFolder = docCloudRESTService.createFolder(
                                                rootObjectTypeFolder.getId(), 
                                                docCloudFolderName, 
                                                "Fusion Applcations Folder for " + 
                                                paramFusionCloudObjectType + 
                                                "[" + docCloudFolderName +
                                                "]");
                    if (newFolder == null){
                        throw new ServletException("error creating folder for object");
                    }
                    docCloudFolderGUID = newFolder.getId();
                    
                }
            }
        
        //generate AppLink for docCloudFolderGUID and respond 
        generateAppLinkResponse(out, docCloudFolderGUID, docCloudRESTService);
        out.close();
    }
    
    /**
     * Write the HTML with iframe
     * @param out - PrintWriter Object
     * @param docCloudFolderGuid - folderID
     * @param docCloudRESTService - 
     */
    private void generateAppLinkResponse(PrintWriter out, 
                                         String docCloudFolderGuid, 
                                         DocCloudRESTClient docCloudRESTService)
    {
        //Generate AppLink for the Folder identified by FolderGuID, 
        //role=contributor and for the logged in user    
        AppLink respObj2 = docCloudRESTService.createApplink(docCloudFolderGuid,
                                                             paramSalesCloudUser,
                                                             docCloudServerRole,
                                                             "FOLDER");
        
        //Get the applink tokens and other paramters
        refreshToken = respObj2.getRefreshToken();
        accessToken = respObj2.getAccessToken();
        appLinkRole = respObj2.getRole();
        frameUrl = respObj2.getAppLinkUrl();

        
        //Generate the HTML content
        out.println("<html>");
        out.println("<head><title>DocCloudServlet</title>");
        out.println("<script type=\"text/javascript\">");
        out.println(onPageLoadFunction());
        out.println(handleMessageFunction());
        /*************************************************************
	     * we are adding iFrame to the DOM instead of creating it in-line
	     * to prevent the embedded ODCS instance from sending the
	     * appLinkReady message before the message handler is set
	     *
	     **************************************************************/
        out.println(addIFrameFunction());
        out.println("</script>");
        out.println("</head>");
        out.println("<body onload=\"onPageLoad()\">");

    }

    
    /**
     *Add Iframe to the response
     * @return
     */
    private String addIFrameFunction()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("function addIFrame() {");
        sb.append("var if1 = document.createElement('IFRAME');");
        sb.append("if1.width='100%';");
        sb.append("if1.height = '100%';");
        sb.append("if1.id = 'iFrame1';");
        sb.append("if1.src = '" + frameUrl + "';");
        sb.append("document.body.appendChild(if1);}");
        return sb.toString();
    }
    
    /**
     * Add onPageLoad function to the response
     * @return String
     */
    private String onPageLoadFunction()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("function onPageLoad(evt) {");
        sb.append("console.log(\"In onPageLoadFunction\");");
        sb.append("if (window.addEventListener) {");
        sb.append("console.log(\"Adding EventListener\");");
        sb.append("window.addEventListener(\"message\", handleMessage, false);}");
        sb.append("addIFrame();}");
        return sb.toString();
    }
    
    /**
     * add handleMessage(event) function to response
     * @return String
     */
    private String handleMessageFunction()
    {
        StringBuilder sb = new StringBuilder();
        // check for and react to appLinkReady message
        sb.append("function handleMessage(event) {");
        sb.append("console.log(\"In handleMessageFunction\");");
        sb.append("if (event.data.message ==\"appLinkReady\") {");
        sb.append("var msg = {");
        sb.append("message : 'setAppLinkTokens',");
        sb.append("appLinkRefreshToken:\"" + refreshToken + "\",");
        sb.append("appLinkAccessToken:\"" + accessToken + "\",");
        sb.append("appLinkRoleName:\"" + appLinkRole + "\",");
        sb.append("embedPreview : true};");
        // get reference to ODCS iFrame window and post message
        sb.append("var frame = document.getElementById(\"iFrame1\");");
        sb.append("var iframewindow = frame.contentWindow ? frame.contentWindow : frame.contentDocument.defaultView;");
        sb.append("iframewindow.postMessage(msg, '*');}}");
        return sb.toString();
    }


          private Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{0,20}$@");
       
           private boolean validate( String input ) {
       
                boolean isValid = false;
               // important - always canonicalize before validating
               String canonical = canonicalize( input );
       
               // check to see if input matches whitelist character set
               if ( !pattern.matcher( canonical ).matches() ) {
               
                   isValid = false;
               }else{
                   isValid = true;
               }
       
               return isValid;
           }
       
           // Simplifies input to its simplest form to make encoding tricks more difficult
           private String canonicalize( String input ) {
                String canonical = java.text.Normalizer.normalize(input, Normalizer.Form.NFC);
                return canonical;
           }


}
