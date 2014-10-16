package com.oracle.ptsdemo.healthcare.business.wsclient;


import com.oracle.ptsdemo.healthcare.business.HealthCareException;
import com.oracle.ptsdemo.healthcare.business.datasync.load.DataLoadPharmacy;
import com.oracle.ptsdemo.healthcare.business.util.HttpUtil;
import com.oracle.ptsdemo.healthcare.config.FusionConfig;
import com.oracle.ptsdemo.healthcare.wsclient.osc.person.PersonService;
import com.oracle.ptsdemo.healthcare.wsclient.osc.person.PersonService_Service;
import com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated.Conjunction;
import com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated.Email;
import com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated.FindControl;
import com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated.FindCriteria;
import com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated.ObjectFactory;
import com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated.OrganizationContact;
import com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated.Person;
import com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated.Phone;
import com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated.Relationship;
import com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated.ViewCriteria;
import com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated.ViewCriteriaItem;
import com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated.ViewCriteriaRow;
import com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated.Web;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;


/**
 */
public class PersonClient extends ObjectClient {
    /**
     */
    protected static PersonService_Service personService_Service;

    /**
     */
    protected PersonService personService;
    static org.apache.log4j.Logger logger =
        org.apache.log4j.Logger.getLogger(DataLoadPharmacy.class);

    /**
     */
    public PersonClient() throws HealthCareException {
        super();
        HttpUtil.removeProxy();
        init();
    }

    /**
     */
    protected void init() throws HealthCareException {
        String username =
            FusionConfig.getInstance().getProperty("FUSION_USER");
        String password =
            FusionConfig.getInstance().getProperty("FUSION_PASSWORD");

        //  Gabrielle.lee/welcome

        QName SERVICE_NAME =
            new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/applicationModule/",
                      "PersonService");
        URL wsdlURL = null;
        try {
            wsdlURL =
                    new URL(FusionConfig.getInstance().getProperty("PERSON_SERVICE") +
                            "?WSDL");
        } catch (MalformedURLException e) {
             throw new HealthCareException(e);
        }

        personService_Service =
                new PersonService_Service(wsdlURL, SERVICE_NAME);
        SecurityPoliciesFeature securityFeatures =
            new SecurityPoliciesFeature(new String[] { securityPolicy });


        personService =
                personService_Service.getPersonServiceSoapHttpPort(securityFeatures);
        Map<String, Object> reqContext =
            ((BindingProvider)personService).getRequestContext();

