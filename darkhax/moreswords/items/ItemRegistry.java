package darkhax.moreswords.items;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;
import darkhax.moreswords.MoreSwords;
import darkhax.moreswords.core.util.Config;
import darkhax.moreswords.core.util.Strings;

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
		
		blazeSword = new ItemCoreSword(cfg.blazeSwordID, null, cfg.blazeDmg, 0, cfg.blazeUse, new ItemStack(Item.blazeRod), "blaze").setUnlocalizedName(Strings.blaze);
		bloodSword = new ItemCoreSword(cfg.bloodSwordID, null, cfg.bloodDmg, 0, cfg.bloodUse, new ItemStack(Block.obsidian), "blood").setUnlocalizedName(Strings.blood);
		boneSword = new ItemCoreSword(cfg.boneSwordID, null, cfg.boneDmg, 0, cfg.boneUse, new ItemStack(Item.bone), "bone").setUnlocalizedName(Strings.bone);
		dragonSword = new ItemCoreSword(cfg.dragonSwordID, null, cfg.dragonDmg, 0, cfg.dragonUse, new ItemStack(Item.diamond), "dragon").setUnlocalizedName(Strings.dragon);
		eyeEndSword = new ItemCoreSword(cfg.eyeEndSwordID, null, cfg.eyeDmg, 0, cfg.eyeUse, new ItemStack(Item.enderPearl), "eye").setUnlocalizedName(Strings.eye);
		glassSword = new ItemCoreSword(cfg.glassSwordID, null, cfg.glassDmg, 0, cfg.glassUse, new ItemStack(Block.thinGlass), "glass").setUnlocalizedName(Strings.glass);
		infinitySword = new ItemCoreSword(cfg.infinitySwordID, null, cfg.infinityDmg, 0, cfg.infinityUse, new ItemStack(Item.ingotIron), "infinity").setUnlocalizedName(Strings.infinity);
		lapisSword = new ItemCoreSword(cfg.lapisSwordID, null, cfg.lapisDmg, 0, cfg.lapisUse, new ItemStack(Block.blockLapis), "lapis").setUnlocalizedName(Strings.lapis);
		moltenSword = new ItemCoreSword(cfg.moltenSwordID, null, cfg.moltenDmg, 0, cfg.moltenUse, new ItemStack(Item.bucketLava), "molten").setUnlocalizedName(Strings.molten);
		masterSword = new ItemCoreSword(cfg.masterSwordID, null, cfg.masterDmg, 0, cfg.masterUse, new ItemStack(Item.ingotGold), "master").setUnlocalizedName(Strings.master);
		aqueousSword = new ItemCoreSword(cfg.aqueousSwordID, null, cfg.aqueousDmg, 0, cfg.aqueousUse, new ItemStack(Item.ingotIron), "aqueous").setUnlocalizedName(Strings.aqueous);
		aethersGuard = new ItemCoreSword(cfg.aethersGuardID, null, cfg.aetherDmg, 0, cfg.aetherUse, new ItemStack(Item.diamond), "aether").setUnlocalizedName(Strings.aether);
		witherBane = new ItemCoreSword(cfg.witherBaneID, null, cfg.witherDmg, 0, cfg.witherUse, new ItemStack(Block.slowSand), "wither").setUnlocalizedName(Strings.wither);
		adminArk = new ItemCoreSword(cfg.adminArkID, null, cfg.admingDmg, 0, cfg.adminUse, new ItemStack(Block.bedrock), "admin").setUnlocalizedName(Strings.admin);
	
		
		MoreSwords.lang.registerItem(blazeSword);
		MoreSwords.lang.registerItem(bloodSword);
		MoreSwords.lang.registerItem(boneSword);
		MoreSwords.lang.registerItem(dragonSword);
		MoreSwords.lang.registerItem(eyeEndSword);
		MoreSwords.lang.registerItem(glassSword);
		MoreSwords.lang.registerItem(infinitySword);
		MoreSwords.lang.registerItem(lapisSword);
		MoreSwords.lang.registerItem(moltenSword);
		MoreSwords.lang.registerItem(masterSword);
		MoreSwords.lang.registerItem(aqueousSword);
		MoreSwords.lang.registerItem(aethersGuard);
		MoreSwords.lang.registerItem(witherBane);
		MoreSwords.lang.registerItem(adminArk);
	}
}