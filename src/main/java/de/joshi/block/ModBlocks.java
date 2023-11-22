package de.joshi.block;

import de.joshi.ChristmasCraft;
import de.joshi.block.custom.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
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
//    public static final Block CHRISTMAS_CEILING_LIGHT_WHITE = registerBlock("christmas_ceiling_light_white", new CeilingLightBlock());
//    public static final Block CHRISTMAS_CEILING_LIGHT_ORANGE = registerBlock("christmas_ceiling_light_orange", new CeilingLightBlock());
//    public static final Block CHRISTMAS_CEILING_LIGHT_MAGENTA = registerBlock("christmas_ceiling_light_magenta", new CeilingLightBlock());
//    public static final Block CHRISTMAS_CEILING_LIGHT_PALE_BLUE = registerBlock("christmas_ceiling_light_pale_blue", new CeilingLightBlock());
//    public static final Block CHRISTMAS_CEILING_LIGHT_YELLOW = registerBlock("christmas_ceiling_light_yellow", new CeilingLightBlock());
//    public static final Block CHRISTMAS_CEILING_LIGHT_LIME = registerBlock("christmas_ceiling_light_lime", new CeilingLightBlock());
//    public static final Block CHRISTMAS_CEILING_LIGHT_PINK = registerBlock("christmas_ceiling_light_pink", new CeilingLightBlock());
//    public static final Block CHRISTMAS_CEILING_LIGHT_GRAY = registerBlock("christmas_ceiling_light_gray", new CeilingLightBlock());
//    public static final Block CHRISTMAS_CEILING_LIGHT_PALE_GRAY = registerBlock("christmas_ceiling_light_pale_gray", new CeilingLightBlock());
//    public static final Block CHRISTMAS_CEILING_LIGHT_CYAN = registerBlock("christmas_ceiling_light_cyan", new CeilingLightBlock());
//    public static final Block CHRISTMAS_CEILING_PURPLE = registerBlock("christmas_ceiling_light_purple", new CeilingLightBlock());
//    public static final Block CHRISTMAS_CEILING_BLUE = registerBlock("christmas_ceiling_light_blue", new CeilingLightBlock());
//    public static final Block CHRISTMAS_CEILING_BROWN = registerBlock("christmas_ceiling_light_brown", new CeilingLightBlock());
//    public static final Block CHRISTMAS_CEILING_GREEN = registerBlock("christmas_ceiling_light_green", new CeilingLightBlock());
//    public static final Block CHRISTMAS_CEILING_RED = registerBlock("christmas_ceiling_light_red", new CeilingLightBlock());
//    public static final Block CHRISTMAS_CEILING_BLACK = registerBlock("christmas_ceiling_light_black", new CeilingLightBlock());

    // CHRISTMAS WALL LIGHT
