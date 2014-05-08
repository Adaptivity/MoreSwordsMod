package net.darkhax.moreswords.items;

import net.darkhax.moreswords.MoreSwords;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemCoreSword extends ItemSword {
	
	public ItemStack repair;
	private final String type;

	/**
	 * 
	 * @param id : The item value for the sword.
	 * @param material : The enum material for the sword.
	 * @param type : String used to tell the swords apart.
	 * 
	 */
	public ItemCoreSword(ToolMaterial material, String type) {
		
		super(material);
		this.type = type;
		this.setCreativeTab(MoreSwords.tabSwords);
	}

	public void registerIcons(IIconRegister iconRegister) {
		
		this.itemIcon = iconRegister.registerIcon("moreswords:" + this.type);
	}
}