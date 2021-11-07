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
        Inventory adminact = Bukkit.createInventory(null, 36, ChatColor.RED + "MultiplayerBasics Admin");

        ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 15);
        ItemStack back = new ItemStack(Material.PAPER);
        ItemStack exit = new ItemStack(Material.BARRIER);
        ItemStack stop = new ItemStack(Material.WOOL,1, (short) 14);
        ItemStack reload = new ItemStack(Material.WOOL, 1, (short) 5);

        ItemMeta glassM = glass.getItemMeta();
        glassM.setDisplayName(" ");
        glass.setItemMeta(glassM);

        ItemMeta backM = back.getItemMeta();
        backM.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Back");
        back.setItemMeta(backM);

        ItemMeta exitM = exit.getItemMeta();
        exitM.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Exit");
        exit.setItemMeta(exitM);

        ItemMeta stopM = stop.getItemMeta();
        stopM.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Stop This Server");
        ArrayList<String> stopL = new ArrayList<>();
        stopL.add(ChatColor.RED + "Fully stop the server, and kick all players.");
        stopL.add(ChatColor.RED + "" + ChatColor.BOLD + "WARNING: Server will not start back up");
        stopL.add(ChatColor.RED + "" + ChatColor.BOLD + "unless you have console access. Do NOT use");
        stopL.add(ChatColor.RED + "" + ChatColor.BOLD + "this command if you cannot start it back up.");
        stopM.setLore(stopL);
        stop.setItemMeta(stopM);

        ItemMeta reloadM = reload.getItemMeta();
        reloadM.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Reload All Plugins");
        ArrayList<String> reloadL = new ArrayList<>();
        reloadL.add(ChatColor.GREEN + "Reload all the server's plugins.");
        reloadL.add(ChatColor.RED + "" + ChatColor.BOLD + "WARNING: This could cause plugin instability. I recommend");
        reloadL.add(ChatColor.RED + "" + ChatColor.BOLD + "restarting the server if you're adding new plugins.");
        reloadM.setLore(reloadL);
        reload.setItemMeta(reloadM);

        adminact.setItem(0, glass);
        adminact.setItem(1, glass);
        adminact.setItem(2, glass);
        adminact.setItem(3, glass);
        adminact.setItem(4, glass);
        adminact.setItem(5, glass);
        adminact.setItem(6, glass);
        adminact.setItem(7, glass);
        adminact.setItem(8, glass);
        adminact.setItem(9, glass);
        adminact.setItem(10, glass);
        adminact.setItem(11, glass);
        adminact.setItem(13, glass);
        adminact.setItem(15, glass);
        adminact.setItem(16, glass);
        adminact.setItem(17, glass);
        adminact.setItem(18, glass);
        adminact.setItem(19, glass);
        adminact.setItem(20, glass);
        adminact.setItem(21, glass);
        adminact.setItem(22, glass);
        adminact.setItem(23, glass);
        adminact.setItem(24, glass);
        adminact.setItem(25, glass);
        adminact.setItem(26, glass);
        adminact.setItem(27, glass);
        adminact.setItem(28, glass);
        adminact.setItem(29, glass);
        adminact.setItem(32, glass);
        adminact.setItem(33, glass);
        adminact.setItem(34, glass);
        adminact.setItem(35, glass);

        adminact.setItem(12, stop);
        adminact.setItem(14, reload);
        adminact.setItem(30, back);
        adminact.setItem(31, exit);
        return adminact;
    }
}
