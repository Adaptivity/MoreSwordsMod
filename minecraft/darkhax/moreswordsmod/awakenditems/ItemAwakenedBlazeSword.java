package darkhax.moreswordsmod.awakenditems;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import darkhax.moreswordsmod.MoreSwordsMod;
import darkhax.moreswordsmod.common.MSMDataProxy;

public class ItemAwakenedBlazeSword extends ItemSword
{
protected int damage;
protected int enchantability;

public ItemAwakenedBlazeSword(int par1){
super(par1, EnumToolMaterial.IRON);
setMaxDamage(MoreSwordsMod.data.AwakenedBlazeSwordDURABILITY);
damage = MoreSwordsMod.data.AwakenedBlazeSwordDAMAGE; 
enchantability = 14;
}
public int getDamageVsEntity(Entity par1Entity)
{
         return damage;
}
public int getItemEnchantability()
{
         return enchantability;
}
 public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1)
 {
 	itemstack.damageItem(1, entityliving1);
 	entityliving.setFire(MSMDataProxy.BlazeFireDuration);			
 	return true;
 }
 public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
 {
	     itemstack.damageItem(MSMDataProxy.BlazeDebuff, entityplayer);
         world.playSoundAtEntity(entityplayer, "msm.blaze", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
         if (!world.isRemote)
         {
                                  Vec3 look1 = entityplayer.getLookVec();
                 EntitySmallFireball fireball21 = new EntitySmallFireball(world, entityplayer, 1, 1, 1);
                 fireball21.setPosition(
                                 entityplayer.posX + look1.xCoord * 1,
                                 entityplayer.posY + look1.yCoord * 5,
                                 entityplayer.posZ + look1.zCoord * 1);
                 fireball21.accelerationX = look1.xCoord * 0.1;
                 fireball21.accelerationY = look1.yCoord * 0.1;
                 fireball21.accelerationZ = look1.zCoord * 0.1;
                 world.spawnEntityInWorld(fireball21);
                 
                 Vec3 look11 = entityplayer.getLookVec();
                 EntitySmallFireball fireball211 = new EntitySmallFireball(world, entityplayer, 1, 1, 1);
                 fireball211.setPosition(
                                 entityplayer.posX + look11.xCoord * 2,
                                 entityplayer.posY + look11.yCoord * 5,
                                 entityplayer.posZ + look11.zCoord * 2);
                 fireball211.accelerationX = look11.xCoord * 0.1;
                 fireball211.accelerationY = look11.yCoord * 0.1;
                 fireball211.accelerationZ = look11.zCoord * 0.1;
                 world.spawnEntityInWorld(fireball211);
                 
                 Vec3 look = entityplayer.getLookVec();
                 EntitySmallFireball fireball2 = new EntitySmallFireball(world, entityplayer, 1, 1, 1);
                 fireball2.setPosition(
                                 entityplayer.posX + look.xCoord * 3,
                                 entityplayer.posY + look.yCoord * 5,
                                 entityplayer.posZ + look.zCoord * 3);
                 fireball2.accelerationX = look.xCoord * 0.1;
                 fireball2.accelerationY = look.yCoord * 0.1;
                 fireball2.accelerationZ = look.zCoord * 0.1;
                 world.spawnEntityInWorld(fireball2);
                 
                 Vec3 look111 = entityplayer.getLookVec();
                 EntitySmallFireball fireball2111 = new EntitySmallFireball(world, entityplayer, 1, 1, 1);
                 fireball2111.setPosition(
                                 entityplayer.posX + look111.xCoord * 4,
                                 entityplayer.posY + look111.yCoord * 5,
                                 entityplayer.posZ + look111.zCoord * 4);
                 fireball2111.accelerationX = look111.xCoord * 0.1;
                 fireball2111.accelerationY = look111.yCoord * 0.1;
                 fireball2111.accelerationZ = look111.zCoord * 0.1;
                 world.spawnEntityInWorld(fireball2111);
                 
                 
                 

         }
         return itemstack;
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
	 par3List.add("HellFire \u00a7EI");
 }
}