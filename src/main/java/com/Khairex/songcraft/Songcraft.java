package com.Khairex.songcraft;

import com.Khairex.songcraft.init.ModBlocks;
import com.Khairex.songcraft.init.ModItems;
import com.Khairex.songcraft.init.Recipes;
import com.Khairex.songcraft.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Songcraft
{
	@Mod.Instance("songcraft")
	public static Songcraft instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModBlocks.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		Recipes.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
