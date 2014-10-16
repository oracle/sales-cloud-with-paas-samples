package oracle.fusion.pts.restService.types;

// JAXB Wrapper class for Opportunities

import com.oracle.xmlns.apps.cdm.foundation.parties.personservice.PersonProfile;
import com.oracle.xmlns.apps.hcm.people.roles.userdetailsservicev2.UserDetailsResult;
import com.oracle.xmlns.apps.sales.opptymgmt.opportunities.opportunityservice.Opportunity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import com.oracle.xmlns.apps.hcm.people.roles.userdetailsservicev2.UserDetails;

@XmlRootElement 

@XmlAccessorType(XmlAccessType.FIELD)
public class RESTUserDetailsResult {

    @XmlElementWrapper(name="UserDetailsList")
        @XmlElement (name="UserDetails")
    private List<UserDetails> userDetailsResult;


    public void setUserDetailsResult(List<UserDetails> userDetailsResult) {
        this.userDetailsResult = userDetailsResult;
    }

    public List<UserDetails> getUserDetailsResult() {
        return userDetailsResult;
    }
}
