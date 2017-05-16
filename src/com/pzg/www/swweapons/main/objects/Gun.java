package com.pzg.www.swweapons.main.objects;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.pzg.www.api.config.Config;
import com.pzg.www.swweapons.main.CreateItem;

public class Gun {
	
	protected Config config;
	
	protected int damage;
	
	protected String name;
	protected List<String> lore;
	protected Material itemMaterial;
	protected int damageValue;
	
	protected ItemStack item;
	
	protected int ammoAmmount;
	
	protected String ammoName;
	protected List<String> ammoLore;
	protected Material ammoMaterial;
	protected int ammoDamageValue;
	
	protected ItemStack ammo;
	
	public Gun(Config config) {
		int damage = config.getConfig().getInt("Gun.Damage");
		this.damage = damage;
		
		String name = config.getConfig().getString("Gun.Name");
		this.name = name;
		
		String lore1 = config.getConfig().getString("Gun.Lore.1");
		String lore2 = config.getConfig().getString("Gun.Lore.2");
		String lore3 = config.getConfig().getString("Gun.Lore.3");
		String lore4 = config.getConfig().getString("Gun.Lore.4");
		List<String> lore = new ArrayList<String>();
		lore.add(lore1);
		lore.add(lore2);
		lore.add(lore3);
		lore.add(lore4);
		this.lore = lore;
		
		Material itemMaterial = (Material) config.getConfig().get("Gun.Material");
		this.itemMaterial = itemMaterial;
		
		int damageValue = config.getConfig().getInt("Gun.Material.DamageValue");
		this.damageValue = damageValue;
		
		ItemStack item = CreateItem.createItem(itemMaterial, damageValue, name, lore);
		this.item = item;
		
		int ammoAmmount = config.getConfig().getInt("Gun.Ammo.PerClip");
		this.ammoAmmount = ammoAmmount;
		
		String ammoName = config.getConfig().getString("Gun.Ammo.Name");
		this.ammoName = ammoName;
		
		String ammoLore1 = config.getConfig().getString("Gun.Ammo.Lore.1");
		String ammoLore2 = config.getConfig().getString("Gun.Ammo.Lore.2");
		String ammoLore3 = config.getConfig().getString("Gun.Ammo.Lore.3");
		String ammoLore4 = config.getConfig().getString("Gun.Ammo.Lore.4");
		List<String> ammoLore = new ArrayList<String>();
		ammoLore.add(ammoLore1);
		ammoLore.add(ammoLore2);
		ammoLore.add(ammoLore3);
		ammoLore.add(ammoLore4);
		this.ammoLore = ammoLore;
		
		Material ammoMaterial = (Material) config.getConfig().get("Gun.Ammo.Material");;
		this.ammoMaterial = ammoMaterial;
		
		int ammoDamageValue = config.getConfig().getInt("Gun.Ammo.DamageValue");
		this.ammoDamageValue = ammoDamageValue;
		
		ItemStack ammo = CreateItem.createItem(ammoMaterial, ammoDamageValue, ammoName, ammoLore);
		this.item = ammo;
	}
	
	public ItemStack getWeapon() {
		return item;
	}
	
	public ItemStack getAmmo() {
		return ammo;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public int getReloadAmmonut() {
		return ammoAmmount;
	}
}