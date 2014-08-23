package com.Upnorth1003.tec.handler;

import com.Upnorth1003.tec.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        //Create the configuration object from the given configuration file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadCongiguration();
        }
    }



    @SubscribeEvent
    public void onConfigureationChangedEvent (ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadCongiguration();
        }
    }

    private static void loadCongiguration()
    {
        testValue = configuration.getBoolean("First Config", Configuration.CATEGORY_GENERAL, false, "Example");
        testValue = configuration.getBoolean("Second Config", Configuration.CATEGORY_GENERAL, true, "What Ever I Want");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
