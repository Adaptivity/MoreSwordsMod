package darkhax.moreswords.core.handlers;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import darkhax.moreswords.core.util.Reference;
import darkhax.moreswords.enchantment.EnchantmentList;

public class EffectManager {
	
	public static void ascension(EntityLiving player, ItemStack item) {
		double Y = EnchantmentHelper.getEnchantmentLevel(EnchantmentList.ascension.effectId, item) * 1;
		player.setVelocity(0, Y, 0);
	}
	
	public static void greed(EntityLiving player, ItemStack item) {
		int xp = EnchantmentHelper.getEnchantmentLevel(EnchantmentList.greed.effectId, item) *15;
		player.experienceValue = xp;
	}
	
	public static void glaciate(EntityLiving player, ItemStack item) {
		int duration = EnchantmentHelper.getEnchantmentLevel(EnchantmentList.iceaura.effectId, item) * 160;
		player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), duration, 1));
	}
	
	public static void decay(EntityLiving player, ItemStack item) {
		int duration = EnchantmentHelper.getEnchantmentLevel(EnchantmentList.decay.effectId, item) * 80;
		player.addPotionEffect(new PotionEffect(Potion.wither.getId(), duration, 1));
	}
	
	public static void blaze(EntityLiving player, ItemStack item) {
		int damage = EnchantmentHelper.getEnchantmentLevel(EnchantmentList.blaze.effectId, item) * 2;
		player.setFire(damage);
	}
	
	public static void feast(EntityLiving player, ItemStack item) {
		int randRepair = Reference.random.nextIntII(0, 5);
		int repair = EnchantmentHelper.getEnchantmentLevel(EnchantmentList.feast.effectId, item) * randRepair;
	}
}
