package com.pzg.www.swweapons.main;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CreateItem {
	
	public static ItemStack createItem(Material material, String name, String loreOne, String loreTwo, String loreThree, String loreFour) {
		ItemStack item = new ItemStack(material);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(name);
		List<String> newLore = new ArrayList<String>();
		newLore.add(loreOne);
		newLore.add(loreTwo);
		newLore.add(loreThree);
		newLore.add(loreFour);
		itemMeta.setLore(newLore);
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack createItem(Material material, String name, String loreOne, String loreTwo, String loreThree) {
		ItemStack item = new ItemStack(material);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(name);
		List<String> newLore = new ArrayList<String>();
		newLore.add(loreOne);
		newLore.add(loreTwo);
		newLore.add(loreThree);
		itemMeta.setLore(newLore);
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack createItem(Material material, String name, String loreOne, String loreTwo) {
		ItemStack item = new ItemStack(material);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(name);
		List<String> newLore = new ArrayList<String>();
		newLore.add(loreOne);
		newLore.add(loreTwo);
		itemMeta.setLore(newLore);
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack createItem(Material material, String name, String loreOne) {
		ItemStack item = new ItemStack(material);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(name);
		List<String> newLore = new ArrayList<String>();
		newLore.add(loreOne);
		itemMeta.setLore(newLore);
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack createItem(Material material, String name, String[] lore) {
		ItemStack item = new ItemStack(material);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(name);
		List<String> newLore = new ArrayList<String>();
		newLore.add(lore[0]);
		newLore.add(lore[1]);
		newLore.add(lore[2]);
		newLore.add(lore[3]);
		itemMeta.setLore(newLore);
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack createItem(Material material, String name, List<String> lore) {
		ItemStack item = new ItemStack(material);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(name);
		itemMeta.setLore(lore);
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack createItem(Material material, String name) {
		ItemStack item = new ItemStack(material);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(name);
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack createItem(Material material) {
		ItemStack item = new ItemStack(material);
		return item;
	}
	
	public static ItemStack createItem(Material material, int damageValue) {
		ItemStack item = new ItemStack(Material.WOOD_HOE, 1, (short)1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setUnbreakable(true);
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack createItem(Material material, int damageValue, String name) {
		ItemStack item = new ItemStack(Material.WOOD_HOE, 1, (short)1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(name);
		itemMeta.setUnbreakable(true);
		item.setItemMeta(itemMeta);
		return item;
	}
	
	public static ItemStack createItem(Material material, int damageValue, String name, List<String> lore) {
		ItemStack item = new ItemStack(Material.WOOD_HOE, 1, (short)1);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(name);
		itemMeta.setLore(lore);
		itemMeta.setUnbreakable(true);
		item.setItemMeta(itemMeta);
		return item;
	}
}