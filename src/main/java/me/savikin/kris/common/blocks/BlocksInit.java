package me.savikin.kris.common.blocks;

import me.savikin.kris.common.helper.BlockCreationHelper;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Mark on 26/06/2016.
 */

public class BlocksInit
{
    public static Block air_pump;

    public static void init()
    {
        air_pump = new BlockAirPump();
        BlockCreationHelper.createBlock(air_pump, "air_pump");
    }
}
