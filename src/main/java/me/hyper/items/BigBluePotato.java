package me.hyper.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class BigBluePotato extends Item {

    public BigBluePotato(Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> consume(PlayerEntity playerEntity, Hand hand) {
        return TypedActionResult.consume(playerEntity.getStackInHand(hand));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {}

}
