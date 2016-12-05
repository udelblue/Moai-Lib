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
public class OperatorStageOutputs {

    private List<String> nameList = new ArrayList<String>();
    private List<Output> fieldsClasses = new ArrayList<Output>();

    @JsonAnySetter
    public void setDynamicOutputs(String name, Output cc) {
        nameList.add(name);
        fieldsClasses.add(cc);
    }

    @JsonAnyGetter
    public List<Output> getOutputs() {
        return fieldsClasses;
    }

    public void setOutputs(List<Output> fields) {
        this.fieldsClasses = fields;
    }


}