//    public static final Block CHRISTMAS_WALL_LIGHT_WHITE = registerBlock("christmas_wall_light_white", new WallLightBlock());
//    public static final Block CHRISTMAS_WALL_LIGHT_ORANGE = registerBlock("christmas_wall_light_orange", new WallLightBlock());
//    public static final Block CHRISTMAS_WALL_LIGHT_MAGENTA = registerBlock("christmas_wall_light_magenta", new WallLightBlock());
//    public static final Block CHRISTMAS_WALL_LIGHT_PALE_BLUE = registerBlock("christmas_wall_light_pale_blue", new WallLightBlock());
//    public static final Block CHRISTMAS_WALL_LIGHT_YELLOW = registerBlock("christmas_wall_light_yellow", new WallLightBlock());
//    public static final Block CHRISTMAS_WALL_LIGHT_LIME = registerBlock("christmas_wall_light_lime", new WallLightBlock());
//    public static final Block CHRISTMAS_WALL_LIGHT_PINK = registerBlock("christmas_wall_light_pink", new WallLightBlock());
//    public static final Block CHRISTMAS_WALL_LIGHT_GRAY = registerBlock("christmas_wall_light_gray", new WallLightBlock());
//    public static final Block CHRISTMAS_WALL_LIGHT_PALE_GRAY = registerBlock("christmas_wall_light_pale_gray", new WallLightBlock());
//    public static final Block CHRISTMAS_WALL_LIGHT_CYAN = registerBlock("christmas_wall_light_cyan", new WallLightBlock());
//    public static final Block CHRISTMAS_WALL_LIGHT_PURPLE = registerBlock("christmas_wall_light_purple", new WallLightBlock());
//    public static final Block CHRISTMAS_WALL_LIGHT_BLUE = registerBlock("christmas_wall_light_blue", new WallLightBlock());
//    public static final Block CHRISTMAS_WALL_LIGHT_BROWN = registerBlock("christmas_wall_light_brown", new WallLightBlock());
//    public static final Block CHRISTMAS_WALL_LIGHT_GREEN = registerBlock("christmas_wall_light_green", new WallLightBlock());
//    public static final Block CHRISTMAS_WALL_LIGHT_RED = registerBlock("christmas_wall_light_red", new WallLightBlock());
//    public static final Block CHRISTMAS_WALL_LIGHT_BLACK = registerBlock("christmas_wall_light_black", new WallLightBlock());

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
//    public static final Block GARLAND = registerBlock("garland", new GarlandBlock());
//    public static final Block GARLAND_ROUND = registerBlock("garland_round", new GarlandRoundBlock());
//    public static final Block SNOWY_GARLAND = registerBlock("snowy_garland", new Block(FabricBlockSettings.create()));
//    public static final Block SNOWY_GARLAND_ROUND = registerBlock("snowy_garland_round", new GarlandRoundBlock());
//    public static final Block GARLAND_LIGHTLESS = registerBlock("garland_lightless", new Block(FabricBlockSettings.create()));
//    public static final Block GARLAND_ROUND_LIGHTLESS = registerBlock("garland_round_lightless", new GarlandRoundBlock());
//    public static final Block SNOWY_GARLAND_LIGHTLESS = registerBlock("snowy_garland_lightless", new Block(FabricBlockSettings.create()));
//    public static final Block SNOWY_GARLAND_ROUND_LIGHTLESS = registerBlock("snowy_garland_round_lightless", new GarlandRoundBlock());

    // SNOWMAN BLOCK
