package darkhax.moreswords.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import darkhax.moreswords.MoreSwords;
import darkhax.moreswords.tileentity.TileEntityAwakenTable;
import net.minecraft.block.Block;

public class Blocks {
	
	public static Block awakenmentTable;
	
	public static void load() {
		
		awakenmentTable = new BlockAwakenTable(3000).setCreativeTab(MoreSwords.tabSwords);
		GameRegistry.registerBlock(awakenmentTable);
		GameRegistry.registerTileEntity(TileEntityAwakenTable.class, "awakenTable");
	}

}
