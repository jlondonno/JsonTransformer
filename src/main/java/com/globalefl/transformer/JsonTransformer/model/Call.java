
package com.globalefl.transformer.JsonTransformer.model;

import java.util.HashMap;
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
    "ts",
    "to",
    "len"
})
public class Call {

    @JsonProperty("ts")
    private String ts;
    @JsonProperty("to")
    private String to;
    @JsonProperty("len")
    private Integer len;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The ts
     */
    @JsonProperty("ts")
    public String getTs() {
        return ts;
    }

    /**
     * 
     * @param ts
     *     The ts
     */
    @JsonProperty("ts")
    public void setTs(String ts) {
        this.ts = ts;
    }

    /**
     * 
     * @return
     *     The to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * 
     * @param to
     *     The to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * 
     * @return
     *     The len
     */
    @JsonProperty("len")
    public Integer getLen() {
        return len;
    }

    /**
     * 
     * @param len
     *     The len
     */
    @JsonProperty("len")
    public void setLen(Integer len) {
        this.len = len;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "Call [ts=" + ts + ", to=" + to + ", len=" + len
				+ ", additionalProperties=" + additionalProperties + "]";
	}
    
    
}
