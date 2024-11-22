package net.newArmorMod.OrganizedIncompetents.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.newArmorMod.OrganizedIncompetents.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));
    public static final Item ICE_CHESTPLATE = registerItem("ice_chestplate", new Item(new Item.Settings()));
    public static final Item ICE_LEGGING = registerItem("ice_legging", new Item(new Item.Settings()));
    public static final Item ICE_HELMET = registerItem("ice_helmet", new Item(new Item.Settings()));
    public static final Item ICE_BOOTS = registerItem("ice_boots", new Item(new Item.Settings()));

    //add items to each group. must be done for every item
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
        entries.add(ICE_CHESTPLATE);
        entries.add(ICE_LEGGING);
        entries.add(ICE_HELMET);
        entries.add(ICE_BOOTS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
        //add any item groups here
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((ModItems::addItemsToIngredientItemGroup));
    }
}
