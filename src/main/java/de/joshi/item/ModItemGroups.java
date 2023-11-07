package de.joshi.item;

import de.joshi.ChristmasCraft;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ChristmasCraft.MOD_ID, "christmascraft"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.christmascraft")).icon(() -> new ItemStack(ModItems.PLASTIC_BLOCK_WHITE)).entries((displayContext, entries) -> {
                // BLOCKITEMS
                entries.add(ModItems.PLASTIC_BLOCK_WHITE);
                entries.add(ModItems.PLASTIC_BLOCK_ORANGE);
                entries.add(ModItems.PLASTIC_BLOCK_MAGENTA);
                entries.add(ModItems.PLASTIC_BLOCK_LIGHT_BLUE);
                entries.add(ModItems.PLASTIC_BLOCK_YELLOW);
                entries.add(ModItems.PLASTIC_BLOCK_LIME);
                entries.add(ModItems.PLASTIC_BLOCK_PINK);
                entries.add(ModItems.PLASTIC_BLOCK_GRAY);
                entries.add(ModItems.PLASTIC_BLOCK_LIGHT_GRAY);
                entries.add(ModItems.PLASTIC_BLOCK_CYAN);
                entries.add(ModItems.PLASTIC_BLOCK_PURPLE);
                entries.add(ModItems.PLASTIC_BLOCK_BLUE);
                entries.add(ModItems.PLASTIC_BLOCK_BROWN);
                entries.add(ModItems.PLASTIC_BLOCK_GREEN);
                entries.add(ModItems.PLASTIC_BLOCK_RED);
                entries.add(ModItems.PLASTIC_BLOCK_BLACK);
                entries.add(ModItems.CHRISTMAS_CEILING_LIGHT_WHITE);
                entries.add(ModItems.CHRISTMAS_CEILING_LIGHT_ORANGE);
                entries.add(ModItems.CHRISTMAS_CEILING_LIGHT_MAGENTA);
                entries.add(ModItems.CHRISTMAS_CEILING_LIGHT_PALE_BLUE);
                entries.add(ModItems.CHRISTMAS_CEILING_LIGHT_YELLOW);
                entries.add(ModItems.CHRISTMAS_CEILING_LIGHT_LIME);
                entries.add(ModItems.CHRISTMAS_CEILING_LIGHT_PINK);
                entries.add(ModItems.CHRISTMAS_CEILING_LIGHT_GRAY);
                entries.add(ModItems.CHRISTMAS_CEILING_LIGHT_PALE_GRAY);
                entries.add(ModItems.CHRISTMAS_CEILING_LIGHT_CYAN);
                entries.add(ModItems.CHRISTMAS_CEILING_PURPLE);
                entries.add(ModItems.CHRISTMAS_CEILING_BLUE);
                entries.add(ModItems.CHRISTMAS_CEILING_BROWN);
                entries.add(ModItems.CHRISTMAS_CEILING_GREEN);
                entries.add(ModItems.CHRISTMAS_CEILING_RED);
                entries.add(ModItems.CHRISTMAS_CEILING_BLACK);
                entries.add(ModItems.CHRISTMAS_WALL_LIGHT_WHITE);
                entries.add(ModItems.CHRISTMAS_WALL_LIGHT_ORANGE);
                entries.add(ModItems.CHRISTMAS_WALL_LIGHT_MAGENTA);
                entries.add(ModItems.CHRISTMAS_WALL_LIGHT_PALE_BLUE);
                entries.add(ModItems.CHRISTMAS_WALL_LIGHT_YELLOW);
                entries.add(ModItems.CHRISTMAS_WALL_LIGHT_LIME);
                entries.add(ModItems.CHRISTMAS_WALL_LIGHT_PINK);
                entries.add(ModItems.CHRISTMAS_WALL_LIGHT_GRAY);
                entries.add(ModItems.CHRISTMAS_WALL_LIGHT_PALE_GRAY);
                entries.add(ModItems.CHRISTMAS_WALL_LIGHT_CYAN);
                entries.add(ModItems.CHRISTMAS_WALL_LIGHT_PURPLE);
                entries.add(ModItems.CHRISTMAS_WALL_LIGHT_BLUE);
                entries.add(ModItems.CHRISTMAS_WALL_LIGHT_BROWN);
                entries.add(ModItems.CHRISTMAS_WALL_LIGHT_GREEN);
                entries.add(ModItems.CHRISTMAS_WALL_LIGHT_RED);
                entries.add(ModItems.CHRISTMAS_WALL_LIGHT_BLACK);
                entries.add(ModItems.CHRISTMAS_SQUARE_WHITE);
                entries.add(ModItems.CHRISTMAS_SQUARE_ORANGE);
                entries.add(ModItems.CHRISTMAS_SQUARE_MAGENTA);
                entries.add(ModItems.CHRISTMAS_SQUARE_LIGHT_BLUE);
                entries.add(ModItems.CHRISTMAS_SQUARE_YELLOW);
                entries.add(ModItems.CHRISTMAS_SQUARE_LIME);
                entries.add(ModItems.CHRISTMAS_SQUARE_PINK);
                entries.add(ModItems.CHRISTMAS_SQUARE_GRAY);
                entries.add(ModItems.CHRISTMAS_SQUARE_LIGHT_GRAY);
                entries.add(ModItems.CHRISTMAS_SQUARE_CYAN);
                entries.add(ModItems.CHRISTMAS_SQUARE_PURPLE);
                entries.add(ModItems.CHRISTMAS_SQUARE_BLUE);
                entries.add(ModItems.CHRISTMAS_SQUARE_BROWN);
                entries.add(ModItems.CHRISTMAS_SQUARE_GREEN);
                entries.add(ModItems.CHRISTMAS_SQUARE_RED);
                entries.add(ModItems.CHRISTMAS_SQUARE_BLACK);
                entries.add(ModItems.CHRISTMAS_BALL_WHITE);
                entries.add(ModItems.CHRISTMAS_BALL_ORANGE);
                entries.add(ModItems.CHRISTMAS_BALL_MAGENTA);
                entries.add(ModItems.CHRISTMAS_BALL_LIGHT_BLUE);
                entries.add(ModItems.CHRISTMAS_BALL_YELLOW);
                entries.add(ModItems.CHRISTMAS_BALL_LIME);
                entries.add(ModItems.CHRISTMAS_BALL_PINK);
                entries.add(ModItems.CHRISTMAS_BALL_GRAY);
                entries.add(ModItems.CHRISTMAS_BALL_LIGHT_GRAY);
                entries.add(ModItems.CHRISTMAS_BALL_CYAN);
                entries.add(ModItems.CHRISTMAS_BALL_PURPLE);
                entries.add(ModItems.CHRISTMAS_BALL_BLUE);
                entries.add(ModItems.CHRISTMAS_BALL_BROWN);
                entries.add(ModItems.CHRISTMAS_BALL_GREEN);
                entries.add(ModItems.CHRISTMAS_BALL_RED);
                entries.add(ModItems.CHRISTMAS_BALL_BLACK);
                entries.add(ModItems.GARLAND);
                entries.add(ModItems.GARLAND_ROUND);
                entries.add(ModItems.SNOWY_GARLAND);
                entries.add(ModItems.SNOWY_GARLAND_ROUND);
                entries.add(ModItems.GARLAND_LIGHTLESS);
                entries.add(ModItems.GARLAND_ROUND_LIGHTLESS);
                entries.add(ModItems.SNOWY_GARLAND_LIGHTLESS);
                entries.add(ModItems.SNOWY_GARLAND_ROUND_LIGHTLESS);
                entries.add(ModItems.SNOWMAN_BLOCK_WHITE);
                entries.add(ModItems.SNOWMAN_BLOCK_ORANGE);
                entries.add(ModItems.SNOWMAN_BLOCK_MAGENTA);
                entries.add(ModItems.SNOWMAN_BLOCK_LIGHT_BLUE);
                entries.add(ModItems.SNOWMAN_BLOCK_YELLOW);
                entries.add(ModItems.SNOWMAN_BLOCK_LIME);
                entries.add(ModItems.SNOWMAN_BLOCK_PINK);
                entries.add(ModItems.SNOWMAN_BLOCK_GRAY);
                entries.add(ModItems.SNOWMAN_BLOCK_LIGHT_GRAY);
                entries.add(ModItems.SNOWMAN_BLOCK_CYAN);
                entries.add(ModItems.SNOWMAN_BLOCK_PURPLE);
                entries.add(ModItems.SNOWMAN_BLOCK_BLUE);
                entries.add(ModItems.SNOWMAN_BLOCK_BROWN);
                entries.add(ModItems.SNOWMAN_BLOCK_GREEN);
                entries.add(ModItems.SNOWMAN_BLOCK_RED);
                entries.add(ModItems.SNOWMAN_BLOCK_BLACK);
                entries.add(ModItems.SUGAR_BLOCK);
                entries.add(ModItems.GINGERBREAD_BLOCK);
                entries.add(ModItems.CHRISTMAS_LEAVES);
                entries.add(ModItems.SNOWY_CHRISTMAS_LEAVES);
                entries.add(ModItems.SNOWY_LEAVES);
                entries.add(ModItems.CHRISTMAS_TREE_TOPPER);
                entries.add(ModItems.CHRISTMAS_TREE_STAR_TOPPER_ONE);
                entries.add(ModItems.CHRISTMAS_TREE_STAR_TOPPER_TWO);
                entries.add(ModItems.WIRE);
                entries.add(ModItems.CANDY_CANES_BLOCK);
                entries.add(ModItems.CANDY_CANES_TALL);
                entries.add(ModItems.CHRISTMAS_TREE);
                entries.add(ModItems.SNOWY_CHRISTMAS_TREE);
                entries.add(ModItems.LITTLE_CHRISTMAS_TREE);
                entries.add(ModItems.LITTLE_SNOWY_CHRISTMAS_TREE);
                entries.add(ModItems.SANTA_CLAUS_BLOCK);
                entries.add(ModItems.CHRISTMAS_BELLS);
                entries.add(ModItems.TALL_SANTA_CLAUS_BLOCK);

                // ITEMS
                entries.add(ModItems.PLASTIC);
            }).build());

    public static void registerItemGroups() {
        ChristmasCraft.LOGGER.info("Registering Item Groups for " + ChristmasCraft.MOD_ID);
    }

}
