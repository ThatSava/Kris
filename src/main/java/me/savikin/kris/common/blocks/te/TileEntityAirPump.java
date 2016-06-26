package me.savikin.kris.common.blocks.te;

import net.minecraft.tileentity.TileEntity;

/**
 * Created by Mark on 26/06/2016.
 */

public class TileEntityAirPump extends TileEntity
{
    public Double pressure;
    public int baseCapacity;
    public float finalCapacity;
    public float pressureMultiplier;

    public void getCapacity()
    {
        finalCapacity = baseCapacity * pressureMultiplier;
    }

    public void checkPressure()
    {
        if (pressure != null) {
            if (pressure >= finalCapacity) {
                // Does action related to pressure overload
            }
        }
        else
        {
            System.out.println("Pressure is equal to null.");
        }
    }
}
