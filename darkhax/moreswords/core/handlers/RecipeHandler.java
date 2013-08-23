package darkhax.moreswords.core.handlers;

import cpw.mods.fml.common.registry.GameRegistry;
import darkhax.moreswords.items.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipeHandler {
	public static void addRecipes() {
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.blazeSword), new Object[] { " x ", "yxy", " z ", Character.valueOf('x'), Item.ingotIron, Character.valueOf('z'), Item.blazeRod, Character.valueOf('y'), Item.ingotGold });

	    GameRegistry.addRecipe(new ItemStack(ItemRegistry.bloodSword), new Object[] { " xy", " xy", " z ", Character.valueOf('x'), Block.obsidian, Character.valueOf('z'), Item.stick, Character.valueOf('y'), Item.redstone });

	    GameRegistry.addRecipe(new ItemStack(ItemRegistry.boneSword), new Object[] { " x ", "xxx", " x ", Character.valueOf('x'), Item.bone });

	    GameRegistry.addRecipe(new ItemStack(ItemRegistry.dragonSword), new Object[] { "xyx", "xzx", " a ", Character.valueOf('x'), Block.blockIron, Character.valueOf('y'), Item.redstone, Character.valueOf('z'), Item.diamond, Character.valueOf('a'), Item.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemRegistry.eyeEndSword), new Object[] { "xyx", "xyx", " z ", Character.valueOf('x'), Item.diamond, Character.valueOf('y'), Item.eyeOfEnder, Character.valueOf('z'), Item.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemRegistry.glassSword), new Object[] { " x ", " x ", " z ", Character.valueOf('x'), Block.thinGlass, Character.valueOf('z'), Item.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemRegistry.infinitySword), new Object[] { "xyx", "xyx", " z ", Character.valueOf('y'), Block.blockIron, Character.valueOf('x'), Item.ingotIron, Character.valueOf('z'), Item.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemRegistry.lapisSword), new Object[] { " x ", " x ", " z ", Character.valueOf('x'), Block.blockLapis, Character.valueOf('z'), Item.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemRegistry.moltenSword), new Object[] { " x ", "yxy", " z ", Character.valueOf('x'), Item.bucketLava, Character.valueOf('y'), Block.obsidian, Character.valueOf('z'), Item.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemRegistry.aqueousSword), new Object[] { " x ", "yxy", " z ", Character.valueOf('x'), Item.bucketWater, Character.valueOf('y'), Block.obsidian, Character.valueOf('z'), Item.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemRegistry.masterSword), new Object[] { " x ", "zyz", " s ", Character.valueOf('x'), Item.ingotIron, Character.valueOf('y'), Item.ingotGold, Character.valueOf('z'), new ItemStack(Item.dyePowder, 1, 4), Character.valueOf('s'), Item.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemRegistry.witherBane), new Object[] { " bb", "cdb", "sc ", Character.valueOf('b'), Block.slowSand, Character.valueOf('c'), Item.netherQuartz, Character.valueOf('d'), Item.netherStar, Character.valueOf('s'), Item.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemRegistry.aethersGuard), new Object[] { "abc", "bcd", "eda", Character.valueOf('a'), Item.feather, Character.valueOf('b'), Item.diamond, Character.valueOf('c'), Block.glowStone, Character.valueOf('d'), Item.ingotIron, Character.valueOf('e'), Item.stick });

	    GameRegistry.addRecipe(new ItemStack(ItemRegistry.adminArk), new Object[] { " a ", " a ", " b ", Character.valueOf('a'), Block.bedrock, Character.valueOf('b'), Item.stick });
	}
}