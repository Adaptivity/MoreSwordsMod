package darkhax.moreswordsmod.awakenditems;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import darkhax.moreswordsmod.MoreSwordsMod;

public class ItemAwakenedDragonSword extends ItemSword
{
protected int damage;
protected int enchantability;

public ItemAwakenedDragonSword(int par1){
super(par1, EnumToolMaterial.IRON);
setMaxDamage(MoreSwordsMod.data.AwakenedDragonSwordDURABILITY);
damage = MoreSwordsMod.data.AwakenedDragonSwordDAMAGE; 
enchantability = 14;
}
public boolean hasEffect(ItemStack itemstack)
{
        return true;
}

@SideOnly(Side.CLIENT)
public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
{
	par3List.add("No effect at this time");
}
public String getTextureFile()
{
 return "/darkhax/moreswordsmod/textures/swords.png";
}
public int getDamageVsEntity(Entity par1Entity)
{
         return damage;
}
public int getItemEnchantability()
{
         return enchantability;
}
}


