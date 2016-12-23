package moai.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import moai.domain.serial.form.Form;

/**
 * Created by csommers on 12/22/2016.
 */
public class FormUtility {


    String _json;
    Form obj;

    public FormUtility(String json) {
        _json = json;

        try {
            ObjectMapper mapper = new ObjectMapper();
            obj = mapper.readValue(json, Form.class);
        }catch (Exception e)
        {
            //// TODO: 12/23/2016
        }


    }
}
