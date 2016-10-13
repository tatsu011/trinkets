package tatsu.trinkets;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Tatsu on 10/11/2016.
 */
public class Utils {


    private static Logger logger;


    public static Logger getLogger()
    {
        if(logger == null)
            logger = LogManager.getFormatterLogger(TiConTrinkets.MODID);
        return logger;
    }


}
