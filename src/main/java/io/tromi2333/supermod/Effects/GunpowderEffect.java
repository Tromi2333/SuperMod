package io.tromi2333.supermod.Effects;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import io.tromi2333.supermod.CustomExplosion;
import net.minecraft.world.level.Explosion;

public class GunpowderEffect extends MobEffect
{
    public GunpowderEffect(MobEffectCategory mobEffectCategory, int color)
    {
        super(mobEffectCategory, color);
    }

    @Override

    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier)
    {
        if(!pLivingEntity.level.isClientSide())
        {
            double x  = pLivingEntity.getX();
            double y  = pLivingEntity.getY();
            double z  = pLivingEntity.getZ();

            CustomExplosion explosion = new CustomExplosion(pLivingEntity.level, pLivingEntity, x, y, z, pAmplifier * 1.5f, Explosion.BlockInteraction.DESTROY);

            if(pLivingEntity.isOnFire())
            {
                explosion.explode();
                pLivingEntity.hurt(DamageSource.explosion(pLivingEntity), Float.MAX_VALUE);
                pLivingEntity.removeEffect(Effects.GUNPOWDER.get());
            }
        }
        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override

    public boolean isDurationEffectTick(int pDuration, int pAmplifier)
    {
        return true;
    }
}