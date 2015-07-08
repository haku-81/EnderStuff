package haku.ender.enderstuff.items;

import cpw.mods.fml.common.registry.GameRegistry;
import haku.ender.enderstuff.CreativeTabs.CreativeTabES;
import haku.ender.enderstuff.lib.Constants;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class voidBag extends Item{

    private String name = "voidbag";

    public voidBag(){

        setUnlocalizedName(Constants.MODID + "_" + name);
        GameRegistry.registerItem(this, name);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabES.tabEnderStuff);
        //setTextureName(Constants.MODID + ":" + name);
    }



}