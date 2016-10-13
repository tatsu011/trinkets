package tatsu.trinkets.proxy;

import net.minecraftforge.fml.common.registry.GameRegistry;
import slimeknights.tconstruct.library.TinkerRegistry;
import tatsu.trinkets.parts.SomeAssemblyRequired;
import tatsu.trinkets.parts.TrinketPart;
import tatsu.trinkets.trinkets.AssembledTrinkets;
import tatsu.trinkets.trinkets.Trinket;

/**
 * Created by Tatsu on 10/1/2016.
 */
public class Proxy extends slimeknights.tconstruct.common.ClientProxy { //The fact that I have to do this is dumb -.-

    @Override
    public void postInit()
    {


    }

    @Override
    public void preInit()
    {
        SomeAssemblyRequired.registerParts();
        //Register Materials for the parts- as well as the patterns.
        AssembledTrinkets.registerTrinkets();
        //Hey! don't forget the tool station!

    }

    @Override
    public void init()
    {



    }


    public void registerPart(TrinketPart part)
    {
        GameRegistry.register(part);
        TinkerRegistry.registerToolPart(part);

    }

    public void registerTrinket(Trinket trinket)
    {
        GameRegistry.register(trinket);
        TinkerRegistry.registerTool(trinket);

    }

}
