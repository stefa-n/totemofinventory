package xyz.stefa9.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import xyz.stefa9.items.ItemManager;

public class TotemEvents implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        Player player = e.getPlayer();
        if(player.getInventory().containsAtLeast(ItemManager.TotemOfInventory, 1))
            e.setKeepInventory(true);
    }
}