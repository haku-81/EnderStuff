package haku.ender.enderstuff.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import haku.ender.enderstuff.CreativeTabs.CreativeTabES;
import haku.ender.enderstuff.items.ModItems;
import haku.ender.enderstuff.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class EnderOre extends Block {
    public String name = "enderOre";

    public EnderOre(){

        super(Material.rock);
        this.setBlockName(Constants.MODID + "_" + name);
        GameRegistry.registerBlock(this,name);
        setBlockTextureName(Constants.MODID + ":" + name);
        setCreativeTab(CreativeTabES.tabEnderStuff);
        setHardness(3);
        setHarvestLevel("pickaxe", 3);
    }
        @Override
    public Item getItemDropped(int metadata, Random rand, int fortune){
            return ModItems.enderenergy;
    }
    @Override
    public int quantityDropped(Random rand){
        return 5 + rand.nextInt(10);
    }
    @Override
    public boolean canSilkHarvest(){
        return false;
    }
}