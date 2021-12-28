
package net.mcreator.morestuff.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.player.Player;

import net.mcreator.morestuff.procedures.NecrodisToolCraftedProcedure;
import net.mcreator.morestuff.init.MorestuffModItems;

public class NecrodermisSwordItem extends SwordItem {
	public NecrodermisSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3048;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MorestuffModItems.NECRODERMIS_SWORD), new ItemStack(MorestuffModItems.NECRODERMIS));
			}
		}, 3, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("necrodermis_sword");
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		NecrodisToolCraftedProcedure.execute(itemstack);
	}
}
