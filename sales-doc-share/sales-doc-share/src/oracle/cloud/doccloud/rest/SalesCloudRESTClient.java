package oracle.cloud.doccloud.rest;

/* Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved.*/

import java.util.logging.Level;
import java.util.logging.Logger;

import oracle.cloud.doccloud.types.salesCloud.AccountSimpleType;
import oracle.cloud.doccloud.types.salesCloud.ContactSimpleType;
import oracle.cloud.doccloud.types.salesCloud.OpportunitySimpleType;
import oracle.cloud.doccloud.webservice.AbstractRESTClient;


/**
 * Class to support Fusion Applications validation,
 * currently SalesCloud but in the future could be ERP, HCM etc.
 */


public class SalesCloudRESTClient extends AbstractRESTClient
{
    private static String restAPIURL    = "";
    
    // Following REST Queries are used to determine if a resource can be viewed by user
    private static String queryOpty     = "/salesApi/resources/latest/opportunities/%s?fields=OptyNumber,Name&onlyData=true";
    private static String queryContact  = "/crmCommonApi/resources/latest/contacts/%s?fields=PartyNumber,ContactName&onlyData=true";
    private static String queryAccount  = "/crmCommonApi/resources/latest/accounts/%s?fields=PartyNumber,PartyUniqueName&onlyData=true";
    private static String updateOpty    = "/salesApi/resources/latest/opportunities/%s";
    private static String updateContact = "/crmCommonApi/resources/latest/contacts/%s";
    private static String updateAccount = "/crmCommonApi/resources/latest/accounts/%s";

    // Standard Payload for updating Fusion Object with DocCloudFolderGUID
    private String updateFolderIdPayload = " { \"DocCloudFolderGUID_c\" : \"%s\" }";


    private final static Logger LOGGER = Logger.getLogger(SalesCloudRESTClient.class.getName());
   
   /**
     *Constructor
     * @param serverURL - SalesCloud URL
     */
    public SalesCloudRESTClient(String serverURL){
        super(serverURL + restAPIURL);
        LOGGER.setLevel(Level.ALL);
    }


    /**
     * Check if Opportunity object is accessible by the user
     * @param pOpportunityNumber - opportunity identifier
     * @return OpportunitySimpleType object
     */
    public OpportunitySimpleType checkOpportunityIsAccessible(String pOpportunityNumber){
        // Any errors will be thrown
        LOGGER.info("Checking Access to Opty=" + pOpportunityNumber);
        return get(String.format(queryOpty, pOpportunityNumber), OpportunitySimpleType.class);
    }
    
    /**
     * Check if contact object is accessible by the user
     * @param pPartyNumber - contact identifier
     * @return - ContactSimpleType Object
     */
    public ContactSimpleType checkContactIsAccessible(String pPartyNumber){
        LOGGER.info("Checking Access to Contact=" + pPartyNumber);
        return get(String.format(queryContact, pPartyNumber), ContactSimpleType.class);
    }
    
    /**
     * Check if account object is accessible by the user
     * @param pPartyNumber - Account identifier
     * @return - AccountSimpleType object
     */
    public AccountSimpleType checkAccountIsAccessible(String pPartyNumber){
        LOGGER.info("Checking Access to Account=" + pPartyNumber);
        return get(String.format(queryAccount, pPartyNumber), AccountSimpleType.class);
    }
    
    /**
     * Add folderID to the sales cloud database against the given object
     * @param pObjectNumber - Sales cloud Object Number
     * @param pObjectType - sales cloud object type
     * @param pDocCloudFolderGUID - folder Id
     * @return - true or fale
     * @throws Exception
     */
    public boolean updateFusionObjectWithDocGUID(String pObjectNumber, String pObjectType, String pDocCloudFolderGUID) throws Exception
    {
        if (pObjectType == null || pObjectNumber == null || pDocCloudFolderGUID == null)
            //if objecType or ObjectNumber or pDocCloudFolderGUID is null, throw exception
            throw new Exception("objectnumber or objecttype is null");

        if (pObjectType.equalsIgnoreCase("OPPORTUNITY")){
            //update Opportunity object
            OpportunitySimpleType o = patch(String.format(updateOpty, pObjectNumber), 
                                            OpportunitySimpleType.class, 
                                            String.format(updateFolderIdPayload, 
                                                          pDocCloudFolderGUID));

        } else if (pObjectType.equalsIgnoreCase("CONTACT")){
            //update Contact Object
            ContactSimpleType o = patch(String.format(updateContact, pObjectNumber), 
                                        ContactSimpleType.class, 
                                        String.format(updateFolderIdPayload, 
                                                      pDocCloudFolderGUID));

        } else if (pObjectType.equalsIgnoreCase("ACCOUNT")){
            //Update Account Object
            AccountSimpleType o = patch(String.format(updateAccount, pObjectNumber),
                                        AccountSimpleType.class, 
                                        String.format(updateFolderIdPayload, 
                                                      pDocCloudFolderGUID));
        } else
            //If object type is not recognized throw exception
            throw new Exception("Unsupported ObjectType");


        return true;
    }


}
