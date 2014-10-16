package oracle.fusion.pts.restService.types;

import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.SalesParty;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement 
@XmlAccessorType(XmlAccessType.FIELD)
public class RESTSalesPartyList {
    @XmlElementWrapper(name="SalesPartyList")
    @XmlElement (name="SalesParty")
    private List<SalesParty> salesPartyList;

    public void setSalesPartyList(List<SalesParty> salesPartyList) {
        this.salesPartyList = salesPartyList;
    }

    public List<SalesParty> getSalesPartyList() {
        return salesPartyList;
    }
}
