// core/engine/PluginManager.java
package core.engine;

import plugins.api.PricingStrategy;
import plugins.api.Plugin;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
/*– Skanon folder-in /plugins, ngarkon JAR-at me URLClassLoader.
– Gjen klasat e shënuara me @Plugin, krijon instance e i mban në listën strategies.*/

public class PluginManager {
    private final Path pluginDir;
    private List<PricingStrategy> strategies = new ArrayList<>();

    public PluginManager(String pluginsDirectory) {
        this.pluginDir = Path.of(pluginsDirectory);
    }

    public void loadPlugins() {
        // TODO: implement hot-reload with WatchService
    }

    public List<PricingStrategy> getStrategies() {
        return strategies;
    }
}