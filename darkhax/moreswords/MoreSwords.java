package darkhax.moreswords;

import java.util.Arrays;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms.IMCEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

import darkhax.moreswords.blocks.BlockAwakenTable;
import darkhax.moreswords.blocks.Blocks;
import darkhax.moreswords.core.handlers.DamageHandler;
import darkhax.moreswords.core.handlers.HurtHandler;
import darkhax.moreswords.core.handlers.InteractionHandler;
import darkhax.moreswords.core.handlers.JoinWorldEvent;
import darkhax.moreswords.core.handlers.LanguageHandler;
import darkhax.moreswords.core.handlers.LootHandler;
import darkhax.moreswords.core.handlers.RecipeHandler;
import darkhax.moreswords.core.handlers.VillagerHandler;
import darkhax.moreswords.core.plugins.PluginEplus;
import darkhax.moreswords.core.proxy.ClientProxy;
import darkhax.moreswords.core.proxy.CommonProxy;
import darkhax.moreswords.core.util.Config;
import darkhax.moreswords.core.util.Reference;
import darkhax.moreswords.enchantment.EnchantmentList;
import darkhax.moreswords.items.ItemRegistry;
import darkhax.moreswords.tileentity.TileEntityAwakenTable;

@Mod(modid = Reference.id, name = Reference.name, version = Reference.version)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class MoreSwords{
	
	public static EnumEnchantmentType enumSwords = EnumHelper.addEnchantmentType("swords");
	public static CreativeTabs tabSwords = new CreativeTabSwords(CreativeTabs.getNextID(), "moreSwords");
	
	@SidedProxy(serverSide=Reference.common, clientSide=Reference.client)
	public static CommonProxy proxy;
	
	@Mod.Instance(Reference.id)
    public static MoreSwords instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){	
		
		getModMeta(event.getModMetadata());
		Config.createConfig(event);
		
		ItemRegistry.load();
		Blocks.load();
		EnchantmentList.init();
		LanguageHandler.namesEnglish();
		LanguageHandler.namesGerman();
		
		MinecraftForge.EVENT_BUS.register(new JoinWorldEvent());
		MinecraftForge.EVENT_BUS.register(new HurtHandler());
		MinecraftForge.EVENT_BUS.register(new DamageHandler());
		MinecraftForge.EVENT_BUS.register(new InteractionHandler());
		
		VillagerHandler.init();	
		ClientProxy.renderVillager();
		PluginEplus.loadPlugin();	

		NetworkRegistry.instance().registerGuiHandler(this.instance,new darkhax.moreswords.core.handlers.GuiHandler());	
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
		RecipeHandler.addRecipes();
		LootHandler.addLoot();	
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
	private void getModMeta(ModMetadata meta){
		
		meta.authorList = Arrays.asList(new String[] { "Darkhax" });
		meta.logoFile = "/assets/moreswords/textures/misc/Logo.png";
	    meta.autogenerated = false;
	    meta.credits = "Maintained by Darkhax";
	    meta.description = "This mod adds various swords into minecraft.";
	    meta.url = "http://www.minecraftforum.net/topic/1138477-147-sspsmp-more-swords-mod-99-000-download-now-with-pedestals/";
	}
}
