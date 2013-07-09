package darkhax.moreswords.core.events;

import darkhax.moreswords.enchantment.EnchantmentList;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.AttackEntityEvent;

public class DamageHandler
{
  public static double rand;

  @ForgeSubscribe
  public void DamageCheck(AttackEntityEvent event)
  {
	  if (event.target instanceof EntityLiving){
		  EntityPlayer player = event.entityPlayer;
		  
		  if (event.target instanceof EntityLiving){
			  EntityLiving living = (EntityLiving) event.target;
			  
			  if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.ascension.effectId, player.getHeldItem()) > 0){
				  event.target.isAirBorne = true;
				  event.target.motionY = +EnchantmentHelper.getEnchantmentLevel(EnchantmentList.ascension.effectId, player.getHeldItem()) * 1.1D;
			  }
			  
			  if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.blaze.effectId, player.getHeldItem()) > 0){
				  event.target.setFire(EnchantmentHelper.getEnchantmentLevel(EnchantmentList.blaze.effectId, player.getHeldItem()));		  
			  }
			  
			  if (event.target instanceof EntityMob){
				  if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.blessed.effectId, player.getHeldItem()) > 0){
					  event.target.attackEntityFrom(DamageSource.generic, player.getHeldItem().getItemDamage()+ 999);
				  }
			  }
		  }
	  }
  }
}