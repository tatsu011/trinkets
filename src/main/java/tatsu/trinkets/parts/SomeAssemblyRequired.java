package tatsu.trinkets.parts;

import slimeknights.tconstruct.library.tools.IToolPart;

/**
 * Created by Tatsu on 10/7/2016.
 */
public class SomeAssemblyRequired {

    public static TrinketPart partAmulet;
    public static TrinketPart partBand;
    public static TrinketPart partBelt;
    public static TrinketPart partBuckle;
    public static TrinketPart partSocket;

    public static void registerParts()
    {
        partAmulet = new partAmulet();

        partBand = new partBand();
        partBelt = new partBelt();
        partBuckle = new partBuckle();
        partSocket = new partSocket();
    }


}
