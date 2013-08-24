package darkhax.moreswords.core.events;

import darkhax.moreswords.core.handlers.EffectManager;
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

public class DamageHandler {

	@ForgeSubscribe
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
			}
		}
	}
}