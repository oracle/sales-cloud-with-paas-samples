package oracle.cloud.doccloud.webservice;

/* Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved.*/

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.api.json.JSONConfiguration;

import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import javax.ws.rs.core.MediaType;
import oracle.cloud.doccloud.exception.RESTException;
import oracle.cloud.doccloud.rest.SalesCloudRESTClient;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;


/**
 * This is helper class for REST calls (Compatible with Jersey 1.1.x).
 * Implement required methods i.e. get, patch, put, delete
 * to call REST services.
 * 
 */

public abstract class AbstractRESTClient {
    
    private WebResource baseResource;
    private String jwtToken;
    private final static Logger LOGGER = Logger.getLogger(AbstractRESTClient.class.getName());
    /**
     * Constructor 
     * @param URL - URL to Rest Endpoint
     */
    public AbstractRESTClient(String URL) {
        this(URL, false);
    }
    
    /**
     * Constructor
     * Creates a Client object with required config and if 
     * enableLogging is true, create logger. Initialize the member vailable 
     * "baseResource" to Rest Endpoint resource
     * @param URL - URL to Rest Endpoint 
     * @param enableLogging - Boolean parameter for enabling logging.
     */
    public AbstractRESTClient(String URL, boolean enableLogging) {
        ClientConfig config = new DefaultClientConfig();
        config.getClasses().add(JacksonJsonProvider.class);
        config.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, 
                                 Boolean.TRUE);

