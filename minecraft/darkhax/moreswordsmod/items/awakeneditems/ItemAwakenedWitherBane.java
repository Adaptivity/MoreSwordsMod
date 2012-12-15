package darkhax.moreswordsmod.items.awakeneditems;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import darkhax.moreswordsmod.MoreSwordsMod;


public class ItemAwakenedWitherBane extends ItemSword
{
	protected int damage;
	protected int enchantability;

	public ItemAwakenedWitherBane(int par1){
		super(par1, EnumToolMaterial.IRON);
		setMaxDamage(MoreSwordsMod.data.awakenedWitherBaneDurability);
		damage = MoreSwordsMod.data.awakenedWitherBaneDamage; 
		enchantability = 14;
	}
	public int getDamageVsEntity(Entity par1Entity)
	{
		return damage;
	}
	public int getItemEnchantability()
	{
		return enchantability;
	}
	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
	{
		par1ItemStack.damageItem(1, par3EntityLiving);
		((EntityLiving)par2EntityLiving).addPotionEffect(new PotionEffect(Potion.wither.id, 300, 0));
		return true;
	}
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack itemstack)
	{
		return true;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add("Decay \u00a70I");
	}

	public String getTextureFile()
	{
		return "/darkhax/msm/swords.png";
	}
}
