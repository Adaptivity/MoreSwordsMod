package net.darkhax.moreswords;

import java.util.List;

import net.darkhax.moreswords.items.ItemManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabSwords extends CreativeTabs {

	CreativeTabSwords(int id, String name) {

		super(id, name);
	}

	@SideOnly(Side.CLIENT)
	public void displayAllReleventItems(List items) {

		super.displayAllReleventItems(items);
		this.addEnchantmentBooksToList(items, new EnumEnchantmentType[] { MoreSwords.enumSwords });
	}

	@Override
	public Item getTabIconItem() {

		return ItemManager.adminArk;
	}
}