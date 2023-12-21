package me.hyper;

import me.hyper.blocks.BluePotatoBlock;
import me.hyper.blocks.RedPotatoBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;

public class PotatoRegisterer {

    public static final CropBlock BLUE_POTATO_CROP_BLOCK = new BluePotatoBlock(FabricBlockSettings.copyOf(Blocks.POTATOES));
    public static final CropBlock RED_POTATO_CROP_BLOCK = new RedPotatoBlock(FabricBlockSettings.copyOf(Blocks.POTATOES));


    public static final Item BLUE_POTATO = new AliasedBlockItem(BLUE_POTATO_CROP_BLOCK, new FabricItemSettings().food(PotatoesFoodComponents.BLUE_POTATO));
    public static final Item RED_POTATO = new AliasedBlockItem(RED_POTATO_CROP_BLOCK, new FabricItemSettings().food(PotatoesFoodComponents.RED_POTATO));

}
