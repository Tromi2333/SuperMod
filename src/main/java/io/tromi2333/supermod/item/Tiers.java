package io.tromi2333.supermod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

import java.lang.Float;

public class Tiers
{
    public static final ForgeTier SUPER = new ForgeTier(5, -1, Float.MAX_VALUE,
            -1f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.SUPER_INGOT.get()));

    public static final ForgeTier GUNPOWDER = new ForgeTier(1, 20, 0.8f,
            2, 22, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Items.SUPER_INGOT.get()));
}