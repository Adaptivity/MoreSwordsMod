package darkhax.moreswordsmod.items;

import java.util.List;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import darkhax.moreswordsmod.MoreSwordsMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemBlazeSword extends ItemSword{
	protected int damage;
	protected int enchantability;
	
	public ItemBlazeSword(int i){
		super(i, EnumToolMaterial.IRON);
		setMaxDamage(MoreSwordsMod.data.blazeSwordDurability);
		damage = MoreSwordsMod.data.blazeSwordDamage;
		enchantability = 14;
		setItemName("blazeSword");
		setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);
	}
	
	@Override
	public String getTextureFile(){
		return MoreSwordsMod.pathing.TEXTURE_SWORDS;
	}
	
	@Override
	public int getDamageVsEntity(Entity entity){
		return damage;
	}
	
	@Override
	public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1){
		itemstack.damageItem(1, entityliving1);
		entityliving.setFire(4);			
		return true;
	}
	
	@Override
	public int getItemEnchantability(){
		return enchantability;
	}

	public Item setIconIndex(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}


