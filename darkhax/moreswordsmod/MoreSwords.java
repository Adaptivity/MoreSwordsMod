package darkhax.moreswordsmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

import darkhax.moreswordsmod.core.proxy.CommonProxy;
import darkhax.moreswordsmod.core.util.Reference;

@Mod(modid = Reference.id, name = Reference.name, version = Reference.version)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class MoreSwords{
	
	@SidedProxy(serverSide=Reference.common, clientSide=Reference.client)
	public static CommonProxy proxy;
	
	@Mod.Instance(Reference.id)
    public static MoreSwords instance;
	
	@Mod.PreInit
	public void PreInit(FMLPreInitializationEvent event){		
	}
	
	@Mod.Init
	public void Init(FMLInitializationEvent event){
	}
	
	@Mod.PostInit
	public void PostInit(FMLPostInitializationEvent event){
	}
}
