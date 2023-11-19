package de.joshi.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.BlockFace;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class ChristmasBallBlock extends HorizontalFacingBlock {
    public static final EnumProperty<BlockFace> FACE = Properties.BLOCK_FACE;

    private static VoxelShape SHAPE_FLOOR = Block.createCuboidShape(5, 0, 5, 11, 7, 11);
    private static VoxelShape SHAPE_CEILING = Block.createCuboidShape(5, 5, 5, 11, 16, 11);
    private static VoxelShape SHAPE_WALL_NORTH = Block.createCuboidShape(5, 2, 10, 11, 14, 16);
    private static VoxelShape SHAPE_WALL_WEST = Block.createCuboidShape(10, 2, 5, 16, 14, 11);
    private static VoxelShape SHAPE_WALL_SOUTH = Block.createCuboidShape(5, 2, 0, 11, 14, 6);
    private static VoxelShape SHAPE_WALL_EAST = Block.createCuboidShape(0, 2, 5, 6, 14, 11);

    public ChristmasBallBlock() {
        super(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL));
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        for (Direction direction : ctx.getPlacementDirections()) {
            BlockState blockState = direction.getAxis() == Direction.Axis.Y ? (BlockState)((BlockState)this.getDefaultState().with(FACE, direction == Direction.UP ? BlockFace.CEILING : BlockFace.FLOOR)).with(FACING, ctx.getHorizontalPlayerFacing()) : (BlockState)((BlockState)this.getDefaultState().with(FACE, BlockFace.WALL)).with(FACING, direction.getOpposite());
            if (!blockState.canPlaceAt(ctx.getWorld(), ctx.getBlockPos())) continue;
            return blockState;
        }
        return null;
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        switch ((BlockFace)state.get(FACE)) {
            case FLOOR: {
                return SHAPE_FLOOR;
            }
            case WALL: {
                return switch (direction) {
                    default -> throw new IncompatibleClassChangeError();
                    case EAST -> {
                        yield SHAPE_WALL_EAST;
                    }
                    case WEST -> {
                        yield SHAPE_WALL_WEST;
                    }
                    case SOUTH -> {
                        yield SHAPE_WALL_SOUTH;
                    }
                    case NORTH, UP, DOWN -> SHAPE_WALL_NORTH;
                };
            }
            case CEILING: {
                return SHAPE_CEILING;
            }
        }
        return VoxelShapes.fullCube();
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, FACE);
    }
}
