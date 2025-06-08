// core/engine/Main.java
package core.engine;

public class Main {
    public static void main(String[] args) throws Exception {
        PluginManager pluginManager = new PluginManager("plugins");
        pluginManager.loadPlugins();

        System.out.println("Loaded pricing strategies:");
        pluginManager.getStrategies().forEach(s ->
                System.out.println(" - " + s.getClass().getSimpleName())
        );
    }
}