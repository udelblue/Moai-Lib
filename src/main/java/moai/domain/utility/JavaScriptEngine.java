package moai.domain.utility;

/**
 * Created by csommers on 12/30/2016.
 */
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

@SuppressWarnings("restriction")
public  class JavaScriptEngine {




    public static void executeJavascript (String input,  boolean outputReturn ) throws ScriptException
    {
        //ScriptEngineManager factory = new ScriptEngineManager();
        //ScriptEngine engine = factory.getEngineByName("JavaScript");
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        if(outputReturn ){
            System.out.println(engine.eval(input));
        }
        else {

            engine.eval(input);
        }
    }


    public static void engineLanguages(){


        ScriptEngineManager mgr = new ScriptEngineManager();
        List<ScriptEngineFactory> factories = mgr.getEngineFactories();

        for (ScriptEngineFactory factory : factories) {

            System.out.println("ScriptEngineFactory Info");

            String engName = factory.getEngineName();
            String engVersion = factory.getEngineVersion();
            String langName = factory.getLanguageName();
            String langVersion = factory.getLanguageVersion();

            System.out.printf("\tScript Engine: %s (%s)%n", engName, engVersion);

            List<String> engNames = factory.getNames();
            for(String name : engNames) {
                System.out.printf("\tEngine Alias: %s%n", name);
            }

            System.out.printf("\tLanguage: %s (%s)%n", langName, langVersion);

        }



    }

}
