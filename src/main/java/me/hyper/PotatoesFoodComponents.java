package me.hyper;

import net.minecraft.item.FoodComponent;

public class PotatoesFoodComponents {

    // Uncooked variants
    public static final FoodComponent BLUE_POTATO = registerUncookedPotato();
    public static final FoodComponent RED_POTATO = registerUncookedPotato();
    public static final FoodComponent GREEN_POTATO = registerUncookedPotato();
    public static final FoodComponent YELLOW_POTATO = registerUncookedPotato();
    public static final FoodComponent WHITE_POTATO = registerUncookedPotato();
    public static final FoodComponent BLACK_POTATO = registerUncookedPotato();
    public static final FoodComponent INVISIBLE_POTATO = registerUncookedPotato();
    public static final FoodComponent SPACE_POTATO = registerUncookedPotato();

    // Baked variants
    public static final FoodComponent BAKED_BLUE_POTATO = registerBakedPotato();
    public static final FoodComponent BAKED_RED_POTATO = registerBakedPotato();
    public static final FoodComponent BAKED_GREEN_POTATO = registerBakedPotato();
    public static final FoodComponent BAKED_YELLOW_POTATO = registerBakedPotato();
    public static final FoodComponent BAKED_WHITE_POTATO = registerBakedPotato();
    public static final FoodComponent BAKED_BLACK_POTATO = registerBakedPotato();
    public static final FoodComponent BAKED_INVISIBLE_POTATO = registerBakedPotato();
    public static final FoodComponent BAKED_SPACE_POTATO = registerBakedPotato();

    public static FoodComponent registerUncookedPotato() {
        return new FoodComponent.Builder().hunger(4).saturationModifier(1f).build();
    }

    public static FoodComponent registerBakedPotato() {
        return new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build();
    }
}
