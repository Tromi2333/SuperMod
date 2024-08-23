package io.tromi2333.supermod.world;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class OrePlacement {
    public static List<PlacementModifier> orePlacement(PlacementModifier placementModifier, PlacementModifier pPlacementModifier) {
        return List.of(placementModifier, InSquarePlacement.spread(), pPlacementModifier, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int cPlacement, PlacementModifier placementModifier) {
        return orePlacement(CountPlacement.of(cPlacement), placementModifier);
    }

    public static List<PlacementModifier> rareOrePlacement(int rPlacement, PlacementModifier placementModifier) {
        return orePlacement(RarityFilter.onAverageOnceEvery(rPlacement), placementModifier);
    }
}