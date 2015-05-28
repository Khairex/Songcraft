package com.Khairex.songcraft.block;


import com.Khairex.songcraft.creativetab.CreativeTabSongcraft;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockPiano extends BlockBase
{
    public BlockPiano()
    {
        super();
        this.setBlockName("piano");

    }

    //@Override
    //public int tickRate(World p_149738_1_)
    //{
    //    return 1;
    //}
//
    //@Override
    //public void onBlockAdded(World p_149726_1_, int p_149726_2_, int p_149726_3_, int p_149726_4_)
    //{
    //    if (p_149726_1_.isBlockIndirectlyGettingPowered(p_149726_2_, p_149726_3_, p_149726_4_))
    //    {
    //        p_149726_1_.scheduleBlockUpdate(p_149726_2_, p_149726_3_, p_149726_4_, this, 0);
    //    }
    //}
//
    //@Override
    //public void onNeighborBlockChange(World world, int i, int j, int k, Block b) {
    //    if (world.isBlockIndirectlyGettingPowered(i, j, k) || world.isBlockIndirectlyGettingPowered(i, j + 1, k))
    //    {
    //        world.scheduleBlockUpdate(i, j, k, this, 1);
    //    }
//
    //}
//
    //@Override
    //public void updateTick(World p_149726_1_, int p_149726_2_, int p_149726_3_, int p_149726_4_, Random p_149674_5_)
    //{
    //    if (p_149726_1_.isBlockIndirectlyGettingPowered(p_149726_2_, p_149726_3_, p_149726_4_))
    //    {
    //        this.setLightLevel(1.0f);
    //    }
    //    else
    //    {
    //        this.setLightLevel(0.0f);
    //    }
    //}
}