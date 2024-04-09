package xyz.stefa9.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;
import xyz.stefa9.totemofinventory;

public class RecipeManager {
    static Plugin plugin = totemofinventory.getPlugin(totemofinventory.class);

    public static void init() {
        TotemOfInventory();
        BrokenTotemOfInventory();
    }

    static void TotemOfInventory() {
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "totem_of_inventory"), ItemManager.TotemOfInventory);
        recipe.shape("IDI", "DED", "IDI");
        recipe.setIngredient('I', Material.IRON_INGOT);
        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('E', Material.ENDER_CHEST);
        Bukkit.addRecipe(recipe);
    }

    static void BrokenTotemOfInventory() {
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "broken_totem_of_inventory"), ItemManager.TotemOfInventory);
        recipe.shape("III", "IBI", "III");
        recipe.setIngredient('I', Material.IRON_INGOT);
        recipe.setIngredient('B', ItemManager.BrokenTotemOfInventory);
        Bukkit.addRecipe(recipe);
    }
}
