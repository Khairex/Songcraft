package com.Khairex.songcraft.init;

import com.Khairex.songcraft.block.BlockBase;
import com.Khairex.songcraft.block.BlockPiano;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{

	public static final BlockBase piano = new BlockPiano();

	public static void init()
	{
		GameRegistry.registerBlock(piano, "piano");
	}
}
