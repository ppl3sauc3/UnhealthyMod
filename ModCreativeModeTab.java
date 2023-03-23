package com.appl3sauc3.unhealthymod.item;

import com.appl3sauc3.unhealthymod.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("Mod Items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.deathstick.get());
        }
    };

}
