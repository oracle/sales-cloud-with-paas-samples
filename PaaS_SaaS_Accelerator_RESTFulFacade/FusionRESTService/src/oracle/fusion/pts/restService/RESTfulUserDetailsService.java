

package oracle.fusion.pts.restService;


import com.oracle.xmlns.apps.cdm.foundation.parties.personservice.Person;

import com.oracle.xmlns.apps.hcm.people.roles.userdetailsservicev2.UserDetailsResult;
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
import oracle.demo.pts.fusionservices.FusionUserDetailsService;
import oracle.fusion.pts.restService.exceptions.FusionGenericException;
import oracle.fusion.pts.restService.types.RESTInteractionList;
import oracle.fusion.pts.restService.types.RESTPersonList;
import oracle.fusion.pts.restService.types.RESTUserDetailsResult;
import oracle.fusion.pts.restService.utils.RESTfulFusionService;
import com.oracle.xmlns.apps.hcm.people.roles.userdetailsservicev2.UserDetails;

@Path("/userdetails")

public class RESTfulUserDetailsService  extends RESTfulFusionService {
    
    FusionUserDetailsService fusionUserDetailsService = new FusionUserDetailsService();
    String fusionEndpointName="fusionHCMUserDetailsService";

    /**
     * @param pHttpHeaders
     * @param pInputStream
     * @return
     * @throws JAXBException
     */
    @GET
    @Path("/self")
    @Produces({"application/xml", "application/json"})
    public RESTUserDetailsResult findPersons(@Context HttpHeaders pHttpHeaders, 
                                                      InputStream pInputStream
                                                      ) throws JAXBException
    {
        String xmlQuery=convertStreamToString(pInputStream);                                                     
        // Initialise the connections
        processRESTServiceHeaders(pHttpHeaders);
        fusionUserDetailsService.initialiseConnection(this.getFusionJWTToken(), this.getFusionUsername(), this.getFusionPassword(), 
                                                  this.getFusionHCMEndpointURL(fusionEndpointName),this.getFetchSize(),this.getFetchStart());
        
        List<UserDetails> result = null;
        try {
            
            result=fusionUserDetailsService.findSelfUserDetails(xmlQuery,"","","AND").getValue();
        } 
        catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        }
        catch (Exception e) {
            logMessage("exception @ findPerson");
            e.printStackTrace();
            throw new FusionGenericException(e.getLocalizedMessage());    
        }

        RESTUserDetailsResult ro2=new RESTUserDetailsResult();
        ro2.setUserDetailsResult(result);
        return ro2;

    }





}

