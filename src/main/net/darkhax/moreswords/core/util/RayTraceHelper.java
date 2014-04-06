package net.darkhax.moreswords.core.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3Pool;
import net.minecraft.world.World;

public class RayTraceHelper {
	
  public static MovingObjectPosition rayTrace(World world, EntityPlayer player, int length) {
	  
    Vec3 var4 = world.getWorldVec3Pool().getVecFromPool(player.posX, player.posY + player.getEyeHeight(), player.posZ);
    Vec3 var5 = player.getLookVec();
    Vec3 var6 = var4.addVector(var5.xCoord * length, var5.yCoord * length, var5.zCoord * length);
    return world.rayTraceBlocks(var4, var6);
  }
}