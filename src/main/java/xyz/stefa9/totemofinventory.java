package xyz.stefa9;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.stefa9.commands.Commands;
import xyz.stefa9.events.TotemEvents;
import xyz.stefa9.items.ItemManager;
import xyz.stefa9.items.RecipeManager;

public final class totemofinventory extends JavaPlugin {
    @Override
    public void onEnable() {
        ItemManager.init();
        RecipeManager.init();

        getServer().getPluginManager().registerEvents(new TotemEvents(), this);
        getCommand("givetotemofinventory").setExecutor(new Commands());
        getCommand("givebrokentotemofinventory").setExecutor(new Commands());
    }
}
