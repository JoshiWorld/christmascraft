package de.joshi;

import de.joshi.block.ModBlocks;
import de.joshi.item.ModItemGroups;
import de.joshi.item.ModItems;
import de.joshi.sound.ModSounds;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChristmasCraft implements ModInitializer {
	public static final String MOD_ID = "christmascraft";
    public static final Logger LOGGER = LoggerFactory.getLogger("christmascraft");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
	}
}
