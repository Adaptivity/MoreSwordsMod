package darkhax.moreswordsmod.items;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import darkhax.moreswordsmod.MoreSwordsMod;



public class ItemWitherBane extends MSMSword{
	public ItemWitherBane(int i){
		super(i);
		setMaxDamage(MoreSwordsMod.data.WitherBaneDURABILITY);
		setDamage(MoreSwordsMod.data.WitherBaneDAMAGE);
		setItemName("WitherBane");
	}
}


