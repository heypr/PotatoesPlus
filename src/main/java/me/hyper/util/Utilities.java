package me.hyper.util;

import net.minecraft.block.Block;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.state.property.Property;

public class Utilities {

    public static BlockStatePropertyLootCondition.Builder cropBuilder(Block cropBlock, Property<Integer> cropAge, int finalAge) {
        return BlockStatePropertyLootCondition.builder(cropBlock).properties(StatePredicate.Builder.create().exactMatch(cropAge, finalAge));
    }

}
