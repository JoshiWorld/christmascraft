package de.joshi.item;

import de.joshi.ChristmasCraft;
import de.joshi.block.ModBlocks;
import de.joshi.item.custom.AdventCalendarItem;
import de.joshi.item.custom.LightBulbItem;
import de.joshi.item.custom.WearableItem;
import de.joshi.item.food.ModFoodComponents;
import de.joshi.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

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
//    public static final Item CHRISTMAS_CEILING_LIGHT_WHITE = registerItem("christmas_ceiling_light_white", ModBlocks.CHRISTMAS_CEILING_LIGHT_WHITE);
//    public static final Item CHRISTMAS_CEILING_LIGHT_ORANGE = registerItem("christmas_ceiling_light_orange", ModBlocks.CHRISTMAS_CEILING_LIGHT_ORANGE);
//    public static final Item CHRISTMAS_CEILING_LIGHT_MAGENTA = registerItem("christmas_ceiling_light_magenta", ModBlocks.CHRISTMAS_CEILING_LIGHT_MAGENTA);
//    public static final Item CHRISTMAS_CEILING_LIGHT_PALE_BLUE = registerItem("christmas_ceiling_light_pale_blue", ModBlocks.CHRISTMAS_CEILING_LIGHT_PALE_BLUE);
//    public static final Item CHRISTMAS_CEILING_LIGHT_YELLOW = registerItem("christmas_ceiling_light_yellow", ModBlocks.CHRISTMAS_CEILING_LIGHT_YELLOW);
//    public static final Item CHRISTMAS_CEILING_LIGHT_LIME = registerItem("christmas_ceiling_light_lime", ModBlocks.CHRISTMAS_CEILING_LIGHT_LIME);
//    public static final Item CHRISTMAS_CEILING_LIGHT_PINK = registerItem("christmas_ceiling_light_pink", ModBlocks.CHRISTMAS_CEILING_LIGHT_PINK);
//    public static final Item CHRISTMAS_CEILING_LIGHT_GRAY = registerItem("christmas_ceiling_light_gray", ModBlocks.CHRISTMAS_CEILING_LIGHT_GRAY);
//    public static final Item CHRISTMAS_CEILING_LIGHT_PALE_GRAY = registerItem("christmas_ceiling_light_pale_gray", ModBlocks.CHRISTMAS_CEILING_LIGHT_PALE_GRAY);
//    public static final Item CHRISTMAS_CEILING_LIGHT_CYAN = registerItem("christmas_ceiling_light_cyan", ModBlocks.CHRISTMAS_CEILING_LIGHT_CYAN);
//    public static final Item CHRISTMAS_CEILING_PURPLE = registerItem("christmas_ceiling_light_purple", ModBlocks.CHRISTMAS_CEILING_PURPLE);
//    public static final Item CHRISTMAS_CEILING_BLUE = registerItem("christmas_ceiling_light_blue", ModBlocks.CHRISTMAS_CEILING_BLUE);
//    public static final Item CHRISTMAS_CEILING_BROWN = registerItem("christmas_ceiling_light_brown", ModBlocks.CHRISTMAS_CEILING_BROWN);
//    public static final Item CHRISTMAS_CEILING_GREEN = registerItem("christmas_ceiling_light_green", ModBlocks.CHRISTMAS_CEILING_GREEN);
//    public static final Item CHRISTMAS_CEILING_RED = registerItem("christmas_ceiling_light_red", ModBlocks.CHRISTMAS_CEILING_RED);
//    public static final Item CHRISTMAS_CEILING_BLACK = registerItem("christmas_ceiling_light_black", ModBlocks.CHRISTMAS_CEILING_BLACK);
//    public static final Item CHRISTMAS_WALL_LIGHT_WHITE = registerItem("christmas_wall_light_white", ModBlocks.CHRISTMAS_WALL_LIGHT_WHITE);
//    public static final Item CHRISTMAS_WALL_LIGHT_ORANGE = registerItem("christmas_wall_light_orange", ModBlocks.CHRISTMAS_WALL_LIGHT_ORANGE);
//    public static final Item CHRISTMAS_WALL_LIGHT_MAGENTA = registerItem("christmas_wall_light_magenta", ModBlocks.CHRISTMAS_WALL_LIGHT_MAGENTA);
//    public static final Item CHRISTMAS_WALL_LIGHT_PALE_BLUE = registerItem("christmas_wall_light_pale_blue", ModBlocks.CHRISTMAS_WALL_LIGHT_PALE_BLUE);
//    public static final Item CHRISTMAS_WALL_LIGHT_YELLOW = registerItem("christmas_wall_light_yellow", ModBlocks.CHRISTMAS_WALL_LIGHT_YELLOW);
//    public static final Item CHRISTMAS_WALL_LIGHT_LIME = registerItem("christmas_wall_light_lime", ModBlocks.CHRISTMAS_WALL_LIGHT_LIME);
//    public static final Item CHRISTMAS_WALL_LIGHT_PINK = registerItem("christmas_wall_light_pink", ModBlocks.CHRISTMAS_WALL_LIGHT_PINK);
//    public static final Item CHRISTMAS_WALL_LIGHT_GRAY = registerItem("christmas_wall_light_gray", ModBlocks.CHRISTMAS_WALL_LIGHT_GRAY);
//    public static final Item CHRISTMAS_WALL_LIGHT_PALE_GRAY = registerItem("christmas_wall_light_pale_gray", ModBlocks.CHRISTMAS_WALL_LIGHT_PALE_GRAY);
//    public static final Item CHRISTMAS_WALL_LIGHT_CYAN = registerItem("christmas_wall_light_cyan", ModBlocks.CHRISTMAS_WALL_LIGHT_CYAN);
//    public static final Item CHRISTMAS_WALL_LIGHT_PURPLE = registerItem("christmas_wall_light_purple", ModBlocks.CHRISTMAS_WALL_LIGHT_PURPLE);
//    public static final Item CHRISTMAS_WALL_LIGHT_BLUE = registerItem("christmas_wall_light_blue", ModBlocks.CHRISTMAS_WALL_LIGHT_BLUE);
//    public static final Item CHRISTMAS_WALL_LIGHT_BROWN = registerItem("christmas_wall_light_brown", ModBlocks.CHRISTMAS_WALL_LIGHT_BROWN);
//    public static final Item CHRISTMAS_WALL_LIGHT_GREEN = registerItem("christmas_wall_light_green", ModBlocks.CHRISTMAS_WALL_LIGHT_GREEN);
//    public static final Item CHRISTMAS_WALL_LIGHT_RED = registerItem("christmas_wall_light_red", ModBlocks.CHRISTMAS_WALL_LIGHT_RED);
//    public static final Item CHRISTMAS_WALL_LIGHT_BLACK = registerItem("christmas_wall_light_black", ModBlocks.CHRISTMAS_WALL_LIGHT_BLACK);
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
//    public static final Item GARLAND = registerItem("garland", ModBlocks.GARLAND);
//    public static final Item GARLAND_ROUND = registerItem("garland_round", ModBlocks.GARLAND_ROUND);
//    public static final Item SNOWY_GARLAND = registerItem("snowy_garland", ModBlocks.SNOWY_GARLAND);
//    public static final Item SNOWY_GARLAND_ROUND = registerItem("snowy_garland_round", ModBlocks.SNOWY_GARLAND_ROUND);
//    public static final Item GARLAND_LIGHTLESS = registerItem("garland_lightless", ModBlocks.GARLAND_LIGHTLESS);
//    public static final Item GARLAND_ROUND_LIGHTLESS = registerItem("garland_round_lightless", ModBlocks.GARLAND_ROUND_LIGHTLESS);
//    public static final Item SNOWY_GARLAND_LIGHTLESS = registerItem("snowy_garland_lightless", ModBlocks.SNOWY_GARLAND_LIGHTLESS);
//    public static final Item SNOWY_GARLAND_ROUND_LIGHTLESS = registerItem("snowy_garland_round_lightless", ModBlocks.SNOWY_GARLAND_ROUND_LIGHTLESS);
//    public static final Item SNOWMAN_BLOCK_WHITE = registerItem("snowman_block_white", ModBlocks.SNOWMAN_BLOCK_WHITE);
//    public static final Item SNOWMAN_BLOCK_ORANGE = registerItem("snowman_block_orange", ModBlocks.SNOWMAN_BLOCK_ORANGE);
//    public static final Item SNOWMAN_BLOCK_MAGENTA = registerItem("snowman_block_magenta", ModBlocks.SNOWMAN_BLOCK_MAGENTA);
//    public static final Item SNOWMAN_BLOCK_LIGHT_BLUE = registerItem("snowman_block_light_blue", ModBlocks.SNOWMAN_BLOCK_LIGHT_BLUE);
//    public static final Item SNOWMAN_BLOCK_YELLOW = registerItem("snowman_block_yellow", ModBlocks.SNOWMAN_BLOCK_YELLOW);
//    public static final Item SNOWMAN_BLOCK_LIME = registerItem("snowman_block_lime", ModBlocks.SNOWMAN_BLOCK_LIME);
//    public static final Item SNOWMAN_BLOCK_PINK = registerItem("snowman_block_pink", ModBlocks.SNOWMAN_BLOCK_PINK);
//    public static final Item SNOWMAN_BLOCK_GRAY = registerItem("snowman_block_gray", ModBlocks.SNOWMAN_BLOCK_GRAY);
//    public static final Item SNOWMAN_BLOCK_LIGHT_GRAY = registerItem("snowman_block_light_gray", ModBlocks.SNOWMAN_BLOCK_LIGHT_GRAY);
//    public static final Item SNOWMAN_BLOCK_CYAN = registerItem("snowman_block_cyan", ModBlocks.SNOWMAN_BLOCK_CYAN);
//    public static final Item SNOWMAN_BLOCK_PURPLE = registerItem("snowman_block_purple", ModBlocks.SNOWMAN_BLOCK_PURPLE);
//    public static final Item SNOWMAN_BLOCK_BLUE = registerItem("snowman_block_blue", ModBlocks.SNOWMAN_BLOCK_BLUE);
//    public static final Item SNOWMAN_BLOCK_BROWN = registerItem("snowman_block_brown", ModBlocks.SNOWMAN_BLOCK_BROWN);
//    public static final Item SNOWMAN_BLOCK_GREEN = registerItem("snowman_block_green", ModBlocks.SNOWMAN_BLOCK_GREEN);
//    public static final Item SNOWMAN_BLOCK_RED = registerItem("snowman_block_red", ModBlocks.SNOWMAN_BLOCK_RED);
//    public static final Item SNOWMAN_BLOCK_BLACK = registerItem("snowman_block_black", ModBlocks.SNOWMAN_BLOCK_BLACK);
    public static final Item SUGAR_BLOCK = registerItem("sugar_block", ModBlocks.SUGAR_BLOCK);
    public static final Item GINGERBREAD_BLOCK = registerItem("gingerbread_block", ModBlocks.GINGERBREAD_BLOCK);
    public static final Item CHRISTMAS_LEAVES = registerItem("christmas_leaves", ModBlocks.CHRISTMAS_LEAVES);
    public static final Item SNOWY_CHRISTMAS_LEAVES = registerItem("snowy_christmas_leaves", ModBlocks.SNOWY_CHRISTMAS_LEAVES);
    public static final Item SNOWY_LEAVES = registerItem("snowy_leaves", ModBlocks.SNOWY_LEAVES);
    public static final Item CHRISTMAS_TREE_TOPPER = registerItem("christmas_tree_topper", ModBlocks.CHRISTMAS_TREE_TOPPER);
    public static final Item CHRISTMAS_TREE_STAR_TOPPER_ONE = registerItem("christmas_tree_star_topper_one", ModBlocks.CHRISTMAS_TREE_STAR_TOPPER_ONE);
    public static final Item CHRISTMAS_TREE_STAR_TOPPER_TWO = registerItem("christmas_tree_star_topper_two", ModBlocks.CHRISTMAS_TREE_STAR_TOPPER_TWO);
