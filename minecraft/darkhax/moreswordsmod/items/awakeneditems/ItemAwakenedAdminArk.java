package darkhax.moreswordsmod.items.awakeneditems;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import darkhax.moreswordsmod.MoreSwordsMod;

public class ItemAwakenedAdminArk extends ItemSword
{
	protected int damage;
	protected int enchantability;

	public ItemAwakenedAdminArk(int par1){
		super(par1, EnumToolMaterial.IRON);
		setMaxDamage(MoreSwordsMod.data.awakenedAdminArkDurability);
		damage = MoreSwordsMod.data.awakenedAdminArkDamage; 
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
	public int getItemEnchantability()
	{
		return enchantability;
	}
	public ItemStack onItemRightClick(ItemStack itemstack,World world,EntityPlayer entityplayer)
	{
		itemstack.damageItem(0, entityplayer);
		((EntityLiving) entityplayer).addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 20000, 10));

		return itemstack;
	}

	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving,EntityLiving par3EntityLiving)
	{
		par1ItemStack.damageItem(1, par3EntityLiving);
		return true;
	}
	public void onUpdate( ItemStack itemstack, World world, Entity entity,int i,  boolean flag)
	{
		final EntityClientPlayerMP Player = Minecraft.getMinecraft().thePlayer;
		if(Player.getCurrentEquippedItem() != null && Player.getCurrentEquippedItem().itemID == MoreSwordsMod.items.awakenedAdminArk.shiftedIndex)
		{

		}
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack itemstack)
	{
		return true;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack,EntityPlayer par2EntityPlayer, List par3List, boolean par4){
		par3List.add("\u00a74S\u00a76t\u00a7Ee\u00a72a\u00a71l\u00a75t\u00a7dh");
	}
}


