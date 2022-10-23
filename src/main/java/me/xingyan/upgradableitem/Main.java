package me.xingyan.upgradableitem;

import me.xingyan.upgradableitem.Commands.commandMain;
import me.xingyan.upgradableitem.Events.getExp;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("upgradableitem").setExecutor(new commandMain());
        getServer().getPluginManager().registerEvents(new getExp(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
