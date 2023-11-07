package de.joshi.item;

import de.joshi.ChristmasCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

//    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
//        entries.add(RUBY);
//        entries.add(RAW_RUBY);
//    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ChristmasCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ChristmasCraft.LOGGER.info("Registering Mod Items for " + ChristmasCraft.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }

}
