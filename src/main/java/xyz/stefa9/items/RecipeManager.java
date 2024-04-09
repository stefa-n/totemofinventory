package xyz.stefa9.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class RecipeManager {
    public static void init() {
        ShapedRecipe recipe = new ShapedRecipe(ItemManager.TotemOfInventory);
        recipe.shape("I", "D", "I", "D", "E", "D", "I", "D", "I");
        recipe.setIngredient('I', Material.IRON_INGOT);
        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('E', Material.ENDER_CHEST);

        Bukkit.addRecipe(recipe);
    }
}