//    public static final Item WIRE = registerItem("wire", ModBlocks.WIRE);
    public static final Item CANDY_CANES_BLOCK = registerItem("candy_canes_block", ModBlocks.CANDY_CANES_BLOCK);
//    public static final Item CANDY_CANES_TALL = registerItem("candy_canes_tall", ModBlocks.CANDY_CANES_TALL);
//    public static final Item CHRISTMAS_TREE = registerItem("christmas_tree", ModBlocks.CHRISTMAS_TREE);
//    public static final Item SNOWY_CHRISTMAS_TREE = registerItem("snowy_christmas_tree", ModBlocks.SNOWY_CHRISTMAS_TREE);
    public static final Item LITTLE_CHRISTMAS_TREE = registerItem("little_christmas_tree", ModBlocks.LITTLE_CHRISTMAS_TREE);
    public static final Item LITTLE_SNOWY_CHRISTMAS_TREE = registerItem("little_snowy_christmas_tree", ModBlocks.LITTLE_SNOWY_CHRISTMAS_TREE);
    public static final Item SANTA_CLAUS_BLOCK = registerItem("santa_claus_block", ModBlocks.SANTA_CLAUS_BLOCK);
    public static final Item CHRISTMAS_BELLS = registerItem("christmas_bells", ModBlocks.CHRISTMAS_BELLS);
