
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
    "uid",
    "step",
    "sequence",
    "observations",
    "metas"
})
public class QQuestion {

    @JsonProperty("uid")
    private String uid;
    @JsonProperty("step")
    private String step;
    @JsonProperty("sequence")
    private Integer sequence;
    @JsonProperty("observations")
    private Observations observations;
    @JsonProperty("metas")
    private Metas metas;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The uid
     */
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     * 
     * @param uid
     *     The uid
     */
    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 
     * @return
     *     The step
     */
    @JsonProperty("step")
    public String getStep() {
        return step;
    }

    /**
     * 
     * @param step
     *     The step
     */
    @JsonProperty("step")
    public void setStep(String step) {
        this.step = step;
    }

    /**
     * 
     * @return
     *     The sequence
     */
    @JsonProperty("sequence")
    public Integer getSequence() {
        return sequence;
    }

    /**
     * 
     * @param sequence
     *     The sequence
     */
    @JsonProperty("sequence")
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * 
     * @return
     *     The observations
     */
    @JsonProperty("observations")
    public Observations getObservations() {
        return observations;
    }

    /**
     * 
     * @param observations
     *     The observations
     */
    @JsonProperty("observations")
    public void setObservations(Observations observations) {
        this.observations = observations;
    }

    /**
     * 
     * @return
     *     The metas
     */
    @JsonProperty("metas")
    public Metas getMetas() {
        return metas;
    }

    /**
     * 
     * @param metas
     *     The metas
     */
    @JsonProperty("metas")
    public void setMetas(Metas metas) {
        this.metas = metas;
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
		return "QQuestion [uid=" + uid + ", step=" + step + ", sequence="
				+ sequence + ", observations=" + observations + ", metas="
				+ metas + ", additionalProperties=" + additionalProperties
				+ "]";
	}
    
    

}
