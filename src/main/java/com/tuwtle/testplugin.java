package com.tuwtle;

import com.tuwtle.TorchHandler.TorchHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class testplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Hello World");

        new TorchHandler(this);
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Shutting Down. . .");
    }
}
