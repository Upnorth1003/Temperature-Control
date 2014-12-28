package com.Upnorth1003.tec.block;

import com.Upnorth1003.tec.reference.Names;
import net.minecraft.block.material.Material;

public class BlockLightTest extends BlockTEC
{
    public BlockLightTest()
    {
        super(Material.glass);
        this.setBlockName(Names.Blocks.LIGHT_TEST);
        this.setHardness(4F);
        this.setStepSound(soundTypeGlass);
        this.setResistance(7F);
        this.setLightLevel(0.9F);
        this.setBlockTextureName("lightTest.png");
    }


}
