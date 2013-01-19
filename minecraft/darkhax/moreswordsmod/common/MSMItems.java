package darkhax.moreswordsmod.common;

import net.minecraft.item.Item;
import darkhax.moreswordsmod.MoreSwordsMod;
import darkhax.moreswordsmod.awakenditems.ItemAwakenedAdminArk;
import darkhax.moreswordsmod.awakenditems.ItemAwakenedAethersGuard;
import darkhax.moreswordsmod.awakenditems.ItemAwakenedAqueousSword;
import darkhax.moreswordsmod.awakenditems.ItemAwakenedBlazeSword;
import darkhax.moreswordsmod.awakenditems.ItemAwakenedBloodSword;
import darkhax.moreswordsmod.awakenditems.ItemAwakenedBoneSword;
import darkhax.moreswordsmod.awakenditems.ItemAwakenedDragonSword;
import darkhax.moreswordsmod.awakenditems.ItemAwakenedEyeEndSword;
import darkhax.moreswordsmod.awakenditems.ItemAwakenedFoodSword;
import darkhax.moreswordsmod.awakenditems.ItemAwakenedGlassSword;
import darkhax.moreswordsmod.awakenditems.ItemAwakenedInfinitySword;
import darkhax.moreswordsmod.awakenditems.ItemAwakenedLapisSword;
import darkhax.moreswordsmod.awakenditems.ItemAwakenedMasterSword;
import darkhax.moreswordsmod.awakenditems.ItemAwakenedMoltenSword;
import darkhax.moreswordsmod.awakenditems.ItemAwakenedWitherBane;
import darkhax.moreswordsmod.items.ItemAdminArk;
import darkhax.moreswordsmod.items.ItemAethersGuard;
import darkhax.moreswordsmod.items.ItemAqueousSword;
import darkhax.moreswordsmod.items.ItemBlazeSword;
import darkhax.moreswordsmod.items.ItemBloodSword;
import darkhax.moreswordsmod.items.ItemBoneSword;
import darkhax.moreswordsmod.items.ItemDragonSword;
import darkhax.moreswordsmod.items.ItemEyeEndSword;
import darkhax.moreswordsmod.items.ItemFoodSword;
import darkhax.moreswordsmod.items.ItemGlassSword;
import darkhax.moreswordsmod.items.ItemInfinitySword;
import darkhax.moreswordsmod.items.ItemLapisSword;
import darkhax.moreswordsmod.items.ItemMasterSword;
import darkhax.moreswordsmod.items.ItemMoltenSword;
import darkhax.moreswordsmod.items.ItemWitherBane;

public class MSMItems{
	
