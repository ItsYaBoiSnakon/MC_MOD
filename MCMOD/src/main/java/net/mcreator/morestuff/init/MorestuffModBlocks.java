
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morestuff.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.morestuff.block.TungstenOreBlock;
import net.mcreator.morestuff.block.TungstenBlockBlock;
import net.mcreator.morestuff.block.TitaniumOreBlock;
import net.mcreator.morestuff.block.TitaniumBlockBlock;
import net.mcreator.morestuff.block.CobaltOreBlock;
import net.mcreator.morestuff.block.CobaltBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MorestuffModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block COBALT_ORE = register(new CobaltOreBlock());
	public static final Block COBALT_BLOCK = register(new CobaltBlockBlock());
	public static final Block TUNGSTEN_ORE = register(new TungstenOreBlock());
	public static final Block TUNGSTEN_BLOCK = register(new TungstenBlockBlock());
	public static final Block TITANIUM_ORE = register(new TitaniumOreBlock());
	public static final Block TITANIUM_BLOCK = register(new TitaniumBlockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
