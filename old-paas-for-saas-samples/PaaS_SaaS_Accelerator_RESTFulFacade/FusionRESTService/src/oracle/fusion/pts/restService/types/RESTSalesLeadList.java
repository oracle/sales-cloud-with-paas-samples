
package oracle.fusion.pts.restService.types;



import com.oracle.xmlns.oracle.apps.marketing.leadmgmt.leads.leadservice.MklLead;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement 
@XmlAccessorType(XmlAccessType.FIELD)
public class RESTSalesLeadList {
    @XmlElementWrapper(name="MklLeadList")
    @XmlElement (name="MklLead")
    private List<MklLead> mklLeadList;

    public void setMklLeadList(List<MklLead> mklLeadList) {
        this.mklLeadList = mklLeadList;
    }

    public List<MklLead> getMklLeadList() {
        return mklLeadList;
    }
}
