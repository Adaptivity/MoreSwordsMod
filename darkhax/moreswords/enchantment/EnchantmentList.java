package darkhax.moreswords.enchantment;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.enchantment.Enchantment;
import darkhax.moreswords.MoreSwords;
import darkhax.moreswords.core.util.Config;

public class EnchantmentList {

	public static Enchantment stealth;
	public static Enchantment ascension;
	public static Enchantment iceaura;
	public static Enchantment blaze;
	public static Enchantment feast;
	public static Enchantment vitality;
	public static Enchantment dragon;
	public static Enchantment enderpulse;
	public static Enchantment shatter;
	public static Enchantment greed;
	public static Enchantment expedite;
	public static Enchantment blessed;
	public static Enchantment decay;
	public static Enchantment bloodPool;

	public static void init() {
		
		stealth = new EnchantmentStealth(Config.stealthID, 125);
		ascension = new EnchantmentAscension(Config.ascensionID, 78);
		iceaura = new EnchantmentIceAura(Config.iceAuraID, 78);
		blaze = new EnchantmentBlaze(Config.blazeID, 78);
		feast = new EnchantmentFeast(Config.feastID, 78);
		vitality = new EnchantmentVitality(Config.vitalityID, 78);
		enderpulse = new EnchantmentEnderpulse(Config.enderPulseID, 78); 
		greed = new EnchantmentGreed(Config.greedID,78); 
		expedite = new EnchantmentExpedite(Config.expediteID,78);
		decay = new EnchantmentDecay(Config.decayID, 78);
		bloodPool = new EnchantmentBloodPool(Config.bloodPoolID, 78);
		blessed = new EnchantmentBlessed(Config.blessedID, 78);
	}

}
