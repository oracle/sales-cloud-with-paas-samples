package oracle.fusion.pts.restService.types;

import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.MySalesAccount;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement 
@XmlAccessorType(XmlAccessType.FIELD)
public class RESTMySalesAccountList {
    @XmlElementWrapper(name="MySalesAccountList")
    @XmlElement (name="SalesAccount")
    private List<MySalesAccount> mySalesAccountList;


    public void setMySalesAccountList(List<MySalesAccount> mySalesAccountList) {
        this.mySalesAccountList = mySalesAccountList;
    }

    public List<MySalesAccount> getMySalesAccountList() {
        return mySalesAccountList;
    }
}
