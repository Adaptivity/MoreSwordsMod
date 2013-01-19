package darkhax.moreswordsmod.client;

import java.util.Collection;

import net.minecraftforge.client.MinecraftForgeClient;
import darkhax.moreswordsmod.MoreSwordsMod;
import darkhax.moreswordsmod.server.MSMCommonProxy;

public class MSMClientProxy extends MSMCommonProxy{
	@Override
	public void registerRenderThings(){
		Collection<String> textures = MoreSwordsMod.pathing.textures.values();
		
		for(String texture : textures){
			MinecraftForgeClient.preloadTexture(texture);
		}
	}
	
	@Override
	public void addTextureForPreload(String path, String textureName){
		MoreSwordsMod.pathing.addTextureToPreloadIndex(path, textureName);
	}
	
	@Override
	public String getTexturePathFromIndex(String name){
		return MoreSwordsMod.pathing.getTexturePathFromIndex("TEXTURE_" + name.toUpperCase());
	}
}
