package me.hyper.util;

import me.hyper.PotatoRegisterer;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.Arrays;
import java.util.Iterator;

public class PotatoesLootTableModifiers {

    private static final Identifier BONUS_CHEST =
            new Identifier("minecraft", "chests/spawn_bonus_chest");

    private static final Identifier PILLAGER_OUTPOST =
            new Identifier("minecraft", "chests/pillager_outpost");

    private static final Identifier ANCIENT_CITY_ICE_BOX =
            new Identifier("minecraft", "chests/ancient_city_ice_box");

    private static final Identifier SHIPWRECK_SUPPLY =
            new Identifier("minecraft", "chests/shipwreck_supply");

    private static final Identifier VILLAGE_PLAINS_HOUSE =
            new Identifier("minecraft", "chests/village_plains_house");

    private static final Identifier VILLAGE_SNOWY_HOUSE =
            new Identifier("minecraft", "chests/village_snowy_house");

    private static final Identifier VILLAGE_TAIGA_HOUSE =
            new Identifier("minecraft", "chests/village_taiga_house");

    private static final Identifier BASTION_TREASURE =
            new Identifier("minecraft", "chests/bastion_treasure");

    private static final Identifier WOODLAND_MANSION =
            new Identifier("minecraft", "chests/woodland_mansion");

    static Iterator<Identifier> list = Arrays.asList(BONUS_CHEST, WOODLAND_MANSION, BASTION_TREASURE, VILLAGE_TAIGA_HOUSE, VILLAGE_SNOWY_HOUSE, VILLAGE_PLAINS_HOUSE, SHIPWRECK_SUPPLY, ANCIENT_CITY_ICE_BOX, PILLAGER_OUTPOST).iterator();


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            while (list.hasNext()) {
                if(id.equals(list.next())) {
                    LootPool.Builder poolBuilder = regularBuilder();
                    tableBuilder.pool(poolBuilder.build());
                    list.remove();
                }
            }
        });
    }

    public static LootPool.Builder regularBuilder() {
            return LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.05f))
                    .with(ItemEntry.builder(PotatoRegisterer.BLACK_POTATO))
                    .with(ItemEntry.builder(PotatoRegisterer.BLUE_POTATO))
                    .with(ItemEntry.builder(PotatoRegisterer.GREEN_POTATO))
                    .with(ItemEntry.builder(PotatoRegisterer.INVISIBLE_POTATO))
                    .with(ItemEntry.builder(PotatoRegisterer.RED_POTATO))
                    .with(ItemEntry.builder(PotatoRegisterer.SPACE_POTATO))
                    .with(ItemEntry.builder(PotatoRegisterer.WHITE_POTATO))
                    .with(ItemEntry.builder(PotatoRegisterer.YELLOW_POTATO))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0f, 1f)).build());
    }
}
