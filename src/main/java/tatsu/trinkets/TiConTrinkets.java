package tatsu.trinkets;

import baubles.common.Baubles;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import slimeknights.mantle.client.CreativeTab;
import slimeknights.tconstruct.TConstruct;
import slimeknights.tconstruct.common.CommonProxy;
import tatsu.trinkets.proxy.Proxy;


import static tatsu.trinkets.TiConTrinkets.*;

/**
 * Created by Tatsu on 9/30/2016.
 */

@Mod(modid = MODID, name = MODNAME, version = VERSION, dependencies = DEPENDANCIES)
public class TiConTrinkets {


    public static final String MODID = "ticontrinkets";
    public static final String MODNAME = "Tinker's Trinkets";
    public static final String VERSION = "1.0";
    public static final String DEPENDANCIES = "after:tconstruct";

    @Mod.Instance
    public static TiConTrinkets INSTANCE;

    public CreativeTab Tab;


    @SidedProxy(serverSide = "tatsu.trinkets.proxy.Proxy",clientSide = "tatsu.trinkets.proxy.ClientProxy")
    public static Proxy proxy;

    @Mod.EventHandler
    void init(FMLInitializationEvent event)
    {
        //stuff.
        Utils.getLogger().info("Looking for Baubles...");
        if(Loader.isModLoaded(Baubles.MODID))
            Utils.getLogger().info("Baubles: We be jingling! \n");
        Utils.getLogger().info("Looking for TiCon");
        if(Loader.isModLoaded(TConstruct.modID))
            Utils.getLogger().info("TConstruct: We be jangling! \n");

        proxy.init();
    }

    @Mod.EventHandler
    void preInit(FMLPreInitializationEvent event)
    {
        //more stuff.
        proxy.preInit();
    }

    @Mod.EventHandler
    void postInit(FMLPostInitializationEvent event)
    {
        //even more stuff!
        proxy.postInit();
    }


}