        reqContext.put(BindingProvider.USERNAME_PROPERTY, username);
        reqContext.put(BindingProvider.PASSWORD_PROPERTY, password);


    }


    /**
     * @param person
     */
    public void create(Person person) throws HealthCareException {
        try {
            personService.createPerson(person);

        } catch (Exception e) {
            throw new HealthCareException(e);
        }
    }

    /**
     * @param id
     * @return
     */
    public Person getPerson(long id) throws HealthCareException {
        Person rPerson = null;
        try {
            rPerson = personService.getPerson(id);

            logger.debug("rPerson.partyId " + rPerson.getPartyId());

        } catch (Exception e) {
            throw new HealthCareException(e);
        }
        return rPerson;
    }

    public void createPersonParty() {
        ObjectFactory objectFactory = new ObjectFactory();


        Person person = objectFactory.createPerson();


        person.setCreatedByModule(objectFactory.createPersonCreatedByModule("SALES"));

    }

    /**
     * @param person
     */
    public void updatePerson(Person person) throws HealthCareException {
        try {
            personService.updatePerson(person);
        } catch (Exception e) {
             throw new HealthCareException(e);
        }
    }

    /**
     * @param person
     */
    public void mergePerson(Person person) throws HealthCareException {
        try {
            personService.mergePerson(person);
        } catch (Exception e) {
            throw new HealthCareException(e);
        }
    }

    /**
     * @param pPerson
     * @return
     */
    public Person copy(Person pPerson) throws HealthCareException {

        Person rPerson = null;
        try {
            ObjectFactory factory = new ObjectFactory();
            rPerson = factory.createPerson();
            rPerson.setPersonFirstName(pPerson.getPersonFirstName());
            rPerson.setPersonLastName(pPerson.getPersonLastName());
        } catch (Exception e) {
            throw new HealthCareException(e);
        }
        return rPerson;
    }

    /**
     * @param sPerson
     * @param tPerson
     */
    public void copy(Person sPerson, Person tPerson) {
        ObjectFactory factory = new ObjectFactory();
        tPerson.setPersonFirstName(sPerson.getPersonFirstName());
        tPerson.setPersonLastName(sPerson.getPersonLastName());

        tPerson.setPersonTitle(sPerson.getPersonTitle());
        logger.debug("job title " + tPerson.getPersonTitle().getValue());

        logger.debug("sPerson.getEmailAddress()   ******************* " +
                           sPerson.getEmailAddress().getValue());
        logger.debug("sPerson.getRelationship().get(0).getRelationshipId() " +
                           sPerson.getRelationship().get(0).getRelationshipId());
        logger.debug("tPerson.getRelationship().get(0).getRelationshipId() " +
                           tPerson.getRelationship().get(0).getRelationshipId());

        copyRelationshipData(sPerson, tPerson);
        copyEmailData(sPerson, tPerson, factory);
        copyPhoneData(sPerson, tPerson, factory);
        copyWebData(sPerson, tPerson, factory);
    }

    /**
     *
     * @param sPerson
     * @param tPerson
     */
    private void copyRelationshipData(Person sPerson, Person tPerson) {
        for (Relationship sRelationship : sPerson.getRelationship()) {
            OrganizationContact sOrganizationContact =
                sRelationship.getOrganizationContact();
            tPerson.getRelationship().get(0).getOrganizationContact().setJobTitle(sOrganizationContact.getJobTitle());
        }
    }

    /**
     *
     * @param sPerson
     * @param tPerson
     * @param factory
     */
    private void copyWebData(Person sPerson, Person tPerson,
                             ObjectFactory factory) {
        for (Web web : sPerson.getWeb()) {
            logger.debug("Web****** " + web.getURL());
            boolean findIt = false;
            for (Web tWeb : tPerson.getWeb()) {
                if (tWeb.getURL().equals(web.getURL())) {
                    logger.debug("Find It Web****** " + tWeb.getURL());
                    findIt = true;
                    break;
                }
            }
            if (!findIt ) {
                Web tWeb = factory.createWeb();
                tWeb.setURL(web.getURL());
                tWeb.setCreatedByModule(web.getCreatedByModule());
                tWeb.setPrimaryFlag(web.isPrimaryFlag());
                tWeb.setRelationshipId(factory.createWebRelationshipId(tPerson.getRelationship().get(0).getRelationshipId()));
                tPerson.getWeb().add(tWeb);
            }

        }
    }
    
    /**
     *
     * @param sPerson
     * @param tPerson
     * @param factory
     */
    private void copyPhoneData(Person sPerson, Person tPerson,
                               ObjectFactory factory) {
        for (Phone phone : sPerson.getPhone()) {
            logger.debug("Phone***** " +
                               phone.getPhoneNumber().getValue());
            boolean findIt = false;
            for (Phone tPhone : tPerson.getPhone()) {
                if (tPhone.getPhoneNumber().getValue().equals(phone.getPhoneNumber().getValue())) {
                    logger.debug("Find it Phone***** " +
                                       tPhone.getPhoneNumber().getValue());
                    findIt = true;
                    break;
                }
            }
            if (!findIt) {
                Phone tPhone = factory.createPhone();
                tPhone.setPhoneAreaCode(phone.getPhoneAreaCode());
                tPhone.setPhoneCountryCode(phone.getPhoneCountryCode());
                tPhone.setPhoneLineType(phone.getPhoneLineType());
                tPhone.setPhoneNumber(phone.getPhoneNumber());
                tPhone.setCreatedByModule(phone.getCreatedByModule());
                tPhone.setPrimaryFlag(phone.isPrimaryFlag());
                tPhone.setRelationshipId(factory.createPhoneRelationshipId(tPerson.getRelationship().get(0).getRelationshipId()));
                tPerson.getPhone().add(tPhone);
            }

        }
    }


    /**
     *
     * @param sPerson
     * @param tPerson
     * @param factory
     */
    private void copyEmailData(Person sPerson, Person tPerson,
                               ObjectFactory factory) {
        for (Email email : sPerson.getEmail()) {
            
            logger.debug("Email***** " + email.getEmailAddress());
            boolean findIt = false;
            for (Email tEmail : tPerson.getEmail()) {
                if (tEmail.getEmailAddress().equals(email.getEmailAddress())) {

                    logger.debug("Find It Email***** " +
                                       tEmail.getEmailAddress());
                    logger.debug("tEmail.getRelationshipId() " +
                                       tEmail.getRelationshipId().getValue());
                    logger.debug("email.getRelationshipId() " +
                                       email.getRelationshipId().getValue());

                    findIt = true;
                    break;
                }
            }
            if (!findIt) {
                Email tEmail = factory.createEmail();
                tEmail.setEmailAddress(email.getEmailAddress().replace(" ",
                                                                       ""));
                tEmail.setCreatedByModule(email.getCreatedByModule());
                tEmail.setPrimaryFlag(email.isPrimaryFlag());
                tEmail.setRelationshipId(factory.createEmailRelationshipId(tPerson.getRelationship().get(0).getRelationshipId()));
                tPerson.getEmail().add(tEmail);
            }
        }
    }


    /**
     * @param personName
     * @return
     */
    public Person findPersonByName(String personName) throws HealthCareException {
        Person rPerson = null;
        try {
            ObjectFactory factory = new ObjectFactory();
            FindCriteria findCriteria = factory.createFindCriteria();
            findCriteria.setExcludeAttribute(false);
            ViewCriteria viewCriteria = factory.createViewCriteria();
            ViewCriteriaRow viewCriteriaRow = factory.createViewCriteriaRow();
            viewCriteriaRow.setUpperCaseCompare(true);
            viewCriteriaRow.setConjunction(Conjunction.AND);

            ViewCriteriaItem viewCriteriaItem =
                factory.createViewCriteriaItem();
            viewCriteriaItem.setUpperCaseCompare(true);
            viewCriteriaItem.setAttribute("PartyName");
            viewCriteriaItem.setOperator("=");
            viewCriteriaItem.getValue().add(personName);
            viewCriteriaRow.getItem().add(viewCriteriaItem);


            viewCriteria.getGroup().add(viewCriteriaRow);
            findCriteria.setFilter(viewCriteria);
            findCriteria.setFetchSize(rowSize);
            FindControl findControl = factory.createFindControl();
            findControl.setRetrieveAllTranslations(true);

            int start = 0;


            while (true) {
                findCriteria.setFetchStart(start);
                start += rowSize;
                List<Person> resultList =
                    personService.findPerson(findCriteria,
                                             findControl).getValue();
                for (Person person : resultList) {
                    rPerson = person;

                    break;

                }


                if (resultList.size() == 0) {
                    break;
                }
                break;
            }


        } catch (Exception e) {
             
            logger.info(e.getMessage());
            throw new HealthCareException(e);
        }


        return rPerson;
    }
}


