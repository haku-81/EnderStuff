package haku.ender.enderstuff;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import haku.ender.enderstuff.Processing.Crafting;
import haku.ender.enderstuff.blocks.ModBlocks;
import haku.ender.enderstuff.items.ModItems;
import haku.ender.enderstuff.lib.Constants;
import haku.ender.enderstuff.oreGen.Generator;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class EnderStuff {

    @Mod.Instance(Constants.MODID)
    public static EnderStuff instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();
        ModItems.init();
        Generator.init();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        Crafting.init();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {


    }
}