
package oracle.fusion.pts.restService;


import com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.Location;

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

import oracle.demo.pts.fusionservices.FusionLocationService;

import oracle.fusion.pts.restService.exceptions.FusionGenericException;
import oracle.fusion.pts.restService.types.RESTLocationList;
import oracle.fusion.pts.restService.utils.RESTfulFusionService;


@Path("/location")

public class RESTfulLocationService  extends RESTfulFusionService {
    FusionLocationService fusionLocationService = new FusionLocationService();
    String fusionEndpointName="fusionCRMLocationEndpoint";
   
    @POST
    @Path("/xmlquery")
    @Produces({"application/xml", "application/json"})
    public RESTLocationList findXMLQuery(@Context HttpHeaders pHttpHeaders,
                                                      InputStream pInputStream
                                                      ) throws JAXBException
    {
        return (findLocations(pHttpHeaders,"","","",pInputStream));                                           
    }
                                                          
                                                          
                                                          
    @GET
    @Produces({"application/xml", "application/json"})
    public RESTLocationList findLocations(@Context HttpHeaders pHttpHeaders, 
                                                      @QueryParam("attributes") String pAttributes,
                                                      @QueryParam("query") String pQuery,@QueryParam("conjunction") String pConjunction,
                                                      InputStream pInputStream
                                                      ) throws JAXBException
    {
        String xmlQuery=convertStreamToString(pInputStream);                                                     
        // Initialise the connections
        processRESTServiceHeaders(pHttpHeaders);
        fusionLocationService.initialiseConnection(this.getFusionJWTToken(), this.getFusionUsername(), this.getFusionPassword(), this.getFusionEndpointURL(fusionEndpointName), this.getFetchSize(), this.getFetchStart());
        
        List<Location> result = null;
        try {
            result=fusionLocationService.findLocation(xmlQuery,pAttributes,pQuery,pConjunction);
        } 
        catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        }
        catch (Exception e) {
            logMessage("exception @ findLocation");
            e.printStackTrace();
            throw new FusionGenericException(e.getLocalizedMessage());    
        }
        logMessage("Number of Locations found " + result.size());
      
        RESTLocationList ro2=new RESTLocationList();
        ro2.setLocationList(result);
        return ro2;

    }


    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public RESTLocationList getLocation( @Context HttpHeaders pHttpHeaders, 
                                         @PathParam("id") Long pId, 
                                         @QueryParam("attributes") String pAttributes
                                         ) throws JAXBException {
        // Initialise the connections
        processRESTServiceHeaders(pHttpHeaders);
        fusionLocationService.initialiseConnection(this.getFusionJWTToken(), this.getFusionUsername(), this.getFusionPassword(), this.getFusionEndpointURL(fusionEndpointName), this.getFetchSize(), this.getFetchStart());
        // Find specific opportunity
        List<Location> result = null;
        try {
            String seperator=fusionLocationService.getDefaultMinorQuerySeperator();
            result = fusionLocationService.findLocation("", pAttributes, 
                                "LocationId"+seperator+"="+seperator+pId, "");
                
        } catch (NumberFormatException e) {
            // Error in opportunityid?
            throw new FusionGenericException("NumberFormatException, received " +
                                      pId + " for LocationId");
        }
            catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
                throw new WebApplicationException(Response.Status.UNAUTHORIZED);
            }
            catch (Exception e) {
                logMessage("exception @ findLocation");
                e.printStackTrace();
                throw new FusionGenericException(e.getLocalizedMessage());
                
            }
        if (result.size()<1) {
            // No Location found
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        logMessage("Result of findLocation (Address1)"+result.get(0));
        // Wrap it up so JAX-RS is happy
      
        RESTLocationList rol2 = new RESTLocationList();
        rol2.setLocationList(result);
        return rol2;
    }
    
}
