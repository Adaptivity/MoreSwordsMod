package darkhax.moreswordsmod.common;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class MSMConfiguration{
	public static MSMConfiguration instance;
	
	public MSMConfiguration(){
		instance = this;
	}
	
	Configuration config;
	private MSMDataProxy data = MSMDataProxy.instance;
	
	public void createConfig(FMLPreInitializationEvent event){
		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		// Set Sword IDs
		data.blazeSwordID = config.getItem("Blaze Sword", 4001).getInt();
		data.bloodSwordID = config.getItem("Blood Sword", 4002).getInt();
		data.boneSwordID = config.getItem("Bone Sword", 4003).getInt();
		data.glassSwordID = config.getItem("Glass Sword", 4004).getInt();
		data.infinitySwordID = config.getItem("Infinity Sword", 4005).getInt();
		data.lapisSwordID = config.getItem("Lapis Sword", 4006).getInt();
		data.moltenSwordID = config.getItem("Molten Sword", 4007).getInt();
		data.aqueousSwordID = config.getItem("Aqueous Sword", 4008).getInt();
		data.masterSwordID = config.getItem("Master Sword", 4009).getInt();
		data.dragonSwordID = config.getItem("Dragon Sword", 4010).getInt();
		data.eyeEndSwordID = config.getItem("Eye End Sword", 4011).getInt();
		data.aethersGuardID = config.getItem("Aethers Guard", 4012).getInt();
		data.witherBaneID = config.getItem("Wither Bane", 4013).getInt();
		data.adminArkID = config.getItem("Admin Ark", 4014).getInt();
		
		// Set Awakened Sword IDs
		data.awakenedBlazeSwordID = config.getItem("Awakened Blaze Sword", 4100).getInt();
		data.awakenedBloodSwordID = config.getItem("Awakened Blood Sword", 4101).getInt();
		data.awakenedBoneSwordID = config.getItem("Awakened Bone Sword", 4102).getInt();
		data.awakenedGlassSwordID = config.getItem("Awakened Glass Sword", 4103).getInt();
		data.awakenedInfinitySwordID = config.getItem("Awakened Infinity Sword", 4104).getInt();
		data.awakenedLapisSwordID = config.getItem("Awakened Lapis Sword", 4105).getInt();
		data.awakenedMoltenSwordID = config.getItem("Awakened Molten Sword", 4106).getInt();
		data.awakenedAqueousSwordID = config.getItem("Awakened Aqueous Sword", 4107).getInt();
		data.awakenedMasterSwordID = config.getItem("Awakened Master Sword", 4108).getInt();
		data.awakenedDragonSwordID = config.getItem("Awakened Dragon Sword", 4109).getInt();
		data.awakenedEyeEndSwordID = config.getItem("Awakened Eye Sword", 4110).getInt();
		data.awakenedAetherGuardID = config.getItem("Awakened Aether Guard Sword", 4111).getInt();
		data.awakenedWitherBaneID = config.getItem("Awakened Wither Bane Sword", 4112).getInt();
		data.awakenedAdminArkID = config.getItem("Awakened Admin Ark Sword", 4113).getInt();
		
		// Add Damage Values
		data.blazeSwordDamage = config.get(config.CATEGORY_GENERAL, "Blaze Sword Damage", 4).getInt();
		data.bloodSwordDamage = config.get(config.CATEGORY_GENERAL, "Blood Sword Damage", 6).getInt();
		data.boneSwordDamage = config.get(config.CATEGORY_GENERAL, "Bone Sword Damage", 3).getInt();
		data.glassSwordDamage = config.get(config.CATEGORY_GENERAL, "Glass Sword Damage", 5).getInt();
		data.infinitySwordDamage = config.get(config.CATEGORY_GENERAL, "Infinity Sword Damage", 7).getInt();
		data.lapisSwordDamage = config.get(config.CATEGORY_GENERAL, "Lapis Sword Damage", 3).getInt();
		data.moltenSwordDamage = config.get(config.CATEGORY_GENERAL, "Molten Sword Damage", 4).getInt();
		data.aqueousSwordDamage = config.get(config.CATEGORY_GENERAL, "Aqueous Sword Damage", 4).getInt();
		data.masterSwordDamage = config.get(config.CATEGORY_GENERAL, "Master Sword Damage", 6).getInt();
		data.dragonSwordDamage = config.get(config.CATEGORY_GENERAL, "Dragon Sword Damage", 7).getInt();
		data.eyeEndSwordDamage = config.get(config.CATEGORY_GENERAL, "Eye End Sword Damage", 8).getInt();
		data.aethersGuardDamage = config.get(config.CATEGORY_GENERAL, "Aethers Guard Damage", 8).getInt();
		data.witherBaneDamage = config.get(config.CATEGORY_GENERAL, "Wither Bane Damage", 3).getInt();
		data.adminArkDamage = config.get(config.CATEGORY_GENERAL, "Admin Ark Damage", 999).getInt();
		
		data.awakenedBlazeSwordDamage = config.get(Configuration.CATEGORY_GENERAL, "Awakened Blaze Sword Damage", 4).getInt();
		data.awakenedBloodSwordDamage = config.get(Configuration.CATEGORY_GENERAL, "Awakened Blood Sword Damage", 6).getInt();
		data.awakenedBoneSwordDamage = config.get(Configuration.CATEGORY_GENERAL, "Awakened Bone Sword Damage", 3).getInt();
	    data.awakenedGlassSwordDamage = config.get(Configuration.CATEGORY_GENERAL, "Awakened Glass Sword Damage", 5).getInt();
	    data.awakenedInfinitySwordDamage = config.get(Configuration.CATEGORY_GENERAL, "Awakened Infinity Sword Damage", 7).getInt();
	    data.awakenedLapisSwordDamage = config.get(Configuration.CATEGORY_GENERAL, "Awakened Lapis Sword Damage", 3).getInt();
	    data.awakenedMoltenSwordDamage = config.get(Configuration.CATEGORY_GENERAL,"Awakened Molten Sword Damage", 4).getInt();
	    data.awakenedAqueousSwordDamage = config.get(Configuration.CATEGORY_GENERAL, "Awakened Aqueous Sword Damage", 4).getInt();
	    data.awakenedMasterSwordDamage = config.get(Configuration.CATEGORY_GENERAL, "Awakened Master Sword Damage", 6).getInt();
	    data.awakenedDragonSwordDamage = config.get(Configuration.CATEGORY_GENERAL, "Awakened Dragon Sword Damage", 7).getInt();
	    data.awakenedEyeEndSwordDamage = config.get(Configuration.CATEGORY_GENERAL, "Awakened EyeEnd Sword Damage", 8).getInt();
	    data.awakenedAetherSwordDamage = config.get(Configuration.CATEGORY_GENERAL, "Awakened AethersGuard Damage", 3).getInt();
	    data.awakenedWitherBaneDamage = config.get(Configuration.CATEGORY_GENERAL, "Awakened WitherBane Damage", 5).getInt();
	    data.awakenedAdminArkDamage = config.get(Configuration.CATEGORY_GENERAL, "Awakened AdminArk Damage", 999).getInt();

		data.blazeSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Blaze Sword Durability", 400).getInt();
		data.bloodSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Blood Sword Durability", 1500).getInt();
		data.boneSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Bone Sword Durability", 200).getInt();
		data.glassSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Glass Sword Durability", 15).getInt();
		data.infinitySwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Infinity Sword Durability", 650).getInt();
		data.lapisSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Lapis Sword Durability", 750).getInt();
		data.moltenSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Molten Sword Durability", 300).getInt();
		data.aqueousSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Aqueous Sword Durability", 300).getInt();
		data.masterSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Master Sword Durability", 1450).getInt();
		data.dragonSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Dragon Sword Durability", 750).getInt();
		data.eyeEndSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "EyeEnd Sword Durability", 1750).getInt();
		data.aethersGuardDurability = config.get(Configuration.CATEGORY_GENERAL, "AethersGuard Durability", 1000).getInt();
	    data.witherBaneDurability = config.get(Configuration.CATEGORY_GENERAL, "WitherBane Durability", 1000).getInt();
	    data.adminArkDurability = config.get(Configuration.CATEGORY_GENERAL, "AdminArk Durability", 99999999).getInt();
		
	    data.awakenedBlazeSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Awakened Blaze Sword Durability", 400).getInt();
	    data.awakenedBloodSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Awakened Blood Sword Durability", 1500).getInt();
	    data.awakenedBoneSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Awakened Bone Sword Durability", 200).getInt();
	    data.awakenedGlassSwordDuability = config.get(Configuration.CATEGORY_GENERAL, "Awakened Glass Sword Durability", 15).getInt();
	    data.awakenedInfinitySwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Awakened Infinity Sword Durability", 650).getInt();
	    data.awakenedlapisSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Awakened Lapis Sword Durability", 750).getInt();
	    data.awakenedMoltenSwordDurability = config.get(Configuration.CATEGORY_GENERAL,"Awakened Molten Sword Durability", 300).getInt();
	    data.awakenedAqueousSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Awakened Aqueous Sword Durability", 300).getInt();
	    data.awakenedMasterSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Awakened Master Sword Durability", 2750).getInt();
	    data.awakenedDragonSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Awakened Dragon Sword Durability", 750).getInt();
	    data.awakenedEyeEndSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Awakened EyeEnd Sword Durability Durability", 1750).getInt();
	    data.awakenedAetherSwordDurability = config.get(Configuration.CATEGORY_GENERAL, "Awakened Aethers Guard Durability", 777).getInt();
	    data.awakenedWitherBaneDurability = config.get(Configuration.CATEGORY_GENERAL, "Awakened Wither Bane Durability", 666).getInt();
	    data.awakenedAdminArkDurability = config.get(Configuration.CATEGORY_GENERAL, "Awakened Admin Ark Durability", 99999999).getInt();
		config.save();
	}
}
