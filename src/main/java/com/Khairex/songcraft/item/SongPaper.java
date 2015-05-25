package com.Khairex.songcraft.item;

import net.minecraft.creativetab.CreativeTabs;

public class SongPaper extends ItemBase
{
	public SongPaper()
	{
		super();
		maxStackSize = 1;
		this.setUnlocalizedName("SongPaper");
		setCreativeTab(CreativeTabs.tabRedstone);
	}

}
