package moai.domain.serial.flow;

/**
 * Created by csommers on 12/14/2016.
 */
public class LinkDetails {

    public String getFromOperator() {
        return fromOperator;
    }

    public void setFromOperator(String fromOperator) {
        this.fromOperator = fromOperator;
    }

    public String getFromConnector() {
        return fromConnector;
    }

    public void setFromConnector(String fromConnector) {
        this.fromConnector = fromConnector;
    }

    public String getFromSubConnector() {
        return fromSubConnector;
    }

    public void setFromSubConnector(String fromSubConnector) {
        this.fromSubConnector = fromSubConnector;
    }

    public String getToOperator() {
        return toOperator;
    }

    public void setToOperator(String toOperator) {
        this.toOperator = toOperator;
    }

    public String getToConnector() {
        return toConnector;
    }

    public void setToConnector(String toConnector) {
        this.toConnector = toConnector;
    }

    public String getToSubConnector() {
        return toSubConnector;
    }

    public void setToSubConnector(String toSubConnector) {
        this.toSubConnector = toSubConnector;
    }

    String fromOperator;
    String fromConnector;
    String fromSubConnector;
    String toOperator;
    String toConnector;
    String toSubConnector;






}
