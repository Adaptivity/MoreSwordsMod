package darkhax.moreswords.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import darkhax.moreswords.MoreSwords;
import darkhax.moreswords.core.util.Reference;
import darkhax.moreswords.tileentity.TileEntityAwakenTable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockEnchantmentTable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockAwakenTable extends BlockContainer {
	
	public static Icon awakenIconSide;
	public static Icon awakenIconTop;

    public BlockAwakenTable(int par1) {
    	
        super(par1, Material.rock);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
        this.setLightOpacity(0);
    }

    public boolean renderAsNormalBlock() {
    	
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random) {
    	
        super.randomDisplayTick(world, x, y, z, random);
        	for (int l = x - 2; l <= x + 2; ++l)
            {
                for (int i1 = z - 2; i1 <= z + 2; ++i1)
                {
                    if (l > x - 2 && l < x + 2 && i1 == z - 1)
                    {
                        i1 = z + 2;
                    }

                    if (random.nextInt(16) == 0)
                    {
                        for (int j1 = y; j1 <= y + 1; ++j1)
                        {
                            if (world.getBlockId(l, j1, i1) == Block.blockLapis.blockID)
                            {
                                if (!world.isAirBlock((l - x) / 2 + x, j1, (i1 - z) / 2 + z))
                                {
                                    break;
                                }

                                world.spawnParticle("enchantmenttable", (double)x + 0.5D, (double)y + 2.0D, (double)z + 0.5D, (double)((float)(l - x) + random.nextFloat()) - 0.5D, (double)((float)(j1 - y) - random.nextFloat() - 1.0F), (double)((float)(i1 - z) + random.nextFloat()) - 0.5D);
                            }
                        }
                    }
                }
            }
        }
    
    public boolean isOpaqueCube() {
    	
        return false;
    }
    
    @Override
    public TileEntity createNewTileEntity(World par1World) {
    	
        return new TileEntityAwakenTable();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
    	
        if (world.isRemote) {
            return true;
        }
        
        player.openGui(MoreSwords.instance, 10, world, x, y, z);
        return true;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir) {
    	
    	awakenIconSide = ir.registerIcon("moreswords:awaken_table_side");
    	awakenIconTop = ir.registerIcon("moreswords:awaken_table_top");
    }
    
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2) {
    	
    	return par1 == 0 ? Block.blockNetherQuartz.getBlockTextureFromSide(3) : (par1 == 1 ? awakenIconTop : awakenIconSide);    
    }
}