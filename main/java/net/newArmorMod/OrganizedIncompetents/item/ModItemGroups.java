package net.newArmorMod.OrganizedIncompetents.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.newArmorMod.OrganizedIncompetents.TutorialMod;
import net.newArmorMod.OrganizedIncompetents.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entires) -> {
                        //add item oarmor to the game 
                        entires.add(ModItems.RUBY);
                        entires.add(ModItems.RAW_RUBY);
                        entires.add(ModBlocks.RUBY_BLOCK);
                        entires.add(ModBlocks.RAW_RUBY_BLOCK);


                    }).build());


    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Register Item Groups for " + TutorialMod.MOD_ID);
    }
}
