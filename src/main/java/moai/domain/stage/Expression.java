package moai.domain.stage;

/**
 * Created by csommers on 11/17/2016.
 */
public class Expression {


    String value;
    String expectedReturnValue;

    public Expression(String expectedReturnValue, String value) {
        this.expectedReturnValue = expectedReturnValue;
        this.value = value;
    }


    public Expression() {


    }

    public String getExpectedReturnValue() {
        return expectedReturnValue;
    }

    public void setExpectedReturnValue(String expectedReturnValue) {
        this.expectedReturnValue = expectedReturnValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
