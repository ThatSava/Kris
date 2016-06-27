package me.savikin.kris.common.blocks.te;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

/**
 * Created by Mark on 26/06/2016.
 */

public class TileEntityAirPump extends TileEntity implements ITickable
{
    public Double pressure;
    public float baseVolume = 2;
    public int baseCapacity = 2;
    public float finalCapacity;
    public float finalVolume;
    public float pressureMultiplier = 1;
    public float volumeModifier = 1;

    public float getCapacity()
    {
        finalCapacity = baseCapacity * pressureMultiplier;
        System.out.println(finalCapacity);
        return finalCapacity;
    }

    public float checkCapacity()
    {
        return finalCapacity;
    }

    public float checkVolume()
    {
        return finalVolume;
    }

    public float getVolume()
    {
        finalVolume = baseVolume * volumeModifier;
        System.out.println(finalVolume);
        return finalVolume;
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


    @Override
    public void update()
    {
        checkCapacity();
        checkVolume();
    }
}
