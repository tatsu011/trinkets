package tatsu.trinkets.trinkets;

import baubles.api.BaubleType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.library.tinkering.PartMaterialType;
import tatsu.trinkets.parts.SomeAssemblyRequired;

import java.util.List;

/**
 * Created by Tatsu on 10/2/2016.
 */
public class trinketBelt extends Trinket {


    public trinketBelt()
    {
        super(  PartMaterialType.handle(SomeAssemblyRequired.partBelt),
                PartMaterialType.head(SomeAssemblyRequired.partBuckle));
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemStack) {
        return BaubleType.BELT;
    }

    @Override
    public void onEquipped(ItemStack itemStack, EntityLivingBase entityLivingBase) {

    }

    @Override
    public void onUnequipped(ItemStack itemStack, EntityLivingBase entityLivingBase) {

    }
}
