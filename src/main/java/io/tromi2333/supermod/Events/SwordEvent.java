package io.tromi2333.supermod.Events;

import io.tromi2333.supermod.Effects.Effects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class SwordEvent extends SwordItem
{
    public SwordEvent(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties)
    {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override

    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker)
    {
        pTarget.addEffect(new MobEffectInstance(Effects.GUNPOWDER.get(), 200), pAttacker);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}