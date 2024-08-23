package io.tromi2333.supermod.Effects;

import io.tromi2333.supermod.SuperMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Effects
{
    public static final DeferredRegister<MobEffect> MOB_EFFECT =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SuperMod.MOD_ID);

    public static final RegistryObject<MobEffect> GUNPOWDER = MOB_EFFECT.register("gunpowder",
            () -> new GunpowderEffect(MobEffectCategory.HARMFUL, 1919810));

    public static void register(IEventBus eventBus)
    {
        MOB_EFFECT.register(eventBus);
    }
}
