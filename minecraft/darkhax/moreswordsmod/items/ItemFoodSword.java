package darkhax.moreswordsmod.items;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import darkhax.moreswordsmod.MoreSwordsMod;
import darkhax.moreswordsmod.common.MSMDataProxy;



public class ItemFoodSword extends MSMSword{
	public ItemFoodSword(int i){
		super(i);
		setMaxDamage(MoreSwordsMod.data.FoodSwordDURABILITY);
		setDamage(MoreSwordsMod.data.FoodSwordDAMAGE);
		setItemName("EyeEndSword");
	}
	
	@Override
	public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() + MSMDataProxy.FoodStatDebuff);
		par3EntityPlayer.getFoodStats().addStats(MSMDataProxy.FoodStatFood,MSMDataProxy.FoodStatSaturation);
		par2World.playSoundAtEntity(par3EntityPlayer, "random.burp", 0.5F, par2World.rand.nextFloat() * 0.1F + 0.9F);
		return par1ItemStack;
	}

	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.eat;
	}

	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{
	    return 32;
	}

}


