package com.Khairex.songcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{

	public static void init()
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.SongPaper), "   ", "ppp", "   ", 'p', new ItemStack(Items.paper)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.SongPaper), new ItemStack(Items.paper), new ItemStack(Items.dye)));
	}
}
