package com.appl3sauc3.unhealthymod.item;

import com.appl3sauc3.unhealthymod.unhealthymod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, unhealthymod.MODID);

    public static final RegistryObject<Item> FORCE_WRENCH = ITEMS.register("force_wrench");
    () -> new Item(new Item.Properties()))

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
