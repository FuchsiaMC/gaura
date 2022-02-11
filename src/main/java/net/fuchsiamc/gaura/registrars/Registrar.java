package net.fuchsiamc.gaura.registrars;

import net.fuchsiamc.gaura.core.FuchsiaPlugin;

import javax.annotation.Nullable;

/**
 * Base registrar class.
 */
public abstract class Registrar<T> {
    public final FuchsiaPlugin plugin;

    public Registrar(FuchsiaPlugin plugin) {
        this.plugin = plugin;
    }

    /**
     * Registers an item to this registrar. Responsible for handling inclusion in plug-ins, etc.
     * @param item The item being registered.
     * @return The registered item instance if registration was completed, otherwise null.
     */
    @Nullable
    public abstract T register(T item);
}
