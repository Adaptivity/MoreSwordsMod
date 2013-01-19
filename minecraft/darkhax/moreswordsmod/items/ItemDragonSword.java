package darkhax.moreswordsmod.items;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import darkhax.moreswordsmod.MoreSwordsMod;



public class ItemDragonSword extends MSMSword{
	public ItemDragonSword(int i){
		super(i);
		setMaxDamage(MoreSwordsMod.data.DragonSwordDURABILITY);
		setDamage(MoreSwordsMod.data.DragonSwordDAMAGE);
		setItemName("DragonSword");
	}
}


