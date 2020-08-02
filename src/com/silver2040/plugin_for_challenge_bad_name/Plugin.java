package com.silver2040.plugin_for_challenge_bad_name;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Plugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("This is dumb name. Prepare for very annoying minecraft.");
    }

    @Override
    public void onDisable() {
        getLogger().info("Its over now. Yay");
    }
}
