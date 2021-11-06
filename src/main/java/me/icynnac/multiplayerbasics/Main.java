package me.icynnac.bruhcmd;

import me.icynnac.bruhcmd.commands.*;
import me.icynnac.bruhcmd.events.*;
import me.icynnac.bruhcmd.guis.BruhCMDUI;
import me.icynnac.bruhcmd.guis.ConfigUI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

public final class Main extends JavaPlugin {

    public static Plugin instance;
    public static String prefix;
    public static String notenable;
    public static String consoleno;
    public static String noperm;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

        saveDefaultConfig();
        prefix = Objects.requireNonNull(getConfig().getString("messages.prefix")).replaceAll("&", "§");
        notenable = Objects.requireNonNull(getConfig().getString("messages.not-enabled")).replaceAll("&", "§");
        consoleno = Objects.requireNonNull(getConfig().getString("messages.console-cannot-use")).replaceAll("&", "§");
        noperm = Objects.requireNonNull(getConfig().getString("messages.no-permission-message")).replaceAll("&", "§");

        getServer().getPluginManager().registerEvents(new BruhCMDEvents(), this);
        getServer().getPluginManager().registerEvents(new CommandsEvents(), this);
        getServer().getPluginManager().registerEvents(new CyberbunkEvents(), this);
        getServer().getPluginManager().registerEvents(new UpdateEvents(), this);
        getServer().getPluginManager().registerEvents(new ConfigEvents(), this);

        Objects.requireNonNull(getCommand("bruh")).setExecutor(new BruhCommands());
        Objects.requireNonNull(getCommand("bruh reload")).setExecutor(new BruhCommands());
        Objects.requireNonNull(getCommand("sus")).setExecutor(new SusCommand());
        Objects.requireNonNull(getCommand("cutg")).setExecutor(new CutG());
        Objects.requireNonNull(getCommand("yeet")).setExecutor(new YEET());
        Objects.requireNonNull(getCommand("pop")).setExecutor(new pop());
        Objects.requireNonNull(getCommand("bruhcmd")).setExecutor(new BruhCMDUI());
        Objects.requireNonNull(getCommand("joe")).setExecutor(new joe());
        Objects.requireNonNull(getCommand("cyberpunk")).setExecutor(new cyberbunk());
        Objects.requireNonNull(getCommand("bomb")).setExecutor(new bomb());
        Objects.requireNonNull(getCommand("creeper")).setExecutor(new creeper());
        Objects.requireNonNull(getCommand("dragon")).setExecutor(new deez());
        Objects.requireNonNull(getCommand("bruhconfig")).setExecutor(new ConfigUI());
        Objects.requireNonNull(getCommand("syeet")).setExecutor(new superyeet());
        Objects.requireNonNull(getCommand("ratio")).setExecutor(new ratio());

        Logger logger = this.getLogger();

        new UpdateChecker(this, 85804).getVersion(version -> {
            if (!this.getDescription().getVersion().equalsIgnoreCase(version)) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Bruh" + ChatColor.GRAY + "" + ChatColor.BOLD + "CMD >> " + ChatColor.GOLD + "Update " + ChatColor.BOLD + "" + version + ChatColor.GRAY + " is available.");
            }
        });
    }
}
