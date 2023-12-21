package me.hyper;

import me.hyper.util.Utilities;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PotatoesPlus implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("potatoes");

	@Override
	public void onInitialize() {
		Utilities.registerCrop("blue_potato", PotatoRegisterer.BLUE_POTATO_CROP_BLOCK, PotatoRegisterer.BLUE_POTATO);
		Utilities.registerCrop("red_potato", PotatoRegisterer.RED_POTATO_CROP_BLOCK, PotatoRegisterer.RED_POTATO);
//		Utilities.registerCrop("green_potato", PotatoRegisterer.GREEN_POTATO_CROP_BLOCK, PotatoRegisterer.GREEN_POTATO);
//		Utilities.registerCrop("yellow_potato", PotatoRegisterer.YELLOW_POTATO_CROP_BLOCK, PotatoRegisterer.YELLOW_POTATO);
//		Utilities.registerCrop("white_potato", PotatoRegisterer.WHITE_POTATO_CROP_BLOCK, PotatoRegisterer.WHITE_POTATO);
//		Utilities.registerCrop("black_potato", PotatoRegisterer.BLACK_POTATO_CROP_BLOCK, PotatoRegisterer.BLACK_POTATO);
//		Utilities.registerCrop("invisible_potato", PotatoRegisterer.INVISIBLE_POTATO_CROP_BLOCK, INVISIBLE.BLUE_POTATO);
//		Utilities.registerCrop("space_potato", PotatoRegisterer.SPACE_POTATO_CROP_BLOCK, PotatoRegisterer.SPACE_POTATO);


		Utilities.addItemAfter(ItemGroups.FOOD_AND_DRINK, Items.POTATO, PotatoRegisterer.BLUE_POTATO);

		LOGGER.info("Initialized PotatoesPlus.");
	}

}