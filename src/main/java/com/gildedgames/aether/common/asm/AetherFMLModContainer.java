package com.gildedgames.aether.common.asm;

import com.google.common.eventbus.EventBus;
import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;

import java.util.ArrayList;

public class AetherFMLModContainer extends DummyModContainer
{
	public AetherFMLModContainer()
	{
		super(new ModMetadata());

		ModMetadata meta = this.getMetadata();
		meta.name = "Aether II (Lighting Engine)";
		meta.modId = "aether-lighting-engine";
		meta.version = "${version}";
		meta.description = "Lighting engine performance optimizations and bug fixes for Minecraft. These improvements are based upon "
				+ "the work done by Mathe172 and PhiPro95. Without their work towards reverse engineering and diagnosing Minecraft's "
				+ "lighting performance crisis, this project would not have been possible.";
		meta.authorList = new ArrayList<>();
		meta.authorList.add("Angeline (@jellysquid)");
	}

	@Override
	public boolean registerBus(EventBus bus, LoadController controller)
	{
		return true;
	}
}