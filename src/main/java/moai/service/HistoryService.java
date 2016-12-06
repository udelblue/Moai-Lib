package moai.service;

import moai.domain.ItemMeta;
import moai.domain.base.BaseStage;
import moai.repository.HistoryRepository;

import java.util.ArrayList;

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


    public void write (BaseStage basestage , ItemMeta meta , String event , String Comment, String usernameProformingAction, ArrayList<String> usernameActionProformedAgainst){


    }


}
