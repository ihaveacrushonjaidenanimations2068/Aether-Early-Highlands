package com.gildedgames.aether.common.world.aether.biomes;

import com.gildedgames.aether.api.util.TemplateUtil;
import com.gildedgames.aether.api.world.ISector;
import com.gildedgames.aether.api.world.ISectorAccess;
import com.gildedgames.aether.api.world.IslandSectorHelper;
import com.gildedgames.aether.api.world.generation.TemplateDefinition;
import com.gildedgames.aether.api.world.generation.TemplateLoc;
import com.gildedgames.aether.api.world.islands.IIslandData;
import com.gildedgames.aether.api.world.islands.IVirtualDataManager;
import com.gildedgames.aether.common.blocks.BlocksAether;
import com.gildedgames.aether.common.blocks.natural.BlockAercloud;
import com.gildedgames.aether.common.blocks.natural.BlockAetherDirt;
import com.gildedgames.aether.common.blocks.natural.BlockHolystone;
import com.gildedgames.aether.common.blocks.natural.plants.BlockAetherFlower;
import com.gildedgames.aether.common.blocks.natural.plants.BlockBlueberryBush;
import com.gildedgames.aether.common.blocks.natural.plants.BlockValkyrieGrass;
import com.gildedgames.aether.common.registry.content.GenerationAether;
import com.gildedgames.aether.common.world.aether.features.*;
import com.gildedgames.aether.common.world.aether.features.aerclouds.WorldGenAercloud;
import com.gildedgames.aether.common.world.aether.features.aerclouds.WorldGenPurpleAercloud;
import com.gildedgames.aether.common.world.aether.features.trees.WorldGenOrangeTree;
import com.gildedgames.aether.common.world.templates.TemplatePlacer;
import com.gildedgames.aether.common.world.util.GenUtil;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

import java.util.Random;

public class BiomeAetherDecorator
{

	private final WorldGenAetherMinable genAmbrosium, genZanite, genGravitite, genIcestone, genArkenium, genQuicksoilOnGrass, genCoarseAetherDirtOnDirt, genCoarseAetherDirtOnHolystone;

	private final WorldGenAetherMinable genMossyHolystone, genCrudeScatterglass;

	private final WorldGenAetherFlowers genPurpleFlowers, genWhiteRoses, genBurstblossom;

	private final WorldGenOrangeTree genOrangeTree;

	private final WorldGenAetherFlowers genBlueberryBushes, genKirridGrass;

	private final WorldGenQuicksoil genQuicksoil;

	private final WorldGenAetherLakes genAetherLakes;

	private final WorldGenAercloud genColdColumbusAercloud, genColdFlatAercloud, genBlueAercloud;

	private final WorldGenPurpleAercloud genPurpleAercloud;

	private final WorldGenBrettlPlant genBrettlPlant;

	public boolean generateBushes = true;

