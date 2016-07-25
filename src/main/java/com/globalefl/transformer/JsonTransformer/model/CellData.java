
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
    "calls",
    "texts"
})
public class CellData {

    @JsonProperty("calls")
    private List<Call> calls = new ArrayList<Call>();
    @JsonProperty("texts")
    private List<Text> texts = new ArrayList<Text>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The calls
     */
    @JsonProperty("calls")
    public List<Call> getCalls() {
        return calls;
    }

    /**
     * 
     * @param calls
     *     The calls
     */
    @JsonProperty("calls")
    public void setCalls(List<Call> calls) {
        this.calls = calls;
    }

    /**
     * 
     * @return
     *     The texts
     */
    @JsonProperty("texts")
    public List<Text> getTexts() {
        return texts;
    }

    /**
     * 
     * @param texts
     *     The texts
     */
    @JsonProperty("texts")
    public void setTexts(List<Text> texts) {
        this.texts = texts;
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
