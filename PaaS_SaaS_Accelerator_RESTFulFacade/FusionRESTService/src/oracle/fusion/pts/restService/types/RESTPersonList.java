package oracle.fusion.pts.restService.types;

// JAXB Wrapper class for Opportunities

import com.oracle.xmlns.apps.cdm.foundation.parties.personservice.Person;
import com.oracle.xmlns.apps.sales.opptymgmt.opportunities.opportunityservice.Opportunity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
@XmlAccessorType(XmlAccessType.FIELD)
public class RESTPersonList {
        @XmlElementWrapper(name="PersonList")
        @XmlElement (name="Person")
    private List<Person> personList;


    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
