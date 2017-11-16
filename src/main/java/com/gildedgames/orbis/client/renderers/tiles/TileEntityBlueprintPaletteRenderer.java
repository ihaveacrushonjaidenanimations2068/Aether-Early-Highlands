package com.gildedgames.orbis.client.renderers.tiles;

import com.gildedgames.aether.api.orbis_core.OrbisCore;
import com.gildedgames.aether.api.orbis_core.data.management.IDataIdentifier;
import com.gildedgames.orbis.client.OrbisClientCaches;
import com.gildedgames.orbis.client.renderers.AirSelectionRenderer;
import com.gildedgames.orbis.client.renderers.RenderBlueprint;
import com.gildedgames.orbis.common.data.BlueprintPalette;
import com.gildedgames.orbis.common.items.ItemBlueprintPalette;
import com.gildedgames.orbis.common.tiles.TileEntityBlueprintPalette;
import com.gildedgames.orbis.common.util.OpenGLHelper;
import com.google.common.base.Optional;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemOverrideList;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class TileEntityBlueprintPaletteRenderer extends TileEntitySpecialRenderer<TileEntityBlueprintPalette>
{

	private static final Minecraft mc = Minecraft.getMinecraft();

	public final BakedModel baked = new BakedModel();

	private ItemStack stack;

	public TileEntityBlueprintPaletteRenderer()
	{

	}

	@Override
	public void renderTileEntityAt(final TileEntityBlueprintPalette te, final double x, final double y, final double z, final float partialTicks,
			final int destroyStage)
	{
		try
		{
			if (this.stack == null)
			{
				return;
			}

			final BlueprintPalette palette = ItemBlueprintPalette.getBlueprintPalette(this.stack);

			if (palette == null || palette.getIDs().size() <= 0)
			{
				return;
			}

			final int target = (int) ((System.currentTimeMillis() / 1000) % palette.getIDs().size());
			int i = 0;

			IDataIdentifier id = null;

			for (final IDataIdentifier itId : palette.getIDs())
			{
				if (i == target)
				{
					id = itId;
				}

				i++;
			}

			final Optional<RenderBlueprint> opt = OrbisClientCaches.getBlueprintRenders().get(id);

			if (!opt.isPresent())
			{
				return;
			}

			final RenderBlueprint blueprint = opt.get();

			GlStateManager.pushMatrix();

			final boolean inGuiContext = OpenGLHelper.isInGuiContext();

			if (!inGuiContext)
			{
				blueprint.transformForWorld();
				this.setLightmapDisabled(true);
			}
			else
			{
				blueprint.transformForGui();
			}

			blueprint.doGlobalRendering(mc.world, AirSelectionRenderer.PARTIAL_TICKS);

			if (!inGuiContext)
			{
				this.setLightmapDisabled(false);
			}

			GlStateManager.resetColor();

			GlStateManager.popMatrix();
		}
		catch (final ExecutionException e)
		{
			OrbisCore.LOGGER.error(e);
		}
	}

	public static class DummyTile extends TileEntityBlueprintPalette
	{
	}

	@MethodsReturnNonnullByDefault
	@ParametersAreNonnullByDefault
	public class BakedModel implements IBakedModel
	{
		@Override
		public List<BakedQuad> getQuads(@Nullable final IBlockState state, @Nullable final EnumFacing side, final long rand)
		{
			return Collections.emptyList();
		}

		@Override
		public boolean isAmbientOcclusion()
		{
			return true;
		}

		@Override
		public boolean isGui3d()
		{
			return true;
		}

		@Override
		public boolean isBuiltInRenderer()
		{
			return true;
		}

		@Override
		public TextureAtlasSprite getParticleTexture()
		{
			return Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite("minecraft:blocks/soul_sand");
		}

		@Override
		public ItemCameraTransforms getItemCameraTransforms()
		{
			return ItemCameraTransforms.DEFAULT;
		}

		@Override
		public ItemOverrideList getOverrides()
		{
			return new Overrides();
		}

		private class Overrides extends ItemOverrideList
		{
			public Overrides()
			{
				super(Collections.emptyList());
			}

			@Override
			public IBakedModel handleItemState(final IBakedModel originalModel, final ItemStack stack, final World world, final EntityLivingBase entity)
			{
				TileEntityBlueprintPaletteRenderer.this.stack = stack;
				return BakedModel.this;
			}
		}
	}

}
