package darkhax.moreswordsmod.items;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import darkhax.moreswordsmod.MoreSwordsMod;
import darkhax.moreswordsmod.common.MSMDataProxy;



public class ItemMoltenSword extends MSMSword{
	public ItemMoltenSword(int i){
		super(i);
		setMaxDamage(MoreSwordsMod.data.MoltenSwordDURABILITY);
		setDamage(MoreSwordsMod.data.MoltenSwordDAMAGE);
		setItemName("MoltenSword");
	}
	
	public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1)
	{
		itemstack.damageItem(1, entityliving1);
		entityliving.setFire(MSMDataProxy.MoltenFireDuration);			
		return true;
	}
}


