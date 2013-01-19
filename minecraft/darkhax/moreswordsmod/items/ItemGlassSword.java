package darkhax.moreswordsmod.items;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import darkhax.moreswordsmod.MoreSwordsMod;



public class ItemGlassSword extends MSMSword{
	public ItemGlassSword(int i){
		super(i);
		setMaxDamage(MoreSwordsMod.data.GlassSwordDURABILITY);
		setDamage(MoreSwordsMod.data.GlassSwordDAMAGE);
		setItemName("GlassSword");
	}
}


