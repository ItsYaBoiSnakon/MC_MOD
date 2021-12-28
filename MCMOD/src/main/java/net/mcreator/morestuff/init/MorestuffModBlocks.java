
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morestuff.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.morestuff.block.TungstenOreBlock;
import net.mcreator.morestuff.block.TitaniumoreBlock;
import net.mcreator.morestuff.block.OrichalcumoreBlock;
import net.mcreator.morestuff.block.NecrodermisOreBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MorestuffModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block TUNGSTEN_ORE = register(new TungstenOreBlock());
	public static final Block ORICHALCUMORE = register(new OrichalcumoreBlock());
	public static final Block TITANIUMORE = register(new TitaniumoreBlock());
	public static final Block NECRODERMIS_ORE = register(new NecrodermisOreBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
