package haku.ender.enderstuff.oreGen;

import cpw.mods.fml.common.registry.GameRegistry;

public class Generator {

    public static void init(){

        GameRegistry.registerWorldGenerator(new EnderGen(), 0);
    }
}
