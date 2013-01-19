package darkhax.moreswordsmod.items;

import darkhax.moreswordsmod.MoreSwordsMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class MSMSword extends ItemSword{
	public int damage;
	public int enchantability;
	
	public MSMSword(int i){
		super(i, EnumToolMaterial.IRON);
		setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);
		setEnchantability(14);
	}
	
	public MSMSword(int i, EnumToolMaterial material){
		super(i, material);
	}
	
	public void setEnchantability(int i){
		this.enchantability = i;
	}
	
	public void setDamage(int i){
		this.damage = i;
	}
	
	@Override
	public String getTextureFile(){
		return MoreSwordsMod.proxy.getTexturePathFromIndex("SWORDS");
	}
	
	@Override
	public int getDamageVsEntity(Entity entity){
		return this.damage;
	}
	
	@Override
	public int getItemEnchantability(){
		return this.enchantability;
	}
}
