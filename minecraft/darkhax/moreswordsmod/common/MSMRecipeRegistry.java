package darkhax.moreswordsmod.common;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class MSMRecipeRegistry{
	public static MSMRecipeRegistry instance;
	private GameRegistry reg;
	private MSMItems items;
	
		//instance = this;
	
	
	public void addRecipes(){
	/*	reg.addRecipe(new ItemStack(items.blazeSword, 1), new Object[]{
			" X ",
			"YXY",
			" Z ",
			Character.valueOf('X'), Item.ingotIron,
			Character.valueOf('Y'), Item.ingotGold,
			Character.valueOf('Z'), Item.blazeRod
		}); */
		reg.addRecipe(new ItemStack(items.bloodSword, 1), new Object[]{
			" XY",
			" XY",
			" Z ",
			Character.valueOf('X'), Block.obsidian,
			Character.valueOf('Y'), Item.redstone,
			Character.valueOf('Z'), Item.stick
		});
		reg.addRecipe(new ItemStack(items.boneSword, 1), new Object[]{
			" X ",
			"XXX",
			" X ",
			Character.valueOf('X'), Item.bone
		});
		reg.addRecipe(new ItemStack(items.dragonSword, 1), new Object[]{
			"XYX",
			"XZX",
			" A ",
			Character.valueOf('X'), Block.blockSteel,
			Character.valueOf('Y'), Item.redstone,
			Character.valueOf('Z'), Item.diamond
		});
		reg.addRecipe(new ItemStack(items.eyeEndSword, 1), new Object[]{
			"XYX",
			"XYX",
			" Z ",
			Character.valueOf('X'), Item.diamond,
			Character.valueOf('Y'), Item.eyeOfEnder,
			Character.valueOf('Z'), Item.stick
		});
		reg.addRecipe(new ItemStack(items.glassSword,1), new Object[]{
			" X ",
			" X ",
			" Z ",
			Character.valueOf('X'), Block.glass,
			Character.valueOf('Z'), Item.stick
		});
		reg.addRecipe(new ItemStack(items.infinitySword,1), new Object[]{
			"XYX",
			"XYX",
			" Z ",
			Character.valueOf('X'), Block.blockSteel,
			Character.valueOf('Y'), Item.ingotIron,
			Character.valueOf('Z'), Item.stick
		});
		reg.addRecipe(new ItemStack(items.lapisSword,1), new Object[]{
			" X ",
			" X ",
			" Z ",
			Character.valueOf('X'), Block.blockLapis,
			Character.valueOf('Z'), Item.stick
		});
		reg.addRecipe(new ItemStack(items.moltenSword,1), new Object[]{
			" X ",
			"YXY",
			" Z ",
			Character.valueOf('X'), Item.bucketLava,
			Character.valueOf('Y'), Block.obsidian,
			Character.valueOf('Z'), Item.stick
		});
		reg.addRecipe(new ItemStack(items.aqueousSword,1), new Object[]{
			" X ",
			"YXY",
			" Z ",
			Character.valueOf('X'), Item.bucketWater,
			Character.valueOf('Y'), Block.obsidian,
			Character.valueOf('Z'), Item.stick
		});
		reg.addRecipe(new ItemStack(items.masterSword,1), new Object[]{
			" X ",
			"YXY",
			"AZA",
			Character.valueOf('X'), Item.ingotIron,
			Character.valueOf('Y'), Item.diamond,
			Character.valueOf('A'), Block.obsidian,
			Character.valueOf('Z'), Item.stick
		});
		reg.addRecipe(new ItemStack(items.witherBane,1), new Object[]{
			" Y ",
			"AXA",
			" Z ",
			Character.valueOf('Y'), Block.glowStone,
			Character.valueOf('X'), Item.netherStar,
			Character.valueOf('A'), Block.obsidian,
			Character.valueOf('Z'), Item.stick
		});
		reg.addRecipe(new ItemStack(items.aethersGuard,1), new Object[]{
			"ABC",
			"BCD",
			"EDA",
			Character.valueOf('A'), Item.feather,
			Character.valueOf('B'), Item.diamond,
			Character.valueOf('C'), Block.glowStone,
			Character.valueOf('D'), Item.ingotIron,
			Character.valueOf('E'), Item.stick
		});
		reg.addRecipe(new ItemStack(items.adminArk,1), new Object[]{
			" A ",
			" A ",
			" B ",
			Character.valueOf('A'), Block.bedrock,
			Character.valueOf('B'), Item.stick
		});
	}
}
