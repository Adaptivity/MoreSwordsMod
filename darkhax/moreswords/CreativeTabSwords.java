package darkhax.moreswords;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;

import darkhax.moreswords.items.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.Item;

public class CreativeTabSwords extends CreativeTabs {
	
    CreativeTabSwords(int id, String name) {
        super(id, name);
    }

    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
        return Items.adminArk.itemID;
    }

    @SideOnly(Side.CLIENT)
    public void displayAllReleventItems(List items) {
        super.displayAllReleventItems(items);
        this.addEnchantmentBooksToList(items, new EnumEnchantmentType[] {MoreSwords.enumSwords});
    }
}
