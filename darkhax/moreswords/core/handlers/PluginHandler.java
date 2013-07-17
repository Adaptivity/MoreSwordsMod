package darkhax.moreswords.core.handlers;

import darkhax.moreswords.core.plugins.PluginEplus;

public class PluginHandler {
	
	public static void initEplus(){
		
		try {
	        PluginEplus.init();
	      } 
		
		catch (Exception exception) {
	        throw new RuntimeException();
	      }
	}

}
