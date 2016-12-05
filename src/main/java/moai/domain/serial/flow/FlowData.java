package moai.domain.serial.flow;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by csommers on 11/21/2016.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
/*@JsonPropertyOrder({
        "operators",
        "links",
        "operatorTypes"
})*/
public class FlowData implements Serializable {


    @JsonProperty("operators")
    private Operators operators;
    @JsonProperty("operatorTypes")
    private OperatorTypes operatorTypes;
    @JsonProperty("links")
    private Links links;

    public FlowData() {
    }

    public Operators getOperators() {
        return operators;
    }

    public void setOperators(Operators operators) {
        this.operators = operators;
    }

    public OperatorTypes getOperatorTypes() {
        return operatorTypes;
    }

    public void setOperatorTypes(OperatorTypes operatorTypes) {
        this.operatorTypes = operatorTypes;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }


    /**
     *
     * @return
     * The operators
     *//*
    @JsonProperty("operators")
    public Operators getOperators() {
        return operators;
    }

    *//**
     *
     * @param operators
     * The operators
     *//*
    @JsonProperty("operators")
    public void setOperators(Operators operators) {
        this.operators = operators;
    }

    *//**
     *
     * @return
     * The links
     *//*
    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    *//**
     *
     * @param links
     * The links
     *//*
    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    *//**
     *
     * @return
     * The operatorTypes
     *//*
    @JsonProperty("operatorTypes")
    public OperatorTypes getOperatorTypes() {
        return operatorTypes;
    }

    *//**
     *
     * @param operatorTypes
     * The operatorTypes
     *//*
    @JsonProperty("operatorTypes")
    public void setOperatorTypes(OperatorTypes operatorTypes) {
        this.operatorTypes = operatorTypes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }*/
}
