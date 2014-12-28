package com.Upnorth1003.tec.block;

import com.Upnorth1003.tec.reference.Names;

public class BlockAcPump extends BlockTEC
{
    public BlockAcPump()
    {
        super();
        this.setBlockName(Names.Blocks.AC_PUMP);
        this.setHardness(3.5F);
    }

    @Override
    public boolean renderAsNormalBlock() {return true;}

}
