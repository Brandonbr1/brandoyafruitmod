
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.brandonbr1.brandonyafruitmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

import io.github.brandonbr1.brandonyafruitmod.block.entity.TomatoLeavesBlockEntity;
import io.github.brandonbr1.brandonyafruitmod.block.entity.OrangeLeavesBlockEntity;
import io.github.brandonbr1.brandonyafruitmod.block.entity.BananaLeavesBlockEntity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BrandonyafruitmodModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> ORANGE_LEAVES = register("brandonyafruitmod:orange_leaves", BrandonyafruitmodModBlocks.ORANGE_LEAVES,
			OrangeLeavesBlockEntity::new);
	public static final BlockEntityType<?> TOMATO_LEAVES = register("brandonyafruitmod:tomato_leaves", BrandonyafruitmodModBlocks.TOMATO_LEAVES,
			TomatoLeavesBlockEntity::new);
	public static final BlockEntityType<?> BANANA_LEAVES = register("brandonyafruitmod:banana_leaves", BrandonyafruitmodModBlocks.BANANA_LEAVES,
			BananaLeavesBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
