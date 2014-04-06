package net.darkhax.moreswords.core.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.darkhax.moreswords.core.handlers.EffectManager;
import net.darkhax.moreswords.core.util.Config;
import net.darkhax.moreswords.core.util.RayTraceHelper;
import net.darkhax.moreswords.enchantment.EnchantmentList;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;

public class InteractionHandler {
	
  
	@SubscribeEvent 
	public void RightClickEvent(PlayerInteractEvent event) {   
		if (event.useItem != null) {     
			if ((event.action.equals(PlayerInteractEvent.Action.RIGHT_CLICK_AIR))) {
				
				EntityPlayer player = (EntityPlayer) event.entity;
				ItemStack stack = player.getHeldItem();
				if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.stealth.effectId, event.entityPlayer.getHeldItem()) >= 1){
					
					EffectManager.stealth(player, stack);
				}
				
				if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.vitality.effectId, event.entityPlayer.getHeldItem()) >= 1){
					
					EffectManager.vitality(player, stack);
				}
				
				if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.enderpulse.effectId, event.entityPlayer.getHeldItem()) >= 1){
					
					EffectManager.enderPulse(player, stack);
				}
				
				if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.expedite.effectId, event.entityPlayer.getHeldItem()) >= 1){
					
					EffectManager.expedite(player.worldObj, stack);
				}
			}   
		}
	}
}