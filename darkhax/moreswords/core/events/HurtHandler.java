package darkhax.moreswords.core.events;

import java.util.List;

import cpw.mods.fml.client.FMLClientHandler;
import darkhax.moreswords.enchantment.EnchantmentList;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagFloat;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class HurtHandler {

	public static float storedBlood;

	@ForgeSubscribe
	public void getHurtEvent(LivingHurtEvent event) {
		if (event.source.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.source.getEntity();
			ItemStack stack = player.getHeldItem();
			if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.feast.effectId, stack) > 0) {
				stack.stackTagCompound.setFloat("blood", event.ammount / 8 + stack.stackTagCompound.getFloat("blood"));
				storedBlood = stack.stackTagCompound.getFloat("blood");
			}
		}
		
		if (event.entityLiving instanceof EntityPlayer) {
			if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.bloodPool.effectId,event.entityLiving.getHeldItem()) > 0) {
				if (event.entityLiving.func_110143_aJ() - event.ammount < 1) {
					ItemStack stack = event.entityLiving.getHeldItem();
					event.entityLiving.heal(storedBlood);
					stack.stackTagCompound.setFloat("blood", 0);
					storedBlood = stack.stackTagCompound.getFloat("blood");
				}
			}
		}
	}
}