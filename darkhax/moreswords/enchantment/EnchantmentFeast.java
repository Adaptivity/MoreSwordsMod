package darkhax.moreswords.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.StatCollector;
import darkhax.moreswords.MoreSwords;
import darkhax.moreswords.items.ItemManager;

public class EnchantmentFeast extends Enchantment {

	public EnchantmentFeast(int par1, int par2) {
		super(par1, par2, MoreSwords.enumSwords);
		this.setName("feast");
	}

	public EnchantmentFeast(int par1, int par2,
			EnumEnchantmentType par3EnumEnchantmentType) {
		super(par1, par2, par3EnumEnchantmentType);
	}

	public int getMinEnchantability(int par1) {
		return 10 + 20 * (par1 - 1);
	}

	public int getMaxEnchantability(int par1) {
		return super.getMinEnchantability(par1) + 50;
	}

	public int getMaxLevel() {
		return 3;
	}

    public boolean canApply(ItemStack par1ItemStack)
    {
    	if (par1ItemStack.getItem() instanceof ItemSword){
    		return true;
    	}	
    	else{
    		return false;
    	}
    }

	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == ItemManager.bloodSword) {
			return true;
		} else {
			return false;
		}
	}
}