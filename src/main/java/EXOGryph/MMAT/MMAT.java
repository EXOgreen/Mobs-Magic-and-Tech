package EXOGryph.MMAT;

/**
 * Created by EXOgreenMC on 9/11/2014.
 */

        import EXOGryph.MMAT.Items.ItemGeneric;
        import EXOGryph.MMAT.Items.Items;
        import cpw.mods.fml.common.Mod;
        import cpw.mods.fml.common.Mod.Instance;
        import cpw.mods.fml.common.SidedProxy;
        import cpw.mods.fml.common.event.FMLInitializationEvent;
        import cpw.mods.fml.common.event.FMLPostInitializationEvent;
        import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MMAT.MODID, version = MMAT.VERSION, name=MMAT.NAME)
public class MMAT {

    public static final String MODID = "mmat";
    public static final String VERSION = "1.0.0";
    public static final String NAME = "Mobs Magic and Tech";

    @Instance("MMAT")
    public static MMAT instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="EXOGryph.MMAT.client.ClientProxy", serverSide="EXOGryph.MMAT.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        Items.init();
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.registerRenders();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // Stub Method
    }
}