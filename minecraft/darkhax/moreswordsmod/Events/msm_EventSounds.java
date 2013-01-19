package darkhax.moreswordsmod.Events;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import darkhax.moreswordsmod.MoreSwordsMod;

public class msm_EventSounds
{
    @ForgeSubscribe
    public void onSound(SoundLoadEvent event)
    {
        try 
        {
        	//add a line for every single 
            event.manager.soundPoolSounds.addSound("msm/loz.ogg", MoreSwordsMod.class.getResource("/msm/loz.ogg"));      
            event.manager.soundPoolSounds.addSound("msm/blaze.ogg", MoreSwordsMod.class.getResource("/msm/blaze.ogg"));  
            event.manager.soundPoolSounds.addSound("msm/death.ogg", MoreSwordsMod.class.getResource("/msm/death.ogg"));  
            event.manager.soundPoolSounds.addSound("msm/flow.ogg", MoreSwordsMod.class.getResource("/msm/flow.ogg"));  
        
        } 
        catch (Exception e)
        {
            System.err.println("Fuck it looks like darkhax did something wrong. go bitch at him!");
        }
    }
}