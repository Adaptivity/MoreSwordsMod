package darkhax.moreswords.core.handlers;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;
import darkhax.moreswords.core.util.RayTraceHelper;
import darkhax.moreswords.core.util.Reference;
import darkhax.moreswords.enchantment.EnchantmentList;

public class EffectManager {
	
	public static void ascension(EntityLiving player, ItemStack stack) {
		double Y = EnchantmentHelper.getEnchantmentLevel(EnchantmentList.ascension.effectId, stack) * 1;
		player.setVelocity(0, Y, 0);
	}
	
	public static void greed(EntityLiving player, ItemStack stack) {
		int xp = EnchantmentHelper.getEnchantmentLevel(EnchantmentList.greed.effectId, stack) *15;
		//player. = xp;
	}
	
	public static void glaciate(EntityLiving player, ItemStack stack) {
		int duration = EnchantmentHelper.getEnchantmentLevel(EnchantmentList.iceaura.effectId, stack) * 160;
		player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), duration, 1));
	}
	
	public static void decay(EntityLiving player, ItemStack stack) {
		int duration = EnchantmentHelper.getEnchantmentLevel(EnchantmentList.decay.effectId, stack) * 80;
		player.addPotionEffect(new PotionEffect(Potion.wither.getId(), duration, 1));
	}
	
	public static void blaze(EntityLiving player, ItemStack stack) {
		int damage = EnchantmentHelper.getEnchantmentLevel(EnchantmentList.blaze.effectId, stack) * 2;
		player.setFire(damage);
	}
	
	public static void feast(EntityLiving player, ItemStack stack) {
		int randRepair = Reference.random.nextIntII(0, 5);
		int repair = EnchantmentHelper.getEnchantmentLevel(EnchantmentList.feast.effectId, stack) * randRepair;
	}
	
	public static void setBloodPool(EntityPlayer player, ItemStack stack, float ammount) {
		if (! stack.hasTagCompound()) {
			stack.setTagCompound(new NBTTagCompound());
		}
		
		int modifier = 8 - EnchantmentHelper.getEnchantmentLevel(EnchantmentList.bloodPool.effectId, stack);
		stack.stackTagCompound.setFloat("blood", ammount / modifier + stack.stackTagCompound.getFloat("blood"));
		float storedBlood = stack.stackTagCompound.getFloat("blood");
	}
	
	public static void getBloodPool(EntityPlayer player, ItemStack stack) {
		float blood = stack.stackTagCompound.getFloat("blood");
		player.heal(blood);
		stack.stackTagCompound.setFloat("blood", 0);
	    blood = stack.stackTagCompound.getFloat("blood");
	}
	
	public static void stealth(EntityPlayer player, ItemStack stack) {
		int duration = EnchantmentHelper.getEnchantmentLevel(EnchantmentList.stealth.effectId, stack) * 1200;
		player.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), duration, 0));
	}
	
	public static void vitality(EntityPlayer player, ItemStack stack) {
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.vitality.effectId, player.getHeldItem()) == 1) {
        	
            player.getHeldItem().damageItem(250, player);
            player.addPotionEffect(new PotionEffect(Potion.heal.getId(), 20, 0));        
        }
        
          
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.vitality.effectId, player.getHeldItem()) == 2) {
        	
            player.getHeldItem().damageItem(250, player);
            player.addPotionEffect(new PotionEffect(Potion.heal.getId(), 20, 0));
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 1200, 0));   
        }
          
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentList.vitality.effectId, player.getHeldItem()) == 3) {
        	
            player.getHeldItem().damageItem(250, player);
            player.addPotionEffect(new PotionEffect(Potion.heal.getId(), 40, 0));
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 1200, 0));
            player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 2400, 0));         
        }
	}
	
	public static void enderPulse(EntityPlayer player, ItemStack stack) {
		
		int distance = EnchantmentHelper.getEnchantmentLevel(EnchantmentList.enderpulse.effectId, stack) * 18;
        MovingObjectPosition position = RayTraceHelper.rayTrace(player.worldObj, player, distance);            
        if ((position != null) && (position.typeOfHit == MovingObjectType.BLOCK)) {          
        	int x = position.blockX;             
        	int y = position.blockY;             
        	int z = position.blockZ;
     
        	switch (position.sideHit) {             
        	case 0:                
        		y--;              
        		break;              
        	case 1:
                y++;
                break;             
        	case 2:
                z--;
                break;             
        	case 3:
                z++;
                break;             
        	case 4:
                x--;
                break;             
        	case 5:
                x++;
                break;            
        	default:
                y++;          
        	}
         
        	player.getHeldItem().damageItem(50, player);        
        	player.setPositionAndUpdate(x, y, z);        
        	player.attackEntityFrom(DamageSource.fall, 1);          
        }       
	}
	
	public static void expedite(World world, ItemStack stack) {
		int time = EnchantmentHelper.getEnchantmentLevel(EnchantmentList.expedite.effectId, stack) * 50;
		world.setWorldTime(world.getWorldTime() + time);
	}
	
	public static void blessed(EntityLiving living, ItemStack stack) {
		float damage = EnchantmentHelper.getEnchantmentLevel(EnchantmentList.blessed.effectId, stack) * 2;
		living.attackEntityFrom(DamageSource.magic, damage);
	}
	
	public static void shatter(EntityLiving living, ItemStack stack) {
		float damage = EnchantmentHelper.getEnchantmentLevel(EnchantmentList.shatter.effectId, stack) * 1;
		living.attackEntityFrom(DamageSource.magic, damage);
	}
}