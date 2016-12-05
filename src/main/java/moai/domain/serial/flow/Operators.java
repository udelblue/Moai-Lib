package moai.domain.serial.flow;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by csommers on 11/21/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Operators {

    private List<String> nameList = new ArrayList<String>();
    private List<OperatorStage> fieldsClasses = new ArrayList<OperatorStage>();

    @JsonAnySetter
    public void setDynamicOperatorProperties(String name, OperatorStage cc) {
        nameList.add(name);
        fieldsClasses.add(cc);
    }

    @JsonAnyGetter
    public List<OperatorStage> getOperatorProperties() {
        return fieldsClasses;
    }

    public void setOperatorProperties(List<OperatorStage> fields) {
        this.fieldsClasses = fields;
    }


   /* public List<OperatorProperties> properties;

    public List<OperatorProperties> getProperties() {
        return properties;
    }

    public void setProperties(List<OperatorProperties> properties) {
        this.properties = properties;
    }*/
}
