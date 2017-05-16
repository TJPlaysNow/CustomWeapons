package com.pzg.www.swweapons.main;

import org.bukkit.Material;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.pzg.www.api.config.Config;

public class PluginMain extends JavaPlugin {
	
	public static Plugin plugin;
	
	public static Config config;
	
	boolean created = true;
	
	@SuppressWarnings("deprecation")
	@Override
	public void onEnable() {
		plugin = this;
		
		config = new Config("plugins/weapons", "config.yml", "config.yml", plugin);
		config.saveConfig();
		
		Config gun = new Config("plugins/weapons/guns", "gun.yml", plugin);
		gun.getConfig().set("Gun.Damage", 100);
		gun.getConfig().set("Gun.Name", "gun");
		gun.getConfig().set("Gun.Lore.1", "Lore 1");
		gun.getConfig().set("Gun.Lore.2", "Lore 2");
		gun.getConfig().set("Gun.Lore.3", "Lore 3");
		gun.getConfig().set("Gun.Lore.4", "Lore 4");
		gun.getConfig().set("Gun.Material", Material.IRON_HOE);
		gun.getConfig().set("Gun.Material.DamageValue", 1);
		gun.getConfig().set("Gun.Ammo.PerClip", 30);
		gun.getConfig().set("Gun.Ammo.Name", "ammo");
		gun.getConfig().set("Gun.Ammo.Lore.1", "Lore 1");
		gun.getConfig().set("Gun.Ammo.Lore.2", "Lore 2");
		gun.getConfig().set("Gun.Ammo.Lore.3", "Lore 3");
		gun.getConfig().set("Gun.Ammo.Lore.4", "Lore 4");
		gun.getConfig().set("Gun.Ammo.Material", Material.ARROW.getId());
		gun.getConfig().set("Gun.Ammo.DamageValue", 0);
		gun.saveConfig();
	}
	
	@Override
	public void onDisable() {
		
	}
}