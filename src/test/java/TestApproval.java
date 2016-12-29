import com.fasterxml.jackson.databind.ObjectMapper;
import moai.domain.History;
import moai.domain.ItemMeta;
import moai.domain.serial.flow.FlowData;
import moai.domain.serial.flow.Operators;
import moai.repository.HistoryRepository;
import moai.service.HistoryService;
import moai.service.WorkflowUtility;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;




import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by csommers on 12/28/2016.
 */
public class TestApproval {



    public String json = "{\n" +
            "  \"operators\": {\n" +
            "    \"31d1ff7f-e668-46c3-8ff5-e47ad5e7f945\": {\n" +
            "      \"properties\": {\n" +
            "        \"title\": \"Red Stage\",\n" +
            "        \"type\": \"stageRed\",\n" +
            "        \"properties\": {},\n" +
            "        \"inputs\": {\n" +
            "          \"input_0\": {\n" +
            "            \"id\": \"c225598d-76c5-456a-bb01-031809c3b1d4\",\n" +
            "            \"label\": \"Input 1\",\n" +
            "            \"meta\": {}\n" +
            "          }\n" +
            "        },\n" +
            "        \"outputs\": {\n" +
            "          \"output_0\": {\n" +
            "            \"id\": \"8a69b08f-d5a9-498c-bb5d-d67e95b61a80\",\n" +
            "            \"label\": \"Output 1\",\n" +
            "            \"meta\": {}\n" +
            "          }\n" +
            "        },\n" +
            "        \"opid\": \"31d1ff7f-e668-46c3-8ff5-e47ad5e7f945\"\n" +
            "      },\n" +
            "      \"left\": 320,\n" +
            "      \"top\": 100\n" +
            "    },\n" +
            "    \"a61c565e-27d0-405c-aac6-3d3aa7ce0d29\": {\n" +
            "      \"properties\": {\n" +
            "        \"title\": \"Blue Stage\",\n" +
            "        \"type\": \"stageBlue\",\n" +
            "        \"properties\": {},\n" +
            "        \"inputs\": {\n" +
            "          \"input_0\": {\n" +
            "            \"id\": \"8c430660-5552-433a-a30b-0f4fef600217\",\n" +
            "            \"label\": \"Input 1\",\n" +
            "            \"meta\": {}\n" +
            "          }\n" +
            "        },\n" +
            "        \"outputs\": {\n" +
            "          \"output_0\": {\n" +
            "            \"id\": \"0c047af5-59ed-4132-86ac-0be7d1d0d560\",\n" +
            "            \"label\": \"Output 1\",\n" +
            "            \"meta\": {}\n" +
            "          }\n" +
            "        },\n" +
            "        \"opid\": \"a61c565e-27d0-405c-aac6-3d3aa7ce0d29\"\n" +
            "      },\n" +
            "      \"left\": 500,\n" +
            "      \"top\": 200\n" +
            "    },\n" +
            "    \"babf2c9c-bac7-4a13-9cff-cfec02117264\": {\n" +
            "      \"properties\": {\n" +
            "        \"title\": \"Yellow Stage\",\n" +
            "        \"type\": \"stageYellow\",\n" +
            "        \"properties\": {},\n" +
            "        \"inputs\": {\n" +
            "          \"input_0\": {\n" +
            "            \"id\": \"962cafbe-a231-4d6c-af7c-d5546c7eecf4\",\n" +
            "            \"label\": \"Input 1\",\n" +
            "            \"meta\": {}\n" +
            "          }\n" +
            "        },\n" +
            "        \"outputs\": {\n" +
            "          \"output_0\": {\n" +
            "            \"id\": \"cc873d3c-8b5f-483d-ba7a-3304dd7fabb8\",\n" +
            "            \"label\": \"Output 1\",\n" +
            "            \"meta\": {}\n" +
            "          }\n" +
            "        },\n" +
            "        \"opid\": \"babf2c9c-bac7-4a13-9cff-cfec02117264\"\n" +
            "      },\n" +
            "      \"left\": 560,\n" +
            "      \"top\": 420\n" +
            "    },\n" +
            "    \"6258f12f-8c1d-4e7b-ba42-c81d5fc923ce\": {\n" +
            "      \"properties\": {\n" +
            "        \"title\": \"Begin workflow\",\n" +
            "        \"type\": \"begin_workflow\",\n" +
            "        \"properties\": {},\n" +
            "        \"inputs\": {},\n" +
            "        \"outputs\": {\n" +
            "          \"output_0\": {\n" +
            "            \"id\": \"390b4f46-5d11-4a78-b791-29d0f011f9ed\",\n" +
            "            \"label\": \"Output 1\",\n" +
            "            \"meta\": {}\n" +
            "          }\n" +
            "        },\n" +
            "        \"opid\": \"6258f12f-8c1d-4e7b-ba42-c81d5fc923ce\"\n" +
            "      },\n" +
            "      \"left\": 140,\n" +
            "      \"top\": 240\n" +
            "    },\n" +
            "    \"3269567b-c371-4207-8f40-49ab3d3d61f5\": {\n" +
            "      \"properties\": {\n" +
            "        \"title\": \"End workflow\",\n" +
            "        \"type\": \"end_workflow\",\n" +
            "        \"properties\": {},\n" +
            "        \"inputs\": {\n" +
            "          \"input_0\": {\n" +
            "            \"id\": \"ffc6383e-8af7-4cf2-a5d4-5b57c43dc27b\",\n" +
            "            \"label\": \"Input 1\",\n" +
            "            \"meta\": {}\n" +
            "          }\n" +
            "        },\n" +
            "        \"outputs\": {},\n" +
            "        \"opid\": \"3269567b-c371-4207-8f40-49ab3d3d61f5\"\n" +
            "      },\n" +
            "      \"left\": 980,\n" +
            "      \"top\": 200\n" +
            "    }\n" +
            "  },\n" +
            "  \"links\": {\n" +
            "    \"1\": {\n" +
            "      \"fromOperator\": \"31d1ff7f-e668-46c3-8ff5-e47ad5e7f945\",\n" +
            "      \"fromConnector\": \"output_0\",\n" +
            "      \"fromSubConnector\": 0,\n" +
            "      \"toOperator\": \"a61c565e-27d0-405c-aac6-3d3aa7ce0d29\",\n" +
            "      \"toConnector\": \"input_0\",\n" +
            "      \"toSubConnector\": 0\n" +
            "    },\n" +
            "    \"3\": {\n" +
            "      \"fromOperator\": \"a61c565e-27d0-405c-aac6-3d3aa7ce0d29\",\n" +
            "      \"fromConnector\": \"output_0\",\n" +
            "      \"fromSubConnector\": 0,\n" +
            "      \"toOperator\": \"babf2c9c-bac7-4a13-9cff-cfec02117264\",\n" +
            "      \"toConnector\": \"input_0\",\n" +
            "      \"toSubConnector\": 0\n" +
            "    },\n" +
            "    \"4\": {\n" +
            "      \"fromOperator\": \"6258f12f-8c1d-4e7b-ba42-c81d5fc923ce\",\n" +
            "      \"fromConnector\": \"output_0\",\n" +
            "      \"fromSubConnector\": 0,\n" +
            "      \"toOperator\": \"31d1ff7f-e668-46c3-8ff5-e47ad5e7f945\",\n" +
            "      \"toConnector\": \"input_0\",\n" +
            "      \"toSubConnector\": 0\n" +
            "    },\n" +
            "    \"5\": {\n" +
            "      \"fromOperator\": \"babf2c9c-bac7-4a13-9cff-cfec02117264\",\n" +
            "      \"fromConnector\": \"output_0\",\n" +
            "      \"fromSubConnector\": 0,\n" +
            "      \"toOperator\": \"3269567b-c371-4207-8f40-49ab3d3d61f5\",\n" +
            "      \"toConnector\": \"input_0\",\n" +
            "      \"toSubConnector\": 0\n" +
            "    }\n" +
            "  },\n" +
            "  \"operatorTypes\": {}\n" +
            "}";







    @Test
    public void ApprovalNext()  {


        WorkflowUtility wu;

        ItemMeta im = new ItemMeta();
        String currentstage = "a61c565e-27d0-405c-aac6-3d3aa7ce0d29";

        wu = new WorkflowUtility(json);
        //is last stage
        List<String> ls = wu.endStages();
        if(ls.contains(currentstage))
        {
            //write to history
            // execute action

            im.setCurrent_stage("--Completed--");
        }
        // not last stage
        else{
            List<String> nextstages = wu.nextStages(currentstage);
            //write to history
            // execute action
            String s = nextstages.get(0);
            im.setCurrent_stage(s);
        }


        assertTrue("didnt go to next stage", im.getCurrent_stage().equals("babf2c9c-bac7-4a13-9cff-cfec02117264"));
        String stage_name =  wu.stageNameFromID("babf2c9c-bac7-4a13-9cff-cfec02117264");
        assertNotNull("Name is null" , stage_name);

    }





    @Test
    public void Writetohistory( )  {

        ItemMeta im = new ItemMeta();
        String event = "";
        String user = "";
        String comment = "";


        HistoryService hs = new HistoryService();
        hs.Write(im,user,event,comment);

    }
    @Test
    public void ExecuteAction()  {







    }



}
