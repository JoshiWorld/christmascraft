package de.joshi.block;

import de.joshi.ChristmasCraft;
import de.joshi.block.custom.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // PLASTIC BLOCKS
    public static final Block PLASTIC_BLOCK_WHITE = registerBlock("plastic_block_white", new PlasticBlock(DyeColor.WHITE));
    public static final Block PLASTIC_BLOCK_ORANGE = registerBlock("plastic_block_orange", new PlasticBlock(DyeColor.ORANGE));
    public static final Block PLASTIC_BLOCK_MAGENTA = registerBlock("plastic_block_magenta", new PlasticBlock(DyeColor.MAGENTA));
    public static final Block PLASTIC_BLOCK_LIGHT_BLUE = registerBlock("plastic_block_light_blue", new PlasticBlock(DyeColor.LIGHT_BLUE));
    public static final Block PLASTIC_BLOCK_YELLOW = registerBlock("plastic_block_yellow", new PlasticBlock(DyeColor.YELLOW));
    public static final Block PLASTIC_BLOCK_LIME = registerBlock("plastic_block_lime", new PlasticBlock(DyeColor.LIME));
    public static final Block PLASTIC_BLOCK_PINK = registerBlock("plastic_block_pink", new PlasticBlock(DyeColor.PINK));
    public static final Block PLASTIC_BLOCK_GRAY = registerBlock("plastic_block_gray", new PlasticBlock(DyeColor.GRAY));
    public static final Block PLASTIC_BLOCK_LIGHT_GRAY = registerBlock("plastic_block_light_gray", new PlasticBlock(DyeColor.LIGHT_GRAY));
    public static final Block PLASTIC_BLOCK_CYAN = registerBlock("plastic_block_cyan", new PlasticBlock(DyeColor.CYAN));
    public static final Block PLASTIC_BLOCK_PURPLE = registerBlock("plastic_block_purple", new PlasticBlock(DyeColor.PURPLE));
    public static final Block PLASTIC_BLOCK_BLUE = registerBlock("plastic_block_blue", new PlasticBlock(DyeColor.BLUE));
    public static final Block PLASTIC_BLOCK_BROWN = registerBlock("plastic_block_brown", new PlasticBlock(DyeColor.BROWN));
    public static final Block PLASTIC_BLOCK_GREEN = registerBlock("plastic_block_green", new PlasticBlock(DyeColor.GREEN));
    public static final Block PLASTIC_BLOCK_RED = registerBlock("plastic_block_red", new PlasticBlock(DyeColor.RED));
    public static final Block PLASTIC_BLOCK_BLACK = registerBlock("plastic_block_black", new PlasticBlock(DyeColor.BLACK));

    // CHRISTMAS CEILING LIGHT
    public static final Block CHRISTMAS_CEILING_LIGHT_WHITE = registerBlock("christmas_ceiling_light_white", new CeilingLightBlock());
    public static final Block CHRISTMAS_CEILING_LIGHT_ORANGE = registerBlock("christmas_ceiling_light_orange", new CeilingLightBlock());
    public static final Block CHRISTMAS_CEILING_LIGHT_MAGENTA = registerBlock("christmas_ceiling_light_magenta", new CeilingLightBlock());
    public static final Block CHRISTMAS_CEILING_LIGHT_PALE_BLUE = registerBlock("christmas_ceiling_light_pale_blue", new CeilingLightBlock());
    public static final Block CHRISTMAS_CEILING_LIGHT_YELLOW = registerBlock("christmas_ceiling_light_yellow", new CeilingLightBlock());
    public static final Block CHRISTMAS_CEILING_LIGHT_LIME = registerBlock("christmas_ceiling_light_lime", new CeilingLightBlock());
    public static final Block CHRISTMAS_CEILING_LIGHT_PINK = registerBlock("christmas_ceiling_light_pink", new CeilingLightBlock());
    public static final Block CHRISTMAS_CEILING_LIGHT_GRAY = registerBlock("christmas_ceiling_light_gray", new CeilingLightBlock());
    public static final Block CHRISTMAS_CEILING_LIGHT_PALE_GRAY = registerBlock("christmas_ceiling_light_pale_gray", new CeilingLightBlock());
    public static final Block CHRISTMAS_CEILING_LIGHT_CYAN = registerBlock("christmas_ceiling_light_cyan", new CeilingLightBlock());
    public static final Block CHRISTMAS_CEILING_PURPLE = registerBlock("christmas_ceiling_light_purple", new CeilingLightBlock());
    public static final Block CHRISTMAS_CEILING_BLUE = registerBlock("christmas_ceiling_light_blue", new CeilingLightBlock());
    public static final Block CHRISTMAS_CEILING_BROWN = registerBlock("christmas_ceiling_light_brown", new CeilingLightBlock());
    public static final Block CHRISTMAS_CEILING_GREEN = registerBlock("christmas_ceiling_light_green", new CeilingLightBlock());
    public static final Block CHRISTMAS_CEILING_RED = registerBlock("christmas_ceiling_light_red", new CeilingLightBlock());
    public static final Block CHRISTMAS_CEILING_BLACK = registerBlock("christmas_ceiling_light_black", new CeilingLightBlock());

    // CHRISTMAS WALL LIGHT
    public static final Block CHRISTMAS_WALL_LIGHT_WHITE = registerBlock("christmas_wall_light_white", new WallLightBlock());
    public static final Block CHRISTMAS_WALL_LIGHT_ORANGE = registerBlock("christmas_wall_light_orange", new WallLightBlock());
    public static final Block CHRISTMAS_WALL_LIGHT_MAGENTA = registerBlock("christmas_wall_light_magenta", new WallLightBlock());
    public static final Block CHRISTMAS_WALL_LIGHT_PALE_BLUE = registerBlock("christmas_wall_light_pale_blue", new WallLightBlock());
    public static final Block CHRISTMAS_WALL_LIGHT_YELLOW = registerBlock("christmas_wall_light_yellow", new WallLightBlock());
    public static final Block CHRISTMAS_WALL_LIGHT_LIME = registerBlock("christmas_wall_light_lime", new WallLightBlock());
    public static final Block CHRISTMAS_WALL_LIGHT_PINK = registerBlock("christmas_wall_light_pink", new WallLightBlock());
    public static final Block CHRISTMAS_WALL_LIGHT_GRAY = registerBlock("christmas_wall_light_gray", new WallLightBlock());
    public static final Block CHRISTMAS_WALL_LIGHT_PALE_GRAY = registerBlock("christmas_wall_light_pale_gray", new WallLightBlock());
    public static final Block CHRISTMAS_WALL_LIGHT_CYAN = registerBlock("christmas_wall_light_cyan", new WallLightBlock());
    public static final Block CHRISTMAS_WALL_LIGHT_PURPLE = registerBlock("christmas_wall_light_purple", new WallLightBlock());
    public static final Block CHRISTMAS_WALL_LIGHT_BLUE = registerBlock("christmas_wall_light_blue", new WallLightBlock());
    public static final Block CHRISTMAS_WALL_LIGHT_BROWN = registerBlock("christmas_wall_light_brown", new WallLightBlock());
    public static final Block CHRISTMAS_WALL_LIGHT_GREEN = registerBlock("christmas_wall_light_green", new WallLightBlock());
    public static final Block CHRISTMAS_WALL_LIGHT_RED = registerBlock("christmas_wall_light_red", new WallLightBlock());
    public static final Block CHRISTMAS_WALL_LIGHT_BLACK = registerBlock("christmas_wall_light_black", new WallLightBlock());

    // CHRISTMAS SQUARE
    public static final Block CHRISTMAS_SQUARE_WHITE = registerBlock("christmas_square_white", new ChristmasSquareBlock());
    public static final Block CHRISTMAS_SQUARE_ORANGE = registerBlock("christmas_square_orange", new ChristmasSquareBlock());
    public static final Block CHRISTMAS_SQUARE_MAGENTA = registerBlock("christmas_square_magenta", new ChristmasSquareBlock());
    public static final Block CHRISTMAS_SQUARE_LIGHT_BLUE = registerBlock("christmas_square_light_blue", new ChristmasSquareBlock());
    public static final Block CHRISTMAS_SQUARE_YELLOW = registerBlock("christmas_square_yellow", new ChristmasSquareBlock());
    public static final Block CHRISTMAS_SQUARE_LIME = registerBlock("christmas_square_lime", new ChristmasSquareBlock());
    public static final Block CHRISTMAS_SQUARE_PINK = registerBlock("christmas_square_pink", new ChristmasSquareBlock());
    public static final Block CHRISTMAS_SQUARE_GRAY = registerBlock("christmas_square_gray", new ChristmasSquareBlock());
    public static final Block CHRISTMAS_SQUARE_LIGHT_GRAY = registerBlock("christmas_square_light_gray", new ChristmasSquareBlock());
    public static final Block CHRISTMAS_SQUARE_CYAN = registerBlock("christmas_square_cyan", new ChristmasSquareBlock());
    public static final Block CHRISTMAS_SQUARE_PURPLE = registerBlock("christmas_square_purple", new ChristmasSquareBlock());
    public static final Block CHRISTMAS_SQUARE_BLUE = registerBlock("christmas_square_blue", new ChristmasSquareBlock());
    public static final Block CHRISTMAS_SQUARE_BROWN = registerBlock("christmas_square_brown", new ChristmasSquareBlock());
    public static final Block CHRISTMAS_SQUARE_GREEN = registerBlock("christmas_square_green", new ChristmasSquareBlock());
    public static final Block CHRISTMAS_SQUARE_RED = registerBlock("christmas_square_red", new ChristmasSquareBlock());
    public static final Block CHRISTMAS_SQUARE_BLACK = registerBlock("christmas_square_black", new ChristmasSquareBlock());

    // CHRISTMAS BALLS
    public static final Block CHRISTMAS_BALL_WHITE = registerBlock("christmas_ball_white", new ChristmasBallBlock());
    public static final Block CHRISTMAS_BALL_ORANGE = registerBlock("christmas_ball_orange", new ChristmasBallBlock());
    public static final Block CHRISTMAS_BALL_MAGENTA = registerBlock("christmas_ball_magenta", new ChristmasBallBlock());
    public static final Block CHRISTMAS_BALL_LIGHT_BLUE = registerBlock("christmas_ball_light_blue", new ChristmasBallBlock());
    public static final Block CHRISTMAS_BALL_YELLOW = registerBlock("christmas_ball_yellow", new ChristmasBallBlock());
    public static final Block CHRISTMAS_BALL_LIME = registerBlock("christmas_ball_lime", new ChristmasBallBlock());
    public static final Block CHRISTMAS_BALL_PINK = registerBlock("christmas_ball_pink", new ChristmasBallBlock());
    public static final Block CHRISTMAS_BALL_GRAY = registerBlock("christmas_ball_gray", new ChristmasBallBlock());
    public static final Block CHRISTMAS_BALL_LIGHT_GRAY = registerBlock("christmas_ball_light_gray", new ChristmasBallBlock());
    public static final Block CHRISTMAS_BALL_CYAN = registerBlock("christmas_ball_cyan", new ChristmasBallBlock());
    public static final Block CHRISTMAS_BALL_PURPLE = registerBlock("christmas_ball_purple", new ChristmasBallBlock());
    public static final Block CHRISTMAS_BALL_BLUE = registerBlock("christmas_ball_blue", new ChristmasBallBlock());
    public static final Block CHRISTMAS_BALL_BROWN = registerBlock("christmas_ball_brown", new ChristmasBallBlock());
    public static final Block CHRISTMAS_BALL_GREEN = registerBlock("christmas_ball_green", new ChristmasBallBlock());
    public static final Block CHRISTMAS_BALL_RED = registerBlock("christmas_ball_red", new ChristmasBallBlock());
    public static final Block CHRISTMAS_BALL_BLACK = registerBlock("christmas_ball_black", new ChristmasBallBlock());

    // GARLAND
    public static final Block GARLAND = registerBlock("garland", new Block(FabricBlockSettings.create()));
    public static final Block GARLAND_ROUND = registerBlock("garland_round", new Block(FabricBlockSettings.create())); // HorizontalDirectionalBlock
    public static final Block SNOWY_GARLAND = registerBlock("snowy_garland", new Block(FabricBlockSettings.create()));
    public static final Block SNOWY_GARLAND_ROUND = registerBlock("snowy_garland_round", new Block(FabricBlockSettings.create())); // HorizontalDirectionalBlock
    public static final Block GARLAND_LIGHTLESS = registerBlock("garland_lightless", new Block(FabricBlockSettings.create()));
    public static final Block GARLAND_ROUND_LIGHTLESS = registerBlock("garland_round_lightless", new Block(FabricBlockSettings.create())); // HorizontalDirectionalBlock
    public static final Block SNOWY_GARLAND_LIGHTLESS = registerBlock("snowy_garland_lightless", new Block(FabricBlockSettings.create()));
    public static final Block SNOWY_GARLAND_ROUND_LIGHTLESS = registerBlock("snowy_garland_round_lightless", new Block(FabricBlockSettings.create())); // HorizontalDirectionalBlock

    // SNOWMAN BLOCK
    public static final Block SNOWMAN_BLOCK_WHITE = registerBlock("snowman_block_white", new TwoBlocksFacing());
    public static final Block SNOWMAN_BLOCK_ORANGE = registerBlock("snowman_block_orange", new TwoBlocksFacing());
    public static final Block SNOWMAN_BLOCK_MAGENTA = registerBlock("snowman_block_magenta", new TwoBlocksFacing());
    public static final Block SNOWMAN_BLOCK_LIGHT_BLUE = registerBlock("snowman_block_light_blue", new TwoBlocksFacing());
    public static final Block SNOWMAN_BLOCK_YELLOW = registerBlock("snowman_block_yellow", new TwoBlocksFacing());
    public static final Block SNOWMAN_BLOCK_LIME = registerBlock("snowman_block_lime", new TwoBlocksFacing());
    public static final Block SNOWMAN_BLOCK_PINK = registerBlock("snowman_block_pink", new TwoBlocksFacing());
    public static final Block SNOWMAN_BLOCK_GRAY = registerBlock("snowman_block_gray", new TwoBlocksFacing());
    public static final Block SNOWMAN_BLOCK_LIGHT_GRAY = registerBlock("snowman_block_light_gray", new TwoBlocksFacing());
    public static final Block SNOWMAN_BLOCK_CYAN = registerBlock("snowman_block_cyan", new TwoBlocksFacing());
    public static final Block SNOWMAN_BLOCK_PURPLE = registerBlock("snowman_block_purple", new TwoBlocksFacing());
    public static final Block SNOWMAN_BLOCK_BLUE = registerBlock("snowman_block_blue", new TwoBlocksFacing());
    public static final Block SNOWMAN_BLOCK_BROWN = registerBlock("snowman_block_brown", new TwoBlocksFacing());
    public static final Block SNOWMAN_BLOCK_GREEN = registerBlock("snowman_block_green", new TwoBlocksFacing());
    public static final Block SNOWMAN_BLOCK_RED = registerBlock("snowman_block_red", new TwoBlocksFacing());
    public static final Block SNOWMAN_BLOCK_BLACK = registerBlock("snowman_block_black", new TwoBlocksFacing());

    // CUSTOM BLOCKS
    public static final Block SUGAR_BLOCK = registerBlock("sugar_block", new Block(FabricBlockSettings.create()));
    public static final Block GINGERBREAD_BLOCK = registerBlock("gingerbread_block", new Block(FabricBlockSettings.create()));
    public static final Block CHRISTMAS_LEAVES = registerBlock("christmas_leaves", new Block(FabricBlockSettings.create()));
    public static final Block SNOWY_CHRISTMAS_LEAVES = registerBlock("snowy_christmas_leaves", new Block(FabricBlockSettings.create()));
    public static final Block SNOWY_LEAVES = registerBlock("snowy_leaves", new Block(FabricBlockSettings.create()));
    public static final Block CHRISTMAS_TREE_TOPPER = registerBlock("christmas_tree_topper", new Block(FabricBlockSettings.create()));
    public static final Block CHRISTMAS_TREE_STAR_TOPPER_ONE = registerBlock("christmas_tree_star_topper_one", new Block(FabricBlockSettings.create()));
    public static final Block CHRISTMAS_TREE_STAR_TOPPER_TWO = registerBlock("christmas_tree_star_topper_two", new Block(FabricBlockSettings.create()));
    public static final Block WIRE = registerBlock("wire", new Block(FabricBlockSettings.create()));
    public static final Block CANDY_CANES_BLOCK = registerBlock("candy_canes_block", new Block(FabricBlockSettings.create()));
    public static final Block CANDY_CANES_TALL = registerBlock("candy_canes_tall", new Block(FabricBlockSettings.create()));
    public static final Block CHRISTMAS_TREE = registerBlock("christmas_tree", new ChristmasTreeBlock());
    public static final Block SNOWY_CHRISTMAS_TREE = registerBlock("snowy_christmas_tree", new ChristmasTreeBlock());
    public static final Block LITTLE_CHRISTMAS_TREE = registerBlock("little_christmas_tree", new Block(FabricBlockSettings.create()));
    public static final Block LITTLE_SNOWY_CHRISTMAS_TREE = registerBlock("little_snowy_christmas_tree", new Block(FabricBlockSettings.create()));
    public static final Block SANTA_CLAUS_BLOCK = registerBlock("santa_claus_block", new SantaClausBlock());
    public static final Block CHRISTMAS_BELLS = registerBlock("christmas_bells", new Block(FabricBlockSettings.create()));
    public static final Block TALL_SANTA_CLAUS_BLOCK = registerBlock("tall_santa_claus_block", new Block(FabricBlockSettings.create()));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(ChristmasCraft.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        ChristmasCraft.LOGGER.info("Registering Mod Blocks for " + ChristmasCraft.MOD_ID);
    }

}
