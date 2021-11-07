package me.icynnac.multiplayerbasics.Events;

import me.icynnac.multiplayerbasics.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class potionallEvent implements Listener {
    @EventHandler
    public void potall(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.DARK_PURPLE + "MultiplayerBasics Potions")) {
            e.setCancelled(true);
            switch (e.getSlot()) {
                case 0:
                    for (Player all : Bukkit.getServer().getOnlinePlayers()) {
                        all.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 1, 1));
                        all.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&c You've been given Healing II!"));
                    }
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&c You've given everyone Healing II!"));
                    break;
                case 2:
                    for (Player all : Bukkit.getServer().getOnlinePlayers()) {
                        all.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 20*60, 1));
                        all.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&4 You've been given Strength II for 60 seconds!"));
                    }
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&4 You've given everyone Strength II for 60 seconds!"));
                    break;
                case 4:
                    for (Player all : Bukkit.getServer().getOnlinePlayers()) {
                        all.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20*60, 1));
                        all.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&b You've been given Speed II for 60 seconds!"));
                    }
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&b You've given everyone Speed II for 60 seconds!"));
                    break;
                case 6:
                    for (Player all : Bukkit.getServer().getOnlinePlayers()) {
                        all.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20*60, 1));
                        all.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&a You've been given Jump Boost II for 60 seconds!"));
                    }
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&a You've given everyone Jump Boost II for 60 seconds!"));
                    break;
                case 8:
                    for (Player all : Bukkit.getServer().getOnlinePlayers()) {
                        all.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20*60, 1));
                        all.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&d You've been given Regeneration II for 60 seconds!"));
                    }
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&d You've given everyone Regeneration II for 60 seconds!"));
                    break;
                case 10:
                    for (Player all : Bukkit.getServer().getOnlinePlayers()) {
                        all.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20*60, 1));
                        all.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&3 You've been given Slowness II for 60 seconds!"));
                    }
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&3 You've given everyone Slowness II for 60 seconds!"));
                    break;
                case 12:
                    for (Player all : Bukkit.getServer().getOnlinePlayers()) {
                        all.addPotionEffect(new PotionEffect(PotionEffectType.HARM, 1, 1));
                        all.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&5 You've been given Harming II!"));
                    }
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&5 You've given everyone Harming II!"));
                    break;
                case 14:
                    for (Player all : Bukkit.getServer().getOnlinePlayers()) {
                        all.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 20*60, 1));
                        all.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&5 You've been given Poison II!"));
                    }
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&5 You've given everyone Poison II!"));
                    break;
                case 16:
                    for (Player all : Bukkit.getServer().getOnlinePlayers()) {
                        all.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 20*60, 1));
                        all.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&8 You've been given Weakness II!"));
                    }
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + "&8 You've given everyone Weakness II!"));
                    break;
                case 30:
                    p.closeInventory();
                    p.performCommand("mpb");
                    break;
                case 31:
                    p.closeInventory();
                    break;
            }
        }
    }
}
