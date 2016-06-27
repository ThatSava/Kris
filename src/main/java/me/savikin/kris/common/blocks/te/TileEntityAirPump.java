package me.savikin.kris.common.blocks.te;

import net.minecraft.tileentity.TileEntity;

/**
 * Created by Mark on 26/06/2016.
 */

public class TileEntityAirPump extends TileEntity
{
    public Double pressure;
    public float baseVolume;
    public int baseCapacity;
    public float finalCapacity;
    public float finalVolume;
    public float pressureMultiplier;
    public float volumeModifier;

    public float getCapacity()
    {
        return finalCapacity = baseCapacity * pressureMultiplier;
    }

    public float getVolume()
    {
        return finalVolume = baseVolume * volumeModifier;
    }

    public void checkPressure()
    {
        if (pressure != null) {
            if (pressure >= finalCapacity) {
                // Does action related to pressure overload
                this.worldObj.createExplosion(null, this.getPos().getX(), this.getPos().getY(), this.getPos().getZ(), 2f, false);
            }
        }
        else
        {
            System.out.println("Pressure is equal to null.");
        }
    }
}
