package me.savikin.kris.common.blocks;

import me.savikin.kris.common.blocks.te.TileEntityAirPump;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.tileentity.TileEntity;

import net.minecraft.world.World;


/**
 * Created by Mark on 26/06/2016.
 */

public class BlockAirPump extends PSBlock
{
    public TileEntity tileEntity = getTileEntity();

    public BlockAirPump()
    {
        super(Material.ROCK, MapColor.ADOBE);
        setUnlocalizedName("air_pump");
        setRegistryName("air_pump");
        setCreativeTab(CreativeTabs.REDSTONE);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta)
    {
        return new TileEntityAirPump();
    }

    public TileEntity getTileEntity() {
        return tileEntity;
    }

}
