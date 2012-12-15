package darkhax.moreswordsmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.DungeonHooks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import darkhax.moreswordsmod.common.MSMConfiguration;
import darkhax.moreswordsmod.common.MSMDataProxy;
import darkhax.moreswordsmod.common.MSMItems;
import darkhax.moreswordsmod.common.MSMPathing;
import darkhax.moreswordsmod.common.MSMRecipeRegistry;
import darkhax.moreswordsmod.common.MSMNaming;

@Mod(modid = "darkhax_msm", name = "MoreSwordsMod", version = "2.2.4")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MoreSwordsMod
{
	public static MSMItems items;
	public static MSMConfiguration config;
	public static MSMDataProxy data;
	public static MSMPathing pathing;
	public static MSMRecipeRegistry recipeRegistry;
	public static MSMNaming naming;
	public static CreativeTabs tabMoreSwordsMod = new TabMoreSwordsMod(CreativeTabs.getNextID(), "TabMoreSwordsMod");

	@Init
	public void Init(FMLInitializationEvent event){
		recipeRegistry.addRecipes();
		naming.addItemNames();
		//dungeon hooks  itemtack/rarity/min/max 1=gold apple 100= bread
		DungeonHooks.addDungeonLoot(new ItemStack(MSMItems.awakenedBlazeSword), 7, 1, 1);
		DungeonHooks.addDungeonLoot(new ItemStack(MSMItems.awakenedBloodSword), 7, 1, 1);
		DungeonHooks.addDungeonLoot(new ItemStack(MSMItems.awakenedBoneSword), 7, 1, 1);
		//	DungeonHooks.addDungeonLoot(new ItemStack(AwakenedDragonSword), 7, 1, 1);
		DungeonHooks.addDungeonLoot(new ItemStack(MSMItems.awakenedEyeEndSword), 7, 1, 1);
		//	DungeonHooks.addDungeonLoot(new ItemStack(AwakenedGlassSword), 7, 1, 1);
		//	DungeonHooks.addDungeonLoot(new ItemStack(AwakenedInfinitySword), 7, 1, 1);
		//	DungeonHooks.addDungeonLoot(new ItemStack(AwakenedLapisSword), 7, 1, 1);
		//	DungeonHooks.addDungeonLoot(new ItemStack(AwakenedMoltenSword), 7, 1, 1);
		DungeonHooks.addDungeonLoot(new ItemStack(MSMItems.awakenedAqueousSword), 7, 1, 1);
		//	DungeonHooks.addDungeonLoot(new ItemStack(AwakenedMasterSword), 7, 1, 1);
		DungeonHooks.addDungeonLoot(new ItemStack(MSMItems.awakenedAethersGuard), 7, 1, 1);
		DungeonHooks.addDungeonLoot(new ItemStack(MSMItems.awakenedWitherBane), 7, 1, 1);
		//	DungeonHooks.addDungeonLoot(new ItemStack(AwakenedAdminArk), 7, 1, 1);

	}
	
	private void prePreInitialization(){
		items = new MSMItems();
		data = new MSMDataProxy();
		pathing = new MSMPathing();
		recipeRegistry = new MSMRecipeRegistry();
		naming = new MSMNaming();
	}

	@cpw.mods.fml.common.Mod.PreInit
	public void PreInit(FMLPreInitializationEvent event){
		System.out.println("MoreSwordsMod By Darkhax Loading!");
		prePreInitialization();
		config = new MSMConfiguration();
		config.createConfig(event);
	}
}
