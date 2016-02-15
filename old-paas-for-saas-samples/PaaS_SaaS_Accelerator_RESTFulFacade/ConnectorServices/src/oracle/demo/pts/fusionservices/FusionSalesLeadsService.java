
package oracle.demo.pts.fusionservices;

import com.oracle.xmlns.adf.svc.types.FindControl;
import com.oracle.xmlns.adf.svc.types.FindCriteria;

import com.oracle.xmlns.oracle.apps.marketing.leadmgmt.leads.leadservice.MklLead;
import com.sun.xml.ws.developer.WSBindingProvider;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.List;

import java.util.logging.Level;

import javax.annotation.Resource;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceRef;

import oracle.demo.pts.fusionproxy.saleslead.SalesLeadService;
import oracle.demo.pts.fusionproxy.saleslead.SalesLeadService_Service;
import oracle.demo.pts.fusionservices.utils.FusionHelper;
import oracle.demo.pts.fusionservices.utils.FusionService;


public class FusionSalesLeadsService extends FusionService {
    //@WebServiceRef
    @Resource(name = "SalesLeadService_Service")    
    SalesLeadService_Service salesLeadService_Service;
    SalesLeadService salesLeadService;
    FindCriteria fc=null;
    

    
    public void initialiseConnection(String pJWTToken, String pUsername, String pPassword, String pFusionEndpointURL, int pFetchSize, int pFetchStart) {
        // This method initialises the connection to the FusionCRM WS
        // Currently does it every time, but one could/should be able to cache if needed
        System.setProperty("javax.xml.transform.TransformerFactory",
                "com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl");


        URL wsdlLocationURL = null;
               try {
                   wsdlLocationURL = new URL(pFusionEndpointURL + "?wsdl");
               } catch (MalformedURLException e) {
                   e.printStackTrace();
                   logger.log(Level.ALL, e.getLocalizedMessage());
               }
        
        
          if (salesLeadService_Service==null) salesLeadService_Service = new SalesLeadService_Service(wsdlLocationURL,
          new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/",
                    "SalesLeadService"));
        salesLeadService =
                salesLeadService_Service.getSalesLeadServiceSoapHttpPort(this.getSecurityFeature(pFusionEndpointURL, pJWTToken));
        // Call Helper Function
        initFusionEndpoint(pJWTToken, pUsername, pPassword, (WSBindingProvider)salesLeadService, pFusionEndpointURL, pFetchSize, pFetchStart);
    }
    
    
    
    
    public List<MklLead> findSalesLead(String pSOAPMessageString,String pAttributes,String pQuery,String pConjunction) throws Exception {
        // Initialise the connections
        checkIfInitialised();
        fc=(FindCriteria)FusionHelper.createCustomFindCriteria(fc, pSOAPMessageString, pAttributes, pQuery, pConjunction,getFetchSize(),getFetchStart());
        List<MklLead> result = null;
        try {
            // Call Fusion findOpportunity
            
           result=salesLeadService.findSalesLead(fc, new FindControl());
         } catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw ctae;
        } catch (Exception e) {
            logMessage("Generic exception @ findMkLead");
            e.printStackTrace();
            throw e;
        }
        

        return result;
    }


    public SalesLeadService getSalesLeadService() {
        return salesLeadService;
    }


}
