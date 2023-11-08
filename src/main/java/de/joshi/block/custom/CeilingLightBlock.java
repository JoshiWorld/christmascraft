package de.joshi.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class CeilingLightBlock extends LightBlock {

    public CeilingLightBlock() {
        super(FabricBlockSettings.copyOf(Blocks.GLOWSTONE));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return makeShape();
    }

    private VoxelShape makeShape(){
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.46875, 0.8125, 0.46875, 0.53125, 1, 0.53125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.53125, 0.6875, 0.515625, 0.59375, 0.8125, 0.578125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.46875, 0.5625, 0.46875, 0.53125, 0.6875, 0.53125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.40625, 0.375, 0.421875, 0.46875, 0.5625, 0.484375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.46875, 0.3125, 0.46875, 0.53125, 0.375, 0.53125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.40625, 0.25, 0.46875, 0.46875, 0.3125, 0.53125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.53125, 0.25, 0.46875, 0.59375, 0.3125, 0.53125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.46875, 0.25, 0.40625, 0.53125, 0.3125, 0.46875));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.46875, 0.25, 0.53125, 0.53125, 0.3125, 0.59375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.46875, 0.1875, 0.46875, 0.53125, 0.25, 0.53125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.46875, 0.25, 0.46875, 0.53125, 0.3125, 0.53125));

        return shape;
    }

}
