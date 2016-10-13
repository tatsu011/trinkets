package tatsu.trinkets.trinkets;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
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


        //TinkerRegistry.registerTool(Ring); //Don't need to register twice.
    }

    @SideOnly(Side.CLIENT)
    public static void registerTrinketsClient()
    {

    }


}
