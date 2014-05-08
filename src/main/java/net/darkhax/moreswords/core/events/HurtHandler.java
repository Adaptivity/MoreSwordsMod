package net.darkhax.moreswords.core.events;

import net.darkhax.moreswords.core.handlers.EffectManager;
import net.darkhax.moreswords.enchantment.EnchantmentList;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class HurtHandler {

	@SubscribeEvent
	public void getHurtEvent(LivingHurtEvent event) {
		if (event.source.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.source.getEntity();
			ItemStack stack = player.getHeldItem();

			if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.bloodPool.effectId, stack) >= 1) {
				EffectManager.setBloodPool(player, stack, event.ammount);
			}
		}

		if (event.entityLiving instanceof EntityPlayer) {
			if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.bloodPool.effectId, event.entityLiving.getHeldItem()) >= 1) {
				if (event.entityLiving.getHealth() - event.ammount < 1) {
					EntityPlayer player = (EntityPlayer) event.entityLiving;
					EffectManager.getBloodPool(player, event.entityLiving.getHeldItem());
				}
			}
		}
	}
}