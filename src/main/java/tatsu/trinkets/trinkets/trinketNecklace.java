package tatsu.trinkets.trinkets;

import baubles.api.BaubleType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import slimeknights.tconstruct.library.materials.Material;

import java.util.List;

/**
 * Created by Tatsu on 10/2/2016.
 */
public class trinketNecklace extends Trinket {

    @Override
    public BaubleType getBaubleType(ItemStack itemStack) {
        return BaubleType.AMULET;
    }

    @Override
    public void onEquipped(ItemStack itemStack, EntityLivingBase entityLivingBase) {

    }

    @Override
    public void onUnequipped(ItemStack itemStack, EntityLivingBase entityLivingBase) {

    }

    @Override
    public NBTTagCompound buildTag(List<Material> list) {
        return null;
    }
}
