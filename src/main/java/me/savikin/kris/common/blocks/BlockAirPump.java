package me.savikin.kris.common.blocks;

import me.savikin.kris.common.blocks.te.TileEntityAirPump;
import me.savikin.kris.common.helper.ChatHelper;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

import javax.annotation.Nullable;


/**
 * Created by Mark on 26/06/2016.
 */

public class BlockAirPump extends PSBlock
{
    public float capChat;
    public float volChat;
    public ChatHelper chat;

    public BlockAirPump()
    {
        super(Material.ROCK, MapColor.ADOBE, "air_pump");
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
            chat.printChatMessage(new TextComponentString("Pressure Capacity: " + capChat + "bars"));
            chat.printChatMessage(new TextComponentString("Volume of Object: " + volChat + "m3"));
            return true;
        }
        return false;
    }

}
