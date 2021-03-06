package com.gildedgames.aether.common.capabilities.entity.effects;

import com.gildedgames.aether.api.capabilites.entity.effects.EntityEffectInstance;
import com.gildedgames.aether.api.capabilites.entity.effects.EntityEffectProcessor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerPickupXpEvent;

import java.util.List;

public interface EffectProcessorPlayer<I extends EntityEffectInstance> extends EntityEffectProcessor<I>
{

	/**
	 * Called when the player interacts with anything in the game, mostly related
	 * to mouse input.
	 * @param event The event that is fired off.
	 * @param source The player that is affected by this ability.
	 */
	void onInteract(PlayerInteractEvent event, EntityPlayer source, List<I> instances);

	void onPickupXP(PlayerPickupXpEvent event, EntityPlayer source, List<I> instances);

}
