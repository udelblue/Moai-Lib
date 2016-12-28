package moai.service;

import moai.domain.History;
import moai.domain.ItemMeta;
import moai.domain.base.BaseStage;
import moai.repository.HistoryRepository;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by csommers on 12/5/2016.
 */
public class HistoryService {

    HistoryRepository hr;

    public HistoryService(HistoryRepository hr) {
        this.hr = hr;
    }

    public HistoryService() {
    }


    public void Write(ItemMeta itemMeta, String user, String event, String comment){
        History h = new History();
        h.setItem_id(itemMeta.getId());
        h.setEvent_date(new Date());
        h.setEvent(event);
        h.setEvent_user(user);
        h.setItem_version(itemMeta.getVersion());
        h.setItem_type(itemMeta.getType());
        h.setEvent_comment(comment);



    }






}
