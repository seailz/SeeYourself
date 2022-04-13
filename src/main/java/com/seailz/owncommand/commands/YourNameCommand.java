package com.seailz.owncommand.commands;

import dev.negativekb.api.commands.Command;
import dev.negativekb.api.commands.annotation.CommandInfo;
import dev.negativekb.api.message.Message;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandInfo(name = "yourface", aliases = {"whoami", "whatsmyface", "imbored"})
public class YourNameCommand extends Command {
    @Override
    public void onCommand(CommandSender sender, String[] args) {
        if (!sender.getName().equals(getName())) {
            new Message("&fUnknown command. Type \"/help\" for help.");
            return;
        }
        PlayerHead.API.sendPlayerHead((Player) sender, 10, (Player) sender);
        new Message("&cThis is your face :O").send(sender);
    }
}
