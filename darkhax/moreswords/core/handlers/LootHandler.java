package darkhax.moreswords.core.handlers;

import darkhax.moreswords.items.ItemManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class LootHandler {
  public static void addLoot() {
    addDungeon();
    addBonus();
    addBlacksmith();
    addStronghold();
  }

  public static void addDungeon() {
    ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(ItemManager.moltenSword), 1, 1, 15));
    ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(ItemManager.aqueousSword), 1, 1, 15));
    ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(ItemManager.dragonSword), 1, 1, 15));
    ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(ItemManager.glassSword), 1, 1, 15));
    ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(ItemManager.lapisSword), 1, 1, 15));
  }

  public static void addBonus() {
    ChestGenHooks.getInfo("bonusChest").addItem(new WeightedRandomChestContent(new ItemStack(ItemManager.boneSword), 1, 1, 20));
    ChestGenHooks.getInfo("bonusChest").addItem(new WeightedRandomChestContent(new ItemStack(ItemManager.glassSword), 1, 1, 20));
  }

  public static void addBlacksmith() {
    ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(ItemManager.infinitySword), 1, 1, 15));
  }

  public static void addStronghold() {
    ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(ItemManager.dragonSword), 1, 1, 15));
    ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(ItemManager.masterSword), 1, 1, 15));
    ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(ItemManager.eyeEndSword), 1, 1, 15));
    ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(ItemManager.lapisSword), 1, 1, 15));
    ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(ItemManager.aqueousSword), 1, 1, 15));
  }
}