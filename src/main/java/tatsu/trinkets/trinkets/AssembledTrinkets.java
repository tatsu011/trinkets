package tatsu.trinkets.trinkets;

import slimeknights.tconstruct.library.TinkerRegistry;

/**
 * Created by Tatsu on 10/8/2016.
 */
public class AssembledTrinkets {

    public static Trinket Belt;
    public static Trinket Necklace;
    public static Trinket Ring;

    public static void registerTrinkets()
    {
        //Belt = new trinketBelt();
        //Necklace = new trinketNecklace();
        Ring = new trinketRing();

        TinkerRegistry.registerTool(Ring);
    }



}
