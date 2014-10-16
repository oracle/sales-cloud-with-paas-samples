package oracle.fusion.pts.restService.types;

// JAXB Wrapper class for Opportunities

import com.oracle.xmlns.apps.cdm.foundation.parties.personservice.PersonProfile;
import com.oracle.xmlns.apps.sales.opptymgmt.opportunities.opportunityservice.Opportunity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
@XmlAccessorType(XmlAccessType.FIELD)
public class RESTPersonProfileList {
        @XmlElementWrapper(name="PersonProfileList")
        @XmlElement (name="PersonProfile")
    private List<PersonProfile> personProfileList;


    public void setPersonProfileList(List<PersonProfile> personProfileList) {
        this.personProfileList = personProfileList;
    }

    public List<PersonProfile> getPersonProfileList() {
        return personProfileList;
    }
}
