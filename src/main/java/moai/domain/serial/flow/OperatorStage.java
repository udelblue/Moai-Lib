package moai.domain.serial.flow;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by csommers on 11/21/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OperatorStage {


    OperatorStageDetails properties;
    String left;
    String top;

    public OperatorStageDetails getProperties() {
        return properties;
    }

    public void setProperties(OperatorStageDetails properties) {
        this.properties = properties;
    }

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }


}
