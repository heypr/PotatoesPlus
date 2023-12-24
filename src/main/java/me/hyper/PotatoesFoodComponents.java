package me.hyper;

import net.minecraft.item.FoodComponent;

public class PotatoesFoodComponents {
    public static final FoodComponent BLUE_POTATO = registerFood();
    public static final FoodComponent RED_POTATO = registerFood();
    public static final FoodComponent GREEN_POTATO = registerFood();
    public static final FoodComponent YELLOW_POTATO = registerFood();
    public static final FoodComponent WHITE_POTATO = registerFood();
    public static final FoodComponent BLACK_POTATO = registerFood();
    public static final FoodComponent INVISIBLE_POTATO = registerFood();
    public static final FoodComponent SPACE_POTATO = registerFood();

    public static FoodComponent registerFood() {
        return new FoodComponent.Builder().hunger(4).saturationModifier(1f).build();
    }
}
