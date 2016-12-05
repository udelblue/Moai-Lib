package moai.domain.serial.form;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by csommers on 11/23/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Field {

    List<FieldOptions> field_options;
    private String field_id;
    private String field_title;
    private String field_type;
    private String field_value;
    private String field_required;
    private String field_disabled;

    public String getField_id() {
        return field_id;
    }

    public void setField_id(String field_id) {
        this.field_id = field_id;
    }

    public List<FieldOptions> getField_options() {
        return field_options;
    }

    public void setField_options(List<FieldOptions> field_options) {
        this.field_options = field_options;
    }

    public String getField_title() {
        return field_title;
    }

    public void setField_title(String field_title) {
        this.field_title = field_title;
    }

    public String getField_type() {
        return field_type;
    }

    public void setField_type(String field_type) {
        this.field_type = field_type;
    }

    public String getField_value() {
        return field_value;
    }

    public void setField_value(String field_value) {
        this.field_value = field_value;
    }

    public String getField_required() {
        return field_required;
    }

    public void setField_required(String field_required) {
        this.field_required = field_required;
    }

    public String getField_disabled() {
        return field_disabled;
    }

    public void setField_disabled(String field_disabled) {
        this.field_disabled = field_disabled;
    }

}