package darkhax.moreswords.core.proxy;

import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import darkhax.moreswords.core.util.Config;
import darkhax.moreswords.inventory.ContainerAwakenTable;
import darkhax.moreswords.render.RenderAwakenTable;
import darkhax.moreswords.tileentity.TileEntityAwakenTable;


public class ClientProxy extends CommonProxy{
	
	@SideOnly(Side.CLIENT)
	public static void renderVillager(){
		
		VillagerRegistry.instance().registerVillagerSkin(Config.swordsmanID, new ResourceLocation ("moreswords:textures/misc/swordsman.png"));
		ClientRegistry.bindTileEntitySpecialRenderer( darkhax.moreswords.tileentity.TileEntityAwakenTable.class, new RenderAwakenTable());
	}

}
