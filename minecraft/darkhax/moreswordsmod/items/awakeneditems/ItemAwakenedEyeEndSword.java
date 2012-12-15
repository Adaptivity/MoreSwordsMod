package darkhax.moreswordsmod.items.awakeneditems;

import java.util.List;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import darkhax.moreswordsmod.MoreSwordsMod;
import darkhax.moreswordsmod.Entity.EntityWarpPearl;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import darkhax.moreswordsmod.Entity.EntityWarpPearl;

public class ItemAwakenedEyeEndSword extends ItemSword
{
	protected int damage;
	protected int enchantability;

	public ItemAwakenedEyeEndSword(int par1){
		super(par1, EnumToolMaterial.IRON);
		setMaxDamage(MoreSwordsMod.data.awakenedEyeEndSwordDurability);
		damage = MoreSwordsMod.data.awakenedEyeEndSwordDamage;
		enchantability = 14;
	}
	public String getTextureFile()
	{
		return "/darkhax/msm/swords.png";
	}
	public int getDamageVsEntity(Entity par1Entity)
	{
		return damage;
	}
	public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1)
	{
		itemstack.damageItem(1, entityliving1);		
		return true;
	}
	public int getItemEnchantability()
	{
		return enchantability;
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (par3EntityPlayer.ridingEntity != null)
		{

			return par1ItemStack;
		}
		else
		{
			par2World.playSoundAtEntity(par3EntityPlayer, "portal.travel", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
			par1ItemStack.damageItem(100, par3EntityPlayer);

			if (!par2World.isRemote)
			{
				par2World.spawnEntityInWorld(new EntityWarpPearl(par2World, par3EntityPlayer));
			}

			return par1ItemStack;
		}
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack itemstack)
	{
		return true;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add("Ender Pulse \u00a7AI");
	}

}

