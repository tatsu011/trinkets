package tatsu.trinkets.proxy;

import net.minecraft.item.Item;
import slimeknights.tconstruct.common.*;
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
        SomeAssemblyRequired.registerParts();
        //Register Materials for the parts- as well as the patterns.
        AssembledTrinkets.registerTrinkets();
        //Hey! don't forget the tool station!

    }

    @Override
    public void preInit()
    {}

    @Override
    public void init()
    {

    }


    public void registerPart(TrinketPart part)
    {}

    public void registerTrinket(Trinket trinket)
    {}

}
