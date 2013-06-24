package darkhax.moreswordsmod.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;
import darkhax.moreswordsmod.core.util.Config;

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

	public static void load() {
		
		blazeSword = new ItemCoreSword(cfg.blazeSwordID, null, cfg.blazeDmg, 0, cfg.blazeUse, null);
		bloodSword = new ItemCoreSword(cfg.bloodSwordID, null, cfg.bloodDmg, 0, cfg.bloodUse, null);
		boneSword = new ItemCoreSword(cfg.boneSwordID, null, cfg.boneDmg, 0, cfg.boneUse, null);
		dragonSword = new ItemCoreSword(cfg.dragonSwordID, null, cfg.dragonDmg, 0, cfg.dragonUse, null);
		eyeEndSword = new ItemCoreSword(cfg.eyeEndSwordID, null, cfg.eyeDmg, 0, cfg.eyeUse, null);
		glassSword = new ItemCoreSword(cfg.glassSwordID, null, cfg.glassDmg, 0, cfg.glassUse, null);
		infinitySword = new ItemCoreSword(cfg.infinitySwordID, null, cfg.infinityDmg, 0, cfg.infinityUse, null);
		lapisSword = new ItemCoreSword(cfg.lapisSwordID, null, cfg.lapisDmg, 0, cfg.lapisUse, null);
		moltenSword = new ItemCoreSword(cfg.moltenSwordID, null, cfg.moltenDmg, 0, cfg.moltenUse, null);
		masterSword = new ItemCoreSword(cfg.masterSwordID, null, cfg.masterDmg, 0, cfg.masterUse, null);
		aqueousSword = new ItemCoreSword(cfg.aqueousSwordID, null, cfg.aqueousDmg, 0, cfg.aqueousUse, null);
		aethersGuard = new ItemCoreSword(cfg.aethersGuardID, null, cfg.aetherDmg, 0, cfg.aetherUse, null);
		witherBane = new ItemCoreSword(cfg.witherBaneID, null, cfg.witherDmg, 0, cfg.witherUse, null);
		adminArk = new ItemCoreSword(cfg.adminArkID, null, cfg.admingDmg, 0, cfg.adminUse, null);		
		
		LanguageRegistry.addName(ItemRegistry.blazeSword, "\u00a76Blaze Sword");
		LanguageRegistry.addName(ItemRegistry.bloodSword, "\u00a74Blood Sword");
		LanguageRegistry.addName(ItemRegistry.boneSword, "\u00a7fBone Sword");
		LanguageRegistry.addName(ItemRegistry.dragonSword, "\u00a75Draconic Sword");
		LanguageRegistry.addName(ItemRegistry.eyeEndSword, "\u00a7aEyeEnd Sword");
		LanguageRegistry.addName(ItemRegistry.glassSword, "\u00a78Glass Sword");
		LanguageRegistry.addName(ItemRegistry.infinitySword, "\u00a77Infinity Sword");
		LanguageRegistry.addName(ItemRegistry.lapisSword, "\u00a71Lapis Sword");
		LanguageRegistry.addName(ItemRegistry.moltenSword, "\u00a7cMolten Sword");
		LanguageRegistry.addName(ItemRegistry.aqueousSword, "\u00a7bAqueous Sword");
		LanguageRegistry.addName(ItemRegistry.masterSword, "\u00a73Master Sword");
		LanguageRegistry.addName(ItemRegistry.aethersGuard, "Aether's Guard");
		LanguageRegistry.addName(ItemRegistry.witherBane, "Wither Bane");
		LanguageRegistry.addName(ItemRegistry.adminArk, "\u00a74A\u00a76d\u00a7Em\u00a72i\u00a71n \u00a75A\u00a7dr\u00a7ak");
	}
}