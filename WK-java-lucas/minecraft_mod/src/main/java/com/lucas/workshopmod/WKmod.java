package com.lucas.workshopmod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

@Mod(modid = WKmod.MODID, name = WKmod.NAME, version = WKmod.VERSION)
public class WKmod
{
    public static final String MODID = "com/lucas/workshopmod";
    public static final String NAME = "Example Mod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    public static void setItemName(Item item, String name) {
        item.setRegistryName(WKmod.MODID, name).setUnlocalizedName(WKmod.MODID + "." + name);
        ITEMS.add(item);
    }

    public static void setItemBlockName(Item item, Block block) {
        item.setRegistryName(block.getRegistryName());
        ITEMS.add(item);
    }

    @SideOnly(Side.CLIENT) //Forge annotation for Side managing
    @SubscribeEvent //Forge annotation to subscribe to an event
    protected static void registerItemModels(ModelRegistryEvent e) {
        ITEMS.forEach(item -> registerModel(item, 0)); //A simple forEach to call the method below
    }

    @SideOnly(Side.CLIENT)
    protected static void registerModel(Item item, int metadata) {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
