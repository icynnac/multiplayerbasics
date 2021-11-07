package me.icynnac.multiplayerbasics;

import me.icynnac.multiplayerbasics.Events.adminactEvent;
import me.icynnac.multiplayerbasics.Events.mpbEvent;
import me.icynnac.multiplayerbasics.Events.mpbiEvent;
import me.icynnac.multiplayerbasics.GUIs.mpbUI;
import me.icynnac.multiplayerbasics.GUIs.mpbiUI;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {

    public static Plugin instance;

    public static String prefix;
    public static String noplayer;
    public static String noperm;
    public static String noconsole;

    public static String kicksd1;
    public static String kicksd2;
    public static String kicksd3;
    public static String kicksd4;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

        prefix = Objects.requireNonNull(getConfig().getString("messages.prefix")).replaceAll("&", "§");
        noplayer = Objects.requireNonNull(getConfig().getString("messages.player-not-found")).replaceAll("&", "§");
        noperm = Objects.requireNonNull(getConfig().getString("messages.no-permission")).replaceAll("&", "§");
        noconsole = Objects.requireNonNull(getConfig().getString("messages.console-denied")).replaceAll("&", "§");

        kicksd1 = Objects.requireNonNull(getConfig().getString("messages.kick-shutdown-line-1")).replaceAll("&", "§");
        kicksd2 = Objects.requireNonNull(getConfig().getString("messages.kick-shutdown-line-2")).replaceAll("&", "§");
        kicksd3 = Objects.requireNonNull(getConfig().getString("messages.kick-shutdown-line-3")).replaceAll("&", "§");
        kicksd4 = Objects.requireNonNull(getConfig().getString("messages.kick-shutdown-line-4")).replaceAll("&", "§");

        getServer().getPluginManager().registerEvents(new mpbEvent(), this);
        getServer().getPluginManager().registerEvents(new mpbiEvent(), this);
        getServer().getPluginManager().registerEvents(new adminactEvent(), this);

        Objects.requireNonNull(getCommand("mpb")).setExecutor(new mpbUI());
        getCommand("mpb").setPermissionMessage(ChatColor.translateAlternateColorCodes('&', prefix + " " + noperm));
        Objects.requireNonNull(getCommand("mpbinfo")).setExecutor(new mpbiUI());
        getCommand("mpbinfo").setPermissionMessage(ChatColor.translateAlternateColorCodes('&', prefix + " " + noperm));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
