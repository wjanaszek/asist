package pl.edu.pw.elka.wjanaszek.asist.utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoader {
    public Class loadClass(String directory, String classpath) throws MalformedURLException, ClassNotFoundException {
        File pluginsDir = new File(System.getProperty("user.dir") + directory);
        if (pluginsDir != null) {
            for (File jar : pluginsDir.listFiles()) {
                try {
                    URLClassLoader child = new URLClassLoader(new URL[]{jar.toURL()}, this.getClass().getClassLoader());
                    return Class.forName(classpath, true, child);
                } catch (MalformedURLException | ClassNotFoundException e) {
                    throw e;
                }
            }
        }
        return null;
    }
}
