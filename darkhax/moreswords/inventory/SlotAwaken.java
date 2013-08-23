package darkhax.moreswords.inventory;

import darkhax.moreswords.core.util.Config;
import darkhax.moreswords.items.ItemCoreSword;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;


public class SlotAwaken extends Slot {
    final ContainerAwakenTable container;

    public SlotAwaken(ContainerAwakenTable containerEnchantTable, IInventory tableInventory, int i, int i1, int i2) {
        super(tableInventory, i, i1, i2);
        container = containerEnchantTable;
    }

    @Override
    public int getSlotStackLimit() {
        return 1;
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
    	return isMySword(stack);
    }
    
    public static boolean isMySword(ItemStack stack) {
    	return stack != null ? Item.itemsList[stack.itemID].isPotionIngredient(stack) : false;
    }
}
