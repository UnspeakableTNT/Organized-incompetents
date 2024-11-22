package net.newArmorMod.OrganizedIncompetents.block;


import net.newArmorMod.OrganizedIncompetents.TutorialMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //add new block 
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", 
        new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).requiresTool()));
    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
        new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE).requiresTool()));
    //helper method for adding blocks 
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, name), block);
    }
    // helper method for adddin item
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }
    
}
