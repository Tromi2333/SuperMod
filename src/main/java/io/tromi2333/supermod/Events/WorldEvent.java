package io.tromi2333.supermod.Events;

import io.tromi2333.supermod.SuperMod;
import io.tromi2333.supermod.world.OreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SuperMod.MOD_ID)
public class WorldEvent
{
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event)
    {
        OreGeneration.generateOres(event);
    }
}