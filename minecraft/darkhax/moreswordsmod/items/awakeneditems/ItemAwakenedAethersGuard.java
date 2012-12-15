package darkhax.moreswordsmod.items.awakeneditems;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import darkhax.moreswordsmod.MoreSwordsMod;


public class ItemAwakenedAethersGuard extends ItemSword{
	protected int damage;
	protected int enchantability;
	
	public ItemAwakenedAethersGuard(int i){
		super(i, EnumToolMaterial.IRON);
		setMaxDamage(MoreSwordsMod.data.awakenedAetherSwordDurability);
		damage = MoreSwordsMod.data.awakenedAetherSwordDamage;
		enchantability = 14;
		setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);
		setItemName("awakenedAethersGuard");
	}
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLiving living, EntityLiving entity){
		stack.damageItem(1, living);
		living.motionY += 1;
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack){
		return true;
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
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){
		par3List.add("Ascension I");
	}
}


