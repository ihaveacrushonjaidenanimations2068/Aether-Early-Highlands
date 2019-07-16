package com.gildedgames.aether.client.events.listeners.gui;

import com.gildedgames.aether.api.AetherAPI;
import com.gildedgames.aether.api.registry.tab.ITabClient;
import com.gildedgames.aether.api.registry.tab.ITabGroup;
import com.gildedgames.aether.api.registry.tab.ITabGroupHandler;
import com.gildedgames.aether.client.gui.tab.RenderTabGroup;
import com.gildedgames.aether.common.init.DimensionsAether;
import com.gildedgames.aether.common.network.NetworkingAether;
import com.gildedgames.aether.common.network.packets.PacketOpenTab;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class GuiTabListener
{
	@OnlyIn(Dist.CLIENT)
	private final static RenderTabGroup tabGroupRenderer = new RenderTabGroup();

	@SubscribeEvent
	public static void onGuiOpen(final GuiOpenEvent event)
	{
		if (Minecraft.getInstance().world == null || Minecraft.getInstance().world.getDimension().getType() != DimensionsAether.AETHER)
		{
			return;
		}

		final Screen gui = event.getGui();

		final ITabGroupHandler groupHandler = AetherAPI.content().tabs().getActiveGroup();

		if (groupHandler != null)
		{
			final ITabClient selectedTab = groupHandler.getClientGroup().getSelectedTab();

			if (gui != null && selectedTab.isTabValid(gui))
			{
				return;
			}

			AetherAPI.content().tabs().setActiveGroup(null);
		}

		for (final ITabGroupHandler tabGroupHandler : AetherAPI.content().tabs().getRegisteredTabGroups().values())
		{
			final ITabGroup<ITabClient> tabGroup = tabGroupHandler.getClientGroup();

			for (final ITabClient tab : tabGroup.getTabs())
			{
				if (event.getGui() != null && tab.isTabValid(gui))
				{
					if (tabGroup.getRememberSelectedTab() && tabGroup.getRememberedTab() != null)
					{
						tabGroup.setSelectedTab(tabGroup.getRememberedTab());
					}
					else
					{
						tabGroup.setSelectedTab(tab);
					}

					AetherAPI.content().tabs().setActiveGroup(tabGroupHandler);

					if (gui == null)
					{
						tabGroup.getSelectedTab().onOpen(Minecraft.getInstance().player);
						NetworkingAether.sendPacketToServer(new PacketOpenTab(tabGroup.getSelectedTab()));

						event.setCanceled(true);
					}

					return;
				}
			}
		}
	}

	@SubscribeEvent
	public static void onGuiMouseEvent(final GuiScreenEvent.MouseInputEvent event)
	{
		if (Minecraft.getInstance().world == null || Minecraft.getInstance().world.getDimension().getType() != DimensionsAether.AETHER)
		{
			return;
		}

		final PlayerEntity player = Minecraft.getInstance().player;

		if (player == null || !player.inventory.getItemStack().isEmpty())
		{
			return;
		}

		final ITabGroupHandler groupHandler = AetherAPI.content().tabs().getActiveGroup();

		if (groupHandler != null)
		{
			final ITabGroup<ITabClient> activeGroup = groupHandler.getClientGroup();

			if (activeGroup != null)
			{
				final ITabClient hoveredTab;

				hoveredTab = tabGroupRenderer.getHoveredTab(activeGroup);

				if (Minecraft.getInstance().mouseHelper.isLeftDown() && hoveredTab != null)
				{
					if (hoveredTab != activeGroup.getSelectedTab())
					{
						activeGroup.getSelectedTab().onClose(Minecraft.getInstance().player);
						activeGroup.setSelectedTab(hoveredTab);

						if (hoveredTab != activeGroup.getRememberedTab() && hoveredTab.isRemembered())
						{
							if (activeGroup.getRememberedTab() != null)
							{
								activeGroup.getRememberedTab().onClose(Minecraft.getInstance().player);
							}

							activeGroup.setRememberedTab(hoveredTab);
						}

						hoveredTab.onOpen(Minecraft.getInstance().player);
						NetworkingAether.sendPacketToServer(new PacketOpenTab(hoveredTab));

						event.setCanceled(true);
					}
				}
			}
		}
	}

	@SubscribeEvent
	public static void tickEnd(final TickEvent.RenderTickEvent event)
	{
		if (event.phase == TickEvent.Phase.END)
		{
			final PlayerEntity player = Minecraft.getInstance().player;

			if (player == null || !player.inventory.getItemStack().isEmpty())
			{
				return;
			}

			final ITabGroupHandler groupHandler = AetherAPI.content().tabs().getActiveGroup();

			if (groupHandler != null)
			{
				final ITabGroup<ITabClient> activeGroup = groupHandler.getClientGroup();

				if (activeGroup != null)
				{
					tabGroupRenderer.render(activeGroup);
				}
			}
		}
	}
}
