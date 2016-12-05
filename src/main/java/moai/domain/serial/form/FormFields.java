package moai.domain.serial.form;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by csommers on 11/23/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FormFields {

    private List<String> nameList = new ArrayList<String>();
    private List<Field> fieldsClasses = new ArrayList<Field>();


    @JsonAnySetter
    public void setDynamicField(String name, Field cc) {

        nameList.add(name);
        fieldsClasses.add(cc);
    }

    @JsonAnyGetter
    public List<Field> getFields() {
        return fieldsClasses;
    }

    public void setFields(List<Field> fields) {
        this.fieldsClasses = fields;
    }


}