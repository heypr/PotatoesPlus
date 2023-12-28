package me.hyper;

import me.hyper.util.PotatoesLootTableModifiers;
import me.hyper.util.Utilities;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PotatoesPlus implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("potatoes");

	@Override
	public void onInitialize() {
		Utilities.registerCrop("black_potato", PotatoRegisterer.BLACK_POTATO_CROP_BLOCK, PotatoRegisterer.BLACK_POTATO);
		Utilities.registerCrop("blue_potato", PotatoRegisterer.BLUE_POTATO_CROP_BLOCK, PotatoRegisterer.BLUE_POTATO);
		Utilities.registerCrop("green_potato", PotatoRegisterer.GREEN_POTATO_CROP_BLOCK, PotatoRegisterer.GREEN_POTATO);
		Utilities.registerCrop("invisible_potato", PotatoRegisterer.INVISIBLE_POTATO_CROP_BLOCK, PotatoRegisterer.INVISIBLE_POTATO);
		Utilities.registerCrop("red_potato", PotatoRegisterer.RED_POTATO_CROP_BLOCK, PotatoRegisterer.RED_POTATO);
		Utilities.registerCrop("space_potato", PotatoRegisterer.SPACE_POTATO_CROP_BLOCK, PotatoRegisterer.SPACE_POTATO);
		Utilities.registerCrop("white_potato", PotatoRegisterer.WHITE_POTATO_CROP_BLOCK, PotatoRegisterer.WHITE_POTATO);
		Utilities.registerCrop("yellow_potato", PotatoRegisterer.YELLOW_POTATO_CROP_BLOCK, PotatoRegisterer.YELLOW_POTATO);


		Utilities.addItemAfter(ItemGroups.FOOD_AND_DRINK, Items.POTATO, PotatoRegisterer.BLACK_POTATO);
		Utilities.addItemAfter(ItemGroups.FOOD_AND_DRINK, PotatoRegisterer.BLACK_POTATO, PotatoRegisterer.BLUE_POTATO);
		Utilities.addItemAfter(ItemGroups.FOOD_AND_DRINK, PotatoRegisterer.BLUE_POTATO, PotatoRegisterer.GREEN_POTATO);
		Utilities.addItemAfter(ItemGroups.FOOD_AND_DRINK, PotatoRegisterer.GREEN_POTATO, PotatoRegisterer.INVISIBLE_POTATO);
		Utilities.addItemAfter(ItemGroups.FOOD_AND_DRINK, PotatoRegisterer.INVISIBLE_POTATO, PotatoRegisterer.RED_POTATO);
		Utilities.addItemAfter(ItemGroups.FOOD_AND_DRINK, PotatoRegisterer.RED_POTATO, PotatoRegisterer.SPACE_POTATO);
		Utilities.addItemAfter(ItemGroups.FOOD_AND_DRINK, PotatoRegisterer.SPACE_POTATO, PotatoRegisterer.WHITE_POTATO);
		Utilities.addItemAfter(ItemGroups.FOOD_AND_DRINK, PotatoRegisterer.WHITE_POTATO, PotatoRegisterer.YELLOW_POTATO);


		Utilities.registerItem("baked_black_potato", PotatoRegisterer.BAKED_BLACK_POTATO);
		Utilities.registerItem("baked_blue_potato", PotatoRegisterer.BAKED_BLUE_POTATO);
		Utilities.registerItem("baked_green_potato", PotatoRegisterer.BAKED_GREEN_POTATO);
		Utilities.registerItem("baked_invisible_potato", PotatoRegisterer.BAKED_INVISIBLE_POTATO);
		Utilities.registerItem("baked_red_potato", PotatoRegisterer.BAKED_RED_POTATO);
		Utilities.registerItem("baked_space_potato", PotatoRegisterer.BAKED_SPACE_POTATO);
		Utilities.registerItem("baked_white_potato", PotatoRegisterer.BAKED_WHITE_POTATO);
		Utilities.registerItem("baked_yellow_potato", PotatoRegisterer.BAKED_YELLOW_POTATO);


		Utilities.addItemAfter(ItemGroups.FOOD_AND_DRINK, Items.BAKED_POTATO, PotatoRegisterer.BAKED_BLACK_POTATO);
		Utilities.addItemAfter(ItemGroups.FOOD_AND_DRINK, PotatoRegisterer.BAKED_BLACK_POTATO, PotatoRegisterer.BAKED_BLUE_POTATO);
		Utilities.addItemAfter(ItemGroups.FOOD_AND_DRINK, PotatoRegisterer.BAKED_BLUE_POTATO, PotatoRegisterer.BAKED_GREEN_POTATO);
		Utilities.addItemAfter(ItemGroups.FOOD_AND_DRINK, PotatoRegisterer.BAKED_GREEN_POTATO, PotatoRegisterer.BAKED_INVISIBLE_POTATO);
		Utilities.addItemAfter(ItemGroups.FOOD_AND_DRINK, PotatoRegisterer.BAKED_INVISIBLE_POTATO, PotatoRegisterer.BAKED_RED_POTATO);
		Utilities.addItemAfter(ItemGroups.FOOD_AND_DRINK, PotatoRegisterer.BAKED_RED_POTATO, PotatoRegisterer.BAKED_SPACE_POTATO);
		Utilities.addItemAfter(ItemGroups.FOOD_AND_DRINK, PotatoRegisterer.BAKED_SPACE_POTATO, PotatoRegisterer.BAKED_WHITE_POTATO);
		Utilities.addItemAfter(ItemGroups.FOOD_AND_DRINK, PotatoRegisterer.BAKED_WHITE_POTATO, PotatoRegisterer.BAKED_YELLOW_POTATO);


		PotatoesLootTableModifiers.modifyLootTables();


		LOGGER.info("Initialized PotatoesPlus.");
	}

}