//    public static final Item TALL_SANTA_CLAUS_BLOCK = registerItem("tall_santa_claus_block", ModBlocks.TALL_SANTA_CLAUS_BLOCK);
    public static final Item LITTLE_SNOWMAN_WHITE = registerItem("little_snowman_white", ModBlocks.LITTLE_SNOWMAN_WHITE);
    public static final Item LITTLE_SNOWMAN_ORANGE = registerItem("little_snowman_orange", ModBlocks.LITTLE_SNOWMAN_ORANGE);
    public static final Item LITTLE_SNOWMAN_MAGENTA = registerItem("little_snowman_magenta", ModBlocks.LITTLE_SNOWMAN_MAGENTA);
    public static final Item LITTLE_SNOWMAN_LIGHT_BLUE = registerItem("little_snowman_light_blue", ModBlocks.LITTLE_SNOWMAN_LIGHT_BLUE);
    public static final Item LITTLE_SNOWMAN_YELLOW = registerItem("little_snowman_yellow", ModBlocks.LITTLE_SNOWMAN_YELLOW);
    public static final Item LITTLE_SNOWMAN_LIME = registerItem("little_snowman_lime", ModBlocks.LITTLE_SNOWMAN_LIME);
    public static final Item LITTLE_SNOWMAN_PINK = registerItem("little_snowman_pink", ModBlocks.LITTLE_SNOWMAN_PINK);
    public static final Item LITTLE_SNOWMAN_GRAY = registerItem("little_snowman_gray", ModBlocks.LITTLE_SNOWMAN_GRAY);
    public static final Item LITTLE_SNOWMAN_LIGHT_GRAY = registerItem("little_snowman_light_gray", ModBlocks.LITTLE_SNOWMAN_LIGHT_GRAY);
    public static final Item LITTLE_SNOWMAN_CYAN = registerItem("little_snowman_cyan", ModBlocks.LITTLE_SNOWMAN_CYAN);
    public static final Item LITTLE_SNOWMAN_PURPLE = registerItem("little_snowman_purple", ModBlocks.LITTLE_SNOWMAN_PURPLE);
    public static final Item LITTLE_SNOWMAN_BLUE = registerItem("little_snowman_blue", ModBlocks.LITTLE_SNOWMAN_BLUE);
    public static final Item LITTLE_SNOWMAN_BROWN = registerItem("little_snowman_brown", ModBlocks.LITTLE_SNOWMAN_BROWN);
    public static final Item LITTLE_SNOWMAN_GREEN = registerItem("little_snowman_green", ModBlocks.LITTLE_SNOWMAN_GREEN);
    public static final Item LITTLE_SNOWMAN_RED = registerItem("little_snowman_red", ModBlocks.LITTLE_SNOWMAN_RED);
    public static final Item LITTLE_SNOWMAN_BLACK = registerItem("little_snowman_black", ModBlocks.LITTLE_SNOWMAN_BLACK);
    public static final Item CHRISTMAS_PRESENT_WHITE = registerItem("christmas_present_white", ModBlocks.CHRISTMAS_PRESENT_WHITE);
    public static final Item CHRISTMAS_PRESENT_ORANGE = registerItem("christmas_present_orange", ModBlocks.CHRISTMAS_PRESENT_ORANGE);
    public static final Item CHRISTMAS_PRESENT_MAGENTA = registerItem("christmas_present_magenta", ModBlocks.CHRISTMAS_PRESENT_MAGENTA);
    public static final Item CHRISTMAS_PRESENT_LIGHT_BLUE = registerItem("christmas_present_light_blue", ModBlocks.CHRISTMAS_PRESENT_LIGHT_BLUE);
    public static final Item CHRISTMAS_PRESENT_YELLOW = registerItem("christmas_present_yellow", ModBlocks.CHRISTMAS_PRESENT_YELLOW);
    public static final Item CHRISTMAS_PRESENT_LIME = registerItem("christmas_present_lime", ModBlocks.CHRISTMAS_PRESENT_LIME);
    public static final Item CHRISTMAS_PRESENT_PINK = registerItem("christmas_present_pink", ModBlocks.CHRISTMAS_PRESENT_PINK);
    public static final Item CHRISTMAS_PRESENT_GRAY = registerItem("christmas_present_gray", ModBlocks.CHRISTMAS_PRESENT_GRAY);
    public static final Item CHRISTMAS_PRESENT_LIGHT_GRAY = registerItem("christmas_present_light_gray", ModBlocks.CHRISTMAS_PRESENT_LIGHT_GRAY);
    public static final Item CHRISTMAS_PRESENT_CYAN = registerItem("christmas_present_cyan", ModBlocks.CHRISTMAS_PRESENT_CYAN);
    public static final Item CHRISTMAS_PRESENT_PURPLE = registerItem("christmas_present_purple", ModBlocks.CHRISTMAS_PRESENT_PURPLE);
    public static final Item CHRISTMAS_PRESENT_BLUE = registerItem("christmas_present_blue", ModBlocks.CHRISTMAS_PRESENT_BLUE);
    public static final Item CHRISTMAS_PRESENT_BROWN = registerItem("christmas_present_brown", ModBlocks.CHRISTMAS_PRESENT_BROWN);
    public static final Item CHRISTMAS_PRESENT_GREEN = registerItem("christmas_present_green", ModBlocks.CHRISTMAS_PRESENT_GREEN);
    public static final Item CHRISTMAS_PRESENT_RED = registerItem("christmas_present_red", ModBlocks.CHRISTMAS_PRESENT_RED);
    public static final Item CHRISTMAS_PRESENT_BLACK = registerItem("christmas_present_black", ModBlocks.CHRISTMAS_PRESENT_BLACK);
    public static final Item CHRISTMAS_PRESENT_SHORT_WHITE = registerItem("christmas_present_short_white", ModBlocks.CHRISTMAS_PRESENT_SHORT_WHITE);
    public static final Item CHRISTMAS_PRESENT_SHORT_ORANGE = registerItem("christmas_present_short_orange", ModBlocks.CHRISTMAS_PRESENT_SHORT_ORANGE);
    public static final Item CHRISTMAS_PRESENT_SHORT_MAGENTA = registerItem("christmas_present_short_magenta", ModBlocks.CHRISTMAS_PRESENT_SHORT_MAGENTA);
    public static final Item CHRISTMAS_PRESENT_SHORT_LIGHT_BLUE = registerItem("christmas_present_short_light_blue", ModBlocks.CHRISTMAS_PRESENT_SHORT_LIGHT_BLUE);
    public static final Item CHRISTMAS_PRESENT_SHORT_YELLOW = registerItem("christmas_present_short_yellow", ModBlocks.CHRISTMAS_PRESENT_SHORT_YELLOW);
    public static final Item CHRISTMAS_PRESENT_SHORT_LIME = registerItem("christmas_present_short_lime", ModBlocks.CHRISTMAS_PRESENT_SHORT_LIME);
    public static final Item CHRISTMAS_PRESENT_SHORT_PINK = registerItem("christmas_present_short_pink", ModBlocks.CHRISTMAS_PRESENT_SHORT_PINK);
    public static final Item CHRISTMAS_PRESENT_SHORT_GRAY = registerItem("christmas_present_short_gray", ModBlocks.CHRISTMAS_PRESENT_SHORT_GRAY);
    public static final Item CHRISTMAS_PRESENT_SHORT_LIGHT_GRAY = registerItem("christmas_present_short_light_gray", ModBlocks.CHRISTMAS_PRESENT_SHORT_LIGHT_GRAY);
    public static final Item CHRISTMAS_PRESENT_SHORT_CYAN = registerItem("christmas_present_short_cyan", ModBlocks.CHRISTMAS_PRESENT_SHORT_CYAN);
    public static final Item CHRISTMAS_PRESENT_SHORT_PURPLE = registerItem("christmas_present_short_purple", ModBlocks.CHRISTMAS_PRESENT_SHORT_PURPLE);
    public static final Item CHRISTMAS_PRESENT_SHORT_BLUE = registerItem("christmas_present_short_blue", ModBlocks.CHRISTMAS_PRESENT_SHORT_BLUE);
    public static final Item CHRISTMAS_PRESENT_SHORT_BROWN = registerItem("christmas_present_short_brown", ModBlocks.CHRISTMAS_PRESENT_SHORT_BROWN);
    public static final Item CHRISTMAS_PRESENT_SHORT_GREEN = registerItem("christmas_present_short_green", ModBlocks.CHRISTMAS_PRESENT_SHORT_GREEN);
    public static final Item CHRISTMAS_PRESENT_SHORT_RED = registerItem("christmas_present_short_red", ModBlocks.CHRISTMAS_PRESENT_SHORT_RED);
    public static final Item CHRISTMAS_PRESENT_SHORT_BLACK = registerItem("christmas_present_short_black", ModBlocks.CHRISTMAS_PRESENT_SHORT_BLACK);
