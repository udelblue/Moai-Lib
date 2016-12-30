package moai.service.utility;

import moai.domain.Item;
import moai.domain.base.BaseStage;
import moai.domain.stage.Action;
import moai.service.WorkflowUtility;

import java.util.List;

/**
 * Created by csommers on 11/17/2016.
 */
public abstract class  StageRunner {

    Item item;
    BaseStage stage;

    WorkflowUtility wu;



    private void preExecute(){

        for (Action action : this.stage.getPreActions())
        {
            action.execute(item);

        }

    }


    private void postExecute(){
        for (Action action : this.stage.getPreActions())
        {
            action.execute(item);

        }

    }


    public boolean run(Item item, BaseStage stage){
        this.item = item;
        this.stage = stage;

        //// TODO: 12/28/2016 add json
        String json = "";
        String currentstageid = "";

        wu = new WorkflowUtility(json);
        List<String> nextstages = wu.nextStages(currentstageid);
        //// TODO: 12/28/2016 set current stage  



        return true;
    }






}
