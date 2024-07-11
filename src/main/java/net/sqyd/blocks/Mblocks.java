package net.sqyd.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.sqyd.Better_Exp;

public class Mblocks {



    public static final Block Copper_Rail = registerBlock( "copper_rail",
            new PoweredRailBlock(FabricBlockSettings.create().noCollision().strength(0.7F).sounds(BlockSoundGroup.METAL)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Better_Exp.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Better_Exp.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Better_Exp.LOGGER.info("Regin Blocks for " + Better_Exp.MOD_ID);
    }
}
