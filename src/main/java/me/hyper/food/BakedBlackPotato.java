package me.hyper.food;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BakedBlackPotato extends Item {

    public BakedBlackPotato(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {

        user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 50, 1));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 50, 1));

        return super.finishUsing(stack, world, user);
    }
}
