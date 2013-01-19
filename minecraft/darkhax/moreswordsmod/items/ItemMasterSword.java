package darkhax.moreswordsmod.items;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import darkhax.moreswordsmod.MoreSwordsMod;



public class ItemMasterSword extends MSMSword{
	public ItemMasterSword(int i){
		super(i);
		setMaxDamage(MoreSwordsMod.data.MasterSwordDURABILITY);
		setDamage(MoreSwordsMod.data.MasterSwordDAMAGE);
		setItemName("MasterSword");
	}
}


