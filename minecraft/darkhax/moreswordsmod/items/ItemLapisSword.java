package darkhax.moreswordsmod.items;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import darkhax.moreswordsmod.MoreSwordsMod;



public class ItemLapisSword extends MSMSword{
	public ItemLapisSword(int i){
		super(i);
		setMaxDamage(MoreSwordsMod.data.LapisSwordDURABILITY);
		setDamage(MoreSwordsMod.data.LapisSwordDAMAGE);
		setItemName("LapisSword");
	}
}


