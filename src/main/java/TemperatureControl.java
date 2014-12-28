import com.Upnorth1003.tec.client.handler.KeyInputEventHandler;
import com.Upnorth1003.tec.handler.ConfigurationHandler;
import com.Upnorth1003.tec.init.ModBlocks;
import com.Upnorth1003.tec.init.ModItems;
import com.Upnorth1003.tec.init.Recipes;
import com.Upnorth1003.tec.proxy.CommonProxy;
import com.Upnorth1003.tec.proxy.IProxy;
import com.Upnorth1003.tec.reference.Reference;
import com.Upnorth1003.tec.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class TemperatureControl
{
    @Mod.Instance(Reference.MOD_ID)
    public static TemperatureControl instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());


        //proxy.registerKeyBindings();
        proxy.registerRenderInformation();

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete.");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();

        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

        LogHelper.info("Initialization Complete.");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete.");
    }
}
