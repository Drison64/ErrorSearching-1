package me.drison64.errorsearching1.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class cmdpico implements CommandExecutor {

    private List<Player> badPlayersList;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("This command is only for players.");
            return false;
        }

        Player player = (Player) sender;

        badPlayersList.add(player);
        player.sendMessage(ChatColor.DARK_RED + "You have been added to Santa's bad players list!");

        return false;
    }

}
