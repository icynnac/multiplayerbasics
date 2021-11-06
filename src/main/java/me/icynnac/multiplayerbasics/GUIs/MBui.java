package me.icynnac.multiplayerbasics.GUIs;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class MBui implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (sender.hasPermission("multiplayerbasics.ui")) {
                // GUI
                Player p = (Player) sender;
                Inventory mbgui = Bukkit.createInventory(p, 9, ChatColor.GREEN + "MultiplayerBasics");
                ItemStack info = new ItemStack(Material.BOOK);
                ItemStack panel = new ItemStack(Material.REDSTONE);
                ItemStack support = new ItemStack(Material.DIAMOND_PICKAXE);
                ItemStack exit = new ItemStack(Material.BARRIER);
                ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 15);

                ItemMeta infoM = info.getItemMeta();
                infoM.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lMultiplayerBasics Info"));
                ArrayList<String> infoL = new ArrayList<>();
                infoL.add(ChatColor.translateAlternateColorCodes('&', "&6Standard info about MultiplayerBasics"));
                infoM.setLore(infoL);
                info.setItemMeta(infoM);

                ItemMeta panelM = panel.getItemMeta();
                panelM.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lServer Controls"));
                ArrayList<String> panelL = new ArrayList<>();
                panelL.add(ChatColor.translateAlternateColorCodes('&', "&2Control your server with a simple UI"));
                panelM.setLore(panelL);
                panel.setItemMeta(panelM);

                ItemMeta supportM = support.getItemMeta();
                supportM.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&b&lPlugin Support"));
                ArrayList<String> supportL = new ArrayList<>();
                supportL.add(ChatColor.translateAlternateColorCodes('&', "&3Get support for the plugin"));
                supportM.setLore(supportL);
                support.setItemMeta(supportM);

                ItemMeta exitM = exit.getItemMeta();
                exitM.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&lExit"));
                exit.setItemMeta(exitM);

                ItemMeta glassM = glass.getItemMeta();
                glassM.setDisplayName(" ");
                glass.setItemMeta(glassM);

                mbgui.setItem(0, glass);
                mbgui.setItem(2, glass);
                mbgui.setItem(4, glass);
                mbgui.setItem(6, glass);
                mbgui.setItem(8, glass);

                mbgui.setItem(1, info);
                mbgui.setItem(3, panel);
                mbgui.setItem(5, support);
                mbgui.setItem(7, exit);
                p.openInventory(mbgui);
            } else {
                sender.sendMessage(ChatColor.RED + "MultiplayerBasics >> No permission. Please contact an administrator if this is a mistake.");
            }
        } else {
            sender.sendMessage(ChatColor.RED + "MultiplayerBasics >> You can't use this command in console.");
        }
        return false;
    }
}
