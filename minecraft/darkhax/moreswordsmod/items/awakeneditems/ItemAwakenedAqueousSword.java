package darkhax.moreswordsmod.items.awakeneditems;

import java.util.List;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import darkhax.moreswordsmod.MoreSwordsMod;
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


public class ItemAwakenedAqueousSword extends ItemSword
{
	protected int damage;
	protected int enchantability;

	public ItemAwakenedAqueousSword(int par1){
		super(par1, EnumToolMaterial.IRON);
		setMaxDamage(MoreSwordsMod.data.awakenedAqueousSwordDurability);
		damage = MoreSwordsMod.data.awakenedAqueousSwordDamage; 
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


	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
	{
		par1ItemStack.damageItem(1, par3EntityLiving);
		par2EntityLiving.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 200, 1));
		return true;
	}
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
	{
		EntityClientPlayerMP Player = Minecraft.getMinecraft().thePlayer;
		if(Player.getCurrentEquippedItem() != null && Player.getCurrentEquippedItem().itemID == MoreSwordsMod.items.awakenedAqueousSword.shiftedIndex)
		{
			String curUser = Minecraft.getMinecraft().getIntegratedServer().getAllUsernames()[0];
			Minecraft.getMinecraft().getIntegratedServer().getConfigurationManager().getPlayerForUsername(curUser).setAir(300);
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
		par3List.add("Frozen Aura \u00a73I");
	}
}


