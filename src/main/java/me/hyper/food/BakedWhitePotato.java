package me.hyper.food;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BakedWhitePotato extends Item {

    public BakedWhitePotato(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {

        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 40, 1));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 50, 2));

        return super.finishUsing(stack, world, user);
    }

}
