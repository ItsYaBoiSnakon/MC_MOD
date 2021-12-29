
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

import net.mcreator.morestuff.item.WoodenGlaiveItem;
import net.mcreator.morestuff.item.TungstenBarItem;
import net.mcreator.morestuff.item.TitaniumItem;
import net.mcreator.morestuff.item.PencilItem;
import net.mcreator.morestuff.item.OrichalcumItem;
import net.mcreator.morestuff.item.NecrodermisSwordItem;
import net.mcreator.morestuff.item.NecrodermisShovelItem;
import net.mcreator.morestuff.item.NecrodermisPickaxeItem;
import net.mcreator.morestuff.item.NecrodermisItem;
import net.mcreator.morestuff.item.NecrodermisHoeItem;
import net.mcreator.morestuff.item.NecrodermisDaggerItem;
import net.mcreator.morestuff.item.NecrodermisAxeItem;
import net.mcreator.morestuff.item.NecrodermisArmorItem;
import net.mcreator.morestuff.item.BlueprintItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MorestuffModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item TUNGSTEN_ORE = register(MorestuffModBlocks.TUNGSTEN_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TUNGSTEN_BAR = register(new TungstenBarItem());
	public static final Item ORICHALCUMORE = register(MorestuffModBlocks.ORICHALCUMORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TITANIUM = register(new TitaniumItem());
	public static final Item TITANIUMORE = register(MorestuffModBlocks.TITANIUMORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item ORICHALCUM = register(new OrichalcumItem());
	public static final Item NECRODERMIS = register(new NecrodermisItem());
	public static final Item NECRODERMIS_PICKAXE = register(new NecrodermisPickaxeItem());
	public static final Item NECRODERMIS_ARMOR_HELMET = register(new NecrodermisArmorItem.Helmet());
	public static final Item NECRODERMIS_ARMOR_CHESTPLATE = register(new NecrodermisArmorItem.Chestplate());
	public static final Item NECRODERMIS_ARMOR_LEGGINGS = register(new NecrodermisArmorItem.Leggings());
	public static final Item NECRODERMIS_ARMOR_BOOTS = register(new NecrodermisArmorItem.Boots());
	public static final Item NECRODERMIS_SWORD = register(new NecrodermisSwordItem());
	public static final Item NECRODERMIS_SHOVEL = register(new NecrodermisShovelItem());
	public static final Item NECRODERMIS_HOE = register(new NecrodermisHoeItem());
	public static final Item NECRODERMIS_AXE = register(new NecrodermisAxeItem());
	public static final Item NECRODERMIS_ORE = register(MorestuffModBlocks.NECRODERMIS_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item NECRODERMIS_DAGGER = register(new NecrodermisDaggerItem());
	public static final Item PENCIL = register(new PencilItem());
	public static final Item BLUEPRINT = register(new BlueprintItem());
	public static final Item BLUEPRINT_TABLE = register(MorestuffModBlocks.BLUEPRINT_TABLE, CreativeModeTab.TAB_DECORATIONS);
	public static final Item WOODEN_GLAIVE = register(new WoodenGlaiveItem());
	public static final Item HERMES_BOOTS = register(new HermesItem.Boots());

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
