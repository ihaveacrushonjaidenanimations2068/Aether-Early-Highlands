package com.gildedgames.orbis.client.player.godmode.selection_types;

import com.gildedgames.aether.common.AetherCore;
import com.gildedgames.orbis.client.gui.util.GuiTexture;
import com.gildedgames.orbis.client.util.rect.Dim2D;
import net.minecraft.util.ResourceLocation;

public class SelectionTypeClientCylinder implements ISelectionTypeClient
{
	private static final ResourceLocation TEXTURE = AetherCore.getResource("orbis/godmode/shape_icons/cylinder_icon.png");

	private final GuiTexture icon;

	public SelectionTypeClientCylinder()
	{
		this.icon = new GuiTexture(Dim2D.build().width(14).height(14).flush(), TEXTURE);
	}

	@Override
	public String displayName()
	{
		return "Cylinder";
	}

	@Override
	public GuiTexture getIcon()
	{
		return this.icon;
	}
}