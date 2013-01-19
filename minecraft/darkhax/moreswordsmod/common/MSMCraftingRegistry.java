package darkhax.moreswordsmod.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class MSMCraftingRegistry {
	public MSMCraftingRegistry(boolean flag) {
		if (flag) {
			try {
				addRecipes();
			} catch (Exception exception) {
				System.out
						.print("Error Detected In More Swords Mod Crafting Registry");
				throw new RuntimeException();
			}
		} else {
			addRecipes();
		}
	}

	public void addRecipes() {
		// bone swords
		// Recipes (top,middle,bot) z=z x=x so on (warning, can be confusing to
		// look at)
		GameRegistry.addRecipe(new ItemStack(MSMItems.BlazeSword),
				new Object[] { " x ", "yxy", " z ", 'x', Item.ingotIron, 'z',
						Item.blazeRod, 'y', Item.ingotGold });

		GameRegistry.addRecipe(new ItemStack(MSMItems.BloodSword),
				new Object[] { " xy", " xy", " z ", 'x', Block.obsidian, 'z',
						Item.stick, 'y', Item.redstone });

		GameRegistry.addRecipe(new ItemStack(MSMItems.BoneSword), new Object[] {
				" x ", "xxx", " x ", 'x', Item.bone, });

		GameRegistry.addRecipe(new ItemStack(MSMItems.DragonSword),
				new Object[] { "xyx", "xzx", " a ", 'x', Block.blockSteel, 'y',
						Item.redstone, 'z', Item.diamond, 'a', Item.stick });

		GameRegistry.addRecipe(new ItemStack(MSMItems.EyeEndSword),
				new Object[] { "xyx", "xyx", " z ", 'x', Item.diamond, 'y',
						Item.eyeOfEnder, 'z', Item.stick });

		GameRegistry.addRecipe(new ItemStack(MSMItems.GlassSword),
				new Object[] { " x ", " x ", " z ", 'x', Block.glass, 'z',
						Item.stick });

		GameRegistry.addRecipe(new ItemStack(MSMItems.InfinitySword),
				new Object[] { "xyx", "xyx", " z ", 'x', Block.blockSteel, 'y',
						Item.ingotIron, 'z', Item.stick });

		GameRegistry.addRecipe(new ItemStack(MSMItems.LapisSword),
				new Object[] { " x ", " x ", " z ", 'x', Block.blockLapis, 'z',
						Item.stick });

		GameRegistry.addRecipe(new ItemStack(MSMItems.MoltenSword),
				new Object[] { " x ", "yxy", " z ", 'x', Item.bucketLava, 'y',
						Block.obsidian, 'z', Item.stick });

		GameRegistry.addRecipe(new ItemStack(MSMItems.AqueousSword),
				new Object[] { " x ", "yxy", " z ", 'x', Item.bucketWater, 'y',
						Block.obsidian, 'z', Item.stick });

		GameRegistry.addRecipe(new ItemStack(MSMItems.MasterSword),
				new Object[] { " x ", "yxy", "aza", 'x', Item.ingotIron, 'y',
						Item.diamond, 'a', Block.obsidian, 'z', Item.stick });
		GameRegistry
				.addRecipe(new ItemStack(MSMItems.WitherBane), new Object[] {
						" y ", "axa", " z ", 'x', Item.netherStar, 'y',
						Block.glowStone, 'a', Block.obsidian, 'z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(MSMItems.AethersGuard),
				new Object[] { "abc", "bcd", "eda", 'a', Item.feather, 'b',
						Item.diamond, 'c', Block.glowStone, 'd',
						Item.ingotIron, 'e', Item.stick });
		GameRegistry.addRecipe(new ItemStack(MSMItems.AdminArk), new Object[] {
				" a ", " a ", " b ", 'a', Block.bedrock, 'b', Item.stick });
		GameRegistry.addRecipe(new ItemStack(MSMItems.CandyCaneSword),
				new Object[] { "abc", "cba", " d ", 'a',
						new ItemStack(Item.dyePowder, 1, 1), 'b', Item.sugar,
						'c', new ItemStack(Item.dyePowder, 1, 15), 'd',
						Item.stick });
		GameRegistry.addRecipe(new ItemStack(MSMItems.PumpkinPieSword),
				new Object[] { " a ", "bac", " d ", 'a', Block.pumpkin, 'b',
						Item.egg, 'c', Item.sugar, 'd', Item.stick });

	}
}
