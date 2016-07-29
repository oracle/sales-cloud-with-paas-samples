package oracle.cloud.doccloud.types.docCloud;
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
 * POJO Object to represent OwnedBy resource of Document Cloud Service.
 * This object will be used to map the JSON object recevied from Document Cloud
 * Service as response.
 */

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"displayName","id","type"})

public class OwnedBy {

    @JsonProperty("displayName")
    private String displayName;
    
    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }
    
        
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    
    
    @JsonProperty("id")
    public String getId() {
        return id;
    }
    
    
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }
    
    
    @JsonProperty("type")
    public String getType() {
        return type;
    }
    
    
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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