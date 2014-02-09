package darkhax.moreswords.core.plugins;

import java.util.HashMap;
import java.util.Map;

@Deprecated
public class PluginEplus {

	public static void loadPlugin() {
		
		final Map<String, String> toolTips = new HashMap<String, String>();

		toolTips.put("enchantment.ascension", "Nocks mobs up in the air when hit.");
		toolTips.put("enchantment.blaze", "Sets mobs on fire!");
		toolTips.put("enchantment.blessed", "Does extra damage to unholy mobs!");
		toolTips.put("enchantment.decay", "Inflicts damaged mobs with the wither effect.");
		toolTips.put("enchantment.enderPulse", "Allows the player to warp within a limited space.");
		toolTips.put("enchantment.expedite", "Fast forward through time by blocking.");
		toolTips.put("enchantment.feast", "Gives the chance to regain durability when hiting a mob.");
		toolTips.put("enchantment.greed", "Hostile mobs drop more exp.");
		toolTips.put("enchantment.iceAura", "Inflicts damaged mobs with slowness!");
		toolTips.put("enchantment.shatter", "Does extra damage to all mobs");
		toolTips.put("enchantment.stealth", "Allows you to go invisible!");
		toolTips.put("enchantment.vitality", "Allows you to trade some durability for a health boost");
		toolTips.put("enchantment.bloodpool", "Stores the blood of your enemies. If held on death will heal you for stored ammount.");

		//EplusApi.addCustomEnchantmentToolTip(toolTips);
	}
}
