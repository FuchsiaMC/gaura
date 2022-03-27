package net.fuchsiamc.gaura.managers;

import net.fuchsiamc.gaura.core.FuchsiaPlugin;

public abstract class Manager<T extends FuchsiaPlugin> {
    protected final T plugin;

    public Manager(T plugin) {
        this.plugin = plugin;
    }
}

