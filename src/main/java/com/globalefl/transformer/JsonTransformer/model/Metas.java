
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
    "timeElapsed",
    "helpBarClicks",
    "viewCount",
    "deviceRotation",
    "facilitatorAssisted"
})
public class Metas {

    @JsonProperty("timeElapsed")
    private Integer timeElapsed;
    @JsonProperty("helpBarClicks")
    private Integer helpBarClicks;
    @JsonProperty("viewCount")
    private Integer viewCount;
    @JsonProperty("deviceRotation")
    private List<String> deviceRotation = new ArrayList<String>();
    @JsonProperty("facilitatorAssisted")
    private Boolean facilitatorAssisted;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The timeElapsed
     */
    @JsonProperty("timeElapsed")
    public Integer getTimeElapsed() {
        return timeElapsed;
    }

    /**
     * 
     * @param timeElapsed
     *     The timeElapsed
     */
    @JsonProperty("timeElapsed")
    public void setTimeElapsed(Integer timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    /**
     * 
     * @return
     *     The helpBarClicks
     */
    @JsonProperty("helpBarClicks")
    public Integer getHelpBarClicks() {
        return helpBarClicks;
    }

    /**
     * 
     * @param helpBarClicks
     *     The helpBarClicks
     */
    @JsonProperty("helpBarClicks")
    public void setHelpBarClicks(Integer helpBarClicks) {
        this.helpBarClicks = helpBarClicks;
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

    /**
     * 
     * @return
     *     The deviceRotation
     */
    @JsonProperty("deviceRotation")
    public List<String> getDeviceRotation() {
        return deviceRotation;
    }

    /**
     * 
     * @param deviceRotation
     *     The deviceRotation
     */
    @JsonProperty("deviceRotation")
    public void setDeviceRotation(List<String> deviceRotation) {
        this.deviceRotation = deviceRotation;
    }

    /**
     * 
     * @return
     *     The facilitatorAssisted
     */
    @JsonProperty("facilitatorAssisted")
    public Boolean getFacilitatorAssisted() {
        return facilitatorAssisted;
    }

    /**
     * 
     * @param facilitatorAssisted
     *     The facilitatorAssisted
     */
    @JsonProperty("facilitatorAssisted")
    public void setFacilitatorAssisted(Boolean facilitatorAssisted) {
        this.facilitatorAssisted = facilitatorAssisted;
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
		return "Metas [timeElapsed=" + timeElapsed + ", helpBarClicks="
				+ helpBarClicks + ", viewCount=" + viewCount
				+ ", deviceRotation=" + deviceRotation
				+ ", facilitatorAssisted=" + facilitatorAssisted
				+ ", additionalProperties=" + additionalProperties + "]";
	}
    
    

}
