package me.savikin.kris.common;

/**
 * Created by Mark on 26/06/2016.
 */

public class Reference
{
    //Essentials
    public static final String modid = "kris";
    public static final String name = "Kris";

    //Version Components
    public static final String major_version = "1";
    public static final String minor_version = "0";
    public static final String bugfix_version = "0";
    public static final String mod_state = "pre";

    // Proxies
    public static final String client = "me.savikin.kris.client.ClientProxy";
    public static final String server = "me.savikin.kris.common.CommonProxy";

    //Version Combination
    public static final String version = major_version + "." + minor_version + "." + bugfix_version + "-" + mod_state;
}
