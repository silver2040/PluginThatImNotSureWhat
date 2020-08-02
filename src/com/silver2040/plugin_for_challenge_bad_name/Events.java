package com.silver2040.plugin_for_challenge_bad_name;

import net.minecraft.server.v1_16_R1.ItemFireworks;
import net.minecraft.server.v1_16_R1.Items;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class Events implements Listener {
    private int randNum;

    @EventHandler
    public void PlayerEat(PlayerItemConsumeEvent event){
        randNum = (int) (10 * Math.random());
        switch (randNum){
            case 1 :
                event.setCancelled(true);
                break;
            case 2 :
                event.getPlayer().setHealth(event.getPlayer().getHealth() - 2);
                break;
            case 3 :
                event.getPlayer().setLevel(0);
                event.getPlayer().setWalkSpeed(0.1F);
                break;
            case 4 :
                event.getPlayer().setWalkSpeed(0.2F);
                event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 200, 1));
                break;
            case 5 :
                event.getPlayer().sendMessage("You got Lucky. Yay.");
                event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 3));
                event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 200, 3));
                event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 3));
                break;
            case 6 :
                event.getPlayer().sendMessage("Uh Oh, look away");
                event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 3));
                event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 3));
                break;
            case 7 :
                event.setItem(new ItemStack(Material.DIAMOND));
                
        }
    }

}
