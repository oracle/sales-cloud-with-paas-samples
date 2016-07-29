package oracle.cloud.doccloud.types.salesCloud;

/* Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved.*/

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;


/**
 * POJO to represent the ContactType from Sales Cloud
 */

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"PartyNumber"})

public class ContactSimpleType {

    @JsonProperty("PartyNumber")
    private String PartyNumber;
    
    @JsonProperty("ContactName")
    private String ContactName;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    
    @JsonProperty("PartyNumber")
    public String getPartyNumber() {
        return PartyNumber;
    }
    
    
    @JsonProperty("PartyNumber")
    public void setPartyNumber(String PartyNumber) {
        this.PartyNumber = PartyNumber;
    }
    
    @JsonProperty("ContactName")
    public void setContactName(String ContactName){
        this.ContactName = ContactName;
    }
    
    @JsonProperty("ContactName")
    public String getContactName(){
        return ContactName;
    }
    
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }
    
    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

 
}
