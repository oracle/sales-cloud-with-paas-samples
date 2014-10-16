

package oracle.fusion.pts.restService;

import com.oracle.xmlns.oracle.apps.marketing.leadmgmt.leads.leadservice.MklLead;

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

import oracle.demo.pts.fusionservices.FusionSalesLeadsService;
import oracle.fusion.pts.restService.exceptions.FusionGenericException;
import oracle.fusion.pts.restService.types.RESTSalesLeadList;
import oracle.fusion.pts.restService.utils.RESTfulFusionService;


@Path("/saleslead")

public class RESTfulSalesLeadsService  extends RESTfulFusionService {
    FusionSalesLeadsService fusionLeadsService = new FusionSalesLeadsService();
    String  fusionEndpointName="fusionCRMSalesLeadsEndpoint";
  
    @POST
    @Path("/xmlquery")
    @Produces({"application/xml", "application/json"})
    public RESTSalesLeadList findXMLQuery(@Context HttpHeaders pHttpHeaders, 
                                                      @QueryParam("attributes") String pAttributes,
                                                      @QueryParam("query") String pQuery,
                                                      InputStream pInputStream
                                                      ) throws JAXBException
    {
        return (findSalesLeads(pHttpHeaders,pAttributes,pQuery,"",pInputStream));                                           
    }
    @GET
    @Produces({"application/xml", "application/json"})
    public RESTSalesLeadList findSalesLeads(@Context HttpHeaders pHttpHeaders, 
                                                      @QueryParam("attributes") String pAttributes,
                                                      @QueryParam("query") String pQuery,
                                                      @QueryParam("conjunction") String pConjunction,
                                            
                                                      InputStream pInputStream
                                                      ) throws JAXBException
    {
        String xmlQuery=convertStreamToString(pInputStream);                                                     
        // Initialise the connections
        processRESTServiceHeaders(pHttpHeaders);
        fusionLeadsService .initialiseConnection(this.getFusionJWTToken(), this.getFusionUsername(), this.getFusionPassword(), this.getFusionEndpointURL(fusionEndpointName), this.getFetchSize(), this.getFetchStart());
        
        List<MklLead> result = null;
        try {
            
            result=fusionLeadsService.findSalesLead(xmlQuery,pAttributes,pQuery,pConjunction);
        } 
        catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        }
        catch (Exception e) {
            logMessage("exception @ findLeads");
            e.printStackTrace();
            throw new FusionGenericException(e.getLocalizedMessage());    
        }
        logMessage("Number of Leads found " + result.size());
      
        RESTSalesLeadList ro2=new RESTSalesLeadList();
        ro2.setMklLeadList(result);
        return ro2;

    }


    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public RESTSalesLeadList getLeads( @Context HttpHeaders pHttpHeaders,
                                               @PathParam("id") Long pId, @QueryParam("attributes") String pAttributes
                                                ) throws JAXBException {
        // Initialise the connections
        processRESTServiceHeaders(pHttpHeaders);
        fusionLeadsService.initialiseConnection(this.getFusionJWTToken(), this.getFusionUsername(), this.getFusionPassword(), this.getFusionEndpointURL(fusionEndpointName), this.getFetchSize(), this.getFetchStart());
        // Find specific opportunity
        List<MklLead> result = null;
        try {
            String seperator=fusionLeadsService.getDefaultMinorQuerySeperator();
            result = fusionLeadsService.findSalesLead("", pAttributes, 
                                                      "LeadId"+seperator+"="+seperator+pId, "");
        } catch (NumberFormatException e) {
            // Error in opportunityid?
            throw new FusionGenericException("NumberFormatException, received " +
                                      pId + " for LeadsId");
        }
            catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
                throw new WebApplicationException(Response.Status.UNAUTHORIZED);
            }
            catch (Exception e) {
                logMessage("exception @ findLeads");
                e.printStackTrace();
                throw new FusionGenericException(e.getLocalizedMessage());
                
            }
        if (result.size()<1) {
            // No Leads found
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        logMessage("Result of findLeads "+result.get(0).getLeadId());
       
        RESTSalesLeadList rol2 = new RESTSalesLeadList();
        rol2.setMklLeadList(result);
        return rol2;
    }
}
