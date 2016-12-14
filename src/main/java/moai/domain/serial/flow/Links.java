package moai.domain.serial.flow;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by csommers on 11/21/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Links implements Serializable {




    public Links() {
    }

   /* @JsonAnyGetter
    public Map<String, Object> getLinks() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setLinks(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();*/





    private List<String> nameList = new ArrayList<String>();
    private List<LinkDetails> linkdetails = new ArrayList<LinkDetails>();

    @JsonAnySetter
    public void setDynamicLinkDetails(String name, LinkDetails linkDetails) {
        nameList.add(name);
        linkdetails.add(linkDetails);
    }

    @JsonAnyGetter
    public List<LinkDetails> getLinks() {
        return linkdetails;
    }

    public void setLinks(List<LinkDetails> linkdetails) {
        this.linkdetails = linkdetails;
    }



}
