package com.gildedgames.aether.client.gui.container.guidebook;

import com.gildedgames.aether.common.AetherCore;
import com.gildedgames.aether.common.capabilities.entity.player.PlayerAether;
import com.gildedgames.aether.common.containers.guidebook.EmptyContainer;
import net.minecraft.client.gui.AbstractGui;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;

public class GuiGuidebookDiscovery extends AbstractGuidebookPage<EmptyContainer>
{
	private static final ResourceLocation LEFT_PAGE = AetherCore.getResource("textures/gui/guidebook/discovery/guidebook_discovery_left.png");
	private static final ResourceLocation RIGHT_PAGE_GENERAL = AetherCore.getResource("textures/gui/guidebook/discovery/guidebook_discovery_right_general.png");
	private static final ResourceLocation RIGHT_PAGE_MOB = AetherCore.getResource("textures/gui/guidebook/discovery/guidebook_discovery_right_mob.png");

	public GuiGuidebookDiscovery(final PlayerAether aePlayer)
	{
		super(new EmptyContainer(), aePlayer, new StringTextComponent("Guidebook Discovery Page"));
	}

	@Override
	protected void drawLeftPage(int screenX, int screenY, float u, float v)
	{
		this.minecraft.getTextureManager().bindTexture(LEFT_PAGE);

		GlStateManager.color4f(1.0f, 1.0f, 1.0f, 1.0f);

		AbstractGui.blit(screenX, screenY, u, v, this.PAGE_WIDTH, this.PAGE_HEIGHT, this.TEXTURE_WIDTH, this.TEXTURE_HEIGHT);
	}

	@Override
	protected void drawRightPage(int screenX, int screenY, float u, float v)
	{
		this.minecraft.getTextureManager().bindTexture(RIGHT_PAGE_GENERAL);

		GlStateManager.color4f(1.0f, 1.0f, 1.0f, 1.0f);

		AbstractGui.blit(screenX, screenY, u ,v, this.PAGE_WIDTH, this.PAGE_HEIGHT,this.TEXTURE_WIDTH, this.TEXTURE_HEIGHT);
	}
}
