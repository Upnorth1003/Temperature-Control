package com.Upnorth1003.tec.init;

import com.Upnorth1003.tec.item.*;
import com.Upnorth1003.tec.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemTEC acCoolant = new ItemACCoolant();
    public static final ItemTEC iceWater = new ItemIceWater();
    public static final ItemTEC pipe = new ItemPipe();
    public static final ItemTEC waterProofPipe = new ItemWaterProofPipe();


    public static void init()
    {
        GameRegistry.registerItem(acCoolant, Names.Items.AC_COOLANT);
        GameRegistry.registerItem(iceWater, Names.Items.ICE_WATER);
        GameRegistry.registerItem(pipe, Names.Items.PIPE);
        GameRegistry.registerItem(waterProofPipe, Names.Items.W_P_PIPE);

    }
}
