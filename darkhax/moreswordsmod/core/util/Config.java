package darkhax.moreswordsmod.core.util;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config{
	
	// Categories
	public static String settings = "Mod Settings";
	public static String values = "Item Values";
	public static String uses = "Uses Values";
	public static String damage = "Damage Values";
	public static String effect = "Enchantment ID";
	
	// Settings
	public static boolean expedite;
	public static boolean debug;

	// Sword Item Values
	public static int blazeSwordID;
	public static int bloodSwordID;
	public static int boneSwordID;
	public static int dragonSwordID;
	public static int eyeEndSwordID;
	public static int glassSwordID;
	public static int infinitySwordID;
	public static int lapisSwordID;
	public static int moltenSwordID;
	public static int aqueousSwordID;
	public static int masterSwordID;
	public static int aethersGuardID;
	public static int witherBaneID;
	public static int adminArkID;

	// Sword Damage
	public static int blazeDmg;
	public static int bloodDmg;
	public static int boneDmg;
	public static int dragonDmg;
	public static int eyeDmg;
	public static int glassDmg;
	public static int infinityDmg;
	public static int lapisDmg;
	public static int moltenDmg;
	public static int aqueousDmg;
	public static int masterDmg;
	public static int aetherDmg;
	public static int witherDmg;
	public static int admingDmg;

	// Sword Uses
	public static int blazeUse;
	public static int bloodUse;
	public static int boneUse;
	public static int dragonUse;
	public static int eyeUse;
	public static int glassUse;
	public static int infinityUse;
	public static int lapisUse;
	public static int moltenUse;
	public static int aqueousUse;
	public static int masterUse;
	public static int aetherUse;
	public static int witherUse;
	public static int adminUse;
	
	//mob ID
	public static int swordsmanID;

	// Sword EnchantmentID
	public static int stealthID;
	public static int ascensionID;
	public static int iceAuraID;
	public static int blazeID;
	public static int feastID;
	public static int vitalityID;
	public static int dragonID;
	public static int enderPulseID;
	public static int shatterID;
	public static int greedID;
	public static int expediteID;
	public static int blessedID;
	public static int decayID;

	public static void createConfig(FMLPreInitializationEvent event){
		System.out.println(Reference.name + "Configuration Detected!");
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		expedite = config.get(settings, "Effect expedite enabled?", true).getBoolean(true);
		debug = config.get(settings, "Debug mode enabled?", false).getBoolean(false);
		swordsmanID = config.get(settings, "Swords Selling Villager ID", 66).getInt();
		
		blazeSwordID = config.get(values, "BlazeSword Item Value", 5001).getInt();
		bloodSwordID = config.get(values, "BloodSword Item Value", 5002).getInt();
		boneSwordID = config.get(values, "BoneSword Item Value", 5003).getInt();
		glassSwordID = config.get(values, "GlassSword Item Value", 5004).getInt();
		infinitySwordID = config.get(values, "InfinitySword Item Value", 5005).getInt();
	    lapisSwordID = config.get(values, "LapisSword Item Value", 5006).getInt();
		moltenSwordID = config.get(values, "MoltenSword Item Value", 5007).getInt();
		aqueousSwordID = config.get(values, "AqueousSword Item Value", 5008).getInt();
		masterSwordID = config.get(values, "MasterSword Item Value", 5009).getInt();
		dragonSwordID = config.get(values, "DragonSword Item Value", 5010).getInt();
		eyeEndSwordID = config.get(values, "EyeEndSword Item Value", 5011).getInt();
		aethersGuardID = config.get(values, "AethersGuard Item Value", 5012).getInt();
		witherBaneID = config.get(values, "WitherBane Item Value", 5013).getInt();
		adminArkID = config.get(values, "AdminArk Item Value", 5014).getInt();
		
		blazeDmg = config.get(damage, "BlazeSword Damage", 4).getInt();
		bloodDmg = config.get(damage, "BloodSword Damage", 6).getInt();
		boneDmg = config.get(damage, "BoneSword Damage", 3).getInt();
		glassDmg = config.get(damage, "GlassSword Damage", 5).getInt();
		infinityDmg = config.get(damage, "InfinitySword Damage", 7).getInt();
		lapisDmg = config.get(damage, "LapisSword Damage", 3).getInt();
		moltenDmg = config.get(damage, "MoltenSword Damage", 4).getInt();
		aqueousDmg = config.get(damage, "AqueousSword Damage", 4).getInt();
		masterDmg = config.get(damage, "MasterSword Damage", 6).getInt();
		dragonDmg = config.get(damage, "DragonSword Damage", 7).getInt();
		eyeDmg = config.get(damage, "EyeEndSword Damage", 8).getInt();
		aetherDmg = config.get(damage, "AethersGuard Damage", 7).getInt();
		witherDmg = config.get(damage, "WitherBane Damage", 5).getInt();
		admingDmg = config.get(damage, "AdminArk Damage", 999).getInt();
		
		blazeUse = config.get(uses, "BlazeSword Uses", 400).getInt();
		bloodUse = config.get(uses, "BloodSword Uses", 1500).getInt();
		boneUse = config.get(uses, "BoneSword Uses", 200).getInt();
		glassUse = config.get(uses, "GlassSword Uses", 15).getInt();
		infinityUse = config.get(uses, "InfinitySword Uses", 850).getInt();
		lapisUse = config.get(uses, "LapisSword Uses", 750).getInt();
		moltenUse = config.get(uses, "MoltenSword Uses", 300).getInt();
		aqueousUse = config.get(uses, "AqueousSword Uses", 300).getInt();
		masterUse = config.get(uses, "MasterSword Uses", 1450).getInt();
		dragonUse = config.get(uses, "DragonSword Uses", 750).getInt();
		eyeUse = config.get(uses, "EyeEndSword Uses", 1750).getInt();
		aetherUse = config.get(uses, "AethersGuard Uses", 1000).getInt();
		witherUse = config.get(uses, "WitherBane Uses", 1000).getInt();
		adminUse = config.get(uses, "AdminArk Uses", 99999999).getInt();
		
		stealthID = config.get(effect, "Stealth Enchantment ID", 100).getInt();
		ascensionID = config.get(effect, "Ascension Enchantment ID", 101).getInt();
		iceAuraID = config.get(effect, "Ice Aura Enchantment ID", 102).getInt();
		blazeID = config.get(effect, "Blaze Enchantment ID", 103).getInt();
		feastID = config.get(effect, "Feast Enchantment ID", 104).getInt();
		vitalityID = config.get(effect,"Vitality Enchantment ID", 105).getInt();
		enderPulseID = config.get(effect, "Ender Pulse Enchantment ID", 108).getInt();
		shatterID = config.get(effect, "Shatter Enchantment ID", 110).getInt();
		greedID = config.get(effect, "Greed Enchantments ID", 112).getInt();
		expediteID = config.get(effect, "Expedite Enchantment ID", 113).getInt();
		blessedID = config.get(effect, "Blessed Enchantment ID", 114).getInt();
		decayID = config.get(effect, "Decay Enchantment ID", 115).getInt();
		
		config.save();
		System.out.println(Reference.name + "Config Loaded!");
	}
}
