
package net.mcreator.morestuff.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.player.Player;

import net.mcreator.morestuff.procedures.NecrodisToolCraftedProcedure;
import net.mcreator.morestuff.init.MorestuffModItems;

public class NecrodermisShovelItem extends ShovelItem {
	public NecrodermisShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 3048;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MorestuffModItems.NECRODERMIS_SHOVEL), new ItemStack(MorestuffModItems.NECRODERMIS));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("necrodermis_shovel");
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		NecrodisToolCraftedProcedure.execute(itemstack);
	}
}
