package moai.domain.serial.flow;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by csommers on 11/23/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Output {

    String id;
    String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
