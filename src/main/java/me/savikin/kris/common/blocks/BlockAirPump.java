package me.savikin.kris.common.blocks;

import me.savikin.kris.common.blocks.te.TileEntityAirPump;
import me.savikin.kris.common.helper.ChatHelper;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

import javax.annotation.Nullable;


/**
 * Created by Mark on 26/06/2016.
 */

public class BlockAirPump extends PSBlock
{
    public float capChat;
    public float volChat;

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

    private TileEntityAirPump getTE(World w, BlockPos bp)
    {
        return (TileEntityAirPump) w.getTileEntity(bp);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote)
        {
            capChat = getTE(worldIn, pos).getCapacity();
            volChat = getTE(worldIn, pos).getVolume();
            System.out.println("Pressure Capacity:" + capChat + "bars");
            System.out.println("Volume of Object:" + volChat + "m3");
            return true;
        }
        return false;
    }
}
