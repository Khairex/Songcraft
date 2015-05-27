package com.Khairex.songcraft.client;

import com.Khairex.songcraft.reference.Reference;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiTest extends GuiScreen
{

	int guiWidth = 265;
	int guiHeight = 400;

	GuiButton testButton;

	@Override
	public void drawScreen(int x, int y, float ticks)
	{
		int guiX = (width - guiWidth) / 2;
		int guiY = (width - guiHeight) / 2;
		GL11.glColor4f(1, 1, 1, 1);
		drawDefaultBackground();
		mc.renderEngine.bindTexture(new ResourceLocation(Reference.MOD_ID, "textures/gui/gui.png"));
		drawTexturedModalRect(guiX, 0,0,0,guiWidth,guiHeight);
		fontRendererObj.drawString("Test", guiX, guiY, 0x00CC00);
		super.drawScreen(x,y,ticks);
	}

	@Override
	public void initGui()
	{
		buttonList.clear();

		int guiX = (width - guiWidth) / 2;
		int guiY = (width - guiHeight) / 2;

		buttonList.add(testButton = new GuiButton(0, guiX + 100, guiY + 30, 34, 15, "Test2" ));
		super.initGui();
	}

	@Override
	protected void actionPerformed(GuiButton button)
	{
		switch(button.id)
		{
			case 0:
				button.displayString = "LOL0L";

				break;
		}
		super.actionPerformed(button);
	}
}
