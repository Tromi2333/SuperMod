package io.tromi2333.supermod.block;

import io.tromi2333.supermod.SuperMod;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class Blocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SuperMod.MOD_ID);


    public static final RegistryObject<Block> SUPER_ORE = BLOCKS.register("super_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_YELLOW)
                    .strength(2f, 15f).requiresCorrectToolForDrops().friction(0.5f)));

    public static final RegistryObject<Block> SUPER_BLOCK = BLOCKS.register("super_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_YELLOW)
                    .strength(5f, 20f).requiresCorrectToolForDrops().friction(0.5f)));
}
