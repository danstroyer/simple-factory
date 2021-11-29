package scopes;

import java.lang.reflect.Constructor;

/**
 * Class that handles the details of object creation
 */
public class SimpleScopeFactory {

    public Scope createScope(String scopeType) {

        ClassLoader classLoader = null;
        Class<Scope> loadedScope = null;
        Constructor<Scope> constructor = null;
        Scope scopeInstance = null;

        try {

            classLoader = this.getClass().getClassLoader();
            String className = "scopes." + scopeType;
            loadedScope = (Class<Scope>) classLoader.loadClass(className);
            constructor = loadedScope.getConstructor();
            scopeInstance = constructor.newInstance();

            return (Scope) scopeInstance;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return scopeInstance;
    }
}
