package haku.ender.enderstuff.items;

import cpw.mods.fml.common.registry.GameRegistry;
import haku.ender.enderstuff.CreativeTabs.CreativeTabES;
import haku.ender.enderstuff.lib.Constants;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class enderStaff extends Item {

    private String name = "enderstaff";

    public enderStaff(){

        setUnlocalizedName(Constants.MODID + "_" + name);
        GameRegistry.registerItem(this, name);
        setMaxStackSize(1);
        setFull3D();
        setCreativeTab(CreativeTabES.tabEnderStuff);
        setMaxDamage(100);
        setTextureName(Constants.MODID + ":" + name);
    }




    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add("Bend the void to your purpose");
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
        if(!player.isSneaking()){

            world.setWorldTime(18000);
            stack.damageItem(1, player);

        }
        if(player.isSneaking()){

            world.setWorldTime(8000);
            stack.damageItem(1, player);

        }
        return false;
    }
}