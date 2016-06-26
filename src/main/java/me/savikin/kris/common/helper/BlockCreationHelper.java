package me.savikin.kris.common.helper;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Mark on 26/06/2016.
 */

public class BlockCreationHelper
{
    public static void createBlock(Block b, String s)
    {
        GameRegistry.register(b);
        GameRegistry.register(new ItemBlock(b), b.getRegistryName());
    }
}
