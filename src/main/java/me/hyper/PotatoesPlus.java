package me.hyper;

import me.hyper.items.BigBluePotato;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PotatoesPlus implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("potatoes");

	public static final BigBluePotato BigBluePotato = new BigBluePotato(new FabricItemSettings().food(PotatoesFoodComponents.BIG_BLUE_POTATO));

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		Registry.register(Registries.ITEM, new Identifier("potatoesplus", "big_blue_potato"), BigBluePotato);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {
			content.addAfter(Items.POTATO, BigBluePotato);
		});
	}
}