package darkhax.moreswords.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiEnchantment;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.PacketDispatcher;
import eplus.lib.ConfigurationSettings;
import eplus.lib.GuiIds;
import eplus.lib.Strings;
import eplus.network.packets.GuiPacket;

public class GuiAwakenTable extends GuiEnchantment {
    private final EntityPlayer player;
    private final int xPos;
    private final int yPos;
    private final int zPos;

    public GuiAwakenTable(InventoryPlayer inventory, World world, int x, int y, int z, String string) {
    	
        super( inventory, world, x, y, z, string);
        player = inventory.player;
        xPos = x;
        yPos = y;
        zPos = z;
    }

    @Override
    protected void actionPerformed(GuiButton par1GuiButton) {
    	
        super.actionPerformed(par1GuiButton);
    }

    @Override
    public void drawScreen(int par1, int par2, float par3) {
    	
        super.drawScreen(par1, par2, par3);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void initGui() {
    	
        super.initGui();
    }
    
}
