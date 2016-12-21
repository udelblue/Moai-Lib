package moai.domain.utility;

/**
 * Created by csommers on 12/21/2016.
 */
public class StringUtil {

    public static boolean nullOrEmpty( final String s ) {
        // Null-safe, short-circuit evaluation.
        return s == null || s.trim().length() == 0;
    }

}
