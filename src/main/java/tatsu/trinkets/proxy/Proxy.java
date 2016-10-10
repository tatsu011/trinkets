package tatsu.trinkets.proxy;

import tatsu.trinkets.trinkets.AssembledTrinkets;

/**
 * Created by Tatsu on 10/1/2016.
 */
public class Proxy {

    public void PreInit()
    {

    }

    public void Init()
    {

    }

    public void PostInit()
    {
        AssembledTrinkets.registerTrinkets();
    }

}
