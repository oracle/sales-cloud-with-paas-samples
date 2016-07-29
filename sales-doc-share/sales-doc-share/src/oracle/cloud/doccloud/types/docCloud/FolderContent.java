package oracle.cloud.doccloud.types.docCloud;

/* Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;


/**
 * POJO to represent FolderContent resource of the Document Cloud Service.
 * This object will be used to map the JSON object recevied from Document Cloud
 * Service as response.
 */

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "count",
    "errorCode",
    "hasMore",
    "ownerFolderID",
    "totalResults",
    "items"
})
public class FolderContent {

    @JsonProperty("count")
    private String count;
    
    @JsonProperty("errorCode")
    private String errorCode;
    
    @JsonProperty("hasMore")
    private String hasMore;
    
    @JsonProperty("ownerFolderID")
    private String ownerFolderID;
    
    @JsonProperty("totalResults")
    private String totalResults;
    
    @JsonProperty("items")
    private List<Item> items = new ArrayList<Item>();
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   
    @JsonProperty("count")
    public String getCount() {
        return count;
    }

   
    @JsonProperty("count")
    public void setCount(String count) {
        this.count = count;
    }

   
    @JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }

    
    @JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    
    @JsonProperty("hasMore")
    public String getHasMore() {
        return hasMore;
    }

    
    @JsonProperty("hasMore")
    public void setHasMore(String hasMore) {
        this.hasMore = hasMore;
    }

    
    @JsonProperty("ownerFolderID")
    public String getOwnerFolderID() {
        return ownerFolderID;
    }

    
    @JsonProperty("ownerFolderID")
    public void setOwnerFolderID(String ownerFolderID) {
        this.ownerFolderID = ownerFolderID;
    }

    
    @JsonProperty("totalResults")
    public String getTotalResults() {
        return totalResults;
    }

    
    @JsonProperty("totalResults")
    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    
    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    
    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
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
