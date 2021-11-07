package me.icynnac.multiplayerbasics.GUIs;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

public class potionallUI {
    public Inventory getPotionAllInventory() {
        Inventory potionall = Bukkit.createInventory(null, 36, ChatColor.DARK_PURPLE + "MultiplayerBasics Potions");

        ItemStack healing = new ItemStack(Material.POTION);
        ItemStack strength = new ItemStack(Material.POTION);
        ItemStack speed = new ItemStack(Material.POTION);
        ItemStack jump = new ItemStack(Material.POTION);
        ItemStack regen = new ItemStack(Material.POTION);
        ItemStack slow = new ItemStack(Material.POTION);
        ItemStack harming = new ItemStack(Material.POTION);
        ItemStack poison = new ItemStack(Material.POTION);
        ItemStack weakness = new ItemStack(Material.POTION);
        ItemStack back = new ItemStack(Material.PAPER);
        ItemStack exit = new ItemStack(Material.BARRIER);
        ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 15);

        PotionMeta healm = (PotionMeta) healing.getItemMeta();
        healm.setBasePotionData(new PotionData(PotionType.INSTANT_HEAL));
        healm.setDisplayName(ChatColor.RED + "Healing II");
        healing.setItemMeta(healm);

        PotionMeta strm = (PotionMeta) strength.getItemMeta();
        strm.setBasePotionData(new PotionData(PotionType.STRENGTH));
        strm.setDisplayName(ChatColor.DARK_RED + "Strength II");
        strength.setItemMeta(strm);

        PotionMeta spdm = (PotionMeta) speed.getItemMeta();
        spdm.setBasePotionData(new PotionData(PotionType.SPEED));
        spdm.setDisplayName(ChatColor.AQUA + "Speed II");
        speed.setItemMeta(spdm);

        PotionMeta jumpm = (PotionMeta) jump.getItemMeta();
        jumpm.setBasePotionData(new PotionData(PotionType.JUMP));
        jumpm.setDisplayName(ChatColor.GREEN + "Jump Boost II");
        jump.setItemMeta(jumpm);

        PotionMeta regenm = (PotionMeta) regen.getItemMeta();
        regenm.setBasePotionData(new PotionData(PotionType.REGEN));
        regenm.setDisplayName(ChatColor.LIGHT_PURPLE + "Regeneration II");
        regen.setItemMeta(regenm);

        PotionMeta slowm = (PotionMeta) slow.getItemMeta();
        slowm.setBasePotionData(new PotionData(PotionType.SLOWNESS));
        slowm.setDisplayName(ChatColor.DARK_AQUA + "Slowness II");
        slow.setItemMeta(slowm);

        PotionMeta harmm = (PotionMeta) harming.getItemMeta();
        harmm.setBasePotionData(new PotionData(PotionType.INSTANT_DAMAGE));
        harmm.setDisplayName(ChatColor.DARK_PURPLE + "Harming II");
        harming.setItemMeta(harmm);

        PotionMeta poism = (PotionMeta) poison.getItemMeta();
        poism.setBasePotionData(new PotionData(PotionType.POISON));
        poism.setDisplayName(ChatColor.DARK_GREEN + "Poison II");
        poison.setItemMeta(poism);

        PotionMeta weakm = (PotionMeta) weakness.getItemMeta();
        weakm.setBasePotionData(new PotionData(PotionType.WEAKNESS));
        weakm.setDisplayName(ChatColor.GRAY + "Weakness II");
        weakness.setItemMeta(weakm);

        ItemMeta glassM = glass.getItemMeta();
        glassM.setDisplayName(" ");
        glass.setItemMeta(glassM);

        ItemMeta backM = back.getItemMeta();
        backM.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Back");
        back.setItemMeta(backM);

        ItemMeta exitM = exit.getItemMeta();
        exitM.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Exit");
        exit.setItemMeta(exitM);

        potionall.setItem(0, healing);
        potionall.setItem(2, strength);
        potionall.setItem(4, speed);
        potionall.setItem(6, jump);
        potionall.setItem(8, regen);
        potionall.setItem(10, slow);
        potionall.setItem(12, harming);
        potionall.setItem(14, poison);
        potionall.setItem(16, weakness);

        potionall.setItem(1, glass);
        potionall.setItem(3, glass);
        potionall.setItem(5, glass);
        potionall.setItem(7, glass);
        potionall.setItem(9, glass);
        potionall.setItem(11, glass);
        potionall.setItem(13, glass);
        potionall.setItem(15, glass);
        potionall.setItem(17, glass);
        potionall.setItem(18, glass);
        potionall.setItem(19, glass);
        potionall.setItem(20, glass);
        potionall.setItem(21, glass);
        potionall.setItem(22, glass);
        potionall.setItem(23, glass);
        potionall.setItem(24, glass);
        potionall.setItem(25, glass);
        potionall.setItem(26, glass);
        potionall.setItem(27, glass);
        potionall.setItem(28, glass);
        potionall.setItem(29, glass);
        potionall.setItem(30, back);
        potionall.setItem(31, exit);
        potionall.setItem(32, glass);
        potionall.setItem(33, glass);
        potionall.setItem(34, glass);
        potionall.setItem(35, glass);
        return potionall;
    }
}
