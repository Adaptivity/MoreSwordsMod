package darkhax.moreswords.core.handlers;

import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import darkhax.moreswords.core.proxy.ClientProxy;
import darkhax.moreswords.core.util.Config;
import darkhax.moreswords.items.ItemManager;

import java.util.Random;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
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

  public void manipulateTradesForVillager(EntityVillager entity, MerchantRecipeList list, Random rand) {
    list.add(new MerchantRecipe(new ItemStack(Items.emerald, 7), new ItemStack(Items.feather, 15), new ItemStack(ItemManager.aethersGuard, 1, 0)));
    list.add(new MerchantRecipe(new ItemStack(Items.emerald, 7), new ItemStack(Items.water_bucket, 1), new ItemStack(ItemManager.aqueousSword, 1, 0)));
    list.add(new MerchantRecipe(new ItemStack(Items.emerald, 7), new ItemStack(Items.blaze_rod, 2), new ItemStack(ItemManager.blazeSword, 1, 0)));
    list.add(new MerchantRecipe(new ItemStack(Items.emerald, 7), new ItemStack(Items.bone, 15), new ItemStack(ItemManager.boneSword, 1, 0)));
    list.add(new MerchantRecipe(new ItemStack(Items.emerald, 7), new ItemStack(Items.redstone, 15), new ItemStack(ItemManager.dragonSword, 1, 0)));
  }
}