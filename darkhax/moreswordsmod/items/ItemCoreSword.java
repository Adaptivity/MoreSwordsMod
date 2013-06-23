package darkhax.moreswordsmod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemCoreSword extends ItemSword
{
  public int damage;
  public int enchantability;
  public ItemStack repair;

  /**
   * 
   * @param id: Item ID.
   * @param material: EnumToolMaterial
   * @param damage: Damage vs Entity 
   * @param enchantability: Enchantability level
   * @param durability: Tool usage
   * @param repair: Block or Item used to repair the tool. 
   * 
   */
  public ItemCoreSword(int id, EnumToolMaterial material, int damage, int enchantability, int durability, ItemStack repair)
  {
    super(id, EnumToolMaterial.IRON);
    setCreativeTab(CreativeTabs.tabCombat);
	setDamage(damage);
    setEnchantability(enchantability);
    setRepairable(repair);
	setMaxDamage(durability);
  }
  
  public void setDamage(int i) {
    this.damage = i;
  }

  public void setEnchantability(int i) {
    this.enchantability = i;
  }
  
  public ItemStack setRepairable(ItemStack par1ItemStack){
	  return this.repair = par1ItemStack;
  }

  public int getDamageVsEntity(Entity entity) {
    return this.damage;
  }

  public int getItemEnchantability() {
    return this.enchantability;
  }
  
  public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
    return this.repair.itemID == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
  }
  
}