package darkhax.moreswordsmod.items;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import darkhax.moreswordsmod.MoreSwordsMod;

public class ItemAqueousSword extends ItemSword{
	protected int damage;
	protected int enchantability;
	
	public ItemAqueousSword(int par1){
		super(par1, EnumToolMaterial.IRON);
		setMaxDamage(MoreSwordsMod.data.aqueousSwordDurability);
		damage = MoreSwordsMod.data.aqueousSwordDamage; 
		enchantability = 14;
		setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);
		setItemName("aqueousSword");
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
	public int getItemEnchantability(){
		return enchantability;
	}
}
