package com.gildedgames.orbis.common.network.packets;

import com.gildedgames.aether.common.network.MessageHandlerServer;
import com.gildedgames.orbis.common.player.PlayerOrbisModule;
import com.gildedgames.orbis.common.player.godmode.selection_types.ISelectionType;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class PacketOrbisChangeSelectionType implements IMessage
{
	private int selectionTypeIndex;

	public PacketOrbisChangeSelectionType()
	{

	}

	public PacketOrbisChangeSelectionType(final PlayerOrbisModule module, final ISelectionType selectionType)
	{
		this.selectionTypeIndex = module.selectionTypes().getSelectionTypeIndex(selectionType.getClass());
	}

	public PacketOrbisChangeSelectionType(final int powerIndex)
	{
		this.selectionTypeIndex = powerIndex;
	}

	@Override
	public void fromBytes(final ByteBuf buf)
	{
		this.selectionTypeIndex = buf.readInt();
	}

	@Override
	public void toBytes(final ByteBuf buf)
	{
		buf.writeInt(this.selectionTypeIndex);
	}

	public static class HandlerServer extends MessageHandlerServer<PacketOrbisChangeSelectionType, IMessage>
	{
		@Override
		public IMessage onMessage(final PacketOrbisChangeSelectionType message, final EntityPlayer player)
		{
			if (player == null || player.world == null)
			{
				return null;
			}

			final PlayerOrbisModule module = PlayerOrbisModule.get(player);

			if (module.inDeveloperMode())
			{
				module.selectionTypes().setCurrentSelectionType(message.selectionTypeIndex);
			}

			return null;
		}
	}
}