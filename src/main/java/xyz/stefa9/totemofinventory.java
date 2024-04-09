package xyz.stefa9;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.stefa9.items.ItemManager;
import xyz.stefa9.items.RecipeManager;

public final class totemofinventory extends JavaPlugin {
    @Override
    public void onEnable() {
        ItemManager.init();
        RecipeManager.init();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