//    public static final Item CHRISTMAS_PRESENT_TALL_WHITE = registerItem("christmas_present_tall_white", ModBlocks.CHRISTMAS_PRESENT_TALL_WHITE);
//    public static final Item CHRISTMAS_PRESENT_TALL_ORANGE = registerItem("christmas_present_tall_orange", ModBlocks.CHRISTMAS_PRESENT_TALL_ORANGE);
//    public static final Item CHRISTMAS_PRESENT_TALL_MAGENTA = registerItem("christmas_present_tall_magenta", ModBlocks.CHRISTMAS_PRESENT_TALL_MAGENTA);
//    public static final Item CHRISTMAS_PRESENT_TALL_LIGHT_BLUE = registerItem("christmas_present_tall_light_blue", ModBlocks.CHRISTMAS_PRESENT_TALL_LIGHT_BLUE);
//    public static final Item CHRISTMAS_PRESENT_TALL_YELLOW = registerItem("christmas_present_tall_yellow", ModBlocks.CHRISTMAS_PRESENT_TALL_YELLOW);
//    public static final Item CHRISTMAS_PRESENT_TALL_LIME = registerItem("christmas_present_tall_lime", ModBlocks.CHRISTMAS_PRESENT_TALL_LIME);
//    public static final Item CHRISTMAS_PRESENT_TALL_PINK = registerItem("christmas_present_tall_pink", ModBlocks.CHRISTMAS_PRESENT_TALL_PINK);
//    public static final Item CHRISTMAS_PRESENT_TALL_GRAY = registerItem("christmas_present_tall_gray", ModBlocks.CHRISTMAS_PRESENT_TALL_GRAY);
//    public static final Item CHRISTMAS_PRESENT_TALL_LIGHT_GRAY = registerItem("christmas_present_tall_light_gray", ModBlocks.CHRISTMAS_PRESENT_TALL_LIGHT_GRAY);
//    public static final Item CHRISTMAS_PRESENT_TALL_CYAN = registerItem("christmas_present_tall_cyan", ModBlocks.CHRISTMAS_PRESENT_TALL_CYAN);
//    public static final Item CHRISTMAS_PRESENT_TALL_PURPLE = registerItem("christmas_present_tall_purple", ModBlocks.CHRISTMAS_PRESENT_TALL_PURPLE);
//    public static final Item CHRISTMAS_PRESENT_TALL_BLUE = registerItem("christmas_present_tall_blue", ModBlocks.CHRISTMAS_PRESENT_TALL_BLUE);
//    public static final Item CHRISTMAS_PRESENT_TALL_BROWN = registerItem("christmas_present_tall_brown", ModBlocks.CHRISTMAS_PRESENT_TALL_BROWN);
//    public static final Item CHRISTMAS_PRESENT_TALL_GREEN = registerItem("christmas_present_tall_red", ModBlocks.CHRISTMAS_PRESENT_TALL_GREEN);
//    public static final Item CHRISTMAS_PRESENT_TALL_BLACK = registerItem("christmas_present_tall_black", ModBlocks.CHRISTMAS_PRESENT_TALL_BLACK);
    public static final Item EPIPHANY_STOCKING_WHITE = registerItem("epiphany_stocking_white", ModBlocks.EPIPHANY_STOCKING_WHITE);
    public static final Item EPIPHANY_STOCKING_ORANGE = registerItem("epiphany_stocking_orange", ModBlocks.EPIPHANY_STOCKING_ORANGE);
    public static final Item EPIPHANY_STOCKING_MAGENTA = registerItem("epiphany_stocking_magenta", ModBlocks.EPIPHANY_STOCKING_MAGENTA);
    public static final Item EPIPHANY_STOCKING_LIGHT_BLUE = registerItem("epiphany_stocking_light_blue", ModBlocks.EPIPHANY_STOCKING_LIGHT_BLUE);
    public static final Item EPIPHANY_STOCKING_YELLOW = registerItem("epiphany_stocking_yellow", ModBlocks.EPIPHANY_STOCKING_YELLOW);
    public static final Item EPIPHANY_STOCKING_LIME = registerItem("epiphany_stocking_lime", ModBlocks.EPIPHANY_STOCKING_LIME);
    public static final Item EPIPHANY_STOCKING_PINK = registerItem("epiphany_stocking_pink", ModBlocks.EPIPHANY_STOCKING_PINK);
    public static final Item EPIPHANY_STOCKING_GRAY = registerItem("epiphany_stocking_gray", ModBlocks.EPIPHANY_STOCKING_GRAY);
    public static final Item EPIPHANY_STOCKING_LIGHT_GRAY = registerItem("epiphany_stocking_light_gray", ModBlocks.EPIPHANY_STOCKING_LIGHT_GRAY);
    public static final Item EPIPHANY_STOCKING_CYAN = registerItem("epiphany_stocking_cyan", ModBlocks.EPIPHANY_STOCKING_CYAN);
    public static final Item EPIPHANY_STOCKING_PURPLE = registerItem("epiphany_stocking_purple", ModBlocks.EPIPHANY_STOCKING_PURPLE);
    public static final Item EPIPHANY_STOCKING_BLUE = registerItem("epiphany_stocking_blue", ModBlocks.EPIPHANY_STOCKING_BLUE);
    public static final Item EPIPHANY_STOCKING_BROWN = registerItem("epiphany_stocking_brown", ModBlocks.EPIPHANY_STOCKING_BROWN);
    public static final Item EPIPHANY_STOCKING_GREEN = registerItem("epiphany_stocking_green", ModBlocks.EPIPHANY_STOCKING_GREEN);
    public static final Item EPIPHANY_STOCKING_RED = registerItem("epiphany_stocking_red", ModBlocks.EPIPHANY_STOCKING_RED);
    public static final Item EPIPHANY_STOCKING_BLACK = registerItem("epiphany_stocking_black", ModBlocks.EPIPHANY_STOCKING_BLACK);
    public static final Item REDSTONE_LAMP_WHITE = registerItem("redstone_lamp_white", ModBlocks.REDSTONE_LAMP_WHITE);
    public static final Item REDSTONE_LAMP_ORANGE = registerItem("redstone_lamp_orange", ModBlocks.REDSTONE_LAMP_ORANGE);
    public static final Item REDSTONE_LAMP_MAGENTA = registerItem("redstone_lamp_magenta", ModBlocks.REDSTONE_LAMP_MAGENTA);
    public static final Item REDSTONE_LAMP_LIGHT_BLUE = registerItem("redstone_lamp_light_blue", ModBlocks.REDSTONE_LAMP_LIGHT_BLUE);
    public static final Item REDSTONE_LAMP_YELLOW = registerItem("redstone_lamp_yellow", ModBlocks.REDSTONE_LAMP_YELLOW);
    public static final Item REDSTONE_LAMP_LIME = registerItem("redstone_lamp_lime", ModBlocks.REDSTONE_LAMP_LIME);
    public static final Item REDSTONE_LAMP_PINK = registerItem("redstone_lamp_pink", ModBlocks.REDSTONE_LAMP_PINK);
    public static final Item REDSTONE_LAMP_GRAY = registerItem("redstone_lamp_gray", ModBlocks.REDSTONE_LAMP_GRAY);
    public static final Item REDSTONE_LAMP_LIGHT_GRAY = registerItem("redstone_lamp_light_gray", ModBlocks.REDSTONE_LAMP_LIGHT_GRAY);
    public static final Item REDSTONE_LAMP_CYAN = registerItem("redstone_lamp_cyan", ModBlocks.REDSTONE_LAMP_CYAN);
    public static final Item REDSTONE_LAMP_PURPLE = registerItem("redstone_lamp_purple", ModBlocks.REDSTONE_LAMP_PURPLE);
    public static final Item REDSTONE_LAMP_BLUE = registerItem("redstone_lamp_blue", ModBlocks.REDSTONE_LAMP_BLUE);
    public static final Item REDSTONE_LAMP_BROWN = registerItem("redstone_lamp_brown", ModBlocks.REDSTONE_LAMP_BROWN);
    public static final Item REDSTONE_LAMP_GREEN = registerItem("redstone_lamp_green", ModBlocks.REDSTONE_LAMP_GREEN);
    public static final Item REDSTONE_LAMP_RED = registerItem("redstone_lamp_red", ModBlocks.REDSTONE_LAMP_RED);
    public static final Item REDSTONE_LAMP_BLACK = registerItem("redstone_lamp_black", ModBlocks.REDSTONE_LAMP_BLACK);

    // ITEMS
    public static final Item PLASTIC = registerItem("plastic", new Item(new FabricItemSettings()));
    public static final Item GIFT_CARD_ORANGE = registerItem("gift_card_orange", new Item(new FabricItemSettings()));
    public static final Item GIFT_CARD_MAGENTA = registerItem("gift_card_magenta", new Item(new FabricItemSettings()));
    public static final Item GIFT_CARD_LIGHT_BLUE = registerItem("gift_card_light_blue", new Item(new FabricItemSettings()));
    public static final Item GIFT_CARD_YELLOW = registerItem("gift_card_yellow", new Item(new FabricItemSettings()));
    public static final Item GIFT_CARD_LIME = registerItem("gift_card_lime", new Item(new FabricItemSettings()));
    public static final Item GIFT_CARD_PINK = registerItem("gift_card_pink", new Item(new FabricItemSettings()));
    public static final Item GIFT_CARD_GRAY = registerItem("gift_card_gray", new Item(new FabricItemSettings()));
    public static final Item GIFT_CARD_LIGHT_GRAY = registerItem("gift_card_light_gray", new Item(new FabricItemSettings()));
    public static final Item GIFT_CARD_CYAN = registerItem("gift_card_cyan", new Item(new FabricItemSettings()));
    public static final Item GIFT_CARD_PURPLE = registerItem("gift_card_purple", new Item(new FabricItemSettings()));
    public static final Item GIFT_CARD_BLUE = registerItem("gift_card_blue", new Item(new FabricItemSettings()));
    public static final Item GIFT_CARD_BROWN = registerItem("gift_card_brown", new Item(new FabricItemSettings()));
    public static final Item GIFT_CARD_GREEN = registerItem("gift_card_green", new Item(new FabricItemSettings()));
    public static final Item GIFT_CARD_RED = registerItem("gift_card_red", new Item(new FabricItemSettings()));
    public static final Item GIFT_CARD_BLACK = registerItem("gift_card_black", new Item(new FabricItemSettings()));
    public static final Item LIGHT_BULB = registerItem("light_bulb", new LightBulbItem());
    public static final Item LIGHT_BULB_WHITE = registerItem("light_bulb_white", new LightBulbItem());
    public static final Item LIGHT_BULB_ORANGE = registerItem("light_bulb_orange", new LightBulbItem());
    public static final Item LIGHT_BULB_MAGENTA = registerItem("light_bulb_magenta", new LightBulbItem());
    public static final Item LIGHT_BULB_LIGHT_BLUE = registerItem("light_bulb_light_blue", new LightBulbItem());
    public static final Item LIGHT_BULB_YELLOW = registerItem("light_bulb_yellow", new LightBulbItem());
    public static final Item LIGHT_BULB_LIME = registerItem("light_bulb_lime", new LightBulbItem());
    public static final Item LIGHT_BULB_PINK = registerItem("light_bulb_pink", new LightBulbItem());
    public static final Item LIGHT_BULB_GRAY = registerItem("light_bulb_gray", new LightBulbItem());
    public static final Item LIGHT_BULB_LIGHT_GRAY = registerItem("light_bulb_light_gray", new LightBulbItem());
    public static final Item LIGHT_BULB_CYAN = registerItem("light_bulb_cyan", new LightBulbItem());
    public static final Item LIGHT_BULB_PURPLE = registerItem("light_bulb_purple", new LightBulbItem());
    public static final Item LIGHT_BULB_BLUE = registerItem("light_bulb_blue", new LightBulbItem());
    public static final Item LIGHT_BULB_BROWN = registerItem("light_bulb_brown", new LightBulbItem());
    public static final Item LIGHT_BULB_GREEN = registerItem("light_bulb_green", new LightBulbItem());
    public static final Item LIGHT_BULB_RED = registerItem("light_bulb_red", new LightBulbItem());
    public static final Item LIGHT_BULB_BLACK = registerItem("light_bulb_black", new LightBulbItem());
    public static final Item SCARF_WHITE = registerItem("scarf_white", new Item(new FabricItemSettings()));
    public static final Item SCARF_ORANGE = registerItem("scarf_orange", new Item(new FabricItemSettings()));
    public static final Item SCARF_MAGENTA = registerItem("scarf_magenta", new Item(new FabricItemSettings()));
    public static final Item SCARF_LIGHT_BLUE = registerItem("scarf_light_blue", new Item(new FabricItemSettings()));
    public static final Item SCARF_YELLOW = registerItem("scarf_yellow", new Item(new FabricItemSettings()));
    public static final Item SCARF_LIME = registerItem("scarf_lime", new Item(new FabricItemSettings()));
    public static final Item SCARF_PINK = registerItem("scarf_pink", new Item(new FabricItemSettings()));
    public static final Item SCARF_GRAY = registerItem("scarf_gray", new Item(new FabricItemSettings()));
    public static final Item SCARF_LIGHT_GRAY = registerItem("scarf_light_gray", new Item(new FabricItemSettings()));
    public static final Item SCARF_CYAN = registerItem("scarf_cyan", new Item(new FabricItemSettings()));
    public static final Item SCARF_PURPLE = registerItem("scarf_purple", new Item(new FabricItemSettings()));
    public static final Item SCARF_BLUE = registerItem("scarf_blue", new Item(new FabricItemSettings()));
    public static final Item SCARF_BROWN = registerItem("scarf_brown", new Item(new FabricItemSettings()));
    public static final Item SCARF_GREEN = registerItem("scarf_green", new Item(new FabricItemSettings()));
    public static final Item SCARF_RED = registerItem("scarf_red", new Item(new FabricItemSettings()));
    public static final Item SCARF_BLACK = registerItem("scarf_black", new Item(new FabricItemSettings()));
