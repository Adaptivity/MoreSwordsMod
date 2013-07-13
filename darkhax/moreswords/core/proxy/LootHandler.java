package darkhax.moreswords.core.proxy;

import darkhax.moreswords.items.ItemRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class LootHandler {
  public static void addLoot()
  {
    addDungeon();
    addBonus();
    addBlacksmith();
    addStronghold();
  }

  public static void addDungeon() {
    ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(ItemRegistry.moltenSword), 1, 1, 15));
    ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(ItemRegistry.aqueousSword), 1, 1, 15));
    ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(ItemRegistry.dragonSword), 1, 1, 15));
    ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(ItemRegistry.glassSword), 1, 1, 15));
    ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(ItemRegistry.lapisSword), 1, 1, 15));
  }

  public static void addBonus() {
    ChestGenHooks.getInfo("bonusChest").addItem(new WeightedRandomChestContent(new ItemStack(ItemRegistry.boneSword), 1, 1, 20));
    ChestGenHooks.getInfo("bonusChest").addItem(new WeightedRandomChestContent(new ItemStack(ItemRegistry.glassSword), 1, 1, 20));
  }

  public static void addBlacksmith() {
    ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(ItemRegistry.infinitySword), 1, 1, 15));
  }

  public static void addStronghold() {
    ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(ItemRegistry.dragonSword), 1, 1, 15));
    ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(ItemRegistry.masterSword), 1, 1, 15));
    ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(ItemRegistry.eyeEndSword), 1, 1, 15));
    ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(ItemRegistry.lapisSword), 1, 1, 15));
    ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(ItemRegistry.aqueousSword), 1, 1, 15));
  }
}