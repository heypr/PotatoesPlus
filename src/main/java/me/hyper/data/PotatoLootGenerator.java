package me.hyper.data;

import me.hyper.PotatoRegisterer;
import me.hyper.blocks.BluePotatoBlock;
import me.hyper.blocks.RedPotatoBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.state.property.IntProperty;


public class PotatoLootGenerator extends FabricBlockLootTableProvider {

    protected PotatoLootGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        cropBuilder(PotatoRegisterer.BLACK_POTATO_CROP_BLOCK, PotatoRegisterer.BLACK_POTATO, BluePotatoBlock.AGE);
        cropBuilder(PotatoRegisterer.BLUE_POTATO_CROP_BLOCK, PotatoRegisterer.BLUE_POTATO, BluePotatoBlock.AGE);
        cropBuilder(PotatoRegisterer.GREEN_POTATO_CROP_BLOCK, PotatoRegisterer.GREEN_POTATO, BluePotatoBlock.AGE);
        cropBuilder(PotatoRegisterer.INVISIBLE_POTATO_CROP_BLOCK, PotatoRegisterer.INVISIBLE_POTATO, BluePotatoBlock.AGE);
        cropBuilder(PotatoRegisterer.RED_POTATO_CROP_BLOCK, PotatoRegisterer.RED_POTATO, BluePotatoBlock.AGE);
        cropBuilder(PotatoRegisterer.SPACE_POTATO_CROP_BLOCK, PotatoRegisterer.SPACE_POTATO, BluePotatoBlock.AGE);
        cropBuilder(PotatoRegisterer.WHITE_POTATO_CROP_BLOCK, PotatoRegisterer.WHITE_POTATO, BluePotatoBlock.AGE);
        cropBuilder(PotatoRegisterer.YELLOW_POTATO_CROP_BLOCK, PotatoRegisterer.YELLOW_POTATO, RedPotatoBlock.AGE);

    }

    public void cropBuilder(Block block, Item item, IntProperty age) {
        BlockStatePropertyLootCondition.Builder potatoBuilder = BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(age, 7));
        addDrop(block, cropDrops(block, item, item, potatoBuilder));
    }

}
