package de.joshi.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;

public class PlasticBlock extends Block {
    public PlasticBlock(DyeColor dyeColor) {
        super(
                FabricBlockSettings.create()
                .strength(1.5f, 6.0f)
                .sounds(BlockSoundGroup.STONE)
                .mapColor(dyeColor.getMapColor())
        );
    }
}
