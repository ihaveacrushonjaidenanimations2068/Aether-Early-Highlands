package com.gildedgames.aether.client.renderer.entities.living;

import com.gildedgames.aether.client.models.entities.living.ModelGlactrix;
import com.gildedgames.aether.client.renderer.EyeUtil;
import com.gildedgames.aether.client.renderer.entities.living.layers.LayerGlactrixCrystals;
import com.gildedgames.aether.common.AetherCore;
import com.gildedgames.aether.common.entities.living.passive.EntityGlactrix;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGlactrix extends RenderLiving<EntityGlactrix>
{
	private static final ResourceLocation texture = AetherCore.getResource("textures/entities/taegore/taegore.png");

	private static final ResourceLocation PUPIL_LEFT = AetherCore.getResource("textures/entities/taegore/pupil_left.png");

	private static final ResourceLocation PUPIL_RIGHT = AetherCore.getResource("textures/entities/taegore/pupil_right.png");

	private static final ResourceLocation EYES_CLOSED = AetherCore.getResource("textures/entities/taegore/eyes_closed.png");

	public RenderGlactrix(RenderManager renderManager)
	{
		super(renderManager, new ModelGlactrix(), 0.75f);

		this.addLayer(new LayerGlactrixCrystals(this));
	}

	@Override
	protected void preRenderCallback(EntityGlactrix entity, float partialTicks)
	{
		float scale = 1F;

		GlStateManager.scale(scale, scale, scale);
		GlStateManager.translate(0.0F, 0.0F, -0.4F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityGlactrix entity)
	{
		return texture;
	}

	@Override
	protected void renderModel(EntityGlactrix entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		GlStateManager.disableTexture2D();

		super.renderModel(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);

		GlStateManager.enableTexture2D();

		ModelGlactrix model = (ModelGlactrix) this.mainModel;

		boolean globalInvisible = !entity.isInvisible() || this.renderOutlines;
		boolean playerInvisible = !globalInvisible && !entity.isInvisibleToPlayer(Minecraft.getMinecraft().player);

		if (globalInvisible || playerInvisible)
		{
			/*
			EyeUtil.renderEyes(this.renderManager, model, model, model.HeadEyeLeft, entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw,
					headPitch, scale,
					PUPIL_LEFT,
					PUPIL_RIGHT, EYES_CLOSED, false);*/
		}

		if (entity.getIsToppled())
		{
		}
	}
}