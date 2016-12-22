package moai.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import moai.domain.serial.flow.*;
import moai.domain.utility.StringUtil;

import java.util.ArrayList;
import java.util.List;

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

        };


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
                    };
                }

            }


        return nextStages;
    }







}