	public BiomeAetherDecorator()
	{
		final BlockMatcher holystoneMatcher = BlockMatcher.forBlock(BlocksAether.holystone);

		this.genAmbrosium = new WorldGenAetherMinable(BlocksAether.ambrosium_ore.getDefaultState(), 16, holystoneMatcher);
		this.genZanite = new WorldGenAetherMinable(BlocksAether.zanite_ore.getDefaultState(), 8, holystoneMatcher);
		this.genGravitite = new WorldGenAetherMinable(BlocksAether.gravitite_ore.getDefaultState(), 5, holystoneMatcher);
		this.genIcestone = new WorldGenAetherMinable(BlocksAether.icestone_ore.getDefaultState(), 12, holystoneMatcher);
		this.genArkenium = new WorldGenAetherMinable(BlocksAether.arkenium_ore.getDefaultState(), 6, holystoneMatcher);

		final BlockMatcher dirtMatcher = BlockMatcher.forBlock(BlocksAether.aether_dirt);

		final BlockMatcher grassMatcher = BlockMatcher.forBlock(BlocksAether.aether_grass);

		this.genCoarseAetherDirtOnDirt = new WorldGenAetherMinable(
				BlocksAether.aether_dirt.getDefaultState().withProperty(BlockAetherDirt.PROPERTY_VARIANT, BlockAetherDirt.COARSE_DIRT), 22, dirtMatcher);
		this.genCoarseAetherDirtOnHolystone = new WorldGenAetherMinable(
				BlocksAether.aether_dirt.getDefaultState().withProperty(BlockAetherDirt.PROPERTY_VARIANT, BlockAetherDirt.COARSE_DIRT), 22, holystoneMatcher);

		this.genQuicksoilOnGrass = new WorldGenAetherMinable(BlocksAether.quicksoil.getDefaultState(), 22, grassMatcher);

		this.genMossyHolystone = new WorldGenAetherMinable(
				BlocksAether.holystone.getDefaultState().withProperty(BlockHolystone.PROPERTY_VARIANT, BlockHolystone.MOSSY_HOLYSTONE), 20, holystoneMatcher);
		this.genCrudeScatterglass = new WorldGenAetherMinable(BlocksAether.crude_scatterglass.getDefaultState(), 16, holystoneMatcher);

		this.genPurpleFlowers = new WorldGenAetherFlowers(
				BlocksAether.aether_flower.getDefaultState().withProperty(BlockAetherFlower.PROPERTY_VARIANT, BlockAetherFlower.PURPLE_FLOWER), 64);
		this.genWhiteRoses = new WorldGenAetherFlowers(
				BlocksAether.aether_flower.getDefaultState().withProperty(BlockAetherFlower.PROPERTY_VARIANT, BlockAetherFlower.WHITE_ROSE), 64);
		this.genBurstblossom = new WorldGenAetherFlowers(
				BlocksAether.aether_flower.getDefaultState().withProperty(BlockAetherFlower.PROPERTY_VARIANT, BlockAetherFlower.BURSTBLOSSOM), 64);

		this.genOrangeTree = new WorldGenOrangeTree();

		this.genBlueberryBushes = new WorldGenAetherFlowers(
				BlocksAether.blueberry_bush.getDefaultState().withProperty(BlockBlueberryBush.PROPERTY_HARVESTABLE, true), 32);
		this.genKirridGrass = new WorldGenAetherFlowers(
				BlocksAether.valkyrie_grass.getDefaultState().withProperty(BlockValkyrieGrass.PROPERTY_HARVESTABLE, true)
						.withProperty(BlockValkyrieGrass.PROPERTY_VARIANT, BlockValkyrieGrass.FULL), 64);

		this.genQuicksoil = new WorldGenQuicksoil();
		this.genAetherLakes = new WorldGenAetherLakes(Blocks.WATER.getDefaultState());

		this.genBrettlPlant = new WorldGenBrettlPlant();

		this.genColdFlatAercloud = new WorldGenAercloud(BlocksAether.aercloud.getAercloudState(BlockAercloud.COLD_AERCLOUD), 64, true);
		this.genColdColumbusAercloud = new WorldGenAercloud(BlocksAether.aercloud.getAercloudState(BlockAercloud.COLD_AERCLOUD), 16, false);
		this.genBlueAercloud = new WorldGenAercloud(BlocksAether.aercloud.getAercloudState(BlockAercloud.BLUE_AERCLOUD), 8, false);

		this.genPurpleAercloud = new WorldGenPurpleAercloud(BlocksAether.aercloud.getAercloudState(BlockAercloud.PURPLE_AERCLOUD), 4, false);
	}

