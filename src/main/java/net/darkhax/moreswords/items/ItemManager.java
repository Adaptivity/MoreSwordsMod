package net.darkhax.moreswords.items;

import net.darkhax.moreswords.core.handlers.EnumHanlder;
import net.darkhax.moreswords.core.util.Config;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemManager {

	public static Item swordBook;
	
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
	
	public static void load(){
		
		blazeSword = new ItemCoreSword(EnumHanlder.blaze, "blaze").setUnlocalizedName("blaze");
		bloodSword = new ItemCoreSword(EnumHanlder.blood, "blood").setUnlocalizedName("blood");
		boneSword = new ItemCoreSword(EnumHanlder.bone, "bone").setUnlocalizedName("bone");
		dragonSword = new ItemCoreSword(EnumHanlder.dragon, "dragon").setUnlocalizedName("dragon");
		eyeEndSword = new ItemCoreSword(EnumHanlder.eye, "eye").setUnlocalizedName("eye");
		glassSword = new ItemCoreSword(EnumHanlder.glass, "glass").setUnlocalizedName("glass");
		infinitySword = new ItemCoreSword(EnumHanlder.infinity, "infinity").setUnlocalizedName("infinity");
		lapisSword = new ItemCoreSword(EnumHanlder.lapis, "lapis").setUnlocalizedName("lapis");
		moltenSword = new ItemCoreSword(EnumHanlder.molten, "molten").setUnlocalizedName("molten");
		masterSword = new ItemCoreSword(EnumHanlder.master, "master").setUnlocalizedName("master");
		aqueousSword = new ItemCoreSword(EnumHanlder.aqueous, "aqueous").setUnlocalizedName("aqueous");
		aethersGuard= new ItemCoreSword(EnumHanlder.aether, "aether").setUnlocalizedName("aether");
		witherBane = new ItemCoreSword(EnumHanlder.wither, "wither").setUnlocalizedName("wither");
		adminArk = new ItemCoreSword(EnumHanlder.admin, "admin").setUnlocalizedName("admin");
		
		swordBook = new ItemSwordinomicon(Config.swordBookID).setUnlocalizedName("swordBook").setTextureName("moreswords:Swordinomicon");
		
		GameRegistry.registerItem(blazeSword, "swordBlaze");
		GameRegistry.registerItem(bloodSword, "swordBlood");
		GameRegistry.registerItem(boneSword, "swordBone");
		GameRegistry.registerItem(dragonSword, "swordDragon");
		GameRegistry.registerItem(eyeEndSword, "swordEye");
		GameRegistry.registerItem(glassSword, "swordGlass");
		GameRegistry.registerItem(infinitySword, "swordInfinity");
		GameRegistry.registerItem(lapisSword, "swordLapis");
		GameRegistry.registerItem(moltenSword, "swordMolten");
		GameRegistry.registerItem(masterSword, "swordMaster");
		GameRegistry.registerItem(aqueousSword, "swordAqueous");
		GameRegistry.registerItem(aethersGuard, "swordAether");
		GameRegistry.registerItem(witherBane, "swordWither");
		GameRegistry.registerItem(adminArk, "swordAdmin");
		GameRegistry.registerItem(swordBook, "swordBook");
	}
}