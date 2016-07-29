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
 * POJO to represent OpportunityType from Sales Cloud.
 */

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "Name", "OptyNumber" })

public class OpportunitySimpleType
{

    @JsonProperty("Name")
    private String Name;
    
    @JsonProperty("OptyNumber")
    private Long OptyNumber;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    @JsonProperty("Name")
    public String getName(){
        return Name;
    }

    
    @JsonProperty("Name")
    public void setName(String Name){
        this.Name = Name;
    }

    
    @JsonProperty("OptyNumber")
    public Long getOptyNumber(){
        return OptyNumber;
    }

    
    @JsonProperty("OptyNumber")
    public void setOptyNumber(Long OptyNumber){
        this.OptyNumber = OptyNumber;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties(){
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value){
        this.additionalProperties.put(name, value);
    }

}
