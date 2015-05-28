package com.Khairex.songcraft.item;

import com.Khairex.songcraft.client.GuiTest;
import com.Khairex.songcraft.utility.NBTHelper;
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
	}


	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
	{
		if(!world.isRemote)
		{
			world.playSoundAtEntity(player, "songcraft:sound", 1, 1);
			Minecraft.getMinecraft().displayGuiScreen(new GuiTest());


			if(swap)
			{
				//NBTHelper.setBoolean(itemStack, "GUI_OPEN", true);
				NBTHelper.setString(itemStack, "data", "STORED STRING NBT DATA THAT HAS BEEN RECIEVED BY RIGHT CLICKING THIS ITEM!!!");
				//itemStack.setTagInfo("data", new NBTTagString(NBTHelper.getString(itemStack, "data")));
				itemStack.setStackDisplayName(NBTHelper.getString(itemStack, "data"));
				//entityPlayer.openGui(Songcraft.instance, 0, entityPlayer.worldObj, (int) entityPlayer.posX, (int) entityPlayer.posY, (int) entityPlayer.posZ);
			}
			else
			{
				itemStack.setStackDisplayName("Music Sheet");
			}
			swap = !swap;

		}
		return itemStack;
	}


	protected boolean swap = true;
}
