
package oracle.demo.pts.fusionservices;


import com.oracle.xmlns.adf.svc.types.FindControl;
import com.oracle.xmlns.adf.svc.types.FindCriteria;

import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.MySalesAccount;
import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.SalesParty;

import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types.FindMySalesAccountMyVC;
import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types.FindMySalesAccountMyVCResponse;
import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types.FindSalesParty;

import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types.FindSalesPartyResponse;

import com.sun.xml.ws.developer.WSBindingProvider;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.List;

import java.util.logging.Level;

import javax.annotation.Resource;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceRef;

import oracle.demo.pts.fusionproxy.salesparty.SalesPartyService;
import oracle.demo.pts.fusionproxy.salesparty.SalesPartyService_Service;
import oracle.demo.pts.fusionservices.utils.FusionHelper;
import oracle.demo.pts.fusionservices.utils.FusionService;


public class FusionSalesPartyService extends FusionService {
    // @WebServiceRef
    @Resource(name = "SalesPartyService_Service")
    SalesPartyService_Service salesPartyService_Service;
    SalesPartyService salesPartyService;
    FindCriteria fc = null;


    public void initialiseConnection(String pJWTToken, String pUsername,
                                     String pPassword,
                                     String pFusionEndpointURL, int pFetchSize,
                                     int pFetchStart) {
        // This method initialises the connection to the FusionCRM WS
        // Currently does it every time, but one could/should be able to cache if needed
        System.setProperty("javax.xml.transform.TransformerFactory",
                "com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl");


        
        URL wsdlLocationURL=null;
               try {
                   wsdlLocationURL = new URL(pFusionEndpointURL+"?wsdl");
               } catch (MalformedURLException e) {
                   e.printStackTrace();
                   logger.log(Level.ALL, e.getLocalizedMessage());
               }
        
        if (salesPartyService_Service == null)
            salesPartyService_Service = new SalesPartyService_Service(wsdlLocationURL,
          new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/",
                    "SalesPartyService"));
        salesPartyService =
                salesPartyService_Service.getSalesPartyServiceSoapHttpPort(this.getSecurityFeature(pFusionEndpointURL,
                                                                                                   pJWTToken));

        initFusionEndpoint(pJWTToken, pUsername, pPassword,
                           (WSBindingProvider)salesPartyService,
                           pFusionEndpointURL, pFetchSize, pFetchStart);
    }


    public List<SalesParty> findSalesParty(String pSOAPMessageString,
                                           String pAttributes, String pQuery,
                                           String pConjunction) throws Exception {
        // Initialise the connections
        checkIfInitialised();


        fc =
 (FindCriteria)FusionHelper.createCustomFindCriteria(fc, pSOAPMessageString,
                                                     pAttributes, pQuery,
                                                     pConjunction,
                                                     getFetchSize(),
                                                     getFetchStart());

        List<SalesParty> result = null;
        FindSalesPartyResponse fspr = null;
        try {
            FindSalesParty fsp = new FindSalesParty();
            fsp.setFindControl(new FindControl());
            fsp.setFindCriteria(fc);
            fspr = salesPartyService.findSalesParty(fsp);
        } catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw ctae;
        } catch (Exception e) {
            logMessage("Generic exception @ findSalesParty");
            e.printStackTrace();
            throw e;
        }

        return fspr.getResult();
    }


    /**
     * @param pSOAPMessageString
     * @param pAttributes
     * @param pQuery
     * @param pConjunction
     * @return
     * @throws Exception
     */
    public List<MySalesAccount> findMySalesAccounts(String pSOAPMessageString,
                                                    String pAttributes,
                                                    String pQuery,
                                                    String pConjunction) throws Exception {
        // Initialise the connections
        checkIfInitialised();

        fc =
 (FindCriteria)FusionHelper.createCustomFindCriteria(fc, pSOAPMessageString,
                                                     pAttributes, pQuery,
                                                     pConjunction,
                                                     getFetchSize(),
                                                     getFetchStart());

       
        FindMySalesAccountMyVCResponse fspr = null;
        try {
            FindMySalesAccountMyVC fsp = new FindMySalesAccountMyVC();
            fsp.setFindControl(new FindControl());
            fsp.setFindCriteria(fc);


            fspr = salesPartyService.findMySalesAccountMyVC(fsp);
        } catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw ctae;
        } catch (Exception e) {
            logMessage("Generic exception @ findMySalesAccounts");
            e.printStackTrace();
            throw e;
        }

        return fspr.getResult();

    }

    public SalesPartyService getSalesPartyService() {
        return salesPartyService;
    }


}
