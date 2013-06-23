package darkhax.moreswordsmod.core.util;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config{
	public Config(FMLPreInitializationEvent event){
	}
	
	// controls
	public static boolean Expedite;
	public static boolean Debug;
	
	// Categories
	public static String Settings = "Mod Settings";
	public static String Value = "Item Values";
	public static String Durability = "Durability Values";
	public static String Damage = "Damage Values";
	public static String Effect = "Enchantment ID";

	// Sword Item Values
	public static int BlazeSwordID;
	public static int BloodSwordID;
	public static int BoneSwordID;
	public static int DragonSwordID;
	public static int EyeEndSwordID;
	public static int GlassSwordID;
	public static int InfinitySwordID;
	public static int LapisSwordID;
	public static int MoltenSwordID;
	public static int AqueousSwordID;
	public static int MasterSwordID;
	public static int AethersGuardID;
	public static int WitherBaneID;
	public static int AdminArkID;

	// Sword Damage
	public static int BlazeSwordDAMAGE;
	public static int BloodSwordDAMAGE;
	public static int BoneSwordDAMAGE;
	public static int DragonSwordDAMAGE;
	public static int EyeEndSwordDAMAGE;
	public static int GlassSwordDAMAGE;
	public static int InfinitySwordDAMAGE;
	public static int LapisSwordDAMAGE;
	public static int MoltenSwordDAMAGE;
	public static int AqueousSwordDAMAGE;
	public static int MasterSwordDAMAGE;
	public static int AethersGuardDAMAGE;
	public static int WitherBaneDAMAGE;
	public static int AdminArkDAMAGE;

	// Sword Durability
	public static int BlazeSwordDURABILITY;
	public static int BloodSwordDURABILITY;
	public static int BoneSwordDURABILITY;
	public static int DragonSwordDURABILITY;
	public static int EyeEndSwordDURABILITY;
	public static int GlassSwordDURABILITY;
	public static int InfinitySwordDURABILITY;
	public static int LapisSwordDURABILITY;
	public static int MoltenSwordDURABILITY;
	public static int AqueousSwordDURABILITY;
	public static int MasterSwordDURABILITY;
	public static int AethersGuardDURABILITY;
	public static int WitherBaneDURABILITY;
	public static int AdminArkDURABILITY;
	
	//mob ID
	public static int VillagerID;

	// Sword EnchantmentID
	public static int StealthID;
	public static int AscensionID;
	public static int IceAuraID;
	public static int BlazeID;
	public static int FeastID;
	public static int VitalityID;
	public static int DragonID;
	public static int EnderPulseID;
	public static int ShatterID;
	public static int GreedID;
	public static int ExpediteID;
	public static int BlessedID;
	public static int DecayID;

	public static void createConfig(FMLPreInitializationEvent event){
		System.out.println(Reference.name + "Configuration Detected!");
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		Expedite = config.get(Settings, "Expedite enabled?", true).getBoolean(true);
		Debug = config.get(Settings, "Debug mode enabled?", false).getBoolean(false);
		 
		 BlazeSwordID = config.get(Value, "BlazeSword ItemValue", 5001).getInt();
		 BloodSwordID = config.get(Value, "BloodSword ItemValue", 5002).getInt();
		 BoneSwordID = config.get(Value, "BoneSword ItemValue", 5003).getInt();
		 GlassSwordID = config.get(Value, "GlassSword ItemValue", 5004).getInt();
		 InfinitySwordID = config.get(Value, "InfinitySword ItemValue", 5005).getInt();
		 LapisSwordID = config.get(Value, "LapisSword ItemValue", 5006).getInt();
		 MoltenSwordID = config.get(Value, "MoltenSword ItemValue", 5007).getInt();
		 AqueousSwordID = config.get(Value, "AqueousSword ItemValue", 5008).getInt();
		 MasterSwordID = config.get(Value, "MasterSword ItemValue", 5009).getInt();
		 DragonSwordID = config.get(Value, "DragonSword ItemValue", 5010).getInt();
		 EyeEndSwordID = config.get(Value, "EyeEndSword ItemValue", 5011).getInt();
		 AethersGuardID = config.get(Value, "AethersGuard ItemValue", 5012).getInt();
		 WitherBaneID = config.get(Value, "WitherBane ItemValue", 5013).getInt();
		 AdminArkID = config.get(Value, "AdminArk ItemValue", 5014).getInt();
		
		 //Normal Sword Damage
		 BlazeSwordDAMAGE = config.get(Damage, "BlazeSword Damage", 4).getInt();
		 BloodSwordDAMAGE = config.get(Damage, "BloodSword Damage", 6).getInt();
		 BoneSwordDAMAGE = config.get(Damage, "BoneSword Damage", 3).getInt();
		 GlassSwordDAMAGE = config.get(Damage, "GlassSword Damage", 5).getInt();
		 InfinitySwordDAMAGE = config.get(Damage, "InfinitySword Damage", 7).getInt();
		 LapisSwordDAMAGE = config.get(Damage, "LapisSword Damage", 3).getInt();
		 MoltenSwordDAMAGE = config.get(Damage, "MoltenSword Damage", 4).getInt();
		 AqueousSwordDAMAGE = config.get(Damage, "AqueousSword Damage", 4).getInt();
		 MasterSwordDAMAGE = config.get(Damage, "MasterSword Damage", 6).getInt();
		 DragonSwordDAMAGE = config.get(Damage, "DragonSword Damage", 7).getInt();
		 EyeEndSwordDAMAGE = config.get(Damage, "EyeEndSword Damage", 8).getInt();
		 AethersGuardDAMAGE = config.get(Damage, "AethersGuard Damage", 7).getInt();
		 WitherBaneDAMAGE = config.get(Damage, "WitherBane Damage", 5).getInt();
		 AdminArkDAMAGE = config.get(Damage, "AdminArk Damage", 999).getInt();

		 //Normal Sword Durability
		 BlazeSwordDURABILITY = config.get(Durability, "BlazeSword Durability", 400).getInt();
		 BloodSwordDURABILITY = config.get(Durability, "BloodSword Durability", 1500).getInt();
		 BoneSwordDURABILITY = config.get(Durability, "BoneSword Durability", 200).getInt();
		 GlassSwordDURABILITY = config.get(Durability, "GlassSword Durability", 15).getInt();
		 InfinitySwordDURABILITY = config.get(Durability, "InfinitySword Durability", 850).getInt();
		 LapisSwordDURABILITY = config.get(Durability, "LapisSword Durability", 750).getInt();
		 MoltenSwordDURABILITY = config.get(Durability, "MoltenSword Durability", 300).getInt();
		 AqueousSwordDURABILITY = config.get(Durability, "AqueousSword Durability", 300).getInt();
		 MasterSwordDURABILITY = config.get(Durability, "MasterSword Durability", 1450).getInt();
		 DragonSwordDURABILITY = config.get(Durability, "DragonSword Durability", 750).getInt();
		 EyeEndSwordDURABILITY = config.get(Durability, "EyeEndSword Durability", 1750).getInt();
		 AethersGuardDURABILITY = config.get(Durability, "AethersGuard Durability", 1000).getInt();
		 WitherBaneDURABILITY = config.get(Durability, "WitherBane Durability", 1000).getInt();
		 AdminArkDURABILITY = config.get(Durability, "AdminArk Durability", 99999999).getInt();
		 
		 StealthID = config.get(Effect, "Stealth Enchantment ID", 100).getInt();
		 AscensionID = config.get(Effect, "Ascension Enchantment ID", 101).getInt();
		 IceAuraID = config.get(Effect, "Ice Aura Enchantment ID", 102).getInt();
		 BlazeID = config.get(Effect, "Blaze Enchantment ID", 103).getInt();
		 FeastID = config.get(Effect, "Feast Enchantment ID", 104).getInt();
		 VitalityID = config.get(Effect,"Vitality Enchantment ID", 105).getInt();
		// GrowthID = config.get(Effect, "Growth Enchantment ID", 106).getInt();
		 DragonID = config.get(Effect, "Dragon Slayer Enchantment ID", 107).getInt();
		 EnderPulseID = config.get(Effect, "Ender Pulse Enchantment ID", 108).getInt();
		// NomsID = config.get(Effect, "Noms Enchantment ID", 109).getInt();
		 ShatterID = config.get(Effect, "Shatter Enchantment ID", 110).getInt();
		// DurableID = config.get(Effect, "Durable Enchantment ID", 111).getInt();
		 GreedID = config.get(Effect, "Greed Enchantments ID", 112).getInt();
		 ExpediteID = config.get(Effect, "Expedite Enchantment ID", 113).getInt();
		 BlessedID = config.get(Effect, "Blessed Enchantment ID", 114).getInt();
		 DecayID = config.get(Effect, "Decay Enchantment ID", 115).getInt();
		 
		 VillagerID = config.get(Effect, "Swords Selling Villager ID", 66).getInt();
		 
		config.save();
		System.out.println(Reference.name + "Config Loaded!");
	}
}
