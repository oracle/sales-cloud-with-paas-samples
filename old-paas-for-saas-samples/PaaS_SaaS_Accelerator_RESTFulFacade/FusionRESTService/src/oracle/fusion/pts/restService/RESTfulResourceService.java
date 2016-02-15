
package oracle.fusion.pts.restService;


import com.oracle.xmlns.apps.cdm.foundation.parties.personservice.Person;

import com.oracle.xmlns.apps.sales.opptymgmt.opportunities.opportunityservice.Opportunity;

import com.sun.xml.bind.v2.runtime.XMLSerializer;


import java.io.File;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;
import oracle.demo.pts.fusionservices.FusionResourceService;
import oracle.fusion.pts.restService.exceptions.FusionGenericException;
import oracle.fusion.pts.restService.types.RESTInteractionList;
import oracle.fusion.pts.restService.types.RESTPersonList;
import oracle.fusion.pts.restService.types.RESTResourceList;
import oracle.fusion.pts.restService.utils.RESTfulFusionService;


@Path("/resource")

public class RESTfulResourceService  extends RESTfulFusionService {
    FusionResourceService fusionResourceService = new FusionResourceService();
    String fusionEndpointName="fusionCRMResourceEndpoint";
    
    @POST
    @Path("/xmlquery")
    @Produces({"application/xml", "application/json"})
    public RESTResourceList findXMLQuery(@Context HttpHeaders pHttpHeaders, 
                                                      @QueryParam("attributes") String pAttributes,
                                                      @QueryParam("query") String pQuery,
                                                      InputStream pInputStream
                                                      ) throws JAXBException
    {
        return (findPersons(pHttpHeaders,pAttributes,pQuery,"",pInputStream));                                           
    }
    @GET
    @Produces({"application/xml", "application/json"})
    public RESTResourceList findPersons(@Context HttpHeaders pHttpHeaders, 
                                                      @QueryParam("attributes") String pAttributes,
                                                      @QueryParam("query") String pQuery,
                                                      @QueryParam("conjunction") String pConjunction,
                                                      InputStream pInputStream
                                                      ) throws JAXBException
    {
        String xmlQuery=convertStreamToString(pInputStream);                                                     
        // Initialise the connections
        processRESTServiceHeaders(pHttpHeaders);
        fusionResourceService.initialiseConnection(this.getFusionJWTToken(),this.getFusionUsername(), this.getFusionPassword(), 
                                                  this.getFusionEndpointURL(fusionEndpointName),this.getFetchSize(),this.getFetchStart());
        
        List<com.oracle.xmlns.apps.cdm.foundation.resources.resourceservice.Resource> result = null;
        try {
            
            result=fusionResourceService.findResource(xmlQuery,pAttributes,pQuery,pConjunction);
        } 
        catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        }
        catch (Exception e) {
            logMessage("exception @ findPerson");
            e.printStackTrace();
            throw new FusionGenericException(e.getLocalizedMessage());    
        }
        logMessage("Number of Resources found " + result.size());
      
        RESTResourceList ro2=new RESTResourceList();
        ro2.setResourceList(result);
        return ro2;

    }


    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public RESTResourceList getResource( @Context HttpHeaders pHttpHeaders,
                                               @PathParam("id") Long pId, @QueryParam("attributes") String pAttributes
                                                ) throws JAXBException {
        // Initialise the connections
        processRESTServiceHeaders(pHttpHeaders);
        
        fusionResourceService.initialiseConnection(this.getFusionJWTToken(),this.getFusionUsername(), this.getFusionPassword(), 
                                                  this.getFusionEndpointURL(fusionEndpointName),this.getFetchSize(),this.getFetchStart());
       List<com.oracle.xmlns.apps.cdm.foundation.resources.resourceservice.Resource> result = null;
        try {
            String seperator=fusionResourceService.getDefaultMinorQuerySeperator();
            result = fusionResourceService.findResource("", pAttributes, 
                                                        "ResourceProfileId"+seperator+"="+seperator+ pId, "");
        } catch (NumberFormatException e) {
            // Error in opportunityid?
            throw new FusionGenericException("NumberFormatException, received " +
                                      pId + " for personId");
        }
            catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
                throw new WebApplicationException(Response.Status.UNAUTHORIZED);
            }
            catch (Exception e) {
                logMessage("exception @ findPerson");
                e.printStackTrace();
                throw new FusionGenericException(e.getLocalizedMessage());
                
            }
        if (result.size()<1) {
            // No Person found
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
                                                               
        RESTResourceList rol2 = new RESTResourceList();
        rol2.setResourceList(result);
        return rol2;
    }

    





}

