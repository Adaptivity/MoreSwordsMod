
package darkhax.moreswordsmod;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public final class TabMoreSwordsMod extends CreativeTabs
{
        public TabMoreSwordsMod(int par1, String par2Str)
        {
                super(par1, par2Str);
        }
        
        //sets the image for the creative tab
        @SideOnly(Side.CLIENT)
        public int getTabIconItemIndex()
        {
           //there is a difference between items and blocks. will give an example of both
                return MoreSwordsMod.items.adminArk.shiftedIndex;//items
               // return Yourmod.YourBlock.BlockID; for if you want to use a block
        }
   
        //sets the title/name for the creative tab
        public String getTranslatedTabLabel()
        {
         return "More Swords Mod";
        }
}
