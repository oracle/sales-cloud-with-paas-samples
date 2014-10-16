
package oracle.fusion.pts.restService;

import com.oracle.xmlns.apps.cdm.foundation.parties.relationshipservice.OrganizationContact;
import com.oracle.xmlns.apps.cdm.foundation.parties.relationshipservice.Relationship;
import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.MySalesAccount;
import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.SalesParty;

import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types.GetSalesParty;

import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types.GetSalesPartyResponse;

import oracle.fusion.pts.restService.utils.RESTfulFusionService;

import java.io.InputStream;


import java.util.ArrayList;
import java.util.Iterator;
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

import oracle.demo.pts.fusionproxy.salesparty.SalesPartyService;
import oracle.demo.pts.fusionservices.FusionSalesPartyService;

import oracle.fusion.pts.restService.exceptions.FusionGenericException;
import oracle.fusion.pts.restService.types.RESTMySalesAccountList;
import oracle.fusion.pts.restService.types.RESTOrganizationContactList;
import oracle.fusion.pts.restService.types.RESTSalesPartyList;


@Path("/salesparty")

public class RESTfulSalesPartyService  extends RESTfulFusionService {
    FusionSalesPartyService fusionSalesPartyService = new FusionSalesPartyService();
    String fusionEndpointName="fusionCRMSalesPartyEndpoint";
   
    

