package net.darkhax.moreswords.core.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.darkhax.moreswords.enchantment.EnchantmentList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentArrowFire;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

public class ToolTipHandler {

	@SubscribeEvent
	public void onDisplayTooltip(ItemTooltipEvent event) {

		if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.bloodPool.effectId, event.itemStack) > 0) {
			
			if (!event.itemStack.hasTagCompound()) {
				
				event.itemStack.setTagCompound(new NBTTagCompound());
				event.itemStack.stackTagCompound.setFloat("blood", 0f);
			}
			
			event.toolTip.add("Current Blood: " + event.itemStack.stackTagCompound.getFloat("blood"));
		}
	}
}