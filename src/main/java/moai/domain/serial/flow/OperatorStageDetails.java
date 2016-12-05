package moai.domain.serial.flow;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by csommers on 11/23/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OperatorStageDetails {


    OperatorStageInputs inputs;
    OperatorStageOutputs outputs;
    OperatorStageProperties properties;
    String title;
    String type;
    String opid;

    public OperatorStageInputs getInputs() {
        return inputs;
    }

    public void setInputs(OperatorStageInputs inputs) {
        this.inputs = inputs;
    }

    public OperatorStageOutputs getOutputs() {
        return outputs;
    }

    public void setOutputs(OperatorStageOutputs outputs) {
        this.outputs = outputs;
    }

    public OperatorStageProperties getProperties() {
        return properties;
    }

    public void setProperties(OperatorStageProperties properties) {
        this.properties = properties;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOpid() {
        return opid;
    }

    public void setOpid(String opid) {
        this.opid = opid;
    }

}
