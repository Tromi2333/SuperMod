package io.tromi2333.supermod.world;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class PlacedFeatures
{
    public static final Holder<PlacedFeature> SUPER_ORE_PLACED = PlacementUtils.register("super_ore_placed",
            Features.SUPER_ORE, OrePlacement.commonOrePlacement(3,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(40))));
}