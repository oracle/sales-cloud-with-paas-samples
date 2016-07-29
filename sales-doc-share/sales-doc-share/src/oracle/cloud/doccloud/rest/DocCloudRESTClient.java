package oracle.cloud.doccloud.rest;
/* Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved.*/


import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import oracle.cloud.doccloud.types.docCloud.AppLink;
import oracle.cloud.doccloud.types.docCloud.Folder;
import oracle.cloud.doccloud.types.docCloud.FolderContent;
import oracle.cloud.doccloud.types.docCloud.Item;
import oracle.cloud.doccloud.webservice.AbstractRESTClient;

/**
 * This class contains method to call to various Rest API of document 
 * cloud service.
 */

public class DocCloudRESTClient extends AbstractRESTClient {
    
    
    private static String restAPIURL = "/api/1.1";
    private static String USER_ROOT = "/folders/items";
    private static String QUERY_FOLDER = "/folders/%s";
    private static String CREATE_FOLDER = "/folders/%s";
    private static String GET_ITEMS = "/folders/%s/items";
    private static String CREATE_FILE_APPLINK = "/applinks/file/%s";
    private static String CREATE_FOLDER_APPLINK = "/applinks/folder/%s";
    
    
    /**
     * Constructor
     * @param serverURL - URL for the document cloud service
     */
    public DocCloudRESTClient(String serverURL) {
        super(serverURL + restAPIURL);
    }

    /**
     * Constructor
     * @param serverURL - URL for the document cloud service
     * @param enableLogging - true for enabling logging
     */
    public DocCloudRESTClient(String serverURL, boolean enableLogging) {
        super(serverURL + restAPIURL, enableLogging);
    }

    /**
     * Get the folder information for the folder given by folder ID
     * @param folderID - GUID for the folder in document cloud service
     * @return - Folder Object containing folder info
     */
    public Folder  getFolderInfo(String folderID) {
        return get(String.format(QUERY_FOLDER, folderID), Folder.class);
    }
    
    /**
     * Get the folder content for root folder for the user
     * @return - FolderContent Object
     */
    public FolderContent getPersonalFolderItems() {
        return get(USER_ROOT, FolderContent.class);
    }

   
    
   /**
     * Get the folder content for root folder of the user
     * @param orderBy - order by value
     * @param offset - offset value
     * @param limit - limit value
     * @return FolderContent Object 
     */
    public FolderContent getPersonalFolderItems(String orderBy, Integer offset,
                                                Integer limit) {
        Map<String, String> query = new HashMap<String, String>();
        if (orderBy != null && orderBy.length() != 0)
            query.put("orderBy", orderBy);
        if (offset != null)
            query.put("offset", offset.toString());
        if (limit != null)
            query.put("limit", limit.toString());
        return get(String.format(USER_ROOT), FolderContent.class, query);
    }

    /**
     * Get content of the folder as given by folderID
     * @param folderID - GUID of the folder
     * @return FolderContent Object
     */
    public FolderContent getItems(String folderID) {
        
        return get(String.format(GET_ITEMS, folderID), FolderContent.class);
    }
    
        

    /**
     * Get content of the folder given by folderID
     * @param folderID -GUID of the folder
     * @param orderBy - order by value
     * @param offset - offset value
     * @param limit - limit value
     * @return -FolderContent Object
     */
    public FolderContent getItems(String folderID, String orderBy,
                                  Integer offset, Integer limit) {
        Map<String, String> query = new HashMap<String, String>();
        if (orderBy != null && orderBy.length() != 0)
            query.put("orderBy", orderBy);
        if (offset != null)
            query.put("offset", offset.toString());
        if (limit != null)
            query.put("limit", limit.toString());
        return get(String.format(GET_ITEMS, folderID), FolderContent.class,
                   query);
    }

    /**
     * Create the folder with name subFolderName
     * @param parentID - folder ID of the parent folder
     * @param subFolderName - name of the folder to be created
     * @param description - description of the folder to be created
     * @return Folder Object containing details of newly created folder
     */
    public Folder createFolder(String parentID, String subFolderName,
                               String description) {
        Map<String, String> payload = new HashMap<String, String>();
        if (description != null)
            payload.put("description", description);
        payload.put("name", subFolderName);
        //GenericEntity entity = new GenericEntity<Map<String,String>>(payload) {};
        return post(String.format(CREATE_FOLDER, parentID), Folder.class,
                    payload);
    }
  

    /**
     * Create AppLink for the user with given role
     * @param id - GUID of the document cloud service artifcat for applink
     * @param assignedUser - user for which applink is generated
     * @param role - role
     * @param appLinkType - FOLDER or FILE
     * @return AppLink Object
     */
    public AppLink createApplink(String id, String assignedUser, String role,
                                 String appLinkType) {
        //
        // appLinkType is either FOLDER OR FILE 
        //
        Map<String, String> payload = new HashMap<String, String>();
        payload.put("assignedUser", assignedUser);
        payload.put("role", role);        
        //GenericEntity entity = new GenericEntity<Map<String,String>>(payload) {};
        if (appLinkType.equalsIgnoreCase("FOLDER"))
        {
            return post(String.format(CREATE_FOLDER_APPLINK, id), AppLink.class,payload);
        }
        else
        {
            return post(String.format(CREATE_FILE_APPLINK, id), AppLink.class,payload);
        }
        
    }

    /**
     * Get the folder details 
     * @param rootFolderID - Root Folder ID
     * @param path - Path for the folder 
     * @return Folder Object
     */
    public Folder locateFolder(String rootFolderID, String path) {
        
        Item item = locate(rootFolderID, path);
        if (item == null)
            return null;
        if (!item.getType().equals("folder"))
            throw new IllegalStateException("Path " + path +
                                            "found, but it is not a folder");
        
        return DocsUtil.toFolder(item);
    }

    /**
     * Get the folder details
     * @param rootFolderID - parent folder id
     * @param path - path of the folder
     * @return Item Object
     */
    public Item locate(String rootFolderID, String path) {
        if (path == null || path.length() == 0)
            throw new IllegalArgumentException("String can not be null or empty");
        if (path.startsWith("/"))
            throw new IllegalArgumentException("Path should not start with / : " +
                                               path);
        if (path.endsWith("/"))
            throw new IllegalArgumentException("Path should not end with / : " +
                                               path);
        String[] pathElements = path.split(Pattern.quote("/"));

        String actFolderID = rootFolderID;
        int i = 0;
        do {
            FolderContent content = getItems(actFolderID);
            if ((content == null) || (content.getItems() == null))
                return null;

            Item foundItem = null;
            for (Item act : content.getItems()) {
                if (act.getName().equalsIgnoreCase(pathElements[i])) {
                    foundItem = act;
                    break;
                }
            }
            if (foundItem != null) {
                if (++i == pathElements.length)
                    return foundItem;
                if (!foundItem.getType().equals("folder"))
                    return null;
                else
                    actFolderID = foundItem.getId();
            } else
                return null;
        } while (true);
    }

}
