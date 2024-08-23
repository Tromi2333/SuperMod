package io.tromi2333.supermod.item;

import io.tromi2333.supermod.Events.SwordEvent;
import io.tromi2333.supermod.SuperMod;
import io.tromi2333.supermod.block.Blocks;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SuperMod.MOD_ID);


    public static final RegistryObject<Item> RAW_SUPER = ITEMS.register("raw_super",
            () -> new Item(new Item.Properties().tab(SuperMod.SUPERMOD_TAB).fireResistant()));

    public static final RegistryObject<Item> SUPER_INGOT = ITEMS.register("super_ingot",
            () -> new Item(new Item.Properties().tab(SuperMod.SUPERMOD_TAB).fireResistant()));

    public static final RegistryObject<BlockItem> SUPER_ORE_ITEM = ITEMS.register("super_ore",
            () -> new BlockItem(Blocks.SUPER_ORE.get(), new Item.Properties().tab(SuperMod.SUPERMOD_TAB).fireResistant()));

    public static final RegistryObject<BlockItem> SUPER_BLOCK_ITEM = ITEMS.register("super_block",
            () -> new BlockItem(Blocks.SUPER_BLOCK.get(), new Item.Properties().tab(SuperMod.SUPERMOD_TAB).fireResistant()));


    public static final RegistryObject<Item> SUPER_SWORD = ITEMS.register("super_sword",
            () -> new SwordItem(Tiers.SUPER, 2147483647, Float.MAX_VALUE,
                    new Item.Properties().tab(SuperMod.SUPERMOD_TAB).fireResistant()));

    public static final RegistryObject<Item> SUPER_AXE = ITEMS.register("super_axe",
            () -> new AxeItem(Tiers.SUPER, 2000, 10f,
                    new Item.Properties().tab(SuperMod.SUPERMOD_TAB).fireResistant()));

    public static final RegistryObject<Item> SUPER_PICKAXE = ITEMS.register("super_pickaxe",
            () -> new PickaxeItem(Tiers.SUPER, 50, 3f,
                    new Item.Properties().tab(SuperMod.SUPERMOD_TAB).fireResistant()));

    public static final RegistryObject<Item> SUPER_SHOVEL = ITEMS.register("super_shovel",
            () -> new ShovelItem(Tiers.SUPER, 25, 2.5f,
                    new Item.Properties().tab(SuperMod.SUPERMOD_TAB).fireResistant()));

    public static final RegistryObject<Item> SUPER_HOE = ITEMS.register("super_hoe",
            () -> new HoeItem(Tiers.SUPER, 25, 2.5f,
                    new Item.Properties().tab(SuperMod.SUPERMOD_TAB).fireResistant()));

    public static final RegistryObject<Item> SUPER_HELMET = ITEMS.register("super_helmet",
            () -> new ArmorItem(ArmorMaterials.SUPER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(SuperMod.SUPERMOD_TAB).fireResistant()));

    public static final RegistryObject<Item> SUPER_CHESTPLATE = ITEMS.register("super_chestplate",
            () -> new ArmorItem(ArmorMaterials.SUPER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(SuperMod.SUPERMOD_TAB).fireResistant()));

    public static final RegistryObject<Item> SUPER_LEGGINGS = ITEMS.register("super_leggings",
            () -> new ArmorItem(ArmorMaterials.SUPER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(SuperMod.SUPERMOD_TAB).fireResistant()));

    public static final RegistryObject<Item> SUPER_BOOTS = ITEMS.register("super_boots",
            () -> new ArmorItem(ArmorMaterials.SUPER, EquipmentSlot.FEET,
                    new Item.Properties().tab(SuperMod.SUPERMOD_TAB).fireResistant()));

    public static final RegistryObject<Item> GUNPOWDER_SWORD = ITEMS.register("gunpowder_sword",
            () -> new SwordEvent(Tiers.GUNPOWDER, 2, 0.5f,
                    new Item.Properties().tab(SuperMod.SUPERMOD_TAB)));
}