package darkhax.moreswords.core.handlers;

import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import darkhax.moreswords.core.util.Config;
import darkhax.moreswords.items.ItemRegistry;
import java.util.Random;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class VillagerHandler implements VillagerRegistry.IVillageTradeHandler {
	
  public static void init()
  {
    addVillager();
    VillagerRegistry localVillagerRegistry = VillagerRegistry.instance();
    VillagerHandler SwordTradeHandler = new VillagerHandler();
    localVillagerRegistry.registerVillageTradeHandler(Config.swordsmanID, SwordTradeHandler);
  }

  public static void addVillager() {
    VillagerRegistry.instance().registerVillagerId(Config.swordsmanID);
    
  }

  public void manipulateTradesForVillager(EntityVillager paramEntityVillager, MerchantRecipeList paramMerchantRecipeList, Random paramRandom) {
    paramMerchantRecipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 7), new ItemStack(Item.feather, 15), new ItemStack(ItemRegistry.aethersGuard, 1, 0)));
    paramMerchantRecipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 7), new ItemStack(Item.bucketWater, 1), new ItemStack(ItemRegistry.aqueousSword, 1, 0)));
    paramMerchantRecipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 7), new ItemStack(Item.blazeRod, 2), new ItemStack(ItemRegistry.blazeSword, 1, 0)));
    paramMerchantRecipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 7), new ItemStack(Item.bone, 15), new ItemStack(ItemRegistry.boneSword, 1, 0)));
    paramMerchantRecipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 7), new ItemStack(Item.redstone, 15), new ItemStack(ItemRegistry.dragonSword, 1, 0)));
  }
}