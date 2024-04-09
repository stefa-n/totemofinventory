package xyz.stefa9.commands;

import xyz.stefa9.items.ItemManager;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player))
            return true;

        Player player = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("givetotemofinventory")) {
            player.getInventory().addItem(ItemManager.TotemOfInventory);
        }

        if(cmd.getName().equalsIgnoreCase("givebrokentotemofinventory")) {
            player.getInventory().addItem(ItemManager.BrokenTotemOfInventory);
        }

        return true;
    }
}
