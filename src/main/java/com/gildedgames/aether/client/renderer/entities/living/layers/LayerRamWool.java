package com.gildedgames.aether.client.renderer.entities.living.layers;

import com.gildedgames.aether.client.models.entities.living.ModelRamWool;
import com.gildedgames.aether.client.renderer.entities.living.RenderRam;
import com.gildedgames.aether.common.AetherCore;
import com.gildedgames.aether.common.entities.living.EntityRam;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ResourceLocation;

public class LayerRamWool implements LayerRenderer
{
	private static final ResourceLocation texture = AetherCore.getResource("textures/entities/ram/ram_wool.png");

	private final ModelRamWool woolModel = new ModelRamWool();

	private final RenderRam render;

	public LayerRamWool(RenderRam render)
	{
		this.render = render;
	}

	@Override
	public void doRenderLayer(EntityLivingBase entity, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_)
	{
		EntityRam ram = (EntityRam) entity;

		if (!ram.getSheared() && !ram.isInvisible())
		{
			float[] colors = EntitySheep.getDyeRgb(ram.getFleeceColor());
			GlStateManager.color(colors[0], colors[1], colors[2]);
			GlStateManager.scale(1.01F, 1.01F, 1.01F);

			this.render.bindTexture(texture);

			this.woolModel.setModelAttributes(this.render.getMainModel());
			this.woolModel.setLivingAnimations(ram, p_177141_2_, p_177141_3_, p_177141_4_);
			this.woolModel.render(ram, p_177141_2_, p_177141_3_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_);
		}
	}

	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}
}