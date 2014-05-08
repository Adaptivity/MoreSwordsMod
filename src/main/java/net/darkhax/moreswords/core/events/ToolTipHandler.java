package net.darkhax.moreswords.core.events;

import net.darkhax.moreswords.enchantment.EnchantmentList;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

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