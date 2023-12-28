package me.hyper.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BakedGreenPotato extends Item {

    public BakedGreenPotato(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {

        user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 30, 1));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 50, 2));

        return super.finishUsing(stack, world, user);
    }

}
