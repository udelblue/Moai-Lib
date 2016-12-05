package moai.service;

import moai.domain.ItemMeta;
import moai.repository.HistoryRepository;

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


    public void write (ItemMeta meta , String event){


    }


}
