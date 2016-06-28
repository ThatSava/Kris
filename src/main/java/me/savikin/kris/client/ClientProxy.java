package me.savikin.kris.client;

import me.savikin.kris.common.CommonProxy;
import me.savikin.kris.common.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Sava on 28-Jun-16.
 */
public class ClientProxy extends CommonProxy{
    //TODO probably extend IProxy instead
    //TODO make sided airpump textures
    @Override
    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.modid + ":" + id, "inventory"));
    }
}
