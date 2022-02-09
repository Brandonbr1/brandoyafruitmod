
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.brandonbr1.brandonyafruitmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

import io.github.brandonbr1.brandonyafruitmod.block.TomatoLeavesBlock;
import io.github.brandonbr1.brandonyafruitmod.block.OrangeLeavesBlock;
import io.github.brandonbr1.brandonyafruitmod.block.GrapesLeavesBlock;
import io.github.brandonbr1.brandonyafruitmod.block.BananaLeavesBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BrandonyafruitmodModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block ORANGE_LEAVES = register(new OrangeLeavesBlock());
	public static final Block TOMATO_LEAVES = register(new TomatoLeavesBlock());
	public static final Block GRAPES_LEAVES = register(new GrapesLeavesBlock());
	public static final Block BANANA_LEAVES = register(new BananaLeavesBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
