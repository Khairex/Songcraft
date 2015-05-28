package com.Khairex.songcraft.creativetab;


import com.Khairex.songcraft.init.ModItems;
import com.Khairex.songcraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabSongcraft
{
    public static final CreativeTabs SONG_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.SongPaper;
        }
    };
}
