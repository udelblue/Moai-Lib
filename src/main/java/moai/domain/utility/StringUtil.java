package moai.domain.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by csommers on 12/21/2016.
 */
public class StringUtil {

    public static boolean nullOrEmpty( final String s ) {
        // Null-safe, short-circuit evaluation.
        return s == null || s.trim().length() == 0;
    }



    public static String ListtoString(List<String> list){
        String val = "";
        if(list != null && list.size() > 0){
            for (String l: list) {
                val += (";" + l);
            }
        }
        return val;
    }

    public static List<String> StringtoList (String string){
        List<String> list = new ArrayList<String>();
        String[] sar = string.split(";");
        list = Arrays.asList(sar);
        return  list;
    }


}
