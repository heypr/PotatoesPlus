package me.hyper;

import me.hyper.blocks.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class PotatoRegisterer {

    public static final CropBlock BLACK_POTATO_CROP_BLOCK = new BlackPotatoBlock(FabricBlockSettings.copyOf(Blocks.POTATOES));
    public static final CropBlock BLUE_POTATO_CROP_BLOCK = new BluePotatoBlock(FabricBlockSettings.copyOf(Blocks.POTATOES));
    public static final CropBlock GREEN_POTATO_CROP_BLOCK = new GreenPotatoBlock(FabricBlockSettings.copyOf(Blocks.POTATOES));
    public static final CropBlock INVISIBLE_POTATO_CROP_BLOCK = new InvisiblePotatoBlock(FabricBlockSettings.copyOf(Blocks.POTATOES));
    public static final CropBlock RED_POTATO_CROP_BLOCK = new RedPotatoBlock(FabricBlockSettings.copyOf(Blocks.POTATOES));
    public static final CropBlock SPACE_POTATO_CROP_BLOCK = new SpacePotatoBlock(FabricBlockSettings.copyOf(Blocks.POTATOES));
    public static final CropBlock WHITE_POTATO_CROP_BLOCK = new WhitePotatoBlock(FabricBlockSettings.copyOf(Blocks.POTATOES));
    public static final CropBlock YELLOW_POTATO_CROP_BLOCK = new YellowPotatoBlock(FabricBlockSettings.copyOf(Blocks.POTATOES));

    //

    public static final Item BLACK_POTATO = registerBI(BLACK_POTATO_CROP_BLOCK, PotatoesFoodComponents.BLACK_POTATO);
    public static final Item BLUE_POTATO = registerBI(BLUE_POTATO_CROP_BLOCK, PotatoesFoodComponents.BLUE_POTATO);
    public static final Item GREEN_POTATO = registerBI(GREEN_POTATO_CROP_BLOCK, PotatoesFoodComponents.GREEN_POTATO);
    public static final Item INVISIBLE_POTATO = registerBI(INVISIBLE_POTATO_CROP_BLOCK, PotatoesFoodComponents.INVISIBLE_POTATO);
    public static final Item RED_POTATO = registerBI(RED_POTATO_CROP_BLOCK, PotatoesFoodComponents.RED_POTATO);
    public static final Item SPACE_POTATO = registerBI(SPACE_POTATO_CROP_BLOCK, PotatoesFoodComponents.SPACE_POTATO);
    public static final Item WHITE_POTATO = registerBI(WHITE_POTATO_CROP_BLOCK, PotatoesFoodComponents.WHITE_POTATO);
    public static final Item YELLOW_POTATO = registerBI(YELLOW_POTATO_CROP_BLOCK, PotatoesFoodComponents.YELLOW_POTATO);


    public static AliasedBlockItem registerBI(Block block, FoodComponent food) {
        return new AliasedBlockItem(block, new FabricItemSettings().food(food));
    }

}
