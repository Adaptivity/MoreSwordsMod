package darkhax.moreswordsmod.awakenditems;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockMushroom;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.BlockStem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.entity.player.BonemealEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import darkhax.moreswordsmod.MoreSwordsMod;

public class ItemAwakenedBoneSword extends ItemSword
{
protected int damage;
protected int enchantability;

public ItemAwakenedBoneSword(int par1){
super(par1, EnumToolMaterial.IRON);
setMaxDamage(MoreSwordsMod.data.AwakenedBoneSwordDURABILITY);
damage = MoreSwordsMod.data.AwakenedBoneSwordDAMAGE; 
enchantability = 14;
}
@SideOnly(Side.CLIENT)
public boolean hasEffect(ItemStack itemstack)
{
        return true;
}

@SideOnly(Side.CLIENT)
public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
{
	par3List.add("Firtile I");
}
public boolean onItemUse(ItemStack itemstack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
{
	if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, itemstack))
    {
        return false;
    }
    else
    {
        int var11;
        int var12;
        int var13;

        if (!par3World.isRemote)
        {
            var11 = par3World.getBlockId(par4, par5, par6);

            BonemealEvent event = new BonemealEvent(par2EntityPlayer, par3World, var11, par4, par5, par6);
            if (MinecraftForge.EVENT_BUS.post(event))
            {
                return false;
            }

            if (event.getResult() == Result.ALLOW)
            {
                if (!par3World.isRemote)
                {
                    itemstack.stackSize--;
                }
                return true;
            }

            if (var11 == Block.sapling.blockID)
            {
                if (!par3World.isRemote)
                {
                    ((BlockSapling)Block.sapling).growTree(par3World, par4, par5, par6, par3World.rand);
                    itemstack.damageItem(1, par2EntityPlayer);
                }

                return true;
            }

            if (var11 == Block.mushroomBrown.blockID || var11 == Block.mushroomRed.blockID)
            {
                if (!par3World.isRemote && ((BlockMushroom)Block.blocksList[var11]).fertilizeMushroom(par3World, par4, par5, par6, par3World.rand))
                {
                	itemstack.damageItem(1, par2EntityPlayer);
                }

                return true;
            }

            if (var11 == Block.melonStem.blockID || var11 == Block.pumpkinStem.blockID)
            {
                if (par3World.getBlockMetadata(par4, par5, par6) == 7)
                {
                    return false;
                }

                if (!par3World.isRemote)
                {
                    ((BlockStem)Block.blocksList[var11]).fertilizeStem(par3World, par4, par5, par6);
                    itemstack.damageItem(1, par2EntityPlayer);
                }

                return true;
            }

            if (var11 > 0 && Block.blocksList[var11] instanceof BlockCrops)
            {
                if (par3World.getBlockMetadata(par4, par5, par6) == 7)
                {
                    return false;
                }

                if (!par3World.isRemote)
                {
                    ((BlockCrops)Block.blocksList[var11]).fertilize(par3World, par4, par5, par6);
                    itemstack.damageItem(1, par2EntityPlayer);
                }

                return true;
            }

            if (var11 == Block.cocoaPlant.blockID)
            {
                if (!par3World.isRemote)
                {
                    par3World.setBlockMetadataWithNotify(par4, par5, par6, 8 | BlockDirectional.getDirection(par3World.getBlockMetadata(par4, par5, par6)));
                    itemstack.damageItem(1, par2EntityPlayer);
                }

                return true;
            }

            if (var11 == Block.grass.blockID)
            {
                if (!par3World.isRemote)
                {
                	itemstack.damageItem(1, par2EntityPlayer);
                    label133:

                    for (var12 = 0; var12 < 128; ++var12)
                    {
                        var13 = par4;
                        int var14 = par5 + 1;
                        int var15 = par6;

                        for (int var16 = 0; var16 < var12 / 16; ++var16)
                        {
                            var13 += itemRand.nextInt(3) - 1;
                            var14 += (itemRand.nextInt(3) - 1) * itemRand.nextInt(3) / 2;
                            var15 += itemRand.nextInt(3) - 1;

                            if (par3World.getBlockId(var13, var14 - 1, var15) != Block.grass.blockID || par3World.isBlockNormalCube(var13, var14, var15))
                            {
                                continue label133;
                            }
                        }

                        if (par3World.getBlockId(var13, var14, var15) == 0)
                        {
                            if (itemRand.nextInt(10) != 0)
                            {
                                if (Block.tallGrass.canBlockStay(par3World, var13, var14, var15))
                                {
                                    par3World.setBlockAndMetadataWithNotify(var13, var14, var15, Block.tallGrass.blockID, 1);
                                }
                            }
                            else
                            {
                                ForgeHooks.plantGrass(par3World, var13, var14, var15);
                            }
                        }
                    }
                }

                return true;
            }
        }
        else if (itemstack.getItemDamage() == 3)
        {
            var11 = par3World.getBlockId(par4, par5, par6);
            var12 = par3World.getBlockMetadata(par4, par5, par6);

            if (var11 == Block.wood.blockID && BlockLog.limitToValidMetadata(var12) == 3)
            {
                if (par7 == 0)
                {
                    return false;
                }

                if (par7 == 1)
                {
                    return false;
                }

                if (par7 == 2)
                {
                    --par6;
                }

                if (par7 == 3)
                {
                    ++par6;
                }

                if (par7 == 4)
                {
                    --par4;
                }

                if (par7 == 5)
                {
                    ++par4;
                }

                if (par3World.isAirBlock(par4, par5, par6))
                {
                    var13 = Block.blocksList[Block.cocoaPlant.blockID].onBlockPlaced(par3World, par4, par5, par6, par7, par8, par9, par10, 0);
                    par3World.setBlockAndMetadataWithNotify(par4, par5, par6, Block.cocoaPlant.blockID, var13);

                    if (!par2EntityPlayer.capabilities.isCreativeMode)
                    {
                        --itemstack.stackSize;
                    }
                }

                return true;
            }
        }

        return false;
    }
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


