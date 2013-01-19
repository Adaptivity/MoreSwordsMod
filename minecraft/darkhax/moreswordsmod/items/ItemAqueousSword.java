package darkhax.moreswordsmod.items;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import darkhax.moreswordsmod.MoreSwordsMod;



public class ItemAqueousSword extends MSMSword{
	public ItemAqueousSword(int i){
		super(i);
		setMaxDamage(MoreSwordsMod.data.AqueousSwordDURABILITY);
		setDamage(MoreSwordsMod.data.AqueousSwordDAMAGE);
		setItemName("AqueousSword");
	}

}


