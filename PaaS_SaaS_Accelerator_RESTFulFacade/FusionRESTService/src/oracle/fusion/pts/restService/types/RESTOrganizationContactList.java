package oracle.fusion.pts.restService.types;

// JAXB Wrapper class for Opportunities


import com.oracle.xmlns.apps.cdm.foundation.parties.relationshipservice.OrganizationContact;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
@XmlAccessorType(XmlAccessType.FIELD)
public class RESTOrganizationContactList {
        @XmlElementWrapper(name="OrganizationContactList")
        @XmlElement (name="OrganizationContact")
    private List<OrganizationContact> OrganizationContactList;


    /**
     * @param OrganizationContactList
     */
    public void setOrganizationContactList(List<OrganizationContact> OrganizationContactList) {
        this.OrganizationContactList = OrganizationContactList;
    }

    public List<OrganizationContact> getOrganizationContactList() {
        return OrganizationContactList;
    }
}
