
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
    "idCard",
    "idCard_scan",
    "facebook",
    "twitter",
    "linkedin",
    "pinDrop",
    "cellData"
})
public class Observations {

    @JsonProperty("idCard")
    private IdCard idCard;
    @JsonProperty("idCard_scan")
    private IdCardScan idCardScan;
    @JsonProperty("facebook")
    private Facebook facebook;
    @JsonProperty("twitter")
    private Twitter twitter;
    @JsonProperty("linkedin")
    private Linkedin linkedin;
    @JsonProperty("pinDrop")
    private PinDrop pinDrop;
    @JsonProperty("cellData")
    private CellData cellData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The idCard
     */
    @JsonProperty("idCard")
    public IdCard getIdCard() {
        return idCard;
    }

    /**
     * 
     * @param idCard
     *     The idCard
     */
    @JsonProperty("idCard")
    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    /**
     * 
     * @return
     *     The idCardScan
     */
    @JsonProperty("idCard_scan")
    public IdCardScan getIdCardScan() {
        return idCardScan;
    }

    /**
     * 
     * @param idCardScan
     *     The idCard_scan
     */
    @JsonProperty("idCard_scan")
    public void setIdCardScan(IdCardScan idCardScan) {
        this.idCardScan = idCardScan;
    }

    /**
     * 
     * @return
     *     The facebook
     */
    @JsonProperty("facebook")
    public Facebook getFacebook() {
        return facebook;
    }

    /**
     * 
     * @param facebook
     *     The facebook
     */
    @JsonProperty("facebook")
    public void setFacebook(Facebook facebook) {
        this.facebook = facebook;
    }

    /**
     * 
     * @return
     *     The twitter
     */
    @JsonProperty("twitter")
    public Twitter getTwitter() {
        return twitter;
    }

    /**
     * 
     * @param twitter
     *     The twitter
     */
    @JsonProperty("twitter")
    public void setTwitter(Twitter twitter) {
        this.twitter = twitter;
    }

    /**
     * 
     * @return
     *     The linkedin
     */
    @JsonProperty("linkedin")
    public Linkedin getLinkedin() {
        return linkedin;
    }

    /**
     * 
     * @param linkedin
     *     The linkedin
     */
    @JsonProperty("linkedin")
    public void setLinkedin(Linkedin linkedin) {
        this.linkedin = linkedin;
    }

    /**
     * 
     * @return
     *     The pinDrop
     */
    @JsonProperty("pinDrop")
    public PinDrop getPinDrop() {
        return pinDrop;
    }

    /**
     * 
     * @param pinDrop
     *     The pinDrop
     */
    @JsonProperty("pinDrop")
    public void setPinDrop(PinDrop pinDrop) {
        this.pinDrop = pinDrop;
    }

    /**
     * 
     * @return
     *     The cellData
     */
    @JsonProperty("cellData")
    public CellData getCellData() {
        return cellData;
    }

    /**
     * 
     * @param cellData
     *     The cellData
     */
    @JsonProperty("cellData")
    public void setCellData(CellData cellData) {
        this.cellData = cellData;
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
		return "Observations [idCard=" + idCard + ", idCardScan=" + idCardScan
				+ ", facebook=" + facebook + ", twitter=" + twitter
				+ ", linkedin=" + linkedin + ", pinDrop=" + pinDrop
				+ ", cellData=" + cellData + ", additionalProperties="
				+ additionalProperties + "]";
	}
    
    

}
