package de.joshi.initializer;

import de.joshi.ChristmasCraftClient;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockInitializer implements ModInitializer {

    public static final Block EXAMPLE_BLOCK  = new Block(FabricBlockSettings.create().strength(4.0f));

    @Override
    public void onInitialize() {
        Registry.register(Registries.BLOCK, new Identifier(ChristmasCraftClient.IDENTIFIER, "example_block"), EXAMPLE_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(ChristmasCraftClient.IDENTIFIER, "example_block"), new BlockItem(EXAMPLE_BLOCK, new FabricItemSettings()));
    }
}
