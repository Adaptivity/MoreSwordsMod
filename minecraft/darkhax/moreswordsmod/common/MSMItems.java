package darkhax.moreswordsmod.common;

import net.minecraft.item.Item;
import darkhax.moreswordsmod.items.*;
import darkhax.moreswordsmod.items.awakeneditems.*;

public class MSMItems{
	public static MSMDataProxy data = MSMDataProxy.instance;
	// Swords
	public static final Item blazeSword = new ItemBlazeSword(data.blazeSwordID).setIconIndex(0);
	public static final Item bloodSword = new ItemBloodSword(data.bloodSwordID).setIconIndex(1);
	public static final Item boneSword = new ItemBoneSword(data.boneSwordID).setIconIndex(2);
	public static final Item dragonSword = new ItemDragonSword(data.dragonSwordID).setIconIndex(3);
	public static final Item eyeEndSword = new ItemEyeEndSword(data.eyeEndSwordID).setIconIndex(4);
	public static final Item glassSword = new ItemGlassSword(data.glassSwordID).setIconIndex(5);
	public static final Item infinitySword = new ItemInfinitySword(data.infinitySwordID).setIconIndex(6);
	public static final Item lapisSword = new ItemLapisSword(data.lapisSwordID).setIconIndex(7);
	public static final Item moltenSword = new ItemMoltenSword(data.moltenSwordID).setIconIndex(8);
	public static final Item masterSword = new ItemMasterSword(data.masterSwordID).setIconIndex(9);
	public static final Item aqueousSword = new ItemAqueousSword(data.aqueousSwordID).setIconIndex(10);
	public static final Item aethersGuard = new ItemAethersGuard(data.aethersGuardID).setIconIndex(11);
	public static final Item witherBane = new ItemWitherBane(data.witherBaneID).setIconIndex(12);
	public static final Item adminArk = new ItemAdminArk(data.adminArkID).setIconIndex(13);
	
	// Awakened Swords
	public static final Item awakenedBlazeSword = new ItemAwakenedBlazeSword(data.awakenedBlazeSwordID).setIconIndex(0);
	public static final Item awakenedBloodSword = new ItemAwakenedBloodSword(data.awakenedBloodSwordID).setIconIndex(1);
	public static final Item awakenedBoneSword = new ItemAwakenedBoneSword(data.awakenedBoneSwordID).setIconIndex(2);
	public static final Item awakenedDragonSword = new ItemAwakenedDragonSword(data.awakenedDragonSwordID).setIconIndex(3);
	public static final Item awakenedEyeEndSword = new ItemAwakenedEyeEndSword(data.awakenedEyeEndSwordID).setIconIndex(4);
	public static final Item awakenedGlassSword = new ItemAwakenedGlassSword(data.awakenedGlassSwordID).setIconIndex(5);
	public static final Item awakenedInfinitySword = new ItemAwakenedInfinitySword(data.awakenedInfinitySwordID).setIconIndex(6);
	public static final Item awakenedLapisSword = new ItemAwakenedLapisSword(data.awakenedLapisSwordID).setIconIndex(7);
	public static final Item awakenedMoltenSword = new ItemAwakenedMoltenSword(data.awakenedMoltenSwordID).setIconIndex(8);
	public static final Item awakenedMasterSword = new ItemAwakenedMasterSword(data.awakenedMasterSwordID).setIconIndex(9);
	public static final Item awakenedAqueousSword = new ItemAwakenedAqueousSword(data.awakenedAqueousSwordID).setIconIndex(10);
	public static final Item awakenedAethersGuard = new ItemAwakenedAethersGuard(data.awakenedAetherGuardID).setIconIndex(11);
	public static final Item awakenedWitherBane = new ItemAwakenedWitherBane(data.awakenedWitherBaneID).setIconIndex(12);
	public static final Item awakenedAdminArk = new ItemAwakenedAdminArk(data.awakenedAdminArkID).setIconIndex(13);
}
