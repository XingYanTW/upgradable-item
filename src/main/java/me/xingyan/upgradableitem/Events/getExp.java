package me.xingyan.upgradableitem.Events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class getExp implements Listener {

    @EventHandler
    public void ongetexp(PlayerExpChangeEvent event){
        Player player = event.getPlayer();
        Inventory inv = player.getInventory();
        ItemStack item = player.getItemInHand();

        //swords
        if(item.getType().equals(Material.WOODEN_SWORD)){
            ItemMeta itemMeta = item.getItemMeta();
            List<String> lore = itemMeta.getLore();
            if(lore.get(0).equals(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Stone Sword")){
                String loreline2 = lore.get(1).replace(ChatColor.YELLOW+"Need exp: (", "").replace("/10)", "");
                int exp = Integer.parseInt(loreline2);
                exp = exp + event.getAmount();
                if(exp>=10){
                    item.setType(Material.STONE_SWORD);
                    lore.set(0, ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Golden Sword");
                    exp = exp-10;
                    lore.set(1, ChatColor.YELLOW+"Need exp: ("+exp+"/50)");
                    itemMeta.setLore(lore);
                    item.setItemMeta(itemMeta);
                    player.setItemInHand(item);
                    return;
                }
                lore.set(1, ChatColor.YELLOW+"Need exp: ("+exp+"/10)");
                itemMeta.setLore(lore);
                item.setItemMeta(itemMeta);
                player.setItemInHand(item);
            }
        }
        if(item.getType().equals(Material.STONE_SWORD)){
            ItemMeta itemMeta = item.getItemMeta();
            List<String> lore = itemMeta.getLore();
            if(lore.get(0).equals(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Golden Sword")){
                String loreline2 = lore.get(1).replace(ChatColor.YELLOW+"Need exp: (", "").replace("/50)", "");
                int exp = Integer.parseInt(loreline2);
                exp = exp + event.getAmount();
                if(exp>=50){
                    item.setType(Material.GOLDEN_SWORD);
                    lore.set(0, ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Iron Sword");
                    exp = exp-50;
                    lore.set(1, ChatColor.YELLOW+"Need exp: ("+exp+"/80)");
                    itemMeta.setLore(lore);
                    item.setItemMeta(itemMeta);
                    player.setItemInHand(item);
                    return;
                }
                lore.set(1, ChatColor.YELLOW+"Need exp: ("+exp+"/50)");
                itemMeta.setLore(lore);
                item.setItemMeta(itemMeta);
                player.setItemInHand(item);
            }
        }
        if(item.getType().equals(Material.GOLDEN_SWORD)){
            ItemMeta itemMeta = item.getItemMeta();
            List<String> lore = itemMeta.getLore();
            if(lore.get(0).equals(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Iron Sword")){
                String loreline2 = lore.get(1).replace(ChatColor.YELLOW+"Need exp: (", "").replace("/80)", "");
                int exp = Integer.parseInt(loreline2);
                exp = exp + event.getAmount();
                if(exp>=80){
                    item.setType(Material.IRON_SWORD);
                    lore.set(0, ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Diamond Sword");
                    exp = exp-80;
                    lore.set(1, ChatColor.YELLOW+"Need exp: ("+exp+"/5000)");
                    itemMeta.setLore(lore);
                    item.setItemMeta(itemMeta);
                    player.setItemInHand(item);
                    return;
                }
                lore.set(1, ChatColor.YELLOW+"Need exp: ("+exp+"/80)");
                itemMeta.setLore(lore);
                item.setItemMeta(itemMeta);
                player.setItemInHand(item);
            }
        }
        if(item.getType().equals(Material.IRON_SWORD)){
            ItemMeta itemMeta = item.getItemMeta();
            List<String> lore = itemMeta.getLore();
            if(lore.get(0).equals(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Diamond Sword")){
                String loreline2 = lore.get(1).replace(ChatColor.YELLOW+"Need exp: (", "").replace("/5000)", "");
                int exp = Integer.parseInt(loreline2);
                exp = exp + event.getAmount();
                if(exp>=5000){
                    item.setType(Material.DIAMOND_SWORD);
                    lore.set(0, ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Netherite Sword");
                    exp = exp-5000;
                    lore.set(1, ChatColor.YELLOW+"Need exp: ("+exp+"/50000)");
                    itemMeta.setLore(lore);
                    item.setItemMeta(itemMeta);
                    player.setItemInHand(item);
                    return;
                }
                lore.set(1, ChatColor.YELLOW+"Need exp: ("+exp+"/5000)");
                itemMeta.setLore(lore);
                item.setItemMeta(itemMeta);
                player.setItemInHand(item);
            }
        }
        if(item.getType().equals(Material.DIAMOND_SWORD)){
            ItemMeta itemMeta = item.getItemMeta();
            List<String> lore = itemMeta.getLore();
            if(lore.get(0).equals(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Netherite Sword")){
                String loreline2 = lore.get(1).replace(ChatColor.YELLOW+"Need exp: (", "").replace("/50000)", "");
                int exp = Integer.parseInt(loreline2);
                exp = exp + event.getAmount();
                if(exp>=50000){
                    item.setType(Material.DIAMOND_SWORD);
                    lore.set(0, ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+ChatColor.BOLD+" MAXED OUT");
                    lore.remove(1);
                    itemMeta.setLore(lore);
                    item.setItemMeta(itemMeta);
                    player.setItemInHand(item);
                    return;
                }
                lore.set(1, ChatColor.YELLOW+"Need exp: ("+exp+"/50000)");
                itemMeta.setLore(lore);
                item.setItemMeta(itemMeta);
                player.setItemInHand(item);
            }
        }

        //axes
        if(item.getType().equals(Material.WOODEN_AXE)){
            ItemMeta itemMeta = item.getItemMeta();
            List<String> lore = itemMeta.getLore();
            if(lore.get(0).equals(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Stone Axe")){
                String loreline2 = lore.get(1).replace(ChatColor.YELLOW+"Need exp: (", "").replace("/10)", "");
                int exp = Integer.parseInt(loreline2);
                exp = exp + event.getAmount();
                if(exp>=10){
                    item.setType(Material.STONE_AXE);
                    lore.set(0, ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Golden Axe");
                    exp = exp-10;
                    lore.set(1, ChatColor.YELLOW+"Need exp: ("+exp+"/50)");
                    itemMeta.setLore(lore);
                    item.setItemMeta(itemMeta);
                    player.setItemInHand(item);
                    return;
                }
                lore.set(1, ChatColor.YELLOW+"Need exp: ("+exp+"/10)");
                itemMeta.setLore(lore);
                item.setItemMeta(itemMeta);
                player.setItemInHand(item);
            }
        }
        if(item.getType().equals(Material.STONE_AXE)){
            ItemMeta itemMeta = item.getItemMeta();
            List<String> lore = itemMeta.getLore();
            if(lore.get(0).equals(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Golden Axe")){
                String loreline2 = lore.get(1).replace(ChatColor.YELLOW+"Need exp: (", "").replace("/50)", "");
                int exp = Integer.parseInt(loreline2);
                exp = exp + event.getAmount();
                if(exp>=50){
                    item.setType(Material.GOLDEN_AXE);
                    lore.set(0, ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Iron Axe");
                    exp = exp-50;
                    lore.set(1, ChatColor.YELLOW+"Need exp: ("+exp+"/80)");
                    itemMeta.setLore(lore);
                    item.setItemMeta(itemMeta);
                    player.setItemInHand(item);
                    return;
                }
                lore.set(1, ChatColor.YELLOW+"Need exp: ("+exp+"/50)");
                itemMeta.setLore(lore);
                item.setItemMeta(itemMeta);
                player.setItemInHand(item);
            }
        }
        if(item.getType().equals(Material.GOLDEN_AXE)){
            ItemMeta itemMeta = item.getItemMeta();
            List<String> lore = itemMeta.getLore();
            if(lore.get(0).equals(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Iron Axe")){
                String loreline2 = lore.get(1).replace(ChatColor.YELLOW+"Need exp: (", "").replace("/80)", "");
                int exp = Integer.parseInt(loreline2);
                exp = exp + event.getAmount();
                if(exp>=80){
                    item.setType(Material.IRON_AXE);
                    lore.set(0, ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Diamond Axe");
                    exp = exp-80;
                    lore.set(1, ChatColor.YELLOW+"Need exp: ("+exp+"/5000)");
                    itemMeta.setLore(lore);
                    item.setItemMeta(itemMeta);
                    player.setItemInHand(item);
                    return;
                }
                lore.set(1, ChatColor.YELLOW+"Need exp: ("+exp+"/80)");
                itemMeta.setLore(lore);
                item.setItemMeta(itemMeta);
                player.setItemInHand(item);
            }
        }
        if(item.getType().equals(Material.IRON_AXE)){
            ItemMeta itemMeta = item.getItemMeta();
            List<String> lore = itemMeta.getLore();
            if(lore.get(0).equals(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Diamond Axe")){
                String loreline2 = lore.get(1).replace(ChatColor.YELLOW+"Need exp: (", "").replace("/5000)", "");
                int exp = Integer.parseInt(loreline2);
                exp = exp + event.getAmount();
                if(exp>=5000){
                    item.setType(Material.DIAMOND_AXE);
                    lore.set(0, ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Netherite Axe");
                    exp = exp-5000;
                    lore.set(1, ChatColor.YELLOW+"Need exp: ("+exp+"/50000)");
                    itemMeta.setLore(lore);
                    item.setItemMeta(itemMeta);
                    player.setItemInHand(item);
                    return;
                }
                lore.set(1, ChatColor.YELLOW+"Need exp: ("+exp+"/5000)");
                itemMeta.setLore(lore);
                item.setItemMeta(itemMeta);
                player.setItemInHand(item);
            }
        }
        if(item.getType().equals(Material.DIAMOND_AXE)){
            ItemMeta itemMeta = item.getItemMeta();
            List<String> lore = itemMeta.getLore();
            if(lore.get(0).equals(ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+" Netherite Axe")){
                String loreline2 = lore.get(1).replace(ChatColor.YELLOW+"Need exp: (", "").replace("/50000)", "");
                int exp = Integer.parseInt(loreline2);
                exp = exp + event.getAmount();
                if(exp>=50000){
                    item.setType(Material.NETHERITE_AXE);
                    lore.set(0, ChatColor.YELLOW+"Next Upgrade:"+ChatColor.WHITE+ChatColor.BOLD+" MAXED OUT");
                    lore.remove(1);
                    itemMeta.setLore(lore);
                    item.setItemMeta(itemMeta);
                    player.setItemInHand(item);
                    return;
                }
                lore.set(1, ChatColor.YELLOW+"Need exp: ("+exp+"/50000)");
                itemMeta.setLore(lore);
                item.setItemMeta(itemMeta);
                player.setItemInHand(item);
            }
        }

        event.getPlayer().sendMessage(ChatColor.GREEN+"Exp: "+event.getAmount());
    }

}
