package net.fuchsiamc.gaura.managers;

import net.fuchsiamc.gaura.Gaura;
import net.fuchsiamc.gaura.core.FuchsiaPlugin;

import javax.annotation.Nullable;

public abstract class Manager<T extends FuchsiaPlugin> {
    protected final T plugin;

    public Manager(T plugin) {
        this.plugin = plugin;
    }
}

