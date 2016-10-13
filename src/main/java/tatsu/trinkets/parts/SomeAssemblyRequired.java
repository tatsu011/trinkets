package tatsu.trinkets.parts;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import slimeknights.tconstruct.library.TinkerRegistry;
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
    //public static TrinketPart partThread;

    public static void registerParts()
    {
        partAmulet = new partAmulet();
        partBand = new partBand();
        partBelt = new partBelt();
        partBuckle = new partBuckle();
        partSocket = new partSocket();
        //partThread = new partThread();

        //Register them to the Forge Registry

        GameRegistry.register(partBand);
        GameRegistry.register(partSocket);

        //Register them to the Tinker Registry

        TinkerRegistry.registerToolPart(partBand);
        TinkerRegistry.registerToolPart(partSocket);

        //TinkerRegistry.registerToolPart(partAmulet);
        //TinkerRegistry.registerToolPart(partThread);

        //TinkerRegistry.registerToolPart(partBelt);
        //TinkerRegistry.registerToolPart(partBuckle);

        //TODO: update to include new baubles things.
        //TODO: also setup the other bits of art.

    }

    @SideOnly(Side.CLIENT)
    public static void registerPartsClient()
    {

    }
}
