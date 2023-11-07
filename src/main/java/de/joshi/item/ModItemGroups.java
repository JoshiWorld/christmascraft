package de.joshi.item;

import de.joshi.ChristmasCraft;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ChristmasCraft.MOD_ID, "christmascraft"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.christmascraft")).icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                entries.add(ModItems.RUBY);
                entries.add(ModItems.RAW_RUBY);
            }).build());

    public static void registerItemGroups() {
        ChristmasCraft.LOGGER.info("Registering Item Groups for " + ChristmasCraft.MOD_ID);
    }

}
