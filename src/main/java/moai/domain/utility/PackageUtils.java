package moai.domain.utility;

/**
 * Created by csommers on 12/30/2016.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;

public class PackageUtils {

    private static boolean debug = true;

    private PackageUtils() {}

    public static List getClasseNamesInPackage (String jarName, String packageName){
        ArrayList classes = new ArrayList ();

        packageName = packageName.replaceAll("\\." , "/");
        if (debug) System.out.println
                ("Jar " + jarName + " looking for " + packageName);
        try{
            JarInputStream jarFile = new JarInputStream
                    (new FileInputStream (jarName));
            JarEntry jarEntry;

            while(true) {
                jarEntry=jarFile.getNextJarEntry ();
                if(jarEntry == null){
                    break;
                }
                if((jarEntry.getName ().startsWith (packageName)) &&
                        (jarEntry.getName ().endsWith (".class")) ) {
                    if (debug) System.out.println
                            ("Found " + jarEntry.getName().replaceAll("/", "\\."));
                    classes.add (jarEntry.getName().replaceAll("/", "\\."));
                }
            }
        }
        catch( Exception e){
            e.printStackTrace ();
        }
        return classes;
    }




    public static  void invokeJar(String pathtoJar){

        try {
            File file  = new File(pathtoJar);

            URL url = null;

            url = file.toURL();

            URL[] urls = new URL[]{url};

            ClassLoader loader = new URLClassLoader(urls);

            Class cls = loader.loadClass("reflection.Test");

            Method[] methods = cls.getMethods();

            Method rt  = cls.getMethod("runtest" , null);
            rt.invoke(null, null);


            for (Method m : methods) {
                System.out.println(m.getName());


            }


	/*		Class<?> clazz = Class.forName("com.udelblue.Test", true, loader);
			Class<? extends Runnable> runClass = clazz.asSubclass(Runnable.class);
			// Avoid Class.newInstance, for it is evil.
			Constructor<? extends Runnable> ctor = runClass.getConstructor();
			Runnable doRun = ctor.newInstance();
			doRun.run();*/





        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }






    public static  void jarNamespace(String pathtoJar){

        try {
            File file  = new File(pathtoJar);

            URL url = null;

            url = file.toURL();

            URL[] urls = new URL[]{url};

            ClassLoader loader = new URLClassLoader(urls);
            ClassLoader parent = loader.getParent();

            System.out.println(parent.toString());



	/*		Class<?> clazz = Class.forName("com.udelblue.Test", true, loader);
			Class<? extends Runnable> runClass = clazz.asSubclass(Runnable.class);
			// Avoid Class.newInstance, for it is evil.
			Constructor<? extends Runnable> ctor = runClass.getConstructor();
			Runnable doRun = ctor.newInstance();
			doRun.run();*/





        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }





}


