
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

import net.mcreator.morestuff.item.OrichalcumSwordItem;
import net.mcreator.morestuff.item.OrichalcumShovelItem;
import net.mcreator.morestuff.item.OrichalcumPickaxeItem;
import net.mcreator.morestuff.item.OrichalcumIngotItem;
import net.mcreator.morestuff.item.OrichalcumHoeItem;
import net.mcreator.morestuff.item.OrichalcumAxeItem;
import net.mcreator.morestuff.item.OrichalcumArmorItem;
import net.mcreator.morestuff.item.NecrodermisSwordItem;
import net.mcreator.morestuff.item.NecrodermisShovelItem;
import net.mcreator.morestuff.item.NecrodermisPickaxeItem;
import net.mcreator.morestuff.item.NecrodermisItem;
import net.mcreator.morestuff.item.NecrodermisHoeItem;
import net.mcreator.morestuff.item.NecrodermisAxeItem;
import net.mcreator.morestuff.item.NecrodermisArmorItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MorestuffModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
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
	public static final Item ORICHALCUM_PICKAXE = register(new OrichalcumPickaxeItem());
	public static final Item ORICHALCUM_AXE = register(new OrichalcumAxeItem());
	public static final Item ORICHALCUM_SWORD = register(new OrichalcumSwordItem());
	public static final Item ORICHALCUM_SHOVEL = register(new OrichalcumShovelItem());
	public static final Item ORICHALCUM_HOE = register(new OrichalcumHoeItem());
	public static final Item ORICHALCUM_ARMOR_HELMET = register(new OrichalcumArmorItem.Helmet());
	public static final Item ORICHALCUM_ARMOR_CHESTPLATE = register(new OrichalcumArmorItem.Chestplate());
	public static final Item ORICHALCUM_ARMOR_LEGGINGS = register(new OrichalcumArmorItem.Leggings());
	public static final Item ORICHALCUM_ARMOR_BOOTS = register(new OrichalcumArmorItem.Boots());

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
