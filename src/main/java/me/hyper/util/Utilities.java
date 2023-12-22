package me.hyper.util;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class Utilities {

    public static void registerItem(String path, Item item) {
        Registry.register(Registries.ITEM, new Identifier("potatoesplus", path), item);
    }

    public static void registerBlock(String path, Block block) {
        Registry.register(Registries.BLOCK, new Identifier("potatoesplus", path), block);
    }

    public static void registerCrop(String path, Block block, Item item) {
        Registry.register(Registries.ITEM, new Identifier("potatoesplus", path), item);
        Registry.register(Registries.BLOCK, new Identifier("potatoesplus", path + "_crop_block"), block);
    }

    public static void addItemAfter(RegistryKey<ItemGroup> group, ItemConvertible vanillaItem, ItemConvertible customItem) {
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> {
            content.addAfter(vanillaItem, customItem);
        });
    }

}
