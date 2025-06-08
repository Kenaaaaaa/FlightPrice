// core/engine/PluginManager.java
package core.engine;

import plugins.api.PricingStrategy;
import plugins.api.Plugin;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

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