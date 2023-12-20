package me.hyper.data;

import me.hyper.PotatoesPlus;
import me.hyper.blocks.BluePotatoBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;


public class PotatoLootGenerator extends FabricBlockLootTableProvider {

    protected PotatoLootGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        // Blue Potato

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(PotatoesPlus.BLUE_CROP_BLOCK).properties(StatePredicate.Builder.create()
                .exactMatch(BluePotatoBlock.AGE, 7));

        addDrop(PotatoesPlus.BLUE_CROP_BLOCK, cropDrops(PotatoesPlus.BLUE_CROP_BLOCK, PotatoesPlus.BLUE_POTATO, PotatoesPlus.BLUE_POTATO, builder));

//        BlockStatePropertyLootCondition.Builder builder = Utilities.cropBuilder(PotatoesPlus.BLUE_CROP_BLOCK, BluePotatoBlock.AGE, 7);
//        addDrop(PotatoesPlus.BLUE_CROP_BLOCK,
//                cropDrops(PotatoesPlus.BLUE_CROP_BLOCK, PotatoesPlus.BLUE_POTATO, PotatoesPlus.BLUE_POTATO, builder)
//                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(Enchantments.FORTUNE, 0.5714286F, 3)));

    }

}
