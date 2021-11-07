package me.icynnac.multiplayerbasics.Events;

import me.icynnac.multiplayerbasics.GUIs.adminactUI;
import me.icynnac.multiplayerbasics.GUIs.potionallUI;
import me.icynnac.multiplayerbasics.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class mpbEvent implements Listener {
    @EventHandler
    public void mpb(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        adminactUI adminact = new adminactUI();
        potionallUI potionall = new potionallUI();
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA + "MultiplayerBasics Panel")) {
            e.setCancelled(true);
            switch (e.getCurrentItem().getType()) {
                case DIAMOND_SWORD:
                    if (p.hasPermission("multiplayerbasics.admin")) {
                        p.closeInventory();
                        p.openInventory(adminact.getAdminActInventory());
                    } else {
                        p.closeInventory();
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + " " + Main.noperm));
                    }
                    break;
                case POTION:
                    if (e.getSlot() == 2) {
                        p.closeInventory();
                        p.openInventory(potionall.getPotionAllInventory());
                    }
                    break;
                case GOLDEN_APPLE:
                    for (Player all : Bukkit.getServer().getOnlinePlayers()) {
                        all.setHealth(20);
                        all.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&5 You have been healed!"));
                    }
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&5 Everyone has been healed."));
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&b Everyone has been healed."));
                    break;
                case GRILLED_PORK:
                    for (Player all : Bukkit.getServer().getOnlinePlayers()) {
                        all.setFoodLevel(20);
                        all.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&6 You have been fed."));
                    }
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&6 Everyone has been fed."));
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&b Everyone has been fed."));
                    break;
                case BARRIER:
                    p.closeInventory();
                    break;
            }
        }
    }
}
