package me.xingyan.upgradableitem;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Stasis {

    static ItemStack item = null;

    public static ItemStack sword(String rarity){
        ItemMeta im;
        List<String> lore;
        switch (rarity){
            case "WOODEN":
                item = new ItemStack(Material.WOODEN_SWORD);
                im = item.getItemMeta();
                lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Stone Sword");
                lore.add(ChatColor.YELLOW+"Need exp: (0/10)");
                im.setLore(lore);
                item.setItemMeta(im);
                break;
            case "STONE":
                item = new ItemStack(Material.STONE_SWORD);
                im = item.getItemMeta();
                lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Wooden Sword");
                lore.add(ChatColor.YELLOW+"Need exp: (0/50)");
                im.setLore(lore);
                item.setItemMeta(im);
                break;
            case "GOLDEN":
                item = new ItemStack(Material.GOLDEN_SWORD);
                im = item.getItemMeta();
                lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Iron Sword");
                lore.add(ChatColor.YELLOW+"Need exp: (0/80)");
                im.setLore(lore);
                item.setItemMeta(im);
                break;
            case "IRON":
                item = new ItemStack(Material.IRON_SWORD);
                im = item.getItemMeta();
                lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Diamond Sword");
                lore.add(ChatColor.YELLOW+"Need exp: (0/5000)");
                im.setLore(lore);
                item.setItemMeta(im);
                break;
            case "DIAMOND":
                item = new ItemStack(Material.DIAMOND_SWORD);
                im = item.getItemMeta();
                lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Netherite Sword");
                lore.add(ChatColor.YELLOW+"Need exp: (0/50000)");
                im.setLore(lore);
                item.setItemMeta(im);
                break;
            case "NETHERITE":
                item = new ItemStack(Material.NETHERITE_SWORD);
                im = item.getItemMeta();
                lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+ChatColor.BOLD+" MAXED OUT");
                im.setLore(lore);
                item.setItemMeta(im);
                break;
            default:
                item = new ItemStack(Material.WOODEN_SWORD);
                im = item.getItemMeta();
                lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Stone Sword");
                lore.add(ChatColor.YELLOW+"Need exp: (0/10)");
                im.setLore(lore);
                item.setItemMeta(im);
                break;
        }
        return item;
    }

    public static ItemStack axe(String rarity){
        ItemMeta im;
        List<String> lore;
        switch (rarity){
            case "WOODEN":
                item = new ItemStack(Material.WOODEN_AXE);
                im = item.getItemMeta();
                lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Stone Axe");
                lore.add(ChatColor.YELLOW+"Need exp: (0/10)");
                im.setLore(lore);
                item.setItemMeta(im);
                break;
            case "STONE":
                item = new ItemStack(Material.STONE_AXE);
                im = item.getItemMeta();
                lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Golden Axe");
                lore.add(ChatColor.YELLOW+"Need exp: (0/50)");
                im.setLore(lore);
                item.setItemMeta(im);
                break;
            case "GOLDEN":
                item = new ItemStack(Material.GOLDEN_AXE);
                im = item.getItemMeta();
                lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Iron Axe");
                lore.add(ChatColor.YELLOW+"Need exp: (0/80)");
                im.setLore(lore);
                item.setItemMeta(im);
                break;
            case "IRON":
                item = new ItemStack(Material.IRON_AXE);
                im = item.getItemMeta();
                lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Diamond Axe");
                lore.add(ChatColor.YELLOW+"Need exp: (0/5000)");
                im.setLore(lore);
                item.setItemMeta(im);
                break;
            case "DIAMOND":
                item = new ItemStack(Material.DIAMOND_AXE);
                im = item.getItemMeta();
                lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Netherite Axe");
                lore.add(ChatColor.YELLOW+"Need exp: (0/50000)");
                im.setLore(lore);
                item.setItemMeta(im);
                break;
            case "NETHERITE":
                item = new ItemStack(Material.NETHERITE_AXE);
                im = item.getItemMeta();
                lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+ChatColor.BOLD+" MAXED OUT");
                im.setLore(lore);
                item.setItemMeta(im);
                break;
            default:
                item = new ItemStack(Material.WOODEN_SWORD);
                im = item.getItemMeta();
                lore = new ArrayList<>();
                lore.add(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Stone Sword");
                lore.add(ChatColor.YELLOW+"Need exp: (0/10)");
                im.setLore(lore);
                item.setItemMeta(im);
                break;
        }
        return item;
    }


    public static boolean hasAvaliableSlot(Player player){
        Inventory inv = player.getInventory();
        Boolean check=false;
        for (ItemStack item: inv.getContents()) {
            if(item == null) {
                check = true;
                break;
            }
        }

        return check;
    }

}
