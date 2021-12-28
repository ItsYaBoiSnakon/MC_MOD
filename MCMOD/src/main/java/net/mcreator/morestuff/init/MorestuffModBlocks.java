
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morestuff.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.morestuff.block.OrichalcumOreBlock;
import net.mcreator.morestuff.block.OrichalcumBlockBlock;
import net.mcreator.morestuff.block.NecrodermisOreBlock;
import net.mcreator.morestuff.block.NecrodermisBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MorestuffModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block ORICHALCUM_ORE = register(new OrichalcumOreBlock());
	public static final Block ORICHALCUM_BLOCK = register(new OrichalcumBlockBlock());
	public static final Block NECRODERMIS_ORE = register(new NecrodermisOreBlock());
	public static final Block NECRODERMIS_BLOCK = register(new NecrodermisBlockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
