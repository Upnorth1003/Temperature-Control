package com.Upnorth1003.tec.init;

import com.Upnorth1003.tec.block.*;
import com.Upnorth1003.tec.reference.Names;
import com.Upnorth1003.tec.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockTEC largeAc = new BlockLargeAc();
    public static final BlockTEC smallAc = new BlockSmallAc();
    public static final BlockTEC acVent = new BlockAcVent();
    public static final BlockTEC acPump = new BlockAcPump();
    public static final BlockTEC acFan = new BlockAcFan();
    public static final BlockTEC largeAcController = new BlockLargeAcController();
    public static final BlockTEC valve = new BlockValve();
    public static final BlockTEC wall = new BlockWall();
    public static final BlockTEC coolantHolder = new BlockCoolantHolder();
    public static final BlockTEC lightTest = new BlockLightTest();

    public static void init()
    {
        GameRegistry.registerBlock(largeAc, Names.Blocks.LARGE_AC);
        GameRegistry.registerBlock(smallAc, Names.Blocks.SMALL_AC);
        GameRegistry.registerBlock(acVent, Names.Blocks.VENT);
        GameRegistry.registerBlock(acPump, Names.Blocks.AC_PUMP);
        GameRegistry.registerBlock(acFan, Names.Blocks.AC_FAN);
        GameRegistry.registerBlock(largeAcController, Names.Blocks.LAC_CONTROLLER);
        GameRegistry.registerBlock(valve, Names.Blocks.VALVE);
        GameRegistry.registerBlock(wall, Names.Blocks.WALL);
        GameRegistry.registerBlock(coolantHolder, Names.Blocks.COOLANT_HOLDER);
        GameRegistry.registerBlock(lightTest, Names.Blocks.LIGHT_TEST);
    }
}
