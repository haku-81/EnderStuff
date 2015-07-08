package haku.ender.enderstuff.items;

import cpw.mods.fml.common.registry.GameRegistry;
import haku.ender.enderstuff.CreativeTabs.CreativeTabES;
import haku.ender.enderstuff.lib.Constants;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

public class enderCookie extends ItemFood {

    public String name = "endercookie";
    public enderCookie(int heal, float saturation, boolean wolfMeat){
        super(heal, saturation, wolfMeat);
        setUnlocalizedName(Constants.MODID + "_" + name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(CreativeTabES.tabEnderStuff);
        setTextureName(Constants.MODID + ":" + name);
    }

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add("Surprisingly Healthy. Who knew?");
    }

    @Override
    public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) {
       super.onEaten(stack, world, player);
        player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 8000, 100));
        player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 50, 80));
        return stack;
    }
}