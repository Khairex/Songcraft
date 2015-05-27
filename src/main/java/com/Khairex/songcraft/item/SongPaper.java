package com.Khairex.songcraft.item;

import com.Khairex.songcraft.client.GuiTest;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SongPaper extends ItemBase
{
	public SongPaper()
	{
		super();
		maxStackSize = 1;
		this.setUnlocalizedName("SongPaper");
		setCreativeTab(CreativeTabs.tabRedstone);
	}


	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
	{
		if(!world.isRemote)
		{
			//world.playSoundEffect(player.posX,player.posY,player.posZ, "songcraft:sound", 1.0f, 1.0f);
			world.playSoundAtEntity(player, "songcraft:sound", 1, 1);
			//Minecraft.getMinecraft().displayGuiScreen(new GuiTest());
		}
		return item;
	}
}
