package com.gildedgames.aether.common.player;

import com.gildedgames.aether.common.AetherCore;
import com.gildedgames.aether.common.items.armor.ItemAetherArmor;
import com.gildedgames.aether.common.items.armor.ItemGravititeArmor;
import com.gildedgames.aether.common.items.armor.ItemNeptuneArmor;
import com.gildedgames.aether.common.util.PlayerUtil;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PlayerAetherEventHandler
{
	@SubscribeEvent
	public void onLivingEntityHurt(LivingHurtEvent event)
	{
		if (event.entityLiving instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.entityLiving;

			if (!event.source.isUnblockable())
			{
				event.ammount = this.applyArmorDamageReduction(player, event.ammount);
			}
		}
	}

	private float applyArmorDamageReduction(EntityPlayer player, float damage)
	{
		for (ItemStack stack : player.inventory.armorInventory)
		{
			if (stack != null && stack.getItem() instanceof ItemAetherArmor)
			{
				damage -= ((ItemAetherArmor) stack.getItem()).getExtraDamageReduction(stack);
			}
		}

		return damage;
	}

	@SubscribeEvent
	public void onPlayerFall(LivingFallEvent event)
	{
		if (event.entityLiving instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.entityLiving;

			if (PlayerUtil.isWearingFullSet(player, ItemGravititeArmor.class))
			{
				if (event.distance <= 5.0f)
				{
					event.setCanceled(true);
				}
			}
		}
	}

	@SubscribeEvent
	public void onLivingEntityJumped(LivingJumpEvent event)
	{
		if (event.entityLiving instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.entityLiving;

			Class<? extends Item> fullSet = PlayerUtil.findArmorSet(player);

			if (fullSet == ItemGravititeArmor.class)
			{
				if (player.isSneaking())
				{
					player.motionY += 0.5F;

					AetherCore.PROXY.spawnJumpParticles(player);
				}
			}
		}
	}

	@SubscribeEvent
	public void onCalculateBreakSpeed(BreakSpeed event)
	{
		if (event.entityLiving instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.entityLiving;

			if (PlayerUtil.isWearingFullSet(player, ItemNeptuneArmor.class))
			{
				if (!EnchantmentHelper.getAquaAffinityModifier(player) && player.isInsideOfMaterial(Material.water))
				{
					event.newSpeed = event.originalSpeed * 5.0f;
				}
			}
		}
	}
}
