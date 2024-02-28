package net.astra.createbe;

import net.astra.createbe.item.ModItemGroups;
import net.astra.createbe.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateBetterEnd implements ModInitializer {
	public static final String MOD_ID = "createbetterend";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}