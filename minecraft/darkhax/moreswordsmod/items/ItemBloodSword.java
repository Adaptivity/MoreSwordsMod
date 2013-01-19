package darkhax.moreswordsmod.items;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import darkhax.moreswordsmod.MoreSwordsMod;



public class ItemBloodSword extends MSMSword{
	public ItemBloodSword(int i){
		super(i);
		setMaxDamage(MoreSwordsMod.data.BloodSwordDURABILITY);
		setDamage(MoreSwordsMod.data.BloodSwordDAMAGE);
		setItemName("BloodSword");
	}
}


