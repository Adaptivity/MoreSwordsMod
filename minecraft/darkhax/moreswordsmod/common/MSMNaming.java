package darkhax.moreswordsmod.common;

import cpw.mods.fml.common.registry.LanguageRegistry;


public class MSMNaming{
	public MSMNaming(boolean flag){
		if(flag){
			try{
				addItemNames();
			} catch(Exception exception){
				throw new RuntimeException("Error Detected When Adding MoreSwordsMod Item Names");
			}
		} else{
			addItemNames();
		}
	}
	
	private void addItemNames(){
		//language registers 
		LanguageRegistry.addName(MSMItems.BlazeSword, "\u00a76Blaze Sword");	  
		LanguageRegistry.addName(MSMItems.BloodSword, "\u00a74Blood Sword");	  
		LanguageRegistry.addName(MSMItems.BoneSword, "\u00a7fBone Sword");	  
		LanguageRegistry.addName(MSMItems.DragonSword, "\u00a75Draconic Sword");	  
		LanguageRegistry.addName(MSMItems.EyeEndSword, "\u00a7aEyeEnd Sword");
		LanguageRegistry.addName(MSMItems.GlassSword, "\u00a78Glass Sword");	  
		LanguageRegistry.addName(MSMItems.InfinitySword, "\u00a77Infinity Sword");	
		LanguageRegistry.addName(MSMItems.LapisSword, "\u00a71Lapis Sword");	  
		LanguageRegistry.addName(MSMItems.MoltenSword, "\u00a7cMolten Sword");
		LanguageRegistry.addName(MSMItems.AqueousSword, "\u00a7bAqueous Sword");	  
		LanguageRegistry.addName(MSMItems.MasterSword, "\u00a73Master Sword");	
		LanguageRegistry.addName(MSMItems.AethersGuard, "Aether's Guard");
		LanguageRegistry.addName(MSMItems.WitherBane, "Wither Bane");
		LanguageRegistry.addName(MSMItems.AdminArk, "\u00a74A\u00a76d\u00a7Em\u00a72i\u00a71n \u00a75A\u00a7dr\u00a7ak");
		LanguageRegistry.addName(MSMItems.CandyCaneSword, "\u00a74C\u00a7fa\u00a74n\u00a7fd\u00a74y \u00a7fC\u00a74a\u00a7fn\u00a74e \u00a7fS\u00a74w\u00a7fo\u00a74r\u00a7fd");
		LanguageRegistry.addName(MSMItems.PumpkinPieSword, "Pumpkin Pie Sword");
		LanguageRegistry.addName(MSMItems.GingerManSword, "Gingerbread Man");
		
		LanguageRegistry.addName(MSMItems.AwakenedBlazeSword, "\u00a76Blaze Sword");	  
		LanguageRegistry.addName(MSMItems.AwakenedBloodSword, "\u00a74Blood Sword");	  
		LanguageRegistry.addName(MSMItems.AwakenedBoneSword, "\u00a7fBone Sword");	  
		LanguageRegistry.addName(MSMItems.AwakenedDragonSword, "\u00a75Draconic Sword");	  
		LanguageRegistry.addName(MSMItems.AwakenedEyeEndSword, "\u00a7aEyeEnd Sword");
		LanguageRegistry.addName(MSMItems.AwakenedGlassSword, "\u00a78Glass Sword");	  
		LanguageRegistry.addName(MSMItems.AwakenedInfinitySword, "\u00a77Infinity Sword");	
		LanguageRegistry.addName(MSMItems.AwakenedLapisSword, "\u00a71Lapis Sword");	  
		LanguageRegistry.addName(MSMItems.AwakenedMoltenSword, "\u00a7cMolten Sword");
		LanguageRegistry.addName(MSMItems.AwakenedAqueousSword, "\u00a7bAqueous Sword");	  
		LanguageRegistry.addName(MSMItems.AwakenedMasterSword, "\u00a73Master Sword");	
		LanguageRegistry.addName(MSMItems.AwakenedAethersGuard, "Aether's Guard");
		LanguageRegistry.addName(MSMItems.AwakenedWitherBane, "Wither Bane");
		LanguageRegistry.addName(MSMItems.AwakenedAdminArk, "\u00a74A\u00a76d\u00a7Em\u00a72i\u00a71n \u00a75A\u00a7dr\u00a7ak");
		LanguageRegistry.addName(MSMItems.AwakenedCandyCaneSword, "\u00a74C\u00a7fa\u00a74n\u00a7fd\u00a74y \u00a7fC\u00a74a\u00a7fn\u00a74e \u00a7fS\u00a74w\u00a7fo\u00a74r\u00a7fd");
		LanguageRegistry.addName(MSMItems.AwakenedPumpkinPieSword, "Pumpkin Pie Sword");
		LanguageRegistry.addName(MSMItems.AwakenedGingerManSword, "Gingerbread Man");
	
	}
}
