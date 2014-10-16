package oracle.fusion.pts.restService.types;


import com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.Location;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement 
@XmlAccessorType(XmlAccessType.FIELD)
public class RESTLocationList {
    @XmlElementWrapper(name="LocationList")
    @XmlElement (name="Location")
    private List<Location> locationList;


    public void setLocationList(List<Location> locationList) {
        this.locationList = locationList;
    }

    public List<Location> getLocationList() {
        return locationList;
    }
}
