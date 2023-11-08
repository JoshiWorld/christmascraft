package de.joshi.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LightBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class CeilingLightBlock extends LightBlock {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public CeilingLightBlock() {
        super(FabricBlockSettings.create());
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
