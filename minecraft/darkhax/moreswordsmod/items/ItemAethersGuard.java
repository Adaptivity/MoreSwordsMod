package darkhax.moreswordsmod.items;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import darkhax.moreswordsmod.MoreSwordsMod;



public class ItemAethersGuard extends MSMSword{
	public ItemAethersGuard(int i){
		super(i);
		setMaxDamage(MoreSwordsMod.data.AethersGuardDURABILITY);
		setDamage(MoreSwordsMod.data.AethersGuardDAMAGE);
		setItemName("AetherGuard");
	}
}


