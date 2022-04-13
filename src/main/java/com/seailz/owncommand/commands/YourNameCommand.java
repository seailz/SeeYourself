package com.seailz.owncommand.commands;

import com.seailz.owncommand.utils.HeadMessage;
import dev.negativekb.api.commands.Command;
import dev.negativekb.api.commands.annotation.CommandInfo;
import dev.negativekb.api.message.Message;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.IOException;

@CommandInfo(name = "yourface", aliases = {"whoami", "whatsmyface", "imbored"})
public class YourNameCommand extends Command {
    @Override
    public void onCommand(CommandSender sender, String[] args) {
        if (!sender.getName().equals(getName())) {
            new Message("&fUnknown command. Type \"/help\" for help.");
            return;
        }
        try {
            new HeadMessage((Player) sender);
            new Message("&cThis is your face :O").send(sender);

        } catch (IOException e) {
             new Message("&cInternal error, please contact the owner! Here are the error details:", "&f- &c" + e.getMessage()).send(sender);
             e.printStackTrace();
        }
    }
}
