package de.joshi.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.LightBlock;

public class WallLightBlock extends LightBlock {

    public WallLightBlock() {
        super(FabricBlockSettings.create());
    }
}
