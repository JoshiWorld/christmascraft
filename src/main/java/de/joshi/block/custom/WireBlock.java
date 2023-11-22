package de.joshi.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.RedstoneWireBlock;

public class WireBlock extends RedstoneWireBlock {

    public WireBlock() {
        super(FabricBlockSettings.create());
    }
}
