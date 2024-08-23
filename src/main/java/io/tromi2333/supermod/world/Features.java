package io.tromi2333.supermod.world;

import io.tromi2333.supermod.block.Blocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class Features
{
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SUPER_ORES = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Blocks.SUPER_ORE.get().defaultBlockState())
    );

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SUPER_ORE = FeatureUtils.register("super_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_SUPER_ORES, 3));
}
