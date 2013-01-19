package darkhax.moreswordsmod.awakenditems;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import darkhax.moreswordsmod.MoreSwordsMod;
import darkhax.moreswordsmod.common.MSMDataProxy;

public class ItemAwakenedAethersGuard extends ItemSword
{
protected int damage;
protected int enchantability;

public ItemAwakenedAethersGuard(int par1){
super(par1, EnumToolMaterial.IRON);
setMaxDamage(MoreSwordsMod.data.AwakenedAethersGuardDURABILITY);
damage = MoreSwordsMod.data.AwakenedAethersGuardDAMAGE; 
enchantability = 14;
}
public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
{
         par1ItemStack.damageItem(1, par3EntityLiving);
         par2EntityLiving.motionY+=MSMDataProxy.AetherStrength;
         return true;
}
public String getTextureFile()
{
 return "/darkhax/moreswordsmod/textures/swords.png";
}
@SideOnly(Side.CLIENT)
public boolean hasEffect(ItemStack itemstack)
{
        return true;
}

@SideOnly(Side.CLIENT)
public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
{
	par3List.add("Ascension I");
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


