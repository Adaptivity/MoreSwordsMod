package darkhax.moreswords.items;

import darkhax.moreswords.MoreSwords;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemCoreSword extends ItemSword
{
  public ItemStack repair;
  public final String type;

  /**
   * 
   * @param id: The item value for the sword.
   * @param material: The enum material for the sword. 
   * @param type: String used to tell the swords apart.
   * 
   */
  public ItemCoreSword(int id, EnumToolMaterial material, String type)
  {
    super(id, material);
	this.type = type;	
	this.setCreativeTab(MoreSwords.tabSwords);
  }
  
  public void registerIcons(IconRegister iconRegister){
	  this.itemIcon = iconRegister.registerIcon("moreswords:" + this.type);
  }
}