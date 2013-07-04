package darkhax.moreswords.core.handlers;

import darkhax.moreswords.core.util.Config;
import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

public class EnumHanlder {
	
	public static Config cfg;
	
	public static final EnumToolMaterial blaze = EnumHelper.addToolMaterial("blaze", 2, cfg.blazeUse, 6.0F, cfg.blazeDmg - 4, 14);
	public static final EnumToolMaterial blood = EnumHelper.addToolMaterial("blood", 2, cfg.bloodUse, 6.0F, cfg.bloodDmg - 4, 14);
	public static final EnumToolMaterial bone = EnumHelper.addToolMaterial("bone", 2, cfg.boneUse, 6.0F, cfg.boneDmg - 4, 14);
	public static final EnumToolMaterial dragon = EnumHelper.addToolMaterial("dragon", 2, cfg.dragonUse, 6.0F, cfg.dragonDmg - 4, 14);
	public static final EnumToolMaterial eye = EnumHelper.addToolMaterial("eye", 2, cfg.eyeUse, 6.0F, cfg.eyeDmg - 4, 14);
	public static final EnumToolMaterial glass = EnumHelper.addToolMaterial("glass", 2, cfg.glassUse, 6.0F, cfg.glassDmg - 4, 14);
	public static final EnumToolMaterial infinity = EnumHelper.addToolMaterial("infinity", 2, cfg.infinityUse, 6.0F, cfg.infinityDmg - 4, 14);
	public static final EnumToolMaterial lapis = EnumHelper.addToolMaterial("lapis", 2, cfg.lapisUse, 6.0F, cfg.lapisDmg - 4, 14);
	public static final EnumToolMaterial molten = EnumHelper.addToolMaterial("molten", 2, cfg.moltenUse, 6.0F, cfg.moltenDmg - 4, 14);
	public static final EnumToolMaterial master = EnumHelper.addToolMaterial("master", 2, cfg.masterUse, 6.0F, cfg.masterDmg - 4, 14);
	public static final EnumToolMaterial aqueous = EnumHelper.addToolMaterial("aqueous", 2, cfg.aqueousUse, 6.0F, cfg.aqueousDmg - 4, 14);
	public static final EnumToolMaterial aether = EnumHelper.addToolMaterial("aether", 2, cfg.aetherUse, 6.0F, cfg.aetherDmg - 4, 14);
	public static final EnumToolMaterial wither = EnumHelper.addToolMaterial("wither", 2, cfg.witherUse, 6.0F, cfg.witherDmg - 4, 14);
	public static final EnumToolMaterial admin = EnumHelper.addToolMaterial("admin", 2, cfg.adminUse, 6.0F, cfg.admingDmg - 4, 14);
}