        Client client = Client.create(config);
        if (enableLogging) {
            client.addFilter(new LoggingFilter(Logger
                                               .getLogger("DOCS REST Samples")));
        }
        baseResource = client.resource(URL);
    }

    /**
     * Add user and password as base64 encoded string to baseResource 
     * member vailable as Auth Header.
     * @param user - username
     * @param password - password
     */
    public void basicAuth(String user, String password) {
        baseResource.addFilter(new HTTPBasicAuthFilter(user, password));
    }


    /**
     * Set the member vailable jwt with the value passed
     * @param jwt
     */
    public void jwtAuth(String jwt){
       this.jwtToken=jwt;
    }
    
    /**
     * Return  WebResource Object with JWT Token in Authorization Header
     * @param target
     * @return - WebResource Object
     */
    private WebResource.Builder createBuilder(WebResource target) {
        WebResource.Builder b=target.getRequestBuilder();
        if (this.jwtToken!=null && this.jwtToken.length()>0) 
                b=b.header("Authorization", "Bearer "+this.jwtToken);
        return b;
    }
    
    /**
     * Add Key-Value pair from the Map to the WebResource as header.
     * @param b - Builder
     * @param header - data to be added in header as Map
     * @return - WebResource Object
     */
    private WebResource.Builder createHeader(WebResource.Builder b, 
                                             Map<String,String> header) {
        
            if (header != null && b != null) {        
                Set<String> keys = header.keySet();
                for (String key : keys) {
                    b = b.header(key, header.get(key));
                }
            }
            return b;
        }

    
    /**
     * GET Call to the Rest Endpoint identitfied by uri  
     * @param <T> - 
     * @param uri - Rest Endpoint URI
     * @param resultClass - Pojo Class representing the JSON response from the Rest
     * @return - Object of resultClass representing response from Rest
     */
    protected <T> T get(String uri, Class<T> resultClass) {
        LOGGER.info("URI to call - " + uri);
        return get(uri, resultClass, null);
    }
    
    /**
     * GET Call to the Rest Endpoint identitfied by uri  
     * @param <T>
     * @param uri - Rest Endpoint URI
     * @param resultClass - Pojo Class representing the JSON response from the Rest
     * @param query - Map containting queryString key-value pair
     * @return - Object of resultClass representing response from Rest
     */
    protected <T> T get(String uri, Class<T> resultClass,
                        Map<String, String> query) {
        //Add the path details to the baseResources
        
        WebResource t = baseResource.path(uri);
        
        //if query is not null, add data to query parameter
        if (query != null) {
            for (String key : query.keySet()) {
                t = t.queryParam(key, query.get(key));
            }
        }
        //create ResourceBuilder
        WebResource.Builder b = createBuilder(t);
         
        return get(b, resultClass);
    }
    
    /**
     * Get call to the rest endpoint 
     * @param <T> - class as given by resultClass
     * @param b - WebResource.Builder object 
     * @param resultClass - Class representing JSON object 
     * @return - Object of class as given by resultClass
     */
    private <T> T get(WebResource.Builder b, Class<T> resultClass) {

        try {
             //set the MediaType   
             b = b.type(MediaType.APPLICATION_JSON_TYPE);
            //call and return
            return b.get(resultClass);
        } catch (UniformInterfaceException e) {
            //throw RestException incase of any exception
            throw new RESTException(e.getResponse());
        }

    }
    
    /**
     * PATCH call to Rest Endpoint to update a resource
     * @param <T> - Class as given by resultClass
     * @param uri - URI to Rest Endpoint
     * @param resultClass - class representing JSON Object
     * @param payload - JSON data
     * @return - Object of resultClass
     */
    protected <T> T patch(String uri, Class<T> resultClass, Object payload) {
        WebResource t = baseResource.path(uri);
        WebResource.Builder b = createBuilder(t);
        return patch(b, resultClass, payload);
    }
    
    /**
     * PATCH call to Rest Endpoint to update a resource
     * @param <T> -  Class as given by resultClass
     * @param b - Builder
     * @param resultClass - class representing JSON Object
     * @param payload - JSON data
     * @return - Object of resultClass
     */
    private <T> T patch(WebResource.Builder b, Class<T> resultClass,
                       Object payload) {
        try {
            // b = b.type(MediaType.APPLICATION_JSON_TYPE);
            b = b.type("application/vnd.oracle.adf.resourceitem+json");
            
            return b.method("PATCH",resultClass, payload);
        } catch (UniformInterfaceException e) {
            throw new RESTException(e.getResponse());
        }

    }
    
    
    /**
     * Post call to Rest Endpoint 
     * @param <T> - Class as given by resultClass
     * @param uri - URI to rest endpoint
     * @param resultClass - class represnting JSON Object
     * @param payload - JSON Data
     * @return - Returned Object of resultClass
     */
    protected <T> T post(String uri, Class<T> resultClass, Object payload) {
        WebResource t = baseResource.path(uri);
        WebResource.Builder b = createBuilder(t);
        return post(b, resultClass, payload);
    }
    
    /**
     * Post call to Rest Endpoint 
     * @param <T> - Class as given by resultClass
     * @param b - Builder Object
     * @param resultClass - class represnting JSON Object
     * @param payload - JSON Data
     * @return - Returned Object of resultClass
     */
    private <T> T post(WebResource.Builder b, Class<T> resultClass,
                       Object payload) {
        try {
            b = b.type(MediaType.APPLICATION_JSON_TYPE);
            return b.post(resultClass, payload);
        } catch (UniformInterfaceException e) {
            throw new RESTException(e.getResponse());
        }

    }

    
    /**
     * Put call to Rest Endpoint
     * @param <T> - Class as given by resultClass
     * @param uri - URI to rest endpoint
     * @param resultClass - class represnting JSON Object
     * @param payload - JSON Data
     * @return - Returned Object of resultClass
     */
    protected <T> T put(String uri, Class<T> resultClass, Object payload) {

        WebResource t = baseResource.path(uri);
        WebResource.Builder b = createBuilder(t);
        return put(b, resultClass, payload);
    }
    
    /**
     * Put call to Rest Endpoint
     * @param <T> - Class as given by resultClass
     * @param b - Builder Object
     * @param resultClass - class represnting JSON Object
     * @param payload - JSON Data
     * @return - Returned Object of resultClass
     */
    private <T> T put(WebResource.Builder b, Class<T> resultClass,
                      Object request) {
        try {
            b = b.type(MediaType.APPLICATION_JSON_TYPE);
            return b.put(resultClass, request);
        } catch (UniformInterfaceException e) {
            throw new RESTException(e.getResponse());
        }
    }
    
    /**
     * Delete Call to Rest Endpoint
     * @param <T> - Class as given by resultClass
     * @param uri - URI to rest endpoint
     * @param resultClass - class represnting JSON Object
     * @return - Returned Object of resultClass
     */
    protected <T> T delete(String uri, Class<T> resultClass) {
        return delete(uri, resultClass, null);
    }

    /**
     * Delete Call to Rest Endpoint
     * @param query - query paramter 
     * @param <T> - Class as given by resultClass
     * @param uri - URI to rest endpoint
     * @param resultClass - class represnting JSON Object
     * @return - Returned Object of resultClass
     */
    protected <T> T delete(String uri, Class<T> resultClass,
                           Map<String, String> query) {
        WebResource t = baseResource.path(uri);
        if (query != null) {
            for (String key : query.keySet()) {
                t = t.queryParam(key, query.get(key));
            }
        }
        WebResource.Builder b = createBuilder(t);
        return delete(b, resultClass);
    }
    
    /**
     * Delete call to Rest Endpoint
     * @param <T> - Class as given by resultClass
     * @param b - Builder
     * @param resultClass - class represnting JSON Object
     * @return - Returned Object of resultClass
     */
    private <T> T delete(WebResource.Builder b, Class<T> resultClass) {
        try {
            return b.delete(resultClass);
        } catch (UniformInterfaceException e) {
            throw new RESTException(e.getResponse());
        }
    }
}
