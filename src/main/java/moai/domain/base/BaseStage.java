package moai.domain.base;


import moai.domain.stage.Action;
import moai.domain.stage.Condition;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by csommers on 11/17/2016.
 */
public class BaseStage {

    String name;
    List<Action> preActions;
    List<Action> postActions;
    List<Condition> conditions;
    String id;


    public BaseStage(String id) {
        this.id = id;
        this.name = "";
        this.preActions = new ArrayList<Action>();
        this.postActions = new ArrayList<Action>();
        this.conditions = new ArrayList<Condition>();

    }

    public BaseStage() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Action> getPostActions() {
        return postActions;
    }

    public void setPostActions(List<Action> postActions) {
        this.postActions = postActions;
    }

    public List<Action> getPreActions() {
        return preActions;
    }

    public void setPreActions(List<Action> preActions) {
        this.preActions = preActions;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Condition RunConditions() {

        return new Condition();
    }


}
