package darkhax.moreswordsmod.common;

import java.util.HashMap;

public class MSMPathing{
	public static HashMap<String, String> textures = new HashMap<String, String>();
	
	public static void addTextureToPreloadIndex(String fileName, String indexName){
		textures.put(indexName, "/darkhax/moreswordsmod/textures/" + fileName);
	}
	
	public static String getTexturePathFromIndex(String name){
		return textures.get(name);
	}
}
