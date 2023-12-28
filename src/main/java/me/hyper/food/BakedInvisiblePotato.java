package me.hyper.food;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BakedInvisiblePotato extends Item {

    public BakedInvisiblePotato(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {

        user.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 60, 1));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 40, 1));

        return super.finishUsing(stack, world, user);
    }

}
