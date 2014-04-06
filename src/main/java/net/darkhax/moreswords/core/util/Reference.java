package net.darkhax.moreswords.core.util;

import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;

public class Reference {

    public static final String id = "MoreSwordsMod";
    public static final String name = "More Swords Mod";
    public static final String version = "2.6.2";
    public static final String common = "net.darkhax.moreswords.core.proxy.CommonProxy";
    public static final String client = "net.darkhax.moreswords.core.proxy.ClientProxy";
    
    public static RandomRange random = new RandomRange();
}
