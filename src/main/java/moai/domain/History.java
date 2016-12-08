package moai.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by csommers on 11/18/2016.
 */
@Entity
public class History {

    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    int  id;
    String item_id;
    String item_type;
    String event;
    String event_user;
    String event_comment;
    Date event_date;
    int item_version;
    String stage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getEvent_user() {
        return event_user;
    }

    public void setEvent_user(String event_user) {
        this.event_user = event_user;
    }

    public String getEvent_comment() {
        return event_comment;
    }

    public void setEvent_comment(String event_comment) {
        this.event_comment = event_comment;
    }

    public Date getEvent_date() {
        return event_date;
    }

    public void setEvent_date(Date event_date) {
        this.event_date = event_date;
    }

    public int getItem_version() {
        return item_version;
    }

    public void setItem_version(int item_version) {
        this.item_version = item_version;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }


}
