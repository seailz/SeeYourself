package com.seailz.owncommand;

import com.seailz.owncommand.listeners.PlayerConnectionChange;
import dev.negativekb.api.BasePlugin;
import dev.negativekb.api.commands.Command;
import org.bukkit.plugin.java.JavaPlugin;

public final class OwnCommand extends BasePlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerListeners(new PlayerConnectionChange(this));
    }

}
