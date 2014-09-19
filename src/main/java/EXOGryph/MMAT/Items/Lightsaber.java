package EXOGryph.MMAT.Items;

/**
 * Created by EGOgreenMC on 9/17/2014.
 */

import EXOGryph.MMAT.MMAT;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Lightsaber extends Item {

    private String name = "lightsaber";

    public Lightsaber(){

        setUnlocalizedName(MMAT.MODID+"_"+name);
        setTextureName(MMAT.MODID + ":" + name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(CreativeTabs.tabCombat);
    }

}
