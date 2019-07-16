package com.gildedgames.aether.client.gui.dialog;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.widget.button.Button;

public abstract class GuiAbstractButton extends Button
{

	protected boolean hasInit;

	public GuiAbstractButton(final int x, final int y, final int width, final int height, IPressable callback)
	{
		super(x, y, width, height, "", callback);
	}

	@Override
	public final void render(final int mouseX, final int mouseY, final float partialTicks)
	{
		final FontRenderer fontRenderer = Minecraft.getInstance().fontRenderer;

		if (!this.hasInit)
		{
			this.init(fontRenderer);
			this.hasInit = true;
		}

		if (this.visible)
		{
			this.draw(fontRenderer);
		}
	}

	public void markForReInit()
	{
		this.hasInit = false;
	}

	public abstract void init(FontRenderer fontRenderer);

	public abstract void draw(FontRenderer fontRenderer);

}
