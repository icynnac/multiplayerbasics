package me.icynnac.multiplayerbasics.GUIs;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class adminactUI {
    public Inventory getAdminActInventory() {
        Inventory adminact = Bukkit.createInventory(null, 27, ChatColor.RED + "MultiplayerBasics Admin");

        ItemStack stop = new ItemStack(Material.WOOL,1, (short) 14);
        ItemStack reload = new ItemStack(Material.WOOL, 1, (short) 5);

        ItemMeta stopM = stop.getItemMeta();
        stopM.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Stop This Server");
        ArrayList<String> stopL = new ArrayList<>();
        stopL.add(ChatColor.RED + "Fully stop the server, and kick all players.");
        stopL.add(ChatColor.RED + "" + ChatColor.BOLD + "WARNING: Server will not start back up unless you have console access.");
        stopL.add(ChatColor.RED + "" + ChatColor.BOLD + "Do NOT use this command if you cannot start it back up.");
        stopM.setLore(stopL);
        stop.setItemMeta(stopM);

        ItemMeta reloadM = reload.getItemMeta();
        reloadM.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Reload All Plugins");
        ArrayList<String> reloadL = new ArrayList<>();
        reloadL.add(ChatColor.RED + "WARNING: This could cause plugin unstability. I recommend");
        reloadL.add(ChatColor.RED + "restarting the server if you're adding new plugins.");
        reloadM.setLore(reloadL);
        reload.setItemMeta(reloadM);

        adminact.setItem(12,stop);
        adminact.setItem(14,reload);
        return adminact;
    }
}
