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
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.AttackEntityEvent;

public class DamageHandler
{
  public static double rand;

  @ForgeSubscribe
  public void DamageCheck(AttackEntityEvent event)
  {
    if ((event.target instanceof EntityLiving)) {
      EntityPlayer player = event.entityPlayer;
      EntityLiving living = (EntityLiving)event.target;
      rand = Math.random();

      if ((event.target instanceof EntityLiving)) {
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.ascension.effectId, player.getHeldItem()) == 1) {
          living.addVelocity(0.0, 1.0, 0.0);
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.ascension.effectId, player.getHeldItem()) == 2) {
          living.addVelocity(0.0, 1.5, 0.0);
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.ascension.effectId, player.getHeldItem()) == 3) {
          living.addVelocity(0.0, 2.0, 0.0);
        }

        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.greed.effectId, player.getHeldItem()) == 1) {
          living.experienceValue = 10;
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.greed.effectId, player.getHeldItem()) == 2) {
          living.experienceValue = 20;
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.greed.effectId, player.getHeldItem()) == 3) {
          living.experienceValue = 30;
        }

        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.iceaura.effectId, player.getHeldItem()) == 1) {
          living.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 160, 1));
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.iceaura.effectId, player.getHeldItem()) == 2) {
          living.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 320, 1));
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.iceaura.effectId, player.getHeldItem()) == 3) {
          living.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 640, 1));
        }

        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.decay.effectId, player.getHeldItem()) == 1) {
          living.addPotionEffect(new PotionEffect(Potion.wither.getId(), 40, 1));
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.decay.effectId, player.getHeldItem()) == 2) {
          living.addPotionEffect(new PotionEffect(Potion.wither.getId(), 80, 1));
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.decay.effectId, player.getHeldItem()) == 3) {
          living.addPotionEffect(new PotionEffect(Potion.wither.getId(), 160, 1));
        }

        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.blaze.effectId, player.getHeldItem()) == 1) {
          living.setFire(3);
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.blaze.effectId, player.getHeldItem()) == 2) {
          living.setFire(4);
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.blaze.effectId, player.getHeldItem()) == 3) {
          living.setFire(5);
        }

        if ((EnchantmentHelper.getEnchantmentLevel(EnchantmentList.feast.effectId, player.getHeldItem()) == 1) && 
          (rand < 0.1D)) {
          player.getHeldItem().damageItem(-10, living);
        }

        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.feast.effectId, player.getHeldItem()) == 2) {
          if (rand < 0.15D) {
            player.getHeldItem().damageItem(-15, living);
          }
          if ((EnchantmentHelper.getEnchantmentLevel(EnchantmentList.feast.effectId, player.getHeldItem()) == 3) && 
            (rand < 0.2D)) {
            player.getHeldItem().damageItem(-20, living);
          }
        }
      }
    }
  }
}