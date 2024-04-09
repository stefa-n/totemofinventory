package xyz.stefa9.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

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
        ItemStack item = new ItemStack(Material.TOTEM_OF_UNDYING, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Totem Of Inventory");
        List<String> lore = new ArrayList<>();
        lore.add("Keeps the items on death");
        lore.add("On use: Deletes totems of other players");
        lore.add("in a 20 block radius");
        meta.setLore(lore);
        item.setItemMeta(meta);
        TotemOfInventory = item;
    }

    private static void CreateBrokenTotemOfInventory()
    {
        ItemStack item = new ItemStack(Material.TOTEM_OF_UNDYING, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Broken Totem Of Inventory");
        item.setItemMeta(meta);
        BrokenTotemOfInventory = item;
    }
}
