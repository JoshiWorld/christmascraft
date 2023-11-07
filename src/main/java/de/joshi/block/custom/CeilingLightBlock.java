package de.joshi.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.LightBlock;

public class CeilingLightBlock extends LightBlock {

    public CeilingLightBlock() {
        super(FabricBlockSettings.create());
    }
}
