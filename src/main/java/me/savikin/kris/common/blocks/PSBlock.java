package me.savikin.kris.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Created by Mark on 26/06/2016.
 */

public abstract class PSBlock extends Block implements ITileEntityProvider
{
    public PSBlock(Material blockMaterialIn, MapColor blockMapColorIn) {
        super(blockMaterialIn, blockMapColorIn);
    }
}
