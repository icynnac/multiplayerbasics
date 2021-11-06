package me.icynnac.multiplayerbasics.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MBEvents implements Listener {
    @EventHandler
    public void mb(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.GREEN + "MultiplayerBasics")) {
            e.setCancelled(true);
            switch (e.getCurrentItem().getType()) {
                case BOOK:
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&m>---------- &r&6&l Multiplayer&8&lBasics &6&m----------<"));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8Made by: &6Icynnac"));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8Version: &61.0"));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8Thanks for &6986 Downloads &c<3"));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', ""));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8GitHub: &6https://github.com/icynnac/bruhcmd"));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8Spigot: &6https://www.spigotmc.org/resources/bruhcmd.85804/"));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&m>-------------------------------<"));
                case REDSTONE:
                case DIAMOND_PICKAXE:
                case BARRIER:
                    p.closeInventory();
                    break;
            }
        }
    }
}
