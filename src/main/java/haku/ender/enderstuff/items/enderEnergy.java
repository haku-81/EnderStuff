package haku.ender.enderstuff.items;

import cpw.mods.fml.common.registry.GameRegistry;
import haku.ender.enderstuff.CreativeTabs.CreativeTabES;
import haku.ender.enderstuff.lib.Constants;
import net.minecraft.item.Item;

public class enderEnergy extends Item {

        private String name = "enderenergy";

    public enderEnergy(){

        setUnlocalizedName(Constants.MODID + "_" + name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(CreativeTabES.tabEnderStuff);
        setTextureName(Constants.MODID + ":" + name);
    }
}
