package darkhax.moreswords.items;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import darkhax.moreswords.MoreSwords;
import darkhax.moreswords.core.util.Config;
import darkhax.moreswords.core.util.EnumRegistry;
import darkhax.moreswords.core.util.Reference;

public class ItemRegistry {

	public static Item blazeSword;
	public static Item bloodSword;
	public static Item boneSword;
	public static Item dragonSword;
	public static Item eyeEndSword;
	public static Item glassSword;
	public static Item infinitySword;
	public static Item lapisSword;
	public static Item moltenSword;
	public static Item masterSword;
	public static Item aqueousSword;
	public static Item aethersGuard;
	public static Item witherBane;
	public static Item adminArk;
	
	public static Config cfg;
	public static String modId = Reference.id;
	public static String name = Reference.name;

	public static void load() {	
		
		addItems();
		addNames();
	}
	
	public static void addItems(){
		
		blazeSword = new ItemCoreSword(cfg.blazeSwordID, EnumRegistry.blaze, "blaze").setUnlocalizedName("blaze");
		bloodSword = new ItemCoreSword(cfg.bloodSwordID, EnumRegistry.blood, "blood").setUnlocalizedName("blood");
		boneSword = new ItemCoreSword(cfg.boneSwordID, EnumRegistry.bone, "bone").setUnlocalizedName("bone");
		dragonSword = new ItemCoreSword(cfg.dragonSwordID, EnumRegistry.dragon, "dragon").setUnlocalizedName("dragon");
		eyeEndSword = new ItemCoreSword(cfg.eyeEndSwordID, EnumRegistry.eye, "eye").setUnlocalizedName("eye");
		glassSword = new ItemCoreSword(cfg.glassSwordID, EnumRegistry.glass, "glass").setUnlocalizedName("glass");
		infinitySword = new ItemCoreSword(cfg.infinitySwordID, EnumRegistry.infinity, "infinity").setUnlocalizedName("infinity");
		lapisSword = new ItemCoreSword(cfg.lapisSwordID, EnumRegistry.lapis, "lapis").setUnlocalizedName("lapis");
		moltenSword = new ItemCoreSword(cfg.moltenSwordID, EnumRegistry.molten, "molten").setUnlocalizedName("molten");
		masterSword = new ItemCoreSword(cfg.masterSwordID, EnumRegistry.master, "master").setUnlocalizedName("master");
		aqueousSword = new ItemCoreSword(cfg.aqueousSwordID, EnumRegistry.aqueous, "aqueous").setUnlocalizedName("aqueous");
		aethersGuard= new ItemCoreSword(cfg.aethersGuardID, EnumRegistry.aether, "aether").setUnlocalizedName("aether");
		witherBane = new ItemCoreSword(cfg.witherBaneID, EnumRegistry.wither, "wither").setUnlocalizedName("wither");
		adminArk = new ItemCoreSword(cfg.adminArkID, EnumRegistry.admin, "admin").setUnlocalizedName("admin");
	}
	
	public static void addNames(){
		
		LanguageRegistry.instance().addStringLocalization("item.blaze.name", "en_US", "Blaze Sword");
		LanguageRegistry.instance().addStringLocalization("item.blood.name", "en_US", "Blood Sword");
		LanguageRegistry.instance().addStringLocalization("item.bone.name", "en_US", "Bone Sword");
		LanguageRegistry.instance().addStringLocalization("item.dragon.name", "en_US", "Draconic Blade");
		LanguageRegistry.instance().addStringLocalization("item.eye.name", "en_US", "EyeEnd Sword");
		LanguageRegistry.instance().addStringLocalization("item.glass.name", "en_US", "Glass Sword");
		LanguageRegistry.instance().addStringLocalization("item.infinity.name", "en_US", "Infinity Sword");
		LanguageRegistry.instance().addStringLocalization("item.lapis.name", "en_US", "Lapis Sword");
		LanguageRegistry.instance().addStringLocalization("item.molten.name", "en_US", "Molten Edge");
		LanguageRegistry.instance().addStringLocalization("item.master.name", "en_US", "Master Sword");
		LanguageRegistry.instance().addStringLocalization("item.aqueous.name", "en_US", "Aqueous Blade");
		LanguageRegistry.instance().addStringLocalization("item.aether.name", "en_US", "Aether's Guard");
		LanguageRegistry.instance().addStringLocalization("item.wither.name", "en_US", "Wither Bane");
		LanguageRegistry.instance().addStringLocalization("item.admin.name", "en_US", "Adminium Ark");
	}
}