
package oracle.demo.pts.fusionservices;

import com.oracle.xmlns.adf.svc.types.FindControl;
import com.oracle.xmlns.adf.svc.types.FindCriteria;
import com.oracle.xmlns.apps.cdm.foundation.parties.personservice.Person;

import com.oracle.xmlns.apps.crmcommon.activities.activitiesservice.TransientAppointment;

import com.sun.xml.ws.developer.WSBindingProvider;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.List;

import java.util.logging.Level;

import javax.annotation.Resource;

import javax.xml.namespace.QName;


import oracle.demo.pts.fusionservices.ActivityAppointment.ActivityAppointmentService;
import oracle.demo.pts.fusionservices.ActivityAppointment.ActivityAppointmentService_Service;
//import oracle.demo.pts.fusionservices.ActivityAppointment.types.Note;
//import oracle.demo.pts.fusionservices.ActivityAppointment.types.ObjectFactory;

import oracle.demo.pts.fusionservices.utils.FusionHelper;
import oracle.demo.pts.fusionservices.utils.FusionService;


public class FusionAppointmentService extends FusionService {
    // @WebServiceRef
    @Resource(name = "ActivityAppointmentService_Service")
    ActivityAppointmentService_Service appointmentService_Service;
    ActivityAppointmentService activityAppointmentService;
    FindCriteria fc = null;


    public void initialiseConnection(String pJWTToken, String pUsername,
                                     String pPassword,
                                     String pFusionEndpointURL, int pFetchSize,
                                     int pFetchStart) {
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
        if (appointmentService_Service == null)
            appointmentService_Service =
                    new ActivityAppointmentService_Service(wsdlLocationURL,
                                                           new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/transient",
                                                                     "ActivityAppointmentService"));


        activityAppointmentService =
                appointmentService_Service.getActivityAppointmentServiceSoapHttpPort(this.getSecurityFeature(pFusionEndpointURL,
                                                                                                             pJWTToken));
        // Call Helper Function
        this.initFusionEndpoint(pJWTToken, pUsername, pPassword,
                                (WSBindingProvider)activityAppointmentService,
                                pFusionEndpointURL, pFetchSize, pFetchStart);
    }


    // Method not currently used
    /*
    public Note createOpportunityNote(Long pOpportunityId, String noteText,
                                      String creatorEmailId) throws com.sun.xml.ws.client.ClientTransportAccessException,
                                                                    Exception {

        String pHostname="";
        Long creatorPartyId = 0L;
        FusionPersonService per = new FusionPersonService();
        per.initialiseConnection(this.fusionJWTToken, this.fusionUsername, this.fusionPassword, pHostname, 10, 0);
        List<Person> response = null;
        response =
                per.findPerson(null, "PartyId", "EmailAddress%=%" + creatorEmailId,
                               "AND");
        if (response != null && response.size() > 0) {
            creatorPartyId = response.iterator().next().getPartyId();
            logger.info("Resolved " + creatorEmailId + " to " +
                        creatorPartyId);
        } else {
            // Couldnt find personname, throw exception
            throw new Exception("CreateNote :  unable to find creator " +
                                creatorEmailId);
        }

        checkIfInitialised();
        ObjectFactory o = new ObjectFactory();
        Note newNote = o.createNote();
        newNote.setSourceObjectCode("OPPORTUNITY");
        newNote.setSourceObjectId(pOpportunityId.toString());
        newNote.setNoteTxt(noteText.getBytes("UTF-8"));
        newNote.setNoteTypeCode("GENERAL");
        JAXBElement<Long> l = o.createNoteCreatorPartyId(creatorPartyId);
        newNote.setCreatorPartyId(l);
        Note noteResponse = activityAppointmentService.createNotes(newNote);
        return noteResponse;
    }
*/

    public List<TransientAppointment> findAppointment(String pSOAPMessageString,
                                                      String pAttributes,
                                                      String pQuery,
                                                      String pConjunction) throws Exception {
        checkIfInitialised();

        fc =
 FusionHelper.createCustomFindCriteria(fc, pSOAPMessageString, pAttributes,
                                       pQuery, pConjunction, getFetchSize(),
                                       getFetchStart());
        List<TransientAppointment> appointments = null;
        try {
            appointments =
                    activityAppointmentService.findAppointment(fc, new FindControl());


        } catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw ctae;
        } catch (Exception e) {
            logMessage("Generic exception @ findAppointment");
            e.printStackTrace();
            throw e;
        }
        logMessage("Number of Appointments found " + appointments.size());
        return appointments;
    }


    public ActivityAppointmentService getActivityAppointmentService() {
        return activityAppointmentService;
    }


}
