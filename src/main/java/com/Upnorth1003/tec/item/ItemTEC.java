package com.Upnorth1003.tec.item;

import com.Upnorth1003.tec.creativetab.CreativeTab;
import com.Upnorth1003.tec.reference.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemTEC extends Item
{
    public ItemTEC()
    {
        super();
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTab.TEC_TAB);

    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedname(super.getUnlocalizedName()));
        //  item.tutorial:mapleLeaf.name
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedname(super.getUnlocalizedName()));
        //  item.tutorial:mapleLeaf.name
    }

    protected String getUnwrappedUnlocalizedname (String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
