package tatsu.trinkets.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import slimeknights.tconstruct.TConstruct;
import slimeknights.tconstruct.library.Util;
import slimeknights.tconstruct.library.client.model.MaterialModelLoader;
import slimeknights.tconstruct.tools.ToolClientProxy;
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

    }

}
