package com.Hoshino.hoshinomod.regi;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class HoshinoModTab extends ItemGroup {

    public HoshinoModTab() {
        super("hoshinomod");
    }

    @Override
    public ItemStack createIcon() {
        ItemStack itemStack = new ItemStack(Blocks.TNT);
        return itemStack;
    }
}
