package net.sqyd.items;

import net.sqyd.Better_Exp;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sqyd.blocks.Mblocks;

public class MitemGroup {

    public static final ItemGroup Exp_Group = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Better_Exp.MOD_ID, "exp"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.exp"))
                    .icon(() -> new ItemStack(Items.DIAMOND)).entries(((displayContext, entries) -> {

                        entries.add(Mblocks.Copper_Rail);


                    })).build());




    public static void RegisterItemGroup() {
        Better_Exp.LOGGER.info("Reg_Item_Group");
    }
}
