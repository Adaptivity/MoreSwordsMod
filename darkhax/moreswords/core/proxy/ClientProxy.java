package darkhax.moreswords.core.proxy;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import darkhax.moreswords.core.events.ToolTipHandler;
import darkhax.moreswords.core.util.Config;


public class ClientProxy extends CommonProxy{
	
	@SideOnly(Side.CLIENT)
	public void renderVillager(){
		
		VillagerRegistry.instance().registerVillagerSkin(Config.swordsmanID, new ResourceLocation ("moreswords:textures/misc/swordsman.png"));
	}

	public void registerEvents() {
		
		MinecraftForge.EVENT_BUS.register(new ToolTipHandler());
	}
}
