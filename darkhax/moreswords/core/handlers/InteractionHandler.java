package darkhax.moreswords.core.handlers;

import darkhax.moreswords.core.util.Config;
import darkhax.moreswords.core.util.RayTraceHelper;
import darkhax.moreswords.enchantment.EnchantmentList;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;

public class InteractionHandler {
	
  @ForgeSubscribe
  public void RightClickEvent(PlayerInteractEvent event) {
    if (event.useItem != null) {
      if ((event.action.equals(PlayerInteractEvent.Action.RIGHT_CLICK_AIR) | event.action.equals(PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK))) {
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.stealth.effectId, event.entityPlayer.getHeldItem()) == 1) {
          event.entityPlayer.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 1200, 0));
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.stealth.effectId, event.entityPlayer.getHeldItem()) == 2) {
          event.entityPlayer.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 6000, 0));
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.stealth.effectId, event.entityPlayer.getHeldItem()) == 3) {
          event.entityPlayer.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 36000, 0));
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.vitality.effectId, event.entityPlayer.getHeldItem()) == 1) {
          event.entityPlayer.getHeldItem().damageItem(250, event.entityPlayer);
          event.entityPlayer.addPotionEffect(new PotionEffect(Potion.heal.getId(), 20, 0));
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.vitality.effectId, event.entityPlayer.getHeldItem()) == 2) {
          event.entityPlayer.getHeldItem().damageItem(250, event.entityPlayer);
          event.entityPlayer.addPotionEffect(new PotionEffect(Potion.heal.getId(), 20, 0));
          event.entityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 1200, 0));
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.vitality.effectId, event.entityPlayer.getHeldItem()) == 3) {
          event.entityPlayer.getHeldItem().damageItem(250, event.entityPlayer);
          event.entityPlayer.addPotionEffect(new PotionEffect(Potion.heal.getId(), 40, 0));
          event.entityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 1200, 0));
          event.entityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 2400, 0));
        }

        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.enderpulse.effectId, event.entityPlayer.getHeldItem()) == 1) {
          MovingObjectPosition position = RayTraceHelper.rayTrace(event.entityPlayer.worldObj, event.entityPlayer, 15);
          if ((position != null) && (position.typeOfHit == EnumMovingObjectType.TILE)) {
            int x = position.blockX;
            int y = position.blockY;
            int z = position.blockZ;

            switch (position.sideHit)
            {
            case 0:
              y--;
              break;
            case 1:
              y++;
              break;
            case 2:
              z--;
              break;
            case 3:
              z++;
              break;
            case 4:
              x--;
              break;
            case 5:
              x++;
              break;
            default:
              y++;
            }

            event.entityPlayer.getHeldItem().damageItem(50, event.entityLiving);
            event.entityPlayer.setPositionAndUpdate(x, y, z);
            event.entityPlayer.attackEntityFrom(DamageSource.fall, 2);
          }
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.enderpulse.effectId, event.entityPlayer.getHeldItem()) == 2) {
          MovingObjectPosition position = RayTraceHelper.rayTrace(event.entityPlayer.worldObj, event.entityPlayer, 30);
          if ((position != null) && (position.typeOfHit == EnumMovingObjectType.TILE)) {
            int x = position.blockX;
            int y = position.blockY;
            int z = position.blockZ;

            switch (position.sideHit) {
            case 0:
              y--;
              break;
            case 1:
              y++;
              break;
            case 2:
              z--;
              break;
            case 3:
              z++;
              break;
            case 4:
              x--;
              break;
            case 5:
              x++;
              break;
            default:
              y++;
            }

            event.entityPlayer.getHeldItem().damageItem(25, event.entityLiving);
            event.entityPlayer.setPositionAndUpdate(x, y, z);
            event.entityPlayer.attackEntityFrom(DamageSource.fall, 1);
          }
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.enderpulse.effectId, event.entityPlayer.getHeldItem()) == 3) {
          MovingObjectPosition position = RayTraceHelper.rayTrace(event.entityPlayer.worldObj, event.entityPlayer, 45);
          if ((position != null) && (position.typeOfHit == EnumMovingObjectType.TILE)) {
            int x = position.blockX;
            int y = position.blockY;
            int z = position.blockZ;

            switch (position.sideHit) {
            case 0:
              y--;
              break;
            case 1:
              y++;
              break;
            case 2:
              z--;
              break;
            case 3:
              z++;
              break;
            case 4:
              x--;
              break;
            case 5:
              x++;
              break;
            default:
              y++;
            }

            event.entityPlayer.getHeldItem().damageItem(10, event.entityLiving);
            event.entityPlayer.setPositionAndUpdate(x, y, z);
            event.entityPlayer.attackEntityFrom(DamageSource.fall, 0);
          }
        }
      }
      
      if (Config.expedite == true) {
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.expedite.effectId, event.entityPlayer.getHeldItem()) == 3) {
          event.entityPlayer.worldObj.setWorldTime(event.entityPlayer.worldObj.getWorldTime() + 50);
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.expedite.effectId, event.entityPlayer.getHeldItem()) == 3) {
          event.entityPlayer.worldObj.setWorldTime(event.entityPlayer.worldObj.getWorldTime() + 100);
        }
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.expedite.effectId, event.entityPlayer.getHeldItem()) == 3)
          event.entityPlayer.worldObj.setWorldTime(event.entityPlayer.worldObj.getWorldTime() + 150);
      }
    }
  }
}