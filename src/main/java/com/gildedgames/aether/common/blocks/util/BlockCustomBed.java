package com.gildedgames.aether.common.blocks.util;

import net.minecraft.block.BlockBed;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;
import java.util.function.Supplier;

public class BlockCustomBed extends BlockBed
{

	private Supplier<Item> bedItem;

	public BlockCustomBed(Supplier<Item> bedItem, SoundType soundType)
	{
		super();

		this.setSoundType(soundType);

		this.bedItem = bedItem;

		this.setHardness(0.2F);

		this.disableStats();
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return state.getValue(PART) == EnumPartType.HEAD ? null : this.bedItem.get();
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	{
		return new ItemStack(this.bedItem.get());
	}

	@Override
	public boolean isBed(IBlockState state, IBlockAccess world, BlockPos pos, Entity player)
	{
		return true;
	}
}
