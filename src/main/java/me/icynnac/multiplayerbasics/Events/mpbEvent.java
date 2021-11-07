package me.icynnac.multiplayerbasics.Events;

import me.icynnac.multiplayerbasics.GUIs.adminactUI;
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
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA + "MultiplayerBasics Panel")) {
            switch (e.getCurrentItem().getType()) {
                case WOOL:
                    break;
                case DIAMOND_SWORD:
                    p.closeInventory();
                    p.openInventory(adminact.getAdminActInventory());
                    e.setCancelled(true);
                    break;
            }
        }
    }
}
