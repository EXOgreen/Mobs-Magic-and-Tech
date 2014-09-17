package EXOGryph.MMAT;

/**
 * Created by EXOgreenMC on 9/11/2014.
 */

        import cpw.mods.fml.common.Mod;
        import cpw.mods.fml.common.Mod.EventHandler;
        import cpw.mods.fml.common.Mod.Instance;
        import cpw.mods.fml.common.SidedProxy;
        import cpw.mods.fml.common.event.FMLInitializationEvent;
        import cpw.mods.fml.common.event.FMLPostInitializationEvent;
        import cpw.mods.fml.common.event.FMLPreInitializationEvent;
        import net.minecraft.init.Blocks;

@Mod(modid = MMAT.MODID, version = MMAT.VERSION, name=MMAT.NAME)
public class MMAT {

    public static final String MODID = "MMAT";
    public static final String VERSION = "1.0.0";
    public static final String NAME = "Mobs Magic and Tech";

    @Instance("MMAT")
    public static MMAT instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="EXOGryph.MMAT.client.ClientProxy", serverSide="EXOGryph.MMAT.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Stub Method
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // Stub Method
    }
}