package me.icynnac.multiplayerbasics.Events;

import me.icynnac.multiplayerbasics.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.scheduler.BukkitScheduler;

public class adminactEvent implements Listener {
    @EventHandler
    public void adminact(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "MultiplayerBasics Admin")) {
            e.setCancelled(true);
            switch (e.getCurrentItem().getType()) {
                case WOOL:
                    if (e.getSlot() == 12) {
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', ChatColor.translateAlternateColorCodes('&', Main.prefix + " &cShutting down...")));
                        BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
                        scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                            for (Player all : Bukkit.getServer().getOnlinePlayers()) {
                                all.kickPlayer(ChatColor.translateAlternateColorCodes('&', Main.kicksd1 + "\n" + Main.kicksd2 + "\n" + Main.kicksd3 + "\n" + Main.kicksd4));
                            }
                            Bukkit.getServer().shutdown();
                        },20*2);
                    }
                    if (e.getSlot() == 14) {
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + " &aReloading..."));
                        Bukkit.reload();
                    }
                    break;
                case PAPER:
                    p.closeInventory();
                    p.performCommand("mpb");
                    break;
                case BARRIER:
                    p.closeInventory();
                    break;
            }
        }
    }
}