	public void prepareDecorationsWholeIsland(final World world, final IIslandData island, final Random random)
	{
		final IVirtualDataManager manager = island.getVirtualDataManager();

		final int startX = (int) island.getBounds().getCenterX();
		final int startZ = (int) island.getBounds().getCenterZ();

		final BlockPos pos = new BlockPos(startX, 0, startZ);

		final TemplateDefinition def = TemplateUtil
				.pickRandom(random, GenerationAether.mysterious_henge, GenerationAether.outpost_a, GenerationAether.outpost_b, GenerationAether.outpost_c);

		boolean generated = false;

		for (int i = 0; i < 5000; i++)
		{
			final int x = random.nextInt(island.getBounds().getWidth() / 2);
			final int z = random.nextInt(island.getBounds().getLength() / 2);

			final BlockPos pos2 = manager.getTopPos(pos.add(x, 0, z));

			if (pos2.getY() >= 0)
			{
				final TemplateLoc loc = new TemplateLoc().set(pos2).set(true);

				generated = TemplatePlacer.canPlace(island.getVirtualDataManager(), def, loc, random);

				if (generated)
				{
					island.setRespawnPoint(GenUtil.rotate(loc.getPos(), loc.getPos().add(-0.5, 2, 1.0), loc.getSettings().getRotation()));
					island.getVirtualDataManager().placeTemplate(def, loc);

					break;
				}
			}
		}

		if (!generated)
		{
			System.out.println("WARNING: OUTPOST NOT GENERATED ON AN ISLAND!");
		}
	}

	/**
	 * Should be used with HEAVY CAUTION. You do not want to do too much preparation
	 * for smaller structures/generations since it is very costly.
	 * @param world
	 * @param island
	 * @param random
	 * @param pos
	 * @param genBase
	 */
	public void prepareDecorationsPerChunk(final World world, final IIslandData island, final Random random, final BlockPos pos, final Biome genBase)
	{

	}

	protected void genDecorations(final World world, final Random random, final BlockPos pos, final Biome genBase)
	{
		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(world, random, pos));

		final int chunkX = pos.getX() >> 4;
		final int chunkZ = pos.getZ() >> 4;

		this.generateOres(world, random, pos);

		int x, y, z;

		int count;

		final ISectorAccess access = IslandSectorHelper.getAccess(world);
		final ISector sector = access.provideSector(chunkX, chunkZ);

		// TODO: support multiple islands in same chunk
		final IIslandData island = sector.getIslandsForRegion(pos.getX(), 0, pos.getZ(), 16, 255, 16)
				.stream().findFirst().orElse(null);

		if (island == null)
		{
			return;
		}

		//Decorate SubBiomes
		if (genBase instanceof BiomeAetherBase)
		{
			final BiomeAetherBase biome = (BiomeAetherBase) genBase;

			biome.getSubBiomeDecorator().decorate(world, random, pos, biome);
		}

		// Moa Nests
		if (random.nextInt(4) == 0)
		{
			x = random.nextInt(16) + 8;
			z = random.nextInt(16) + 8;

			final BlockPos pos2 = world.getTopSolidOrLiquidBlock(pos.add(x, 0, z)).add(0, -1, 0);

			TemplatePlacer.place(world, GenerationAether.skyroot_moa_nest.getRandomDefinition(random), new TemplateLoc().set(pos2), random);
		}

		// Orange Tree Generator
		for (count = 0; count < 2; count++)
		{
			x = random.nextInt(16) + 8;
			y = random.nextInt(128);
			z = random.nextInt(16) + 8;

			this.genOrangeTree.generate(world, random, pos.add(x, y, z));
		}

		// Blueberry Bush Generator
		if (this.generateBushes)
		{
			for (count = 0; count < 2; count++)
			{
				x = random.nextInt(16) + 8;
				y = random.nextInt(128);
				z = random.nextInt(16) + 8;

				this.genBlueberryBushes.generate(world, random, pos.add(x, y, z));
			}
		}

		// Purple Flowers Generator
		for (count = 0; count < 6; count++)
		{
			if (random.nextInt(2) == 0)
			{
				x = random.nextInt(16) + 8;
				y = random.nextInt(128);
				z = random.nextInt(16) + 8;

				this.genPurpleFlowers.generate(world, random, pos.add(x, y, z));
			}
		}

		// White Rose Generator
		for (count = 0; count < 2; count++)
		{
			x = random.nextInt(16) + 8;
			y = random.nextInt(128);
			z = random.nextInt(16) + 8;

			this.genWhiteRoses.generate(world, random, pos.add(x, y, z));
		}

