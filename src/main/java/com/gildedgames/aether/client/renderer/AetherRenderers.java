package com.gildedgames.aether.client.renderer;

import com.gildedgames.aether.client.renderer.entities.AetherRenderFactory;
import com.gildedgames.aether.client.renderer.entities.RenderFloatingBlock;
import com.gildedgames.aether.client.renderer.entities.RenderMovingBlock;
import com.gildedgames.aether.client.renderer.entities.companions.RenderFangrin;
import com.gildedgames.aether.client.renderer.entities.companions.RenderFleetingWisp;
import com.gildedgames.aether.client.renderer.entities.companions.RenderFrostpineTotem;
import com.gildedgames.aether.client.renderer.entities.companions.RenderKraisith;
import com.gildedgames.aether.client.renderer.entities.companions.RenderNexSpirit;
import com.gildedgames.aether.client.renderer.entities.companions.RenderShadeOfArkenzus;
import com.gildedgames.aether.client.renderer.entities.companions.RenderEtherealWisp;
import com.gildedgames.aether.client.renderer.entities.companions.RenderSoaringWisp;
import com.gildedgames.aether.client.renderer.entities.living.*;
import com.gildedgames.aether.client.renderer.entities.projectiles.RenderBolt;
import com.gildedgames.aether.client.renderer.entities.projectiles.RenderDaggerfrostSnowball;
import com.gildedgames.aether.client.renderer.entities.projectiles.RenderDart;
import com.gildedgames.aether.client.renderer.tile_entities.TileEntityAltarRenderer;
import com.gildedgames.aether.client.renderer.tile_entities.TileEntityLabyrinthChestRenderer;
import com.gildedgames.aether.client.renderer.tile_entities.TileEntityLabyrinthDoorRenderer;
import com.gildedgames.aether.client.renderer.tile_entities.TileEntityLabyrinthTotemRenderer;
import com.gildedgames.aether.client.renderer.tile_entities.TileEntitySkyrootChestRenderer;
import com.gildedgames.aether.client.renderer.tile_entities.TileEntitySkyrootSignRenderer;
import com.gildedgames.aether.common.entities.blocks.EntityFloatingBlock;
import com.gildedgames.aether.common.entities.blocks.EntityMovingBlock;
import com.gildedgames.aether.common.entities.companions.EntityFangrin;
import com.gildedgames.aether.common.entities.companions.EntityFleetingWisp;
import com.gildedgames.aether.common.entities.companions.EntityFrostpineTotem;
import com.gildedgames.aether.common.entities.companions.EntityKraisith;
import com.gildedgames.aether.common.entities.companions.EntityNexSpirit;
import com.gildedgames.aether.common.entities.companions.EntityShadeOfArkenzus;
import com.gildedgames.aether.common.entities.companions.EntityEtheralWisp;
import com.gildedgames.aether.common.entities.companions.EntitySoaringWisp;
import com.gildedgames.aether.common.entities.item.EntityPhoenixItem;
import com.gildedgames.aether.common.entities.living.EntityAechorPlant;
import com.gildedgames.aether.common.entities.living.EntityAerbunny;
import com.gildedgames.aether.common.entities.living.EntityCarrionSprout;
import com.gildedgames.aether.common.entities.living.EntitySheepuff;
import com.gildedgames.aether.common.entities.living.enemies.EntityCockatrice;
import com.gildedgames.aether.common.entities.living.mounts.EntityFlyingCow;
import com.gildedgames.aether.common.entities.living.mounts.EntityPhyg;
import com.gildedgames.aether.common.entities.projectiles.EntityBolt;
import com.gildedgames.aether.common.entities.projectiles.EntityDaggerfrostSnowball;
import com.gildedgames.aether.common.entities.projectiles.EntityDart;
import com.gildedgames.aether.common.tile_entities.TileEntityAltar;
import com.gildedgames.aether.common.tile_entities.TileEntityLabyrinthChest;
import com.gildedgames.aether.common.tile_entities.TileEntityLabyrinthDoor;
import com.gildedgames.aether.common.tile_entities.TileEntityLabyrinthTotem;
import com.gildedgames.aether.common.tile_entities.TileEntitySkyrootChest;
import com.gildedgames.aether.common.tile_entities.TileEntitySkyrootSign;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderEntityItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class AetherRenderers
{
	public static void preInit()
	{
		registerEntityRenderers();
	}

	public static void init()
	{
		registerTESRs();
	}

	private static void registerEntityRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityFloatingBlock.class, new AetherRenderFactory<>(RenderFloatingBlock.class));
		RenderingRegistry.registerEntityRenderingHandler(EntityMovingBlock.class, new AetherRenderFactory<>(RenderMovingBlock.class));
		RenderingRegistry.registerEntityRenderingHandler(EntityDart.class, new AetherRenderFactory<>(RenderDart.class));
		RenderingRegistry.registerEntityRenderingHandler(EntityBolt.class, new AetherRenderFactory<>(RenderBolt.class));
		RenderingRegistry.registerEntityRenderingHandler(EntityDaggerfrostSnowball.class, new AetherRenderFactory<>(RenderDaggerfrostSnowball.class));

		RenderingRegistry.registerEntityRenderingHandler(EntityPhyg.class, new AetherRenderFactory<>(RenderPhyg.class));
		RenderingRegistry.registerEntityRenderingHandler(EntityFlyingCow.class, new AetherRenderFactory<>(RenderFlyingCow.class));
		RenderingRegistry.registerEntityRenderingHandler(EntitySheepuff.class, new AetherRenderFactory<>(RenderSheepuff.class));
		RenderingRegistry.registerEntityRenderingHandler(EntityAechorPlant.class, new AetherRenderFactory<>(RenderAechorPlant.class));
		RenderingRegistry.registerEntityRenderingHandler(EntityAerbunny.class, new AetherRenderFactory<>(RenderAerbunny.class));
		RenderingRegistry.registerEntityRenderingHandler(EntityCarrionSprout.class, new AetherRenderFactory<>(RenderCarrionSprout.class));
		RenderingRegistry.registerEntityRenderingHandler(EntityPhoenixItem.class, new IRenderFactory<EntityPhoenixItem>()
		{
			@Override
			public Render<? super EntityPhoenixItem> createRenderFor(RenderManager manager)
			{
				return new RenderEntityItem(manager, Minecraft.getMinecraft().getRenderItem());
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFrostpineTotem.class, new AetherRenderFactory<>(RenderFrostpineTotem.class));
		RenderingRegistry.registerEntityRenderingHandler(EntityKraisith.class, new AetherRenderFactory<>(RenderKraisith.class));
		RenderingRegistry.registerEntityRenderingHandler(EntityShadeOfArkenzus.class, new AetherRenderFactory<>(RenderShadeOfArkenzus.class));
		RenderingRegistry.registerEntityRenderingHandler(EntityEtheralWisp.class, new AetherRenderFactory<>(RenderEtherealWisp.class));
		RenderingRegistry.registerEntityRenderingHandler(EntityFleetingWisp.class, new AetherRenderFactory<>(RenderFleetingWisp.class));
		RenderingRegistry.registerEntityRenderingHandler(EntitySoaringWisp.class, new AetherRenderFactory<>(RenderSoaringWisp.class));
		RenderingRegistry.registerEntityRenderingHandler(EntityFangrin.class, new AetherRenderFactory<>(RenderFangrin.class));
		RenderingRegistry.registerEntityRenderingHandler(EntityNexSpirit.class, new AetherRenderFactory<>(RenderNexSpirit.class));
		RenderingRegistry.registerEntityRenderingHandler(EntityCockatrice.class, new AetherRenderFactory<>(RenderCockatrice.class));
	}

	private static void registerTESRs()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltar.class, new TileEntityAltarRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySkyrootChest.class, new TileEntitySkyrootChestRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySkyrootSign.class, new TileEntitySkyrootSignRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLabyrinthTotem.class, new TileEntityLabyrinthTotemRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLabyrinthDoor.class, new TileEntityLabyrinthDoorRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLabyrinthChest.class, new TileEntityLabyrinthChestRenderer());
	}
}
