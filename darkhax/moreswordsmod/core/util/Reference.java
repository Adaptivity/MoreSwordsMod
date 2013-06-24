package darkhax.moreswordsmod.core.util;

import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;

public class Reference {

    public static final String id = "MoreSwordsMod";
    public static final String name = "More Swords Mod";
    public static final String version = "2.5.0";
    public static final String common = "darkhax.moreswordsmod.core.proxy.CommonProxy";
    public static final String client = "darkhax.moreswordsmod.core.proxy.ClientProxy";
    
	public static Logger logger = Logger.getLogger("MoreSwords");
	
	static {
		logger.setParent(FMLLog.getLogger());
	}
		
		

}
