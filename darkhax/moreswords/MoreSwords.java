package darkhax.moreswords;

import java.util.Arrays;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

import darkhax.moreswords.core.handlers.LanguageHandler;
import darkhax.moreswords.core.handlers.LivingHandler;
import darkhax.moreswords.core.proxy.CommonProxy;
import darkhax.moreswords.core.util.Config;
import darkhax.moreswords.core.util.Reference;
import darkhax.moreswords.enchantment.EnchantmentList;
import darkhax.moreswords.items.ItemRegistry;

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
		EnchantmentList.init();
		LanguageHandler.namesEnglish();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
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