//    public static final Block SNOWMAN_BLOCK_WHITE = registerBlock("snowman_block_white", new TwoBlocksFacing());
//    public static final Block SNOWMAN_BLOCK_ORANGE = registerBlock("snowman_block_orange", new TwoBlocksFacing());
//    public static final Block SNOWMAN_BLOCK_MAGENTA = registerBlock("snowman_block_magenta", new TwoBlocksFacing());
//    public static final Block SNOWMAN_BLOCK_LIGHT_BLUE = registerBlock("snowman_block_light_blue", new TwoBlocksFacing());
//    public static final Block SNOWMAN_BLOCK_YELLOW = registerBlock("snowman_block_yellow", new TwoBlocksFacing());
//    public static final Block SNOWMAN_BLOCK_LIME = registerBlock("snowman_block_lime", new TwoBlocksFacing());
//    public static final Block SNOWMAN_BLOCK_PINK = registerBlock("snowman_block_pink", new TwoBlocksFacing());
//    public static final Block SNOWMAN_BLOCK_GRAY = registerBlock("snowman_block_gray", new TwoBlocksFacing());
//    public static final Block SNOWMAN_BLOCK_LIGHT_GRAY = registerBlock("snowman_block_light_gray", new TwoBlocksFacing());
//    public static final Block SNOWMAN_BLOCK_CYAN = registerBlock("snowman_block_cyan", new TwoBlocksFacing());
//    public static final Block SNOWMAN_BLOCK_PURPLE = registerBlock("snowman_block_purple", new TwoBlocksFacing());
//    public static final Block SNOWMAN_BLOCK_BLUE = registerBlock("snowman_block_blue", new TwoBlocksFacing());
//    public static final Block SNOWMAN_BLOCK_BROWN = registerBlock("snowman_block_brown", new TwoBlocksFacing());
//    public static final Block SNOWMAN_BLOCK_GREEN = registerBlock("snowman_block_green", new TwoBlocksFacing());
//    public static final Block SNOWMAN_BLOCK_RED = registerBlock("snowman_block_red", new TwoBlocksFacing());
//    public static final Block SNOWMAN_BLOCK_BLACK = registerBlock("snowman_block_black", new TwoBlocksFacing());

    // LITTLE SNOWMAN
    public static final Block LITTLE_SNOWMAN_WHITE = registerBlock("little_snowman_white", new LittleSnowmanBlock());
    public static final Block LITTLE_SNOWMAN_ORANGE = registerBlock("little_snowman_orange", new LittleSnowmanBlock());
    public static final Block LITTLE_SNOWMAN_MAGENTA = registerBlock("little_snowman_magenta", new LittleSnowmanBlock());
    public static final Block LITTLE_SNOWMAN_LIGHT_BLUE = registerBlock("little_snowman_light_blue", new LittleSnowmanBlock());
    public static final Block LITTLE_SNOWMAN_YELLOW = registerBlock("little_snowman_yellow", new LittleSnowmanBlock());
    public static final Block LITTLE_SNOWMAN_LIME = registerBlock("little_snowman_lime", new LittleSnowmanBlock());
    public static final Block LITTLE_SNOWMAN_PINK = registerBlock("little_snowman_pink", new LittleSnowmanBlock());
    public static final Block LITTLE_SNOWMAN_GRAY = registerBlock("little_snowman_gray", new LittleSnowmanBlock());
    public static final Block LITTLE_SNOWMAN_LIGHT_GRAY = registerBlock("little_snowman_light_gray", new LittleSnowmanBlock());
    public static final Block LITTLE_SNOWMAN_CYAN = registerBlock("little_snowman_cyan", new LittleSnowmanBlock());
    public static final Block LITTLE_SNOWMAN_PURPLE = registerBlock("little_snowman_purple", new LittleSnowmanBlock());
    public static final Block LITTLE_SNOWMAN_BLUE = registerBlock("little_snowman_blue", new LittleSnowmanBlock());
    public static final Block LITTLE_SNOWMAN_BROWN = registerBlock("little_snowman_brown", new LittleSnowmanBlock());
    public static final Block LITTLE_SNOWMAN_GREEN = registerBlock("little_snowman_green", new LittleSnowmanBlock());
    public static final Block LITTLE_SNOWMAN_RED = registerBlock("little_snowman_red", new LittleSnowmanBlock());
    public static final Block LITTLE_SNOWMAN_BLACK = registerBlock("little_snowman_black", new LittleSnowmanBlock());

    // CHRISTMAS PRESENT
    public static final Block CHRISTMAS_PRESENT_WHITE = registerBlock("christmas_present_white", new ChristmasPresentsBlock());
    public static final Block CHRISTMAS_PRESENT_ORANGE = registerBlock("christmas_present_orange", new ChristmasPresentsBlock());
    public static final Block CHRISTMAS_PRESENT_MAGENTA = registerBlock("christmas_present_magenta", new ChristmasPresentsBlock());
    public static final Block CHRISTMAS_PRESENT_LIGHT_BLUE = registerBlock("christmas_present_light_blue", new ChristmasPresentsBlock());
    public static final Block CHRISTMAS_PRESENT_YELLOW = registerBlock("christmas_present_yellow", new ChristmasPresentsBlock());
    public static final Block CHRISTMAS_PRESENT_LIME = registerBlock("christmas_present_lime", new ChristmasPresentsBlock());
    public static final Block CHRISTMAS_PRESENT_PINK = registerBlock("christmas_present_pink", new ChristmasPresentsBlock());
    public static final Block CHRISTMAS_PRESENT_GRAY = registerBlock("christmas_present_gray", new ChristmasPresentsBlock());
    public static final Block CHRISTMAS_PRESENT_LIGHT_GRAY = registerBlock("christmas_present_light_gray", new ChristmasPresentsBlock());
    public static final Block CHRISTMAS_PRESENT_CYAN = registerBlock("christmas_present_cyan", new ChristmasPresentsBlock());
    public static final Block CHRISTMAS_PRESENT_PURPLE = registerBlock("christmas_present_purple", new ChristmasPresentsBlock());
    public static final Block CHRISTMAS_PRESENT_BLUE = registerBlock("christmas_present_blue", new ChristmasPresentsBlock());
    public static final Block CHRISTMAS_PRESENT_BROWN = registerBlock("christmas_present_brown", new ChristmasPresentsBlock());
    public static final Block CHRISTMAS_PRESENT_GREEN = registerBlock("christmas_present_green", new ChristmasPresentsBlock());
    public static final Block CHRISTMAS_PRESENT_RED = registerBlock("christmas_present_red", new ChristmasPresentsBlock());
    public static final Block CHRISTMAS_PRESENT_BLACK = registerBlock("christmas_present_black", new ChristmasPresentsBlock());

    // CHRISTMAS PRESENT SHORT
    public static final Block CHRISTMAS_PRESENT_SHORT_WHITE = registerBlock("christmas_present_short_white", new ChristmasPresentsShortBlock());
    public static final Block CHRISTMAS_PRESENT_SHORT_ORANGE = registerBlock("christmas_present_short_orange", new ChristmasPresentsShortBlock());
    public static final Block CHRISTMAS_PRESENT_SHORT_MAGENTA = registerBlock("christmas_present_short_magenta", new ChristmasPresentsShortBlock());
    public static final Block CHRISTMAS_PRESENT_SHORT_LIGHT_BLUE = registerBlock("christmas_present_short_light_blue", new ChristmasPresentsShortBlock());
    public static final Block CHRISTMAS_PRESENT_SHORT_YELLOW = registerBlock("christmas_present_short_yellow", new ChristmasPresentsShortBlock());
    public static final Block CHRISTMAS_PRESENT_SHORT_LIME = registerBlock("christmas_present_short_lime", new ChristmasPresentsShortBlock());
    public static final Block CHRISTMAS_PRESENT_SHORT_PINK = registerBlock("christmas_present_short_pink", new ChristmasPresentsShortBlock());
    public static final Block CHRISTMAS_PRESENT_SHORT_GRAY = registerBlock("christmas_present_short_gray", new ChristmasPresentsShortBlock());
    public static final Block CHRISTMAS_PRESENT_SHORT_LIGHT_GRAY = registerBlock("christmas_present_short_light_gray", new ChristmasPresentsShortBlock());
    public static final Block CHRISTMAS_PRESENT_SHORT_CYAN = registerBlock("christmas_present_short_cyan", new ChristmasPresentsShortBlock());
    public static final Block CHRISTMAS_PRESENT_SHORT_PURPLE = registerBlock("christmas_present_short_purple", new ChristmasPresentsShortBlock());
    public static final Block CHRISTMAS_PRESENT_SHORT_BLUE = registerBlock("christmas_present_short_blue", new ChristmasPresentsShortBlock());
    public static final Block CHRISTMAS_PRESENT_SHORT_BROWN = registerBlock("christmas_present_short_brown", new ChristmasPresentsShortBlock());
    public static final Block CHRISTMAS_PRESENT_SHORT_GREEN = registerBlock("christmas_present_short_green", new ChristmasPresentsShortBlock());
    public static final Block CHRISTMAS_PRESENT_SHORT_RED = registerBlock("christmas_present_short_red", new ChristmasPresentsShortBlock());
    public static final Block CHRISTMAS_PRESENT_SHORT_BLACK = registerBlock("christmas_present_short_black", new ChristmasPresentsShortBlock());

    // CHRISTMAS PRESENT TALL
    public static final Block CHRISTMAS_PRESENT_TALL_WHITE = registerBlock("christmas_present_tall_white", new ChristmasPresentsTallBlock());
    public static final Block CHRISTMAS_PRESENT_TALL_ORANGE = registerBlock("christmas_present_tall_orange", new ChristmasPresentsTallBlock());
    public static final Block CHRISTMAS_PRESENT_TALL_MAGENTA = registerBlock("christmas_present_tall_magenta", new ChristmasPresentsTallBlock());
    public static final Block CHRISTMAS_PRESENT_TALL_LIGHT_BLUE = registerBlock("christmas_present_tall_light_blue", new ChristmasPresentsTallBlock());
    public static final Block CHRISTMAS_PRESENT_TALL_YELLOW = registerBlock("christmas_present_tall_yellow", new ChristmasPresentsTallBlock());
    public static final Block CHRISTMAS_PRESENT_TALL_LIME = registerBlock("christmas_present_tall_lime", new ChristmasPresentsTallBlock());
    public static final Block CHRISTMAS_PRESENT_TALL_PINK = registerBlock("christmas_present_tall_pink", new ChristmasPresentsTallBlock());
    public static final Block CHRISTMAS_PRESENT_TALL_GRAY = registerBlock("christmas_present_tall_gray", new ChristmasPresentsTallBlock());
    public static final Block CHRISTMAS_PRESENT_TALL_LIGHT_GRAY = registerBlock("christmas_present_tall_light_gray", new ChristmasPresentsTallBlock());
    public static final Block CHRISTMAS_PRESENT_TALL_CYAN = registerBlock("christmas_present_tall_cyan", new ChristmasPresentsTallBlock());
    public static final Block CHRISTMAS_PRESENT_TALL_PURPLE = registerBlock("christmas_present_tall_purple", new ChristmasPresentsTallBlock());
    public static final Block CHRISTMAS_PRESENT_TALL_BLUE = registerBlock("christmas_present_tall_blue", new ChristmasPresentsTallBlock());
    public static final Block CHRISTMAS_PRESENT_TALL_BROWN = registerBlock("christmas_present_tall_brown", new ChristmasPresentsTallBlock());
    public static final Block CHRISTMAS_PRESENT_TALL_GREEN = registerBlock("christmas_present_tall_red", new ChristmasPresentsTallBlock());
    public static final Block CHRISTMAS_PRESENT_TALL_BLACK = registerBlock("christmas_present_tall_black", new ChristmasPresentsTallBlock());

    // EPIPHANY STOCKING
    public static final Block EPIPHANY_STOCKING_WHITE = registerBlock("epiphany_stocking_white", new EpiphanyStockingBlock());
    public static final Block EPIPHANY_STOCKING_ORANGE = registerBlock("epiphany_stocking_orange", new EpiphanyStockingBlock());
    public static final Block EPIPHANY_STOCKING_MAGENTA = registerBlock("epiphany_stocking_magenta", new EpiphanyStockingBlock());
    public static final Block EPIPHANY_STOCKING_LIGHT_BLUE = registerBlock("epiphany_stocking_light_blue", new EpiphanyStockingBlock());
    public static final Block EPIPHANY_STOCKING_YELLOW = registerBlock("epiphany_stocking_yellow", new EpiphanyStockingBlock());
    public static final Block EPIPHANY_STOCKING_LIME = registerBlock("epiphany_stocking_lime", new EpiphanyStockingBlock());
    public static final Block EPIPHANY_STOCKING_PINK = registerBlock("epiphany_stocking_pink", new EpiphanyStockingBlock());
    public static final Block EPIPHANY_STOCKING_GRAY = registerBlock("epiphany_stocking_gray", new EpiphanyStockingBlock());
    public static final Block EPIPHANY_STOCKING_LIGHT_GRAY = registerBlock("epiphany_stocking_light_gray", new EpiphanyStockingBlock());
    public static final Block EPIPHANY_STOCKING_CYAN = registerBlock("epiphany_stocking_cyan", new EpiphanyStockingBlock());
    public static final Block EPIPHANY_STOCKING_PURPLE = registerBlock("epiphany_stocking_purple", new EpiphanyStockingBlock());
    public static final Block EPIPHANY_STOCKING_BLUE = registerBlock("epiphany_stocking_blue", new EpiphanyStockingBlock());
    public static final Block EPIPHANY_STOCKING_BROWN = registerBlock("epiphany_stocking_brown", new EpiphanyStockingBlock());
    public static final Block EPIPHANY_STOCKING_GREEN = registerBlock("epiphany_stocking_green", new EpiphanyStockingBlock());
    public static final Block EPIPHANY_STOCKING_RED = registerBlock("epiphany_stocking_red", new EpiphanyStockingBlock());
    public static final Block EPIPHANY_STOCKING_BLACK = registerBlock("epiphany_stocking_black", new EpiphanyStockingBlock());

    // RREDSTONE LAMP
    public static final Block REDSTONE_LAMP_WHITE = registerBlock("redstone_lamp_white", new RedstoneLampBlock());
    public static final Block REDSTONE_LAMP_ORANGE = registerBlock("redstone_lamp_orange", new RedstoneLampBlock());
    public static final Block REDSTONE_LAMP_MAGENTA = registerBlock("redstone_lamp_magenta", new RedstoneLampBlock());
    public static final Block REDSTONE_LAMP_LIGHT_BLUE = registerBlock("redstone_lamp_light_blue", new RedstoneLampBlock());
    public static final Block REDSTONE_LAMP_YELLOW = registerBlock("redstone_lamp_yellow", new RedstoneLampBlock());
    public static final Block REDSTONE_LAMP_LIME = registerBlock("redstone_lamp_lime", new RedstoneLampBlock());
    public static final Block REDSTONE_LAMP_PINK = registerBlock("redstone_lamp_pink", new RedstoneLampBlock());
    public static final Block REDSTONE_LAMP_GRAY = registerBlock("redstone_lamp_gray", new RedstoneLampBlock());
    public static final Block REDSTONE_LAMP_LIGHT_GRAY = registerBlock("redstone_lamp_light_gray", new RedstoneLampBlock());
    public static final Block REDSTONE_LAMP_CYAN = registerBlock("redstone_lamp_cyan", new RedstoneLampBlock());
    public static final Block REDSTONE_LAMP_PURPLE = registerBlock("redstone_lamp_purple", new RedstoneLampBlock());
    public static final Block REDSTONE_LAMP_BLUE = registerBlock("redstone_lamp_blue", new RedstoneLampBlock());
    public static final Block REDSTONE_LAMP_BROWN = registerBlock("redstone_lamp_brown", new RedstoneLampBlock());
    public static final Block REDSTONE_LAMP_GREEN = registerBlock("redstone_lamp_green", new RedstoneLampBlock());
    public static final Block REDSTONE_LAMP_RED = registerBlock("redstone_lamp_red", new RedstoneLampBlock());
    public static final Block REDSTONE_LAMP_BLACK = registerBlock("redstone_lamp_black", new RedstoneLampBlock());

    // CUSTOM BLOCKS
    public static final Block SUGAR_BLOCK = registerBlock("sugar_block", new Block(FabricBlockSettings.create()));
    public static final Block GINGERBREAD_BLOCK = registerBlock("gingerbread_block", new Block(FabricBlockSettings.create()));
    public static final Block CHRISTMAS_LEAVES = registerBlock("christmas_leaves", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block SNOWY_CHRISTMAS_LEAVES = registerBlock("snowy_christmas_leaves", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block SNOWY_LEAVES = registerBlock("snowy_leaves", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block CHRISTMAS_TREE_TOPPER = registerBlock("christmas_tree_topper", new Block(FabricBlockSettings.create()));
    public static final Block CHRISTMAS_TREE_STAR_TOPPER_ONE = registerBlock("christmas_tree_star_topper_one", new Block(FabricBlockSettings.create()));
    public static final Block CHRISTMAS_TREE_STAR_TOPPER_TWO = registerBlock("christmas_tree_star_topper_two", new Block(FabricBlockSettings.create()));
    public static final Block WIRE = registerBlock("wire", new Block(FabricBlockSettings.create()));
    public static final Block CANDY_CANES_BLOCK = registerBlock("candy_canes_block", new CandyCanesBlock());
//    public static final Block CANDY_CANES_TALL = registerBlock("candy_canes_tall", new Block(FabricBlockSettings.create()));
//    public static final Block CHRISTMAS_TREE = registerBlock("christmas_tree", new ChristmasTreeBlock());
//    public static final Block SNOWY_CHRISTMAS_TREE = registerBlock("snowy_christmas_tree", new ChristmasTreeBlock());
    public static final Block LITTLE_CHRISTMAS_TREE = registerBlock("little_christmas_tree", new LittleSnowmanBlock());
    public static final Block LITTLE_SNOWY_CHRISTMAS_TREE = registerBlock("little_snowy_christmas_tree", new LittleSnowmanBlock());
    public static final Block SANTA_CLAUS_BLOCK = registerBlock("santa_claus_block", new SantaClausBlock());
    public static final Block CHRISTMAS_BELLS = registerBlock("christmas_bells", new Block(FabricBlockSettings.create()));
//    public static final Block TALL_SANTA_CLAUS_BLOCK = registerBlock("tall_santa_claus_block", new Block(FabricBlockSettings.create()));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(ChristmasCraft.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        ChristmasCraft.LOGGER.info("Registering Mod Blocks for " + ChristmasCraft.MOD_ID);
    }

}
