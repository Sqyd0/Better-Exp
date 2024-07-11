package net.sqyd;

import net.fabricmc.api.ModInitializer;

import net.sqyd.blocks.Mblocks;
import net.sqyd.items.MitemGroup;
import net.sqyd.items.Mitems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Better_Exp implements ModInitializer {

	public static final String MOD_ID = "bexp";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Mitems.registerModItems();
		MitemGroup.RegisterItemGroup();
		Mblocks.registerModBlocks();
	}
}