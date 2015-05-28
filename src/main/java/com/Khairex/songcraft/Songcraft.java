package com.Khairex.songcraft;

import com.Khairex.songcraft.client.handler.KeyInputEventHandler;
import com.Khairex.songcraft.handler.ConfigurationHandler;
import com.Khairex.songcraft.init.ModBlocks;
import com.Khairex.songcraft.init.ModItems;
import com.Khairex.songcraft.init.Recipes;
import com.Khairex.songcraft.proxy.IProxy;
import com.Khairex.songcraft.reference.Reference;
import com.Khairex.songcraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Songcraft
{
	@Mod.Instance("songcraft")
	public static Songcraft instance;


	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

		proxy.registerKeyBindings();

		ModItems.init();
		ModBlocks.init();

		LogHelper.info("Pre Initialization Complete!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
		Recipes.init();

		LogHelper.info("Initialization Complete!");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

		LogHelper.info("Post Initialization Complete!");
	}
}
