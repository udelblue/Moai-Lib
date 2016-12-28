package moai.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by csommers on 11/18/2016.
 */
@Entity
public class ItemMeta {



    Date created;
    String created_by;

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    String payload;

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid",
            strategy = "uuid")
    String id;
    ArrayList<String> currently_assigned_to;
    String status;
    String type;



    String title;

    public String getCurrent_stage() {
        return current_stage;
    }

    public void setCurrent_stage(String current_stage) {
        this.current_stage = current_stage;
    }

    String current_stage;
    int version;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getCurrently_assigned_to() {
        return currently_assigned_to;
    }

    public void setCurrently_assigned_to(ArrayList<String> currently_assigned_to) {
        this.currently_assigned_to = currently_assigned_to;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