	//normal swords
	public static final Item BlazeSword = new ItemBlazeSword(MSMDataProxy.BlazeSwordID).setIconIndex(0).setItemName("BlazeSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	  
	public static final Item BloodSword = new ItemBloodSword(MSMDataProxy.BloodSwordID).setIconIndex(1).setItemName("BloodSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	  
	public static final Item BoneSword = new ItemBoneSword(MSMDataProxy.BoneSwordID).setIconIndex(2).setItemName("BoneSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	 
	public static final Item DragonSword = new ItemDragonSword(MSMDataProxy.DragonSwordID).setIconIndex(3).setItemName("DragonSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	  
	public static final Item EyeEndSword = new ItemEyeEndSword(MSMDataProxy.EyeEndSwordID).setIconIndex(4).setItemName("EyeEndSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	
	public static final Item GlassSword = new ItemGlassSword(MSMDataProxy.GlassSwordID).setIconIndex(5).setItemName("GlassSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	  
	public static final Item InfinitySword = new ItemInfinitySword(MSMDataProxy.InfinitySwordID).setIconIndex(6).setItemName("InfinitySword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	 
	public static final Item LapisSword = new ItemLapisSword(MSMDataProxy.LapisSwordID).setIconIndex(7).setItemName("LapisSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	  
	public static final Item MoltenSword = new ItemMoltenSword(MSMDataProxy.MoltenSwordID).setIconIndex(8).setItemName("MoltenSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	  
	public static final Item MasterSword = new ItemMasterSword(MSMDataProxy.MasterSwordID).setIconIndex(9).setItemName("MasterSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);
	public static final Item AqueousSword = new ItemAqueousSword(MSMDataProxy.AqueousSwordID).setIconIndex(10).setItemName("AqueousSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	
	public static final Item AethersGuard = new ItemAethersGuard(MSMDataProxy.AethersGuardID).setIconIndex(11).setItemName("AethersGuard").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	
	public static final Item WitherBane = new ItemWitherBane(MSMDataProxy.WitherBaneID).setIconIndex(12).setItemName("witherbane").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	
	public static final Item AdminArk = new ItemAdminArk(MSMDataProxy.AdminArkID).setIconIndex(13).setItemName("AdminArk").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	
	public static final Item CandyCaneSword = new ItemFoodSword(MSMDataProxy.CandyCaneSwordID).setIconIndex(14).setItemName("CandyCane").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);
	public static final Item PumpkinPieSword = new ItemFoodSword(MSMDataProxy.PumpkinPieSwordID).setIconIndex(15).setItemName("PumpkinSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);
	public static final Item GingerManSword = new ItemFoodSword(MSMDataProxy.GingerManSwordID).setIconIndex(16).setItemName("GingerManSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);
	
	//awakened items
	public static final Item AwakenedBlazeSword = new ItemAwakenedBlazeSword(MSMDataProxy.AwakenedBlazeSwordID).setIconIndex(0).setItemName("AwakenedBlazeSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	  
	public static final Item AwakenedBloodSword = new ItemAwakenedBloodSword(MSMDataProxy.AwakenedBloodSwordID).setIconIndex(1).setItemName("AwakenedBloodSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	  
	public static final Item AwakenedBoneSword = new ItemAwakenedBoneSword(MSMDataProxy.AwakenedBoneSwordID).setIconIndex(2).setItemName("AwakenedBoneSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	 
	public static final Item AwakenedDragonSword = new ItemAwakenedDragonSword(MSMDataProxy.AwakenedDragonSwordID).setIconIndex(3).setItemName("AwakenedDragonSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	  
	public static final Item AwakenedEyeEndSword = new ItemAwakenedEyeEndSword(MSMDataProxy.AwakenedEyeEndSwordID).setIconIndex(4).setItemName("AwakenedEyeEndSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	
	public static final Item AwakenedGlassSword = new ItemAwakenedGlassSword(MSMDataProxy.AwakenedGlassSwordID).setIconIndex(5).setItemName("AwakenedGlassSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	  
	public static final Item AwakenedInfinitySword = new ItemAwakenedInfinitySword(MSMDataProxy.AwakenedInfinitySwordID).setIconIndex(6).setItemName("AwakendInfinitySword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	 
	public static final Item AwakenedLapisSword = new ItemAwakenedLapisSword(MSMDataProxy.AwakenedLapisSwordID).setIconIndex(7).setItemName("AwakenedLapisSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	  
	public static final Item AwakenedMoltenSword = new ItemAwakenedMoltenSword(MSMDataProxy.AwakenedMoltenSwordID).setIconIndex(8).setItemName("AwakenedMoltenSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	  
	public static final Item AwakenedMasterSword = new ItemAwakenedMasterSword(MSMDataProxy.AwakenedMasterSwordID).setIconIndex(9).setItemName("AwakenedMasterSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);
	public static final Item AwakenedAqueousSword = new ItemAwakenedAqueousSword(MSMDataProxy.AwakenedAqueousSwordID).setIconIndex(10).setItemName("AwakenedAqueousSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	
	public static final Item AwakenedAethersGuard = new ItemAwakenedAethersGuard(MSMDataProxy.AwakenedAethersGuardID).setIconIndex(11).setItemName("AwakenedAethersGuard").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	
	public static final Item AwakenedWitherBane = new ItemAwakenedWitherBane(MSMDataProxy.AwakenedWitherBaneID).setIconIndex(12).setItemName("AwakenedWitherBane").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	
	public static final Item AwakenedAdminArk = new ItemAwakenedAdminArk(MSMDataProxy.AwakenedAdminArkID).setIconIndex(13).setItemName("AwakenedAdminArk").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);	
	public static final Item AwakenedCandyCaneSword = new ItemAwakenedFoodSword(MSMDataProxy.AwakenedCandyCaneSwordID).setIconIndex(14).setItemName("AwakenedCandyCane").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);
	public static final Item AwakenedPumpkinPieSword = new ItemAwakenedFoodSword(MSMDataProxy.AwakenedPumpkinPieSwordID).setIconIndex(15).setItemName("AwakenedPumpkinSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);
	public static final Item AwakenedGingerManSword = new ItemAwakenedFoodSword(MSMDataProxy.AwakenedGingerManSwordID).setIconIndex(16).setItemName("AwakenedGingerManSword").setCreativeTab(MoreSwordsMod.tabMoreSwordsMod);
   }


