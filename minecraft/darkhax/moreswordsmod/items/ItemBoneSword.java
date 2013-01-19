package darkhax.moreswordsmod.items;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import darkhax.moreswordsmod.MoreSwordsMod;



public class ItemBoneSword extends MSMSword{
	public ItemBoneSword(int i){
		super(i);
		setMaxDamage(MoreSwordsMod.data.BoneSwordDURABILITY);
		setDamage(MoreSwordsMod.data.BoneSwordDAMAGE);
		setItemName("BoneSword");
	}
}


