package me.hyper;

import me.hyper.blocks.BluePotatoBlock;
import me.hyper.util.Utilities;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PotatoesPlus implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("potatoes");

	public static final CropBlock BLUE_CROP_BLOCK = new BluePotatoBlock(FabricBlockSettings.copyOf(Blocks.POTATOES));

	public static final Item BLUE_POTATO = new AliasedBlockItem(BLUE_CROP_BLOCK, new FabricItemSettings().food(PotatoesFoodComponents.BLUE_POTATO));

	@Override
	public void onInitialize() {
		registerItem("blue_potato", BLUE_POTATO);
		registerBlock("blue_potato_crop_block", BLUE_CROP_BLOCK);


		addItemAfter(ItemGroups.FOOD_AND_DRINK, Items.POTATO, BLUE_POTATO);
		LOGGER.info("Initialized PotatoesPlus.");
	}

	public static void registerItem(String path, Item item) {
		Registry.register(Registries.ITEM, new Identifier("potatoesplus", path), item);
	}

	public static void registerBlock(String path, Block block) {
		Registry.register(Registries.BLOCK, new Identifier("potatoesplus", path), block);
	}

	public static void addItemAfter(RegistryKey<ItemGroup> group, ItemConvertible vanillaItem, ItemConvertible customItem) {
		ItemGroupEvents.modifyEntriesEvent(group).register(content -> {
			content.addAfter(vanillaItem, customItem);
		});
	}
}