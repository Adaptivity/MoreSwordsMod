package darkhax.moreswordsmod.awakenditems;

import java.util.List;

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
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import darkhax.moreswordsmod.MoreSwordsMod;
import darkhax.moreswordsmod.common.MSMDataProxy;

public class ItemAwakenedBloodSword extends ItemSword
{
protected int damage;
protected int enchantability;

public ItemAwakenedBloodSword(int par1){
super(par1, EnumToolMaterial.IRON);
setMaxDamage(MoreSwordsMod.data.AwakenedBloodSwordDURABILITY);
damage = MoreSwordsMod.data.AwakenedBloodSwordDAMAGE; 
enchantability = 7;
}
public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
{
        par1ItemStack.damageItem(MSMDataProxy.BloodRepair, par3EntityLiving);
        return true;
}
public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
{
	 itemstack.damageItem(MSMDataProxy.BloodDebuff, entityplayer);
	((EntityLiving) entityplayer).addPotionEffect(new PotionEffect(Potion.heal.getId(), MSMDataProxy.BloodHealthDuration, MSMDataProxy.BloodHealthStrength));
	((EntityLiving) entityplayer).addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), MSMDataProxy.BloodSpeedDuration, MSMDataProxy.BloodSpeedStrength));
	((EntityLiving) entityplayer).addPotionEffect(new PotionEffect(Potion.resistance.getId(), MSMDataProxy.BloodRegenDuration, MSMDataProxy.BloodRegenStrength));
	
	return itemstack;
}

public String getTextureFile()
{
 return "/darkhax/moreswordsmod/textures/swords.png";
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
