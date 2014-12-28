package com.Upnorth1003.tec.block;

import com.Upnorth1003.tec.reference.Names;
import net.minecraft.block.material.Material;

public class BlockAcFan extends BlockTEC
{
    public BlockAcFan()
    {
        super(Material.glass);
        this.setHardness(3.5F);
        this.setBlockName(Names.Blocks.AC_FAN);
    }

    @Override
    public boolean renderAsNormalBlock() {return false;}

    @Override
    public boolean isOpaqueCube() {return true;}
}
