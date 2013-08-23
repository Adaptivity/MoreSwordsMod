package darkhax.moreswords.core.handlers;

import darkhax.moreswords.items.Items;
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
    ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(Items.moltenSword), 1, 1, 15));
    ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(Items.aqueousSword), 1, 1, 15));
    ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(Items.dragonSword), 1, 1, 15));
    ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(Items.glassSword), 1, 1, 15));
    ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(Items.lapisSword), 1, 1, 15));
  }

  public static void addBonus() {
    ChestGenHooks.getInfo("bonusChest").addItem(new WeightedRandomChestContent(new ItemStack(Items.boneSword), 1, 1, 20));
    ChestGenHooks.getInfo("bonusChest").addItem(new WeightedRandomChestContent(new ItemStack(Items.glassSword), 1, 1, 20));
  }

  public static void addBlacksmith() {
    ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(Items.infinitySword), 1, 1, 15));
  }

  public static void addStronghold() {
    ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(Items.dragonSword), 1, 1, 15));
    ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(Items.masterSword), 1, 1, 15));
    ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(Items.eyeEndSword), 1, 1, 15));
    ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(Items.lapisSword), 1, 1, 15));
    ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(Items.aqueousSword), 1, 1, 15));
  }
}