package moai.domain.serial.flow;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by csommers on 11/21/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Links implements Serializable {
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public Links() {
    }

    @JsonAnyGetter
    public Map<String, Object> getLinks() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setLinks(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


}
