package me.savikin.kris.common.blocks;

import me.savikin.kris.common.Kris;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import static me.savikin.kris.common.Reference.name;

/**
 * Created by Mark on 26/06/2016.
 */

public abstract class PSBlock extends Block implements ITileEntityProvider
{
    protected String name;
    public PSBlock(Material blockMaterialIn, MapColor blockMapColorIn, String name) {
        super(blockMaterialIn, blockMapColorIn);
        this.name = name;
    }

    public void registerItemModel(Item item){
        Kris.proxy.registerItemRenderer(item, 0, name);
    }

}
