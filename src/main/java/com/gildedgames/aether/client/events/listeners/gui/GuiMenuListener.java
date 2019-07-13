package com.gildedgames.aether.client.events.listeners.gui;

import com.gildedgames.aether.client.gui.misc.GuiAetherUnsigned;
import com.gildedgames.aether.common.AetherCore;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class GuiMenuListener
{
	@SubscribeEvent
	public static void onOpenGui(final GuiOpenEvent event)
	{
		if (event.getGui() instanceof GuiMainMenu && !AetherCore.IS_SIGNED && !AetherCore.isInsideDevEnvironment() && !AetherCore.CONFIG
				.hasAckFingerprintViolation())
		{
			event.setGui(new GuiAetherUnsigned(event.getGui()));

			return;
		}

	}
}