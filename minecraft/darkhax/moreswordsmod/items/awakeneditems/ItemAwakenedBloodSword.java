package darkhax.moreswordsmod.items.awakeneditems;

import java.util.List;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import darkhax.moreswordsmod.MoreSwordsMod;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemAwakenedBloodSword extends ItemSword
{
	protected int damage;
	protected int enchantability;

	public ItemAwakenedBloodSword(int par1){
		super(par1, EnumToolMaterial.IRON);
		setMaxDamage(MoreSwordsMod.data.awakenedBloodSwordDurability);
		damage = MoreSwordsMod.data.awakenedBloodSwordDamage;
		enchantability = 7;
	}
	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
	{
		par1ItemStack.damageItem(-10, par3EntityLiving);
		return true;
	}
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		itemstack.damageItem(500, entityplayer);
		((EntityLiving) entityplayer).addPotionEffect(new PotionEffect(Potion.heal.getId(), 5, 0));
		((EntityLiving) entityplayer).addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 200, 0));
		((EntityLiving) entityplayer).addPotionEffect(new PotionEffect(Potion.resistance.getId(), 200, 0));

		return itemstack;
	}
	@SideOnly(Side.CLIENT)
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
	{
		EntityPlayer Player = Minecraft.getMinecraft().thePlayer; 
		if(Player.getCurrentEquippedItem() != null && Player.getCurrentEquippedItem().itemID == MoreSwordsMod.items.awakenedBloodSword.shiftedIndex)
		{

		}
	}
	public String getTextureFile()
	{
		return "/darkhax/msm/swords.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack itemstack)
	{
		return true;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add("Vampirism \u00a74I");
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
