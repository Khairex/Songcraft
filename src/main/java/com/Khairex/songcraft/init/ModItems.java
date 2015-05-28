package com.Khairex.songcraft.init;

import com.Khairex.songcraft.item.ElectricGuitar;
import com.Khairex.songcraft.item.ItemBase;
import com.Khairex.songcraft.item.SongPaper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
	public static final ItemBase SongPaper = new SongPaper();
	public static final ItemBase ElectricGuitar = new ElectricGuitar();


	public static void init()
	{
		GameRegistry.registerItem(SongPaper, "SongPaper");
		GameRegistry.registerItem(ElectricGuitar, "ElectricGuitar");

	}


}
