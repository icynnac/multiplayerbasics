package me.icynnac.multiplayerbasics;

import me.icynnac.multiplayerbasics.Events.MBEvents;
import me.icynnac.multiplayerbasics.GUIs.MBui;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class MultiplayerBasics extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new MBEvents(), this);

        Objects.requireNonNull(getCommand("mb")).setExecutor(new MBui());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
