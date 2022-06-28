package item;

import com.lucas.workshopmod.WKmod;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;


public class ModItems {
    public static final ArrayList<Item> ITEMS;

    public static void setItemName(Item item, String name) {
        item.setRegistryName(WKmod.MODID, name).setUnlocalizedName(WKmod.MODID + "." + name);
        ITEMS.add(item);
    }

    public static void setItemBlockName(Item item, Block block) {
        item.setRegistryName(block.getRegistryName());
        ITEMS.add(item);
    }
}
