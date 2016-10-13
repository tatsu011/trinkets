package tatsu.trinkets.trinkets;

import baubles.api.BaubleType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import slimeknights.tconstruct.library.tinkering.PartMaterialType;
import tatsu.trinkets.parts.SomeAssemblyRequired;

/**
 * Created by Tatsu on 10/1/2016.
 */
public class trinketRing extends Trinket {

    public trinketRing()
    {
        super(PartMaterialType.handle(SomeAssemblyRequired.partBand),
                PartMaterialType.extra(SomeAssemblyRequired.partSocket));
        setName("ring");
    }



    @Override
    public BaubleType getBaubleType(ItemStack itemStack) {
        return BaubleType.RING;
    }

    @Override
    public void onEquipped(ItemStack itemStack, EntityLivingBase entityLivingBase) {

    }

    @Override
    public void onUnequipped(ItemStack itemStack, EntityLivingBase entityLivingBase) {

    }
}
