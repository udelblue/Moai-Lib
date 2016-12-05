package moai.domain.serial.flow;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by csommers on 11/23/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OperatorStageInputs {


    private List<String> nameList = new ArrayList<String>();
    private List<Input> fieldsClasses = new ArrayList<Input>();

    @JsonAnySetter
    public void setDynamicInputs(String name, Input cc) {
        nameList.add(name);
        fieldsClasses.add(cc);
    }

    @JsonAnyGetter
    public List<Input> getInputs() {
        return fieldsClasses;
    }

    public void setInputs(List<Input> fields) {
        this.fieldsClasses = fields;
    }

}
