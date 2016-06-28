package me.savikin.kris.common;

import net.minecraft.item.Item;

/**
 * Created by Mark on 26/06/2016.
 */

public interface IProxy
{
    void registerItemRenderer(Item item, int meta, String id);
}