    @POST
    @Path("/xmlquery")
    @Produces({"application/xml", "application/json"})
    public RESTSalesPartyList findSalesPartyXMLQuery(@Context HttpHeaders pHttpHeaders,
                                                      InputStream pInputStream
                                                      ) throws JAXBException
    {
        return (findSalesParty(pHttpHeaders,"","","",pInputStream));                                           
    }
    @GET
    @Produces({"application/xml", "application/json"})
    public RESTSalesPartyList findSalesParty(@Context HttpHeaders pHttpHeaders, 
                                                      @QueryParam("attributes") String pAttributes,
                                                      @QueryParam("query") String pQuery,
                                                      @QueryParam("conjunction") String pConjunction,
                                                      
                                                      InputStream pInputStream
                                                      ) throws JAXBException
    {
        String xmlQuery=convertStreamToString(pInputStream);                                                     
        // Initialise the connections
        processRESTServiceHeaders(pHttpHeaders);
        fusionSalesPartyService.initialiseConnection(this.getFusionJWTToken(), getFusionUsername(), getFusionPassword(), getFusionEndpointURL(fusionEndpointName), this.getFetchSize(), this.getFetchStart());
        
        List<SalesParty> result = null;
        try {
            
            result=fusionSalesPartyService.findSalesParty(xmlQuery,pAttributes,pQuery,pConjunction);
        } 
        catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        }
        catch (Exception e) {
            logMessage("exception @ findSalesParty");
            e.printStackTrace();
            throw new FusionGenericException(e.getLocalizedMessage());    
        }
        logMessage("Number of SalesParty found " + result.size());
        // Add the resulting List of JAXB objects to the RESTXXXList object
        // this will ensure the JAX-WS JAXB parser will produce a nice list
        RESTSalesPartyList ro2=new RESTSalesPartyList();
        ro2.setSalesPartyList(result);
        return ro2;
    }


    @POST
    @Path("/mysalesaccount/xmlquery")
    @Produces({"application/xml", "application/json"})
    public RESTMySalesAccountList findMySalesAccountXMLQuery(@Context HttpHeaders pHttpHeaders,
                                                      InputStream pInputStream
                                                      ) throws JAXBException
    {
        return (findMySalesAccount(pHttpHeaders,"","",pInputStream));                                           
    }
    @GET
    @Path ("/mysalesaccount")
    @Produces({"application/xml", "application/json"})
    public RESTMySalesAccountList findMySalesAccount(@Context HttpHeaders pHttpHeaders, 
                                                      @QueryParam("attributes") String pAttributes,
                                                      @QueryParam("query") String pQuery,
                                                      InputStream pInputStream
                                                      ) throws JAXBException
    {
        String xmlQuery=convertStreamToString(pInputStream);                                                     
        // Initialise the connections
        processRESTServiceHeaders(pHttpHeaders);
        fusionSalesPartyService.initialiseConnection(this.getFusionJWTToken(), getFusionUsername(), getFusionPassword(), getFusionEndpointURL(fusionEndpointName), this.getFetchSize(), this.getFetchStart());
        
        List<MySalesAccount> result = null;
        try {
            
            result=fusionSalesPartyService.findMySalesAccounts(xmlQuery,pAttributes,pQuery,"AND");
        } 
        catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        }
        catch (Exception e) {
            logMessage("exception @ findMySalesAccount");
            e.printStackTrace();
            throw new FusionGenericException(e.getLocalizedMessage());    
        }
        logMessage("Number of SalesParty found " + result.size());
        // Add the resulting List of JAXB objects to the RESTXXXList object
        // this will ensure the JAX-WS JAXB parser will produce a nice list
        RESTMySalesAccountList ro2=new RESTMySalesAccountList();
        ro2.setMySalesAccountList(result);
        return ro2;
    }

    // This method gets the contacts of a specific salesAccount
    //
    @GET
    @Path("/salesaccount/{id}/contacts")
    public RESTOrganizationContactList getSalesAccountContacts(@Context HttpHeaders pHttpHeaders, 
                                                    @PathParam("id") Long partyId,
                                                      @QueryParam("attributes") String pAttributes,
                                                      @QueryParam("query") String pQuery,
                                                      InputStream pInputStream
                                                      ) throws JAXBException
    {
        List<OrganizationContact> organizationContacts = new ArrayList();
        String xmlQuery=convertStreamToString(pInputStream);                                                     
        // Initialise the connections
        processRESTServiceHeaders(pHttpHeaders);
        fusionSalesPartyService.initialiseConnection(this.getFusionJWTToken(), getFusionUsername(), getFusionPassword(), getFusionEndpointURL(fusionEndpointName), this.getFetchSize(), this.getFetchStart());
        try {
            
            GetSalesParty gsp= new GetSalesParty();
            gsp.setPartyId(partyId);
            GetSalesPartyResponse gspr=null;
            gspr=fusionSalesPartyService.getSalesPartyService().getSalesParty(gsp);
            if (gspr==null || gspr.getResult()==null) {
                throw new WebApplicationException(Response.Status.NOT_FOUND);
            }
            
            for (Relationship  m_relationship : gspr.getResult().getOrganizationParty().iterator().next().getRelationship()) 
            {
                    System.out.println(m_relationship.getRelationshipCode());                                  
                    // Found OrgContact
                    if (m_relationship.getRelationshipCode().equals("CONTACT"))
                        organizationContacts.add(m_relationship.getOrganizationContact());
        
            }
            
        } 
        catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        }
        
        catch (WebApplicationException e) {
            throw e;
        }
        catch (Exception e) {
            logMessage("exception @ salesaccount/{id}/contacts");
            e.printStackTrace();
            throw new FusionGenericException(e.getLocalizedMessage());    
        }
        logMessage("Number of Contacts for Org "+partyId+" found " + organizationContacts.size());
        // Add the resulting List of JAXB objects to the RESTXXXList object
        // this will ensure the JAX-WS JAXB parser will produce a nice list
        RESTOrganizationContactList ro2=new RESTOrganizationContactList();
        ro2.setOrganizationContactList(organizationContacts);
        return ro2;
       
    }
    

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public RESTSalesPartyList getSalesParty(    @Context HttpHeaders pHttpHeaders,
                                                @PathParam("id") Long pId,
                                                @QueryParam("attributes") String pAttributes
                                                ) throws JAXBException {
        // Initialise the connections
        processRESTServiceHeaders(pHttpHeaders);
        fusionSalesPartyService.initialiseConnection(this.getFusionJWTToken(), this.getFusionUsername(), this.getFusionPassword(), this.getFusionEndpointURL(fusionEndpointName), this.getFetchSize(), this.getFetchStart());
        // Find specific opportunity
        List<SalesParty> result = null;
        try {
            String seperator=fusionSalesPartyService.getDefaultMinorQuerySeperator();
            result=fusionSalesPartyService.findSalesParty("", pAttributes, 
                                                          "PartyId"+seperator+"="+seperator+pId, "");
            
            
        } catch (NumberFormatException e) {
            // Error in opportunityid?
            throw new FusionGenericException("NumberFormatException, received " +
                                      pId + " for PartyId");
        }
            catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
                throw new WebApplicationException(Response.Status.UNAUTHORIZED);
            }
            catch (Exception e) {
                logMessage("exception @ findSalesParty");
                e.printStackTrace();
                throw new FusionGenericException(e.getLocalizedMessage());
                
            }
        if (result.size()<1) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        // Wrap it up so JAX-RS is happy
        
        RESTSalesPartyList rol2 = new RESTSalesPartyList();
        rol2.setSalesPartyList(result);
        return rol2;
    }

    

}
