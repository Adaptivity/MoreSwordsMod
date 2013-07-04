package darkhax.moreswords.items;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import darkhax.moreswords.MoreSwords;
import darkhax.moreswords.core.handlers.EnumHanlder;
import darkhax.moreswords.core.util.Config;
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
	
	public static void load(){
		
		blazeSword = new ItemCoreSword(cfg.blazeSwordID, EnumHanlder.blaze, "blaze").setUnlocalizedName("blaze");
		bloodSword = new ItemCoreSword(cfg.bloodSwordID, EnumHanlder.blood, "blood").setUnlocalizedName("blood");
		boneSword = new ItemCoreSword(cfg.boneSwordID, EnumHanlder.bone, "bone").setUnlocalizedName("bone");
		dragonSword = new ItemCoreSword(cfg.dragonSwordID, EnumHanlder.dragon, "dragon").setUnlocalizedName("dragon");
		eyeEndSword = new ItemCoreSword(cfg.eyeEndSwordID, EnumHanlder.eye, "eye").setUnlocalizedName("eye");
		glassSword = new ItemCoreSword(cfg.glassSwordID, EnumHanlder.glass, "glass").setUnlocalizedName("glass");
		infinitySword = new ItemCoreSword(cfg.infinitySwordID, EnumHanlder.infinity, "infinity").setUnlocalizedName("infinity");
		lapisSword = new ItemCoreSword(cfg.lapisSwordID, EnumHanlder.lapis, "lapis").setUnlocalizedName("lapis");
		moltenSword = new ItemCoreSword(cfg.moltenSwordID, EnumHanlder.molten, "molten").setUnlocalizedName("molten");
		masterSword = new ItemCoreSword(cfg.masterSwordID, EnumHanlder.master, "master").setUnlocalizedName("master");
		aqueousSword = new ItemCoreSword(cfg.aqueousSwordID, EnumHanlder.aqueous, "aqueous").setUnlocalizedName("aqueous");
		aethersGuard= new ItemCoreSword(cfg.aethersGuardID, EnumHanlder.aether, "aether").setUnlocalizedName("aether");
		witherBane = new ItemCoreSword(cfg.witherBaneID, EnumHanlder.wither, "wither").setUnlocalizedName("wither");
		adminArk = new ItemCoreSword(cfg.adminArkID, EnumHanlder.admin, "admin").setUnlocalizedName("admin");
	}
}