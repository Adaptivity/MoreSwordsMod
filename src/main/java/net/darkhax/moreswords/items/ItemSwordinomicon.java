package net.darkhax.moreswords.items;

import net.darkhax.moreswords.MoreSwords;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemSwordinomicon extends Item {
    public ItemSwordinomicon(int id) {
        super();
        this.setCreativeTab(MoreSwords.tabSwords);
    }

    public boolean isItemTool(ItemStack par1ItemStack) {
        return par1ItemStack.stackSize == 1;
    }

    public int getItemEnchantability() {
        return 1;
    }
}
