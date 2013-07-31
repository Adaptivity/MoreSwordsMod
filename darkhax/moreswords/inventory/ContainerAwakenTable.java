package darkhax.moreswords.inventory;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import cpw.mods.fml.common.network.PacketDispatcher;
import darkhax.moreswords.tileentity.TileEntityAwakenTable;

public class ContainerAwakenTable extends Container {

    public final World worldObj;
    public final IInventory tableInventory = new SlotAwakenTable(this, "Enchant", true, 1);
    final TileEntityAwakenTable tileAwakenTable;
    private final int xPos;
    private final int yPos;
    private final int zPos;

    public ContainerAwakenTable(InventoryPlayer par1InventoryPlayer, World par2World, int par3, int par4, int par5, TileEntityAwakenTable tileEntity) {
    	
        worldObj = par2World;
        xPos = par3;
        yPos = par4;
        zPos = par5;

        tileAwakenTable = tileEntity;

        addSlotToContainer(new SlotAwaken(this, tableInventory, 0, 11, 17));
        int l;

        for (l = 0; l < 3; ++l) {
            for (int i1 = 0; i1 < 9; ++i1) {
                addSlotToContainer(new Slot(par1InventoryPlayer, i1 + l * 9 + 9, 17 + i1 * 18, 91 + l * 18));
            }
        }

        for (l = 0; l < 9; ++l) {
            addSlotToContainer(new Slot(par1InventoryPlayer, l, 17 + l * 18, 149));
        }

        if (tileAwakenTable.itemInTable != null) {
            par1InventoryPlayer.player.dropPlayerItem(tileAwakenTable.itemInTable);
            tileAwakenTable.itemInTable = null;
        }
    }

    @Override
    public void onContainerClosed(EntityPlayer par1EntityPlayer) {
        super.onContainerClosed(par1EntityPlayer);

        for (int i = 0; i < tableInventory.getSizeInventory(); i++) {
            final ItemStack stack = tableInventory.getStackInSlot(i);
            if (stack != null) {
                par1EntityPlayer.dropPlayerItem(stack);
            }
        }
    }

    @Override
    public void onCraftMatrixChanged(IInventory par1IInventory) {
        super.onCraftMatrixChanged(par1IInventory);
        tileAwakenTable.getWorldObj().markBlockForRenderUpdate(tileAwakenTable.xCoord, tileAwakenTable.yCoord, tileAwakenTable.zCoord);
    }

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return true;
	}

    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(par2);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (par2 == 0) {
                if (!this.mergeItemStack(itemstack1, 1, 37, true)) {
                    return null;
                }
            }
            else {
                if (((Slot)this.inventorySlots.get(0)).getHasStack() || !((Slot)this.inventorySlots.get(0)).isItemValid(itemstack1)) {
                    return null;
                }

                if (itemstack1.hasTagCompound() && itemstack1.stackSize == 1) {
                    ((Slot)this.inventorySlots.get(0)).putStack(itemstack1.copy());
                    itemstack1.stackSize = 0;
                }
                
                else if (itemstack1.stackSize >= 1) {
                    ((Slot)this.inventorySlots.get(0)).putStack(new ItemStack(itemstack1.itemID, 1, itemstack1.getItemDamage()));
                    --itemstack1.stackSize;
                }
            }

            if (itemstack1.stackSize == 0) {
                slot.putStack((ItemStack)null);
            }
            
            else {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize) {
                return null;
            }

            slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
        }

        return itemstack;
    }
}
