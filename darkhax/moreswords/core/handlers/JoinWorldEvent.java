package darkhax.moreswords.core.handlers;

import darkhax.moreswords.core.util.Config;
import darkhax.moreswords.core.util.Reference;
import darkhax.moreswords.items.ItemRegistry;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class JoinWorldEvent
{
  public static double rand;
  public static int range;
  public static Reference rnd;

  @ForgeSubscribe
  public void EntityJoinWorldEvent(EntityJoinWorldEvent event) {
	  if (Config.zombies == true){
    rand = Math.random();
    range = Reference.random.nextIntII(1, 12);
    if ((rand <= 0.2D) && 
      ((event.entity instanceof EntityLiving)) &&   (event.entity instanceof EntityZombie)) {
      EntityLiving living = (EntityLiving)event.entity;
      if (range == 1) {
        living.setCurrentItemOrArmor(0, new ItemStack(ItemRegistry.bloodSword));
        event.world.updateEntities();
      }

      if (range == 2) {
        living.setCurrentItemOrArmor(0, new ItemStack(ItemRegistry.boneSword));
        event.world.updateEntities();
      }

      if (range == 3) {
        living.setCurrentItemOrArmor(0, new ItemStack(ItemRegistry.dragonSword));
        event.world.updateEntities();
      }

      if (range == 4) {
        living.setCurrentItemOrArmor(0, new ItemStack(ItemRegistry.eyeEndSword));
        event.world.updateEntities();
      }

      if (range == 5) {
        living.setCurrentItemOrArmor(0, new ItemStack(ItemRegistry.glassSword));
        event.world.updateEntities();
      }

      if (range == 6) {
        living.setCurrentItemOrArmor(0, new ItemStack(ItemRegistry.infinitySword));
        event.world.updateEntities();
      }

      if (range == 7) {
        living.setCurrentItemOrArmor(0, new ItemStack(ItemRegistry.lapisSword));
        event.world.updateEntities();
      }

      if (range == 8) {
        living.setCurrentItemOrArmor(0, new ItemStack(ItemRegistry.moltenSword));
        event.world.updateEntities();
      }

      if (range == 9) {
        living.setCurrentItemOrArmor(0, new ItemStack(ItemRegistry.aqueousSword));
        event.world.updateEntities();
      }

      if (range == 10) {
        living.setCurrentItemOrArmor(0, new ItemStack(ItemRegistry.aethersGuard));
        event.world.updateEntities();
      }

      if (range == 11) {
        living.setCurrentItemOrArmor(0, new ItemStack(ItemRegistry.witherBane));
        event.world.updateEntities();
      }

      if (range == 12)
        living.setCurrentItemOrArmor(0, new ItemStack(ItemRegistry.blazeSword));
      event.world.updateEntities();
    }
    }
  }
}