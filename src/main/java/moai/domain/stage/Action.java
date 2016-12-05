package moai.domain.stage;

import moai.domain.Item;

/**
 * Created by csommers on 11/17/2016.
 */
public interface Action {

    String name();

    String meta();

    String meta_properties();

    Boolean execute(Item item);


}
