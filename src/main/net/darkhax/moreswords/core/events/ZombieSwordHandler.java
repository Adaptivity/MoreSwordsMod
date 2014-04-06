package net.darkhax.moreswords.core.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.darkhax.moreswords.core.util.Config;
import net.darkhax.moreswords.core.util.Reference;
import net.darkhax.moreswords.items.ItemManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class ZombieSwordHandler {
	public static double rand;
	public static int range;
	public static Reference rnd;

	@SubscribeEvent
	public void EntityJoinWorldEvent(EntityJoinWorldEvent event) {
		if (Config.zombies == true) {
			rand = Math.random();
			range = Reference.random.nextIntII(1, 12);
			if ((rand <= Config.zombie) && ((event.entity instanceof EntityLiving)) && (event.entity instanceof EntityZombie)) {
				EntityLiving living = (EntityLiving) event.entity;
				
				if (range == 1) {
					living.setCurrentItemOrArmor(0, new ItemStack(ItemManager.bloodSword));				
				}

				if (range == 2) {
					living.setCurrentItemOrArmor(0, new ItemStack(ItemManager.boneSword));				
				}

				if (range == 3) {
					living.setCurrentItemOrArmor(0, new ItemStack(ItemManager.dragonSword));					
				}

				if (range == 4) {
					living.setCurrentItemOrArmor(0, new ItemStack(ItemManager.eyeEndSword));				
				}

				if (range == 5) {
					living.setCurrentItemOrArmor(0, new ItemStack(ItemManager.glassSword));				
				}

				if (range == 6) {
					living.setCurrentItemOrArmor(0, new ItemStack(ItemManager.infinitySword));				
				}

				if (range == 7) {
					living.setCurrentItemOrArmor(0, new ItemStack(ItemManager.lapisSword));					
				}

				if (range == 8) {
					living.setCurrentItemOrArmor(0, new ItemStack(ItemManager.moltenSword));					
				}

				if (range == 9) {
					living.setCurrentItemOrArmor(0, new ItemStack(ItemManager.aqueousSword));					
				}

				if (range == 10) {
					living.setCurrentItemOrArmor(0, new ItemStack(ItemManager.aethersGuard));					
				}

				if (range == 11) {
					living.setCurrentItemOrArmor(0, new ItemStack(ItemManager.witherBane));					
				}

				if (range == 12) {
					living.setCurrentItemOrArmor(0, new ItemStack(ItemManager.blazeSword));	
				}
				
				event.world.updateEntity(living);
				
			    }
			
		   }
       }
}