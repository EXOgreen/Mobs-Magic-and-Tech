package EXOGryph.MMAT.Items;

/**
 * Created by EXOgreenMC on 9/17/2014.
 */

import EXOGryph.MMAT.MMAT;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemGeneric extends Item {

    private String name = "GenericItem";

    public ItemGeneric(){

        setUnlocalizedName(MMAT.MODID+"_"+name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(CreativeTabs.tabMaterials);
    }

}
