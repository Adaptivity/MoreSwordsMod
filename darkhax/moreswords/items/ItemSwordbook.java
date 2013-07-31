package darkhax.moreswords.items;

import elysian.core.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.world.World;

public class ItemSwordbook extends Item {
    public ItemSwordbook(int par1) {
        super(par1);
        this.setMaxStackSize(1);
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
    	
    	player.openGui(Reference.MOD_ID, 224, world, 0, 0, 0);
        return stack;
    }
}
