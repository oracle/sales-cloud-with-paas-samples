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
 * POJO to represent Item resource of the Document Cloud Service.
 * This object will be used to map the JSON object recevied from Document Cloud
 * Service as response.
 */

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "type",
    "id",
    "parentID",
    "name",
    "ownedBy",
    "createdBy",
    "modifiedBy",
    "createdTime",
    "modifiedTime",
    "size",
    "childItemsCount",
    "version",
    "mimeType"
})

public class Item {

    @JsonProperty("type")
    private String type;
    
    @JsonProperty("id")
    private String id;
    
    @JsonProperty("parentID")
    private String parentID;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("ownedBy")
    private OwnedBy ownedBy;
    
    @JsonProperty("createdBy")
    private CreatedBy createdBy;
    
    @JsonProperty("modifiedBy")
    private ModifiedBy modifiedBy;
    
    @JsonProperty("createdTime")
    private String createdTime;
    
    @JsonProperty("modifiedTime")
    private String modifiedTime;
    
    @JsonProperty("size")
    private String size;
    
    @JsonProperty("childItemsCount")
    private String childItemsCount;
    
    @JsonProperty("version")
    private String version;
    
    @JsonProperty("mimeType")
    private String mimeType;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    
    @JsonProperty("parentID")
    public String getParentID() {
        return parentID;
    }

    
    @JsonProperty("parentID")
    public void setParentID(String parentID) {
        this.parentID = parentID;
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

    
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy() {
        return createdBy;
    }

    
    @JsonProperty("createdBy")
    public void setCreatedBy(CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    
    @JsonProperty("modifiedBy")
    public ModifiedBy getModifiedBy() {
        return modifiedBy;
    }

    
    @JsonProperty("modifiedBy")
    public void setModifiedBy(ModifiedBy modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    
    @JsonProperty("createdTime")
    public String getCreatedTime() {
        return createdTime;
    }

    
    @JsonProperty("createdTime")
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    
    @JsonProperty("modifiedTime")
    public String getModifiedTime() {
        return modifiedTime;
    }

    
    @JsonProperty("modifiedTime")
    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    
    @JsonProperty("size")
    public String getSize() {
        return size;
    }

    
    @JsonProperty("size")
    public void setSize(String size) {
        this.size = size;
    }

    
    @JsonProperty("childItemsCount")
    public String getChildItemsCount() {
        return childItemsCount;
    }

    
    @JsonProperty("childItemsCount")
    public void setChildItemsCount(String childItemsCount) {
        this.childItemsCount = childItemsCount;
    }

    
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    
    @JsonProperty("mimeType")
    public String getMimeType() {
        return mimeType;
    }

    
    @JsonProperty("mimeType")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
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
