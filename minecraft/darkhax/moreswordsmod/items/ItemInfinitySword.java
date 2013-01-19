package darkhax.moreswordsmod.items;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import darkhax.moreswordsmod.MoreSwordsMod;



public class ItemInfinitySword extends MSMSword{
	public ItemInfinitySword(int i){
		super(i);
		setMaxDamage(MoreSwordsMod.data.InfinitySwordDURABILITY);
		setDamage(MoreSwordsMod.data.InfinitySwordDAMAGE);
		setItemName("InfinitySword");
	}
}


