package darkhax.moreswordsmod.items;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import darkhax.moreswordsmod.MoreSwordsMod;


public class ItemEyeEndSword extends MSMSword{
	public ItemEyeEndSword(int i){
		super(i);
		setMaxDamage(MoreSwordsMod.data.EyeEndSwordDURABILITY);
		setDamage(MoreSwordsMod.data.EyeEndSwordDAMAGE);
		setItemName("EyeEndSword");
	}
}


