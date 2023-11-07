package de.joshi.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.shape.VoxelShape;

public class ChristmasTreeBlock extends Block {
    public static EnumProperty<DoubleBlockHalf> HALF;
    protected static VoxelShape SHAPE;

    public ChristmasTreeBlock() {
        super(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD));
    }

}
