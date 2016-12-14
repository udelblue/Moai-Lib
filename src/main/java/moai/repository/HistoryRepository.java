package moai.repository;

import moai.domain.ItemMeta;

/**
 * Created by csommers on 11/18/2016.
 */
public interface HistoryRepository {


void write(ItemMeta itemmeta, String event, String username);


}
