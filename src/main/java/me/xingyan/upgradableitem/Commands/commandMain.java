package me.xingyan.upgradableitem.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;

import static me.xingyan.upgradableitem.Stasis.*;

public class commandMain implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                player.sendMessage("Usage: /" + label + " get");
                return true;
            }
            if (args.length >= 1) {
                if (args[0].equals("get")) {
                    if (args[1].toUpperCase(Locale.ROOT).equals("SWORD")) {
                        if (args.length >= 3) {
                            player.getInventory().addItem(sword(args[2].toUpperCase()));
                        } else {
                            player.getInventory().addItem(sword("WOODEN"));
                        }
                        player.sendMessage(ChatColor.GREEN + "You are received an Upgradeable Sword!");
                    }
                    if (args[1].toUpperCase(Locale.ROOT).equals("AXE")) {
                        if (args.length >= 3) {
                            player.getInventory().addItem(axe(args[2].toUpperCase()));
                        } else {
                            player.getInventory().addItem(axe("WOODEN"));
                        }
                        player.sendMessage(ChatColor.GREEN + "You are received an Upgradeable Axe!");
                    }
                    return true;
                }


                return true;
                } else {
                        sender.sendMessage("Available item: Sword, Axe");
                        return true;
                }
            }
        return true;
    }
}
