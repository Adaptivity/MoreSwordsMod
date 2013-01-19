package darkhax.moreswordsmod.common;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class MSMConfiguration{
	public MSMConfiguration(FMLPreInitializationEvent event){
		System.out.println("Reading More Swords Mod Config....");
		createConfig(event);
		System.out.println("Done Reading More Swords Mod Config....");
	}

	private void createConfig(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		 
		
		 //Normal Sword ItemValue
		 MSMDataProxy.BlazeSwordID = config.get(MSMDataProxy.Category_ItemValue, "BlazeSword ItemValue", 4001).getInt();
		 MSMDataProxy.BloodSwordID = config.get(MSMDataProxy.Category_ItemValue, "BloodSword ItemValue", 4002).getInt();
		 MSMDataProxy.BoneSwordID = config.get(MSMDataProxy.Category_ItemValue, "BoneSword ItemValue", 4003).getInt();
		 MSMDataProxy.GlassSwordID = config.get(MSMDataProxy.Category_ItemValue, "GlassSword ItemValue", 4004).getInt();
		 MSMDataProxy.InfinitySwordID = config.get(MSMDataProxy.Category_ItemValue, "InfinitySword ItemValue", 4005).getInt();
		 MSMDataProxy.LapisSwordID = config.get(MSMDataProxy.Category_ItemValue, "LapisSword ItemValue", 4006).getInt();
		 MSMDataProxy.MoltenSwordID = config.get(MSMDataProxy.Category_ItemValue, "MoltenSword ItemValue", 4007).getInt();
		 MSMDataProxy.AqueousSwordID = config.get(MSMDataProxy.Category_ItemValue, "AqueousSword ItemValue", 4008).getInt();
		 MSMDataProxy.MasterSwordID = config.get(MSMDataProxy.Category_ItemValue, "MasterSword ItemValue", 4009).getInt();
		 MSMDataProxy.DragonSwordID = config.get(MSMDataProxy.Category_ItemValue, "DragonSword ItemValue", 4010).getInt();
		 MSMDataProxy.EyeEndSwordID = config.get(MSMDataProxy.Category_ItemValue, "EyeEndSword ItemValue", 4011).getInt();
		 MSMDataProxy.AethersGuardID = config.get(MSMDataProxy.Category_ItemValue, "AethersGuard ItemValue", 4012).getInt();
		 MSMDataProxy.WitherBaneID = config.get(MSMDataProxy.Category_ItemValue, "WitherBane ItemValue", 4013).getInt();
		 MSMDataProxy.AdminArkID = config.get(MSMDataProxy.Category_ItemValue, "AdminArk ItemValue", 4014).getInt();
		 MSMDataProxy.CandyCaneSwordID = config.get(MSMDataProxy.Category_ItemValue, "CandyCane ItemValue", 4015).getInt();
		 MSMDataProxy.PumpkinPieSwordID = config.get(MSMDataProxy.Category_ItemValue, "PumpkinPie ItemValue", 4016).getInt();
		 MSMDataProxy.GingerManSwordID = config.get(MSMDataProxy.Category_ItemValue, "GingerBread ItemValue", 4017).getInt();
		 
		 //Awakened Sword ItemValue
		 MSMDataProxy.AwakenedBlazeSwordID = config.get(MSMDataProxy.Category_ItemValue, "Awakened BlazeSword ItemValue", 4101).getInt();
		 MSMDataProxy.AwakenedBloodSwordID = config.get(MSMDataProxy.Category_ItemValue, "Awakened BloodSword ItemValue", 4102).getInt();
		 MSMDataProxy.AwakenedBoneSwordID = config.get(MSMDataProxy.Category_ItemValue, "Awakened BoneSword ItemValue", 4103).getInt();
		 MSMDataProxy.AwakenedGlassSwordID = config.get(MSMDataProxy.Category_ItemValue, "Awakened GlassSword ItemValue", 4104).getInt();
		 MSMDataProxy.AwakenedInfinitySwordID = config.get(MSMDataProxy.Category_ItemValue, "Awakened InfinitySword ItemValue", 4105).getInt();
		 MSMDataProxy.AwakenedLapisSwordID = config.get(MSMDataProxy.Category_ItemValue, "Awakened LapisSword ItemValue", 4106).getInt();
		 MSMDataProxy.AwakenedMoltenSwordID = config.get(MSMDataProxy.Category_ItemValue,"Awakened MoltenSword ItemValue", 4107).getInt();
		 MSMDataProxy.AwakenedAqueousSwordID = config.get(MSMDataProxy.Category_ItemValue, "Awakened AqueousSword ItemValue", 4108).getInt();
		 MSMDataProxy.AwakenedMasterSwordID = config.get(MSMDataProxy.Category_ItemValue, "Awakened MasterSword ItemValue", 4109).getInt();
		 MSMDataProxy.AwakenedDragonSwordID = config.get(MSMDataProxy.Category_ItemValue, "Awakened DragonSword ItemValue", 4110).getInt();
		 MSMDataProxy.AwakenedEyeEndSwordID = config.get(MSMDataProxy.Category_ItemValue, "Awakened EyeEndSword ItemValue", 4111).getInt();
		 MSMDataProxy.AwakenedAethersGuardID = config.get(MSMDataProxy.Category_ItemValue, "Awakened AethersGuard ItemValue", 4112).getInt();
		 MSMDataProxy.AwakenedWitherBaneID = config.get(MSMDataProxy.Category_ItemValue, "Awakened WitherBane ItemValue", 4113).getInt();
		 MSMDataProxy.AwakenedAdminArkID = config.get(MSMDataProxy.Category_ItemValue, "Awakened AdminArk ItemValue", 4114).getInt();
		 MSMDataProxy.AwakenedCandyCaneSwordID = config.get(MSMDataProxy.Category_ItemValue, "Awakened CandyCane ItemValue ItemValue", 4115).getInt();
		 MSMDataProxy.AwakenedPumpkinPieSwordID = config.get(MSMDataProxy.Category_ItemValue, "Awakened PumpkinPie ItemValue", 4116).getInt();
		 MSMDataProxy.AwakenedGingerManSwordID = config.get(MSMDataProxy.Category_ItemValue, "Awakened Gingerbread ItemValue", 4117).getInt();
		
		 //Normal Sword Damage
		 MSMDataProxy.BlazeSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "BlazeSword Damage", 4).getInt();
		 MSMDataProxy.BloodSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "BloodSword Damage", 6).getInt();
		 MSMDataProxy.BoneSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "BoneSword Damage", 3).getInt();
		 MSMDataProxy.GlassSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "GlassSword Damage", 5).getInt();
		 MSMDataProxy.InfinitySwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "InfinitySword Damage", 7).getInt();
		 MSMDataProxy.LapisSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "LapisSword Damage", 3).getInt();
		 MSMDataProxy.MoltenSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "MoltenSword Damage", 4).getInt();
		 MSMDataProxy.AqueousSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "AqueousSword Damage", 4).getInt();
		 MSMDataProxy.MasterSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "MasterSword Damage", 6).getInt();
		 MSMDataProxy.DragonSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "DragonSword Damage", 7).getInt();
		 MSMDataProxy.EyeEndSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "EyeEndSword Damage", 8).getInt();
		 MSMDataProxy.AethersGuardDAMAGE = config.get(MSMDataProxy.Category_Damage, "AethersGuard Damage", 8).getInt();
		 MSMDataProxy.WitherBaneDAMAGE = config.get(MSMDataProxy.Category_Damage, "WitherBane Damage", 3).getInt();
		 MSMDataProxy.AdminArkDAMAGE = config.get(MSMDataProxy.Category_Damage, "AdminArk Damage", 999).getInt();
		 MSMDataProxy.FoodSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "CandyCaneSword Damage", 3).getInt();
		 
		 //Awakened Sword Damage
		 MSMDataProxy.AwakenedBlazeSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "AwakenedBlazeSword Damage", 4).getInt();
		 MSMDataProxy.AwakenedBloodSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "AwakenedBloodSword Damage", 6).getInt();
		 MSMDataProxy.AwakenedBoneSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "AwakenedBoneSword Damage", 3).getInt();
		 MSMDataProxy.AwakenedGlassSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "AwakenedGlassSword Damage", 5).getInt();
		 MSMDataProxy.AwakenedInfinitySwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "AwakenedInfinitySword Damage", 7).getInt();
		 MSMDataProxy.AwakenedLapisSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "AwakenedLapisSword Damage", 3).getInt();
		 MSMDataProxy.AwakenedMoltenSwordDAMAGE = config.get(MSMDataProxy.Category_Damage,"AwakenedMoltenSword Damage", 4).getInt();
		 MSMDataProxy.AwakenedAqueousSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "AwakenedAqueousSword Damage", 4).getInt();
		 MSMDataProxy.AwakenedMasterSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "AwakenedMasterSword Damage", 6).getInt();
		 MSMDataProxy.AwakenedDragonSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "AwakenedDragonSword Damage", 7).getInt();
		 MSMDataProxy.AwakenedEyeEndSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "AwakenedEyeEndSword Damage", 8).getInt();
		 MSMDataProxy.AwakenedAethersGuardDAMAGE = config.get(MSMDataProxy.Category_Damage, "AwakenedAethersGuard Damage", 3).getInt();
		 MSMDataProxy.AwakenedWitherBaneDAMAGE = config.get(MSMDataProxy.Category_Damage, "AwakenedWitherBane Damage", 5).getInt();
		 MSMDataProxy.AwakenedAdminArkDAMAGE = config.get(MSMDataProxy.Category_Damage, "AwakenedAdminArk Damage", 999).getInt();
		 MSMDataProxy.AwakenedFoodSwordDAMAGE = config.get(MSMDataProxy.Category_Damage, "AwakenedCandyCaneSword Damage", 3).getInt();

		 //Normal Sword Durability
		 MSMDataProxy.BlazeSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "BlazeSword Durability", 400).getInt();
		 MSMDataProxy.BloodSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "BloodSword Durability", 1500).getInt();
		 MSMDataProxy.BoneSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "BoneSword Durability", 200).getInt();
		 MSMDataProxy.GlassSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "GlassSword Durability", 15).getInt();
		 MSMDataProxy.InfinitySwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "InfinitySword Durability", 650).getInt();
		 MSMDataProxy.LapisSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "LapisSword Durability", 750).getInt();
		 MSMDataProxy.MoltenSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "MoltenSword Durability", 300).getInt();
		 MSMDataProxy.AqueousSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "AqueousSword Durability", 300).getInt();
		 MSMDataProxy.MasterSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "MasterSword Durability", 1450).getInt();
		 MSMDataProxy.DragonSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "DragonSword Durability", 750).getInt();
		 MSMDataProxy.EyeEndSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "EyeEndSword Durability", 1750).getInt();
		 MSMDataProxy.AethersGuardDURABILITY = config.get(MSMDataProxy.Category_Durability, "AethersGuard Durability", 1000).getInt();
		 MSMDataProxy.WitherBaneDURABILITY = config.get(MSMDataProxy.Category_Durability, "WitherBane Durability", 1000).getInt();
		 MSMDataProxy.AdminArkDURABILITY = config.get(MSMDataProxy.Category_Durability, "AdminArk Durability", 99999999).getInt();
		 MSMDataProxy.FoodSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "CandyCaneSword Durability", 350).getInt();
		 
		 //Awakened Sword Durability
		 MSMDataProxy.AwakenedBlazeSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "AwakenedBlazeSword Durability", 400).getInt();
		 MSMDataProxy.AwakenedBloodSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "AwakenedBloodSword Durability", 1500).getInt();
		 MSMDataProxy.AwakenedBoneSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "AwakenedBoneSword Durability", 200).getInt();
		 MSMDataProxy.AwakenedGlassSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "AwakenedGlassSword Durability", 15).getInt();
		 MSMDataProxy.AwakenedInfinitySwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "AwakenedInfinitySword Durability", 650).getInt();
		 MSMDataProxy.AwakenedLapisSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "AwakenedLapisSword Durability", 750).getInt();
		 MSMDataProxy.AwakenedMoltenSwordDURABILITY = config.get(MSMDataProxy.Category_Durability,"AwakenedMoltenSword Durability", 300).getInt();
		 MSMDataProxy.AwakenedAqueousSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "AwakenedAqueousSword Durability", 300).getInt();
		 MSMDataProxy.AwakenedMasterSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "AwakenedMasterSword Durability", 2750).getInt();
		 MSMDataProxy.AwakenedDragonSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "AwakenedDragonSword Durability", 750).getInt();
		 MSMDataProxy.AwakenedEyeEndSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "AwakenedEyeEndSword Durability Durability", 1750).getInt();
		 MSMDataProxy.AwakenedAethersGuardDURABILITY = config.get(MSMDataProxy.Category_Durability, "AwakenedAethersGuard Durability", 777).getInt();
		 MSMDataProxy.AwakenedWitherBaneDURABILITY = config.get(MSMDataProxy.Category_Durability, "AwakenedWitherBane Durability", 666).getInt();
		 MSMDataProxy.AwakenedAdminArkDURABILITY = config.get(MSMDataProxy.Category_Durability, "AwakenedAdminArk Durability", 99999999).getInt();
		 MSMDataProxy.AwakenedFoodSwordDURABILITY = config.get(MSMDataProxy.Category_Durability, "AwakenedCandyCaneSword Durability", 350).getInt();
	     
		 //Sword Abilities
		 //AdminArk
		 MSMDataProxy.StealthDuration = config.get(MSMDataProxy.Categroy_Effects, "Stealth Duration", 200000).getInt();
		 MSMDataProxy.StealthStrength = config.get(MSMDataProxy.Categroy_Effects, "Stelth Strength Level", 10).getInt();
		 
		 //AethersGuard
		 MSMDataProxy.AetherStrength = config.get(MSMDataProxy.Categroy_Effects, "Nockup Level", 0.25).getInt();
		 
		 //Aqueous
		 MSMDataProxy.IceDuration = config.get(MSMDataProxy.Categroy_Effects, "Ice Aura Duration", 200).getInt();
		 MSMDataProxy.IceStrength = config.get(MSMDataProxy.Categroy_Effects, "Ice Aura Strength Level", 5).getInt();
		 
		 //Blaze
		 MSMDataProxy.BlazeDebuff = config.get(MSMDataProxy.Categroy_Effects,"BlazeSword Durability Penelty" , 100).getInt();
		 MSMDataProxy.BlazeFireDuration = config.get(MSMDataProxy.Categroy_Effects, "BlazeSword Fire Damage", 4).getInt();
		 
		 //Blood
		 MSMDataProxy.BloodHealthDuration = config.get(MSMDataProxy.Categroy_Effects, "BloodSword Helth Durations", 5).getInt();
		 MSMDataProxy.BloodSpeedDuration = config.get(MSMDataProxy.Categroy_Effects, "BloodSword Speed Durations", 200).getInt();
		 MSMDataProxy.BloodRegenDuration = config.get(MSMDataProxy.Categroy_Effects, "BloodSword Regen Durations", 200).getInt();
		 MSMDataProxy.BloodHealthStrength = config.get(MSMDataProxy.Categroy_Effects, "BloodSword Helth Level", 0).getInt();
		 MSMDataProxy.BloodSpeedStrength = config.get(MSMDataProxy.Categroy_Effects, "BloodSword Speed Level", 0).getInt();
		 MSMDataProxy.BloodRegenStrength = config.get(MSMDataProxy.Categroy_Effects, "BloodSword Regen Level", 0).getInt();
		 MSMDataProxy.BloodDebuff = config.get(MSMDataProxy.Categroy_Effects,"BloodSword Durability Damage", 500).getInt();
		 MSMDataProxy.BloodRepair = config.get(MSMDataProxy.Categroy_Effects,"BloodSword Durability Repair", 10).getInt();
		 
		 //Bone
		  //Unavailable
		 
		 //Dragon
		  //Unavailable 
		 
		 //EyeEnd
		 MSMDataProxy.EnderDebuff = config.get(MSMDataProxy.Categroy_Effects, "Eye End Durability Damage", 100).getInt();
		 
		 //FoodSword
		 MSMDataProxy.SugarStrength = config.get(MSMDataProxy.Categroy_Effects, "Sugar Rush Level", 0).getInt();
		 MSMDataProxy.SugarDuration = config.get(MSMDataProxy.Categroy_Effects, "SugarRust Duration", 300).getInt();
		 MSMDataProxy.FoodStatFood = config.get(MSMDataProxy.Categroy_Effects, "FoodSword(food points)", 4).getInt();
		 MSMDataProxy.FoodStatSaturation = config.get(MSMDataProxy.Categroy_Effects, "FoodSword(Saturation)", 4).getInt();
		 
		 //Glass
		  //Unavailable
		 
		 //Infinity
		  //Unavailable
		 
		 //Lapis
		  //Unavailable
		 
		 //MasterSword
		  //Unavailable
		 
		 //Molten
		 MSMDataProxy.MoltenFireDuration = config.get(MSMDataProxy.Categroy_Effects, "MoltenEdge Fire Damage", 8).getInt();
		 
		 //Wither
		 MSMDataProxy.DecayStrength = config.get(MSMDataProxy.Categroy_Effects, "Decay Effect Strength", 0).getInt();
		 MSMDataProxy.DecayDuration = config.get(MSMDataProxy.Categroy_Effects,"Dacay Effect Duration", 300).getInt();
		 
		 //Mod Settings
		 MSMDataProxy.OldRecipe = config.get(MSMDataProxy.Category_Options, "Use old recipes?", false).getBoolean(false);
		 MSMDataProxy.NewRecipe = config.get(MSMDataProxy.Category_Options, "Use new recipes?", true).getBoolean(false);
		 MSMDataProxy.AwakenedOldRecipe = config.get(MSMDataProxy.Category_Options, "Awake with old recipe?", false).getBoolean(false);
		 MSMDataProxy.AwakenedNewRecipe = config.get(MSMDataProxy.Category_Options, "Awake with new recipe?", false).getBoolean(false);
		config.save();
	}
}
