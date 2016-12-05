package moai.domain;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by csommers on 11/18/2016.
 */
public class ItemMeta {
    Date created;
    String created_by;
    String item_id;
    String id;
    ArrayList<String> currently_assigned_to;
    String status;
    String type;
    String title;
    ArrayList<String> current_stages;
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

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
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

    public ArrayList<String> getCurrent_stages() {
        return current_stages;
    }

    public void setCurrent_stages(ArrayList<String> current_stages) {
        this.current_stages = current_stages;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}