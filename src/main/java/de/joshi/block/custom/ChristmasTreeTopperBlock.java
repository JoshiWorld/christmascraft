package de.joshi.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ChristmasTreeTopperBlock extends Block {
    private static VoxelShape SHAPE = Block.createCuboidShape(5, 0, 5, 11, 7, 11);

    public ChristmasTreeTopperBlock() {
        super(FabricBlockSettings.create());
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
