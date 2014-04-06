package net.darkhax.moreswords;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.List;

import net.darkhax.moreswords.items.ItemManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.Item;

public class CreativeTabSwords extends CreativeTabs {
	
    CreativeTabSwords(int id, String name) {
    	
        super(id, name);
    }

    @SuppressWarnings("rawtypes")
	@SideOnly(Side.CLIENT)
    public void displayAllReleventItems(List items) {
    	
        super.displayAllReleventItems(items);
        this.addEnchantmentBooksToList(items, new EnumEnchantmentType[] {MoreSwords.enumSwords});
    }

	@Override
	public Item getTabIconItem() {
		
		return ItemManager.adminArk;
	}
}