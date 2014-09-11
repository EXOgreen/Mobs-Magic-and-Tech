package MMAT.mmat.EXOGryph;

/**
 * Created by Benjamin on 9/11/2014.
 */

import net.minecraft.init.Blocks;
        import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = MMAT.MODID, version = MMAT.VERSION)
public class MMAT {

    public static final String MODID = "Magic Mobs and Tech";
    public static final String VERSION = "1.0.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+ Blocks.dirt.getUnlocalizedName());
    }
}