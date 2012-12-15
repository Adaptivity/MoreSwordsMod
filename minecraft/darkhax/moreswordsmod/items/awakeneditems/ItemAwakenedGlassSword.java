package darkhax.moreswordsmod.items.awakeneditems;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import darkhax.moreswordsmod.MoreSwordsMod;


public class ItemAwakenedGlassSword extends ItemSword
{
	protected int damage;
	protected int enchantability;

	public ItemAwakenedGlassSword(int par1){
		super(par1, EnumToolMaterial.IRON);
		setMaxDamage(MoreSwordsMod.data.awakenedGlassSwordDuability);
		damage = MoreSwordsMod.data.awakenedGlassSwordDamage; 
		enchantability = 14;
	}
	public boolean hasEffect(ItemStack itemstack)
	{
		return true;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add("No effect at this time");
	}
	public String getTextureFile()
	{
		return "/darkhax/msm/swords.png";
	}
	public int getDamageVsEntity(Entity par1Entity)
	{
		return damage;
	}
	public int getItemEnchantability()
	{
		return enchantability;
	}
}