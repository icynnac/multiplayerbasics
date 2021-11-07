package me.icynnac.multiplayerbasics.GUIs;

import me.icynnac.multiplayerbasics.Main;
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

public class mpbiUI implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("multiplayerbasics.info")) {
                Inventory mpbigui = Bukkit.createInventory(p, 9, ChatColor.AQUA + "MultiplayerBasics Info");
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

                mpbigui.setItem(0, glass);
                mpbigui.setItem(2, glass);
                mpbigui.setItem(4, glass);
                mpbigui.setItem(6, glass);
                mpbigui.setItem(8, glass);

                mpbigui.setItem(1, info);
                mpbigui.setItem(3, panel);
                mpbigui.setItem(5, support);
                mpbigui.setItem(7, exit);
                p.openInventory(mpbigui);
            }
        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + " " + Main.noconsole));
        }
        return false;
    }
}
