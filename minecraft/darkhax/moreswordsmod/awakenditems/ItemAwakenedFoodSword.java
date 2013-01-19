package darkhax.moreswordsmod.awakenditems;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import darkhax.moreswordsmod.MoreSwordsMod;
import darkhax.moreswordsmod.common.MSMDataProxy;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class ItemAwakenedFoodSword extends ItemSword
{
protected int damage;
protected int enchantability;

public ItemAwakenedFoodSword(int par1){
super(par1, EnumToolMaterial.IRON);
setMaxDamage(MoreSwordsMod.data.AwakenedFoodSwordDURABILITY);
damage = MoreSwordsMod.data.AwakenedFoodSwordDAMAGE; 
enchantability = 14;
}

public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
{
        par1ItemStack.damageItem(1, par3EntityLiving);
        par2EntityLiving.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, MSMDataProxy.SugarDuration, MSMDataProxy.SugarStrength));
        return true;
}


@Override
public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
{
	par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() + MSMDataProxy.FoodStatDebuff);
	par3EntityPlayer.getFoodStats().addStats(MoreSwordsMod.data.FoodStatFood,MoreSwordsMod.data.FoodStatSaturation);
	par2World.playSoundAtEntity(par3EntityPlayer, "random.burp", 0.5F, par2World.rand.nextFloat() * 0.1F + 0.9F);
	return par1ItemStack;
}

@Override
public EnumAction getItemUseAction(ItemStack par1ItemStack)
{
	return EnumAction.eat;
}

@Override
public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
{
	((EntityLiving) par3EntityPlayer).addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), MSMDataProxy.SugarDuration, MSMDataProxy.StealthStrength));
	if (par3EntityPlayer.canEat(true))
	{
		par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
	}

	return par1ItemStack;
}

public int getMaxItemUseDuration(ItemStack par1ItemStack)
{
    return 32;
}

public String getTextureFile()
{
 return "/darkhax/moreswordsmod/textures/swords.png";
}
public int getDamageVsEntity(Entity par1Entity)
{
         return damage;
}
@SideOnly(Side.CLIENT)
public boolean hasEffect(ItemStack itemstack)
{
        return true;
}
@SideOnly(Side.CLIENT)
public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
{
	 par3List.add("Sweet Tooth I");
}
public int getItemEnchantability()
{
         return enchantability;
}
}



