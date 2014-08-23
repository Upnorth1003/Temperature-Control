package com.Upnorth1003.tec.creativetab;

import com.Upnorth1003.tec.init.ModItems;
import com.Upnorth1003.tec.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;

public class CreativeTab
{
    public static final CreativeTabs TEC_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem() {
            return ModItems.iceWater;
        }

    };
}
