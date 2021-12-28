
package net.mcreator.morestuff.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class TungstenIngotItem extends Item {
	public TungstenIngotItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("tungsten_ingot");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
