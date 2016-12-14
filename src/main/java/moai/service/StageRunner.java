package moai.service;

import moai.domain.Item;
import moai.domain.base.BaseStage;
import moai.domain.stage.Action;

/**
 * Created by csommers on 11/17/2016.
 */
public abstract class  StageRunner {

    Item item;
    BaseStage stage;





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





        return true;
    }






}
