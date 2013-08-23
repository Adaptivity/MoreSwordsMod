package darkhax.moreswords.inventory;

import net.minecraft.inventory.InventoryBasic;

public class SlotAwakenTable extends InventoryBasic {
    final ContainerAwakenTable container;

    public SlotAwakenTable(ContainerAwakenTable containerAwakenTable, String par1Str, boolean par2, int par3) {
        super(par1Str, par2, par3);

        container = containerAwakenTable;
    }

    @Override
    public void onInventoryChanged() {
        super.onInventoryChanged();
        container.onCraftMatrixChanged(this);
    }
}
