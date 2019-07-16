package com.gildedgames.aether.common.capabilities.entity.player.modules;

import com.gildedgames.aether.api.player.IPlayerAetherModule;
import com.gildedgames.aether.common.AetherCore;
import com.gildedgames.aether.common.capabilities.entity.player.PlayerAether;
import com.gildedgames.aether.common.capabilities.entity.player.PlayerAetherModule;
import com.gildedgames.aether.common.util.helpers.IslandHelper;
import com.gildedgames.orbis.lib.util.TeleporterGeneric;
import com.gildedgames.orbis.lib.util.io.NBTFunnel;
import com.gildedgames.orbis.lib.util.mc.BlockPosDimension;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.ServerWorld;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class PlayerTeleportingModule extends PlayerAetherModule implements IPlayerAetherModule.Serializable
{
	public static final int TELEPORT_DELAY = 80;

	private boolean isTeleportCharging;

	private BlockPosDimension nonAetherPos, aetherPos;

	private boolean playedIntro;

	private float lastPercent;

	private int ticksInTeleporter, prevTicksInTeleporter;

	public PlayerTeleportingModule(final PlayerAether playerAether)
	{
		super(playerAether);
	}

	public BlockPosDimension getNonAetherPos()
	{
		return this.nonAetherPos;
	}

	public void setNonAetherPos(final BlockPosDimension pos)
	{
		this.nonAetherPos = pos;
	}

	public BlockPosDimension getAetherPos()
	{
		return this.aetherPos;
	}

	public void setAetherPos(final BlockPosDimension pos)
	{
		this.aetherPos = pos;
	}

	public boolean hasPlayedIntro()
	{
		return this.playedIntro;
	}

	public void setPlayedIntro(final boolean playedIntro)
	{
		this.playedIntro = playedIntro;
	}

	public int getTicksInTeleporter()
	{
		return this.ticksInTeleporter;
	}

	public int getPrevTicksInTeleporter()
	{
		return this.prevTicksInTeleporter;
	}

	public float getLastPercent()
	{
		return this.lastPercent;
	}

	public void setLastPercent(float lastPercent)
	{
		this.lastPercent = lastPercent;
	}

	@Override
	public void tickStart(TickEvent.PlayerTickEvent event)
	{
		this.isTeleportCharging = false;
	}

	@Override
	public void tickEnd(TickEvent.PlayerTickEvent event)
	{
		if (this.getWorld().isRemote)
		{
			this.onUpdateClient();
		}

		this.prevTicksInTeleporter = this.ticksInTeleporter;

		if (!this.isTeleportCharging)
		{
			this.ticksInTeleporter -= 3;

			if (this.ticksInTeleporter < 0)
			{
				this.ticksInTeleporter = 0;
			}
		}

		if (this.isTeleportCharging)
		{
			if (this.getEntity().timeUntilPortal > 0)
			{
				this.getEntity().timeUntilPortal = this.getEntity().getPortalCooldown();
			}
			else
			{
				this.ticksInTeleporter++;

				if (this.ticksInTeleporter == 1)
				{
					if (this.getWorld().isRemote() && Minecraft.getInstance().player.getEntityId() == this.getEntity().getEntityId())
					{
						Minecraft.getInstance().player.playSound(new SoundEvent(AetherCore.getResource("portal.glowstone.trigger")), 1.0F, 1.0F);
					}
				}
				else if (!this.getWorld().isRemote() && (this.getTicksInTeleporter() >= TELEPORT_DELAY || this.getEntity().isCreative()))
				{
					this.ticksInTeleporter = 0;

					this.teleportToAether();
				}
			}
		}

		this.ticksInTeleporter = MathHelper.clamp(this.ticksInTeleporter, 0, TELEPORT_DELAY);
	}

	public void processTeleporting()
	{
		this.isTeleportCharging = true;
	}

	public void teleportToAether()
	{
		this.getEntity().timeUntilPortal = this.getEntity().getPortalCooldown();

		if (this.getEntity().world.isRemote() && Minecraft.getInstance().player.getEntityId() == this.getEntity().getEntityId())
		{
			Minecraft.getInstance().player.playSound(new SoundEvent(AetherCore.getResource("portal.glowstone.travel")), 1.0F, 1.0F);
		}

		if (this.getEntity().world instanceof ServerWorld)
		{
			final MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
			final ServerWorld worldServer = server.getWorld(this.getEntity().dimension);

			final PlayerEntity player = this.getEntity();

			final int transferToID = AetherCore.CONFIG.getAetherDimID();

			AetherCore.PROXY.teleportEntity(this.getEntity(), worldServer, new TeleporterGeneric(worldServer), transferToID, () -> {

				final PlayerAether playerAether = PlayerAether.getPlayer(player);
				final PlayerTeleportingModule teleportingModule = playerAether.getModule(PlayerTeleportingModule.class);

				if (teleportingModule.getAetherPos() == null)
				{
					final BlockPos pos = new BlockPos(100, 0, 100);

					final BlockPos respawn = IslandHelper.getOutpostPos(player.world, pos);

					teleportingModule
							.setAetherPos(new BlockPosDimension(respawn.getX(), respawn.getY(), respawn.getZ(),
									AetherCore.CONFIG.getAetherDimID()));
				}

				return teleportingModule.getAetherPos();
			});
		}
	}

	@Override
	public void write(final CompoundNBT output)
	{
		final NBTFunnel funnel = new NBTFunnel(output);

		funnel.set("nonAetherPos", this.nonAetherPos);
		funnel.set("aetherPos", this.aetherPos);

		output.putBoolean("playedIntro", this.playedIntro);
	}

	@Override
	public void read(final CompoundNBT input)
	{
		final NBTFunnel funnel = new NBTFunnel(input);

		this.nonAetherPos = funnel.get("nonAetherPos");
		this.aetherPos = funnel.get("aetherPos");

		this.playedIntro = input.getBoolean("playedIntro");
	}

	@Override
	public ResourceLocation getIdentifier()
	{
		return AetherCore.getResource("teleport");
	}


}
