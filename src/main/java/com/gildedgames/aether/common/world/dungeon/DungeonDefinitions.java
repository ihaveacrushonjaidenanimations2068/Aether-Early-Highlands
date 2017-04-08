package com.gildedgames.aether.common.world.dungeon;

import com.gildedgames.aether.common.AetherCore;
import com.gildedgames.aether.common.entities.living.dungeon.labyrinth.EntityBattleGolem;
import com.gildedgames.aether.common.entities.living.dungeon.labyrinth.EntityBattleSentry;
import com.gildedgames.aether.common.entities.living.dungeon.labyrinth.EntityDetonationSentry;
import com.gildedgames.aether.common.entities.living.dungeon.labyrinth.EntityTrackingSentry;
import com.gildedgames.aether.common.registry.content.TemplatesAether;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.template.Template;

import java.util.List;
import java.util.Random;

public class DungeonDefinitions
{
	public static final DungeonDefinition SLIDERS_LABYRINTH = new DungeonDefinition()
	{
		@Override
		public DungeonGenerator createGenerator()
		{
			return new FlatLayerDungeonGenerator(4);
		}

		@Override
		public DungeonRoomProvider createRoomProvider()
		{
			return new DungeonRoomProvider()
			{
				@Override
				public List<DungeonRoom> createRooms(MinecraftServer server, Random rand, int layer)
				{
					List<DungeonRoom> rooms = Lists.newArrayList();

					if (layer == 1)
					{
						return rooms;
					}

					Template loot_large_2 = TemplatesAether.getTemplate(AetherCore.getResource("labyrinth/loot_large_2"));
					Template loot_large_4 = TemplatesAether.getTemplate(AetherCore.getResource("labyrinth/loot_large_4"));
					Template loot_medium = TemplatesAether.getTemplate(AetherCore.getResource("labyrinth/loot_medium"));
					Template loot_small = TemplatesAether.getTemplate(AetherCore.getResource("labyrinth/loot_small"));
					Template feature_water_1 = TemplatesAether.getTemplate(AetherCore.getResource("labyrinth/feature_water_1"));
					Template feature_water_2 = TemplatesAether.getTemplate(AetherCore.getResource("labyrinth/feature_water_2"));
					Template feature_pillars_1 = TemplatesAether.getTemplate(AetherCore.getResource("labyrinth/feature_pillars_1"));
					Template feature_pillars_2 = TemplatesAether.getTemplate(AetherCore.getResource("labyrinth/feature_pillars_2"));
					Template loot_pillars_1 = TemplatesAether.getTemplate(AetherCore.getResource("labyrinth/loot_pillars_1"));
					Template loot_pillars_2 = TemplatesAether.getTemplate(AetherCore.getResource("labyrinth/loot_pillars_2"));
					Template sentry_production = TemplatesAether.getTemplate(AetherCore.getResource("labyrinth/sentry_production"));

					//Template labTunnel = MANAGER.func_189942_b(server, newsystem ResourceLocation(AetherCore.MOD_ID, "Dun_LAB_Room_Tunnel"));
					//Template labTunnelLeft = MANAGER.func_189942_b(server, newsystem ResourceLocation(AetherCore.MOD_ID, "Dun_LAB_Room_Tunnel_Left"));
					//Template labTunnelRight = MANAGER.func_189942_b(server, newsystem ResourceLocation(AetherCore.MOD_ID, "Dun_LAB_Room_Tunnel_Right"));

					rooms.add(new DungeonRoom(loot_large_2));
					rooms.add(new DungeonRoom(loot_large_4));
					rooms.add(new DungeonRoom(feature_pillars_1));
					rooms.add(new DungeonRoom(feature_pillars_2));
					rooms.add(new DungeonRoom(loot_pillars_1));
					rooms.add(new DungeonRoom(loot_pillars_2));
					rooms.add(new DungeonRoom(feature_water_1));
					rooms.add(new DungeonRoom(feature_water_2));
					rooms.add(new DungeonRoom(loot_medium));
					rooms.add(new DungeonRoom(loot_medium));
					rooms.add(new DungeonRoom(loot_small));
					rooms.add(new DungeonRoom(loot_small));
					rooms.add(new DungeonRoom(sentry_production));

					//rooms.add(newsystem DungeonRoom(labTunnel));
					//rooms.add(newsystem DungeonRoom(labTunnelLeft));
					//rooms.add(newsystem DungeonRoom(labTunnelRight));

					/*for (int count = 0; count < 3; count++){
						rooms.add(newsystem DungeonRoom(5, 5, 5));
					}

					for (int count = 0; count < 3; count++){
						rooms.add(newsystem DungeonRoom(10, 5, 5));
					}

					for (int count = 0; count < 3; count++){
						rooms.add(newsystem DungeonRoom(15, 5, 15));
					}*/

					return rooms;
				}

				@Override
				public DungeonRoom createEntranceRoom(MinecraftServer server, Random rand)
				{
					Template labEntrance = TemplatesAether.getTemplate(AetherCore.getResource("labyrinth/entrance"));

					return new DungeonRoom(labEntrance);
				}

				@Override
				public DungeonRoom createConnectionBottom(MinecraftServer server, Random rand, int layer)
				{
					if (layer == 1)
					{
						Template slider_room = TemplatesAether.getTemplate(AetherCore.getResource("labyrinth/slider_room"));

						return new DungeonRoom(slider_room);
					}

					Template labStairs = TemplatesAether.getTemplate(AetherCore.getResource("labyrinth/stairs_bottom"));

					return new DungeonRoom(labStairs);
				}

				@Override
				public DungeonRoom createConnectionTop(MinecraftServer server, Random rand, int layer)
				{
					if (layer == 2)
					{
						Template slider_room_top_connection = TemplatesAether.getTemplate(AetherCore.getResource("labyrinth/slider_room_top_connection"));

						return new DungeonRoom(slider_room_top_connection);
					}

					if (layer == 1)
					{
						return null;
					}

					Template labStairs = TemplatesAether.getTemplate(AetherCore.getResource("labyrinth/stairs_top"));

					return new DungeonRoom(labStairs);
				}

			};
		}

		@Override
		public Entity createRandomMob(World world, Random rand)
		{
			int range = rand.nextInt(100);

			if (range < 60)
			{
				return rand.nextBoolean() ? new EntityBattleSentry(world) : new EntityDetonationSentry(world);
			}

			if (range < 80)
			{
				return new EntityBattleGolem(world);
			}

			return new EntityTrackingSentry(world);
		}

	};

	public static final DungeonDefinition VALKYRIE_TEMPLE = new DungeonDefinition()
	{

		@Override
		public DungeonGenerator createGenerator()
		{
			return null;
		}

		@Override
		public DungeonRoomProvider createRoomProvider()
		{
			return null;
		}

		@Override
		public Entity createRandomMob(World world, Random rand)
		{
			return null;
		}

	};

	public static final DungeonDefinition MOLTEN_CORE = new DungeonDefinition()
	{

		@Override
		public DungeonGenerator createGenerator()
		{
			return null;
		}

		@Override
		public DungeonRoomProvider createRoomProvider()
		{
			return null;
		}

		@Override
		public Entity createRandomMob(World world, Random rand)
		{
			return null;
		}

	};

}
