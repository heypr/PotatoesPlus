package me.hyper.data;

import me.hyper.PotatoRegisterer;
import me.hyper.blocks.BluePotatoBlock;
import me.hyper.blocks.RedPotatoBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.state.property.IntProperty;


public class PotatoLootGenerator extends FabricBlockLootTableProvider {

    protected PotatoLootGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        /// Blue Potato
        cropBuilder(PotatoRegisterer.BLUE_POTATO_CROP_BLOCK, PotatoRegisterer.BLUE_POTATO, BluePotatoBlock.AGE);
        cropBuilder(PotatoRegisterer.RED_POTATO_CROP_BLOCK, PotatoRegisterer.RED_POTATO, RedPotatoBlock.AGE);

    }

    public void cropBuilder(Block block, Item item, IntProperty age) {
        BlockStatePropertyLootCondition.Builder potatoBuilder = BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(age, 7));
        addDrop(block, cropDrops(block, item, item, potatoBuilder).apply(ApplyBonusLootFunction.binomialWithBonusCount(Enchantments.FORTUNE, 0.5714286F, 3)));
    }

}
