package darkhax.moreswordsmod;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import darkhax.moreswordsmod.common.MSMConfiguration;
import darkhax.moreswordsmod.common.MSMDataProxy;
import darkhax.moreswordsmod.common.MSMItems;
import darkhax.moreswordsmod.common.MSMNaming;
import darkhax.moreswordsmod.common.MSMCraftingRegistry;
import darkhax.moreswordsmod.common.MSMPathing;
import darkhax.moreswordsmod.common.TabMoreSwordsMod;

@Mod(modid = "darkhax_msm", name = "MoreSwordMod", version = "2.4.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MoreSwordsMod{
	public static CreativeTabs tabMoreSwordsMod = new TabMoreSwordsMod(CreativeTabs.getNextID(), "TabMoreSwordsMod");
	
	public static MSMConfiguration config;
	public static MSMDataProxy data;
	public static MSMPathing pathing;
	public static MSMItems items;
	public static MSMNaming naming;
	public static MSMCraftingRegistry oldrecipies;
	
	@SidedProxy(serverSide="darkhax.moreswordsmod.server.MSMCommonProxy", clientSide="darkhax.moreswordsmod.client.MSMClientProxy")
	public static darkhax.moreswordsmod.server.MSMCommonProxy proxy;
	
	@Instance("darkhax_msm")
    public static MoreSwordsMod instance;
	
	@Init
	public void Init(FMLInitializationEvent event){
		new MSMNaming(true);
		new MSMCraftingRegistry(true);


		proxy.addTextureForPreload("swords.png", "TEXTURE_SWORDS");
		proxy.registerRenderThings();
	}

	@PreInit
	public void PreInit(FMLPreInitializationEvent event){
		System.out.println("MoreSwordsMod By Darkhax Detected!");
		config = new MSMConfiguration(event);
		data = new MSMDataProxy();
	}
}
