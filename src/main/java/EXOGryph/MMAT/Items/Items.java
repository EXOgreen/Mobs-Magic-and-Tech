package EXOGryph.MMAT.Items;

/**
 * Created by EXOgreenMC on 9/17/2014.
 */

import net.minecraft.item.Item;

public final class Items {

    public static Item GenericItem;
    public static Item Lightsaber;

    public static void init() {

        GenericItem = new ItemGeneric();
        Lightsaber = new Lightsaber();
    }
}