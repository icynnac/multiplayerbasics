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

public class mpbUI implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("multiplayerbasics.panel")) {
                Inventory mpb = Bukkit.createInventory(p, 36, ChatColor.AQUA + "MultiplayerBasics Panel");
                ItemStack reload = new ItemStack(Material.WOOL, 1, (short) 4);
                ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 15);
                ItemStack exit =  new ItemStack(Material.BARRIER);

                ItemMeta reloadM = reload.getItemMeta();
                reloadM.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Reload All Plugins");
                ArrayList<String> reloadL = new ArrayList<>();
                reloadL.add(ChatColor.RED + "WARNING: This could cause plugin unstability. I recommend");
                reloadL.add(ChatColor.RED + "restarting the server if you're adding new plugins.");
                reloadM.setLore(reloadL);
                reload.setItemMeta(reloadM);

                ItemMeta glassM = glass.getItemMeta();
                glassM.setDisplayName(" ");
                glass.setItemMeta(glassM);

                ItemMeta exitM = exit.getItemMeta();
                exitM.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Exit");
                exit.setItemMeta(exitM);

                mpb.setItem(0, reload);

                mpb.setItem(27, glass);
                mpb.setItem(28, glass);
                mpb.setItem(29, glass);
                mpb.setItem(30, glass);
                mpb.setItem(31, exit);
                mpb.setItem(32, glass);
                mpb.setItem(33, glass);
                mpb.setItem(34, glass);
                mpb.setItem(35, glass);

                p.openInventory(mpb);
            }
        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + " " + Main.noconsole));
        }
        return false;
    }
}
