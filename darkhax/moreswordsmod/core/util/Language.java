package darkhax.moreswordsmod.core.util;

import static darkhax.moreswordsmod.core.util.Reference.logger;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Properties;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.StringTranslate;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Language {

	public static final String LANG_DIR = "/darkhax/moreswordsmod/lang/";

	public boolean errorShown = false;

	public HashMap<String, Properties> languageMapping = new HashMap<String, Properties>();

	private static Language instance;

	public static Language getInstance() {
		
		if (instance == null) {
			
			instance = new Language();
		}
		return instance;
	}

	public Language() {
		
		loadLanguage("en_US");
		loadLanguage("de_DE");
	}

	private void loadLanguage(String lang) {
		
		Properties langFile = new Properties((Properties) this.languageMapping.get(lang));
		InputStreamReader reader = null;

		try {
			
			InputStream inStream = getClass().getResourceAsStream(LANG_DIR + lang + ".properties");
			if (inStream == null) {
				
				throw new IOException();
			}
			reader = new InputStreamReader(inStream, "UTF-8");
			langFile.load(reader);
		} catch(Exception ex) {
			
			logger.warning("Failed to load language: " + lang + " Reason: " + ex.getLocalizedMessage());
		} finally {
			
			if (reader != null) {

				try {

					reader.close();
				} catch (IOException e) {

				}
			}
		}

		this.languageMapping.put(lang, langFile);
		logger.info("Loaded language file: " + lang);
	}

	public String translate(String tag) {

		return translate(tag, StringTranslate.getInstance().getCurrentLanguage());
	}

	public String translate(String tag, String lang) {

		if (languageMapping.containsKey(lang)) {

			try {

				return ((Properties)languageMapping.get(lang)).getProperty(tag);
			} catch(Exception ex) {

				printLanguageError(lang, tag);
				return lang + ": " + tag;
			}
		}

		logger.warning("Language registery is missing a file for " + lang);
		return "";
	}

	public void registerItem(Item item) {

		registerItemStack(new ItemStack(item), item.getUnlocalizedName());
	}

	public void registerBlock(Block block) {

		registerItemStack(new ItemStack(block), block.getUnlocalizedName());
	}

	public void registerItemStack(ItemStack stack, String unlocalized) {

		String currLang = "";

		for (String lang : languageMapping.keySet()) {

			try {

				currLang = lang;
				LanguageRegistry.instance().addNameForObject(stack, lang, translate(unlocalized, lang));
			} catch(Exception ex) {

				printLanguageError(currLang, unlocalized);
			}
		}
	}
	
	public void printLanguageError(String lang, String tag) {

		logger.warning("Failed to register " + lang + " localization for " + tag);
	}
}
