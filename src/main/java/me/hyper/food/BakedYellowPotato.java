package me.hyper.food;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BakedYellowPotato extends Item {

    public BakedYellowPotato(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {

        user.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 40, 1));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 40, 2));

        return super.finishUsing(stack, world, user);
    }

}
