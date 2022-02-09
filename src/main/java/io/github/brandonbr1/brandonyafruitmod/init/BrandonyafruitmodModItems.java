
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.brandonbr1.brandonyafruitmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

import io.github.brandonbr1.brandonyafruitmod.item.WaterMellonItem;
import io.github.brandonbr1.brandonyafruitmod.item.TomatoItem;
import io.github.brandonbr1.brandonyafruitmod.item.OrangesItem;
import io.github.brandonbr1.brandonyafruitmod.item.LetticeItem;
import io.github.brandonbr1.brandonyafruitmod.item.KiwiItem;
import io.github.brandonbr1.brandonyafruitmod.item.GrapesItem;
import io.github.brandonbr1.brandonyafruitmod.item.EggplantItem;
import io.github.brandonbr1.brandonyafruitmod.item.BuddhasHandItem;
import io.github.brandonbr1.brandonyafruitmod.item.BananaItem;
import io.github.brandonbr1.brandonyafruitmod.item.AvacadoItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BrandonyafruitmodModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item EGGPLANT = register(new EggplantItem());
	public static final Item BANANA = register(new BananaItem());
	public static final Item WATER_MELLON = register(new WaterMellonItem());
	public static final Item GRAPES = register(new GrapesItem());
	public static final Item ORANGES = register(new OrangesItem());
	public static final Item LETTICE = register(new LetticeItem());
	public static final Item AVACADO = register(new AvacadoItem());
	public static final Item TOMATO = register(new TomatoItem());
	public static final Item KIWI = register(new KiwiItem());
	public static final Item BUDDHAS_HAND = register(new BuddhasHandItem());
	public static final Item ORANGE_LEAVES = register(BrandonyafruitmodModBlocks.ORANGE_LEAVES, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TOMATO_LEAVES = register(BrandonyafruitmodModBlocks.TOMATO_LEAVES, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item GRAPES_LEAVES = register(BrandonyafruitmodModBlocks.GRAPES_LEAVES, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BANANA_LEAVES = register(BrandonyafruitmodModBlocks.BANANA_LEAVES, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
