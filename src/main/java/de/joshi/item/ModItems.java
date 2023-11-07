package de.joshi.item;

import de.joshi.ChristmasCraft;
import de.joshi.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // BLOCKITEMS
    public static final Item PLASTIC_BLOCK_WHITE = registerItem("plastic_block_white", ModBlocks.PLASTIC_BLOCK_WHITE);
    public static final Item PLASTIC_BLOCK_ORANGE = registerItem("plastic_block_orange", ModBlocks.PLASTIC_BLOCK_ORANGE);
    public static final Item PLASTIC_BLOCK_MAGENTA = registerItem("plastic_block_magenta", ModBlocks.PLASTIC_BLOCK_MAGENTA);
    public static final Item PLASTIC_BLOCK_LIGHT_BLUE = registerItem("plastic_block_light_blue", ModBlocks.PLASTIC_BLOCK_LIGHT_BLUE);
    public static final Item PLASTIC_BLOCK_YELLOW = registerItem("plastic_block_yellow", ModBlocks.PLASTIC_BLOCK_YELLOW);
    public static final Item PLASTIC_BLOCK_LIME = registerItem("plastic_block_lime", ModBlocks.PLASTIC_BLOCK_LIME);
    public static final Item PLASTIC_BLOCK_PINK = registerItem("plastic_block_pink", ModBlocks.PLASTIC_BLOCK_PINK);
    public static final Item PLASTIC_BLOCK_GRAY = registerItem("plastic_block_gray", ModBlocks.PLASTIC_BLOCK_GRAY);
    public static final Item PLASTIC_BLOCK_LIGHT_GRAY = registerItem("plastic_block_light_gray", ModBlocks.PLASTIC_BLOCK_LIGHT_GRAY);
    public static final Item PLASTIC_BLOCK_CYAN = registerItem("plastic_block_cyan", ModBlocks.PLASTIC_BLOCK_CYAN);
    public static final Item PLASTIC_BLOCK_PURPLE = registerItem("plastic_block_purple", ModBlocks.PLASTIC_BLOCK_PURPLE);
    public static final Item PLASTIC_BLOCK_BLUE = registerItem("plastic_block_blue", ModBlocks.PLASTIC_BLOCK_BLUE);
    public static final Item PLASTIC_BLOCK_BROWN = registerItem("plastic_block_brown", ModBlocks.PLASTIC_BLOCK_BROWN);
    public static final Item PLASTIC_BLOCK_GREEN = registerItem("plastic_block_green", ModBlocks.PLASTIC_BLOCK_GREEN);
    public static final Item PLASTIC_BLOCK_RED = registerItem("plastic_block_red", ModBlocks.PLASTIC_BLOCK_RED);
    public static final Item PLASTIC_BLOCK_BLACK = registerItem("plastic_block_black", ModBlocks.PLASTIC_BLOCK_BLACK);
    public static final Item CHRISTMAS_CEILING_LIGHT_WHITE = registerItem("christmas_ceiling_light_white", ModBlocks.CHRISTMAS_CEILING_LIGHT_WHITE);
    public static final Item CHRISTMAS_CEILING_LIGHT_ORANGE = registerItem("christmas_ceiling_light_orange", ModBlocks.CHRISTMAS_CEILING_LIGHT_ORANGE);
    public static final Item CHRISTMAS_CEILING_LIGHT_MAGENTA = registerItem("christmas_ceiling_light_magenta", ModBlocks.CHRISTMAS_CEILING_LIGHT_MAGENTA);
    public static final Item CHRISTMAS_CEILING_LIGHT_PALE_BLUE = registerItem("christmas_ceiling_light_pale_blue", ModBlocks.CHRISTMAS_CEILING_LIGHT_PALE_BLUE);
    public static final Item CHRISTMAS_CEILING_LIGHT_YELLOW = registerItem("christmas_ceiling_light_yellow", ModBlocks.CHRISTMAS_CEILING_LIGHT_YELLOW);
    public static final Item CHRISTMAS_CEILING_LIGHT_LIME = registerItem("christmas_ceiling_light_lime", ModBlocks.CHRISTMAS_CEILING_LIGHT_LIME);
    public static final Item CHRISTMAS_CEILING_LIGHT_PINK = registerItem("christmas_ceiling_light_pink", ModBlocks.CHRISTMAS_CEILING_LIGHT_PINK);
    public static final Item CHRISTMAS_CEILING_LIGHT_GRAY = registerItem("christmas_ceiling_light_gray", ModBlocks.CHRISTMAS_CEILING_LIGHT_GRAY);
    public static final Item CHRISTMAS_CEILING_LIGHT_PALE_GRAY = registerItem("christmas_ceiling_light_pale_gray", ModBlocks.CHRISTMAS_CEILING_LIGHT_PALE_GRAY);
    public static final Item CHRISTMAS_CEILING_LIGHT_CYAN = registerItem("christmas_ceiling_light_cyan", ModBlocks.CHRISTMAS_CEILING_LIGHT_CYAN);
    public static final Item CHRISTMAS_CEILING_PURPLE = registerItem("christmas_ceiling_light_purple", ModBlocks.CHRISTMAS_CEILING_PURPLE);
    public static final Item CHRISTMAS_CEILING_BLUE = registerItem("christmas_ceiling_light_blue", ModBlocks.CHRISTMAS_CEILING_BLUE);
    public static final Item CHRISTMAS_CEILING_BROWN = registerItem("christmas_ceiling_light_brown", ModBlocks.CHRISTMAS_CEILING_BROWN);
    public static final Item CHRISTMAS_CEILING_GREEN = registerItem("christmas_ceiling_light_green", ModBlocks.CHRISTMAS_CEILING_GREEN);
    public static final Item CHRISTMAS_CEILING_RED = registerItem("christmas_ceiling_light_red", ModBlocks.CHRISTMAS_CEILING_RED);
    public static final Item CHRISTMAS_CEILING_BLACK = registerItem("christmas_ceiling_light_black", ModBlocks.CHRISTMAS_CEILING_BLACK);
    public static final Item CHRISTMAS_WALL_LIGHT_WHITE = registerItem("christmas_wall_light_white", ModBlocks.CHRISTMAS_WALL_LIGHT_WHITE);
    public static final Item CHRISTMAS_WALL_LIGHT_ORANGE = registerItem("christmas_wall_light_orange", ModBlocks.CHRISTMAS_WALL_LIGHT_ORANGE);
    public static final Item CHRISTMAS_WALL_LIGHT_MAGENTA = registerItem("christmas_wall_light_magenta", ModBlocks.CHRISTMAS_WALL_LIGHT_MAGENTA);
    public static final Item CHRISTMAS_WALL_LIGHT_PALE_BLUE = registerItem("christmas_wall_light_pale_blue", ModBlocks.CHRISTMAS_WALL_LIGHT_PALE_BLUE);
    public static final Item CHRISTMAS_WALL_LIGHT_YELLOW = registerItem("christmas_wall_light_yellow", ModBlocks.CHRISTMAS_WALL_LIGHT_YELLOW);
    public static final Item CHRISTMAS_WALL_LIGHT_LIME = registerItem("christmas_wall_light_lime", ModBlocks.CHRISTMAS_WALL_LIGHT_LIME);
    public static final Item CHRISTMAS_WALL_LIGHT_PINK = registerItem("christmas_wall_light_pink", ModBlocks.CHRISTMAS_WALL_LIGHT_PINK);
    public static final Item CHRISTMAS_WALL_LIGHT_GRAY = registerItem("christmas_wall_light_gray", ModBlocks.CHRISTMAS_WALL_LIGHT_GRAY);
    public static final Item CHRISTMAS_WALL_LIGHT_PALE_GRAY = registerItem("christmas_wall_light_pale_gray", ModBlocks.CHRISTMAS_WALL_LIGHT_PALE_GRAY);
    public static final Item CHRISTMAS_WALL_LIGHT_CYAN = registerItem("christmas_wall_light_cyan", ModBlocks.CHRISTMAS_WALL_LIGHT_CYAN);
    public static final Item CHRISTMAS_WALL_LIGHT_PURPLE = registerItem("christmas_wall_light_purple", ModBlocks.CHRISTMAS_WALL_LIGHT_PURPLE);
    public static final Item CHRISTMAS_WALL_LIGHT_BLUE = registerItem("christmas_wall_light_blue", ModBlocks.CHRISTMAS_WALL_LIGHT_BLUE);
    public static final Item CHRISTMAS_WALL_LIGHT_BROWN = registerItem("christmas_wall_light_brown", ModBlocks.CHRISTMAS_WALL_LIGHT_BROWN);
    public static final Item CHRISTMAS_WALL_LIGHT_GREEN = registerItem("christmas_wall_light_green", ModBlocks.CHRISTMAS_WALL_LIGHT_GREEN);
    public static final Item CHRISTMAS_WALL_LIGHT_RED = registerItem("christmas_wall_light_red", ModBlocks.CHRISTMAS_WALL_LIGHT_RED);
    public static final Item CHRISTMAS_WALL_LIGHT_BLACK = registerItem("christmas_wall_light_black", ModBlocks.CHRISTMAS_WALL_LIGHT_BLACK);
    public static final Item CHRISTMAS_SQUARE_WHITE = registerItem("christmas_square_white", ModBlocks.CHRISTMAS_SQUARE_WHITE);
    public static final Item CHRISTMAS_SQUARE_ORANGE = registerItem("christmas_square_orange", ModBlocks.CHRISTMAS_SQUARE_ORANGE);
    public static final Item CHRISTMAS_SQUARE_MAGENTA = registerItem("christmas_square_magenta", ModBlocks.CHRISTMAS_SQUARE_MAGENTA);
    public static final Item CHRISTMAS_SQUARE_LIGHT_BLUE = registerItem("christmas_square_light_blue", ModBlocks.CHRISTMAS_SQUARE_LIGHT_BLUE);
    public static final Item CHRISTMAS_SQUARE_YELLOW = registerItem("christmas_square_yellow", ModBlocks.CHRISTMAS_SQUARE_YELLOW);
    public static final Item CHRISTMAS_SQUARE_LIME = registerItem("christmas_square_lime", ModBlocks.CHRISTMAS_SQUARE_LIME);
    public static final Item CHRISTMAS_SQUARE_PINK = registerItem("christmas_square_pink", ModBlocks.CHRISTMAS_SQUARE_PINK);
    public static final Item CHRISTMAS_SQUARE_GRAY = registerItem("christmas_square_gray", ModBlocks.CHRISTMAS_SQUARE_GRAY);
    public static final Item CHRISTMAS_SQUARE_LIGHT_GRAY = registerItem("christmas_square_light_gray", ModBlocks.CHRISTMAS_SQUARE_LIGHT_GRAY);
    public static final Item CHRISTMAS_SQUARE_CYAN = registerItem("christmas_square_cyan", ModBlocks.CHRISTMAS_SQUARE_CYAN);
    public static final Item CHRISTMAS_SQUARE_PURPLE = registerItem("christmas_square_purple", ModBlocks.CHRISTMAS_SQUARE_PURPLE);
    public static final Item CHRISTMAS_SQUARE_BLUE = registerItem("christmas_square_blue", ModBlocks.CHRISTMAS_SQUARE_BLUE);
    public static final Item CHRISTMAS_SQUARE_BROWN = registerItem("christmas_square_brown", ModBlocks.CHRISTMAS_SQUARE_BROWN);
    public static final Item CHRISTMAS_SQUARE_GREEN = registerItem("christmas_square_green", ModBlocks.CHRISTMAS_SQUARE_GREEN);
    public static final Item CHRISTMAS_SQUARE_RED = registerItem("christmas_square_red", ModBlocks.CHRISTMAS_SQUARE_RED);
    public static final Item CHRISTMAS_SQUARE_BLACK = registerItem("christmas_square_black", ModBlocks.CHRISTMAS_SQUARE_BLACK);
    public static final Item CHRISTMAS_BALL_WHITE = registerItem("christmas_ball_white", ModBlocks.CHRISTMAS_BALL_WHITE);
    public static final Item CHRISTMAS_BALL_ORANGE = registerItem("christmas_ball_orange", ModBlocks.CHRISTMAS_BALL_ORANGE);
    public static final Item CHRISTMAS_BALL_MAGENTA = registerItem("christmas_ball_magenta", ModBlocks.CHRISTMAS_BALL_MAGENTA);
    public static final Item CHRISTMAS_BALL_LIGHT_BLUE = registerItem("christmas_ball_light_blue", ModBlocks.CHRISTMAS_BALL_LIGHT_BLUE);
    public static final Item CHRISTMAS_BALL_YELLOW = registerItem("christmas_ball_yellow", ModBlocks.CHRISTMAS_BALL_YELLOW);
    public static final Item CHRISTMAS_BALL_LIME = registerItem("christmas_ball_lime", ModBlocks.CHRISTMAS_BALL_LIME);
    public static final Item CHRISTMAS_BALL_PINK = registerItem("christmas_ball_pink", ModBlocks.CHRISTMAS_BALL_PINK);
    public static final Item CHRISTMAS_BALL_GRAY = registerItem("christmas_ball_gray", ModBlocks.CHRISTMAS_BALL_GRAY);
    public static final Item CHRISTMAS_BALL_LIGHT_GRAY = registerItem("christmas_ball_light_gray", ModBlocks.CHRISTMAS_BALL_LIGHT_GRAY);
    public static final Item CHRISTMAS_BALL_CYAN = registerItem("christmas_ball_cyan", ModBlocks.CHRISTMAS_BALL_CYAN);
    public static final Item CHRISTMAS_BALL_PURPLE = registerItem("christmas_ball_purple", ModBlocks.CHRISTMAS_BALL_PURPLE);
    public static final Item CHRISTMAS_BALL_BLUE = registerItem("christmas_ball_blue", ModBlocks.CHRISTMAS_BALL_BLUE);
    public static final Item CHRISTMAS_BALL_BROWN = registerItem("christmas_ball_brown", ModBlocks.CHRISTMAS_BALL_BROWN);
    public static final Item CHRISTMAS_BALL_GREEN = registerItem("christmas_ball_green", ModBlocks.CHRISTMAS_BALL_GREEN);
    public static final Item CHRISTMAS_BALL_RED = registerItem("christmas_ball_red", ModBlocks.CHRISTMAS_BALL_RED);
    public static final Item CHRISTMAS_BALL_BLACK = registerItem("christmas_ball_black", ModBlocks.CHRISTMAS_BALL_BLACK);
    public static final Item GARLAND = registerItem("garland", ModBlocks.GARLAND);
    public static final Item GARLAND_ROUND = registerItem("garland_round", ModBlocks.GARLAND_ROUND);
    public static final Item SNOWY_GARLAND = registerItem("snowy_garland", ModBlocks.SNOWY_GARLAND);
    public static final Item SNOWY_GARLAND_ROUND = registerItem("snowy_garland_round", ModBlocks.SNOWY_GARLAND_ROUND);
    public static final Item GARLAND_LIGHTLESS = registerItem("garland_lightless", ModBlocks.GARLAND_LIGHTLESS);
    public static final Item GARLAND_ROUND_LIGHTLESS = registerItem("garland_round_lightless", ModBlocks.GARLAND_ROUND_LIGHTLESS);
    public static final Item SNOWY_GARLAND_LIGHTLESS = registerItem("snowy_garland_lightless", ModBlocks.SNOWY_GARLAND_LIGHTLESS);
    public static final Item SNOWY_GARLAND_ROUND_LIGHTLESS = registerItem("snowy_garland_round_lightless", ModBlocks.SNOWY_GARLAND_ROUND_LIGHTLESS);
    public static final Item SNOWMAN_BLOCK_WHITE = registerItem("snowman_block_white", ModBlocks.SNOWMAN_BLOCK_WHITE);
    public static final Item SNOWMAN_BLOCK_ORANGE = registerItem("snowman_block_orange", ModBlocks.SNOWMAN_BLOCK_ORANGE);
    public static final Item SNOWMAN_BLOCK_MAGENTA = registerItem("snowman_block_magenta", ModBlocks.SNOWMAN_BLOCK_MAGENTA);
    public static final Item SNOWMAN_BLOCK_LIGHT_BLUE = registerItem("snowman_block_light_blue", ModBlocks.SNOWMAN_BLOCK_LIGHT_BLUE);
    public static final Item SNOWMAN_BLOCK_YELLOW = registerItem("snowman_block_yellow", ModBlocks.SNOWMAN_BLOCK_YELLOW);
    public static final Item SNOWMAN_BLOCK_LIME = registerItem("snowman_block_lime", ModBlocks.SNOWMAN_BLOCK_LIME);
    public static final Item SNOWMAN_BLOCK_PINK = registerItem("snowman_block_pink", ModBlocks.SNOWMAN_BLOCK_PINK);
    public static final Item SNOWMAN_BLOCK_GRAY = registerItem("snowman_block_gray", ModBlocks.SNOWMAN_BLOCK_GRAY);
    public static final Item SNOWMAN_BLOCK_LIGHT_GRAY = registerItem("snowman_block_light_gray", ModBlocks.SNOWMAN_BLOCK_LIGHT_GRAY);
    public static final Item SNOWMAN_BLOCK_CYAN = registerItem("snowman_block_cyan", ModBlocks.SNOWMAN_BLOCK_CYAN);
    public static final Item SNOWMAN_BLOCK_PURPLE = registerItem("snowman_block_purple", ModBlocks.SNOWMAN_BLOCK_PURPLE);
    public static final Item SNOWMAN_BLOCK_BLUE = registerItem("snowman_block_blue", ModBlocks.SNOWMAN_BLOCK_BLUE);
    public static final Item SNOWMAN_BLOCK_BROWN = registerItem("snowman_block_brown", ModBlocks.SNOWMAN_BLOCK_BROWN);
    public static final Item SNOWMAN_BLOCK_GREEN = registerItem("snowman_block_green", ModBlocks.SNOWMAN_BLOCK_GREEN);
    public static final Item SNOWMAN_BLOCK_RED = registerItem("snowman_block_red", ModBlocks.SNOWMAN_BLOCK_RED);
    public static final Item SNOWMAN_BLOCK_BLACK = registerItem("snowman_block_black", ModBlocks.SNOWMAN_BLOCK_BLACK);
    public static final Item SUGAR_BLOCK = registerItem("sugar_block", ModBlocks.SUGAR_BLOCK);
    public static final Item GINGERBREAD_BLOCK = registerItem("gingerbread_block", ModBlocks.GINGERBREAD_BLOCK);
    public static final Item CHRISTMAS_LEAVES = registerItem("christmas_leaves", ModBlocks.CHRISTMAS_LEAVES);
    public static final Item SNOWY_CHRISTMAS_LEAVES = registerItem("snowy_christmas_leaves", ModBlocks.SNOWY_CHRISTMAS_LEAVES);
    public static final Item SNOWY_LEAVES = registerItem("snowy_leaves", ModBlocks.SNOWY_LEAVES);
    public static final Item CHRISTMAS_TREE_TOPPER = registerItem("christmas_tree_topper", ModBlocks.CHRISTMAS_TREE_TOPPER);
    public static final Item CHRISTMAS_TREE_STAR_TOPPER_ONE = registerItem("christmas_tree_star_topper_one", ModBlocks.CHRISTMAS_TREE_STAR_TOPPER_ONE);
    public static final Item CHRISTMAS_TREE_STAR_TOPPER_TWO = registerItem("christmas_tree_star_topper_two", ModBlocks.CHRISTMAS_TREE_STAR_TOPPER_TWO);
    public static final Item WIRE = registerItem("wire", ModBlocks.WIRE);
    public static final Item CANDY_CANES_BLOCK = registerItem("candy_canes_block", ModBlocks.CANDY_CANES_BLOCK);
    public static final Item CANDY_CANES_TALL = registerItem("candy_canes_tall", ModBlocks.CANDY_CANES_TALL);
    public static final Item CHRISTMAS_TREE = registerItem("christmas_tree", ModBlocks.CHRISTMAS_TREE);
    public static final Item SNOWY_CHRISTMAS_TREE = registerItem("snowy_christmas_tree", ModBlocks.SNOWY_CHRISTMAS_TREE);
    public static final Item LITTLE_CHRISTMAS_TREE = registerItem("little_christmas_tree", ModBlocks.LITTLE_CHRISTMAS_TREE);
    public static final Item LITTLE_SNOWY_CHRISTMAS_TREE = registerItem("little_snowy_christmas_tree", ModBlocks.LITTLE_SNOWY_CHRISTMAS_TREE);
    public static final Item SANTA_CLAUS_BLOCK = registerItem("santa_claus_block", ModBlocks.SANTA_CLAUS_BLOCK);
    public static final Item CHRISTMAS_BELLS = registerItem("christmas_bells", ModBlocks.CHRISTMAS_BELLS);
    public static final Item TALL_SANTA_CLAUS_BLOCK = registerItem("tall_santa_claus_block", ModBlocks.TALL_SANTA_CLAUS_BLOCK);

    // ITEMS
    public static final Item PLASTIC = registerItem("plastic", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ChristmasCraft.MOD_ID, name), item);
    }

    private static Item registerItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ChristmasCraft.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModItems() {
        ChristmasCraft.LOGGER.info("Registering Mod Items for " + ChristmasCraft.MOD_ID);
    }

}
