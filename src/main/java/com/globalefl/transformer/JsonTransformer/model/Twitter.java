
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
    "responseValue",
    "responseSequence"
})
public class Twitter {

    @JsonProperty("responseValue")
    private String responseValue;
    @JsonProperty("responseSequence")
    private List<String> responseSequence = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The responseValue
     */
    @JsonProperty("responseValue")
    public String getResponseValue() {
        return responseValue;
    }

    /**
     * 
     * @param responseValue
     *     The responseValue
     */
    @JsonProperty("responseValue")
    public void setResponseValue(String responseValue) {
        this.responseValue = responseValue;
    }

    /**
     * 
     * @return
     *     The responseSequence
     */
    @JsonProperty("responseSequence")
    public List<String> getResponseSequence() {
        return responseSequence;
    }

    /**
     * 
     * @param responseSequence
     *     The responseSequence
     */
    @JsonProperty("responseSequence")
    public void setResponseSequence(List<String> responseSequence) {
        this.responseSequence = responseSequence;
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
