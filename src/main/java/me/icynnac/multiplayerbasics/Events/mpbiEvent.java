package me.icynnac.multiplayerbasics.Events;

import me.icynnac.multiplayerbasics.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class mpbiEvent implements Listener {
    @EventHandler
    public void mb(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA + "MultiplayerBasics Info")) {
            e.setCancelled(true);
            switch (e.getCurrentItem().getType()) {
                case BOOK:
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f&m>---------- &r&b&l Multiplayer&f&lBasics &f&m----------<"));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&fMade by: &bIcynnac"));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&fVersion: &bTEST VERSION"));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', ""));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&fGitHub: &bhttps://github.com/icynnac/multiplayerbasics"));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&fSpigot: &bNot here yet."));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f&m>-------------------------------<"));
                    break;
                case REDSTONE:
                    p.closeInventory();
                    p.performCommand("mpb");
                    break;
                case DIAMOND_PICKAXE:
                    p.closeInventory();
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&f If you need to report an issue, click here: &bhttps://github.com/icynnac/multiplayerbasics/issues"));
                    break;
                case BARRIER:
                    p.closeInventory();
                    break;
            }
        }
    }
}
