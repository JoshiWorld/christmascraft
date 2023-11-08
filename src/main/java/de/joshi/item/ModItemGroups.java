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
                entries.add(ModItems.LITTLE_SNOWMAN_WHITE);
                entries.add(ModItems.LITTLE_SNOWMAN_ORANGE);
                entries.add(ModItems.LITTLE_SNOWMAN_MAGENTA);
                entries.add(ModItems.LITTLE_SNOWMAN_LIGHT_BLUE);
                entries.add(ModItems.LITTLE_SNOWMAN_YELLOW);
                entries.add(ModItems.LITTLE_SNOWMAN_LIME);
                entries.add(ModItems.LITTLE_SNOWMAN_PINK);
                entries.add(ModItems.LITTLE_SNOWMAN_GRAY);
                entries.add(ModItems.LITTLE_SNOWMAN_LIGHT_GRAY);
                entries.add(ModItems.LITTLE_SNOWMAN_CYAN);
                entries.add(ModItems.LITTLE_SNOWMAN_PURPLE);
                entries.add(ModItems.LITTLE_SNOWMAN_BLUE);
                entries.add(ModItems.LITTLE_SNOWMAN_BROWN);
                entries.add(ModItems.LITTLE_SNOWMAN_GREEN);
                entries.add(ModItems.LITTLE_SNOWMAN_RED);
                entries.add(ModItems.LITTLE_SNOWMAN_BLACK);
                entries.add(ModItems.CHRISTMAS_PRESENT_WHITE);
                entries.add(ModItems.CHRISTMAS_PRESENT_ORANGE);
                entries.add(ModItems.CHRISTMAS_PRESENT_MAGENTA);
                entries.add(ModItems.CHRISTMAS_PRESENT_LIGHT_BLUE);
                entries.add(ModItems.CHRISTMAS_PRESENT_YELLOW);
                entries.add(ModItems.CHRISTMAS_PRESENT_LIME);
                entries.add(ModItems.CHRISTMAS_PRESENT_PINK);
                entries.add(ModItems.CHRISTMAS_PRESENT_GRAY);
                entries.add(ModItems.CHRISTMAS_PRESENT_LIGHT_GRAY);
                entries.add(ModItems.CHRISTMAS_PRESENT_CYAN);
                entries.add(ModItems.CHRISTMAS_PRESENT_PURPLE);
                entries.add(ModItems.CHRISTMAS_PRESENT_BLUE);
                entries.add(ModItems.CHRISTMAS_PRESENT_BROWN);
                entries.add(ModItems.CHRISTMAS_PRESENT_GREEN);
                entries.add(ModItems.CHRISTMAS_PRESENT_RED);
                entries.add(ModItems.CHRISTMAS_PRESENT_BLACK);
                entries.add(ModItems.CHRISTMAS_PRESENT_SHORT_WHITE);
                entries.add(ModItems.CHRISTMAS_PRESENT_SHORT_ORANGE);
                entries.add(ModItems.CHRISTMAS_PRESENT_SHORT_MAGENTA);
                entries.add(ModItems.CHRISTMAS_PRESENT_SHORT_LIGHT_BLUE);
                entries.add(ModItems.CHRISTMAS_PRESENT_SHORT_YELLOW);
                entries.add(ModItems.CHRISTMAS_PRESENT_SHORT_LIME);
                entries.add(ModItems.CHRISTMAS_PRESENT_SHORT_PINK);
                entries.add(ModItems.CHRISTMAS_PRESENT_SHORT_GRAY);
                entries.add(ModItems.CHRISTMAS_PRESENT_SHORT_LIGHT_GRAY);
                entries.add(ModItems.CHRISTMAS_PRESENT_SHORT_CYAN);
                entries.add(ModItems.CHRISTMAS_PRESENT_SHORT_PURPLE);
                entries.add(ModItems.CHRISTMAS_PRESENT_SHORT_BLUE);
                entries.add(ModItems.CHRISTMAS_PRESENT_SHORT_BROWN);
                entries.add(ModItems.CHRISTMAS_PRESENT_SHORT_GREEN);
                entries.add(ModItems.CHRISTMAS_PRESENT_SHORT_RED);
                entries.add(ModItems.CHRISTMAS_PRESENT_SHORT_BLACK);
                entries.add(ModItems.CHRISTMAS_PRESENT_TALL_WHITE);
                entries.add(ModItems.CHRISTMAS_PRESENT_TALL_ORANGE);
                entries.add(ModItems.CHRISTMAS_PRESENT_TALL_MAGENTA);
                entries.add(ModItems.CHRISTMAS_PRESENT_TALL_LIGHT_BLUE);
                entries.add(ModItems.CHRISTMAS_PRESENT_TALL_YELLOW);
                entries.add(ModItems.CHRISTMAS_PRESENT_TALL_LIME);
                entries.add(ModItems.CHRISTMAS_PRESENT_TALL_PINK);
                entries.add(ModItems.CHRISTMAS_PRESENT_TALL_GRAY);
                entries.add(ModItems.CHRISTMAS_PRESENT_TALL_LIGHT_GRAY);
                entries.add(ModItems.CHRISTMAS_PRESENT_TALL_CYAN);
                entries.add(ModItems.CHRISTMAS_PRESENT_TALL_PURPLE);
                entries.add(ModItems.CHRISTMAS_PRESENT_TALL_BLUE);
                entries.add(ModItems.CHRISTMAS_PRESENT_TALL_BROWN);
                entries.add(ModItems.CHRISTMAS_PRESENT_TALL_GREEN);
                entries.add(ModItems.CHRISTMAS_PRESENT_TALL_BLACK);
                entries.add(ModItems.EPIPHANY_STOCKING_WHITE);
                entries.add(ModItems.EPIPHANY_STOCKING_ORANGE);
                entries.add(ModItems.EPIPHANY_STOCKING_MAGENTA);
                entries.add(ModItems.EPIPHANY_STOCKING_LIGHT_BLUE);
                entries.add(ModItems.EPIPHANY_STOCKING_YELLOW);
                entries.add(ModItems.EPIPHANY_STOCKING_LIME);
                entries.add(ModItems.EPIPHANY_STOCKING_PINK);
                entries.add(ModItems.EPIPHANY_STOCKING_GRAY);
                entries.add(ModItems.EPIPHANY_STOCKING_LIGHT_GRAY);
                entries.add(ModItems.EPIPHANY_STOCKING_CYAN);
                entries.add(ModItems.EPIPHANY_STOCKING_PURPLE);
                entries.add(ModItems.EPIPHANY_STOCKING_BLUE);
                entries.add(ModItems.EPIPHANY_STOCKING_BROWN);
                entries.add(ModItems.EPIPHANY_STOCKING_GREEN);
                entries.add(ModItems.EPIPHANY_STOCKING_RED);
                entries.add(ModItems.EPIPHANY_STOCKING_BLACK);
                entries.add(ModItems.REDSTONE_LAMP_WHITE);
                entries.add(ModItems.REDSTONE_LAMP_ORANGE);
                entries.add(ModItems.REDSTONE_LAMP_MAGENTA);
                entries.add(ModItems.REDSTONE_LAMP_LIGHT_BLUE);
                entries.add(ModItems.REDSTONE_LAMP_YELLOW);
                entries.add(ModItems.REDSTONE_LAMP_LIME);
                entries.add(ModItems.REDSTONE_LAMP_PINK);
                entries.add(ModItems.REDSTONE_LAMP_GRAY);
                entries.add(ModItems.REDSTONE_LAMP_LIGHT_GRAY);
                entries.add(ModItems.REDSTONE_LAMP_CYAN);
                entries.add(ModItems.REDSTONE_LAMP_PURPLE);
                entries.add(ModItems.REDSTONE_LAMP_BLUE);
                entries.add(ModItems.REDSTONE_LAMP_BROWN);
                entries.add(ModItems.REDSTONE_LAMP_GREEN);
                entries.add(ModItems.REDSTONE_LAMP_RED);
                entries.add(ModItems.REDSTONE_LAMP_BLACK);

                // ITEMS
                entries.add(ModItems.PLASTIC);
                entries.add(ModItems.GIFT_CARD_ORANGE);
                entries.add(ModItems.GIFT_CARD_MAGENTA);
                entries.add(ModItems.GIFT_CARD_LIGHT_BLUE);
                entries.add(ModItems.GIFT_CARD_YELLOW);
                entries.add(ModItems.GIFT_CARD_LIME);
                entries.add(ModItems.GIFT_CARD_PINK);
                entries.add(ModItems.GIFT_CARD_GRAY);
                entries.add(ModItems.GIFT_CARD_LIGHT_GRAY);
                entries.add(ModItems.GIFT_CARD_CYAN);
                entries.add(ModItems.GIFT_CARD_PURPLE);
                entries.add(ModItems.GIFT_CARD_BLUE);
                entries.add(ModItems.GIFT_CARD_BROWN);
                entries.add(ModItems.GIFT_CARD_GREEN);
                entries.add(ModItems.GIFT_CARD_RED);
                entries.add(ModItems.GIFT_CARD_BLACK);
                entries.add(ModItems.LIGHT_BULB);
                entries.add(ModItems.LIGHT_BULB_WHITE);
                entries.add(ModItems.LIGHT_BULB_ORANGE);
                entries.add(ModItems.LIGHT_BULB_MAGENTA);
                entries.add(ModItems.LIGHT_BULB_LIGHT_BLUE);
                entries.add(ModItems.LIGHT_BULB_YELLOW);
                entries.add(ModItems.LIGHT_BULB_LIME);
                entries.add(ModItems.LIGHT_BULB_PINK);
                entries.add(ModItems.LIGHT_BULB_GRAY);
                entries.add(ModItems.LIGHT_BULB_LIGHT_GRAY);
                entries.add(ModItems.LIGHT_BULB_CYAN);
                entries.add(ModItems.LIGHT_BULB_PURPLE);
                entries.add(ModItems.LIGHT_BULB_BLUE);
                entries.add(ModItems.LIGHT_BULB_BROWN);
                entries.add(ModItems.LIGHT_BULB_GREEN);
                entries.add(ModItems.LIGHT_BULB_RED);
                entries.add(ModItems.LIGHT_BULB_BLACK);
                entries.add(ModItems.SCARF_WHITE);
                entries.add(ModItems.SCARF_ORANGE);
                entries.add(ModItems.SCARF_MAGENTA);
                entries.add(ModItems.SCARF_LIGHT_BLUE);
                entries.add(ModItems.SCARF_YELLOW);
                entries.add(ModItems.SCARF_LIME);
                entries.add(ModItems.SCARF_PINK);
                entries.add(ModItems.SCARF_GRAY);
                entries.add(ModItems.SCARF_LIGHT_GRAY);
                entries.add(ModItems.SCARF_CYAN);
                entries.add(ModItems.SCARF_PURPLE);
                entries.add(ModItems.SCARF_BLUE);
                entries.add(ModItems.SCARF_BROWN);
                entries.add(ModItems.SCARF_GREEN);
                entries.add(ModItems.SCARF_RED);
                entries.add(ModItems.SCARF_BLACK);
                entries.add(ModItems.BLACK_HAT);
                entries.add(ModItems.CHRISTMAS_HAT);
                entries.add(ModItems.ADVENT_CALENDAR);
                entries.add(ModItems.MARRY_CHRISTMAS_DISC);
                entries.add(ModItems.JINGLEBELLS_DISC);
                entries.add(ModItems.CANDY_CANES);
                entries.add(ModItems.SWEET_CHRISTMAS_TREE);
                entries.add(ModItems.GINGERBREAD);
                entries.add(ModItems.GINGERBREAD_MAN);
                entries.add(ModItems.CHOCOLATE_BAR);
                entries.add(ModItems.HOT_CHOCOLATE);
                entries.add(ModItems.CHRISTMAS_REINDEER_BISCUITS);
                entries.add(ModItems.BISCUITS_SNOWMAN);
                entries.add(ModItems.EGGNOG);
                entries.add(ModItems.GUMDROPS);
                entries.add(ModItems.CANDY_APPLE);
                entries.add(ModItems.APPLE_PIE);
                entries.add(ModItems.PANETTONE);
                entries.add(ModItems.YULE_LOG);
                entries.add(ModItems.CHRISTMAS_PUDDING);
            }).build());

    public static void registerItemGroups() {
        ChristmasCraft.LOGGER.info("Registering Item Groups for " + ChristmasCraft.MOD_ID);
    }

}
