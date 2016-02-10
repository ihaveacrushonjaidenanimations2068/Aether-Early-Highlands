package com.gildedgames.aether.common.player;

import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import com.gildedgames.aether.common.AetherCore;
import com.gildedgames.aether.common.containers.inventory.InventoryAccessories;
import com.gildedgames.aether.common.items.ItemsAether;
import com.gildedgames.aether.common.items.armor.ItemAetherArmor;
import com.gildedgames.aether.common.items.armor.ItemNeptuneArmor;
import com.gildedgames.aether.common.util.PlayerUtil;

public class PlayerAether implements IExtendedEntityProperties
{
	private EntityPlayer player;

	private InventoryAccessories inventoryAccessories = new InventoryAccessories(this);

	@Override
	public void init(Entity entity, World world)
	{
		if (!(entity instanceof EntityPlayer))
		{
			throw new IllegalArgumentException("Entity " + entity.toString() + " isn't of type EntityPlayer");
		}

		this.player = (EntityPlayer) entity;
	}

	public static PlayerAether get(Entity player)
	{
		return (PlayerAether) player.getExtendedProperties(AetherCore.MOD_ID);
	}

	public static void register(Entity player)
	{
		player.registerExtendedProperties(AetherCore.MOD_ID, new PlayerAether());
	}

	/**
	 * Called when the bound player ticks
	 */
	public void onUpdate()
	{
		
	}

	/**
	 * Called when the living player attached to this instance dies
	 */
	public void onDeath()
	{

	}

	public void dropAccessories()
	{
		if (!this.getPlayer().getEntityWorld().getGameRules().getBoolean("keepInventory"))
		{
			this.getPlayer().captureDrops = true;

			this.getInventoryAccessories().dropAllItems();
			
			this.getPlayer().captureDrops = false;
		}
	}

	public void onCalculateBreakSpeed(PlayerEvent.BreakSpeed event)
	{
		if (PlayerUtil.isWearingFullSet(this.getPlayer(), ItemNeptuneArmor.class))
		{
			if (!EnchantmentHelper.getAquaAffinityModifier(this.getPlayer()) && this.getPlayer().isInsideOfMaterial(Material.water))
			{
				event.newSpeed = event.originalSpeed * 5.0f;
			}
		}

		if (PlayerUtil.wearingAccessory(this.getPlayer(), ItemsAether.zanite_ring) || PlayerUtil.wearingAccessory(this.getPlayer(), ItemsAether.zanite_pendant))
		{
			event.newSpeed = event.newSpeed * 5.0f; // testing code!!!! Should be removed.

			// TODO: rings don't have durability so the below code won't do anything
			// when rings do have durability this should be uncommented and the above removed.

				/*
				* PlayerAether aePlayer = PlayerAether.get(player);
				* InventoryAccessories inventory = new InventoryAccessories(aePlayer);
				*
				*
				* for (ItemStack stack : inventory.getInventory())
				* {
				*	if (stack != null && stack.getItem() == ItemsAether.zanite_ring)
				*	{
				*		event.newSpeed = 1.0f + (stack.getItemDamage() / stack.getMaxDamage() * 3);
				*	}
				* }
				* */
		}
	}

	public void onHurt(LivingHurtEvent event)
	{
		if (!event.source.isUnblockable())
		{
			for (ItemStack stack : this.getPlayer().inventory.armorInventory)
			{
				if (stack != null && stack.getItem() instanceof ItemAetherArmor)
				{
					event.ammount -= ((ItemAetherArmor) stack.getItem()).getExtraDamageReduction(stack);
				}
			}
		}
	}

	public EntityPlayer getPlayer()
	{
		return this.player;
	}

	public InventoryAccessories getInventoryAccessories()
	{
		return this.inventoryAccessories;
	}

	public boolean isAccessoryEquipped(Item item)
	{
		return this.getInventoryAccessories().isAccessoryEquipped(item);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound)
	{
		this.inventoryAccessories.read(compound);
	}

	@Override
	public void saveNBTData(NBTTagCompound compound)
	{
		this.inventoryAccessories.write(compound);
	}
}
