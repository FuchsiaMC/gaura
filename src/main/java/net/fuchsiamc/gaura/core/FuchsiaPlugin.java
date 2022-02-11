package net.fuchsiamc.gaura.core;

import net.fuchsiamc.gaura.commands.IFuchsiaCommand;
import net.fuchsiamc.gaura.registrars.CommandExecutorRegistrar;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract plug-in base with many added functionalities.
 */
public abstract class FuchsiaPlugin extends JavaPlugin {
    /**
     * Registrar responsible for registering commands.
     */
    public CommandExecutorRegistrar commandExecutorRegistrar;

    public FuchsiaPlugin() {
        commandExecutorRegistrar = new CommandExecutorRegistrar(this);
    }

    @Override
    public void onEnable() {
        super.onEnable();

        for (IFuchsiaCommand fuchsiaCommand : getCommands())
            commandExecutorRegistrar.register(fuchsiaCommand);
    }

    public List<IFuchsiaCommand> getCommands() {
        return new ArrayList<>();
    }
}
