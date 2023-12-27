package me.hyper;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class PotatoesPlusClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		registerBlock(PotatoRegisterer.BLACK_POTATO_CROP_BLOCK, false);
		registerBlock(PotatoRegisterer.BLUE_POTATO_CROP_BLOCK, false);
		registerBlock(PotatoRegisterer.GREEN_POTATO_CROP_BLOCK, false);
		registerBlock(PotatoRegisterer.INVISIBLE_POTATO_CROP_BLOCK, true);
		registerBlock(PotatoRegisterer.RED_POTATO_CROP_BLOCK, false);
		registerBlock(PotatoRegisterer.SPACE_POTATO_CROP_BLOCK, false);
		registerBlock(PotatoRegisterer.WHITE_POTATO_CROP_BLOCK, false);
		registerBlock(PotatoRegisterer.YELLOW_POTATO_CROP_BLOCK, false);
	}

	public static void registerBlock(Block block, boolean isTranslucent) {
		if (isTranslucent) {
			BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), block);
		}
		else {
			BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), block);
		}
	}
}