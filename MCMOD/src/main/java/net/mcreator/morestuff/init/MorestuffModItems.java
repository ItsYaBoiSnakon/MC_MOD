
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

import net.mcreator.morestuff.item.TungstenSwordItem;
import net.mcreator.morestuff.item.TungstenShovelItem;
import net.mcreator.morestuff.item.TungstenPickaxeItem;
import net.mcreator.morestuff.item.TungstenIngotItem;
import net.mcreator.morestuff.item.TungstenHoeItem;
import net.mcreator.morestuff.item.TungstenAxeItem;
import net.mcreator.morestuff.item.TungstenArmorItem;
import net.mcreator.morestuff.item.TitaniumSwordItem;
import net.mcreator.morestuff.item.TitaniumShovelItem;
import net.mcreator.morestuff.item.TitaniumPickaxeItem;
import net.mcreator.morestuff.item.TitaniumIngotItem;
import net.mcreator.morestuff.item.TitaniumHoeItem;
import net.mcreator.morestuff.item.TitaniumAxeItem;
import net.mcreator.morestuff.item.TitaniumArmorItem;
import net.mcreator.morestuff.item.PencilItem;
import net.mcreator.morestuff.item.CobaltSwordItem;
import net.mcreator.morestuff.item.CobaltShovelItem;
import net.mcreator.morestuff.item.CobaltPickaxeItem;
import net.mcreator.morestuff.item.CobaltIngotItem;
import net.mcreator.morestuff.item.CobaltHoeItem;
import net.mcreator.morestuff.item.CobaltAxeItem;
import net.mcreator.morestuff.item.CobaltArmorItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MorestuffModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item PENCIL = register(new PencilItem());
	public static final Item COBALT_INGOT = register(new CobaltIngotItem());
	public static final Item COBALT_ORE = register(MorestuffModBlocks.COBALT_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item COBALT_BLOCK = register(MorestuffModBlocks.COBALT_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item COBALT_PICKAXE = register(new CobaltPickaxeItem());
	public static final Item COBALT_AXE = register(new CobaltAxeItem());
	public static final Item COBALT_SWORD = register(new CobaltSwordItem());
	public static final Item COBALT_SHOVEL = register(new CobaltShovelItem());
	public static final Item COBALT_HOE = register(new CobaltHoeItem());
	public static final Item COBALT_ARMOR_HELMET = register(new CobaltArmorItem.Helmet());
	public static final Item COBALT_ARMOR_CHESTPLATE = register(new CobaltArmorItem.Chestplate());
	public static final Item COBALT_ARMOR_LEGGINGS = register(new CobaltArmorItem.Leggings());
	public static final Item COBALT_ARMOR_BOOTS = register(new CobaltArmorItem.Boots());
	public static final Item TUNGSTEN_INGOT = register(new TungstenIngotItem());
	public static final Item TUNGSTEN_ORE = register(MorestuffModBlocks.TUNGSTEN_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TUNGSTEN_BLOCK = register(MorestuffModBlocks.TUNGSTEN_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TUNGSTEN_PICKAXE = register(new TungstenPickaxeItem());
	public static final Item TUNGSTEN_AXE = register(new TungstenAxeItem());
	public static final Item TUNGSTEN_SWORD = register(new TungstenSwordItem());
	public static final Item TUNGSTEN_SHOVEL = register(new TungstenShovelItem());
	public static final Item TUNGSTEN_HOE = register(new TungstenHoeItem());
	public static final Item TUNGSTEN_ARMOR_HELMET = register(new TungstenArmorItem.Helmet());
	public static final Item TUNGSTEN_ARMOR_CHESTPLATE = register(new TungstenArmorItem.Chestplate());
	public static final Item TUNGSTEN_ARMOR_LEGGINGS = register(new TungstenArmorItem.Leggings());
	public static final Item TUNGSTEN_ARMOR_BOOTS = register(new TungstenArmorItem.Boots());
	public static final Item TITANIUM_INGOT = register(new TitaniumIngotItem());
	public static final Item TITANIUM_ORE = register(MorestuffModBlocks.TITANIUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TITANIUM_BLOCK = register(MorestuffModBlocks.TITANIUM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TITANIUM_PICKAXE = register(new TitaniumPickaxeItem());
	public static final Item TITANIUM_AXE = register(new TitaniumAxeItem());
	public static final Item TITANIUM_SWORD = register(new TitaniumSwordItem());
	public static final Item TITANIUM_SHOVEL = register(new TitaniumShovelItem());
	public static final Item TITANIUM_HOE = register(new TitaniumHoeItem());
	public static final Item TITANIUM_ARMOR_HELMET = register(new TitaniumArmorItem.Helmet());
	public static final Item TITANIUM_ARMOR_CHESTPLATE = register(new TitaniumArmorItem.Chestplate());
	public static final Item TITANIUM_ARMOR_LEGGINGS = register(new TitaniumArmorItem.Leggings());
	public static final Item TITANIUM_ARMOR_BOOTS = register(new TitaniumArmorItem.Boots());

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
