package io.tromi2333.supermod;

import io.tromi2333.supermod.Effects.Effects;
import io.tromi2333.supermod.block.Blocks;
import io.tromi2333.supermod.item.Items;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SuperMod.MOD_ID)
public class SuperMod
{
    public static final String MOD_ID = "supermod";

    public SuperMod()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        Items.ITEMS.register(bus);
        Blocks.BLOCKS.register(bus);
        Effects.register(bus);
    }

    public static final CreativeModeTab SUPERMOD_TAB = new CreativeModeTab(MOD_ID)
    {
        @Override
        public ItemStack makeIcon()
        {
            return Items.SUPER_INGOT.get().getDefaultInstance();
        }
    };
}