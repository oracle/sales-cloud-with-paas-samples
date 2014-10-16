package oracle.fusion.pts.restService.types;



import com.oracle.xmlns.apps.crmcommon.interactions.interactionservice.Interaction;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement 
@XmlAccessorType(XmlAccessType.FIELD)
public class RESTInteractionList {
    @XmlElementWrapper(name="InteractionList")
    @XmlElement (name="Interaction")
    private List<Interaction> interactionList;

    public void setInteractionList(List<Interaction> interactionList) {
        this.interactionList = interactionList;
    }

    public List<Interaction> getInteractionList() {
        return interactionList;
    }
}
