package darkhax.moreswords;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;

import darkhax.moreswords.items.ItemRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.Item;

final class CreativeTabSwords extends CreativeTabs
{
    CreativeTabSwords(int par1, String par2Str)
    {
        super(par1, par2Str);
    }

    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return ItemRegistry.adminArk.itemID;
    }

    @SideOnly(Side.CLIENT)
    public void displayAllReleventItems(List par1List)
    {
        super.displayAllReleventItems(par1List);
        this.addEnchantmentBooksToList(par1List, new EnumEnchantmentType[] {MoreSwords.enumSwords});
    }
}
