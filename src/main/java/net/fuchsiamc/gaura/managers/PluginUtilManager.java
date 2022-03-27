package net.fuchsiamc.gaura.managers;

import net.fuchsiamc.gaura.core.FuchsiaPlugin;

public class PluginUtilManager extends Manager<FuchsiaPlugin> {
    public PluginUtilManager(FuchsiaPlugin plugin) {
        super(plugin);
    }

    @SuppressWarnings("unchecked")
    public <T> T getPlugin(Class<T> pluginClass) {
        return (T) plugin.getServer().getPluginManager().getPlugin(pluginClass.getName());
    }
}
