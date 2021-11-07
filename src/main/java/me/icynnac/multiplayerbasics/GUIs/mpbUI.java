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
import org.bukkit.inventory.meta.PotionMeta;

import java.util.ArrayList;

public class mpbUI implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("multiplayerbasics.panel")) {
                Inventory mpb = Bukkit.createInventory(p, 36, ChatColor.AQUA + "MultiplayerBasics Panel");
                ItemStack admin = new ItemStack(Material.DIAMOND_SWORD);
                ItemStack healall = new ItemStack(Material.GOLDEN_APPLE);
                ItemStack feedall = new ItemStack(Material.GRILLED_PORK);
                ItemStack potall = new ItemStack(Material.POTION);
                ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 15);
                ItemStack exit =  new ItemStack(Material.BARRIER);

                ItemMeta adminM = admin.getItemMeta();
                adminM.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Administrative Actions");
                ArrayList<String> adminL = new ArrayList<>();
                adminL.add(ChatColor.RED + "Actions that only trusted people should be able to use.");
                adminM.setLore(adminL);
                admin.setItemMeta(adminM);

                ItemMeta healaM = healall.getItemMeta();
                healaM.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Heal All Players");
                ArrayList<String> healaL = new ArrayList<>();
                healaL.add(ChatColor.GREEN + "Heal all players online.");
                healaM.setLore(healaL);
                healall.setItemMeta(healaM);

                ItemMeta feedaM = feedall.getItemMeta();
                feedaM.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Feed All Players");
                ArrayList<String> feedaL = new ArrayList<>();
                feedaL.add(ChatColor.GOLD + "Fully restore saturation for all players.");
                feedaM.setLore(feedaL);
                feedall.setItemMeta(feedaM);

                PotionMeta potallM = (PotionMeta) potall.getItemMeta();
                potallM.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Give All Players Effect");
                ArrayList<String> potalL = new ArrayList<>();
                potalL.add(ChatColor.LIGHT_PURPLE + "Give all players a potion effect.");
                potallM.setLore(potalL);
                potall.setItemMeta(potallM);

                ItemMeta glassM = glass.getItemMeta();
                glassM.setDisplayName(" ");
                glass.setItemMeta(glassM);

                ItemMeta exitM = exit.getItemMeta();
                exitM.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Exit");
                exit.setItemMeta(exitM);

                mpb.setItem(0, healall);
                mpb.setItem(1, feedall);
                mpb.setItem(2, potall);
                mpb.setItem(13, admin);

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
