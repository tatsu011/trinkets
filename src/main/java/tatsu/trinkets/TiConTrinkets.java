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
import tatsu.trinkets.proxy.Proxy;


import static tatsu.trinkets.TiConTrinkets.*;

/**
 * Created by Tatsu on 9/30/2016.
 */

@Mod(modid = MODID, name = MODNAME, version = VERSION)
public class TiConTrinkets {


    public static final String MODID = "TiConTrinkets";
    public static final String MODNAME = "Tinker's Trinkets";
    public static final String VERSION = "1.0";
    public static final String DEPENDANCIES = "required-after:@tconstruct[1.10.2-2.5.3,)";

    @Mod.Instance
    public static TiConTrinkets INSTANCE;

    public CreativeTab Tab;


    @SidedProxy(serverSide = "tatsu.trinkets.proxy.Proxy",clientSide = "tatsu.trinkets.proxy.ClientProxy")
    static Proxy proxy;

    @Mod.EventHandler
    void init(FMLInitializationEvent event)
    {
        //stuff.
        System.out.println("Looking for baubles....");
        if(Loader.isModLoaded(Baubles.MODID))
            System.out.print("Baubles: We be jingling! \n");
        System.out.println("Looking for TiCon");
        if(Loader.isModLoaded(TConstruct.modID))
            System.out.print("TConstruct: We be jangling! \n");

        proxy.Init();
    }

    @Mod.EventHandler
    void preInit(FMLPreInitializationEvent event)
    {
        //more stuff.
        proxy.PreInit();
    }

    @Mod.EventHandler
    void postInit(FMLPostInitializationEvent event)
    {
        //even more stuff!
        proxy.PostInit();
    }


}
