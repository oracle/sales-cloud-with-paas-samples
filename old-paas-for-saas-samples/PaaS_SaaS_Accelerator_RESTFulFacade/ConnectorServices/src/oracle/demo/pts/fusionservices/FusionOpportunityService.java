
package oracle.demo.pts.fusionservices;

import com.oracle.xmlns.adf.svc.types.FindControl;
import com.oracle.xmlns.adf.svc.types.FindCriteria;
import com.oracle.xmlns.apps.sales.opptymgmt.opportunities.opportunityservice.Opportunity;

import com.sun.xml.ws.developer.WSBindingProvider;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import java.util.List;

import javax.annotation.Resource;

import javax.xml.ws.WebServiceRef;

import oracle.demo.pts.fusionproxy.opportunities.OpportunityService;
import oracle.demo.pts.fusionproxy.opportunities.OpportunityService_Service;
import oracle.demo.pts.fusionservices.utils.FusionHelper;
import oracle.demo.pts.fusionservices.utils.FusionService;
import oracle.demo.pts.fusionservices.utils.fusionServiceNotInitialised;



public class FusionOpportunityService extends FusionService {

//    @WebServiceRef
    @Resource(name = "OpportunityService_Service")    
    OpportunityService_Service opportunityService_Service;
    OpportunityService opportunityService;
    FindCriteria fc=null;
   

   
    public void initialiseConnection(String pJWTToken, String pUsername, String pPassword, String pFusionEndpointURL, int pFetchSize, int pFetchStart) {
        // Only Construct it if it needs constructing
        System.setProperty("javax.xml.transform.TransformerFactory",
                "com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl");


        URL wsdlLocationURL=null;
        try {
            wsdlLocationURL = new URL(pFusionEndpointURL+"?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
           
        }
        if (opportunityService_Service == null)
            opportunityService_Service =
                    new OpportunityService_Service(wsdlLocationURL,
                                                   new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/",
                                                             "OpportunityService"));


        opportunityService =
                opportunityService_Service.getOpportunityServiceSoapHttpPort(this.getSecurityFeature(pFusionEndpointURL, pJWTToken));
        // Call Helper Function
        initFusionEndpoint(pJWTToken, pUsername, pPassword, (WSBindingProvider)opportunityService, pFusionEndpointURL, pFetchSize, pFetchStart);
    }
    
    
    
    /**
     * Returns list of visible opportunities
     * @param pAttributes : level 1 Attributes to be retrieved
     * @param pQuery      : level 1 Attrubutes to be queried by, See FusionHelper.java for format
     * @return List<Opportunity> Objects from WS JAXB format
     */
    public List<Opportunity> findOpportunity(String pSOAPMessageString,String pAttributes,String pQuery,String pConjunction) throws Exception {
        checkIfInitialised();
        
        
        fc=FusionHelper.createCustomFindCriteria(fc, pSOAPMessageString, pAttributes, pQuery, pConjunction,getFetchSize(),getFetchStart());

        List<Opportunity> ops = null;
        try {
            // Call Fusion findOpportunity
            ops = opportunityService.findOpportunity(fc, new FindControl());
        } catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw ctae;
        } catch (Exception e) {
            logMessage("Generic exception @ findOpportunity");
            e.printStackTrace();
            throw e;
        }
        logMessage("Number of Opportunities found " + ops.size());
        return ops;
    }

   
    // ToDo
    // createOpportunity
    // addRevenueItem
    // addOpportunityResource

    public OpportunityService getOpportunityService() {
        return opportunityService;
    }

}
