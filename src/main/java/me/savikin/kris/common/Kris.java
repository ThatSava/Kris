package me.savikin.kris.common;

import me.savikin.kris.common.blocks.BlocksInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Mark on 26/06/2016.
 */

@Mod(modid = Reference.modid, name = Reference.name, version = Reference.version)
public class Kris
{
    @SidedProxy(clientSide = Reference.client, serverSide = Reference.server)
    public static CommonProxy proxy; //TODO change from common proxy to IProxy

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent e)
    {
        BlocksInit.init();
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent e)
    {

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent e)
    {

    }
}
