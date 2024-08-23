package io.tromi2333.supermod;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class CustomExplosion extends Explosion
{
    private final Level world;
    private final Entity entity;
    private final double x;
    private final double y;
    private final double z;
    private final float radius;
    private final BlockInteraction blockInteraction;

    public CustomExplosion(Level world, @Nullable Entity entity, double x, double y, double z, float radius, BlockInteraction blockInteraction)
    {
        super(world, entity, x, y, z, radius);
        this.world = world;
        this.entity = entity;
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
        this.blockInteraction = blockInteraction;
    }

    public void explode()
    {
        this.world.explode(this.entity, this.x, this.y, this.z, this.radius, blockInteraction);
    }
}