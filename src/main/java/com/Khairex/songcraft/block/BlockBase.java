package com.Khairex.songcraft.block;

import com.Khairex.songcraft.creativetab.CreativeTabSongcraft;
import com.Khairex.songcraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockBase extends Block
{
    public BlockBase(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabSongcraft.SONG_TAB);
    }

    public BlockBase()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedNamed(super.getUnlocalizedName()));
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedNamed(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedNamed(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
