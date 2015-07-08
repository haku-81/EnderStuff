package haku.ender.enderstuff.items;

import net.minecraft.item.Item;

public class ModItems{

    public static Item enderenergy;
    public static Item endercookie;
    public static Item enderstaff;
    public static Item voidbag;



    public static void init(){
        enderenergy = new enderEnergy();
        endercookie = new enderCookie(20, 20f, true);
        enderstaff = new enderStaff();
        voidbag = new voidBag();



    }


}