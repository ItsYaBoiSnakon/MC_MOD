
package net.mcreator.morestuff.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class NecrodermisItem extends Item {
	public NecrodermisItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
		setRegistryName("necrodermis");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
