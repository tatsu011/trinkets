package tatsu.trinkets.proxy;

import tatsu.trinkets.parts.TrinketPart;
import tatsu.trinkets.trinkets.Trinket;

/**
 * Created by Tatsu on 10/1/2016.
 */
public class ClientProxy extends Proxy{

    @Override
    public void registerPart(TrinketPart part)
    {
        registerPartModel(part);
    }

    @Override
    public void registerTrinket(Trinket trinket)
    {
        registerToolModel(trinket);
    }

}
