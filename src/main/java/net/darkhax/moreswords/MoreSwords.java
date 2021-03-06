package net.darkhax.moreswords;

import java.util.Arrays;

import net.darkhax.moreswords.core.events.DamageHandler;
import net.darkhax.moreswords.core.events.HurtHandler;
import net.darkhax.moreswords.core.events.InteractionHandler;
import net.darkhax.moreswords.core.events.ZombieSwordHandler;
import net.darkhax.moreswords.core.handlers.LootHandler;
import net.darkhax.moreswords.core.handlers.RecipeHandler;
import net.darkhax.moreswords.core.handlers.VillagerHandler;
import net.darkhax.moreswords.core.proxy.CommonProxy;
import net.darkhax.moreswords.core.util.Config;
import net.darkhax.moreswords.core.util.Reference;
import net.darkhax.moreswords.enchantment.EnchantmentList;
import net.darkhax.moreswords.items.ItemManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.id, name = Reference.name, version = Reference.version)
public class MoreSwords {

	public static EnumEnchantmentType enumSwords = EnumHelper.addEnchantmentType("swords");
	public static CreativeTabs tabSwords = new CreativeTabSwords(CreativeTabs.getNextID(), "moreSwords");

	@SidedProxy(serverSide = Reference.common, clientSide = Reference.client)
	public static CommonProxy proxy;

	@Mod.Instance(Reference.id)
	public static MoreSwords instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		getModMeta(event.getModMetadata());
		Config.createConfig(event);

		ItemManager.load();
		EnchantmentList.init();

		MinecraftForge.EVENT_BUS.register(new ZombieSwordHandler());
		MinecraftForge.EVENT_BUS.register(new HurtHandler());
		MinecraftForge.EVENT_BUS.register(new DamageHandler());
		MinecraftForge.EVENT_BUS.register(new InteractionHandler());

		VillagerHandler.init();
		proxy.renderVillager();
		proxy.registerEvents();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		RecipeHandler.addRecipes();
		LootHandler.addLoot();
	}

	private void getModMeta(ModMetadata meta) {

		meta.authorList = Arrays.asList(new String[] { "Darkhax" });
		meta.logoFile = "/assets/moreswords/textures/misc/Logo.png";
		meta.autogenerated = false;
		meta.credits = "Maintained by Darkhax";
		meta.description = "This mod adds various swords into minecraft.";
		meta.url = "http://www.minecraftforum.net/topic/1138477-";
	}
}