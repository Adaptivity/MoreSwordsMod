package darkhax.moreswordsmod.items;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import darkhax.moreswordsmod.MoreSwordsMod;
import darkhax.moreswordsmod.common.MSMDataProxy;



public class ItemBlazeSword extends MSMSword{
	public ItemBlazeSword(int i){
		super(i);
		setMaxDamage(MoreSwordsMod.data.BlazeSwordDURABILITY);
		setDamage(MoreSwordsMod.data.BlazeSwordDAMAGE);
		setItemName("BlazeSword");
	}
	
	public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1)
	{
		itemstack.damageItem(1, entityliving1);
		entityliving.setFire(MSMDataProxy.BlazeFireDuration);			
		return true;
	}
}