//    public static final Item BLACK_HAT = registerItem("black_hat", new WearableItem());
//    public static final Item CHRISTMAS_HAT = registerItem("christmas_hat", new WearableItem());
//    public static final Item ADVENT_CALENDAR = registerItem("advent_calendar", new AdventCalendarItem());
    public static final Item MARRY_CHRISTMAS_DISC = registerItem("disc_marrychristmas", new MusicDiscItem(7, ModSounds.MARRYCHRISTMAS, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 2760));
    public static final Item JINGLEBELLS_DISC = registerItem("disc_jinglebells", new MusicDiscItem(7, ModSounds.JINGLEBELLS, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 2040));

    // FOOD
    public static final Item CANDY_CANES = registerItem("candy_canes", new Item(new FabricItemSettings().food(ModFoodComponents.CANDY_CANES)));
    public static final Item SWEET_CHRISTMAS_TREE = registerItem("sweet_christmas_tree", new Item(new FabricItemSettings().food(ModFoodComponents.SWEET_CHRISTMAS_TREE)));
    public static final Item GINGERBREAD = registerItem("gingerbread", new Item(new FabricItemSettings().food(ModFoodComponents.GINGERBREAD)));
    public static final Item GINGERBREAD_MAN = registerItem("gingerbread_man", new Item(new FabricItemSettings().food(ModFoodComponents.GINGERBREAD_MAN)));
    public static final Item CHOCOLATE_BAR = registerItem("chocolate_bar", new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_BAR)));
    public static final Item HOT_CHOCOLATE = registerItem("hot_chocolate", new Item(new FabricItemSettings().food(ModFoodComponents.HOT_CHOCOLATE)));
    public static final Item CHRISTMAS_REINDEER_BISCUITS = registerItem("christmas_reindeer_biscuits", new Item(new FabricItemSettings().food(ModFoodComponents.CHRISTMAS_REINDEER_BISCUITS)));
    public static final Item BISCUITS_SNOWMAN = registerItem("biscuits_snowman", new Item(new FabricItemSettings().food(ModFoodComponents.BISCUITS_SNOWMAN)));
    public static final Item EGGNOG = registerItem("eggnog", new Item(new FabricItemSettings().food(ModFoodComponents.EGGNOG)));
    public static final Item GUMDROPS = registerItem("gumdrops", new Item(new FabricItemSettings().food(ModFoodComponents.GUMDROPS)));
    public static final Item CANDY_APPLE = registerItem("candy_apple", new Item(new FabricItemSettings().food(ModFoodComponents.CANDY_APPLE)));
    public static final Item APPLE_PIE = registerItem("apple_pie", new Item(new FabricItemSettings().food(ModFoodComponents.APPLE_PIE)));
    public static final Item PANETTONE = registerItem("panettone", new Item(new FabricItemSettings().food(ModFoodComponents.PANETTONE)));
    public static final Item YULE_LOG = registerItem("yule_log", new Item(new FabricItemSettings().food(ModFoodComponents.YULE_LOG)));
    public static final Item CHRISTMAS_PUDDING = registerItem("christmas_pudding", new Item(new FabricItemSettings().food(ModFoodComponents.CHRISTMAS_PUDDING)));

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
