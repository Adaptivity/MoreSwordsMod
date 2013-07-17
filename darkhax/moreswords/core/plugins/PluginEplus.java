package darkhax.moreswords.core.plugins;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import darkhax.moreswords.core.util.Config;
import darkhax.moreswords.enchantment.EnchantmentList;

import eplus.api.EplusApi;
import net.minecraft.item.Item;

public class PluginEplus {

  public static void init()
  {
    try
    {
    	EplusApi.addCustomEnchantmentToolTip(EnchantmentList.bloodPool, "Adds BloodPool");
    }
    catch (IllegalArgumentException e)
    {
    }
    catch (SecurityException e)
    {
    }
  }
}