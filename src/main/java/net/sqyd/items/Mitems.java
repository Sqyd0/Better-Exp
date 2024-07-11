package net.sqyd.items;

import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sqyd.Better_Exp;

import static net.minecraft.item.Items.register;

public class Mitems {






    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Better_Exp.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Better_Exp.LOGGER.info("Registering Mod Items for " + Better_Exp.MOD_ID);
    }
}
