package tatsu.trinkets.parts;

import slimeknights.tconstruct.library.tools.ToolPart;
import tatsu.trinkets.TiConTrinkets;

import static tatsu.trinkets.TiConTrinkets.proxy;

/**
 * Created by Tatsu on 10/7/2016.
 */
public abstract class TrinketPart extends ToolPart {

    public TrinketPart(int cost) {
        super(cost);
    }

    public void setName(String name)
    {
        setRegistryName(TiConTrinkets.MODID + ":" + name);
        //proxy.registerItemRenderer(this,0,TiConTrinkets.MODID + ":parts/" + name); //Boni: no.
        proxy.registerPart(this);
    }
}
