package tatsu.trinkets.proxy;

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
    {}

    @Override
    public void init()
    {

        SomeAssemblyRequired.registerParts();
        //Register Materials for the parts- as well as the patterns.
        AssembledTrinkets.registerTrinkets();
        //Hey! don't forget the tool station!

    }


    public void registerPart(TrinketPart part)
    {}

    public void registerTrinket(Trinket trinket)
    {}

}
