
package com.globalefl.transformer.JsonTransformer.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "attempts",
    "viewCount"
})
public class PinDrop {

    @JsonProperty("attempts")
    private List<Attempt> attempts = new ArrayList<Attempt>();
    @JsonProperty("viewCount")
    private Integer viewCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The attempts
     */
    @JsonProperty("attempts")
    public List<Attempt> getAttempts() {
        return attempts;
    }

    /**
     * 
     * @param attempts
     *     The attempts
     */
    @JsonProperty("attempts")
    public void setAttempts(List<Attempt> attempts) {
        this.attempts = attempts;
    }

    /**
     * 
     * @return
     *     The viewCount
     */
    @JsonProperty("viewCount")
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * 
     * @param viewCount
     *     The viewCount
     */
    @JsonProperty("viewCount")
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
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
