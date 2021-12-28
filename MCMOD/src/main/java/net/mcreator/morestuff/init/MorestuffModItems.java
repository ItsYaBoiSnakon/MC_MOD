
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morestuff.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

<<<<<<< Updated upstream
import net.mcreator.morestuff.item.TungstenIngotItem;
import net.mcreator.morestuff.item.PencilItem;
=======
import net.mcreator.morestuff.item.OrichalcumIngotItem;
import net.mcreator.morestuff.item.NecrodermisSwordItem;
import net.mcreator.morestuff.item.NecrodermisShovelItem;
import net.mcreator.morestuff.item.NecrodermisPickaxeItem;
import net.mcreator.morestuff.item.NecrodermisItem;
import net.mcreator.morestuff.item.NecrodermisHoeItem;
import net.mcreator.morestuff.item.NecrodermisAxeItem;
import net.mcreator.morestuff.item.NecrodermisArmorItem;
>>>>>>> Stashed changes

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MorestuffModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
<<<<<<< Updated upstream
	public static final Item TUNGSTEN_ORE = register(MorestuffModBlocks.TUNGSTEN_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TUNGSTEN_INGOT = register(new TungstenIngotItem());
	public static final Item PENCIL = register(new PencilItem());
=======
	public static final Item ORICHALCUM_INGOT = register(new OrichalcumIngotItem());
	public static final Item ORICHALCUM_ORE = register(MorestuffModBlocks.ORICHALCUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item ORICHALCUM_BLOCK = register(MorestuffModBlocks.ORICHALCUM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item NECRODERMIS = register(new NecrodermisItem());
	public static final Item NECRODERMIS_ORE = register(MorestuffModBlocks.NECRODERMIS_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item NECRODERMIS_BLOCK = register(MorestuffModBlocks.NECRODERMIS_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item NECRODERMIS_PICKAXE = register(new NecrodermisPickaxeItem());
	public static final Item NECRODERMIS_AXE = register(new NecrodermisAxeItem());
	public static final Item NECRODERMIS_SWORD = register(new NecrodermisSwordItem());
	public static final Item NECRODERMIS_SHOVEL = register(new NecrodermisShovelItem());
	public static final Item NECRODERMIS_HOE = register(new NecrodermisHoeItem());
	public static final Item NECRODERMIS_ARMOR_HELMET = register(new NecrodermisArmorItem.Helmet());
	public static final Item NECRODERMIS_ARMOR_CHESTPLATE = register(new NecrodermisArmorItem.Chestplate());
	public static final Item NECRODERMIS_ARMOR_LEGGINGS = register(new NecrodermisArmorItem.Leggings());
	public static final Item NECRODERMIS_ARMOR_BOOTS = register(new NecrodermisArmorItem.Boots());
>>>>>>> Stashed changes

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
