package com.seailz.owncommand.listeners;

import com.seailz.owncommand.OwnCommand;
import com.seailz.owncommand.commands.YourNameCommand;
import dev.negativekb.api.commands.Command;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerConnectionChange implements Listener {
    private final OwnCommand plugin;
    public PlayerConnectionChange(OwnCommand plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onConnect(PlayerJoinEvent e) {
        Command c = new YourNameCommand();
        if (c.isRegistered()) return;
        c.setDisabled(false);
        c.setName(e.getPlayer().getName());
        plugin.registerCommands(c);
        plugin.getLogger().info("Registered command");
    }
    @EventHandler
    public void onDisconnect(PlayerQuitEvent e) {
        Command c = new YourNameCommand();
        c.setName(e.getPlayer().getName());
        c.setDisabled(true);
    }
}