		// Burstblossom Generator
		for (count = 0; count < 2; count++)
		{
			x = random.nextInt(16) + 8;
			y = random.nextInt(128);
			z = random.nextInt(16) + 8;

			this.genBurstblossom.generate(world, random, pos.add(x, y, z));
		}

		// Kirrid Grass Generator
		if (random.nextInt(12) == 0)
		{
			for (count = 0; count < 6; count++)
			{

				x = random.nextInt(16) + 8;
				y = random.nextInt(128);
				z = random.nextInt(16) + 8;

				this.genKirridGrass.generate(world, random, pos.add(x, y, z));
			}
		}

		// Brettl Plant Generator
		if (random.nextInt(2) == 0)
		{
			x = random.nextInt(16) + 8;
			y = random.nextInt(128);
			z = random.nextInt(16) + 8;

			this.genBrettlPlant.generate(world, random, pos.add(x, y, z));
		}

		this.generateClouds(world, random, new BlockPos(pos.getX(), 0, pos.getZ()));

		// Lake Generator
		/*if (random.nextInt(4) == 0)
		{
			x = random.nextInt(16) + 8;
			y = random.nextInt(128);
			z = random.nextInt(16) + 8;
		
			this.genAetherLakes.generate(world, random, pos.add(x, y, z));
		}*/
	}

	private void generateMineable(final WorldGenAetherMinable minable, final World world, final Random random, final BlockPos pos, final int minY,
			final int maxY, final int attempts)
	{
		for (int count = 0; count < attempts; count++)
		{
			final BlockPos randomPos = pos.add(random.nextInt(16), random.nextInt(maxY - minY) + minY, random.nextInt(16));

			minable.generate(world, random, randomPos);
		}
	}

	private void generateCloud(final WorldGenAercloud gen, final World world, final BlockPos pos, final Random rand, final int rarity, final int width,
			final int minY, final int maxY)
	{
		if (rand.nextInt(rarity) == 0)
		{
			final BlockPos nextPos = pos.add(rand.nextInt(width), minY + rand.nextInt(maxY - minY), rand.nextInt(width));

			gen.generate(world, rand, nextPos);
		}
	}

	protected int nextInt(final Random random, final int i)
	{
		if (i <= 1)
		{
			return 0;
		}

		return random.nextInt(i);
	}

	protected void generateOres(final World world, final Random random, final BlockPos pos)
	{
		this.generateMineable(this.genAmbrosium, world, random, pos, 0, 128, 20);
		this.generateMineable(this.genZanite, world, random, pos, 0, 128, 15);
		this.generateMineable(this.genGravitite, world, random, pos, 0, 128, 10);
		this.generateMineable(this.genIcestone, world, random, pos, 0, 128, 20);
		this.generateMineable(this.genArkenium, world, random, pos, 0, 128, 13);

		this.generateMineable(this.genCoarseAetherDirtOnDirt, world, random, pos, 0, 128, 10);
		this.generateMineable(this.genCoarseAetherDirtOnHolystone, world, random, pos, 0, 128, 20);
		this.generateMineable(this.genQuicksoilOnGrass, world, random, pos, 0, 128, 10);

		this.generateMineable(this.genMossyHolystone, world, random, pos, 0, 90, 45);
		this.generateMineable(this.genCrudeScatterglass, world, random, pos, 0, 110, 25);
	}

	protected void generateClouds(final World world, final Random random, final BlockPos pos)
	{
		this.generateCloud(this.genBlueAercloud, world, pos, random, 15, 16, 90, 130);
		//		this.generateCloud(this.genColdFlatAercloud, world, pos, random, 10, 16, 32);
		this.generateCloud(this.genColdColumbusAercloud, world, pos, random, 30, 16, 90, 130);

		this.generateCloud(this.genPurpleAercloud, world, pos, random, 50, 4, 90, 130);
	}
}