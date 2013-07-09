package darkhax.moreswords.core.util;

import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;

public class Reference {

    public static final String id = "MoreSwordsMod";
    public static final String name = "More Swords Mod";
    public static final String version = "2.5.0";
    public static final String common = "darkhax.moreswords.core.proxy.CommonProxy";
    public static final String client = "darkhax.moreswords.core.proxy.ClientProxy";
    
    public static RandomRange random = new RandomRange();
    
	public static Logger logger = Logger.getLogger("MoreSwords");
	
	static {
		logger.setParent(FMLLog.getLogger());
	}
		
		

}
