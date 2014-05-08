package net.darkhax.moreswords.core.handlers;

import net.darkhax.moreswords.core.util.Config;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class EnumHanlder {
	
	public static Config cfg;
	
	public static final ToolMaterial blaze = EnumHelper.addToolMaterial("blaze", 2, cfg.blazeUse, 6.0F, cfg.blazeDmg - 4, 14);
	public static final ToolMaterial blood = EnumHelper.addToolMaterial("blood", 2, cfg.bloodUse, 6.0F, cfg.bloodDmg - 4, 14);
	public static final ToolMaterial bone = EnumHelper.addToolMaterial("bone", 2, cfg.boneUse, 6.0F, cfg.boneDmg - 4, 14);
	public static final ToolMaterial dragon = EnumHelper.addToolMaterial("dragon", 2, cfg.dragonUse, 6.0F, cfg.dragonDmg - 4, 14);
	public static final ToolMaterial eye = EnumHelper.addToolMaterial("eye", 2, cfg.eyeUse, 6.0F, cfg.eyeDmg - 4, 14);
	public static final ToolMaterial glass = EnumHelper.addToolMaterial("glass", 2, cfg.glassUse, 6.0F, cfg.glassDmg - 4, 14);
	public static final ToolMaterial infinity = EnumHelper.addToolMaterial("infinity", 2, cfg.infinityUse, 6.0F, cfg.infinityDmg - 4, 14);
	public static final ToolMaterial lapis = EnumHelper.addToolMaterial("lapis", 2, cfg.lapisUse, 6.0F, cfg.lapisDmg - 4, 14);
	public static final ToolMaterial molten = EnumHelper.addToolMaterial("molten", 2, cfg.moltenUse, 6.0F, cfg.moltenDmg - 4, 14);
	public static final ToolMaterial master = EnumHelper.addToolMaterial("master", 2, cfg.masterUse, 6.0F, cfg.masterDmg - 4, 14);
	public static final ToolMaterial aqueous = EnumHelper.addToolMaterial("aqueous", 2, cfg.aqueousUse, 6.0F, cfg.aqueousDmg - 4, 14);
	public static final ToolMaterial aether = EnumHelper.addToolMaterial("aether", 2, cfg.aetherUse, 6.0F, cfg.aetherDmg - 4, 14);
	public static final ToolMaterial wither = EnumHelper.addToolMaterial("wither", 2, cfg.witherUse, 6.0F, cfg.witherDmg - 4, 14);
	public static final ToolMaterial admin = EnumHelper.addToolMaterial("admin", 2, cfg.adminUse, 6.0F, cfg.admingDmg - 4, 14);
}
