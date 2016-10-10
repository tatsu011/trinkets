package tatsu.trinkets.trinkets;

import baubles.api.IBauble;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.library.tinkering.PartMaterialType;
import slimeknights.tconstruct.library.tools.ToolCore;

import java.util.List;


/**
 * Created by Tatsu on 10/1/2016.
 */
public abstract class Trinket extends ToolCore implements IBauble {


    public Trinket(PartMaterialType... requiredComponents)
    {
        super(requiredComponents);
    }


    //Tinker stuff.
    @Override
    public boolean showDurabilityBar(ItemStack stack)
    {
        return false; //These trinkets don't break.
    }

    @Override
    public NBTTagCompound buildTag(List<Material> list) {
        return buildDefaultTag(list).get();

    }



    //Baubles Stuff
    @Override
    public void onWornTick(ItemStack itemStack, EntityLivingBase entityLivingBase) {

    }



    @Override
    public boolean canEquip(ItemStack itemStack, EntityLivingBase entityLivingBase) {
        return true;
    }

    @Override
    public boolean canUnequip(ItemStack itemStack, EntityLivingBase entityLivingBase) {
        return true;
    }

    @Override
    public float damagePotential() {
        return 0;
    }

    @Override
    public double attackSpeed() {
        return 0;
    }

}
