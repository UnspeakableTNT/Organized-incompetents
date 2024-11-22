package net.newArmorMod.OrganizedIncompetents;

import net.fabricmc.api.ModInitializer;
import net.newArmorMod.OrganizedIncompetents.block.ModBlocks;
import net.newArmorMod.OrganizedIncompetents.item.ModItemGroups;
import net.newArmorMod.OrganizedIncompetents.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "newArmorMod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}