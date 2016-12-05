package moai.domain.serial.form;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by csommers on 11/21/2016.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Form {


    @JsonProperty("form_name")
    private String form_name;
    @JsonProperty("form_id")
    private String form_id;
    @JsonProperty("form_fields")
    private FormFields form_fields;

    public FormFields getForm_fields() {
        return form_fields;
    }

    public void setForm_fields(FormFields form_fields) {
        this.form_fields = form_fields;
    }

    public String getForm_name() {
        return form_name;
    }

    public void setForm_name(String form_name) {
        this.form_name = form_name;
    }

    public String getForm_id() {
        return form_id;
    }

    public void setForm_id(String form_id) {
        this.form_id = form_id;
    }


}


