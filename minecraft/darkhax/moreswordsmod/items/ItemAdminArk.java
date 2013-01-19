package darkhax.moreswordsmod.items;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import darkhax.moreswordsmod.MoreSwordsMod;



public class ItemAdminArk extends MSMSword{
	public ItemAdminArk(int i){
		super(i);
		setMaxDamage(MoreSwordsMod.data.AdminArkDURABILITY);
		setDamage(MoreSwordsMod.data.AdminArkDAMAGE);
		setItemName("AdminArk");
	}
	
}


