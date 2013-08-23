package darkhax.moreswords.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import darkhax.moreswords.MoreSwords;
import darkhax.moreswords.core.util.Config;
import darkhax.moreswords.tileentity.TileEntityAwakenTable;
import net.minecraft.block.Block;

public class Blocks {
	
	public static Block awakenmentTable;
	
	public static void load() {
		
		awakenmentTable = new BlockAwakenTable(Config.AwakenTableID).setCreativeTab(MoreSwords.tabSwords);
		GameRegistry.registerBlock(awakenmentTable);
		GameRegistry.registerTileEntity(TileEntityAwakenTable.class, "awakenTable");
		LanguageRegistry.addName(awakenmentTable, "Awakening Table");
		
	}
}
