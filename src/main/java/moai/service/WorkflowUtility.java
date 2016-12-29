package moai.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import moai.domain.serial.flow.*;
import moai.domain.utility.StringUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by csommers on 12/21/2016.
 */
public class WorkflowUtility {

    String _json;
    FlowData obj;

    public WorkflowUtility(String json) {
        _json = json;
        try {
            ObjectMapper mapper = new ObjectMapper();
            obj = mapper.readValue(json, FlowData.class);
        }catch (Exception e)
        {
            //// TODO: 12/22/2016
        }


    }

    public List<String> startStages(){
        List<String> startStages = new ArrayList<String>();
        List<OperatorStage> stages =  obj.getOperators().getOperatorProperties();

        for (OperatorStage stage: stages) {
            String stageid =  stage.getProperties().getOpid();
            boolean flag = false;
            Links links = obj.getLinks();
            List<LinkDetails> ld = links.getLinks();
            for (LinkDetails l:ld) {

                if(l.getToOperator().equals(stageid))
                {
                    flag = true;
                }


            }

            if(!flag)
            {
                startStages.add(stageid);
            }

        }


        return startStages;
    }

    public List<String> endStages(){
        List<String> endStages = new ArrayList<String>();
       List<OperatorStage> stages =  obj.getOperators().getOperatorProperties();

        for (OperatorStage stage: stages) {
            String stageid =  stage.getProperties().getOpid();
            boolean flag = false;
            Links links = obj.getLinks();
            List<LinkDetails> ld = links.getLinks();
            for (LinkDetails l:ld) {

                    if(l.getFromOperator().equals(stageid))
                    {
                        flag = true;
                    }
            }

            if(!flag)
            {
                endStages.add(stageid);
            }

        }
        return endStages;
    }



    public List<String> nextStages( String currentstageid){

        List<String> nextStages = new ArrayList<String>();

            Links links = obj.getLinks();
            List<LinkDetails> ld = links.getLinks();
            for (LinkDetails l:ld) {
                if(l.getFromOperator().equals(currentstageid))
                {
                    String to = l.getToOperator();
                    if(!StringUtil.nullOrEmpty(to))
                    {
                        nextStages.add(to);
                    }
                }

            }


        return nextStages;
    }



    public List<String> previousStages( String currentstageid){

        List<String> previousStages = new ArrayList<String>();

        Links links = obj.getLinks();
        List<LinkDetails> ld = links.getLinks();
        for (LinkDetails l:ld) {
            if(l.getToOperator().equals(currentstageid))
            {
                String to = l.getToOperator();
                if(!StringUtil.nullOrEmpty(to))
                {
                    previousStages.add(to);
                }
            }

        }


        return previousStages;
    }



    public String stageNameFromID ( String currentstageid) {
    String name = "";

        List<OperatorStage> stages =  obj.getOperators().getOperatorProperties();

        for (OperatorStage stage: stages) {
            String stageid =  stage.getProperties().getOpid();
           if (currentstageid.equals(stageid))
           {
               name = stage.getProperties().getTitle();
               return name;
           }
        }

    return name;
    }


    public String stageTypeFromID ( String currentstageid) {
        String name = "";
        List<OperatorStage> stages =  obj.getOperators().getOperatorProperties();

        for (OperatorStage stage: stages) {
            String stageid =  stage.getProperties().getOpid();
            if (currentstageid.equals(stageid))
            {
                name = stage.getProperties().getType();
                return name;
            }
        }

        return name;
    }


    public Map<String,String> allStageIDsAndStageNames(){
        Map m1 = new HashMap();
        List<OperatorStage> stages =  obj.getOperators().getOperatorProperties();
        for (OperatorStage stage: stages) {
            String stageid =  stage.getProperties().getOpid();
            String stagename = stage.getProperties().getTitle();
            m1.put(stageid, stagename);
        }
        return m1;
    }


}
