import com.fasterxml.jackson.databind.ObjectMapper;
import moai.domain.serial.form.Field;
import moai.domain.serial.form.Form;
import moai.domain.serial.form.FormFields;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by csommers on 11/23/2016.
 */
public class TestJsonForm {


    String json = "{\n" +
            "  \"form_id\": \"1\",\n" +
            "  \"form_name\": \"My Test Form\",\n" +
            "  \"form_fields\": {\n" +
            "    \"1\": {\n" +
            "      \"field_id\": 1,\n" +
            "      \"field_title\": \"First Name\",\n" +
            "      \"field_type\": \"textfield\",\n" +
            "      \"field_value\": \"John\",\n" +
            "      \"field_required\": true,\n" +
            "      \"field_disabled\": false\n" +
            "    },\n" +
            "    \"2\": {\n" +
            "      \"field_id\": 2,\n" +
            "      \"field_title\": \"Last Name\",\n" +
            "      \"field_type\": \"textfield\",\n" +
            "      \"field_value\": \"Doe\",\n" +
            "      \"field_required\": true,\n" +
            "      \"field_disabled\": false\n" +
            "    },\n" +
            "    \"3\": {\n" +
            "      \"field_id\": 3,\n" +
            "      \"field_title\": \"Gender\",\n" +
            "      \"field_type\": \"radio\",\n" +
            "      \"field_value\": \"2\",\n" +
            "      \"field_required\": true,\n" +
            "      \"field_disabled\": false,\n" +
            "      \"field_options\": [\n" +
            "        {\n" +
            "          \"option_id\": 1,\n" +
            "          \"option_title\": \"Male\",\n" +
            "          \"option_value\": 1\n" +
            "        },\n" +
            "        {\n" +
            "          \"option_id\": 2,\n" +
            "          \"option_title\": \"Female\",\n" +
            "          \"option_value\": 2\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    \"4\": {\n" +
            "      \"field_id\": 4,\n" +
            "      \"field_title\": \"Email Address\",\n" +
            "      \"field_type\": \"email\",\n" +
            "      \"field_value\": \"test@example.com\",\n" +
            "      \"field_required\": true,\n" +
            "      \"field_disabled\": false\n" +
            "    },\n" +
            "    \"5\": {\n" +
            "      \"field_id\": 5,\n" +
            "      \"field_title\": \"Password\",\n" +
            "      \"field_type\": \"password\",\n" +
            "      \"field_value\": \"\",\n" +
            "      \"field_required\": true,\n" +
            "      \"field_disabled\": false\n" +
            "    },\n" +
            "    \"6\": {\n" +
            "      \"field_id\": 6,\n" +
            "      \"field_title\": \"Birth Date\",\n" +
            "      \"field_type\": \"date\",\n" +
            "      \"field_value\": \"01.21.1980\",\n" +
            "      \"field_required\": true,\n" +
            "      \"field_disabled\": false\n" +
            "    },\n" +
            "    \"7\": {\n" +
            "      \"field_id\": 7,\n" +
            "      \"field_title\": \"Your browser\",\n" +
            "      \"field_type\": \"dropdown\",\n" +
            "      \"field_value\": \"2\",\n" +
            "      \"field_required\": false,\n" +
            "      \"field_disabled\": false,\n" +
            "      \"field_options\": [\n" +
            "        {\n" +
            "          \"option_id\": 1,\n" +
            "          \"option_title\": \"-- Please Select --\",\n" +
            "          \"option_value\": 1\n" +
            "        },\n" +
            "        {\n" +
            "          \"option_id\": 2,\n" +
            "          \"option_title\": \"Internet Explorer\",\n" +
            "          \"option_value\": 2\n" +
            "        },\n" +
            "        {\n" +
            "          \"option_id\": 3,\n" +
            "          \"option_title\": \"Google Chrome\",\n" +
            "          \"option_value\": 3\n" +
            "        },\n" +
            "        {\n" +
            "          \"option_id\": 4,\n" +
            "          \"option_title\": \"Mozilla Firefox\",\n" +
            "          \"option_value\": 4\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    \"8\": {\n" +
            "      \"field_id\": 8,\n" +
            "      \"field_title\": \"Additional Comments\",\n" +
            "      \"field_type\": \"textarea\",\n" +
            "      \"field_value\": \"Please type here..\",\n" +
            "      \"field_required\": false,\n" +
            "      \"field_disabled\": false\n" +
            "    },\n" +
            "    \"9\": {\n" +
            "      \"field_id\": 9,\n" +
            "      \"field_title\": \"I accept the terms and conditions.\",\n" +
            "      \"field_type\": \"checkbox\",\n" +
            "      \"field_value\": \"0\",\n" +
            "      \"field_required\": true,\n" +
            "      \"field_disabled\": false\n" +
            "    },\n" +
            "    \"10\": {\n" +
            "      \"field_id\": 10,\n" +
            "      \"field_title\": \"I have a secret.\",\n" +
            "      \"field_type\": \"hidden\",\n" +
            "      \"field_value\": \"X\",\n" +
            "      \"field_required\": false,\n" +
            "      \"field_disabled\": false\n" +
            "    }\n" +
            "  }\n" +
            "}";






    @Test
    public void SerializeFormNotNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Form obj = mapper.readValue(json, Form.class);
        assertNotNull("Form Data is null", obj);
    }

    @Test
    public void SerializeFormPropertiesAreNotNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        //JSON from file to Object
        Form obj = mapper.readValue(json, Form.class);
        assertEquals("form.name Not equal form.name", obj.getForm_name(), "My Test Form");
        assertEquals("form.id Not equal form.id", obj.getForm_id(), "1");
    }

    @Test
    public void SerializeFormFieldCollectionNotNull() throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        //JSON from file to Object
        Form obj = mapper.readValue(json, Form.class);
        assertNotNull("Form Fields Data is null", obj.getForm_fields());

    }

    @Test
    public void SerializeFormFieldCollectionSizeGreaterThan2() throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        //JSON from file to Object
        Form obj = mapper.readValue(json, Form.class);
        FormFields ff = obj.getForm_fields();
        List<Field> fields = ff.getFields();
        assertNotNull("Form Fields Data is null", fields);
        assertTrue("Form fields size is less than 2 ", fields.size() > 2);

    }

    @Test
    public void SerializeFormFieldCollectionField_optionsExist() throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        //JSON from file to Object
        Form obj = mapper.readValue(json, Form.class);
        FormFields ff = obj.getForm_fields();
        List<Field> fields = ff.getFields();
        Field field = fields.get(2);
        assertNotNull("Form options Data is null", field.getField_options());
        assertTrue("Form options size is less than 1", field.getField_options().size() > 1);

    }

}
