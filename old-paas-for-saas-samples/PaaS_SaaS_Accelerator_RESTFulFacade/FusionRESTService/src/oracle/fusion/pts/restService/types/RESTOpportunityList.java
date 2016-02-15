package oracle.fusion.pts.restService.types;

// JAXB Wrapper class for Opportunities


import com.oracle.xmlns.apps.sales.opptymgmt.opportunities.opportunityservice.Opportunity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
@XmlAccessorType(XmlAccessType.FIELD)
public class RESTOpportunityList {
        @XmlElementWrapper(name="OpportunityList")
        @XmlElement (name="Opportunity")
    private List<Opportunity> opportunityList;
 

    public void setOpportunityList(List<Opportunity> opportunityList) {
        this.opportunityList = opportunityList;
    }

    public List<Opportunity> getOpportunityList() {
        return opportunityList;
    }
}
