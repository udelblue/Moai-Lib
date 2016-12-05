package moai.domain;

import java.util.Date;

/**
 * Created by csommers on 11/18/2016.
 */
public class Flow {

    String name;
    String description;
    Date created;
    String type;
    int version;
    String created_by;
    String data;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
