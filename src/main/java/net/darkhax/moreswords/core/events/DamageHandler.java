package net.darkhax.moreswords.core.events;

import net.darkhax.moreswords.core.handlers.EffectManager;
import net.darkhax.moreswords.enchantment.EnchantmentList;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class DamageHandler {

	@SubscribeEvent
	public void DamageCheck(AttackEntityEvent event) {
		if ((event.target instanceof EntityLiving)) {
			EntityPlayer player = event.entityPlayer;
			EntityLiving living = (EntityLiving) event.target;

			if ((event.target instanceof EntityLiving)) {

				if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.ascension.effectId, player.getHeldItem()) >= 1) {
					EffectManager.ascension(living, player.getHeldItem());
				}

				if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.greed.effectId, player.getHeldItem()) >= 1) {
					EffectManager.greed(living, player.getHeldItem());
				}

				if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.iceaura.effectId, player.getHeldItem()) >= 1) {
					EffectManager.glaciate(living, player.getHeldItem());
				}

				if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.decay.effectId, player.getHeldItem()) >= 1) {
					EffectManager.decay(living, player.getHeldItem());
				}

				if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.blaze.effectId, player.getHeldItem()) >= 1) {
					EffectManager.blaze(living, player.getHeldItem());
				}

				if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.feast.effectId, player.getHeldItem()) >= 1) {
					EffectManager.feast(living, player.getHeldItem());
				}

				if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.blessed.effectId, player.getHeldItem()) >= 1) {
					EffectManager.blessed(living, player.getHeldItem());
				}
			}
		}
	}
}