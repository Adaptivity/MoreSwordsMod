package net.darkhax.moreswords.core.handlers;

import net.darkhax.moreswords.core.util.Config;
import net.darkhax.moreswords.items.ItemManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {
	
	public static void addRecipes() {
		
		GameRegistry.addRecipe(new ItemStack(ItemManager.blazeSword), new Object[] { " x ", "yxy", " z ", Character.valueOf('x'), Items.iron_ingot, Character.valueOf('z'), Items.blaze_rod, Character.valueOf('y'), Items.gold_ingot });

	    GameRegistry.addRecipe(new ItemStack(ItemManager.bloodSword), new Object[] { " xy", " xy", " z ", Character.valueOf('x'), Blocks.obsidian, Character.valueOf('z'), Items.stick, Character.valueOf('y'), Items.redstone });

	    GameRegistry.addRecipe(new ItemStack(ItemManager.boneSword), new Object[] { " x ", "xxx", " x ", Character.valueOf('x'), Items.bone });

	    GameRegistry.addRecipe(new ItemStack(ItemManager.dragonSword), new Object[] { "xyx", "xzx", " a ", Character.valueOf('x'), Blocks.iron_block, Character.valueOf('y'), Items.redstone, Character.valueOf('z'), Items.diamond, Character.valueOf('a'), Items.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemManager.eyeEndSword), new Object[] { "xyx", "xyx", " z ", Character.valueOf('x'), Items.diamond, Character.valueOf('y'), Items.ender_eye, Character.valueOf('z'), Items.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemManager.glassSword), new Object[] { " x ", " x ", " z ", Character.valueOf('x'), Blocks.glass_pane, Character.valueOf('z'), Items.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemManager.infinitySword), new Object[] { "xyx", "xyx", " z ", Character.valueOf('y'), Blocks.iron_block, Character.valueOf('x'), Items.iron_ingot, Character.valueOf('z'), Items.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemManager.lapisSword), new Object[] { " x ", " x ", " z ", Character.valueOf('x'), Blocks.lapis_block, Character.valueOf('z'), Items.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemManager.moltenSword), new Object[] { " x ", "yxy", " z ", Character.valueOf('x'), Items.lava_bucket, Character.valueOf('y'), Blocks.obsidian, Character.valueOf('z'), Items.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemManager.aqueousSword), new Object[] { " x ", "yxy", " z ", Character.valueOf('x'), Items.water_bucket, Character.valueOf('y'), Blocks.obsidian, Character.valueOf('z'), Items.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemManager.masterSword), new Object[] { " x ", "zyz", " s ", Character.valueOf('x'), Items.iron_ingot, Character.valueOf('y'), Items.gold_ingot, Character.valueOf('z'), new ItemStack(Items.dye, 1, 4), Character.valueOf('s'), Items.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemManager.witherBane), new Object[] { " bb", "cdb", "sc ", Character.valueOf('b'), Blocks.soul_sand, Character.valueOf('c'), Items.quartz, Character.valueOf('d'), Items.nether_star, Character.valueOf('s'), Items.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemManager.aethersGuard), new Object[] { "abc", "bcd", "eda", Character.valueOf('a'), Items.feather, Character.valueOf('b'), Items.diamond, Character.valueOf('c'), Blocks.glowstone, Character.valueOf('d'), Items.iron_ingot, Character.valueOf('e'), Items.stick });

	    if (Config.bedrock == true) {
	    	
	    	GameRegistry.addRecipe(new ItemStack(ItemManager.adminArk), new Object[] { " a ", " a ", " b ", Character.valueOf('a'), Blocks.bedrock, Character.valueOf('b'), Items.stick });
	    }
	    
	    else {
	    	
	    	System.out.println("The Adminium Ark crafting recipe has been disabled by the configuration file");
	    }
	}
}