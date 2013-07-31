package darkhax.moreswords.core.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import darkhax.moreswords.gui.GuiAwakenTable;
import darkhax.moreswords.inventory.ContainerAwakenTable;
import darkhax.moreswords.tileentity.TileEntityAwakenTable;

public class GuiHandler implements IGuiHandler {
        //returns an instance of the Container you made earlier
        @Override
        public Object getServerGuiElement(int id, EntityPlayer player, World world,
                        int x, int y, int z) {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityAwakenTable){
                        return new ContainerAwakenTable(player.inventory, world, x, y, z, (TileEntityAwakenTable) tileEntity);
                }
                return null;
        }

        //returns an instance of the Gui you made earlier
        @Override
        public Object getClientGuiElement(int id, EntityPlayer player, World world,
                        int x, int y, int z) {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityAwakenTable){
                        return new GuiAwakenTable(player.inventory, world, x, y, z, "");
                }
                return null;

        }
}