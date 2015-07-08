package haku.ender.enderstuff.CreativeTabs;

import haku.ender.enderstuff.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabES {

    public static final CreativeTabs tabEnderStuff = new CreativeTabs(Constants.MODID) {
        @Override
        public Item getTabIconItem() {
            return Items.ender_pearl;
        }


        @Override
        public String getTranslatedTabLabel(){

            return "Enderstuff";


        }
    };



}