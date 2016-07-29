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
 * POJO Object to represent File resource from Document Cloud Service.
 * This object will be used to map the JSON object recevied from Document Cloud
 * Service as response.
 */

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"createdBy",
"createdTime",
"errorCode",
"id",
"modifiedBy",
"modifiedTime",
"name",
"ownedBy",
"parentID",
"size",
"type",
"version"
})

public class File {

    @JsonProperty("createdBy")
    private CreatedBy createdBy;
    
    @JsonProperty("createdTime")
    private String createdTime;
    
    @JsonProperty("errorCode")
    private String errorCode;
    
    @JsonProperty("id")
    private String id;
    
    @JsonProperty("modifiedBy")
    private ModifiedBy modifiedBy;
    
    @JsonProperty("modifiedTime")
    private String modifiedTime;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("ownedBy")
    private OwnedBy ownedBy;
    
    @JsonProperty("parentID")
    private String parentID;
    
    @JsonProperty("size")
    private String size;
    
    @JsonProperty("type")
    private String type;
    
    @JsonProperty("version")
    private String version;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy() {
        return createdBy;
    }
    
    @JsonProperty("createdBy")
    public void setCreatedBy(CreatedBy createdBy) {
        this.createdBy = createdBy;
    }
    
    
    @JsonProperty("createdTime")
    public String getCreatedTime() {
        return createdTime;
    }
    
    
    @JsonProperty("createdTime")
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }
    
    @JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }
    
    
    @JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    
    
    @JsonProperty("id")
    public String getId() {
        return id;
    }
    
    
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }
    
    
    @JsonProperty("modifiedBy")
    public ModifiedBy getModifiedBy() {
        return modifiedBy;
    }
    
    
    @JsonProperty("modifiedBy")
    public void setModifiedBy(ModifiedBy modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
    
    
    @JsonProperty("modifiedTime")
    public String getModifiedTime() {
        return modifiedTime;
    }
    
    
    @JsonProperty("modifiedTime")
    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
    
    
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    
    
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }
    
    
    @JsonProperty("ownedBy")
    public OwnedBy getOwnedBy() {
        return ownedBy;
    }
    
    
    @JsonProperty("ownedBy")
    public void setOwnedBy(OwnedBy ownedBy) {
        this.ownedBy = ownedBy;
    }
    
    
    @JsonProperty("parentID")
    public String getParentID() {
        return parentID;
    }
    
    
    @JsonProperty("parentID")
    public void setParentID(String parentID) {
        this.parentID = parentID;
    }
    
    
    @JsonProperty("size")
    public String getSize() {
        return size;
    }
    
    
    @JsonProperty("size")
    public void setSize(String size) {
        this.size = size;
    }
    
    
    @JsonProperty("type")
    public String getType() {
        return type;
    }
    
    
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }
    
    
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }
    
    
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
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