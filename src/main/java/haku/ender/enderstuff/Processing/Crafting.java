package haku.ender.enderstuff.Processing;

import cpw.mods.fml.common.registry.GameRegistry;
import haku.ender.enderstuff.items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Crafting {

    public static void init(){

        GameRegistry.addRecipe(new ItemStack(ModItems.endercookie, 8), new Object[]{"wew",'w', Items.wheat,'e',Items.ender_pearl});
        GameRegistry.addRecipe(new ItemStack(Items.ender_pearl), new Object[]{"eee","e e","eee", 'e', ModItems.enderenergy});
        GameRegistry.addRecipe(new ItemStack(ModItems.enderstaff), new Object[]{"psp", "ebe", "obo", 'p', Items.ender_pearl, 's', Items.nether_star, 'e', ModItems.enderenergy, 'b', Items.blaze_rod, 'o', Blocks.obsidian});




    }
}