package com.tuwtle.TorchHandler;

import com.tuwtle.testplugin;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class TorchHandler implements Listener {
    public TorchHandler (testplugin plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void TorchBomb (PlayerInteractEvent e){
        Player p = e.getPlayer();
        Action action = e.getAction();
        ItemStack item = e.getItem();

        if (!item.getType().equals(Material.TORCH))
            return;

        if (action == Action.LEFT_CLICK_BLOCK) {
            World w = p.getWorld();
            w.createExplosion(e.getClickedBlock().getLocation(),100,false);
            Location explosionLoc = p.getLocation().clone().add(p.getDirection().multiply(range));
        }
    }
}