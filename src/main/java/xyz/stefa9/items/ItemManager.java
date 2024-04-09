package xyz.stefa9.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemManager {
    public static ItemStack TotemOfInventory;
    public static ItemStack BrokenTotemOfInventory;

    public static void init()
    {
        CreateTotemOfInventory();
        CreateBrokenTotemOfInventory();
    }

    private static void CreateTotemOfInventory()
    {
        ItemStack item = new ItemStack(Material.STICK);
        ItemMeta meta = item.getItemMeta();
        meta.setCustomModelData(1);
        meta.setDisplayName(ChatColor.RESET + "Totem Of Inventory");
        item.setItemMeta(meta);

        TotemOfInventory = item;
    }

    private static void CreateBrokenTotemOfInventory()
    {
        ItemStack item = new ItemStack(Material.STICK);
        ItemMeta meta = item.getItemMeta();
        meta.setCustomModelData(2);
        meta.setDisplayName(ChatColor.RESET + "Broken Totem Of Inventory");
        item.setItemMeta(meta);
        BrokenTotemOfInventory = item;
    }
}
