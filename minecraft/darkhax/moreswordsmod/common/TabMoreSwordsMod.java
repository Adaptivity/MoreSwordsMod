
package darkhax.moreswordsmod.common;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public final class TabMoreSwordsMod extends CreativeTabs
{
        public TabMoreSwordsMod(int par1, String par2Str)
        {
                super(par1, par2Str);
        }
        
        @SideOnly(Side.CLIENT)
        public int getTabIconItemIndex()
        {
                return MSMItems.AdminArk.itemID;
        }
        public String getTranslatedTabLabel()
        {
         return "More Swords Mod";
        }
}
