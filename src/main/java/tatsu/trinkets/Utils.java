package tatsu.trinkets;

import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;

/**
 * Created by Tatsu on 10/11/2016.
 */
public class Utils {


    private static Logger logger;

    public static final String RESOURCE = TiConTrinkets.MODID.toLowerCase(Locale.US);


    public static Logger getLogger()
    {
        if(logger == null)
            logger = LogManager.getFormatterLogger(TiConTrinkets.MODID);
        return logger;
    }


    public static String prefix(String name)
    {
        return String.format("%s.%s", RESOURCE, name);
    }

    public static ResourceLocation getResource(String res) {
        return new ResourceLocation(RESOURCE, res);
    }


}
