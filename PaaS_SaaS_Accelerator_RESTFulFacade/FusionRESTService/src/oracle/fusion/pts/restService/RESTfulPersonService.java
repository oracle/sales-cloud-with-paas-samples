
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
import oracle.demo.pts.fusionservices.FusionPersonService;
import oracle.fusion.pts.restService.exceptions.FusionGenericException;
import oracle.fusion.pts.restService.types.RESTInteractionList;
import oracle.fusion.pts.restService.types.RESTPersonList;
import oracle.fusion.pts.restService.utils.RESTfulFusionService;


@Path("/person")

public class RESTfulPersonService  extends RESTfulFusionService {
    FusionPersonService fusionPersonService = new FusionPersonService();
    String fusionEndpointName="fusionCRMPersonEndpoint";
    
    @POST
    @Path("/xmlquery")
    @Produces({"application/xml", "application/json"})
    public RESTPersonList findXMLQuery(@Context HttpHeaders pHttpHeaders,                                                     
                                                      InputStream pInputStream
                                                      ) throws JAXBException
    {
        return (findPersons(pHttpHeaders,"","","",pInputStream));                                           
    }
    @GET
    @Produces({"application/xml", "application/json"})
    public RESTPersonList findPersons(@Context HttpHeaders pHttpHeaders, 
                                                      @QueryParam("attributes") String pAttributes,
                                                      @QueryParam("query") String pQuery,
                                                      @QueryParam("conjunction") String pConjunction,
                                                      
                                                      InputStream pInputStream
                                                      ) throws JAXBException
    {
        String xmlQuery=convertStreamToString(pInputStream);                                                     
        // Initialise the connections
        processRESTServiceHeaders(pHttpHeaders);
        fusionPersonService .initialiseConnection(this.getFusionJWTToken(), this.getFusionUsername(), this.getFusionPassword(), this.getFusionEndpointURL(fusionEndpointName), this.getFetchSize(), this.getFetchStart());
        
        List<Person> result = null;
        try {
            
            
            result=fusionPersonService.findPerson(xmlQuery,pAttributes,pQuery,pConjunction);
        } 
        catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        }
        catch (Exception e) {
            logMessage("exception @ findPerson");
            e.printStackTrace();
            throw new FusionGenericException(e.getLocalizedMessage());    
        }
        logMessage("Number of Persons found " + result.size());
      
        RESTPersonList ro2=new RESTPersonList();
        ro2.setPersonList(result);
        return ro2;

    }


    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public RESTPersonList getPerson(    @Context HttpHeaders pHttpHeaders,
                                        @PathParam("id") Long pId,
                                        @QueryParam("attributes") String pAttributes
                                                ) throws JAXBException {
        // Initialise the connections
        processRESTServiceHeaders(pHttpHeaders);
        fusionPersonService.initialiseConnection(this.getFusionJWTToken(), this.getFusionUsername(), this.getFusionPassword(), this.getFusionEndpointURL(fusionEndpointName), this.getFetchSize(), this.getFetchStart());
        // Find specific opportunity
        List<Person> result = null;
        try {
            String seperator=fusionPersonService.getDefaultMinorQuerySeperator();
            result = fusionPersonService.findPerson("", pAttributes, 
                                                    "PartyId"+seperator+"="+seperator+pId, "");
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
        logMessage("Result of findPerson "+result.get(0).getPartyName());
        // Wrap it up so JAX-RS is happy
       
        RESTPersonList rol2 = new RESTPersonList();
        rol2.setPersonList(result);
        return rol2;
    }
}
