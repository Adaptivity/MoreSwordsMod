package darkhax.moreswords.core.events;

import darkhax.moreswords.core.util.Config;
import darkhax.moreswords.core.util.Reference;
import darkhax.moreswords.items.Items;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class ZombieSwordHandler {
	public static double rand;
	public static int range;
	public static Reference rnd;

	@ForgeSubscribe
	public void EntityJoinWorldEvent(EntityJoinWorldEvent event) {
		if (Config.zombies == true) {
			rand = Math.random();
			range = Reference.random.nextIntII(1, 12);
			if ((rand <= 0.2D) && ((event.entity instanceof EntityLiving)) && (event.entity instanceof EntityZombie)) {
				EntityLiving living = (EntityLiving) event.entity;
				if (range == 1) {
					living.setCurrentItemOrArmor(0, new ItemStack(Items.bloodSword));
					event.world.updateEntities();
				}

				if (range == 2) {
					living.setCurrentItemOrArmor(0, new ItemStack(Items.boneSword));
					event.world.updateEntities();
				}

				if (range == 3) {
					living.setCurrentItemOrArmor(0, new ItemStack(Items.dragonSword));
					event.world.updateEntities();
				}

				if (range == 4) {
					living.setCurrentItemOrArmor(0, new ItemStack(Items.eyeEndSword));
					event.world.updateEntities();
				}

				if (range == 5) {
					living.setCurrentItemOrArmor(0, new ItemStack(Items.glassSword));
					event.world.updateEntities();
				}

				if (range == 6) {
					living.setCurrentItemOrArmor(0, new ItemStack(Items.infinitySword));
					event.world.updateEntities();
				}

				if (range == 7) {
					living.setCurrentItemOrArmor(0, new ItemStack(Items.lapisSword));
					event.world.updateEntities();
				}

				if (range == 8) {
					living.setCurrentItemOrArmor(0, new ItemStack(Items.moltenSword));
					event.world.updateEntities();
				}

				if (range == 9) {
					living.setCurrentItemOrArmor(0, new ItemStack(Items.aqueousSword));
					event.world.updateEntities();
				}

				if (range == 10) {
					living.setCurrentItemOrArmor(0, new ItemStack(Items.aethersGuard));
					event.world.updateEntities();
				}

				if (range == 11) {
					living.setCurrentItemOrArmor(0, new ItemStack(Items.witherBane));
					event.world.updateEntities();
				}

				if (range == 12)
					living.setCurrentItemOrArmor(0, new ItemStack(Items.blazeSword));
				    event.world.updateEntities();
			    }
		   }
       }
}